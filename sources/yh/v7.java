package yh;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.x81;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class v7 extends x81 {
    public final Context a;
    public final int b;
    public final boolean c;
    public final int d;
    public final org.telegram.ui.ActionBar.d6 e;
    public final long f;
    public bm0 g;
    public li.m h;
    public final ArrayList i = new ArrayList();

    public v7(Context context, int i10, boolean z10, long j3, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        this.a = context;
        this.b = i10;
        this.c = z10;
        this.d = i11;
        this.e = d6Var;
        this.f = j3;
        i();
    }

    @Override // org.telegram.ui.Components.x81
    public final void b(View view, int i10, int i11) {
        bm0 bm0Var = this.g;
        if (bm0Var != null) {
            bm0Var.L(view);
        }
    }

    @Override // org.telegram.ui.Components.x81
    public final View d(int i10) {
        u7 u7Var = new u7(this.a, this.c, this.f, i10, this.b, this.d, this.e);
        if (this.g != null) {
            u7Var.setClipChildren(false);
            u7Var.setClipToPadding(false);
            c71 c71Var = u7Var.a;
            c71Var.setClipToPadding(false);
            c71Var.t1(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), false);
            c71Var.f3.r = false;
            c71Var.setCaptureSectionsDecoratorAllowed(true);
            c71Var.setOverScrollMode(0);
            li.m mVar = this.h;
            if (mVar != null) {
                mVar.b(c71Var);
            }
        }
        return u7Var;
    }

    @Override // org.telegram.ui.Components.x81
    public final int e() {
        return this.i.size();
    }

    @Override // org.telegram.ui.Components.x81
    public final CharSequence g(int i10) {
        int h = h(i10);
        return h != 0 ? h != 1 ? h != 2 ? "" : LocaleController.getString(R.string.StarsTransactionsOutgoing) : LocaleController.getString(R.string.StarsTransactionsIncoming) : LocaleController.getString(R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.x81
    public final int h(int i10) {
        if (i10 < 0) {
            return 0;
        }
        ArrayList arrayList = this.i;
        if (i10 >= arrayList.size()) {
            return 0;
        }
        return ((g61) arrayList.get(i10)).z;
    }

    public final void i() {
        ArrayList arrayList = this.i;
        arrayList.clear();
        int i10 = this.b;
        long j3 = this.f;
        if (j3 == 0) {
            t5 y3 = t5.y(i10, this.c);
            arrayList.add(g61.C(0));
            if (y3.O(1)) {
                arrayList.add(g61.C(1));
            }
            if (y3.O(2)) {
                arrayList.add(g61.C(2));
                return;
            }
            return;
        }
        o g10 = o.g(i10);
        arrayList.add(g61.C(0));
        if (!g10.k(j3).a[1].isEmpty()) {
            arrayList.add(g61.C(1));
        }
        if (g10.k(j3).a[2].isEmpty()) {
            return;
        }
        arrayList.add(g61.C(2));
    }
}
