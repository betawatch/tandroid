// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class u9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ s9 c;
    public final /* synthetic */ qp2 d;

    public /* synthetic */ u9(qp2 qp2Var, String str, s9 s9Var, byte b) {
        this.a = b;
        this.d = qp2Var;
        this.b = str;
        this.c = s9Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        String str = this.b;
        qp2 qp2Var = this.d;
        s9 s9Var = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) qp2Var.b.get(str);
                if (num == null) {
                    w44.f("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                qp2Var.d.add(str);
                try {
                    qp2Var.b(num.intValue(), s9Var, obj);
                    return;
                } catch (Exception e) {
                    qp2Var.d.remove(str);
                    throw e;
                }
            default:
                Integer num2 = (Integer) qp2Var.b.get(str);
                if (num2 == null) {
                    w44.f("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                qp2Var.d.add(str);
                try {
                    qp2Var.b(num2.intValue(), s9Var, obj);
                    return;
                } catch (Exception e2) {
                    qp2Var.d.remove(str);
                    throw e2;
                }
        }
    }
}
