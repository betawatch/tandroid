package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class vc0 extends org.telegram.ui.ActionBar.k {
    public final /* synthetic */ id0 a;

    public vc0(id0 id0Var) {
        this.a = id0Var;
    }

    @Override // org.telegram.ui.ActionBar.k
    public final void b(int i10) {
        id0 id0Var = this.a;
        if (i10 == -1) {
            id0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                id0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    id0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = id0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            id0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
