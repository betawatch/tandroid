// default package

import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class tw2 implements qq7, u29 {
    public final /* synthetic */ hx2 a;

    public /* synthetic */ tw2(hx2 hx2Var) {
        this.a = hx2Var;
    }

    @Override // qq7
    public final wzc C0(View view, wzc wzcVar) {
        this.a.q = gm.H0(wzcVar, false);
        return wzcVar;
    }

    @Override // u29
    public final void g(View view, k39 k39Var, boolean z, boolean z2) {
        if (k39Var != null) {
            hx2 hx2Var = this.a;
            x53 reactionsWindow = hx2Var.P.getReactionsWindow();
            boolean contains = hx2Var.o.contains(k39Var.f);
            ArrayList arrayList = hx2Var.o;
            if (!contains) {
                arrayList.add(k39Var.f);
                if (hx2Var.o.size() > 7) {
                    hx2Var.o.remove(0);
                }
            } else if (arrayList.size() <= 1) {
                return;
            } else {
                hx2Var.o.remove(k39Var.f);
            }
            hx2Var.P.setSelectedEmojis(hx2Var.o);
            if (reactionsWindow != null) {
                t53 t53Var = reactionsWindow.m;
                hx2Var.P.m(null, null, false);
                if (t53Var != null) {
                    t53Var.setSelectedReactions(hx2Var.o);
                    t53Var.setRecentReactions(hx2Var.P.W);
                }
                reactionsWindow.d();
            }
        }
    }

    @Override // u29
    public final boolean h() {
        return true;
    }

    @Override // u29
    public final boolean l() {
        return false;
    }

    @Override // u29
    public final boolean s() {
        return false;
    }

    @Override // u29
    public final void o() {
    }

    @Override // u29
    public final void m(Canvas canvas, RectF rectF, float f, float f2, float f3, int i, boolean z) {
    }
}
