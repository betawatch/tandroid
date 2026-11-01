package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs implements r0.m, org.telegram.ui.Components.mj0 {
    public final /* synthetic */ kt a;

    public /* synthetic */ xs(kt ktVar) {
        this.a = ktVar;
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ boolean A() {
        return false;
    }

    @Override // r0.m
    public r0.j1 R0(View view, r0.j1 j1Var) {
        this.a.q = org.telegram.messenger.i0.I0(j1Var, false);
        return j1Var;
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ boolean h() {
        return false;
    }

    @Override // org.telegram.ui.Components.mj0
    public void x(View view, sg.o0 o0Var, boolean z10, boolean z11) {
        if (o0Var == null) {
            return;
        }
        kt ktVar = this.a;
        sg.b0 reactionsWindow = ktVar.P.getReactionsWindow();
        if (!ktVar.o.contains(o0Var.f)) {
            ktVar.o.add(o0Var.f);
            if (ktVar.o.size() > 7) {
                ktVar.o.remove(0);
            }
        } else if (ktVar.o.size() <= 1) {
            return;
        } else {
            ktVar.o.remove(o0Var.f);
        }
        ktVar.P.setSelectedEmojis(ktVar.o);
        if (reactionsWindow != null) {
            sg.w wVar = reactionsWindow.m;
            ktVar.P.p(null, null, false);
            if (wVar != null) {
                wVar.setSelectedReactions(ktVar.o);
                wVar.setRecentReactions(ktVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.mj0
    public /* synthetic */ void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
