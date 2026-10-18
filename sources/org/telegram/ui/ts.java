package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ gt b;

    public /* synthetic */ ts(gt gtVar, int i10) {
        this.a = i10;
        this.b = gtVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                gt gtVar = this.b;
                gtVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = gtVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    gtVar.z.removeView(gtVar.C);
                    gtVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                break;
        }
    }
}
