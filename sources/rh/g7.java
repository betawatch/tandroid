package rh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.kj;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g9;
import org.telegram.ui.fs0;
import org.telegram.ui.xr0;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class g7 extends xr0 {
    public final /* synthetic */ g9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public g7(g9 g9Var, LinearLayout linearLayout, long j10) {
        this.a = g9Var;
        this.b = linearLayout;
        this.c = j10;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final fs0 E(kj kjVar, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        g9 g9Var = this.a;
        ImageReceiver imageReceiver = g9Var.getImageReceiver();
        int[] iArr = new int[2];
        g9Var.getLocationInWindow(iArr);
        fs0 fs0Var = new fs0();
        fs0Var.b = iArr[0];
        fs0Var.c = iArr[1];
        fs0Var.d = this.b;
        fs0Var.m = null;
        fs0Var.a = imageReceiver;
        if (z10) {
            fs0Var.e = imageReceiver.p();
        }
        fs0Var.h = imageReceiver.E();
        fs0Var.f = this.c;
        fs0Var.j = 0;
        fs0Var.i = 0;
        return fs0Var;
    }

    @Override // org.telegram.ui.xr0, org.telegram.ui.ds0
    public final boolean L() {
        return true;
    }
}
