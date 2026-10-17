package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements r0.n, org.telegram.ui.Components.bl0 {
    public final /* synthetic */ gt a;

    public /* synthetic */ us(gt gtVar) {
        this.a = gtVar;
    }

    @Override // r0.n
    public r0.k1 B0(View view, r0.k1 k1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public void l(View view, ah.i1 i1Var, boolean z10, boolean z11) {
        if (i1Var == null) {
            return;
        }
        gt gtVar = this.a;
        ah.t0 reactionsWindow = gtVar.P.getReactionsWindow();
        if (!gtVar.o.contains(i1Var.f)) {
            gtVar.o.add(i1Var.f);
            if (gtVar.o.size() > 7) {
                gtVar.o.remove(0);
            }
        } else if (gtVar.o.size() <= 1) {
            return;
        } else {
            gtVar.o.remove(i1Var.f);
        }
        gtVar.P.setSelectedEmojis(gtVar.o);
        if (reactionsWindow != null) {
            ah.n0 n0Var = reactionsWindow.m;
            gtVar.P.p(null, null, false);
            if (n0Var != null) {
                n0Var.setSelectedReactions(gtVar.o);
                n0Var.setRecentReactions(gtVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ boolean s() {
        return false;
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void q() {
    }

    @Override // org.telegram.ui.Components.bl0
    public /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
