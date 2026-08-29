package ph;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes4.dex */
public final /* synthetic */ class r1 implements l3, GenericProvider, org.telegram.ui.ActionBar.b2 {
    public final /* synthetic */ p2 a;

    public /* synthetic */ r1(p2 p2Var) {
        this.a = p2Var;
    }

    @Override // ph.l3
    public void f(boolean z10) {
        p2 p2Var = this.a;
        if (p2Var.Z && z10) {
            return;
        }
        p2Var.k(true);
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        this.a.k(false);
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.e.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
