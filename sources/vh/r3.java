package vh;

import android.app.Activity;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.e20;
import org.telegram.messenger.k20;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.un;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class r3 extends un {
    public final /* synthetic */ k20 kd;
    public final /* synthetic */ b4 ld;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r3(b4 b4Var, k20 k20Var) {
        super(null);
        this.ld = b4Var;
        this.kd = k20Var;
    }

    @Override // org.telegram.ui.un
    public final boolean O9() {
        return false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.gg, org.telegram.ui.Components.s40
    public final long a() {
        return 0L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // org.telegram.ui.un, org.telegram.ui.sb0
    public final void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
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
            long j11 = tL_messageMediaVenue.query_id;
            if (j11 == -1 || j11 == -2) {
                TL_stories.TL_mediaAreaGeoPoint tL_mediaAreaGeoPoint3 = new TL_stories.TL_mediaAreaGeoPoint();
                tL_mediaAreaGeoPoint3.geo = messageMedia.geo;
                TL_stories.TL_geoPointAddress tL_geoPointAddress = tL_messageMediaVenue.geoAddress;
                tL_mediaAreaGeoPoint3.address = tL_geoPointAddress;
                if (tL_geoPointAddress != null) {
                    tL_mediaAreaGeoPoint3.flags |= 1;
                }
                Utilities.e.c(new r0(4, messageMedia, tL_mediaAreaGeoPoint3));
                tL_mediaAreaGeoPoint = tL_mediaAreaGeoPoint3;
            } else {
                TL_stories.TL_inputMediaAreaVenue tL_inputMediaAreaVenue = new TL_stories.TL_inputMediaAreaVenue();
                tL_inputMediaAreaVenue.query_id = tL_messageMediaVenue.query_id;
                tL_inputMediaAreaVenue.result_id = tL_messageMediaVenue.result_id;
                tL_mediaAreaGeoPoint = tL_inputMediaAreaVenue;
            }
            tL_mediaAreaGeoPoint2 = tL_mediaAreaGeoPoint;
        }
        this.kd.a(messageMedia, tL_mediaAreaGeoPoint2);
    }

    @Override // org.telegram.ui.ActionBar.k2, org.telegram.ui.Components.s40
    public final Activity getParentActivity() {
        return org.telegram.messenger.i0.W(this.ld.getContext());
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.ld.p1;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.ActionBar.k2
    public final boolean isLightStatusBar() {
        return false;
    }

    @Override // org.telegram.ui.un, org.telegram.ui.Components.gg
    public final TLRPC.User j() {
        return e20.i(this.currentAccount).f();
    }
}
