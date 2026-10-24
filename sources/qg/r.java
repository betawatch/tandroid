package qg;

import ai.vc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class r extends d91 {
    public final /* synthetic */ vc a;

    public r(vc vcVar) {
        this.a = vcVar;
    }

    @Override // org.telegram.ui.Components.d91
    public final View d(int i10) {
        vc vcVar = this.a;
        return i10 != 1 ? i10 != 2 ? (u) vcVar.b : (x) vcVar.d : (t) vcVar.c;
    }

    @Override // org.telegram.ui.Components.d91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.d91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.d91
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.d91
    public final void b(View view, int i10, int i11) {
    }
}
