package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rh0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ li0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ rh0(li0 li0Var, EditText editText, int i9) {
        this.a = i9;
        this.b = li0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                li0 li0Var = this.b;
                if (!li0Var.l0) {
                    try {
                        Window window = li0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        li0Var.l0 = true;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                    }
                }
                AndroidUtilities.runOnUIThread(new rh0(li0Var, this.c, 1), 100L);
                break;
            default:
                li0 li0Var2 = this.b;
                int[] iArr = li0Var2.k0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.lg lgVar = li0Var2.S;
                if (lgVar != null) {
                    lgVar.getLocationOnScreen(iArr);
                    int i9 = iArr[0];
                    int width = li0Var2.S.getWidth();
                    org.telegram.ui.Components.lg lgVar2 = li0Var2.S;
                    lgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.ll.D(6.0f, width - lgVar2.m(), i9);
                    li0Var2.T.setScaleX(li0Var2.S.getScaleX());
                    li0Var2.T.setScaleY(li0Var2.S.getScaleY());
                    break;
                }
                break;
        }
    }
}
