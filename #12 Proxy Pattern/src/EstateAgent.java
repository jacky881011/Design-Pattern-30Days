
// Proxy doAction()

public class EstateAgent implements IBuyHouse{
        private IBuyHouse iBuyHouse;

        public EstateAgent(IBuyHouse iBuyHouse){
            this.iBuyHouse = iBuyHouse;
        }

        @Override
        public void findHouse(){
            iBuyHouse.findHouse();
            System.out.println("#房仲包忙找房子");
        }

        @Override
        public void priceTooHigh(){
            iBuyHouse.priceTooHigh();
            System.out.println("#房仲幫忙喬價錢");
        }

        @Override
        public void defendPrice(){
            iBuyHouse.defendPrice();
            System.out.println("#房仲強力喬價錢");
        }

        @Override
        public void finish(){
            iBuyHouse.finish();
            System.out.println("#成交的話房仲幫忙付訂、簽約、用印、完稅、交屋");
        }

}
