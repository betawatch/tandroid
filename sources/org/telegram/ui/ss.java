package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ss implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ft b;

    public /* synthetic */ ss(ft ftVar, int i10) {
        this.a = i10;
        this.b = ftVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                ft ftVar = this.b;
                ftVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.yd0 yd0Var = ftVar.C;
                if (yd0Var != null) {
                    yd0Var.a();
                    ftVar.z.removeView(ftVar.C);
                    ftVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
                break;
        }
    }
}
