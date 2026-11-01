package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2.u b;

    public /* synthetic */ tq0(b2.u uVar, int i10) {
        this.a = i10;
        this.b = uVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005d, code lost:
    
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
                PhotoViewer photoViewer = (PhotoViewer) this.b.c;
                yr0 yr0Var = photoViewer.E2;
                if (yr0Var != null) {
                    org.telegram.ui.Components.v61 v61Var = photoViewer.F2;
                    if (yr0Var.e != v61Var) {
                        yr0Var.c = false;
                        yr0Var.d = false;
                        if (yr0Var.b) {
                            yr0Var.a++;
                            yr0Var.b = false;
                        }
                        yr0Var.setImageResource(R.color.transparent);
                    }
                    if (v61Var != null) {
                        i2.i0 i0Var = v61Var.d;
                        if (i0Var != null) {
                            try {
                                i0Var.F1();
                                b2.x xVar = i0Var.S;
                                if (xVar != null && (oVar = xVar.I) != null) {
                                    int i10 = oVar.c;
                                    if (i10 != 6) {
                                        break;
                                    }
                                }
                            } catch (Exception unused) {
                            }
                        }
                        long U = v61Var.U() - v61Var.S();
                        if (!yr0Var.c && !yr0Var.d && !yr0Var.b && U < 5250.0f) {
                            Uri uri = v61Var.F;
                            int i11 = yr0Var.a + 1;
                            yr0Var.a = i11;
                            Utilities.e.c(new org.telegram.ui.Components.ki0(yr0Var, uri, i11, 22));
                            yr0Var.b = true;
                        }
                    }
                    yr0Var.e = v61Var;
                    break;
                }
                break;
            case 1:
                yr0.a(((PhotoViewer) this.b.c).E2);
                break;
            default:
                yr0.a(((PhotoViewer) this.b.c).E2);
                break;
        }
    }
}
