package rg;

import android.view.View;
import bi.mc;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.m91;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class r extends m91 {
    public final /* synthetic */ mc a;

    public r(mc mcVar) {
        this.a = mcVar;
    }

    @Override // org.telegram.ui.Components.m91
    public final View d(int i10) {
        mc mcVar = this.a;
        return i10 != 1 ? i10 != 2 ? (u) mcVar.b : (x) mcVar.d : (t) mcVar.c;
    }

    @Override // org.telegram.ui.Components.m91
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.m91
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.m91
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.m91
    public final void b(View view, int i10, int i11) {
    }
}
