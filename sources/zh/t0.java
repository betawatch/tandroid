package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class t0 extends l3 {
    public final /* synthetic */ ViewTreeObserver Q;
    public final /* synthetic */ k0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(long j3, String str, long j10, f6 f6Var, ViewTreeObserver viewTreeObserver, k0 k0Var) {
        super(j3, str, j10, f6Var);
        this.Q = viewTreeObserver;
        this.R = k0Var;
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
