package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements r0.n, org.telegram.ui.Components.fl0 {
    public final /* synthetic */ ht a;

    public /* synthetic */ vs(ht htVar) {
        this.a = htVar;
    }

    @Override // r0.n
    public r0.k1 P0(View view, r0.k1 k1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean i() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean o() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public void p(View view, bh.x0 x0Var, boolean z10, boolean z11) {
        if (x0Var == null) {
            return;
        }
        ht htVar = this.a;
        bh.i0 reactionsWindow = htVar.P.getReactionsWindow();
        if (!htVar.o.contains(x0Var.f)) {
            htVar.o.add(x0Var.f);
            if (htVar.o.size() > 7) {
                htVar.o.remove(0);
            }
        } else if (htVar.o.size() <= 1) {
            return;
        } else {
            htVar.o.remove(x0Var.f);
        }
        htVar.P.setSelectedEmojis(htVar.o);
        if (reactionsWindow != null) {
            bh.d0 d0Var = reactionsWindow.m;
            htVar.P.p(null, null, false);
            if (d0Var != null) {
                d0Var.setSelectedReactions(htVar.o);
                d0Var.setRecentReactions(htVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void m() {
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void l(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
