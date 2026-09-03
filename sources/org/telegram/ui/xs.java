package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class xs extends tf.c1 {
    public final /* synthetic */ ContactsActivity H;

    public xs(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z4, boolean z10, boolean z11) {
        this.H = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.E = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z4;
        this.s = z10;
        this.x = 0;
        this.v = z11;
        this.w = true;
        tf.j1 j1Var = new tf.j1(true);
        this.f = j1Var;
        j1Var.a = new tf.a1(this);
    }

    @Override // tf.c1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.H.e.e(false, true);
    }
}
