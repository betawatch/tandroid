// default package

import java.io.FileInputStream;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final class p9a implements s8a {
    public final z9a a;

    public p9a(z9a z9aVar) {
        z9aVar.getClass();
        this.a = z9aVar;
    }

    @Override // s8a
    public final Object e() {
        return new o9a(this.a.a(null), null, null);
    }

    @Override // s8a
    public final void n(Object obj, o8c o8cVar) {
        byte[] bytes = qw5.d.b(o9a.Companion.serializer(), (o9a) obj).getBytes(kk1.a);
        bytes.getClass();
        o8cVar.a.write(bytes);
    }

    @Override // s8a
    public final Object q(FileInputStream fileInputStream) {
        try {
            qw5 qw5Var = qw5.d;
            String str = new String(sud.b(fileInputStream), kk1.a);
            sjf sjfVar = qw5Var.b;
            return (o9a) qw5Var.a(o9a.Companion.serializer(), str);
        } catch (Exception e) {
            throw new zx2("Cannot parse session data", e);
        }
    }
}
