package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ki0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ qh0(ki0 ki0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = ki0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ki0 ki0Var = this.b;
                if (!ki0Var.l0) {
                    try {
                        Window window = ki0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ki0Var.l0 = true;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                AndroidUtilities.runOnUIThread(new qh0(ki0Var, this.c, 1), 100L);
                break;
            default:
                ki0 ki0Var2 = this.b;
                int[] iArr = ki0Var2.k0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.og ogVar = ki0Var2.S;
                if (ogVar != null) {
                    ogVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ki0Var2.S.getWidth();
                    org.telegram.ui.Components.og ogVar2 = ki0Var2.S;
                    ogVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - ogVar2.m(), i10);
                    ki0Var2.T.setScaleX(ki0Var2.S.getScaleX());
                    ki0Var2.T.setScaleY(ki0Var2.S.getScaleY());
                    break;
                }
                break;
        }
    }
}
