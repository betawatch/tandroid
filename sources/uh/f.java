package uh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ac;
import org.telegram.messenger.e20;
import org.telegram.messenger.g0;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class f extends th.c {
    public final TLRPC.MessageMedia b;

    public f(TLRPC.MessageMedia messageMedia) {
        this.b = messageMedia;
        this.a.J0(g0.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.f();
            return;
        }
        int min = Math.min(2, (int) Math.ceil(g0.p));
        int i3 = e20.i;
        imageReceiver.s0(ac.p(e20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override // th.c
    public final void c(Canvas canvas, int i3, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i3, i10);
        imageReceiver.h(canvas, null);
    }
}
