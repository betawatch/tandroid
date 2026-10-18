package yh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.d6;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class b1 extends g4 {
    public final /* synthetic */ ViewTreeObserver N;
    public final /* synthetic */ m0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b1(long j10, String str, long j11, d6 d6Var, ViewTreeObserver viewTreeObserver, m0 m0Var) {
        super(j10, str, j11, d6Var);
        this.N = viewTreeObserver;
        this.O = m0Var;
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
