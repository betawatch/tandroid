// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
                    mu1Var.Vc(true);
                    mu1Var.J(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    mu1Var.A1 = 0;
                    mu1Var.Vc(true);
                    mu1Var.getMessagesController().u3(mu1Var.l6, mu1Var.d());
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
                        mu1Var2.getMessagesController().t3(mu1Var2.l6, mu1Var2.d());
                    }
                    mu1Var2.Uc(true);
                    mu1Var2.J(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    mu1Var2.B1 = 0;
                    mu1Var2.Uc(true);
                    mu1Var2.getMessagesController().t3(mu1Var2.l6, mu1Var2.d());
                    break;
                }
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                mu1 mu1Var3 = this.b;
                mu1Var3.x7 = booleanValue;
                if (!booleanValue) {
                    mu1Var3.E6();
                    break;
                }
                break;
        }
    }
}
