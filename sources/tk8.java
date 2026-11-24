// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class tk8 implements gs4 {
    public static final tk8 a;
    private static final w4a descriptor;

    static {
        tk8 tk8Var = new tk8();
        a = tk8Var;
        gd8 gd8Var = new gd8("com.google.firebase.sessions.ProcessData", tk8Var, 2);
        gd8Var.j("pid", false);
        gd8Var.j("uuid", false);
        descriptor = gd8Var;
    }

    @Override // gs4
    public final cv5[] a() {
        return new cv5[]{gp5.a, c9b.a};
    }

    @Override // cv5
    public final void b(c30 c30Var, Object obj) {
        vk8 vk8Var = (vk8) obj;
        vk8Var.getClass();
        w4a w4aVar = descriptor;
        c30 a2 = c30Var.a(w4aVar);
        int i = vk8Var.a;
        a2.c(w4aVar, 0);
        a2.d(i);
        String str = vk8Var.b;
        str.getClass();
        a2.c(w4aVar, 1);
        a2.k(str);
        a2.l(w4aVar);
    }

    @Override // cv5
    public final Object c(igf igfVar) {
        w4a w4aVar = descriptor;
        igf a2 = igfVar.a(w4aVar);
        String str = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        while (z) {
            int b = a2.b(w4aVar);
            if (b == -1) {
                z = false;
            } else if (b == 0) {
                i2 = a2.e(w4aVar, 0);
                i |= 1;
            } else {
                if (b != 1) {
                    throw new tu5(b);
                }
                str = a2.n(w4aVar, 1);
                i |= 2;
            }
        }
        a2.o(w4aVar);
        return new vk8(i, i2, str);
    }

    @Override // cv5
    public final w4a d() {
        return descriptor;
    }
}
