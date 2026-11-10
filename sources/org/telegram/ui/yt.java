package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class yt extends org.telegram.ui.Components.fw0 {
    public final /* synthetic */ m4.d0 I;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(Context context, long j3, m4.d0 d0Var) {
        super(context);
        this.I = d0Var;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(false, true, true);
        this.r = h6Var;
        org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(false, true, false);
        this.s = h6Var2;
        h6Var.setCallback(this);
        h6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        v8Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j3 == Long.MAX_VALUE) {
            this.w = org.telegram.messenger.id.M0(2131752647, null);
            v8Var.g(14);
            imageReceiver.i0(null, v8Var, null);
        } else {
            String H = org.telegram.messenger.m5.H(imageReceiver, v8Var, org.telegram.messenger.qp.s1(org.telegram.messenger.p10.s0).e2(j3));
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
