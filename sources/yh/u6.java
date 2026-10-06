package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.ou0;
import org.telegram.ui.yu0;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class u6 extends ou0 {
    public final /* synthetic */ w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public u6(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.a = w9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final yu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        yu0 yu0Var = new yu0();
        yu0Var.b = iArr[0];
        yu0Var.c = iArr[1];
        yu0Var.d = this.b;
        yu0Var.m = null;
        yu0Var.a = imageReceiver;
        if (z10) {
            yu0Var.e = imageReceiver.getBitmapSafe();
        }
        yu0Var.h = imageReceiver.getRoundRadius(true);
        yu0Var.f = this.c;
        yu0Var.j = 0;
        yu0Var.i = 0;
        return yu0Var;
    }

    @Override // org.telegram.ui.ou0, org.telegram.ui.wu0
    public final boolean K() {
        return true;
    }
}
