// default package

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yh9 extends b6c {
    public static final /* synthetic */ int b = 0;

    static {
        b6c.h(new yh9());
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if ((r2 instanceof org.telegram.tgnet.tl.TL_iv.pageBlockSlideshow) == false) goto L10;
     */
    @Override // b6c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        zh9 zh9Var = (zh9) view;
        ll0 ll0Var = (ll0) c6cVar.H;
        vg9 vg9Var = (vg9) c6cVar.I;
        ArrayList arrayList = zh9Var.E;
        zh9Var.a = ll0Var;
        zh9Var.O = vg9Var;
        zh9Var.c(ll0Var);
        if (ll0Var != null) {
            ll0 ll0Var2 = zh9Var.a;
            if (ll0Var2 != null) {
                TL_iv.PageBlock pageBlock = ll0Var2.b;
                if (!(pageBlock instanceof TL_iv.pageBlockCollage)) {
                }
            }
            if (ll0Var.g == null) {
                ll0Var.g = new i07();
            }
        }
        zh9Var.p();
        zh9Var.w.b();
        if (zh9Var.a0 >= arrayList.size()) {
            zh9Var.a0 = Math.max(0, arrayList.size() - 1);
        }
        zh9Var.b0 = 0.0f;
        zh9Var.V.e(true, zh9Var.n() ? 1.0f : 0.0f);
        zh9Var.q(false);
        zh9Var.requestLayout();
        zh9Var.invalidate();
    }

    @Override // b6c
    public final boolean c(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }

    @Override // b6c
    public final View d(Context context, r59 r59Var, int i, ylb ylbVar) {
        zh9 zh9Var = new zh9(context, ylbVar);
        zh9Var.setBackground(new gf9(cmb.v0(cmb.c6, ylbVar)));
        return zh9Var;
    }

    @Override // b6c
    public final boolean e(c6c c6cVar, c6c c6cVar2) {
        return c6cVar.d == c6cVar2.d;
    }

    @Override // b6c
    public final boolean f() {
        return false;
    }
}
