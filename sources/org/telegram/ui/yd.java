package org.telegram.ui;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yd extends org.telegram.ui.Components.q71 {
    public final Context a;
    public final int b;
    public final int c;
    public final org.telegram.ui.ActionBar.c6 d;
    public final ArrayList e = new ArrayList();
    public final /* synthetic */ zd f;

    public yd(zd zdVar, Context context, int i10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.f = zdVar;
        this.a = context;
        this.b = i10;
        this.c = i11;
        this.d = c6Var;
        i();
    }

    @Override // org.telegram.ui.Components.q71
    public final View d(int i10) {
        return new xd(this.f, this.a, i10, this.b, this.c, new bg.f(this, i10, 19), this.d);
    }

    @Override // org.telegram.ui.Components.q71
    public final int e() {
        return this.e.size();
    }

    @Override // org.telegram.ui.Components.q71
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? "" : LocaleController.getString(R.string.MonetizationTransactionsTON) : LocaleController.getString(R.string.MonetizationTransactionsStars);
    }

    @Override // org.telegram.ui.Components.q71
    public final int h(int i10) {
        if (i10 < 0) {
            return 1;
        }
        ArrayList arrayList = this.e;
        if (i10 >= arrayList.size()) {
            return 1;
        }
        return ((org.telegram.ui.Components.w41) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.e;
        arrayList.clear();
        zd zdVar = this.f;
        if (!zdVar.h.isEmpty()) {
            arrayList.add(org.telegram.ui.Components.w41.C(1));
        }
        if (zdVar.n.isEmpty()) {
            return;
        }
        arrayList.add(org.telegram.ui.Components.w41.C(0));
    }

    @Override // org.telegram.ui.Components.q71
    public final void b(View view, int i10, int i11) {
    }
}
