package sh;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GenericProvider;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final /* synthetic */ class h3 implements org.telegram.ui.ActionBar.c2, l3, GenericProvider {
    public final /* synthetic */ n3 a;

    public /* synthetic */ h3(n3 n3Var) {
        this.a = n3Var;
    }

    @Override // sh.l3
    public void g(boolean z4) {
        n3 n3Var = this.a;
        if (n3Var.J()) {
            return;
        }
        n3Var.G.e(0.0f);
    }

    @Override // org.telegram.ui.ActionBar.c2
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        this.a.b.dismiss();
    }

    @Override // org.telegram.messenger.GenericProvider
    public Object provide(Object obj) {
        return Boolean.valueOf(this.a.b.o1.getKeyboardHeight() >= AndroidUtilities.dp(20.0f));
    }
}
