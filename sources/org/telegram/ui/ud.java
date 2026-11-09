package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ud extends org.telegram.ui.Components.n61 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.g6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ vd f;

    public ud(vd vdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f = vdVar;
        this.a = context;
        this.b = i7;
        this.c = i10;
        this.d = g6Var;
        i();
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        this.f.b.L(view);
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        return new td(this.f, this.a, i7, this.b, this.c, new bg.m0(this, i7, 20), this.d);
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? "" : org.telegram.messenger.id.M0(2131748352, null) : org.telegram.messenger.id.M0(2131748353, null);
    }

    @Override // org.telegram.ui.Components.n61
    public final int h(int i7) {
        if (i7 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i7 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.y31) arrayList.get(i7)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        vd vdVar = this.f;
        if (!vdVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.y31.D(1));
        }
        if (vdVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.y31.D(0));
    }
}
