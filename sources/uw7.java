// default package

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class uw7 extends zu1 {
    public final /* synthetic */ icc Jd;
    public final /* synthetic */ dx7 Kd;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw7(dx7 dx7Var, icc iccVar) {
        super(null);
        this.Kd = dx7Var;
        this.Jd = iccVar;
    }

    @Override // zu1
    public final boolean Y7() {
        return false;
    }

    @Override // zu1, kz1
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // zu1, qc6
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
                Utilities.e.c(new pl7(messageMedia, tL_mediaAreaGeoPoint3, (byte) 13));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        }
        this.Jd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override // org.telegram.ui.ActionBar.e
    public final Activity getParentActivity() {
        return hl.W(this.Kd.getContext());
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final vnb getResourceProvider() {
        return this.Kd.q1;
    }

    @Override // zu1, kz1
    public final TLRPC.User h() {
        return yac.h(this.currentAccount).f();
    }

    @Override // zu1, org.telegram.ui.ActionBar.e
    public final boolean isLightStatusBar() {
        return false;
    }
}
