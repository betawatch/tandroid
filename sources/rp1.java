// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
