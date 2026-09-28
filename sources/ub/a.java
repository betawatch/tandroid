package ub;

import v7.d9;
import v7.w8;
import v7.z8;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes.dex */
public final class a {
    public final z8 a;
    public final e b;
    public final qb.d c;

    public a(e eVar, qb.d dVar) {
        z8 c10;
        this.b = eVar;
        this.c = dVar;
        String str = true != eVar.g ? "play-services-mlkit-language-id" : "language-id";
        synchronized (d9.class) {
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
            c10 = d9.c(new w8(str));
        }
        this.a = c10;
    }
}
