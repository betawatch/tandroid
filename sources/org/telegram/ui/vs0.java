package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vs0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ws0 b;

    public /* synthetic */ vs0(ws0 ws0Var, int i10) {
        this.a = i10;
        this.b = ws0Var;
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
                au0 au0Var = photoViewer.E2;
                if (au0Var != null) {
                    org.telegram.ui.Components.c81 c81Var = photoViewer.F2;
                    if (au0Var.e != c81Var) {
                        au0Var.c = false;
                        au0Var.d = false;
                        if (au0Var.b) {
                            au0Var.a++;
                            au0Var.b = false;
                        }
                        au0Var.setImageResource(R.color.transparent);
                    }
                    if (c81Var != null) {
                        i2.i0 i0Var = c81Var.d;
                        if (i0Var != null) {
                            try {
                                i0Var.F1();
                                b2.w wVar = i0Var.S;
                                if (wVar != null && (nVar = wVar.I) != null) {
                                    int i10 = nVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long p5 = c81Var.p() - c81Var.n();
                        if (!au0Var.c && !au0Var.d && !au0Var.b && p5 < 5250.0f) {
                            Uri uri = c81Var.F;
                            int i11 = au0Var.a + 1;
                            au0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new org.telegram.ui.Components.y31(au0Var, uri, i11, 8));
                            au0Var.b = true;
                        }
                    }
                    au0Var.e = c81Var;
                    break;
                }
                break;
            case 1:
                au0.a(this.b.b.E2);
                break;
            default:
                au0.a(this.b.b.E2);
                break;
        }
    }
}
