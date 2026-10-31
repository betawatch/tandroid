package ph;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class x0 extends r3 {
    public final /* synthetic */ ViewTreeObserver Q;
    public final /* synthetic */ o0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x0(long j10, String str, long j11, p6 p6Var, ViewTreeObserver viewTreeObserver, o0 o0Var) {
        super(j10, str, j11, p6Var);
        this.Q = viewTreeObserver;
        this.R = o0Var;
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onPause() {
        super.onPause();
        this.Q.removeOnPreDrawListener(this.R);
    }

    @Override // org.telegram.ui.ActionBar.k2
    public final void onResume() {
        super.onResume();
        this.Q.addOnPreDrawListener(this.R);
    }
}
