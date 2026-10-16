package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class yc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ ld0 a;

    public yc0(ld0 ld0Var) {
        this.a = ld0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        ld0 ld0Var = this.a;
        if (i10 == -1) {
            ld0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                ld0Var.r0(false);
                return;
            } else {
                if (i10 == 6) {
                    ld0Var.q0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = ld0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            ld0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
