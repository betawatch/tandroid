package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pi0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ vh0(pi0 pi0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = pi0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pi0 pi0Var = this.b;
                if (!pi0Var.o0) {
                    try {
                        Window window = pi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        pi0Var.o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new vh0(pi0Var, this.c, 1), 100L);
                break;
            default:
                pi0 pi0Var2 = this.b;
                int[] iArr = pi0Var2.n0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.vg vgVar = pi0Var2.V;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = pi0Var2.V.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = pi0Var2.V;
                    vgVar2.getHeight();
                    iArr[0] = d3.w(6.0f, width - vgVar2.m(), i10);
                    pi0Var2.W.setScaleX(pi0Var2.V.getScaleX());
                    pi0Var2.W.setScaleY(pi0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
