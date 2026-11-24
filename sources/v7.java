// default package

import android.content.Context;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class v7 extends w7 {
    public final u7 h0;
    public String i0;

    public v7(Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.i0 = null;
        setFocusable(true);
        setFocusableInTouchMode(true);
        setImportantForAccessibility(1);
        u7 u7Var = new u7(this, (byte) 0);
        this.h0 = u7Var;
        setAccessibilityDelegate(u7Var);
    }

    public final void e(boolean z, float f) {
        d(z, (f - 0.2f) / 2.8f);
    }

    public float getSpeed() {
        return (getValue() * 2.8f) + 0.2f;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.h0.e(this, accessibilityNodeInfo);
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        return super.performAccessibilityAction(i, bundle) || this.h0.g(this, i, bundle);
    }

    public void setLabel(String str) {
        this.i0 = str;
    }

    @Override // w7
    public void setStops(float[] fArr) {
        for (int i = 0; i < fArr.length; i++) {
            fArr[i] = (fArr[i] - 0.2f) / 2.8f;
        }
        super.setStops(fArr);
    }
}
