public enum Matiere{
    InitiationAuDev,
    POO,
    BaseDeDonnee,
    QualiteDev,
    SystemeLangageBasNiveau,
    MathDiscrete,
    MathAlgebre,
    MethodeNum,
    Anglais,
    PPP,
    Droit,
    Economie;

    public String toString() {
		if (this == InitiationAuDev)
			return "Initiation au développement";
		else if (this == POO)
			return "POO";
        else if (this == BaseDeDonnee)
			return "Base de donnée";
        else if (this == QualiteDev)
			return "Qulité développement";
        else if (this == SystemeLangageBasNiveau)
			return "Système et langage bas niveau";
        else if (this == MathDiscrete)
			return "Mathématique discrète";
        else if (this == MathAlgebre)
			return "Mathématique Algèbre";
        else if (this == MethodeNum)
			return "Méthode du numérique";
        else if (this == Anglais)
			return "Anglais";
        else if (this == PPP)
			return "POO";
        else if (this == PPP)
			return "PPP";
        return "Droit";
	}
}