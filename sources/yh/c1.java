package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.c6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
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
