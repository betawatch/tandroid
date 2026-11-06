package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class vt extends org.telegram.ui.Components.fw0 {
    public final /* synthetic */ m4.d0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt(Context context, long j3, m4.d0 d0Var) {
        super(context);
        this.I = d0Var;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.i6 i6Var = new org.telegram.ui.Components.i6(false, true, true);
        this.r = i6Var;
        org.telegram.ui.Components.i6 i6Var2 = new org.telegram.ui.Components.i6(false, true, false);
        this.s = i6Var2;
        i6Var.setCallback(this);
        i6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.f6) null);
        w8Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j3 == Long.MAX_VALUE) {
            this.w = org.telegram.messenger.hd.M0(2131752647, null);
            w8Var.g(14);
            imageReceiver.i0(null, w8Var, null);
        } else {
            String H = org.telegram.messenger.m5.H(imageReceiver, w8Var, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).e2(j3));
            this.w = H;
            this.w = org.telegram.messenger.i6.m(H, null, false, null, 0);
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public final void b() {
        m4.d0 d0Var = this.I;
        y6 y6Var = (y6) d0Var.b;
        y6Var.Z.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) d0Var.a).a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
