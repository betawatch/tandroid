// default package

import android.content.Context;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w42 extends r7 {
    public final /* synthetic */ byte A0;
    public final /* synthetic */ Object B0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w42(FrameLayout frameLayout, Context context, r6 r6Var, wjb wjbVar, byte b) {
        super(context, r6Var, 0, 0, false, wjbVar);
        this.A0 = b;
        this.B0 = frameLayout;
    }

    @Override // r7, android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        byte b = this.A0;
        Object obj = this.B0;
        switch (b) {
            case 0:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((ChatAttachAlertPhotoLayout) obj).y.getText());
                break;
            case 1:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((m52) obj).y.getText());
                break;
            case 2:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((sr4) obj).E.getText());
                break;
            default:
                super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
                accessibilityNodeInfo.setText(((qmb) obj).h.getText());
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w42(qmb qmbVar, Context context, r6 r6Var) {
        super(context, r6Var, 0);
        this.A0 = (byte) 3;
        this.B0 = qmbVar;
    }
}
