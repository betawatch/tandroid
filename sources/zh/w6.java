package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.jv0;
import org.telegram.ui.zu0;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class w6 extends zu0 {
    public final /* synthetic */ z9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public w6(z9 z9Var, LinearLayout linearLayout, long j10) {
        this.a = z9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final jv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        z9 z9Var = this.a;
        ImageReceiver imageReceiver = z9Var.getImageReceiver();
        int[] iArr = new int[2];
        z9Var.getLocationInWindow(iArr);
        jv0 jv0Var = new jv0();
        jv0Var.b = iArr[0];
        jv0Var.c = iArr[1];
        jv0Var.d = this.b;
        jv0Var.m = null;
        jv0Var.a = imageReceiver;
        if (z10) {
            jv0Var.e = imageReceiver.getBitmapSafe();
        }
        jv0Var.h = imageReceiver.getRoundRadius(true);
        jv0Var.f = this.c;
        jv0Var.j = 0;
        jv0Var.i = 0;
        return jv0Var;
    }

    @Override // org.telegram.ui.zu0, org.telegram.ui.hv0
    public final boolean L() {
        return true;
    }
}
