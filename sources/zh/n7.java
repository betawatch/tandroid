package zh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.l61;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes4.dex */
public final class n7 extends c91 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.c6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public n7(Context context, int i10, boolean z10, long j10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = c6Var;
        this.f = j10;
        i();
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        return new m7(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.c91
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.c91
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((l61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        long j10 = this.f;
        int i10 = this.b;
        if (j10 == 0) {
            n5 y3 = n5.y(i10, this.c);
            arrayList.add(l61.C(0));
            if (y3.O(1)) {
                arrayList.add(l61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(l61.C(2));
                return;
            }
            return;
        }
        p g10 = p.g(i10);
        arrayList.add(l61.C(0));
        if (!g10.k(j10).a[1].isEmpty()) {
            arrayList.add(l61.C(1));
        }
        if (g10.k(j10).a[2].isEmpty()) {
            return;
        }
        arrayList.add(l61.C(2));
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
    }
}
