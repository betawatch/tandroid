package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class yc extends org.telegram.ui.Components.ch0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yc(int i7, Context context, Object obj) {
        super(context);
        this.r = i7;
        this.s = obj;
    }

    @Override // android.view.View
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.r) {
            case 0:
                super.invalidate(i7, i10, i11, i12);
                ((bd) this.s).h.invalidate();
                break;
            case 1:
            case 2:
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
            case 3:
                super.invalidate(i7, i10, i11, i12);
                ((d50) this.s).e.invalidate();
                break;
            case 4:
                super.invalidate(i7, i10, i11, i12);
                ((pc0) this.s).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!((org.telegram.ui.Components.vo) this.s).D1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754750, null));
                    break;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.hd.M0(2131754751, null));
                    break;
                }
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.r) {
            case 0:
                super.invalidate();
                ((bd) this.s).h.invalidate();
                break;
            case 1:
            default:
                super.invalidate();
                break;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.g10) this.s).invalidate();
                break;
            case 3:
                super.invalidate();
                ((d50) this.s).e.invalidate();
                break;
            case 4:
                super.invalidate();
                ((pc0) this.s).h.invalidate();
                break;
        }
    }
}
