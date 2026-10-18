package yh;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.e61;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xb;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes4.dex */
public final class m2 extends e61 {
    public static final /* synthetic */ int a = 0;

    static {
        e61.setup(new m2());
    }

    @Override // org.telegram.ui.Components.e61
    public final void bindView(View view, f61 f61Var, boolean z10, s61 s61Var, a71 a71Var) {
        x90 x90Var = (x90) view;
        x90Var.setGravity(f61Var.z);
        x90Var.setTextColor((int) f61Var.B);
        x90Var.setTextSize(1, f61Var.A);
        x90Var.setTypeface(f61Var.q ? AndroidUtilities.bold() : null);
        int i10 = f61Var.i;
        x90Var.setPadding(i10, 0, i10, f61Var.k);
        x90Var.setText(f61Var.l);
    }

    @Override // org.telegram.ui.Components.e61
    public final View createView(Context context, im0 im0Var, int i10, int i11, d6 d6Var) {
        return new xb(context, 5, null);
    }
}
