package sh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.do0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y implements s10 {
    public final /* synthetic */ i0 a;

    public y(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // org.telegram.ui.s10
    public final boolean b(l10 l10Var) {
        return false;
    }

    @Override // org.telegram.ui.s10
    public final void c(MessageObject messageObject) {
        int i10;
        i0 i0Var = this.a;
        p2 p2Var = i0Var.s;
        i10 = ((g3) i0Var).currentAccount;
        p2Var.presentFragment(do0.K(messageObject, i10));
        i0Var.dismiss();
    }

    @Override // org.telegram.ui.s10
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.s10
    public final void a() {
    }

    @Override // org.telegram.ui.s10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
