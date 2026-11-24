// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class ow3 extends ogc {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ px3 c;

    public ow3(px3 px3Var, boolean z, Context context) {
        this.c = px3Var;
        this.a = z;
        this.b = context;
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
        zw3 zw3Var = (zw3) view;
        if (this.a) {
            i = 1;
        }
        zw3Var.a(i);
    }

    @Override // ogc
    public final View d(int i) {
        Context context = this.b;
        px3 px3Var = this.c;
        return i == 1 ? new yw3(px3Var, context) : new ex3(px3Var, context);
    }

    @Override // ogc
    public final int e() {
        return this.a ? 1 : 3;
    }

    @Override // ogc
    public final int h(int i) {
        return (i == 0 || i == 1) ? 0 : 1;
    }
}
