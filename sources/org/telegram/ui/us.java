package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements r0.o, org.telegram.ui.Components.ek0 {
    public final /* synthetic */ ht a;

    public /* synthetic */ us(ht htVar) {
        this.a = htVar;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean O() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public void Q(View view, kg.q0 q0Var, boolean z10, boolean z11) {
        if (q0Var == null) {
            return;
        }
        ht htVar = this.a;
        kg.d0 reactionsWindow = htVar.P.getReactionsWindow();
        if (!htVar.o.contains(q0Var.f)) {
            htVar.o.add(q0Var.f);
            if (htVar.o.size() > 7) {
                htVar.o.remove(0);
            }
        } else if (htVar.o.size() <= 1) {
            return;
        } else {
            htVar.o.remove(q0Var.f);
        }
        htVar.P.setSelectedEmojis(htVar.o);
        if (reactionsWindow != null) {
            kg.z zVar = reactionsWindow.m;
            htVar.P.p(null, null, false);
            if (zVar != null) {
                zVar.setSelectedReactions(htVar.o);
                zVar.setRecentReactions(htVar.P.R);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ boolean w() {
        return false;
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void H() {
    }

    @Override // org.telegram.ui.Components.ek0
    public /* synthetic */ void G(Canvas canvas, RectF rectF, float f9, float f10, float f11, int i10, boolean z10) {
    }
}
