package xc;

import org.telegram.messenger.zs;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public enum o0 extends a2 {
    public o0() {
        super("BeforeAttributeValue", 36);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        char d = aVar.d();
        s0 s0Var = a2.c0;
        if (d == 0) {
            kVar.m(this);
            kVar.i.e((char) 65533);
            kVar.c = s0Var;
            return;
        }
        if (d != ' ') {
            if (d == '\"') {
                kVar.c = a2.a0;
                return;
            }
            if (d != '`') {
                v vVar = a2.a;
                if (d == 65535) {
                    kVar.l(this);
                    kVar.k();
                    kVar.c = vVar;
                    return;
                }
                if (d == '\t' || d == '\n' || d == '\f' || d == '\r') {
                    return;
                }
                if (d == '&') {
                    aVar.q();
                    kVar.c = s0Var;
                    return;
                }
                if (d == '\'') {
                    kVar.c = a2.b0;
                    return;
                }
                switch (d) {
                    case zs.x0 /* 60 */:
                    case zs.y0 /* 61 */:
                        break;
                    case zs.z0 /* 62 */:
                        kVar.m(this);
                        kVar.k();
                        kVar.c = vVar;
                        break;
                    default:
                        aVar.q();
                        kVar.c = s0Var;
                        break;
                }
                return;
            }
            kVar.m(this);
            kVar.i.e(d);
            kVar.c = s0Var;
        }
    }
}
