// default package

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public abstract class wk4 extends bx9 {
    public final boolean d;

    public wk4(boolean z) {
        this.d = z;
    }

    @Override // bx9
    public final boolean a() {
        return k() > j();
    }

    @Override // bx9
    public final boolean b() {
        return k() < i();
    }

    @Override // bx9
    public final void c(boolean z) {
        float h = h();
        if (z) {
            h *= -1.0f;
        }
        l(Math.min(i(), Math.max(j(), k() + h)));
    }

    @Override // bx9
    public final void e(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.e(view, accessibilityNodeInfo);
        if (this.d) {
            accessibilityNodeInfo.addAction((AccessibilityNodeInfo.AccessibilityAction) r4.i.a);
            accessibilityNodeInfo.setRangeInfo(AccessibilityNodeInfo.RangeInfo.obtain(1, j(), i(), k()));
        }
    }

    @Override // bx9
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        if (i != r4.i.a()) {
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
