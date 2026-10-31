package s4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class e1 extends r0.b {
    public final RecyclerView d;
    public final d1 e = new d1(this);

    public e1(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // r0.b
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.Z()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            a0 a0Var = (a0) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = a0Var.b;
            hf.e eVar = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView2.canScrollVertically(1) && !a0Var.b.canScrollVertically(-1) && !a0Var.b.canScrollHorizontally(-1) && !a0Var.b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                g0 g0Var = a0Var.b.x;
                if (g0Var != null) {
                    accessibilityEvent.setItemCount(g0Var.b());
                }
            }
            if (a0Var.r() > 0) {
                accessibilityEvent.setFromIndex(a0Var.L0());
                accessibilityEvent.setToIndex(a0Var.N0());
            }
        }
    }

    @Override // r0.b
    public final void c(View view, s0.c cVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, cVar.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.Z() || recyclerView.getLayoutManager() == null) {
            return;
        }
        n0 layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.S(recyclerView2.b, recyclerView2.u0, cVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i10, Bundle bundle) {
        int F;
        int D;
        if (super.d(view, i10, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.Z() && recyclerView.getLayoutManager() != null) {
            n0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            hf.e eVar = recyclerView2.b;
            if (i10 == 4096) {
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
            if (i10 != 8192) {
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
        return false;
    }
}
