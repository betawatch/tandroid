// default package

import android.graphics.Point;
import android.graphics.Rect;
import java.io.File;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final class qk9 extends pk9 {
    public final TL_iv.pageBlockPhoto r0;
    public final TLRPC.Photo s0;
    public final TLRPC.PhotoSize t0;
    public final TLRPC.TL_photoStrippedSize u0;

    public qk9(hl9 hl9Var, Rect rect, int i, TL_iv.pageBlockPhoto pageblockphoto, boolean z) {
        super(hl9Var, rect, i, z);
        int i2;
        int i3;
        this.r0 = pageblockphoto;
        TLRPC.Photo u = hl9Var.u(pageblockphoto.photo_id);
        this.s0 = u;
        TLRPC.PhotoSize photoSize = null;
        if (u != null) {
            photoSize = xb4.w(u.sizes, hl.Y0(false), false, null, false);
            this.t0 = photoSize;
            this.u0 = xb4.Q(u.sizes);
        } else {
            this.t0 = null;
            this.u0 = null;
        }
        if (photoSize != null) {
            i2 = photoSize.w;
            i3 = photoSize.h;
        } else {
            i2 = 100;
            i3 = 100;
        }
        int i4 = this.c;
        int max = (int) ((i4 / Math.max(1, i2)) * i3);
        Point point = hl.q;
        int max2 = (int) (Math.max(point.x, point.y) * 0.55f);
        if (max > max2) {
            i4 = (int) ((max2 / Math.max(1, i3)) * i2);
            max = max2;
        }
        this.c0 = i4;
        this.d0 = max;
        l0();
    }

    @Override // pk9
    public final void i0(boolean z) {
        TLRPC.PhotoSize photoSize;
        TLRPC.Photo photo = this.s0;
        if (photo == null || (photoSize = this.t0) == null) {
            return;
        }
        TLRPC.TL_photoStrippedSize tL_photoStrippedSize = this.u0;
        jn5 i = tL_photoStrippedSize != null ? jn5.i(tL_photoStrippedSize, photo) : null;
        hl9 hl9Var = this.a;
        ImageReceiver imageReceiver = this.Y;
        if (z) {
            imageReceiver.Y(null, null, jn5.i(photoSize, photo), null, i, "b1", null, photoSize.size, null, hl9Var.b, 1);
        } else {
            imageReceiver.Y(null, null, null, null, i, "b1", null, photoSize.size, null, hl9Var.b, 1);
        }
    }

    @Override // pk9
    public final boolean k0() {
        TLRPC.PhotoSize photoSize = this.t0;
        if (photoSize != null) {
            hl9 hl9Var = this.a;
            xb4.G(hl9Var.a);
            File J = xb4.J(photoSize, null, true, true);
            xb4.G(hl9Var.a);
            File J2 = xb4.J(photoSize, null, false, true);
            if (!J.exists() && (J2 == null || !J2.exists())) {
                return false;
            }
        }
        return true;
    }

    @Override // pk9
    public final TL_iv.PageBlock m0() {
        return this.r0;
    }

    @Override // pk9
    public final String n0() {
        return xb4.r(null, this.t0);
    }

    @Override // pk9
    public final boolean q0() {
        TL_iv.pageBlockPhoto pageblockphoto = this.r0;
        return pageblockphoto != null && pageblockphoto.spoiler;
    }
}
