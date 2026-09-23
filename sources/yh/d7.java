package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.w9;
import org.telegram.ui.mu0;
import org.telegram.ui.wu0;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes4.dex */
public final class d7 extends mu0 {
    public final /* synthetic */ w9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public d7(w9 w9Var, LinearLayout linearLayout, long j3) {
        this.a = w9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final wu0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        w9 w9Var = this.a;
        ImageReceiver imageReceiver = w9Var.getImageReceiver();
        int[] iArr = new int[2];
        w9Var.getLocationInWindow(iArr);
        wu0 wu0Var = new wu0();
        wu0Var.b = iArr[0];
        wu0Var.c = iArr[1];
        wu0Var.d = this.b;
        wu0Var.m = null;
        wu0Var.a = imageReceiver;
        if (z10) {
            wu0Var.e = imageReceiver.getBitmapSafe();
        }
        wu0Var.h = imageReceiver.getRoundRadius(true);
        wu0Var.f = this.c;
        wu0Var.j = 0;
        wu0Var.i = 0;
        return wu0Var;
    }

    @Override // org.telegram.ui.mu0, org.telegram.ui.uu0
    public final boolean K() {
        return true;
    }
}
