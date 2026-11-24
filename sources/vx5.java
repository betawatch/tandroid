// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class vx5 implements gu2 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ sa8 b;

    public /* synthetic */ vx5(sa8 sa8Var, byte b) {
        this.a = b;
        this.b = sa8Var;
    }

    @Override // gu2
    public final void accept(Object obj) {
        byte b = this.a;
        sa8 sa8Var = this.b;
        Integer num = (Integer) obj;
        switch (b) {
            case 0:
                sa8Var.m0(num);
                break;
            default:
                sa8Var.l0(num);
                break;
        }
    }
}
