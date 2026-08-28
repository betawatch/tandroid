package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements r0.o, org.telegram.ui.Components.tj0 {
    public final /* synthetic */ ht a;

    public /* synthetic */ vs(ht htVar) {
        this.a = htVar;
    }

    @Override // r0.o
    public r0.m1 L0(View view, r0.m1 m1Var) {
        this.a.q = AndroidUtilities.getDefaultWindowInsets(m1Var, false);
        return m1Var;
    }

    @Override // org.telegram.ui.Components.tj0
    public void d(View view, hg.r0 r0Var, boolean z10, boolean z11) {
        if (r0Var == null) {
            return;
        }
        ht htVar = this.a;
        hg.e0 reactionsWindow = htVar.P.getReactionsWindow();
        if (!htVar.o.contains(r0Var.f)) {
            htVar.o.add(r0Var.f);
            if (htVar.o.size() > 7) {
                htVar.o.remove(0);
            }
        } else if (htVar.o.size() <= 1) {
            return;
        } else {
            htVar.o.remove(r0Var.f);
        }
        htVar.P.setSelectedEmojis(htVar.o);
        if (reactionsWindow != null) {
            hg.z zVar = reactionsWindow.m;
            htVar.P.p(null, null, false);
            if (zVar != null) {
                zVar.setSelectedReactions(htVar.o);
                zVar.setRecentReactions(htVar.P.R);
            }
            reactionsWindow.d();
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean n() {
        return true;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean p() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ boolean u() {
        return false;
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void t() {
    }

    @Override // org.telegram.ui.Components.tj0
    public /* synthetic */ void s(Canvas canvas, RectF rectF, float f10, float f11, float f12, int i9, boolean z10) {
    }
}
