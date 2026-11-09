package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class t0 extends m3 {
    public final /* synthetic */ ViewTreeObserver S;
    public final /* synthetic */ k0 T;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(long j3, String str, long j10, g6 g6Var, ViewTreeObserver viewTreeObserver, k0 k0Var) {
        super(j3, str, j10, g6Var);
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
