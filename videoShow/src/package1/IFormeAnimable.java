package package1;

/**
 * Un objet IFormeAnimable est capable d'animer (de d?placer) une forme.
 * 
 */
public interface IFormeAnimable  {
    
    /**
     * fait faire un d?placement ?l?mentaire ? une forme.
     *
     * @param f la forme ? d?placer
     */
    public void deplacer(Forme f);
    
}
