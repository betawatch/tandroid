package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class tc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ gd0 a;

    public tc0(gd0 gd0Var) {
        this.a = gd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        gd0 gd0Var = this.a;
        if (i10 == -1) {
            gd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                gd0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    gd0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = gd0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            gd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
