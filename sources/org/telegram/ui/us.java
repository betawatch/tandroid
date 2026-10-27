package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                org.telegram.ui.Components.zd0 zd0Var = htVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    htVar.z.removeView(htVar.C);
                    htVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                break;
        }
    }
}
