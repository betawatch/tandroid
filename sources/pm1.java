// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
