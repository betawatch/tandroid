// default package

import java.io.FileInputStream;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class x5a implements a5a {
    public final h6a a;

    public x5a(h6a h6aVar) {
        h6aVar.getClass();
        this.a = h6aVar;
    }

    @Override // a5a
    public final Object e() {
        return new w5a(this.a.a(null), null, null);
    }

    @Override // a5a
    public final void i(Object obj, p4c p4cVar) {
        byte[] bytes = lu5.d.b(w5a.Companion.serializer(), (w5a) obj).getBytes(bk1.a);
        bytes.getClass();
        p4cVar.a.write(bytes);
    }

    @Override // a5a
    public final Object m(FileInputStream fileInputStream) {
        try {
            lu5 lu5Var = lu5.d;
            String str = new String(cqd.b(fileInputStream), bk1.a);
            cff cffVar = lu5Var.b;
            return (w5a) lu5Var.a(w5a.Companion.serializer(), str);
        } catch (Exception e) {
            throw new fx2("Cannot parse session data", e);
        }
    }
}
