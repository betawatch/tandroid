// default package

import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.Editable;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class qd2 implements v02 {
    public final /* synthetic */ xd2 a;

    public qd2(xd2 xd2Var) {
        this.a = xd2Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // v02
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
        xd2 xd2Var = this.a;
        try {
            HashMap<Object, Object> selectedPhotos = xd2Var.R1.d2.getSelectedPhotos();
            if (selectedPhotos.isEmpty()) {
                return;
            }
            jm6 jm6Var = (jm6) selectedPhotos.values().iterator().next();
            String str = jm6Var.h;
            if (str == null) {
                str = jm6Var.I;
            }
            if (str != null) {
                File file = new File(ba4.z(4), Utilities.b.nextInt() + ".jpg");
                Point b1 = gl.b1();
                Bitmap G = fl5.G(str, null, (float) b1.x, (float) b1.y, true);
                G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream(file));
                nd2 nd2Var = new nd2(new lrc(file, file, ""), G, false, (byte) 2);
                nd2Var.X1 = xd2Var.Y1;
                nd2Var.H1 = false;
                nd2Var.G1 = false;
                nd2Var.p1 = 0.2f;
                nd2Var.g1(xd2Var.u1.a());
                nd2Var.K1 = new pd2(this, 0 == true ? 1 : 0);
                xd2Var.Q0(nd2Var);
            }
        } catch (Throwable th) {
            fa4.g(th, true);
        }
    }

    @Override // v02
    public final void P0(Object obj) {
        nd2 nd2Var = new nd2(obj, null, true, (byte) 3);
        xd2 xd2Var = this.a;
        nd2Var.X1 = xd2Var.Y1;
        nd2Var.g1(xd2Var.u1.a());
        nd2Var.K1 = new pd2(this, 1 == true ? 1 : 0);
        xd2Var.Q0(nd2Var);
    }

    @Override // v02
    public final boolean V1() {
        System.currentTimeMillis();
        return true;
    }

    @Override // v02
    public final boolean f0() {
        return false;
    }

    @Override // v02
    public final void z2(vq0 vq0Var) {
        vq0Var.run();
    }

    @Override // v02
    public final void I0() {
    }

    @Override // v02
    public final void y0() {
    }

    @Override // v02
    public final void g1(TLRPC.User user) {
    }

    @Override // v02
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }
}
