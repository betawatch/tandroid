package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wr implements r0.m, org.telegram.ui.Components.ki0 {
    public final /* synthetic */ is a;

    public /* synthetic */ wr(is isVar) {
        this.a = isVar;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        this.a.q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean r() {
        return true;
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ boolean v() {
        return false;
    }

    @Override // org.telegram.ui.Components.ki0
    public void z(View view, dh.n0 n0Var, boolean z10, boolean z11) {
        if (n0Var == null) {
            return;
        }
        is isVar = this.a;
        dh.a0 reactionsWindow = isVar.P.getReactionsWindow();
        if (!isVar.o.contains(n0Var.f)) {
            isVar.o.add(n0Var.f);
            if (isVar.o.size() > 7) {
                isVar.o.remove(0);
            }
        } else if (isVar.o.size() <= 1) {
            return;
        } else {
            isVar.o.remove(n0Var.f);
        }
        isVar.P.setSelectedEmojis(isVar.o);
        if (reactionsWindow != null) {
            dh.v vVar = reactionsWindow.m;
            isVar.P.p(null, null, false);
            if (vVar != null) {
                vVar.setSelectedReactions(isVar.o);
                vVar.setRecentReactions(isVar.P.W);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void J() {
    }

    @Override // org.telegram.ui.Components.ki0
    public /* synthetic */ void E(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i3, boolean z10) {
    }
}
