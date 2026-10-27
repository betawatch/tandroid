package rg;

import android.view.View;
import bi.mc;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.n91;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class r extends n91 {
    public final /* synthetic */ mc a;

    public r(mc mcVar) {
        this.a = mcVar;
    }

    @Override // org.telegram.ui.Components.n91
    public final View d(int i10) {
        mc mcVar = this.a;
        return i10 != 1 ? i10 != 2 ? (u) mcVar.b : (x) mcVar.d : (t) mcVar.c;
    }

    @Override // org.telegram.ui.Components.n91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.n91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.n91
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.n91
    public final void b(View view, int i10, int i11) {
    }
}
