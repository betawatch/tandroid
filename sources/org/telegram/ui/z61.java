package org.telegram.ui;

import android.graphics.Bitmap;
import android.graphics.Point;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class z61 extends eq0 {
    public final /* synthetic */ org.telegram.messenger.ye a;
    public final /* synthetic */ a71 b;

    public z61(a71 a71Var, org.telegram.messenger.ye yeVar) {
        this.b = a71Var;
        this.a = yeVar;
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final void o(int i3, org.telegram.messenger.b20 b20Var, boolean z10, int i10, int i11, boolean z11) {
        l71 l71Var = this.b.a;
        org.telegram.messenger.ye yeVar = this.a;
        if (yeVar.h != null) {
            File file = new File(org.telegram.messenger.w7.z(4), Utilities.b.nextInt() + ".jpg");
            Point c12 = org.telegram.messenger.g0.c1();
            Bitmap K = org.telegram.messenger.zb.K(yeVar.h, null, (float) c12.x, (float) c12.y, true);
            try {
                K.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
            } catch (FileNotFoundException e10) {
                e10.printStackTrace();
            }
            File file2 = new File(yeVar.h);
            l71Var.D1 = new lc1(file2, file2, "");
            l71Var.E1 = K;
            l71Var.d2 = 0;
            l71Var.z0.requestLayout();
            l71Var.g1(false);
            l71Var.y1 = null;
            l71Var.n1();
        }
    }

    @Override // org.telegram.ui.eq0, org.telegram.ui.kq0
    public final boolean z() {
        return false;
    }
}
