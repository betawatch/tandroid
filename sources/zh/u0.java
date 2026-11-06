package zh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
