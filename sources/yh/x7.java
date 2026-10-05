package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.y81;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes4.dex */
public final class x7 extends y81 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f;
    public bm0 g;
    public li.p h;
    public final ArrayList i = new ArrayList();

    public x7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = d6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        bm0 bm0Var = this.g;
        if (bm0Var != null) {
            bm0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        w7 w7Var = new w7(this.a, this.c, this.f, i10, this.b, this.d, this.e);
        if (this.g != null) {
            w7Var.setClipChildren(false);
            w7Var.setClipToPadding(false);
            e71 e71Var = w7Var.a;
            e71Var.setClipToPadding(false);
            e71Var.s1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            e71Var.f3.r = false;
            e71Var.setCaptureSectionsDecoratorAllowed(true);
            e71Var.setOverScrollMode(0);
            li.p pVar = this.h;
            if (pVar != null) {
                pVar.b(e71Var);
            }
        }
        return w7Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((h61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        int i10 = this.b;
        long j3 = this.f;
        if (j3 == 0) {
            u5 y3 = u5.y(i10, this.c);
            arrayList.add(h61.D(0));
            if (y3.O(1)) {
                arrayList.add(h61.D(1));
            }
            if (y3.O(2)) {
                arrayList.add(h61.D(2));
                return;
            }
            return;
        }
        p g10 = p.g(i10);
        arrayList.add(h61.D(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(h61.D(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(h61.D(2));
    }
}
