package qg;

import ai.uc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.w81;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class r extends w81 {
    public final /* synthetic */ uc a;

    public r(uc ucVar) {
        this.a = ucVar;
    }

    @Override // org.telegram.ui.Components.w81
    public final View d(int i10) {
        uc ucVar = this.a;
        return i10 != 1 ? i10 != 2 ? (u) ucVar.b : (x) ucVar.d : (t) ucVar.c;
    }

    @Override // org.telegram.ui.Components.w81
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.w81
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.w81
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.w81
    public final void b(View view, int i10, int i11) {
    }
}
