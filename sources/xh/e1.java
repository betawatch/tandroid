package xh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.e6;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class e1 extends i4 {
    public final /* synthetic */ ViewTreeObserver N;
    public final /* synthetic */ p0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(long j3, String str, long j10, e6 e6Var, ViewTreeObserver viewTreeObserver, p0 p0Var) {
        super(j3, str, j10, e6Var);
        this.N = viewTreeObserver;
        this.O = p0Var;
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
