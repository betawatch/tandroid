// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class qe8 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cs5 b;

    public /* synthetic */ qe8(cs5 cs5Var, byte b) {
        this.a = b;
        this.b = cs5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        cs5 cs5Var = this.b;
        switch (b) {
            case 0:
                m21.e();
                cs5Var.r();
                break;
            default:
                m21.e();
                cs5Var.r();
                break;
        }
    }
}
