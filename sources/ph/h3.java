package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements org.telegram.ui.ActionBar.b2, l3, GenericProvider {
    public final /* synthetic */ n3 a;

    public /* synthetic */ h3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // ph.l3
    public void f(boolean z10) {
        n3 n3Var = this.a;
        if (n3Var.J()) {
            return;
        }
        n3Var.F.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.n1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
