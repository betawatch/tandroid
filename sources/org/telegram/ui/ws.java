package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ws implements r0.o, org.telegram.ui.Components.vj0 {
    public final /* synthetic */ kt a;

    public /* synthetic */ ws(kt ktVar) {
        this.a = ktVar;
    }

    @Override // r0.o
    public r0.m1 I0(View view, r0.m1 m1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean j() {
        return true;
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean m() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public void n(View view, ig.q0 q0Var, boolean z10, boolean z11) {
        if (q0Var == null) {
            return;
        }
        kt ktVar = this.a;
        ig.d0 reactionsWindow = ktVar.P.getReactionsWindow();
        if (!ktVar.o.contains(q0Var.f)) {
            ktVar.o.add(q0Var.f);
            if (ktVar.o.size() > 7) {
                ktVar.o.remove(0);
            }
        } else if (ktVar.o.size() <= 1) {
            return;
        } else {
            ktVar.o.remove(q0Var.f);
        }
        ktVar.P.setSelectedEmojis(ktVar.o);
        if (reactionsWindow != null) {
            ig.z zVar = reactionsWindow.m;
            ktVar.P.p(null, null, false);
            if (zVar != null) {
                zVar.setSelectedReactions(ktVar.o);
                zVar.setRecentReactions(ktVar.P.R);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ boolean t() {
        return false;
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ void s() {
    }

    @Override // org.telegram.ui.Components.vj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i10, boolean z10) {
    }
}
