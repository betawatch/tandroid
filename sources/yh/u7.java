package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.o81;
import org.telegram.ui.Components.w51;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes4.dex */
public final class u7 extends o81 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.f6 e;
    public final long f;
    public final ArrayList g = new ArrayList();

    public u7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = f6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.o81
    public final View d(int i10) {
        return new t7(this.a, this.c, this.f, i10, this.b, this.d, this.e);
    }

    @Override // org.telegram.ui.Components.o81
    public final int e() {
        return this.g.size();
    }

    @Override // org.telegram.ui.Components.o81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.o81
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.g;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((w51) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.g;
        arrayList.clear();
        int i10 = this.b;
        long j3 = this.f;
        if (j3 == 0) {
            u5 y3 = u5.y(i10, this.c);
            arrayList.add(w51.C(0));
            if (y3.O(1)) {
                arrayList.add(w51.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(w51.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(w51.C(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(w51.C(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(w51.C(2));
    }

    @Override // org.telegram.ui.Components.o81
    public final void b(View view, int i10, int i11) {
    }
}
