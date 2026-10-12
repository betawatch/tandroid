package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.z9;
import org.telegram.ui.av0;
import org.telegram.ui.kv0;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class w6 extends av0 {
    public final /* synthetic */ z9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public w6(z9 z9Var, LinearLayout linearLayout, long j10) {
        this.a = z9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final kv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        z9 z9Var = this.a;
        ImageReceiver imageReceiver = z9Var.getImageReceiver();
        int[] iArr = new int[2];
        z9Var.getLocationInWindow(iArr);
        kv0 kv0Var = new kv0();
        kv0Var.b = iArr[0];
        kv0Var.c = iArr[1];
        kv0Var.d = this.b;
        kv0Var.m = null;
        kv0Var.a = imageReceiver;
        if (z10) {
            kv0Var.e = imageReceiver.getBitmapSafe();
        }
        kv0Var.h = imageReceiver.getRoundRadius(true);
        kv0Var.f = this.c;
        kv0Var.j = 0;
        kv0Var.i = 0;
        return kv0Var;
    }

    @Override // org.telegram.ui.av0, org.telegram.ui.iv0
    public final boolean K() {
        return true;
    }
}
