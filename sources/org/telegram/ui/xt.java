package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class xt extends org.telegram.ui.Components.iw0 {
    public final /* synthetic */ k8.a J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xt(Context context, long j3, k8.a aVar) {
        super(context);
        this.J = aVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.r = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, false);
        this.s = g6Var2;
        g6Var.setCallback(this);
        g6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        t8Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j3 == Long.MAX_VALUE) {
            this.w = org.telegram.messenger.hd.M0(2131752647, null);
            t8Var.g(14);
            imageReceiver.i0(null, t8Var, null);
        } else {
            String H = org.telegram.messenger.m5.H(imageReceiver, t8Var, org.telegram.messenger.np.s1(org.telegram.messenger.m10.t0).e2(j3));
            this.w = H;
            this.w = org.telegram.messenger.j6.m(H, null, false, null, 0);
        }
    }

    @Override // org.telegram.ui.Components.iw0
    public final void b() {
        k8.a aVar = this.J;
        y6 y6Var = (y6) aVar.c;
        y6Var.a0.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) aVar.b).a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
