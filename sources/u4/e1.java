package u4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class e1 extends r0.b {
    public final RecyclerView d;
    public final b5.g e = new b5.g(this);

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
            tf.e eVar = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z10 = true;
                if (!recyclerView2.canScrollVertically(1) && !b0Var.b.canScrollVertically(-1) && !b0Var.b.canScrollHorizontally(-1) && !b0Var.b.canScrollHorizontally(1)) {
                    z10 = false;
                }
                accessibilityEvent.setScrollable(z10);
                h0 h0Var = b0Var.b.x;
                if (h0Var != null) {
                    accessibilityEvent.setItemCount(h0Var.b());
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
            o0 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.S(recyclerView2.b, recyclerView2.v0, dVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0083 A[ADDED_TO_REGION] */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i3, Bundle bundle) {
        int F;
        int D;
        if (super.d(view, i3, bundle)) {
            return true;
        }
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                o0 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                tf.e eVar = recyclerView2.b;
                if (i3 == 4096) {
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
                if (i3 != 8192) {
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
