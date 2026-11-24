// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class u9 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ s9 c;
    public final /* synthetic */ br2 d;

    public /* synthetic */ u9(br2 br2Var, String str, s9 s9Var, byte b) {
        this.a = b;
        this.d = br2Var;
        this.b = str;
        this.c = s9Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        String str = this.b;
        br2 br2Var = this.d;
        s9 s9Var = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) br2Var.b.get(str);
                if (num == null) {
                    zo4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                br2Var.d.add(str);
                try {
                    br2Var.b(num.intValue(), s9Var, obj);
                    return;
                } catch (Exception e) {
                    br2Var.d.remove(str);
                    throw e;
                }
            default:
                Integer num2 = (Integer) br2Var.b.get(str);
                if (num2 == null) {
                    zo4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                    return;
                }
                br2Var.d.add(str);
                try {
                    br2Var.b(num2.intValue(), s9Var, obj);
                    return;
                } catch (Exception e2) {
                    br2Var.d.remove(str);
                    throw e2;
                }
        }
    }
}
