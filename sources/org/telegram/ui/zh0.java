package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ti0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ zh0(ti0 ti0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = ti0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ti0 ti0Var = this.b;
                if (!ti0Var.m0) {
                    try {
                        Window window = ti0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ti0Var.m0 = true;
                    } catch (Exception e6) {
                        FileLog.e(e6);
                    }
                }
                AndroidUtilities.runOnUIThread(new zh0(ti0Var, this.c, 1), 100L);
                break;
            default:
                ti0 ti0Var2 = this.b;
                int[] iArr = ti0Var2.l0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.lg lgVar = ti0Var2.T;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ti0Var2.T.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = ti0Var2.T;
                    lgVar2.getHeight();
                    iArr[0] = b.C(6.0f, width - lgVar2.m(), i10);
                    ti0Var2.U.setScaleX(ti0Var2.T.getScaleX());
                    ti0Var2.U.setScaleY(ti0Var2.T.getScaleY());
                    break;
                }
                break;
        }
    }
}
