package pe;

import a4.k;
import ca.i;
import h2.p0;
import kotlin.jvm.internal.j;
import org.telegram.ui.Components.n;
import qe.f;
import qe.h;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class b {
    public static final b d = new b();
    public final p0 a = new p0();
    public final pb.b b = re.a.a;
    public final n c = new n(13);

    public final Object a(ke.a deserializer, String str) {
        byte b10;
        j.e(deserializer, "deserializer");
        this.a.getClass();
        k kVar = new k(str);
        Object l10 = new h2.c(this, qe.j.c, kVar, deserializer.d()).l(deserializer);
        String str2 = (String) kVar.f;
        int i7 = kVar.b;
        while (true) {
            b10 = 10;
            if (i7 != -1 && i7 < str2.length()) {
                int i10 = i7 + 1;
                char charAt = str2.charAt(i7);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    kVar.b = i10;
                    b10 = f.b(charAt);
                    break;
                }
                i7 = i10;
            } else {
                break;
            }
        }
        kVar.b = str2.length();
        if (b10 == 10) {
            return l10;
        }
        k.n(kVar, "Expected EOF after parsing, but had " + str.charAt(kVar.b - 1) + " instead", 0, 6);
        throw null;
    }

    public final String b(ke.a serializer, Object obj) {
        char[] cArr;
        j.e(serializer, "serializer");
        mc.a aVar = new mc.a(1);
        qe.b bVar = qe.b.c;
        synchronized (bVar) {
            hd.d dVar = (hd.d) bVar.b;
            cArr = null;
            char[] cArr2 = (char[]) (dVar.isEmpty() ? null : dVar.removeLast());
            if (cArr2 != null) {
                bVar.a -= cArr2.length;
                cArr = cArr2;
            }
        }
        if (cArr == null) {
            cArr = new char[128];
        }
        aVar.b = cArr;
        try {
            qe.j jVar = qe.j.c;
            h[] hVarArr = new h[qe.j.n.f()];
            this.a.getClass();
            new h(new i(aVar, 8), this, jVar, hVarArr).i(serializer, obj);
            return aVar.toString();
        } finally {
            aVar.b();
        }
    }
}
