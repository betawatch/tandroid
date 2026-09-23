package xh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class d1 extends i4 {
    public final /* synthetic */ ViewTreeObserver N;
    public final /* synthetic */ n0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d1(long j3, String str, long j10, d6 d6Var, ViewTreeObserver viewTreeObserver, n0 n0Var) {
        super(j3, str, j10, d6Var);
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
