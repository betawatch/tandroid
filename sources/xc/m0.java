package xc;

import org.telegram.messenger.at;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes.dex */
public enum m0 extends a2 {
    public m0() {
        super("AttributeName", 34);
    }

    @Override // xc.a2
    public final void d(k kVar, a aVar) {
        String h = aVar.h(a2.G0);
        j jVar = kVar.i;
        String str = jVar.e;
        if (str != null) {
            h = str.concat(h);
        }
        jVar.e = h;
        char d = aVar.d();
        if (d == 0) {
            kVar.m(this);
            kVar.i.d((char) 65533);
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
                if (d != '\t' && d != '\n' && d != '\f' && d != '\r') {
                    switch (d) {
                        case at.x0 /* 60 */:
                            break;
                        case at.y0 /* 61 */:
                            kVar.c = a2.Z;
                            break;
                        case at.z0 /* 62 */:
                            kVar.k();
                            kVar.c = vVar;
                            break;
                        default:
                            kVar.i.d(d);
                            break;
                    }
                    return;
                }
            }
            kVar.m(this);
            kVar.i.d(d);
            return;
        }
        kVar.c = a2.Y;
    }
}
