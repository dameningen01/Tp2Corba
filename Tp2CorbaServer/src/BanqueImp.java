import org.omg.CORBA.FloatHolder;

public class BanqueImp extends BanquePOA{
	private float solde = 0;
	
	public BanqueImp(float solde) {
		super();
		this.solde = solde;
	}

	@Override
	public float crediter(float montant, FloatHolder solde) {
		// TODO Auto-generated method stub
		this.solde-=montant;
		solde.value = this.solde;
		System.out.println("Compte s'est credite! votre nouveau solde est "+this.solde + "\n");
		return solde.value;
	}

	@Override
	public float debiter(float montant, FloatHolder solde) {
		// TODO Auto-generated method stub
		this.solde +=montant;
		solde.value = this.solde;
		System.out.println("Compte s'est debite! votre nouveau solde est "+this.solde+ "\n");
		return solde.value;
	}

	@Override
	public float afficherMontant(FloatHolder solde) {
		// TODO Auto-generated method stub
		solde.value = this.solde;
		System.out.println("Votre solde est : "+this.solde+ "\n");
		return solde.value;
	}

}
