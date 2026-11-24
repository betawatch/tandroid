// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class zb extends b6c {
    static {
        b6c.h(new zb());
    }

    public static c6c i(int i, String str, String str2) {
        c6c K = c6c.K(zb.class);
        K.k = i;
        K.m = str;
        K.n = str2;
        return K;
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        ((ac) view).a(c6cVar.k, c6cVar.m, c6cVar.n);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        return new ac(ylbVar, context, false);
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
