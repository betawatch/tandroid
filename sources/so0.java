// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class so0 extends rsd {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ so0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // rsd
    public final void a(int i, CharSequence charSequence) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cc4.b("BotBiometry onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                uo0 uo0Var = (uo0) obj;
                qe2 qe2Var = uo0Var.j;
                if (qe2Var != null) {
                    uo0Var.j = null;
                    qe2Var.a(Boolean.FALSE, null);
                    break;
                }
                break;
            default:
                cc4.b("PasscodeView onAuthenticationError " + i + " \"" + ((Object) charSequence) + "\"");
                ((fz7) obj).o(true);
                break;
        }
    }

    @Override // rsd
    public final void b() {
        switch (this.a) {
            case 0:
                cc4.b("BotBiometry onAuthenticationFailed");
                break;
            default:
                cc4.b("PasscodeView onAuthenticationFailed");
                ((fz7) this.b).o(true);
                break;
        }
    }

    @Override // rsd
    public final void c(gj0 gj0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cc4.b("BotBiometry onAuthenticationSucceeded");
                uo0 uo0Var = (uo0) obj;
                qe2 qe2Var = uo0Var.j;
                if (qe2Var != null) {
                    uo0Var.j = null;
                    qe2Var.a(Boolean.TRUE, gj0Var);
                    break;
                }
                break;
            default:
                cc4.b("PasscodeView onAuthenticationSucceeded");
                ((fz7) obj).n(true);
                break;
        }
    }
}
