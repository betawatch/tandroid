package th;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.g0;
import org.telegram.messenger.hc;
import org.telegram.messenger.m20;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class f extends sh.c {
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
        int i7 = m20.i;
        imageReceiver.s0(hc.p(m20.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override // sh.c
    public final void c(Canvas canvas, int i7, int i10) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.y0(0.0f, 0.0f, i7, i10);
        imageReceiver.h(canvas, null);
    }
}
