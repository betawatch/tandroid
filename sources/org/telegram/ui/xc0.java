package org.telegram.ui;

import android.content.Intent;
import android.net.Uri;
import org.telegram.messenger.FileLog;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class xc0 extends org.telegram.ui.ActionBar.j {
    public final /* synthetic */ kd0 a;

    public xc0(kd0 kd0Var) {
        this.a = kd0Var;
    }

    @Override // org.telegram.ui.ActionBar.j
    public final void b(int i10) {
        kd0 kd0Var = this.a;
        if (i10 == -1) {
            kd0Var.finishFragment();
            return;
        }
        if (i10 != 1) {
            if (i10 == 5) {
                kd0Var.s0(false);
                return;
            } else {
                if (i10 == 6) {
                    kd0Var.r0(null);
                    return;
                }
                return;
            }
        }
        try {
            TLRPC.GeoPoint geoPoint = kd0Var.B0.messageOwner.media.geo;
            double d = geoPoint.lat;
            double d10 = geoPoint._long;
            kd0Var.getParentActivity().startActivity(new Intent("android.intent.action.VIEW", Uri.parse("geo:" + d + "," + d10 + "?q=" + d + "," + d10)));
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
