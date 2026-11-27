// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qg3 implements ef7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uj3 b;

    public /* synthetic */ qg3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override // ef7
    public final void a(int i) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.W1 = i != 0;
                uc7.f1().edit().putBoolean("askAboutContacts", uj3Var.W1).apply();
                uj3Var.C2(false);
                break;
            default:
                uj3Var.W1 = i != 0;
                uc7.f1().edit().putBoolean("askAboutContacts", uj3Var.W1).commit();
                uj3Var.C2(false);
                break;
        }
    }
}
