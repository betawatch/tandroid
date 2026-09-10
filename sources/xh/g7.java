package xh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ev0;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class g7 extends tu0 {
    public final /* synthetic */ w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public g7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.a = w9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final ev0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
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

    @Override // org.telegram.ui.tu0, org.telegram.ui.cv0
    public final boolean K() {
        return true;
    }
}
