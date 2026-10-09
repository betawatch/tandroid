package s4;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class e1 extends r0.b {
    public final /* synthetic */ int d = 0;
    public final Object e;

    public e1(f1 f1Var) {
        this.e = f1Var;
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
                z4.g gVar = (z4.g) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(z4.g.class.getName());
                z4.a aVar2 = gVar.e;
                if (aVar2 != null) {
                    z10 = true;
                    break;
                }
                z10 = false;
                accessibilityEvent.setScrollable(z10);
                if (accessibilityEvent.getEventType() == 4096 && (aVar = gVar.e) != null) {
                    accessibilityEvent.setItemCount(aVar.b());
                    accessibilityEvent.setFromIndex(gVar.f);
                    accessibilityEvent.setToIndex(gVar.f);
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
                f1 f1Var = (f1) this.e;
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    recyclerView2.getLayoutManager().T(view, dVar);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = dVar.a;
                this.a.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                dVar.i(z4.g.class.getName());
                z4.g gVar = (z4.g) this.e;
                z4.a aVar = gVar.e;
                accessibilityNodeInfo.setScrollable(aVar != null && aVar.b() > 1);
                if (gVar.canScrollHorizontally(1)) {
                    dVar.a(4096);
                }
                if (gVar.canScrollHorizontally(-1)) {
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
                f1 f1Var = (f1) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                RecyclerView recyclerView = f1Var.d;
                RecyclerView recyclerView2 = f1Var.d;
                if (!recyclerView.Z() && recyclerView2.getLayoutManager() != null) {
                    pf.e eVar = recyclerView2.getLayoutManager().b.b;
                }
                return false;
            default:
                z4.g gVar = (z4.g) this.e;
                if (super.d(view, i10, bundle)) {
                    return true;
                }
                if (i10 != 4096) {
                    if (i10 == 8192 && gVar.canScrollHorizontally(-1)) {
                        gVar.setCurrentItem(gVar.f - 1);
                        return true;
                    }
                } else if (gVar.canScrollHorizontally(1)) {
                    gVar.setCurrentItem(gVar.f + 1);
                    return true;
                }
                return false;
        }
    }

    public e1(z4.g gVar) {
        this.e = gVar;
    }
}
