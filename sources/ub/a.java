package ub;

import v7.c9;
import v7.v8;
import v7.y8;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes.dex */
public final class a {
    public final y8 a;
    public final e b;
    public final qb.d c;

    public a(e eVar, qb.d dVar) {
        y8 e7;
        this.b = eVar;
        this.c = dVar;
        String str = true != eVar.g ? "play-services-mlkit-language-id" : "language-id";
        synchronized (c9.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            e7 = c9.e(new v8(str));
        }
        this.a = e7;
    }
}
