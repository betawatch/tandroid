package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nt b;

    public /* synthetic */ ys(nt ntVar, int i10) {
        this.a = i10;
        this.b = ntVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                nt ntVar = this.b;
                ntVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.qd0 qd0Var = ntVar.C;
                if (qd0Var != null) {
                    qd0Var.a();
                    ntVar.z.removeView(ntVar.C);
                    ntVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.rr.h).start();
                break;
        }
    }
}
