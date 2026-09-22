package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;
import org.telegram.ui.Components.i51;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class v7 extends a81 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.e6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = e6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        return new u7(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((i51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        int i10 = this.b;
        long j3 = this.f;
        if (j3 == 0) {
            u5 y3 = u5.y(i10, this.c);
            arrayList.add(i51.C(0));
            if (y3.O(1)) {
                arrayList.add(i51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(i51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(i51.C(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(i51.C(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(i51.C(2));
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
    }
}
