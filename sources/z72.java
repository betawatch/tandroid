// default package

import android.content.Context;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z72 extends u43 {
    public final /* synthetic */ c82 i2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z72(c82 c82Var, Context context, wjb wjbVar, int i) {
        super(i, wjbVar, context);
        this.i2 = c82Var;
    }

    @Override // gt3
    public final void G(int i, int i2) {
        if (i2 > i) {
            this.i2.F.x0(0, gl.L(30.0f), null);
        }
    }

    @Override // gt3, android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        if (i == R.id.menu_delete || i == 16908320) {
            return this.i2.f0();
        }
        if (i == 16908322 || i == 16908321) {
            return false;
        }
        return super.onTextContextMenuItem(i);
    }
}
