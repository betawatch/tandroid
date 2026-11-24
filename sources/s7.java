// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class s7 extends gn {
    public final /* synthetic */ byte e0;
    public final /* synthetic */ Object f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(Runnable runnable) {
        super(false, true, true, true, false);
        this.e0 = (byte) 2;
        this.f0 = runnable;
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        byte b = this.e0;
        Object obj = this.f0;
        switch (b) {
            case 0:
                ((w7) obj).invalidate();
                break;
            case 1:
                ((w7) obj).invalidate();
                break;
            default:
                ((Runnable) obj).run();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s7(w7 w7Var, byte b) {
        super(false, true, true);
        this.e0 = b;
        this.f0 = w7Var;
    }
}
