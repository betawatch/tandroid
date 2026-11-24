// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class vza extends gza {
    public sp1 E;
    public final int w;
    public final int x;
    public int y;

    public vza(Context context, int i, int i2, mg0 mg0Var, int i3) {
        super(context, i2, mg0Var, null);
        this.w = i;
        this.x = i3;
    }

    @Override // gza
    public final void b(jza jzaVar) {
        int i;
        if (jzaVar == null || (i = this.y) < 0) {
            return;
        }
        jzaVar.a(this.w, this.x, i, this.E);
    }
}
