// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class sp0 extends dqd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sp0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // dqd
    public final void a(int i, CharSequence charSequence) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fc4.b("BotBiometry onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                up0 up0Var = (up0) obj;
                lf2 lf2Var = up0Var.j;
                if (lf2Var != null) {
                    up0Var.j = null;
                    lf2Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                fc4.b("PasscodeView onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                ((by7) obj).o(true);
                break;
        }
    }

    @Override // dqd
    public final void b() {
        switch (this.a) {
            case 0:
                fc4.b("BotBiometry onAuthenticationFailed");
                break;
            default:
                fc4.b("PasscodeView onAuthenticationFailed");
                ((by7) this.b).o(true);
                break;
        }
    }

    @Override // dqd
    public final void c(fk0 fk0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                fc4.b("BotBiometry onAuthenticationSucceeded");
                up0 up0Var = (up0) obj;
                lf2 lf2Var = up0Var.j;
                if (lf2Var != null) {
                    up0Var.j = null;
                    lf2Var.a(Boolean.TRUE, fk0Var);
                    break;
                }
                break;
            default:
                fc4.b("PasscodeView onAuthenticationSucceeded");
                ((by7) obj).n(true);
                break;
        }
    }
}
