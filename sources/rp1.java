// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class rp1 implements ej8 {
    public boolean a = true;
    public final /* synthetic */ i49 b;

    public rp1(i49 i49Var) {
        this.b = i49Var;
    }

    @Override // ej8
    public final void a(float f, float f2) {
        i49 i49Var = this.b;
        if (f == 0.0f && !this.a) {
            i49Var.p(false);
            this.a = true;
        } else if (f == 1.0f && this.a) {
            i49Var.setAlpha(1.0f - f2);
            if (f2 == 1.0f) {
                this.a = false;
            }
        }
    }
}
