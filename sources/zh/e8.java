package zh;

import android.os.Bundle;
import org.telegram.ui.co;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
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
