// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class so3 extends x1 {
    public final /* synthetic */ byte a;
    public final gk0 b;

    public so3(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new jjb();
                break;
            default:
                this.b = new ro3();
                break;
        }
    }

    @Override // x1
    public final void a(CharSequence charSequence) {
        byte b = this.a;
    }

    @Override // x1
    public final boolean b(gk0 gk0Var) {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.b(gk0Var);
        }
    }

    @Override // x1
    public final gk0 e() {
        byte b = this.a;
        gk0 gk0Var = this.b;
        switch (b) {
            case 0:
                return (ro3) gk0Var;
            default:
                return (jjb) gk0Var;
        }
    }

    @Override // x1
    public final boolean f() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.f();
        }
    }

    @Override // x1
    public final vj2 h(vo3 vo3Var) {
        switch (this.a) {
            case 0:
                return vj2.a(vo3Var.b);
            default:
                return null;
        }
    }

    private final void i(CharSequence charSequence) {
    }
}
