package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xt0 b;

    public /* synthetic */ wt0(xt0 xt0Var, int i10) {
        this.a = i10;
        this.b = xt0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b2.o oVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                bv0 bv0Var = photoViewer.E2;
                if (bv0Var != null) {
                    org.telegram.ui.Components.h81 h81Var = photoViewer.F2;
                    if (bv0Var.e != h81Var) {
                        bv0Var.c = false;
                        bv0Var.d = false;
                        if (bv0Var.b) {
                            bv0Var.a++;
                            bv0Var.b = false;
                        }
                        bv0Var.setImageResource(R.color.transparent);
                    }
                    if (h81Var != null) {
                        i2.h0 h0Var = h81Var.d;
                        if (h0Var != null) {
                            try {
                                h0Var.F1();
                                b2.x xVar = h0Var.S;
                                if (xVar != null && (oVar = xVar.I) != null) {
                                    int i10 = oVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = h81Var.p() - h81Var.n();
                        if (!bv0Var.c && !bv0Var.d && !bv0Var.b && p5 < 5250.0f) {
                            Uri uri = h81Var.F;
                            int i11 = bv0Var.a + 1;
                            bv0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new c90(bv0Var, uri, i11, 4));
                            bv0Var.b = true;
                        }
                    }
                    bv0Var.e = h81Var;
                    break;
                }
                break;
            case 1:
                bv0.a(this.b.b.E2);
                break;
            default:
                bv0.a(this.b.b.E2);
                break;
        }
    }
}
