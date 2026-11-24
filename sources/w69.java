// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class w69 extends q4 {
    public final RecyclerView d;
    public final v69 e = new v69(this);

    public w69(RecyclerView recyclerView) {
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
            u46 u46Var = (u46) recyclerView.getLayoutManager();
            RecyclerView recyclerView2 = u46Var.b;
            ki2 ki2Var = recyclerView2.b;
            if (accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView2.canScrollVertically(1) && !u46Var.b.canScrollVertically(-1) && !u46Var.b.canScrollHorizontally(-1) && !u46Var.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                y59 y59Var = u46Var.b.x;
                if (y59Var != null) {
                    accessibilityEvent.setItemCount(y59Var.b());
                }
            }
            if (u46Var.r() > 0) {
                accessibilityEvent.setFromIndex(u46Var.K0());
                accessibilityEvent.setToIndex(u46Var.M0());
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
            f69 layoutManager = recyclerView.getLayoutManager();
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
                f69 layoutManager = recyclerView.getLayoutManager();
                RecyclerView recyclerView2 = layoutManager.b;
                ki2 ki2Var = recyclerView2.b;
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
