package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes.dex */
public final class c1 extends g4 {
    public final /* synthetic */ ViewTreeObserver N;
    public final /* synthetic */ n0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j3, String str, long j10, f6 f6Var, ViewTreeObserver viewTreeObserver, n0 n0Var) {
        super(j3, str, j10, f6Var);
        this.N = viewTreeObserver;
        this.O = n0Var;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onPause() {
        super.onPause();
        this.N.removeOnPreDrawListener(this.O);
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        this.N.addOnPreDrawListener(this.O);
    }
}
