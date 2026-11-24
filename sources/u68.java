// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class u68 extends ro {
    public final /* synthetic */ byte b;
    public final /* synthetic */ x68 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u68(x68 x68Var, byte b) {
        super("thumbAnimationProgress", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = x68Var;
                super("thumbImageVisibleProgress", (byte) 0);
                break;
            default:
                this.c = x68Var;
                break;
        }
    }

    @Override // ro
    public final void c(Object obj, float f) {
        byte b = this.b;
        x68 x68Var = this.c;
        switch (b) {
            case 0:
                x68Var.r = f;
                ((x68) obj).invalidate();
                break;
            default:
                x68Var.n = f;
                ((x68) obj).invalidate();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        x68 x68Var = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(x68Var.r);
            default:
                return Float.valueOf(x68Var.n);
        }
    }
}
