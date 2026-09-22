package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class e7 extends tu0 {
    public final /* synthetic */ u9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public e7(u9 u9Var, LinearLayout linearLayout, long j3) {
        this.a = u9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u9 u9Var = this.a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        dv0 dv0Var = new dv0();
        dv0Var.b = iArr[0];
        dv0Var.c = iArr[1];
        dv0Var.d = this.b;
        dv0Var.m = null;
        dv0Var.a = imageReceiver;
        if (z10) {
            dv0Var.e = imageReceiver.getBitmapSafe();
        }
        dv0Var.h = imageReceiver.getRoundRadius(true);
        dv0Var.f = this.c;
        dv0Var.j = 0;
        dv0Var.i = 0;
        return dv0Var;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final boolean K() {
        return true;
    }
}
