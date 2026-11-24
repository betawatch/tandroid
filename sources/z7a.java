// default package

import java.io.FileInputStream;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class z7a implements c7a {
    public final j8a a;

    public z7a(j8a j8aVar) {
        j8aVar.getClass();
        this.a = j8aVar;
    }

    @Override // c7a
    public final Object e() {
        return new y7a(this.a.a(null), null, null);
    }

    @Override // c7a
    public final void n(Object obj, p6c p6cVar) {
        byte[] bytes = lw5.d.b(y7a.Companion.serializer(), (y7a) obj).getBytes(jl1.a);
        bytes.getClass();
        p6cVar.a.write(bytes);
    }

    @Override // c7a
    public final Object p(FileInputStream fileInputStream) {
        try {
            lw5 lw5Var = lw5.d;
            String str = new String(fsd.b(fileInputStream), jl1.a);
            dhf dhfVar = lw5Var.b;
            return (y7a) lw5Var.a(y7a.Companion.serializer(), str);
        } catch (Exception e) {
            throw new py2("Cannot parse session data", e);
        }
    }
}
