package Exception;

public class DivideByZero extends MathExceptions{

    /**
     * Исключаем деления на ноль
     * @param msg - текстовое сообщение для пользователя
     */
    public DivisionByZero(String msg) {
        super(msg);
    }
}
