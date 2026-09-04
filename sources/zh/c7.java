package zh;

import android.widget.LinearLayout;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.x9;
import org.telegram.ui.cv0;
import org.telegram.ui.su0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class c7 extends su0 {
    public final /* synthetic */ x9 a;
    public final /* synthetic */ LinearLayout b;
    public final /* synthetic */ long c;

    public c7(x9 x9Var, LinearLayout linearLayout, long j3) {
        this.a = x9Var;
        this.b = linearLayout;
        this.c = j3;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final cv0 E(MessageObject messageObject, TLRPC.FileLocation fileLocation, int i10, boolean z10, boolean z11) {
        x9 x9Var = this.a;
        ImageReceiver imageReceiver = x9Var.getImageReceiver();
        int[] iArr = new int[2];
        x9Var.getLocationInWindow(iArr);
        cv0 cv0Var = new cv0();
        cv0Var.b = iArr[0];
        cv0Var.c = iArr[1];
        cv0Var.d = this.b;
        cv0Var.m = null;
        cv0Var.a = imageReceiver;
        if (z10) {
            cv0Var.e = imageReceiver.getBitmapSafe();
        }
        cv0Var.h = imageReceiver.getRoundRadius(true);
        cv0Var.f = this.c;
        cv0Var.j = 0;
        cv0Var.i = 0;
        return cv0Var;
    }

    @Override // org.telegram.ui.su0, org.telegram.ui.av0
    public final boolean K() {
        return true;
    }
}
