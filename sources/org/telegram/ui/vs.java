package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kt b;

    public /* synthetic */ vs(kt ktVar, int i10) {
        this.a = i10;
        this.b = ktVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                kt ktVar = this.b;
                ktVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.rc0 rc0Var = ktVar.C;
                if (rc0Var != null) {
                    rc0Var.a();
                    ktVar.z.removeView(ktVar.C);
                    ktVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.er.h).start();
                break;
        }
    }
}
