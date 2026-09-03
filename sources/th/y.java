package th;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.do0;
import org.telegram.ui.l10;
import org.telegram.ui.s10;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
        i10 = ((h3) i0Var).currentAccount;
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
