// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
