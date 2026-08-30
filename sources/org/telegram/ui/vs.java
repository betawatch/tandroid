package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class vs extends tf.c1 {
    public final /* synthetic */ ContactsActivity H;

    public vs(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z4, boolean z10, boolean z11) {
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
        tf.k1 k1Var = new tf.k1(true);
        this.f = k1Var;
        k1Var.a = new tf.a1(this);
    }

    @Override // tf.c1
    public final void F() {
        if (this.y || this.f.e() || h() != 0) {
            return;
        }
        this.H.e.e(false, true);
    }
}
