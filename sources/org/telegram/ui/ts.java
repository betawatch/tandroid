package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ts implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ht b;

    public /* synthetic */ ts(ht htVar, int i10) {
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
                org.telegram.ui.Components.bd0 bd0Var = htVar.C;
                if (bd0Var != null) {
                    bd0Var.a();
                    htVar.z.removeView(htVar.C);
                    htVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.jr.h).start();
                break;
        }
    }
}
