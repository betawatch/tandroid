package qg;

import ai.uc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class r extends u81 {
    public final /* synthetic */ uc a;

    public r(uc ucVar) {
        this.a = ucVar;
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        uc ucVar = this.a;
        return i10 != 1 ? i10 != 2 ? (u) ucVar.b : (x) ucVar.d : (t) ucVar.c;
    }

    @Override // org.telegram.ui.Components.u81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.u81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.u81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.u81
    public final void b(View view, int i10, int i11) {
    }
}
