package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class us implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht b;

    public /* synthetic */ us(ht htVar, int i9) {
        this.a = i9;
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
                org.telegram.ui.Components.mc0 mc0Var = htVar.C;
                if (mc0Var != null) {
                    mc0Var.a();
                    htVar.z.removeView(htVar.C);
                    htVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
                break;
        }
    }
}
