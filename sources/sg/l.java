package sg;

import android.content.Context;
import org.telegram.messenger.beta.R;
import org.telegram.ui.ActionBar.p6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class l extends d0 {
    public final /* synthetic */ o c2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(o oVar, Context context, p6 p6Var, int i10) {
        super(i10, context, p6Var);
        this.c2 = oVar;
    }

    @Override // org.telegram.ui.Components.mt
    public final void F(int i10, int i11) {
        if (i11 > i10) {
            this.c2.E.w0(0, org.telegram.messenger.i0.L(30.0f), null);
        }
    }

    @Override // org.telegram.ui.Components.mt, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i10) {
        if (i10 == R.id.menu_delete || i10 == 16908320) {
            return this.c2.f0();
        }
        if (i10 == 16908322 || i10 == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i10);
    }
}
