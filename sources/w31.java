// default package

import android.content.Context;
import android.text.Editable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class w31 extends it3 {
    public final /* synthetic */ byte F;
    public final /* synthetic */ y31 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w31(y31 y31Var, Context context, String str, int i, wjb wjbVar, byte b) {
        super(context, str, false, false, i, wjbVar);
        this.F = b;
        switch (b) {
            case 1:
                this.G = y31Var;
                super(context, str, true, false, i, wjbVar);
                break;
            default:
                this.G = y31Var;
                break;
        }
    }

    @Override // it3
    public final void a(boolean z) {
        va vaVar;
        va vaVar2;
        byte b = this.F;
        y31 y31Var = this.G;
        switch (b) {
            case 0:
                if (z && (vaVar = y31Var.a) != null) {
                    vaVar.z0(2);
                    break;
                }
                break;
            default:
                if (z && (vaVar2 = y31Var.a) != null) {
                    vaVar2.z0(3);
                    break;
                }
                break;
        }
    }

    @Override // it3
    public final void b(Editable editable) {
        byte b = this.F;
        y31 y31Var = this.G;
        switch (b) {
            case 0:
                y31Var.n.c(y31Var.s.getText().toString(), y31Var.w.getText().toString());
                y31Var.f0(true);
                break;
            default:
                y31Var.n.c(y31Var.s.getText().toString(), y31Var.w.getText().toString());
                y31Var.f0(true);
                break;
        }
    }
}
