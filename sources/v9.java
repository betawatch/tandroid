// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class v9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ t9 c;
    public final /* synthetic */ jq2 d;

    public /* synthetic */ v9(jq2 jq2Var, String str, t9 t9Var, byte b) {
        this.a = b;
        this.d = jq2Var;
        this.b = str;
        this.c = t9Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        String str = this.b;
        jq2 jq2Var = this.d;
        t9 t9Var = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) jq2Var.b.get(str);
                if (num == null) {
                    xi4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", t9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                jq2Var.d.add(str);
                try {
                    jq2Var.b(num.intValue(), t9Var, obj);
                    return;
                } catch (Exception e) {
                    jq2Var.d.remove(str);
                    throw e;
                }
            default:
                Integer num2 = (Integer) jq2Var.b.get(str);
                if (num2 == null) {
                    xi4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", t9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                jq2Var.d.add(str);
                try {
                    jq2Var.b(num2.intValue(), t9Var, obj);
                    return;
                } catch (Exception e2) {
                    jq2Var.d.remove(str);
                    throw e2;
                }
        }
    }
}
