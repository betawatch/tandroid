package org.telegram.ui;

import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class tg0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kh0 b;
    public final /* synthetic */ EditText c;

    public /* synthetic */ tg0(kh0 kh0Var, EditText editText, int i10) {
        this.a = i10;
        this.b = kh0Var;
        this.c = editText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                kh0 kh0Var = this.b;
                if (!kh0Var.o0) {
                    try {
                        Window window = kh0Var.getWindow();
                        WindowManager.LayoutParams attributes = window.getAttributes();
                        attributes.flags &= -131073;
                        window.setAttributes(attributes);
                        kh0Var.o0 = true;
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                }
                org.telegram.messenger.i0.h3(new tg0(kh0Var, this.c, 1), 100L);
                break;
            default:
                kh0 kh0Var2 = this.b;
                int[] iArr = kh0Var2.n0;
                org.telegram.messenger.i0.J3(this.c);
                org.telegram.ui.Components.zf zfVar = kh0Var2.V;
                if (zfVar != null) {
                    zfVar.getLocationOnScreen(iArr);
                    int i10 = iArr[0];
                    int width = kh0Var2.V.getWidth();
                    org.telegram.ui.Components.zf zfVar2 = kh0Var2.V;
                    zfVar2.getHeight();
                    iArr[0] = org.telegram.messenger.z20.D(6.0f, width - zfVar2.m(), i10);
                    kh0Var2.W.setScaleX(kh0Var2.V.getScaleX());
                    kh0Var2.W.setScaleY(kh0Var2.V.getScaleY());
                    break;
                }
                break;
        }
    }
}
