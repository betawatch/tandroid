package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ss implements r0.n, org.telegram.ui.Components.cl0 {
    public final /* synthetic */ et a;

    public /* synthetic */ ss(et etVar) {
        this.a = etVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ boolean i() {
        return true;
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public void o(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var == null) {
            return;
        }
        et etVar = this.a;
        ah.t0 reactionsWindow = etVar.P.getReactionsWindow();
        if (!etVar.o.contains(i1Var.f)) {
            etVar.o.add(i1Var.f);
            if (etVar.o.size() > 7) {
                etVar.o.remove(0);
            }
        } else if (etVar.o.size() <= 1) {
            return;
        } else {
            etVar.o.remove(i1Var.f);
        }
        etVar.P.setSelectedEmojis(etVar.o);
        if (reactionsWindow != null) {
            ah.n0 n0Var = reactionsWindow.m;
            etVar.P.p(null, null, false);
            if (n0Var != null) {
                n0Var.setSelectedReactions(etVar.o);
                n0Var.setRecentReactions(etVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void v() {
    }

    @Override // org.telegram.ui.Components.cl0
    public /* synthetic */ void q(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
