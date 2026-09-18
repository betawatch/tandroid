package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.u9;
import org.telegram.ui.fv0;
import org.telegram.ui.vu0;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class f7 extends vu0 {
    public final /* synthetic */ u9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public f7(u9 u9Var, LinearLayout linearLayout, long j3) {
        this.a = u9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final fv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        u9 u9Var = this.a;
        ImageReceiver imageReceiver = u9Var.getImageReceiver();
        int[] iArr = new int[2];
        u9Var.getLocationInWindow(iArr);
        fv0 fv0Var = new fv0();
        fv0Var.b = iArr[0];
        fv0Var.c = iArr[1];
        fv0Var.d = this.b;
        fv0Var.m = null;
        fv0Var.a = imageReceiver;
        if (z10) {
            fv0Var.e = imageReceiver.getBitmapSafe();
        }
        fv0Var.h = imageReceiver.getRoundRadius(true);
        fv0Var.f = this.c;
        fv0Var.j = 0;
        fv0Var.i = 0;
        return fv0Var;
    }

    @Override // org.telegram.ui.vu0, org.telegram.ui.dv0
    public final boolean K() {
        return true;
    }
}
