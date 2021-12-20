public class Main {
// изменения!!!
    public static void main(String[] args) {
        System.out.println("ТЕСТ ПО ХИМИИ\n");
        Test InfoUser = new Test();
        InfoUser.infoUser();
        System.out.println("\nПриготовьтесь! Начинаем тестирование.\n");
        Test Questions = new Test();
        Questions.launchTest();

    }

}