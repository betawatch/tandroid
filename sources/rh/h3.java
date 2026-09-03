package rh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements org.telegram.ui.ActionBar.c2, l3, GenericProvider {
    public final /* synthetic */ n3 a;

    public /* synthetic */ h3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // rh.l3
    public void i(boolean z4) {
        n3 n3Var = this.a;
        if (n3Var.J()) {
            return;
        }
        n3Var.G.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.o1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
