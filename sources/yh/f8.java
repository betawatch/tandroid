package yh;

import android.os.Bundle;
import org.telegram.ui.zn;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes4.dex */
public final class f8 extends zn {
    public final /* synthetic */ boolean Pc;
    public final /* synthetic */ o8 Qc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f8(o8 o8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Qc = o8Var;
        this.Pc = z10;
    }

    @Override // org.telegram.ui.zn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Pc) {
            return;
        }
        this.Qc.show();
    }
}
