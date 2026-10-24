package s4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class c1 extends r0.b {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public c1(d1 d1Var) {
        this.e = d1Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r3.b() > 1) goto L12;
     */
    @Override // r0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z10;
        z4.a aVar;
        switch (this.d) {
            case 1:
                z4.h hVar = (z4.h) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(z4.h.class.getName());
                z4.a aVar2 = hVar.e;
                if (aVar2 != null) {
                    z10 = true;
                    break;
                }
                z10 = false;
                accessibilityEvent.setScrollable(z10);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = hVar.e) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(hVar.f);
                    accessibilityEvent.setToIndex(hVar.f);
                    break;
                }
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override // r0.b
    public final void c(View view, s0.d dVar) {
        switch (this.d) {
            case 0:
                this.a.onInitializeAccessibilityNodeInfo(view, dVar.a);
                d1 d1Var = (d1) this.e;
                RecyclerView recyclerView = d1Var.d;
                RecyclerView recyclerView2 = d1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(z4.h.class.getName());
                z4.h hVar = (z4.h) this.e;
                z4.a aVar = hVar.e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (hVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (hVar.canScrollHorizontally(-1)) {
                    dVar.a(8192);
                    break;
                }
                break;
        }
    }

    @Override // r0.b
    public final boolean d(View view, int i10, Bundle bundle) {
        switch (this.d) {
            case 0:
                d1 d1Var = (d1) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = d1Var.d;
                RecyclerView recyclerView2 = d1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    qf.e eVar = recyclerView2.getLayoutManager().b.b;
                }
                return false;
            default:
                z4.h hVar = (z4.h) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && hVar.canScrollHorizontally(-1)) {
                        hVar.setCurrentItem(hVar.f - 1);
                        return true;
                    }
                } else if (hVar.canScrollHorizontally(1)) {
                    hVar.setCurrentItem(hVar.f + 1);
                    return true;
                }
                return false;
        }
    }

    public c1(z4.h hVar) {
        this.e = hVar;
    }
}
