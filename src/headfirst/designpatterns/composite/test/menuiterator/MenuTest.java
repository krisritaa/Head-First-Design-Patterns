package headfirst.designpatterns.composite.test.menuiterator;


public class MenuTest {
    public static void main(String[] args) {
        {
            MyMenuComponent allMenus = new Menu("ALL MENUS", "All menus combined");
            MyMenuComponent pancakeHouseMenu =
                    new Menu("PANCAKE HOUSE MENU", "Breakfast");


            allMenus.add(pancakeHouseMenu);

            pancakeHouseMenu.add(new MenuItem(
                    "K&B's Pancake Breakfast",
                    "Pancakes with scrambled eggs, and toast",
                    true,
                    2.99));


            Waitress waitress = new Waitress(allMenus);

            waitress.printVegetableMenu();

        }
    }
}
