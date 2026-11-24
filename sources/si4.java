// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public abstract class si4 extends yu9 {
    public final boolean d;

    public si4(boolean z) {
        this.d = z;
    }

    @Override // yu9
    public final boolean a() {
        return k() > j();
    }

    @Override // yu9
    public final boolean b() {
        return k() < i();
    }

    @Override // yu9
    public final void c(boolean z) {
        float h = h();
        if (z) {
            h *= -1.0f;
        }
        l(Math.min(i(), Math.max(j(), k() + h)));
    }

    @Override // yu9
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        if (this.d) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) r4.h.a);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, j(), i(), k()));
        }
    }

    @Override // yu9
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        if (i != ((AccessibilityNodeInfo.AccessibilityAction) r4.h.a).getId()) {
            return false;
        }
        l(bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"));
        return true;
    }

    public float h() {
        return 0.05f;
    }

    public float i() {
        return 1.0f;
    }

    public float j() {
        return 0.0f;
    }

    public abstract float k();

    public abstract void l(float f);
}
