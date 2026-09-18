package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class wc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ jd0 a;

    public wc0(jd0 jd0Var) {
        this.a = jd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        jd0 jd0Var = this.a;
        if (i10 == -1) {
            jd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                jd0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    jd0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = jd0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            jd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
