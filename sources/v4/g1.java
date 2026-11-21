package v4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes.dex */
public final class g1 extends r0.b {
    public final RecyclerView d;
    public final c5.g e = new c5.g(this);

    public g1(RecyclerView recyclerView) {
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
            c0 c0Var = (c0) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = c0Var.b;
            x0 x0Var = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView2.canScrollVertically(1) && !c0Var.b.canScrollVertically(-1) && !c0Var.b.canScrollHorizontally(-1) && !c0Var.b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                i0 i0Var = c0Var.b.x;
                if (i0Var != null) {
                    accessibilityEvent.setItemCount(i0Var.b());
                }
            }
            if (c0Var.r() > 0) {
                accessibilityEvent.setFromIndex(c0Var.L0());
                accessibilityEvent.setToIndex(c0Var.N0());
            }
        }
    }

    @Override // r0.b
    public final void c(View view, s0.c cVar) {
        this.a.onInitializeAccessibilityNodeInfo(view, cVar.a);
        if (e()) {
            return;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.getLayoutManager() != null) {
            p0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.S(recyclerView2.b, recyclerView2.v0, cVar);
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
                p0 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                x0 x0Var = recyclerView2.b;
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
        return recyclerView.Z() || recyclerView.v0.g;
    }
}
