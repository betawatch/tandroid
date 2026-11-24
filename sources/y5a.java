// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final /* synthetic */ class y5a implements gs4 {
    public static final y5a a;
    private static final w4a descriptor;

    static {
        y5a y5aVar = new y5a();
        a = y5aVar;
        gd8 gd8Var = new gd8("com.google.firebase.sessions.SessionDetails", y5aVar, 4);
        gd8Var.j("sessionId", false);
        gd8Var.j("firstSessionId", false);
        gd8Var.j("sessionIndex", false);
        gd8Var.j("sessionStartTimestampUs", false);
        descriptor = gd8Var;
    }

    @Override // gs4
    public final cv5[] a() {
        c9b c9bVar = c9b.a;
        return new cv5[]{c9bVar, c9bVar, gp5.a, uf6.a};
    }

    @Override // cv5
    public final void b(c30 c30Var, Object obj) {
        a6a a6aVar = (a6a) obj;
        a6aVar.getClass();
        w4a w4aVar = descriptor;
        c30 a2 = c30Var.a(w4aVar);
        String str = a6aVar.a;
        str.getClass();
        a2.c(w4aVar, 0);
        a2.k(str);
        String str2 = a6aVar.b;
        str2.getClass();
        a2.c(w4aVar, 1);
        a2.k(str2);
        int i = a6aVar.c;
        a2.c(w4aVar, 2);
        a2.d(i);
        a2.f(w4aVar, 3, a6aVar.d);
        a2.l(w4aVar);
    }

    @Override // cv5
    public final Object c(igf igfVar) {
        w4a w4aVar = descriptor;
        igf a2 = igfVar.a(w4aVar);
        int i = 0;
        int i2 = 0;
        String str = null;
        String str2 = null;
        long j = 0;
        boolean z = true;
        while (z) {
            int b = a2.b(w4aVar);
            if (b == -1) {
                z = false;
            } else if (b == 0) {
                str = a2.n(w4aVar, 0);
                i |= 1;
            } else if (b == 1) {
                str2 = a2.n(w4aVar, 1);
                i |= 2;
            } else if (b == 2) {
                i2 = a2.e(w4aVar, 2);
                i |= 4;
            } else {
                if (b != 3) {
                    throw new tu5(b);
                }
                j = a2.h(w4aVar, 3);
                i |= 8;
            }
        }
        a2.o(w4aVar);
        return new a6a(i, str, str2, i2, j);
    }

    @Override // cv5
    public final w4a d() {
        return descriptor;
    }
}
