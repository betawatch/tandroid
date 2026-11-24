// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class t49 extends q4 {
    public final /* synthetic */ byte d = 1;
    public final Object e;

    public t49(u49 u49Var) {
        this.e = u49Var;
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
        pr7 pr7Var;
        switch (this.d) {
            case 1:
                gec gecVar = (gec) this.e;
                super.b(view, accessibilityEvent);
                accessibilityEvent.setClassName(gec.class.getName());
                pr7 pr7Var2 = gecVar.e;
                if (pr7Var2 != null) {
                    z = true;
                    break;
                }
                z = false;
                accessibilityEvent.setScrollable(z);
                if (accessibilityEvent.getEventType() == 4096 && (pr7Var = gecVar.e) != null) {
                    accessibilityEvent.setItemCount(pr7Var.b());
                    accessibilityEvent.setFromIndex(gecVar.f);
                    accessibilityEvent.setToIndex(gecVar.f);
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
                u49 u49Var = (u49) obj;
                boolean e = u49Var.e();
                RecyclerView recyclerView = u49Var.d;
                if (!e && recyclerView.getLayoutManager() != null) {
                    recyclerView.getLayoutManager().T(view, u4Var);
                    break;
                }
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo = u4Var.a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                u4Var.i(gec.class.getName());
                gec gecVar = (gec) obj;
                pr7 pr7Var = gecVar.e;
                accessibilityNodeInfo.setScrollable(pr7Var != null && pr7Var.b() > 1);
                if (gecVar.canScrollHorizontally(1)) {
                    u4Var.a(TLObject.FLAG_12);
                }
                if (gecVar.canScrollHorizontally(-1)) {
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
                u49 u49Var = (u49) obj;
                if (!super.d(view, i, bundle)) {
                    boolean e = u49Var.e();
                    RecyclerView recyclerView = u49Var.d;
                    if (!e && recyclerView.getLayoutManager() != null) {
                        wg2 wg2Var = recyclerView.getLayoutManager().b.b;
                    }
                    break;
                }
                break;
            default:
                gec gecVar = (gec) obj;
                if (!super.d(view, i, bundle)) {
                    if (i == 4096) {
                        if (gecVar.canScrollHorizontally(1)) {
                            gecVar.setCurrentItem(gecVar.f + 1);
                            break;
                        }
                    } else if (i == 8192 && gecVar.canScrollHorizontally(-1)) {
                        gecVar.setCurrentItem(gecVar.f - 1);
                        break;
                    }
                    break;
                }
                break;
        }
        return false;
    }

    public t49(gec gecVar) {
        this.e = gecVar;
    }
}
