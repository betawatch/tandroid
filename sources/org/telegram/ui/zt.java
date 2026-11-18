package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class zt extends org.telegram.ui.Components.pw0 {
    public final /* synthetic */ k8.a J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zt(Context context, long j3, k8.a aVar) {
        super(context);
        this.J = aVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.r = m6Var;
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, true, false);
        this.s = m6Var2;
        m6Var.setCallback(this);
        m6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.i6) null);
        b9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j3 == Long.MAX_VALUE) {
            this.w = org.telegram.messenger.gd.M0(2131752636, null);
            b9Var.g(14);
            imageReceiver.i0(null, b9Var, null);
        } else {
            String H = org.telegram.messenger.n5.H(imageReceiver, b9Var, org.telegram.messenger.mp.u1(org.telegram.messenger.j10.t0).g2(j3));
            this.w = H;
            this.w = org.telegram.messenger.j6.m(H, null, false, null, 0);
        }
    }

    @Override // org.telegram.ui.Components.pw0
    public final void b() {
        k8.a aVar = this.J;
        x6 x6Var = (x6) aVar.c;
        x6Var.a0.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((r6) aVar.b).a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        x6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
