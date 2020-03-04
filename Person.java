public class Person {
    private final boolean man; //пол
    private final String name; //имя
    private Person spouse; //супруг-супруга

    public Person(boolean man, String name) {
        this.man = man;
        this.name = name;
    }

    /**
     * This method checks gender of persons. If genders are not equal - tries to marry.
     * If one of them has another spouse - execute divorce(sets spouse = null for husband and wife. Example: if both persons have spouses - then divorce will set 4 spouse to null) and then executes marry().
     * param person - new husband/wife for this person.
     * return - returns true if this person has another gender than passed person and they are not husband and wife, false otherwise
     */

    public boolean marry(Person person) {
        if (this.man != person.man) {//проверяем чтобы пол был разный
            if (this.spouse != null) {//если первый имеет супруга/у - запускаем развод
                this.divorce();
            }
            if (person.spouse != null) {//если второй имеет супруга/у - запускаем развод
                person.divorce();
            }
            this.spouse = person; //женим первого
            person.spouse = this; //женим второго
            System.out.println(this.name + " и " + person.name + " вступили в брак");
            return true;
        } else {
            System.out.println(this.name + " и " + person.name + " одного пола");
            return false;
        }
    }

    /**
     * Sets spouse = null if spouse is not null
     * return true - if person status has been changed
     */

    public boolean divorce() {
        if (this.spouse != null) {
            System.out.println(this.name + " и " + this.spouse.name + " развелись");
            this.spouse.spouse = null; //обнуляем значение супругов
            this.spouse = null; //
            return true;
        } else {
            System.out.println(this.name + " не может развестись, т.к. не имеет супруги/а");
        }
        return false;
    }

}
