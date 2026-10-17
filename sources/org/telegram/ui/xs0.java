package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class xs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ys0 b;

    public /* synthetic */ xs0(ys0 ys0Var, int i10) {
        this.a = i10;
        this.b = ys0Var;
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
                cu0 cu0Var = photoViewer.E2;
                if (cu0Var != null) {
                    org.telegram.ui.Components.a81 a81Var = photoViewer.F2;
                    if (cu0Var.e != a81Var) {
                        cu0Var.c = false;
                        cu0Var.d = false;
                        if (cu0Var.b) {
                            cu0Var.a++;
                            cu0Var.b = false;
                        }
                        cu0Var.setImageResource(R.color.transparent);
                    }
                    if (a81Var != null) {
                        i2.g0 g0Var = a81Var.d;
                        if (g0Var != null) {
                            try {
                                g0Var.F1();
                                b2.w wVar = g0Var.S;
                                if (wVar != null && (nVar = wVar.I) != null) {
                                    int i10 = nVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = a81Var.p() - a81Var.n();
                        if (!cu0Var.c && !cu0Var.d && !cu0Var.b && p5 < 5250.0f) {
                            Uri uri = a81Var.F;
                            int i11 = cu0Var.a + 1;
                            cu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.w31(cu0Var, uri, i11, 8));
                            cu0Var.b = true;
                        }
                    }
                    cu0Var.e = a81Var;
                    break;
                }
                break;
            case 1:
                cu0.a(this.b.b.E2);
                break;
            default:
                cu0.a(this.b.b.E2);
                break;
        }
    }
}
