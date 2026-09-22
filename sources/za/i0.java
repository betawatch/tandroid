package za;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class i0 {
    public final p0 a;
    public final rd.a b;
    public final String c;
    public int d;
    public z e;

    public i0() {
        h0 h0Var = h0.a;
        this.a = p0.a;
        this.b = h0Var;
        this.c = a();
        this.d = -1;
    }

    public final String a() {
        String uuid = ((UUID) this.b.invoke()).toString();
        kotlin.jvm.internal.i.d(uuid, "uuidGenerator().toString()");
        String lowerCase = xd.j.g(uuid, "-", "").toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.i.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final z b() {
        z zVar = this.e;
        if (zVar != null) {
            return zVar;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
