package yh;

import android.os.Bundle;
import org.telegram.ui.bo;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes4.dex */
public final class h8 extends bo {
    public final /* synthetic */ boolean Pc;
    public final /* synthetic */ q8 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8(q8 q8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = q8Var;
        this.Pc = z10;
    }

    @Override // org.telegram.ui.bo, org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Pc) {
            return;
        }
        this.Qc.show();
    }
}
