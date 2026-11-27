// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class tm1 implements pt2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu1 b;

    public /* synthetic */ tm1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override // pt2
    public final void accept(Object obj) {
        switch (this.a) {
            case 0:
                Integer num = (Integer) obj;
                int intValue = num.intValue();
                zu1 zu1Var = this.b;
                if (intValue != 0) {
                    zu1Var.jd(true);
                    zu1Var.J(num.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    zu1Var.A1 = 0;
                    zu1Var.jd(true);
                    zu1Var.getMessagesController().B3(zu1Var.l6, zu1Var.c());
                    break;
                }
            case 1:
                Integer num2 = (Integer) obj;
                int intValue2 = num2.intValue();
                zu1 zu1Var2 = this.b;
                if (intValue2 != 0) {
                    int i = zu1Var2.B1 - 1;
                    zu1Var2.B1 = i;
                    if (i <= 0) {
                        zu1Var2.getMessagesController().A3(zu1Var2.l6, zu1Var2.c());
                    }
                    zu1Var2.id(true);
                    zu1Var2.J(num2.intValue(), 0, 0, 0, false, true);
                    break;
                } else {
                    zu1Var2.B1 = 0;
                    zu1Var2.id(true);
                    zu1Var2.getMessagesController().A3(zu1Var2.l6, zu1Var2.c());
                    break;
                }
            default:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                zu1 zu1Var3 = this.b;
                zu1Var3.x7 = booleanValue;
                if (!booleanValue) {
                    zu1Var3.N6();
                    break;
                }
                break;
        }
    }
}
