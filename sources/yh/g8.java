package yh;

import android.os.Bundle;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes4.dex */
public final class g8 extends yn {
    public final /* synthetic */ boolean Kc;
    public final /* synthetic */ p8 Lc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g8(p8 p8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Lc = p8Var;
        this.Kc = z10;
    }

    @Override // org.telegram.ui.yn, org.telegram.ui.ActionBar.n2
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        if (this.Kc) {
            return;
        }
        this.Lc.show();
    }
}
