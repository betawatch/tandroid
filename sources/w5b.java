// default package

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class w5b extends b6c {
    public static final /* synthetic */ int c = 0;
    public jd4 b;

    static {
        b6c.h(new w5b());
    }

    @Override // b6c
    public final void a(r59 r59Var, View view, c6c c6cVar) {
        ((sha) view).l(c6cVar != null && c6cVar.h, false);
    }

    @Override // b6c
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        sha shaVar = (sha) view;
        shaVar.k((k47) c6cVar.H, c6cVar.w, false);
        shaVar.i(c6cVar.e, false);
        shaVar.l(c6cVar.h, false);
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        if (this.b == null) {
            this.b = new jd4(context, ylbVar);
        }
        sha shaVar = new sha(context, this.b, i);
        shaVar.x0 = true;
        shaVar.e0 = true;
        return shaVar;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.r == c6cVar2.r && c6cVar.e == c6cVar2.e && c6cVar.C == c6cVar2.C;
    }
}
