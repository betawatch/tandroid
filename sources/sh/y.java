package sh;

import android.view.View;
import org.telegram.messenger.MessageObject;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.co0;
import org.telegram.ui.m10;
import org.telegram.ui.t10;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class y implements t10 {
    public final /* synthetic */ i0 a;

    public y(i0 i0Var) {
        this.a = i0Var;
    }

    @Override // org.telegram.ui.t10
    public final boolean b(m10 m10Var) {
        return false;
    }

    @Override // org.telegram.ui.t10
    public final void c(MessageObject messageObject) {
        int i10;
        i0 i0Var = this.a;
        p2 p2Var = i0Var.s;
        i10 = ((g3) i0Var).currentAccount;
        p2Var.presentFragment(co0.K(messageObject, i10));
        i0Var.dismiss();
    }

    @Override // org.telegram.ui.t10
    public final boolean f() {
        return false;
    }

    @Override // org.telegram.ui.t10
    public final void a() {
    }

    @Override // org.telegram.ui.t10
    public final void d(MessageObject messageObject, View view, int i10) {
    }
}
