package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements r0.m, org.telegram.ui.Components.lj0 {
    public final /* synthetic */ lt a;

    public /* synthetic */ ys(lt ltVar) {
        this.a = ltVar;
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        this.a.q = org.telegram.messenger.i0.I0(j1Var, false);
        return j1Var;
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.lj0
    public void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var == null) {
            return;
        }
        lt ltVar = this.a;
        sg.b0 reactionsWindow = ltVar.P.getReactionsWindow();
        if (!ltVar.o.contains(o0Var.f)) {
            ltVar.o.add(o0Var.f);
            if (ltVar.o.size() > 7) {
                ltVar.o.remove(0);
            }
        } else if (ltVar.o.size() <= 1) {
            return;
        } else {
            ltVar.o.remove(o0Var.f);
        }
        ltVar.P.setSelectedEmojis(ltVar.o);
        if (reactionsWindow != null) {
            sg.w wVar = reactionsWindow.m;
            ltVar.P.p(null, null, false);
            if (wVar != null) {
                wVar.setSelectedReactions(ltVar.o);
                wVar.setRecentReactions(ltVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.lj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
