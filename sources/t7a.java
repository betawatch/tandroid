// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class t7a implements hu4 {
    public static final t7a a;
    private static final y6a descriptor;

    static {
        t7a t7aVar = new t7a();
        a = t7aVar;
        if8 if8Var = new if8("com.google.firebase.sessions.settings.SessionConfigs", t7aVar, 5);
        if8Var.j("sessionsEnabled", false);
        if8Var.j("sessionSamplingRate", false);
        if8Var.j("sessionTimeoutSeconds", false);
        if8Var.j("cacheDurationSeconds", false);
        if8Var.j("cacheUpdatedTimeSeconds", false);
        descriptor = if8Var;
    }

    @Override // hu4
    public final cx5[] a() {
        cx5 a2 = yrd.a(hn0.a);
        cx5 a3 = yrd.a(oq3.a);
        gr5 gr5Var = gr5.a;
        return new cx5[]{a2, a3, yrd.a(gr5Var), yrd.a(gr5Var), yrd.a(uh6.a)};
    }

    @Override // cx5
    public final void b(c40 c40Var, Object obj) {
        v7a v7aVar = (v7a) obj;
        v7aVar.getClass();
        y6a y6aVar = descriptor;
        c40 a2 = c40Var.a(y6aVar);
        a2.h(y6aVar, 0, hn0.a, v7aVar.a);
        a2.h(y6aVar, 1, oq3.a, v7aVar.b);
        gr5 gr5Var = gr5.a;
        a2.h(y6aVar, 2, gr5Var, v7aVar.c);
        a2.h(y6aVar, 3, gr5Var, v7aVar.d);
        a2.h(y6aVar, 4, uh6.a, v7aVar.e);
        a2.l(y6aVar);
    }

    @Override // cx5
    public final Object c(jif jifVar) {
        y6a y6aVar = descriptor;
        jif a2 = jifVar.a(y6aVar);
        int i = 0;
        Boolean bool = null;
        Double d = null;
        Integer num = null;
        Integer num2 = null;
        Long l = null;
        boolean z = true;
        while (z) {
            int b = a2.b(y6aVar);
            if (b == -1) {
                z = false;
            } else if (b == 0) {
                bool = (Boolean) a2.j(y6aVar, 0, hn0.a, bool);
                i |= 1;
            } else if (b == 1) {
                d = (Double) a2.j(y6aVar, 1, oq3.a, d);
                i |= 2;
            } else if (b == 2) {
                num = (Integer) a2.j(y6aVar, 2, gr5.a, num);
                i |= 4;
            } else if (b == 3) {
                num2 = (Integer) a2.j(y6aVar, 3, gr5.a, num2);
                i |= 8;
            } else {
                if (b != 4) {
                    throw new tw5(b);
                }
                l = (Long) a2.j(y6aVar, 4, uh6.a, l);
                i |= 16;
            }
        }
        a2.o(y6aVar);
        return new v7a(i, bool, d, num, num2, l);
    }

    @Override // cx5
    public final y6a d() {
        return descriptor;
    }
}
