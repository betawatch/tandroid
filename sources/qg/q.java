package qg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.a81;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class q extends a81 {
    public final /* synthetic */ bi.v0 a;

    public q(bi.v0 v0Var) {
        this.a = v0Var;
    }

    @Override // org.telegram.ui.Components.a81
    public final View d(int i10) {
        bi.v0 v0Var = this.a;
        return i10 != 1 ? i10 != 2 ? (t) v0Var.b : (w) v0Var.d : (s) v0Var.c;
    }

    @Override // org.telegram.ui.Components.a81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.a81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.a81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.a81
    public final void b(View view, int i10, int i11) {
    }
}
