package org.telegram.ui;

import android.R;
import android.net.Uri;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class vq0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b2.u b;

    public /* synthetic */ vq0(b2.u uVar, int i10) {
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
                zr0 zr0Var = photoViewer.E2;
                if (zr0Var != null) {
                    org.telegram.ui.Components.u61 u61Var = photoViewer.F2;
                    if (zr0Var.e != u61Var) {
                        zr0Var.c = false;
                        zr0Var.d = false;
                        if (zr0Var.b) {
                            zr0Var.a++;
                            zr0Var.b = false;
                        }
                        zr0Var.setImageResource(R.color.transparent);
                    }
                    if (u61Var != null) {
                        i2.i0 i0Var = u61Var.d;
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
                        long U = u61Var.U() - u61Var.S();
                        if (!zr0Var.c && !zr0Var.d && !zr0Var.b && U < 5250.0f) {
                            Uri uri = u61Var.F;
                            int i11 = zr0Var.a + 1;
                            zr0Var.a = i11;
                            Utilities.e.c(new org.telegram.ui.Components.ji0(zr0Var, uri, i11, 22));
                            zr0Var.b = true;
                        }
                    }
                    zr0Var.e = u61Var;
                    break;
                }
                break;
            case 1:
                zr0.a(((PhotoViewer) this.b.c).E2);
                break;
            default:
                zr0.a(((PhotoViewer) this.b.c).E2);
                break;
        }
    }
}
