public class Main {
    public static void main(String[] args) {
        Record starting = new Record("~~~~ СКАЗКА ПРО ВОЛШЕБНЫЙ ОГОРОД ~~~~");
        System.out.println(starting.chapter());
        
        try {

            Turnip turnip = new Turnip("Репка", (byte) 25, (byte) 5);
            Carrot carrot = new Carrot("Морковка", (byte) 15, (byte) 2);
            Basket basket = new Basket();
            Rope rope = new Rope();
            
            System.out.println("Проверяем урожай:");
            turnip.harvest();
            carrot.harvest();
            
            System.out.println("\nПроверяем систему полива:");
            WaterPipe pipe = new WaterPipe(Material.CANE);
            Fountain fountain = new Fountain(pipe);
            fountain.waters(turnip, Material.CANE);
            
            System.out.println("\nПытаемся выкопать репку:");
            rope.actionWithRope(turnip);
            
            Neznaika neznaika = new Neznaika("Незнайка", basket, rope, carrot);
            Malishka malishka = new Malishka("Малышка", basket, rope, carrot);
            
            malishka.talk(neznaika);
            neznaika.help(malishka, carrot);
            
            System.out.println("\n\nНаполняем корзину для сбора урожая:");
            basket.fillBasket(Material.BAMBOO);
            basket.showContents();
            
            System.out.println();
            neznaika.isHappy(basket);
            malishka.isHappy(basket);

            System.out.println("\nГерои отправляются домой:");
            neznaika.go(basket);
            malishka.go(basket);
            
        } catch (HarvestException e) {
            System.out.println("\n" + e.getMessage());
            System.out.println("Урожай ещё не готов. Придётся вернуться завтра.");
        } catch (RopeBreakException e) {
            System.out.println("\n" + e.getMessage());
            System.out.println("Без верёвки не выкопать крупные овощи.");
        } catch (StoryEndException e) {
            System.out.println("\n" + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("\n" + e.getMessage());
            if (e.getMessage().contains("затопила")) {
                System.out.println("Город в опасности! Сбор урожая отменяется.");
            }
        } catch (Exception e) {
            System.out.println("\nКритическая ошибка: " + e.getMessage());
        } finally {
            Record ending = new Record("~~~~ КОНЕЦ СКАЗКИ ~~~~");
            System.out.println(ending.chapter());
        }
    }
}