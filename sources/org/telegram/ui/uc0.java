package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class uc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ hd0 a;

    public uc0(hd0 hd0Var) {
        this.a = hd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        hd0 hd0Var = this.a;
        if (i10 == -1) {
            hd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                hd0Var.r0(false);
                return;
            } else {
                if (i10 == 6) {
                    hd0Var.q0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = hd0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            hd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
