// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class xt0 extends ogc {
    public final zt0[] a = new zt0[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ v59 c;
    public final /* synthetic */ au0 d;

    public xt0(au0 au0Var, Context context, v59 v59Var) {
        this.d = au0Var;
        this.b = context;
        this.c = v59Var;
    }

    @Override // ogc
    public final void b(View view, int i, int i2) {
        this.c.L(view);
    }

    @Override // ogc
    public final View d(int i) {
        zt0[] zt0VarArr = this.a;
        if (zt0VarArr[i] == null) {
            zt0VarArr[i] = new zt0(this.d, this.b, i);
        }
        return zt0VarArr[i];
    }

    @Override // ogc
    public final int e() {
        return this.a.length;
    }

    @Override // ogc
    public final CharSequence g(int i) {
        return jb6.M0(i == 1 ? 2131744608 : i == 2 ? 2131744607 : 2131744609, null);
    }

    @Override // ogc
    public final int h(int i) {
        return i;
    }
}
