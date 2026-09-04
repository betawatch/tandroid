package zh;

import android.os.Bundle;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final class e8 extends co {
    public final /* synthetic */ boolean Qc;
    public final /* synthetic */ n8 Rc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e8(n8 n8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Rc = n8Var;
        this.Qc = z10;
    }

    @Override // org.telegram.ui.co, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Qc) {
            return;
        }
        this.Rc.show();
    }
}
