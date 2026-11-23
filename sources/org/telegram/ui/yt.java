package org.telegram.ui;

import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import org.telegram.messenger.ImageReceiver;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class yt extends org.telegram.ui.Components.qw0 {
    public final /* synthetic */ jb.m J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt(Context context, long j3, jb.m mVar) {
        super(context);
        this.J = mVar;
        this.a = new RectF();
        this.f = 0.0f;
        org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(false, true, true);
        this.r = m6Var;
        org.telegram.ui.Components.m6 m6Var2 = new org.telegram.ui.Components.m6(false, true, false);
        this.s = m6Var2;
        m6Var.setCallback(this);
        m6Var2.setCallback(this);
        this.n = Long.valueOf(j3);
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        a9Var.p = 1.5f;
        ImageReceiver imageReceiver = new ImageReceiver(null);
        this.h = imageReceiver;
        imageReceiver.I0(this);
        if (j3 == Long.MAX_VALUE) {
            this.w = org.telegram.messenger.gd.N0(2131752635, null);
            a9Var.g(14);
            imageReceiver.j0(null, a9Var, null);
        } else {
            String H = org.telegram.messenger.n5.H(imageReceiver, a9Var, org.telegram.messenger.mp.u1(org.telegram.messenger.i10.t0).g2(j3));
            this.w = H;
            this.w = org.telegram.messenger.j6.m(H, null, false, null, 0);
        }
    }

    @Override // org.telegram.ui.Components.qw0
    public final void b() {
        jb.m mVar = this.J;
        y6 y6Var = (y6) mVar.c;
        y6Var.a0.dismiss();
        Bundle bundle = new Bundle();
        long j3 = ((s6) mVar.b).a;
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        y6Var.presentFragment(new ProfileActivity(bundle, null));
    }
}
