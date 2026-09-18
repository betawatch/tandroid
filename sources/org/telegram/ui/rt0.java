package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class rt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ st0 b;

    public /* synthetic */ rt0(st0 st0Var, int i10) {
        this.a = i10;
        this.b = st0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0057, code lost:
    
        if (r2 != 7) goto L32;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        b2.j jVar;
        switch (this.a) {
            case 0:
                PhotoViewer photoViewer = this.b.b;
                wu0 wu0Var = photoViewer.E2;
                if (wu0Var != null) {
                    org.telegram.ui.Components.h71 h71Var = photoViewer.F2;
                    if (wu0Var.e != h71Var) {
                        wu0Var.c = false;
                        wu0Var.d = false;
                        if (wu0Var.b) {
                            wu0Var.a++;
                            wu0Var.b = false;
                        }
                        wu0Var.setImageResource(R.color.transparent);
                    }
                    if (h71Var != null) {
                        i2.e0 e0Var = h71Var.d;
                        if (e0Var != null) {
                            try {
                                e0Var.B1();
                                b2.s sVar = e0Var.Q;
                                if (sVar != null && (jVar = sVar.H) != null) {
                                    int i10 = jVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = h71Var.p() - h71Var.n();
                        if (!wu0Var.c && !wu0Var.d && !wu0Var.b && p5 < 5250.0f) {
                            Uri uri = h71Var.F;
                            int i11 = wu0Var.a + 1;
                            wu0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new gm0(wu0Var, uri, i11, 2));
                            wu0Var.b = true;
                        }
                    }
                    wu0Var.e = h71Var;
                    break;
                }
                break;
            case 1:
                wu0.a(this.b.b.E2);
                break;
            default:
                wu0.a(this.b.b.E2);
                break;
        }
    }
}
