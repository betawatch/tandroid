package org.telegram.ui;

import android.view.MotionEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.voip.VoIPService;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class w20 extends org.telegram.ui.Components.ri0 {
    public final /* synthetic */ s50 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w20(s50 s50Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.r = s50Var;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
        s50 s50Var = this.r;
        int i10 = s50Var.B1;
        accessibilityNodeInfo.setEnabled(i10 == 0 || i10 == 1);
        if (s50Var.B1 == 1) {
            accessibilityNodeInfo.addAction(new AccessibilityNodeInfo.AccessibilityAction(16, LocaleController.getString(R.string.VoipMute)));
        }
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        s50 s50Var = this.r;
        e20 e20Var = s50Var.u2;
        ArrayList arrayList = s50Var.V1;
        if (s50Var.r1()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 0 && s50Var.B1 == 0 && s50Var.W0 != null) {
            AndroidUtilities.runOnUIThread(e20Var, 300L);
            s50Var.N1 = true;
        } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            if (s50Var.N1) {
                AndroidUtilities.cancelRunOnUIThread(e20Var);
                s50Var.N1 = false;
            } else if (s50Var.O1) {
                AndroidUtilities.cancelRunOnUIThread(s50Var.t2);
                s50Var.J1(0, true);
                if (VoIPService.getSharedInstance() != null) {
                    VoIPService.getSharedInstance().setMicMute(true, true, false);
                    try {
                        s50Var.w.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                }
                arrayList.clear();
                arrayList.addAll(s50Var.U1);
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.ui.Components.voip.t) arrayList.get(i10)).j(true);
                }
                s50Var.O1 = false;
                MotionEvent obtain = MotionEvent.obtain(0L, 0L, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(obtain);
                obtain.recycle();
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }
}
