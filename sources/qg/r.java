package qg;

import ai.vc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.d91;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
