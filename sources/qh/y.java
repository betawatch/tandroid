package qh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.tn0;
import org.telegram.ui.g10;
import org.telegram.ui.z00;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final class y implements g10 {
    public final /* synthetic */ i0 a;

    public y(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // org.telegram.ui.g10
    public final boolean b(z00 z00Var) {
        return false;
    }

    @Override // org.telegram.ui.g10
    public final void c(MessageObject messageObject) {
        int i10;
        i0 i0Var = this.a;
        o2 o2Var = i0Var.s;
        i10 = ((f3) i0Var).currentAccount;
        o2Var.presentFragment(tn0.K(messageObject, i10));
        i0Var.dismiss();
    }

    @Override // org.telegram.ui.g10
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.g10
    public final void a() {
    }

    @Override // org.telegram.ui.g10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
