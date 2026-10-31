package org.telegram.ui;

import android.view.WindowManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class r01 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ SecretMediaViewer b;

    public /* synthetic */ r01(SecretMediaViewer secretMediaViewer, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        int i11 = 4;
        SecretMediaViewer secretMediaViewer = this.b;
        switch (i10) {
            case 0:
                secretMediaViewer.I0 = null;
                secretMediaViewer.k0 = 0;
                secretMediaViewer.e.setLayerType(0, null);
                secretMediaViewer.e.setVisibility(4);
                secretMediaViewer.s = false;
                secretMediaViewer.L = null;
                secretMediaViewer.K = false;
                secretMediaViewer.j();
                new ArrayList();
                org.telegram.messenger.i0.h3(new r01(secretMediaViewer, i11), 50L);
                break;
            case 1:
                fg.i iVar = secretMediaViewer.e;
                if (iVar != null) {
                    iVar.setLayerType(0, null);
                    secretMediaViewer.e.setVisibility(4);
                    secretMediaViewer.k0 = 0;
                    secretMediaViewer.s = false;
                    secretMediaViewer.L = null;
                    secretMediaViewer.K = false;
                    secretMediaViewer.j();
                    new ArrayList();
                    org.telegram.messenger.i0.h3(new r01(secretMediaViewer, i11), 50L);
                    secretMediaViewer.e.setScaleX(1.0f);
                    secretMediaViewer.e.setScaleY(1.0f);
                    break;
                }
                break;
            case 2:
                uq0 uq0Var = secretMediaViewer.D;
                if (uq0Var != null) {
                    long S = uq0Var.S();
                    long U = secretMediaViewer.D.U();
                    if (U == -9223372036854775807L) {
                        S = 0;
                        U = 0;
                    }
                    if (U > 0) {
                        org.telegram.ui.Components.w61 w61Var = secretMediaViewer.O;
                        if (!w61Var.f) {
                            w61Var.h(false, S / U);
                            secretMediaViewer.P.invalidate();
                        }
                    }
                    int[] iArr = secretMediaViewer.h1;
                    Arrays.fill(iArr, 0);
                    int[] iArr2 = secretMediaViewer.i1;
                    Arrays.fill(iArr2, 0);
                    uq0 uq0Var2 = secretMediaViewer.D;
                    if (uq0Var2 != null) {
                        long max = Math.max(0L, uq0Var2.S()) / 1000;
                        long max2 = Math.max(0L, secretMediaViewer.D.U()) / 1000;
                        iArr[0] = (int) (max / 60);
                        iArr[1] = (int) (max % 60);
                        iArr2[0] = (int) (max2 / 60);
                        iArr2[1] = (int) (max2 % 60);
                    }
                    int i12 = iArr[0];
                    String format = i12 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i12 / 60), Integer.valueOf(iArr[0] % 60), Integer.valueOf(iArr[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i12), Integer.valueOf(iArr[1]));
                    int i13 = iArr2[0];
                    String format2 = i13 >= 60 ? String.format(Locale.ROOT, "%02d:%02d:%02d", Integer.valueOf(i13 / 60), Integer.valueOf(iArr2[0] % 60), Integer.valueOf(iArr2[1])) : String.format(Locale.ROOT, "%02d:%02d", Integer.valueOf(i13), Integer.valueOf(iArr2[1]));
                    org.telegram.ui.ActionBar.u5 u5Var = secretMediaViewer.Q;
                    Locale locale = Locale.ROOT;
                    u5Var.l(format + " / " + format2, false);
                    if (secretMediaViewer.D.d0()) {
                        org.telegram.messenger.i0.h3(secretMediaViewer.g1, 17L);
                        break;
                    }
                }
                break;
            case 3:
                secretMediaViewer.n(false, true);
                break;
            default:
                org.telegram.messenger.kc kcVar = secretMediaViewer.g0;
                if (kcVar != null) {
                    kcVar.a();
                    secretMediaViewer.g0 = null;
                }
                secretMediaViewer.h.w0(null);
                try {
                    if (secretMediaViewer.d.getParent() != null) {
                        ((WindowManager) secretMediaViewer.b.getSystemService("window")).removeView(secretMediaViewer.d);
                    }
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, true);
                }
                secretMediaViewer.h0 = false;
                break;
        }
    }

    public /* synthetic */ r01(SecretMediaViewer secretMediaViewer, gs0 gs0Var, int i10) {
        this.a = i10;
        this.b = secretMediaViewer;
    }
}
