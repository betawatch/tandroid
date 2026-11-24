// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class z61 implements gx5 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ c71 b;
    public final /* synthetic */ t61 c;

    public /* synthetic */ z61(c71 c71Var, t61 t61Var, byte b) {
        this.a = b;
        this.b = c71Var;
        this.c = t61Var;
    }

    @Override // gx5
    public final void a(int i) {
        byte b = this.a;
        t61 t61Var = this.c;
        c71 c71Var = this.b;
        switch (b) {
            case 0:
                if (i == 4) {
                    c71Var.d.remove(t61Var);
                    c71Var.Z();
                } else {
                    t61Var.b = i;
                    gm.V3(c71Var.b);
                }
                c71Var.getMessagesController().h4.h(c71Var.e, c71Var.d);
                break;
            default:
                t61Var.b = i;
                c71Var.getMessagesController().h4.h(c71Var.e, c71Var.d);
                gm.V3(c71Var.b);
                break;
        }
    }
}
