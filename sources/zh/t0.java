package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.h6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class t0 extends m3 {
    public final /* synthetic */ ViewTreeObserver S;
    public final /* synthetic */ k0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(long j3, String str, long j10, h6 h6Var, ViewTreeObserver viewTreeObserver, k0 k0Var) {
        super(j3, str, j10, h6Var);
        this.S = viewTreeObserver;
        this.T = k0Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        this.S.removeOnPreDrawListener(this.T);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        this.S.addOnPreDrawListener(this.T);
    }
}
