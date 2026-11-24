// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class pm1 implements i8c {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mu1 b;
    public final /* synthetic */ String c;

    public /* synthetic */ pm1(mu1 mu1Var, String str, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = str;
    }

    @Override // i8c
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        String str = this.c;
        mu1 mu1Var = this.b;
        Boolean bool = (Boolean) obj;
        Boolean bool2 = (Boolean) obj2;
        mu1Var.getClass();
        switch (b) {
            case 0:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        mu1Var.getMessagesController().m(str, false);
                    }
                    mu1Var.getParentActivity();
                    d01.o(str);
                    break;
                }
                break;
            default:
                if (bool.booleanValue()) {
                    if (bool2.booleanValue()) {
                        mu1Var.getMessagesController().m(str, true);
                    }
                    d01.n(mu1Var.getParentActivity(), str, false, null);
                    break;
                }
                break;
        }
    }
}
