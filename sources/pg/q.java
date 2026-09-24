package pg;

import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n81;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class q extends n81 {
    public final /* synthetic */ ai.d1 a;

    public q(ai.d1 d1Var) {
        this.a = d1Var;
    }

    @Override // org.telegram.ui.Components.n81
    public final View d(int i10) {
        ai.d1 d1Var = this.a;
        return i10 != 1 ? i10 != 2 ? (t) d1Var.b : (w) d1Var.d : (s) d1Var.c;
    }

    @Override // org.telegram.ui.Components.n81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.n81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.n81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.n81
    public final void b(View view, int i10, int i11) {
    }
}
