// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class zh6 implements w17 {
    public w17[] a;

    @Override // w17
    public final iz8 a(Class cls) {
        for (w17 w17Var : this.a) {
            if (w17Var.b(cls)) {
                return w17Var.a(cls);
            }
        }
        fyb.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override // w17
    public final boolean b(Class cls) {
        for (w17 w17Var : this.a) {
            if (w17Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
