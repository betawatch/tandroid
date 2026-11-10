package v4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes.dex */
public final class e1 extends r0.b {
    public final RecyclerView d;
    public final c5.f e = new c5.f(this);

    public e1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // r0.b
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || e()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            b0 b0Var = (b0) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = b0Var.b;
            v0 v0Var = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z9 = true;
                if (!recyclerView2.canScrollVertically(1) && !b0Var.b.canScrollVertically(-1) && !b0Var.b.canScrollHorizontally(-1) && !b0Var.b.canScrollHorizontally(1)) {
                    z9 = false;
                }
                accessibilityEvent.setScrollable(z9);
                g0 g0Var = b0Var.b.x;
                if (g0Var != null) {
                    accessibilityEvent.setItemCount(g0Var.b());
                }
            }
            if (b0Var.r() > 0) {
                accessibilityEvent.setFromIndex(b0Var.L0());
                accessibilityEvent.setToIndex(b0Var.N0());
            }
        }
    }

    @Override // r0.b
    public final void c(View view, s0.d dVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
        if (e()) {
            return;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.getLayoutManager() != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.S(recyclerView2.b, recyclerView2.u0, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i7, Bundle bundle) {
        int F;
        int D;
        if (super.d(view, i7, bundle)) {
            return true;
        }
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                n0 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                v0 v0Var = recyclerView2.b;
                if (i7 == 4096) {
                    F = recyclerView2.canScrollVertically(1) ? (layoutManager.n - layoutManager.F()) - layoutManager.C() : 0;
                    if (layoutManager.b.canScrollHorizontally(1)) {
                        D = (layoutManager.m - layoutManager.D()) - layoutManager.E();
                        if (F == 0) {
                        }
                        layoutManager.b.w0(D, F, null);
                        return true;
                    }
                    D = 0;
                    if (F == 0) {
                    }
                    layoutManager.b.w0(D, F, null);
                    return true;
                }
                if (i7 != 8192) {
                    D = 0;
                    F = 0;
                } else {
                    F = recyclerView2.canScrollVertically(-1) ? -((layoutManager.n - layoutManager.F()) - layoutManager.C()) : 0;
                    if (layoutManager.b.canScrollHorizontally(-1)) {
                        D = -((layoutManager.m - layoutManager.D()) - layoutManager.E());
                    }
                    D = 0;
                }
                if (F == 0 || D != 0) {
                    layoutManager.b.w0(D, F, null);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        return recyclerView.Z() || recyclerView.u0.g;
    }
}
