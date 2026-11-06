package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class u0 extends m3 {
    public final /* synthetic */ ViewTreeObserver Q;
    public final /* synthetic */ m0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(long j3, String str, long j10, f6 f6Var, ViewTreeObserver viewTreeObserver, m0 m0Var) {
        super(j3, str, j10, f6Var);
        this.Q = viewTreeObserver;
        this.R = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onPause() {
        super.onPause();
        this.Q.removeOnPreDrawListener(this.R);
    }

    @Override // org.telegram.ui.ActionBar.f2
    public final void onResume() {
        super.onResume();
        this.Q.addOnPreDrawListener(this.R);
    }
}
