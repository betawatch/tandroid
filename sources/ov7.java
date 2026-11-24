// default package

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ov7 extends yv1 {
    public final /* synthetic */ jac Gd;
    public final /* synthetic */ xv7 Hd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ov7(xv7 xv7Var, jac jacVar) {
        super(null);
        this.Hd = xv7Var;
        this.Gd = jacVar;
    }

    @Override // yv1
    public final boolean Y7() {
        return false;
    }

    @Override // yv1, f02
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // yv1, lc6
    public final void b(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint;
        TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint2;
        if (messageMedia instanceof TLRPC.TL_messageMediaGeo) {
            tL_mediaAreaGeoPoint2 = new TL_stories.TL_mediaAreaGeoPoint();
            tL_mediaAreaGeoPoint2.geo = messageMedia.geo;
        } else {
            if (!(messageMedia instanceof TLRPC.TL_messageMediaVenue)) {
                return;
            }
            TLRPC.TL_messageMediaVenue tL_messageMediaVenue = (TLRPC.TL_messageMediaVenue) messageMedia;
            long j2 = tL_messageMediaVenue.query_id;
            if (j2 == -1 || j2 == -2) {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint3.flags |= 1;
                }
                Utilities.e.c(new bl7(messageMedia, tL_mediaAreaGeoPoint3, (byte) 16));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        }
        this.Gd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override // org.telegram.ui.ActionBar.d
    public final Activity getParentActivity() {
        return gm.W(this.Hd.getContext());
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final ylb getResourceProvider() {
        return this.Hd.w1;
    }

    @Override // yv1, f02
    public final TLRPC.User h() {
        return z8c.h(this.currentAccount).f();
    }

    @Override // yv1, org.telegram.ui.ActionBar.d
    public final boolean isLightStatusBar() {
        return false;
    }
}
