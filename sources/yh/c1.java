package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes4.dex */
public final class c1 extends g4 {
    public final /* synthetic */ ViewTreeObserver N;
    public final /* synthetic */ o0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j10, String str, long j11, c6 c6Var, ViewTreeObserver viewTreeObserver, o0 o0Var) {
        super(j10, str, j11, c6Var);
        this.N = viewTreeObserver;
        this.O = o0Var;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onPause() {
        super.onPause();
        this.N.removeOnPreDrawListener(this.O);
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        this.N.addOnPreDrawListener(this.O);
    }
}
