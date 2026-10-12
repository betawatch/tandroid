package qg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.c91;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class q extends c91 {
    public final /* synthetic */ bi.v0 a;

    public q(bi.v0 v0Var) {
        this.a = v0Var;
    }

    @Override // org.telegram.ui.Components.c91
    public final View d(int i10) {
        bi.v0 v0Var = this.a;
        return i10 != 1 ? i10 != 2 ? (t) v0Var.b : (w) v0Var.d : (s) v0Var.c;
    }

    @Override // org.telegram.ui.Components.c91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.c91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.c91
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.c91
    public final void b(View view, int i10, int i11) {
    }
}
