package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements r0.n, org.telegram.ui.Components.fl0 {
    public final /* synthetic */ ht a;

    public /* synthetic */ vs(ht htVar) {
        this.a = htVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean l() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public void m(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var == null) {
            return;
        }
        ht htVar = this.a;
        ah.t0 reactionsWindow = htVar.P.getReactionsWindow();
        if (!htVar.o.contains(i1Var.f)) {
            htVar.o.add(i1Var.f);
            if (htVar.o.size() > 7) {
                htVar.o.remove(0);
            }
        } else if (htVar.o.size() <= 1) {
            return;
        } else {
            htVar.o.remove(i1Var.f);
        }
        htVar.P.setSelectedEmojis(htVar.o);
        if (reactionsWindow != null) {
            ah.n0 n0Var = reactionsWindow.m;
            htVar.P.p(null, null, false);
            if (n0Var != null) {
                n0Var.setSelectedReactions(htVar.o);
                n0Var.setRecentReactions(htVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void u() {
    }

    @Override // org.telegram.ui.Components.fl0
    public /* synthetic */ void s(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
