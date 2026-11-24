// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v69 extends q4 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public v69(w69 w69Var) {
        this.e = w69Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0022, code lost:
    
        if (r1.b() <= 1) goto L10;
     */
    @Override // q4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        qt7 qt7Var;
        switch (this.d) {
            case 1:
                ggc ggcVar = (ggc) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(ggc.class.getName());
                qt7 qt7Var2 = ggcVar.e;
                if (qt7Var2 != null) {
                    z = true;
                    break;
                }
                z = false;
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (qt7Var = ggcVar.e) != null) {
                    accessibilityEvent.setItemCount(qt7Var.b());
                    accessibilityEvent.setFromIndex(ggcVar.f);
                    accessibilityEvent.setToIndex(ggcVar.f);
                    break;
                }
                break;
            default:
                super.b(view, accessibilityEvent);
                break;
        }
    }

    @Override // q4
    public final void c(View view, u4 u4Var) {
        byte b = this.d;
        Object obj = this.e;
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        switch (b) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, u4Var.a);
                w69 w69Var = (w69) obj;
                boolean e = w69Var.e();
                RecyclerView recyclerView = w69Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, u4Var);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                u4Var.i(ggc.class.getName());
                ggc ggcVar = (ggc) obj;
                qt7 qt7Var = ggcVar.e;
                accessibilityNodeInfo.setScrollable(qt7Var != null && qt7Var.b() > 1);
                if (ggcVar.canScrollHorizontally(1)) {
                    u4Var.a(TLObject.FLAG_12);
                }
                if (ggcVar.canScrollHorizontally(-1)) {
                    u4Var.a(TLObject.FLAG_13);
                    break;
                }
                break;
        }
    }

    @Override // q4
    public final boolean d(View view, int i, Bundle bundle) {
        byte b = this.d;
        Object obj = this.e;
        switch (b) {
            case 0:
                w69 w69Var = (w69) obj;
                if (!super.d(view, i, bundle)) {
                    boolean e = w69Var.e();
                    RecyclerView recyclerView = w69Var.d;
                    if (!e && recyclerView.getLayoutManager() != null) {
                        ki2 ki2Var = recyclerView.getLayoutManager().b.b;
                    }
                    break;
                }
                break;
            default:
                ggc ggcVar = (ggc) obj;
                if (!super.d(view, i, bundle)) {
                    if (i == 4096) {
                        if (ggcVar.canScrollHorizontally(1)) {
                            ggcVar.setCurrentItem(ggcVar.f + 1);
                            break;
                        }
                    } else if (i == 8192 && ggcVar.canScrollHorizontally(-1)) {
                        ggcVar.setCurrentItem(ggcVar.f - 1);
                        break;
                    }
                    break;
                }
                break;
        }
        return false;
    }

    public v69(ggc ggcVar) {
        this.e = ggcVar;
    }
}
