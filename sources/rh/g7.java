package rh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.gs0;
import org.telegram.ui.yr0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g7 extends yr0 {
    public final /* synthetic */ g9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public g7(g9 g9Var, LinearLayout linearLayout, long j10) {
        this.a = g9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final gs0 E(jj jjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        g9 g9Var = this.a;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        gs0 gs0Var = new gs0();
        gs0Var.b = iArr[0];
        gs0Var.c = iArr[1];
        gs0Var.d = this.b;
        gs0Var.m = null;
        gs0Var.a = imageReceiver;
        if (z10) {
            gs0Var.e = imageReceiver.p();
        }
        gs0Var.h = imageReceiver.E();
        gs0Var.f = this.c;
        gs0Var.j = 0;
        gs0Var.i = 0;
        return gs0Var;
    }

    @Override // org.telegram.ui.yr0, org.telegram.ui.es0
    public final boolean L() {
        return true;
    }
}
