package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class sd extends org.telegram.ui.Components.n61 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.e6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ td f;

    public sd(td tdVar, Context context, int i7, long j3, int i10, org.telegram.ui.ActionBar.e6 e6Var) {
        this.f = tdVar;
        this.a = context;
        this.b = i7;
        this.c = i10;
        this.d = e6Var;
        i();
    }

    @Override // org.telegram.ui.Components.n61
    public final void b(View view, int i7, int i10) {
        this.f.b.J(view);
    }

    @Override // org.telegram.ui.Components.n61
    public final View d(int i7) {
        return new rd(this.f, this.a, i7, this.b, this.c, new ai.w0(this, i7, 21), this.d);
    }

    @Override // org.telegram.ui.Components.n61
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.n61
    public final CharSequence g(int i7) {
        int h = h(i7);
        return h != 0 ? h != 1 ? "" : org.telegram.messenger.hd.M0(2131748352, null) : org.telegram.messenger.hd.M0(2131748353, null);
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
        return ((org.telegram.ui.Components.b41) arrayList.get(i7)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        td tdVar = this.f;
        if (!tdVar.n.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.b41.D(1));
        }
        if (tdVar.r.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.b41.D(0));
    }
}
