// default package

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class vh1 extends ry8 {
    public final /* synthetic */ byte r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vh1(byte b, Context context, Object obj) {
        super(context);
        this.r = b;
        this.s = obj;
    }

    @Override // android.view.View
    public final void invalidate() {
        byte b = this.r;
        Object obj = this.s;
        switch (b) {
            case 0:
                super.invalidate();
                ((yh1) obj).h.invalidate();
                break;
            case 1:
            default:
                super.invalidate();
                break;
            case 2:
                super.invalidate();
                ((m75) obj).invalidate();
                break;
            case 3:
                super.invalidate();
                ((wa5) obj).e.invalidate();
                break;
            case 4:
                super.invalidate();
                ((ae6) obj).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!((xd2) this.s).G1) {
                    accessibilityNodeInfo.setText(k96.M0(2131754749, null));
                    break;
                } else {
                    accessibilityNodeInfo.setText(k96.M0(2131754750, null));
                    break;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        byte b = this.r;
        Object obj = this.s;
        switch (b) {
            case 0:
                super.invalidate(i, i2, i3, i4);
                ((yh1) obj).h.invalidate();
                break;
            case 1:
            case 2:
            default:
                super.invalidate(i, i2, i3, i4);
                break;
            case 3:
                super.invalidate(i, i2, i3, i4);
                ((wa5) obj).e.invalidate();
                break;
            case 4:
                super.invalidate(i, i2, i3, i4);
                ((ae6) obj).h.invalidate();
                break;
        }
    }
}
