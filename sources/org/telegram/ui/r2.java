package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r2 extends m2.a {
    public final /* synthetic */ t2 c;

    public r2(t2 t2Var) {
        this.c = t2Var;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView(((q2) obj).b);
    }

    @Override // m2.a
    public final int b() {
        TL_iv.pageBlockSlideshow pageblockslideshow = this.c.d;
        if (pageblockslideshow == null) {
            return 0;
        }
        return pageblockslideshow.items.size();
    }

    @Override // m2.a
    public final int c(Object obj) {
        return this.c.d.items.contains(((q2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m2.a
    public final Object e(m2.g gVar, int i9) {
        a3 a3Var;
        t2 t2Var = this.c;
        j4 j4Var = t2Var.w;
        l4 l4Var = t2Var.x;
        TL_iv.PageBlock pageBlock = t2Var.d.items.get(i9);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            f2 f2Var = new f2(t2Var.getContext(), l4Var, j4Var, 1);
            f2Var.a((TL_iv.pageBlockPhoto) pageBlock, j4Var.A.cached_page, false, true);
            a3Var = f2Var;
        } else {
            a3 a3Var2 = new a3(t2Var.getContext(), l4Var, j4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            a3Var2.b(pageblockvideo, (b3) l4Var.y.f(pageblockvideo.video_id), false, true);
            a3Var = a3Var2;
        }
        gVar.addView(a3Var);
        q2 q2Var = new q2();
        q2Var.b = a3Var;
        q2Var.a = pageBlock;
        return q2Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return ((q2) obj).b == view;
    }
}
