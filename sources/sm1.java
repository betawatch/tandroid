// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sm1 implements vs2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;

    public /* synthetic */ sm1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override // vs2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                mu1 mu1Var = this.b;
                if (intValue != 0) {
                    mu1Var.Xc(true);
                    mu1Var.J(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    mu1Var.A1 = 0;
                    mu1Var.Xc(true);
                    mu1Var.getMessagesController().v3(mu1Var.l6, mu1Var.d());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                int intValue2 = num2.intValue();
                mu1 mu1Var2 = this.b;
                if (intValue2 != 0) {
                    int i = mu1Var2.B1 - 1;
                    mu1Var2.B1 = i;
                    if (i <= 0) {
                        mu1Var2.getMessagesController().u3(mu1Var2.l6, mu1Var2.d());
                    }
                    mu1Var2.Wc(true);
                    mu1Var2.J(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    mu1Var2.B1 = 0;
                    mu1Var2.Wc(true);
                    mu1Var2.getMessagesController().u3(mu1Var2.l6, mu1Var2.d());
                    break;
                }
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mu1 mu1Var3 = this.b;
                mu1Var3.x7 = booleanValue;
                if (!booleanValue) {
                    mu1Var3.G6();
                    break;
                }
                break;
        }
    }
}
