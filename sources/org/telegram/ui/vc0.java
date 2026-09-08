package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class vc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ id0 a;

    public vc0(id0 id0Var) {
        this.a = id0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
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
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
