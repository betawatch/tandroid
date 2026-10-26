package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class b1 extends h4 {
    public final /* synthetic */ ViewTreeObserver Q;
    public final /* synthetic */ m0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(long j10, String str, long j11, u6 u6Var, ViewTreeObserver viewTreeObserver, m0 m0Var) {
        super(j10, str, j11, u6Var);
        this.Q = viewTreeObserver;
        this.R = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onPause() {
        super.onPause();
        this.Q.removeOnPreDrawListener(this.R);
    }

    @Override // org.telegram.ui.ActionBar.r2
    public final void onResume() {
        super.onResume();
        this.Q.addOnPreDrawListener(this.R);
    }
}
