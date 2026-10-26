package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements r0.n, org.telegram.ui.Components.el0 {
    public final /* synthetic */ ft a;

    public /* synthetic */ ts(ft ftVar) {
        this.a = ftVar;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.el0
    public void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        if (x0Var == null) {
            return;
        }
        ft ftVar = this.a;
        bh.i0 reactionsWindow = ftVar.P.getReactionsWindow();
        if (!ftVar.o.contains(x0Var.f)) {
            ftVar.o.add(x0Var.f);
            if (ftVar.o.size() > 7) {
                ftVar.o.remove(0);
            }
        } else if (ftVar.o.size() <= 1) {
            return;
        } else {
            ftVar.o.remove(x0Var.f);
        }
        ftVar.P.setSelectedEmojis(ftVar.o);
        if (reactionsWindow != null) {
            bh.d0 d0Var = reactionsWindow.m;
            ftVar.P.p(null, null, false);
            if (d0Var != null) {
                d0Var.setSelectedReactions(ftVar.o);
                d0Var.setRecentReactions(ftVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.el0
    public /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
