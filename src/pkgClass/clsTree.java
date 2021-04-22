
package pkgClass;

/**
 *
 * @author Payan Duque
 */
public class clsTree {
    private clsNode root;

    public clsTree(clsNode root) {
        this.root = null;
    }
    
   public void insertar(clsNode dato, clsNode rootTmp){
        if(this.getRoot() == null){
            this.setRoot(dato);
        }else{
            if(dato.getDato() > rootTmp.getDato()){
                if(rootTmp.getDer() == null){
                    rootTmp.setDer(dato);
                }else{
                    insertar(dato, rootTmp.getDer());
                }  
            }else{
                if(dato.getDato()<= rootTmp.getDato()){
                    if(rootTmp.getIzq()== null){
                        rootTmp.setIzq(dato);
                    }else{
                        insertar(dato, rootTmp.getIzq());
                    }
                }
            }
        }
    } 
   
   public void listarInOrden(clsNode rootTmp){
        if(rootTmp != null){
            if(rootTmp.getDer() != null){
                listarInOrden(rootTmp.getDer());
            }System.out.println("In orden " + "Number:" + rootTmp.getDato());
            if(rootTmp.getIzq()!= null){
                listarInOrden(rootTmp.getIzq());
            }
        }
    }
   
   public void listarPreOrden(clsNode rootTmp){
       if(root != null){
           System.out.println("Pre orden " + "Number:" + rootTmp.getDato());
           if(rootTmp.getDer() != null){
               listarPreOrden(rootTmp.getDer());
           }if(rootTmp.getIzq() != null){
               listarPreOrden(rootTmp.getIzq());
           }
       }
   }
   
   public void listarPostOrden(clsNode rootTmp){
       if(root != null){
           if(rootTmp.getDer() != null){
               listarPostOrden(rootTmp.getDer());
           }if(rootTmp.getIzq() != null){
               listarPostOrden(rootTmp.getIzq());
           }System.out.println("Post orden " + "Number:" + rootTmp.getDato());
       }
   }
   

    public clsNode getRoot() {
        return root;
    }

    public void setRoot(clsNode root) {
        this.root = root;
    }
}

