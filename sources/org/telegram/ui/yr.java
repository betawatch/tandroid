package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yr implements r0.m, org.telegram.ui.Components.hi0 {
    public final /* synthetic */ ks a;

    public /* synthetic */ yr(ks ksVar) {
        this.a = ksVar;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean E() {
        return false;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        this.a.q = org.telegram.messenger.g0.I0(k1Var, false);
        return k1Var;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean U() {
        return false;
    }

    @Override // org.telegram.ui.Components.hi0
    public void i(View view, ch.o0 o0Var, boolean z9, boolean z10) {
        if (o0Var == null) {
            return;
        }
        ks ksVar = this.a;
        ch.b0 reactionsWindow = ksVar.P.getReactionsWindow();
        if (!ksVar.o.contains(o0Var.f)) {
            ksVar.o.add(o0Var.f);
            if (ksVar.o.size() > 7) {
                ksVar.o.remove(0);
            }
        } else if (ksVar.o.size() <= 1) {
            return;
        } else {
            ksVar.o.remove(o0Var.f);
        }
        ksVar.P.setSelectedEmojis(ksVar.o);
        if (reactionsWindow != null) {
            ch.w wVar = reactionsWindow.m;
            ksVar.P.p(null, null, false);
            if (wVar != null) {
                wVar.setSelectedReactions(ksVar.o);
                wVar.setRecentReactions(ksVar.P.V);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ boolean v() {
        return true;
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void M() {
    }

    @Override // org.telegram.ui.Components.hi0
    public /* synthetic */ void L(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i7, boolean z9) {
    }
}
