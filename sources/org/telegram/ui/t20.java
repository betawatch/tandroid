package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t20 extends org.telegram.ui.Components.pi0 {
    public final /* synthetic */ o50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t20(o50 o50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = o50Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        o50 o50Var = this.r;
        int i9 = o50Var.B1;
        accessibilityNodeInfo.setEnabled(i9 == 0 || i9 == 1);
        if (o50Var.B1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        o50 o50Var = this.r;
        b20 b20Var = o50Var.u2;
        ArrayList arrayList = o50Var.V1;
        if (o50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && o50Var.B1 == 0 && o50Var.W0 != null) {
            AndroidUtilities.runOnUIThread(b20Var, 300L);
            o50Var.N1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (o50Var.N1) {
                AndroidUtilities.cancelRunOnUIThread(b20Var);
                o50Var.N1 = false;
            } else if (o50Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(o50Var.t2);
                o50Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        o50Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(o50Var.U1);
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i9)).j(true);
                }
                o50Var.O1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
