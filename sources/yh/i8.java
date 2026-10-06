package yh;

import android.os.Bundle;
import org.telegram.ui.yn;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class i8 extends yn {
    public final /* synthetic */ boolean Kc;
    public final /* synthetic */ r8 Lc;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i8(r8 r8Var, Bundle bundle, boolean z10) {
        super(bundle);
        this.Lc = r8Var;
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
