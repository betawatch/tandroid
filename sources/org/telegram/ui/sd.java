package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.f61 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ td f;

    public sd(td tdVar, Context context, int i3, long j10, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f = tdVar;
        this.a = context;
        this.b = i3;
        this.c = i10;
        this.d = e6Var;
        i();
    }

    @Override // org.telegram.ui.Components.f61
    public final void b(View view, int i3, int i10) {
        this.f.b.L(view);
    }

    @Override // org.telegram.ui.Components.f61
    public final View d(int i3) {
        return new rd(this.f, this.a, i3, this.b, this.c, new cg.l0(this, i3, 20), this.d);
    }

    @Override // org.telegram.ui.Components.f61
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.f61
    public final CharSequence g(int i3) {
        int h = h(i3);
        return h != 0 ? h != 1 ? "" : org.telegram.messenger.bd.M0(2131748360, null) : org.telegram.messenger.bd.M0(2131748361, null);
    }

    @Override // org.telegram.ui.Components.f61
    public final int h(int i3) {
        if (i3 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i3 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.r31) arrayList.get(i3)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        td tdVar = this.f;
        if (!tdVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.r31.D(1));
        }
        if (tdVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.r31.D(0));
    }
}
