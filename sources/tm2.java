// default package

import java.io.Serializable;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
