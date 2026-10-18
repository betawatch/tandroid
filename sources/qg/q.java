package qg;

import ai.uc;
import android.view.View;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.u81;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class q extends u81 {
    public final /* synthetic */ uc a;

    public q(uc ucVar) {
        this.a = ucVar;
    }

    @Override // org.telegram.ui.Components.u81
    public final View d(int i10) {
        uc ucVar = this.a;
        return i10 != 1 ? i10 != 2 ? (t) ucVar.b : (w) ucVar.d : (s) ucVar.c;
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
