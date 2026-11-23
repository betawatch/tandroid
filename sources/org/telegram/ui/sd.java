package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.c71 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.i6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ td f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.i6 i6Var) {
        this.f = tdVar;
        this.a = context;
        this.b = i7;
        this.c = i10;
        this.d = i6Var;
        i();
    }

    @Override // org.telegram.ui.Components.c71
    public final void b(View view, int i7, int i10) {
        this.f.b.J(view);
    }

    @Override // org.telegram.ui.Components.c71
    public final View d(int i7) {
        return new rd(this.f, this.a, i7, this.b, this.c, new ai.u0(this, i7, 26), this.d);
    }

    @Override // org.telegram.ui.Components.c71
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.c71
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? "" : org.telegram.messenger.gd.N0(2131748159, null) : org.telegram.messenger.gd.N0(2131748160, null);
    }

    @Override // org.telegram.ui.Components.c71
    public final int h(int i7) {
        if (i7 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i7 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.n41) arrayList.get(i7)).A;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        td tdVar = this.f;
        if (!tdVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.n41.D(1));
        }
        if (tdVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.n41.D(0));
    }
}
