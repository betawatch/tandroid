// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u49 extends q4 {
    public final RecyclerView d;
    public final t49 e = new t49(this);

    public u49(RecyclerView recyclerView) {
        this.d = recyclerView;
    }

    @Override // q4
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        super.b(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || e()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            t26 t26Var = (t26) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = t26Var.b;
            wg2 wg2Var = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView2.canScrollVertically(1) && !t26Var.b.canScrollVertically(-1) && !t26Var.b.canScrollHorizontally(-1) && !t26Var.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                w39 w39Var = t26Var.b.x;
                if (w39Var != null) {
                    accessibilityEvent.setItemCount(w39Var.b());
                }
            }
            if (t26Var.r() > 0) {
                accessibilityEvent.setFromIndex(t26Var.K0());
                accessibilityEvent.setToIndex(t26Var.M0());
            }
        }
    }

    @Override // q4
    public final void c(View view, u4 u4Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, u4Var.a);
        if (e()) {
            return;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.getLayoutManager() != null) {
            d49 layoutManager = recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = layoutManager.b;
            layoutManager.R(recyclerView2.b, recyclerView2.v0, u4Var);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0082 A[ADDED_TO_REGION] */
    @Override // q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean d(View view, int i, Bundle bundle) {
        int E;
        int C;
        if (super.d(view, i, bundle)) {
            return true;
        }
        if (!e()) {
            RecyclerView recyclerView = this.d;
            if (recyclerView.getLayoutManager() != null) {
                d49 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                wg2 wg2Var = recyclerView2.b;
                if (i == 4096) {
                    E = recyclerView2.canScrollVertically(1) ? (layoutManager.n - layoutManager.E()) - layoutManager.B() : 0;
                    if (layoutManager.b.canScrollHorizontally(1)) {
                        C = (layoutManager.m - layoutManager.C()) - layoutManager.D();
                        if (E == 0) {
                        }
                        layoutManager.b.x0(C, E, null);
                        return true;
                    }
                    C = 0;
                    if (E == 0) {
                    }
                    layoutManager.b.x0(C, E, null);
                    return true;
                }
                if (i != 8192) {
                    E = 0;
                    C = 0;
                } else {
                    E = recyclerView2.canScrollVertically(-1) ? -((layoutManager.n - layoutManager.E()) - layoutManager.B()) : 0;
                    if (layoutManager.b.canScrollHorizontally(-1)) {
                        C = -((layoutManager.m - layoutManager.C()) - layoutManager.D());
                    }
                    C = 0;
                }
                if (E == 0 || C != 0) {
                    layoutManager.b.x0(C, E, null);
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean e() {
        RecyclerView recyclerView = this.d;
        return recyclerView.a0() || recyclerView.v0.g;
    }
}
