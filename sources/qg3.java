// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class qg3 implements uc7 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cj3 b;

    public /* synthetic */ qg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override // uc7
    public final void a(int i) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.W1 = i != 0;
                na7.d1().edit().putBoolean("askAboutContacts", cj3Var.W1).commit();
                cj3Var.A2(false);
                break;
            default:
                cj3Var.W1 = i != 0;
                na7.d1().edit().putBoolean("askAboutContacts", cj3Var.W1).apply();
                cj3Var.A2(false);
                break;
        }
    }
}
