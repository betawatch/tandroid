package za;

import java.util.Locale;
import java.util.UUID;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final class k0 {
    public final r0 a;
    public final rd.a b;
    public final String c;
    public int d;
    public b0 e;

    public k0() {
        j0 j0Var = j0.a;
        this.a = r0.a;
        this.b = j0Var;
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

    public final b0 b() {
        b0 b0Var = this.e;
        if (b0Var != null) {
            return b0Var;
        }
        kotlin.jvm.internal.i.h("currentSession");
        throw null;
    }
}
