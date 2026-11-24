// default package

import android.view.View;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class osc implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ osc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                psc pscVar = (psc) obj;
                pscVar.a.c(!r3.b(), true);
                pscVar.c.setEnabled(pscVar.a.b());
                pscVar.c.animate().alpha(pscVar.a.b() ? 1.0f : 0.5f).start();
                break;
            default:
                ry8 ry8Var = (ry8) ((jo0) obj).e;
                if (!ry8Var.b()) {
                    ry8Var.setProgress(0.0f);
                    ry8Var.d();
                    break;
                }
                break;
        }
    }
}
