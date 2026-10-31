package xc;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum l0 extends a2 {
    public l0() {
        super("BeforeAttributeName", 33);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        m0 m0Var = a2.X;
        if (d == 0) {
            kVar.m(this);
            kVar.i.j();
            aVar.q();
            kVar.c = m0Var;
            return;
        }
        if (d != ' ') {
            if (d != '\"' && d != '\'') {
                if (d == '/') {
                    kVar.c = a2.e0;
                    return;
                }
                v vVar = a2.a;
                if (d == 65535) {
                    kVar.l(this);
                    kVar.c = vVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                switch (d) {
                    case zs.x0 /* 60 */:
                    case zs.y0 /* 61 */:
                        break;
                    case zs.z0 /* 62 */:
                        kVar.k();
                        kVar.c = vVar;
                        break;
                    default:
                        kVar.i.j();
                        aVar.q();
                        kVar.c = m0Var;
                        break;
                }
                return;
            }
            kVar.m(this);
            kVar.i.j();
            kVar.i.d(d);
            kVar.c = m0Var;
        }
    }
}
