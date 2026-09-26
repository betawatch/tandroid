package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.lu0;
import org.telegram.ui.vu0;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes4.dex */
public final class d7 extends lu0 {
    public final /* synthetic */ w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public d7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.a = w9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final vu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        vu0 vu0Var = new vu0();
        vu0Var.b = iArr[0];
        vu0Var.c = iArr[1];
        vu0Var.d = this.b;
        vu0Var.m = null;
        vu0Var.a = imageReceiver;
        if (z10) {
            vu0Var.e = imageReceiver.getBitmapSafe();
        }
        vu0Var.h = imageReceiver.getRoundRadius(true);
        vu0Var.f = this.c;
        vu0Var.j = 0;
        vu0Var.i = 0;
        return vu0Var;
    }

    @Override // org.telegram.ui.lu0, org.telegram.ui.tu0
    public final boolean K() {
        return true;
    }
}
