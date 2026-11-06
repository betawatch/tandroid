package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class rr extends jg.s1 {
    public final /* synthetic */ ContactsActivity K;

    public rr(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z9, boolean z10, boolean z11) {
        this.K = contactsActivity;
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.H = new ArrayList();
        this.c = context;
        this.h = hVar;
        this.r = z9;
        this.s = z10;
        this.y = 0;
        this.w = z11;
        this.x = true;
        jg.z1 z1Var = new jg.z1(true);
        this.f = z1Var;
        z1Var.a = new jg.p1(this);
    }

    @Override // jg.s1
    public final void F() {
        if (this.D || this.f.e() || b() != 0) {
            return;
        }
        this.K.c.e(false, true);
    }
}
