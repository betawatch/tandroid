package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.y81;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes4.dex */
public final class f extends y81 {
    public final g[] a = new g[3];
    public final /* synthetic */ Context b;
    public final /* synthetic */ bm0 c;
    public final /* synthetic */ h d;

    public f(h hVar, Context context, bm0 bm0Var) {
        this.d = hVar;
        this.b = context;
        this.c = bm0Var;
    }

    @Override // org.telegram.ui.Components.y81
    public final void b(View view, int i10, int i11) {
        this.c.L(view);
    }

    @Override // org.telegram.ui.Components.y81
    public final View d(int i10) {
        g[] gVarArr = this.a;
        if (gVarArr[i10] == null) {
            gVarArr[i10] = new g(this.d, this.b, i10);
        }
        return gVarArr[i10];
    }

    @Override // org.telegram.ui.Components.y81
    public final int e() {
        return this.a.length;
    }

    @Override // org.telegram.ui.Components.y81
    public final CharSequence g(int i10) {
        return LocaleController.getString(i10 == 1 ? R.string.StarsTransactionsIncoming : i10 == 2 ? R.string.StarsTransactionsOutgoing : R.string.StarsTransactionsAll);
    }

    @Override // org.telegram.ui.Components.y81
    public final int h(int i10) {
        return i10;
    }
}
