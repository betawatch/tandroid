package vb;

import v7.c9;
import v7.v8;
import v7.y8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a {
    public final y8 a;
    public final e b;
    public final rb.d c;

    public a(e eVar, rb.d dVar) {
        y8 b10;
        this.b = eVar;
        this.c = dVar;
        String str = true != eVar.g ? "play-services-mlkit-language-id" : "language-id";
        synchronized (c9.class) {
            byte b11 = (byte) (((byte) 1) | 2);
            if (b11 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b11 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b11 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            b10 = c9.b(new v8(str));
        }
        this.a = b10;
    }
}
