package org.telegram.ui;

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class xc extends org.telegram.ui.Components.qh0 {
    public final /* synthetic */ int r;
    public final /* synthetic */ Object s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xc(int i7, Context context, Object obj) {
        super(context);
        this.r = i7;
        this.s = obj;
    }

    @Override // android.view.View
    public void invalidate(int i7, int i10, int i11, int i12) {
        switch (this.r) {
            case 0:
                super.invalidate(i7, i10, i11, i12);
                ((ad) this.s).h.invalidate();
                break;
            case 1:
            case 2:
            default:
                super.invalidate(i7, i10, i11, i12);
                break;
            case 3:
                super.invalidate(i7, i10, i11, i12);
                ((e50) this.s).e.invalidate();
                break;
            case 4:
                super.invalidate(i7, i10, i11, i12);
                ((oc0) this.s).h.invalidate();
                break;
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        switch (this.r) {
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                if (!((org.telegram.ui.Components.kp) this.s).H1) {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131754749, null));
                    break;
                } else {
                    accessibilityNodeInfo.setText(org.telegram.messenger.gd.N0(2131754750, null));
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
                ((ad) this.s).h.invalidate();
                break;
            case 1:
            default:
                super.invalidate();
                break;
            case 2:
                super.invalidate();
                ((org.telegram.ui.Components.s10) this.s).invalidate();
                break;
            case 3:
                super.invalidate();
                ((e50) this.s).e.invalidate();
                break;
            case 4:
                super.invalidate();
                ((oc0) this.s).h.invalidate();
                break;
        }
    }
}
