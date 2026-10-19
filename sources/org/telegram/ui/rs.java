package org.telegram.ui;

import android.graphics.Bitmap;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class rs implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ et b;

    public /* synthetic */ rs(et etVar, int i10) {
        this.a = i10;
        this.b = etVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = null;
                break;
            case 1:
                et etVar = this.b;
                etVar.A.setImageBitmap((Bitmap) null);
                org.telegram.ui.Components.zd0 zd0Var = etVar.C;
                if (zd0Var != null) {
                    zd0Var.a();
                    etVar.z.removeView(etVar.C);
                    etVar.C = null;
                    break;
                }
                break;
            default:
                this.b.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
                break;
        }
    }
}
