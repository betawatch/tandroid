package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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
                if (!ni0Var.l0) {
                    try {
                        Window window = ni0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ni0Var.l0 = true;
                    } catch (Exception e9) {
                        FileLog.e(e9);
                    }
                }
                AndroidUtilities.runOnUIThread(new th0(ni0Var, this.c, 1), 100L);
                break;
            default:
                ni0 ni0Var2 = this.b;
                int[] iArr = ni0Var2.k0;
                AndroidUtilities.showKeyboard(this.c);
                org.telegram.ui.Components.hg hgVar = ni0Var2.S;
                if (hgVar != null) {
                    hgVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ni0Var2.S.getWidth();
                    org.telegram.ui.Components.hg hgVar2 = ni0Var2.S;
                    hgVar2.getHeight();
                    iArr[0] = org.telegram.messenger.rl.C(6.0f, width - hgVar2.m(), i10);
                    ni0Var2.T.setScaleX(ni0Var2.S.getScaleX());
                    ni0Var2.T.setScaleY(ni0Var2.S.getScaleY());
                    break;
                }
                break;
        }
    }
}
