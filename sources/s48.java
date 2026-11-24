// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s48 extends qn {
    public final /* synthetic */ byte b;
    public final /* synthetic */ v48 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s48(v48 v48Var, byte b) {
        super("thumbAnimationProgress", (byte) 0);
        this.b = b;
        switch (b) {
            case 1:
                this.c = v48Var;
                super("thumbImageVisibleProgress", (byte) 0);
                break;
            default:
                this.c = v48Var;
                break;
        }
    }

    @Override // qn
    public final void c(Object obj, float f) {
        byte b = this.b;
        v48 v48Var = this.c;
        switch (b) {
            case 0:
                v48Var.r = f;
                ((v48) obj).invalidate();
                break;
            default:
                v48Var.n = f;
                ((v48) obj).invalidate();
                break;
        }
    }

    @Override // android.util.Property
    public final Object get(Object obj) {
        byte b = this.b;
        v48 v48Var = this.c;
        switch (b) {
            case 0:
                return Float.valueOf(v48Var.r);
            default:
                return Float.valueOf(v48Var.n);
        }
    }
}
