package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ys0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zs0 b;

    public /* synthetic */ ys0(zs0 zs0Var, int i10) {
        this.a = i10;
        this.b = zs0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L31;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b2.n nVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                du0 du0Var = photoViewer.E2;
                if (du0Var != null) {
                    org.telegram.ui.Components.j81 j81Var = photoViewer.F2;
                    if (du0Var.e != j81Var) {
                        du0Var.c = false;
                        du0Var.d = false;
                        if (du0Var.b) {
                            du0Var.a++;
                            du0Var.b = false;
                        }
                        du0Var.setImageResource(R.color.transparent);
                    }
                    if (j81Var != null) {
                        i2.h0 h0Var = j81Var.d;
                        if (h0Var != null) {
                            try {
                                h0Var.F1();
                                b2.w wVar = h0Var.S;
                                if (wVar != null && (nVar = wVar.I) != null) {
                                    int i10 = nVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = j81Var.p() - j81Var.n();
                        if (!du0Var.c && !du0Var.d && !du0Var.b && p5 < 5250.0f) {
                            Uri uri = j81Var.F;
                            int i11 = du0Var.a + 1;
                            du0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.c41(du0Var, uri, i11, 8));
                            du0Var.b = true;
                        }
                    }
                    du0Var.e = j81Var;
                    break;
                }
                break;
            case 1:
                du0.a(this.b.b.E2);
                break;
            default:
                du0.a(this.b.b.E2);
                break;
        }
    }
}
