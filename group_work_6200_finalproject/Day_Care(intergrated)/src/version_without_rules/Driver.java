package version_without_rules;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Daycare_rule.demo();
		getImmuRec rec = new getImmuRec();
		
		rec.updateImmuRec("Hib" + "," + "4");
		rec.updateImmuRec("DTap" + "," + "5");
		rec.updateImmuRec("Polio" + "," + "4");
		rec.updateImmuRec("Hepatitis B" + "," + "3");
		rec.updateImmuRec("MMR" + "," + "2");
		rec.updateImmuRec("Varicella" + "," +"2");
		rec.updateImmuRec("Tdap" + "," + "0");
		rec.updateImmuRec("Meningococcal" + "," + "0");
		
		ImmunizationRec ir = new ImmunizationRec(5);
		ir.NeedVaccin(5, rec.getImmurec());
		System.out.println(ir.NeedVaccin(5, rec.getImmurec()));
	}

}
