package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class s2 extends m2.a {
    public final /* synthetic */ u2 c;

    public s2(u2 u2Var) {
        this.c = u2Var;
    }

    @Override // m2.a
    public final void a(m2.g gVar, Object obj) {
        gVar.removeView(((r2) obj).b);
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
        return this.c.d.items.contains(((r2) obj).a) ? -1 : -2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // m2.a
    public final Object e(m2.g gVar, int i10) {
        b3 b3Var;
        u2 u2Var = this.c;
        k4 k4Var = u2Var.w;
        m4 m4Var = u2Var.x;
        TL_iv.PageBlock pageBlock = u2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            g2 g2Var = new g2(u2Var.getContext(), m4Var, k4Var, 1);
            g2Var.a((TL_iv.pageBlockPhoto) pageBlock, k4Var.A.cached_page, false, true);
            b3Var = g2Var;
        } else {
            b3 b3Var2 = new b3(u2Var.getContext(), m4Var, k4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var2.b(pageblockvideo, (c3) m4Var.y.f(pageblockvideo.video_id), false, true);
            b3Var = b3Var2;
        }
        gVar.addView(b3Var);
        r2 r2Var = new r2();
        r2Var.b = b3Var;
        r2Var.a = pageBlock;
        return r2Var;
    }

    @Override // m2.a
    public final boolean f(View view, Object obj) {
        return ((r2) obj).b == view;
    }
}
