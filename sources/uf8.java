// default package

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class uf8 extends nf8 {
    public final TLRPC.MessageMedia b;

    public uf8(TLRPC.MessageMedia messageMedia) {
        this.b = messageMedia;
        this.a.q0(gm.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.f();
            return;
        }
        int min = Math.min(2, (int) Math.ceil(gm.p));
        int i = vuc.i;
        imageReceiver.a0(gn5.p(vuc.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override // nf8
    public final void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}
