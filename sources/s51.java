// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class s51 implements gv5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v51 b;
    public final /* synthetic */ m51 c;

    public /* synthetic */ s51(v51 v51Var, m51 m51Var, byte b) {
        this.a = b;
        this.b = v51Var;
        this.c = m51Var;
    }

    @Override // gv5
    public final void a(int i) {
        byte b = this.a;
        m51 m51Var = this.c;
        v51 v51Var = this.b;
        switch (b) {
            case 0:
                if (i == 4) {
                    v51Var.d.remove(m51Var);
                    v51Var.Y();
                } else {
                    m51Var.b = i;
                    gl.V3(v51Var.b);
                }
                v51Var.getMessagesController().h4.h(v51Var.e, v51Var.d);
                break;
            default:
                m51Var.b = i;
                v51Var.getMessagesController().h4.h(v51Var.e, v51Var.d);
                gl.V3(v51Var.b);
                break;
        }
    }
}
