package org.telegram.ui;

import android.content.Context;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class tr extends jg.s1 {
    public final /* synthetic */ ContactsActivity K;

    public tr(ContactsActivity contactsActivity, Context context, a0.h hVar, boolean z9, boolean z10, boolean z11) {
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
