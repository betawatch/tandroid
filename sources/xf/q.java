package xf;

import android.view.View;
import gh.x9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.e71;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class q extends e71 {
    public final /* synthetic */ x9 a;

    public q(x9 x9Var) {
        this.a = x9Var;
    }

    @Override // org.telegram.ui.Components.e71
    public final View d(int i9) {
        x9 x9Var = this.a;
        return i9 != 1 ? i9 != 2 ? (t) x9Var.b : (w) x9Var.d : (s) x9Var.c;
    }

    @Override // org.telegram.ui.Components.e71
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.e71
    public final CharSequence g(int i9) {
        return i9 != 1 ? i9 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.e71
    public final int h(int i9) {
        return i9;
    }

    @Override // org.telegram.ui.Components.e71
    public final void b(View view, int i9, int i10) {
    }
}
