package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class sh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mi0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ sh0(mi0 mi0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = mi0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mi0 mi0Var = this.b;
                if (!mi0Var.o0) {
                    try {
                        Window window = mi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        mi0Var.o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new sh0(mi0Var, this.c, 1), 100L);
                break;
            default:
                mi0 mi0Var2 = this.b;
                int[] iArr = mi0Var2.n0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.vg vgVar = mi0Var2.V;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = mi0Var2.V.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = mi0Var2.V;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.mk.D(6.0f, width - vgVar2.m(), i10);
                    mi0Var2.W.setScaleX(mi0Var2.V.getScaleX());
                    mi0Var2.W.setScaleY(mi0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
