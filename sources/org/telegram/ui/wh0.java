package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qi0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ wh0(qi0 qi0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = qi0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qi0 qi0Var = this.b;
                if (!qi0Var.o0) {
                    try {
                        Window window = qi0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        qi0Var.o0 = true;
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                }
                AndroidUtilities.runOnUIThread(new wh0(qi0Var, this.c, 1), 100L);
                break;
            default:
                qi0 qi0Var2 = this.b;
                int[] iArr = qi0Var2.n0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.vg vgVar = qi0Var2.V;
                if (vgVar != null) {
                    vgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = qi0Var2.V.getWidth();
                    org.telegram.ui.Components.vg vgVar2 = qi0Var2.V;
                    vgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.sl.D(6.0f, width - vgVar2.m(), i10);
                    qi0Var2.W.setScaleX(qi0Var2.V.getScaleX());
                    qi0Var2.W.setScaleY(qi0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
