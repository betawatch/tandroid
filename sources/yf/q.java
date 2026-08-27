package yf;

import android.view.View;
import hh.w9;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.Components.g71;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class q extends g71 {
    public final /* synthetic */ w9 a;

    public q(w9 w9Var) {
        this.a = w9Var;
    }

    @Override // org.telegram.ui.Components.g71
    public final View d(int i10) {
        w9 w9Var = this.a;
        return i10 != 1 ? i10 != 2 ? (t) w9Var.b : (w) w9Var.d : (s) w9Var.c;
    }

    @Override // org.telegram.ui.Components.g71
    public final int e() {
        return 3;
    }

    @Override // org.telegram.ui.Components.g71
    public final CharSequence g(int i10) {
        return i10 != 1 ? i10 != 2 ? LocaleController.getString(R.string.PaintPaletteGrid).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSliders).toUpperCase() : LocaleController.getString(R.string.PaintPaletteSpectrum).toUpperCase();
    }

    @Override // org.telegram.ui.Components.g71
    public final int h(int i10) {
        return i10;
    }

    @Override // org.telegram.ui.Components.g71
    public final void b(View view, int i10, int i11) {
    }
}
