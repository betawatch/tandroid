package qg;

import ai.tc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class r extends u81 {
    public final /* synthetic */ tc a;

    public r(tc tcVar) {
        this.a = tcVar;
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        tc tcVar = this.a;
        return i10 != 1 ? i10 != 2 ? (u) tcVar.b : (x) tcVar.d : (t) tcVar.c;
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
