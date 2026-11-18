package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.y61 {
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

    @Override // org.telegram.ui.Components.y61
    public final void b(View view, int i7, int i10) {
        this.f.b.H(view);
    }

    @Override // org.telegram.ui.Components.y61
    public final View d(int i7) {
        return new rd(this.f, this.a, i7, this.b, this.c, new ai.w0(this, i7, 24), this.d);
    }

    @Override // org.telegram.ui.Components.y61
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.y61
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? "" : org.telegram.messenger.gd.M0(2131748160, null) : org.telegram.messenger.gd.M0(2131748161, null);
    }

    @Override // org.telegram.ui.Components.y61
    public final int h(int i7) {
        if (i7 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i7 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.l41) arrayList.get(i7)).A;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        td tdVar = this.f;
        if (!tdVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.l41.D(1));
        }
        if (tdVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.l41.D(0));
    }
}
