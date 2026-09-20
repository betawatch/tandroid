package xh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.k90;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wb;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class p2 extends v51 {
    public static final /* synthetic */ int a = 0;

    static {
        v51.setup(new p2());
    }

    @Override // org.telegram.ui.Components.v51
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        k90 k90Var = (k90) view;
        k90Var.setGravity(w51Var.z);
        k90Var.setTextColor((int) w51Var.B);
        k90Var.setTextSize(1, w51Var.A);
        k90Var.setTypeface(w51Var.q ? AndroidUtilities.bold() : null);
        int i10 = w51Var.i;
        k90Var.setPadding(i10, 0, i10, w51Var.k);
        k90Var.setText(w51Var.l);
    }

    @Override // org.telegram.ui.Components.v51
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, f6 f6Var) {
        return new wb(context, 5, null);
    }
}
