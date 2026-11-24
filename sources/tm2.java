// default package

import java.io.Serializable;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class tm2 implements n8c, yc7 {
    public final /* synthetic */ xm2 a;

    @Override // yc7
    public final void a(String str) {
        xm2 xm2Var = this.a;
        xm2Var.getMessagesController().K0(Long.valueOf(-xm2Var.b));
        xm2Var.showDialog(new qm2(xm2Var.getParentActivity(), null, xm2Var.b, new pz1(xm2Var, str, (byte) 8)));
    }

    @Override // n8c
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        this.a.a0((c4c) obj);
    }
}
