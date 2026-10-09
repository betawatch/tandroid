package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.y9;
import org.telegram.ui.ev0;
import org.telegram.ui.uu0;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class w6 extends uu0 {
    public final /* synthetic */ y9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public w6(y9 y9Var, LinearLayout linearLayout, long j3) {
        this.a = y9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        y9 y9Var = this.a;
        ImageReceiver imageReceiver = y9Var.getImageReceiver();
        int[] iArr = new int[2];
        y9Var.getLocationInWindow(iArr);
        ev0 ev0Var = new ev0();
        ev0Var.b = iArr[0];
        ev0Var.c = iArr[1];
        ev0Var.d = this.b;
        ev0Var.m = null;
        ev0Var.a = imageReceiver;
        if (z10) {
            ev0Var.e = imageReceiver.getBitmapSafe();
        }
        ev0Var.h = imageReceiver.getRoundRadius(true);
        ev0Var.f = this.c;
        ev0Var.j = 0;
        ev0Var.i = 0;
        return ev0Var;
    }

    @Override // org.telegram.ui.uu0, org.telegram.ui.cv0
    public final boolean K() {
        return true;
    }
}
