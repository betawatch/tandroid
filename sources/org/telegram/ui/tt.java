package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tt extends org.telegram.ui.Components.ew0 {
    public final /* synthetic */ m2.t J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tt(Context context, long j10, m2.t tVar) {
        super(context);
        this.J = tVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.g6 g6Var = new org.telegram.ui.Components.g6(false, true, true);
        this.r = g6Var;
        org.telegram.ui.Components.g6 g6Var2 = new org.telegram.ui.Components.g6(false, true, false);
        this.s = g6Var2;
        g6Var.setCallback(this);
        g6Var2.setCallback(this);
        this.n = Long.valueOf(j10);
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        u8Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.H0(this);
        if (j10 == Long.MAX_VALUE) {
            this.w = org.telegram.messenger.bd.M0(2131752647, null);
            u8Var.g(14);
            imageReceiver.i0(null, u8Var, null);
        } else {
            String H = org.telegram.messenger.m5.H(imageReceiver, u8Var, org.telegram.messenger.hp.s1(org.telegram.messenger.h10.t0).e2(j10));
            this.w = H;
            this.w = org.telegram.messenger.i6.m(H, null, false, null, 0);
        }
    }

    @Override // org.telegram.ui.Components.ew0
    public final void b() {
        m2.t tVar = this.J;
        z6 z6Var = (z6) tVar.c;
        z6Var.a0.dismiss();
        Bundle bundle = new Bundle();
        long j10 = ((t6) tVar.b).a;
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        z6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
