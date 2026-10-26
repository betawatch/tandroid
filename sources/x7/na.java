package x7;

import a8.ff;
import a8.og;
import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class na implements ka {
    public final s9.n a;
    public final ja b;

    public na(Context context, ja jaVar) {
        this.b = jaVar;
        k5.a aVar = k5.a.e;
        m5.t.b(context);
        m5.r c10 = m5.t.a().c(aVar);
        if (k5.a.d.contains(new j5.c("json"))) {
            new s9.n(new og(c10, 4));
        }
        this.a = new s9.n(new og(c10, 5));
    }

    @Override // x7.ka
    public final void a(m4.c cVar) {
        f fVar;
        ka.d dVar;
        ja jaVar = this.b;
        jaVar.getClass();
        m5.s sVar = (m5.s) this.a.get();
        jaVar.getClass();
        qa qaVar = qa.c;
        s4.d dVar2 = (s4.d) cVar.b;
        ((ff) cVar.c).j = false;
        ff ffVar = (ff) cVar.c;
        ffVar.h = Boolean.FALSE;
        dVar2.b = new m9(ffVar);
        try {
            qa.b();
            l7 l7Var = new l7(dVar2);
            s4.d dVar3 = new s4.d(11);
            qaVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.c);
            e eVar = (e) dVar3.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ka.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new ka.b("No encoder for ".concat(String.valueOf(l7.class)));
            }
            dVar.a(l7Var, fVar);
            sVar.a(new j5.a(null, byteArrayOutputStream.toByteArray(), j5.d.b, null), new m4.x0(11));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
