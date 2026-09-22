package yh;

import android.os.Bundle;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class g8 extends bo {
    public final /* synthetic */ boolean Pc;
    public final /* synthetic */ p8 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(p8 p8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = p8Var;
        this.Pc = z10;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Pc) {
            return;
        }
        this.Qc.show();
    }
}
