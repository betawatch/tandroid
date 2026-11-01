package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ih0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ rg0(ih0 ih0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = ih0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ih0 ih0Var = this.b;
                if (!ih0Var.o0) {
                    try {
                        Window window = ih0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        ih0Var.o0 = true;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                org.telegram.messenger.i0.h3(new rg0(ih0Var, this.c, 1), 100L);
                break;
            default:
                ih0 ih0Var2 = this.b;
                int[] iArr = ih0Var2.n0;
                org.telegram.messenger.i0.J3(this.c);
                org.telegram.ui.Components.zf zfVar = ih0Var2.V;
                if (zfVar != null) {
                    zfVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = ih0Var2.V.getWidth();
                    org.telegram.ui.Components.zf zfVar2 = ih0Var2.V;
                    zfVar2.getHeight();
                    iArr[0] = org.telegram.messenger.a30.D(6.0f, width - zfVar2.m(), i10);
                    ih0Var2.W.setScaleX(ih0Var2.V.getScaleX());
                    ih0Var2.W.setScaleY(ih0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
