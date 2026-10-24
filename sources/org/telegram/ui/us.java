package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht b;

    public /* synthetic */ us(ht htVar, int i10) {
        this.a = i10;
        this.b = htVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                ht htVar = this.b;
                htVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.ce0 ce0Var = htVar.C;
                if (ce0Var != null) {
                    ce0Var.a();
                    htVar.z.removeView(htVar.C);
                    htVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                break;
        }
    }
}
