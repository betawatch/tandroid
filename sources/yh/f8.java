package yh;

import android.os.Bundle;
import org.telegram.ui.wn;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes4.dex */
public final class f8 extends wn {
    public final /* synthetic */ boolean Pc;
    public final /* synthetic */ o8 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(o8 o8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = o8Var;
        this.Pc = z10;
    }

    @Override // org.telegram.ui.wn, org.telegram.ui.ActionBar.m2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Pc) {
            return;
        }
        this.Qc.show();
    }
}
