package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ si0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ yh0(si0 si0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = si0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                si0 si0Var = this.b;
                if (!si0Var.m0) {
                    try {
                        Window window = si0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        si0Var.m0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new yh0(si0Var, this.c, 1), 100L);
                break;
            default:
                si0 si0Var2 = this.b;
                int[] iArr = si0Var2.l0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.lg lgVar = si0Var2.T;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = si0Var2.T.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = si0Var2.T;
                    lgVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - lgVar2.m(), i10);
                    si0Var2.U.setScaleX(si0Var2.T.getScaleX());
                    si0Var2.U.setScaleY(si0Var2.T.getScaleY());
                    break;
                }
                break;
        }
    }
}
