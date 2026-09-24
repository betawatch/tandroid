package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zs implements r0.n, org.telegram.ui.Components.pk0 {
    public final /* synthetic */ nt a;

    public /* synthetic */ zs(nt ntVar) {
        this.a = ntVar;
    }

    @Override // r0.n
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        return l1Var;
    }

    @Override // org.telegram.ui.Components.pk0
    public void h(View view, zg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var == null) {
            return;
        }
        nt ntVar = this.a;
        zg.b0 reactionsWindow = ntVar.P.getReactionsWindow();
        if (!ntVar.o.contains(o0Var.f)) {
            ntVar.o.add(o0Var.f);
            if (ntVar.o.size() > 7) {
                ntVar.o.remove(0);
            }
        } else if (ntVar.o.size() <= 1) {
            return;
        } else {
            ntVar.o.remove(o0Var.f);
        }
        ntVar.P.setSelectedEmojis(ntVar.o);
        if (reactionsWindow != null) {
            zg.x xVar = reactionsWindow.m;
            ntVar.P.p(null, null, false);
            if (xVar != null) {
                xVar.setSelectedReactions(ntVar.o);
                xVar.setRecentReactions(ntVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean k() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void n() {
    }

    @Override // org.telegram.ui.Components.pk0
    public /* synthetic */ void m(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
