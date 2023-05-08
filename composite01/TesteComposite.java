

public class TesteComposite {
    
    public MenuComponent montar(){
        MenuComponent menu1 = new MenuBarRestaurante();
        MenuComponent menu2 = new BarTorrao();
        MenuComponent menu3 = new RestauranteLuzia();
        MenuComponent menu4 = new MenuSobremesa();
        
        MenuComponent item1 = new Cachaca();
        MenuComponent item2 = new PiraoDeQueijo();
        MenuComponent item3 = new Galinha();
        MenuComponent item4 = new Linguica();
        MenuComponent item5 = new Feijoada();
        MenuComponent item6 = new Pudim();
        MenuComponent item7 = new BalaDeVidro();
        
        menu1.add(menu2);
        menu1.add(menu3);
        menu1.add(menu4);
        menu2.add(item1);
        menu2.add(item2);
        menu2.add(item5);
        menu3.add(item3);
        menu3.add(item4);
        menu4.add(item6);
        menu4.add(item7);
        
        return menu1;
        
        
    }
}
