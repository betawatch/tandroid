// default package

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z79 extends it3 {
    public final /* synthetic */ a89 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z79(a89 a89Var, Context context, wjb wjbVar) {
        super(context, "", true, false, 1024, wjbVar);
        this.F = a89Var;
    }

    @Override // it3
    public final void b(Editable editable) {
        a89 a89Var = this.F;
        u41 u41Var = a89Var.s;
        if (u41Var != null) {
            u41Var.setEnabled(a89Var.d.optional || !TextUtils.isEmpty(a89Var.n.getText()));
        }
    }
}
