package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class x20 extends org.telegram.ui.Components.aj0 {
    public final /* synthetic */ r50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(r50 r50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = r50Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        r50 r50Var = this.r;
        int i10 = r50Var.B1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (r50Var.B1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        r50 r50Var = this.r;
        d20 d20Var = r50Var.u2;
        ArrayList arrayList = r50Var.V1;
        if (r50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && r50Var.B1 == 0 && r50Var.W0 != null) {
            AndroidUtilities.runOnUIThread(d20Var, 300L);
            r50Var.N1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (r50Var.N1) {
                AndroidUtilities.cancelRunOnUIThread(d20Var);
                r50Var.N1 = false;
            } else if (r50Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(r50Var.t2);
                r50Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        r50Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(r50Var.U1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.u) arrayList.get(i10)).j(true);
                }
                r50Var.O1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
