package wh;

import android.view.ViewTreeObserver;
import org.telegram.ui.ActionBar.f6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class c1 extends h4 {
    public final /* synthetic */ ViewTreeObserver N;
    public final /* synthetic */ o0 O;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(long j3, String str, long j10, f6 f6Var, ViewTreeObserver viewTreeObserver, o0 o0Var) {
        super(j3, str, j10, f6Var);
        this.N = viewTreeObserver;
        this.O = o0Var;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onPause() {
        super.onPause();
        this.N.removeOnPreDrawListener(this.O);
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onResume() {
        super.onResume();
        this.N.addOnPreDrawListener(this.O);
    }
}
