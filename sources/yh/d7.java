package yh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.v9;
import org.telegram.ui.dv0;
import org.telegram.ui.tu0;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class d7 extends tu0 {
    public final /* synthetic */ v9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public d7(v9 v9Var, LinearLayout linearLayout, long j3) {
        this.a = v9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.tu0, org.telegram.ui.bv0
    public final dv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        v9 v9Var = this.a;
        ImageReceiver imageReceiver = v9Var.getImageReceiver();
        int[] iArr = new int[2];
        v9Var.getLocationInWindow(iArr);
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
