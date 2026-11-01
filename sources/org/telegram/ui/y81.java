package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class y81 extends xr0 {
    public final /* synthetic */ org.telegram.messenger.ff a;
    public final /* synthetic */ z81 b;

    public y81(z81 z81Var, org.telegram.messenger.ff ffVar) {
        this.b = z81Var;
        this.a = ffVar;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final void o(int i10, org.telegram.messenger.y20 y20Var, boolean z10, int i11, int i12, boolean z11) {
        k91 k91Var = this.b.a;
        org.telegram.messenger.ff ffVar = this.a;
        if (ffVar.h != null) {
            File file = new File(org.telegram.messenger.b8.z(4), Utilities.b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.i0.c1();
            Bitmap K = org.telegram.messenger.ic.K(ffVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            File file2 = new File(ffVar.h);
            k91Var.C1 = new le1(file2, file2, "");
            k91Var.D1 = K;
            k91Var.c2 = 0;
            k91Var.y0.requestLayout();
            k91Var.g1(false);
            k91Var.x1 = null;
            k91Var.n1();
        }
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean z() {
        return false;
    }
}
