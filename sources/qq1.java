// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class qq1 implements sh8 {
    public boolean a = true;
    public final /* synthetic */ v29 b;

    public qq1(v29 v29Var) {
        this.b = v29Var;
    }

    @Override // sh8
    public final void a(float f, float f2) {
        v29 v29Var = this.b;
        if (f == 0.0f && !this.a) {
            v29Var.p(false);
            this.a = true;
        } else if (f == 1.0f && this.a) {
            v29Var.setAlpha(1.0f - f2);
            if (f2 == 1.0f) {
                this.a = false;
            }
        }
    }
}
