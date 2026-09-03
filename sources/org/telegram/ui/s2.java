package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class s2 extends m2.a {
    public final /* synthetic */ u2 c;

    public s2(u2 u2Var) {
        this.c = u2Var;
    }

    @Override // m2.a
    public final void a(m2.h hVar, Object obj) {
        hVar.removeView(((r2) obj).b);
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
    public final Object e(m2.h hVar, int i10) {
        b3 b3Var;
        u2 u2Var = this.c;
        l4 l4Var = u2Var.w;
        n4 n4Var = u2Var.x;
        TL_iv.PageBlock pageBlock = u2Var.d.items.get(i10);
        if (pageBlock instanceof TL_iv.pageBlockPhoto) {
            g2 g2Var = new g2(u2Var.getContext(), n4Var, l4Var, 1);
            g2Var.a((TL_iv.pageBlockPhoto) pageBlock, l4Var.B.cached_page, false, true);
            b3Var = g2Var;
        } else {
            b3 b3Var2 = new b3(u2Var.getContext(), n4Var, l4Var, 1);
            TL_iv.pageBlockVideo pageblockvideo = (TL_iv.pageBlockVideo) pageBlock;
            b3Var2.b(pageblockvideo, (c3) n4Var.y.f(pageblockvideo.video_id), false, true);
            b3Var = b3Var2;
        }
        hVar.addView(b3Var);
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
