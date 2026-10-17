package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class uh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oi0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ uh0(oi0 oi0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = oi0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oi0 oi0Var = this.b;
                if (!oi0Var.p0) {
                    try {
                        Window window = oi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        oi0Var.p0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new uh0(oi0Var, this.c, 1), 100L);
                break;
            default:
                oi0 oi0Var2 = this.b;
                int[] iArr = oi0Var2.o0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.vg vgVar = oi0Var2.W;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = oi0Var2.W.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = oi0Var2.W;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.ui.Cells.t0.e(6.0f, width - vgVar2.m(), i10);
                    oi0Var2.X.setScaleX(oi0Var2.W.getScaleX());
                    oi0Var2.X.setScaleY(oi0Var2.W.getScaleY());
                    break;
                }
                break;
        }
    }
}
