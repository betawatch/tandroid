package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ty0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ ty0(SecretMediaViewer secretMediaViewer, int i3) {
        this.a = i3;
        this.b = secretMediaViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        int i10 = 4;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (i3) {
            case 0:
                secretMediaViewer.J0 = null;
                secretMediaViewer.l0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.M = null;
                secretMediaViewer.L = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.g0.i3(new ty0(secretMediaViewer, i10), 50L);
                break;
            case 1:
                ai.c0 c0Var = secretMediaViewer.e;
                if (c0Var != null) {
                    c0Var.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.l0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.M = null;
                    secretMediaViewer.L = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.g0.i3(new ty0(secretMediaViewer, i10), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                bp0 bp0Var = secretMediaViewer.E;
                if (bp0Var != null) {
                    long S = bp0Var.S();
                    long U = secretMediaViewer.E.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.o51 o51Var = secretMediaViewer.P;
                        if (!o51Var.f) {
                            o51Var.h(false, S / U);
                            secretMediaViewer.Q.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.i1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.j1;
                    Arrays.fill(iArr2, 0);
                    bp0 bp0Var2 = secretMediaViewer.E;
                    if (bp0Var2 != null) {
                        long max = Math.max(0L, bp0Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.E.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i11 = iArr[0];
                    String format = i11 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i11 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i11), Integer.valueOf(iArr[1]));
                    int i12 = iArr2[0];
                    String format2 = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr2[1]));
                    org.telegram.ui.ActionBar.k5 k5Var = secretMediaViewer.R;
                    Locale locale = Locale.ROOT;
                    k5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.E.d0()) {
                        org.telegram.messenger.g0.i3(secretMediaViewer.h1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.n(false, true);
                break;
            default:
                org.telegram.messenger.cc ccVar = secretMediaViewer.h0;
                if (ccVar != null) {
                    ccVar.a();
                    secretMediaViewer.h0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                secretMediaViewer.i0 = false;
                break;
        }
    }

    public /* synthetic */ ty0(SecretMediaViewer secretMediaViewer, mq0 mq0Var, int i3) {
        this.a = i3;
        this.b = secretMediaViewer;
    }
}
