// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.WeakHashMap;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class r64 extends l69 {
    public final /* synthetic */ s64 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r64(s64 s64Var) {
        super((byte) 3);
        this.f = s64Var;
    }

    @Override // l69
    public final boolean F(int i, int i2, Bundle bundle) {
        int i3;
        int i4;
        s64 s64Var = this.f;
        View view = s64Var.i;
        if (i == -1) {
            WeakHashMap weakHashMap = jdc.a;
            return view.performAccessibilityAction(i2, bundle);
        }
        if (i2 != 1) {
            if (i2 == 2) {
                if (s64Var.l != i) {
                    return false;
                }
                s64Var.l = TLObject.FLAG_31;
                s64Var.m(i, 8);
                return true;
            }
            if (i2 != 64) {
                if (i2 != 128) {
                    return s64Var.k(i, i2);
                }
                if (s64Var.k != i) {
                    return false;
                }
                s64Var.k = TLObject.FLAG_31;
                view.invalidate();
                s64Var.m(i, 65536);
                return true;
            }
            AccessibilityManager accessibilityManager = s64Var.h;
            if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i4 = s64Var.k) != i) {
                if (i4 != Integer.MIN_VALUE) {
                    s64Var.k = TLObject.FLAG_31;
                    view.invalidate();
                    s64Var.m(i4, 65536);
                }
                s64Var.k = i;
                view.invalidate();
                s64Var.m(i, 32768);
                return true;
            }
        } else if ((view.isFocused() || view.requestFocus()) && (i3 = s64Var.l) != i) {
            if (i3 != Integer.MIN_VALUE) {
                s64Var.l = TLObject.FLAG_31;
                s64Var.m(i3, 8);
            }
            s64Var.l = i;
            s64Var.m(i, 8);
            return true;
        }
        return false;
    }

    @Override // l69
    public final u4 u(int i) {
        return new u4(AccessibilityNodeInfo.obtain(this.f.j(i).a));
    }

    @Override // l69
    public final u4 w(int i) {
        s64 s64Var = this.f;
        int i2 = i == 2 ? s64Var.k : s64Var.l;
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return u(i2);
    }
}
