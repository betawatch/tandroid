package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ wt0 b;

    public /* synthetic */ vt0(wt0 wt0Var, int i10) {
        this.a = i10;
        this.b = wt0Var;
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
                av0 av0Var = photoViewer.E2;
                if (av0Var != null) {
                    org.telegram.ui.Components.i81 i81Var = photoViewer.F2;
                    if (av0Var.e != i81Var) {
                        av0Var.c = false;
                        av0Var.d = false;
                        if (av0Var.b) {
                            av0Var.a++;
                            av0Var.b = false;
                        }
                        av0Var.setImageResource(R.color.transparent);
                    }
                    if (i81Var != null) {
                        i2.h0 h0Var = i81Var.d;
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
                        long p5 = i81Var.p() - i81Var.n();
                        if (!av0Var.c && !av0Var.d && !av0Var.b && p5 < 5250.0f) {
                            Uri uri = i81Var.F;
                            int i11 = av0Var.a + 1;
                            av0Var.a = i11;
                            Utilities.globalQueue.postRunnable(new c90(av0Var, uri, i11, 4));
                            av0Var.b = true;
                        }
                    }
                    av0Var.e = i81Var;
                    break;
                }
                break;
            case 1:
                av0.a(this.b.b.E2);
                break;
            default:
                av0.a(this.b.b.E2);
                break;
        }
    }
}
