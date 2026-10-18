package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final class c1 extends h4 {
    public final /* synthetic */ ViewTreeObserver N;
    public final /* synthetic */ n0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j10, String str, long j11, d6 d6Var, ViewTreeObserver viewTreeObserver, n0 n0Var) {
        super(j10, str, j11, d6Var);
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
