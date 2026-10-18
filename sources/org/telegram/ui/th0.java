package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class th0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ni0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ th0(ni0 ni0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = ni0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ni0 ni0Var = this.b;
                if (!ni0Var.p0) {
                    try {
                        Window window = ni0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ni0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new th0(ni0Var, this.c, 1), 100L);
                break;
            default:
                ni0 ni0Var2 = this.b;
                int[] iArr = ni0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.vg vgVar = ni0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ni0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = ni0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.lk.D(6.0f, width - vgVar2.m(), i10);
                    ni0Var2.X.setScaleX(ni0Var2.W.getScaleX());
                    ni0Var2.X.setScaleY(ni0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
