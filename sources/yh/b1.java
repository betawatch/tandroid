package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes4.dex */
public final class b1 extends g4 {
    public final /* synthetic */ ViewTreeObserver Q;
    public final /* synthetic */ m0 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(long j10, String str, long j11, g6 g6Var, ViewTreeObserver viewTreeObserver, m0 m0Var) {
        super(j10, str, j11, g6Var);
        this.Q = viewTreeObserver;
        this.R = m0Var;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onPause() {
        super.onPause();
        this.Q.removeOnPreDrawListener(this.R);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        this.Q.addOnPreDrawListener(this.R);
    }
}
