// default package

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q82 extends m53 {
    public final /* synthetic */ t82 j2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q82(t82 t82Var, Context context, vnb vnbVar, int i) {
        super(i, vnbVar, context);
        this.j2 = t82Var;
    }

    @Override // xt3
    public final void G(int i, int i2) {
        if (i2 > i) {
            this.j2.F.y0(0, hl.L(30.0f), null);
        }
    }

    @Override // xt3, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == R.id.menu_delete || i == 16908320) {
            return this.j2.f0();
        }
        if (i == 16908322 || i == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i);
    }
}
