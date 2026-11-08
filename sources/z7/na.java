package z7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class na implements ka {
    public final u9.n a;
    public final ja b;

    public na(Context context, ja jaVar) {
        this.b = jaVar;
        m5.a aVar = m5.a.e;
        o5.s.b(context);
        o5.q c10 = o5.s.a().c(aVar);
        if (m5.a.d.contains(new l5.c("json"))) {
            new u9.n(new a8.xa(c10, 6));
        }
        this.a = new u9.n(new a8.xa(c10, 7));
    }

    @Override // z7.ka
    public final void a(sg.i0 i0Var) {
        f fVar;
        na.d dVar;
        ja jaVar = this.b;
        jaVar.getClass();
        o5.r rVar = (o5.r) this.a.get();
        jaVar.getClass();
        qa qaVar = qa.c;
        y7.d6 d6Var = (y7.d6) i0Var.b;
        ((a8.s9) i0Var.c).h = false;
        a8.s9 s9Var = (a8.s9) i0Var.c;
        s9Var.f = Boolean.FALSE;
        d6Var.a = new m9(s9Var);
        try {
            qa.b();
            l7 l7Var = new l7(d6Var);
            y7.d6 d6Var2 = new y7.d6();
            d6Var2.a = new HashMap();
            d6Var2.b = new HashMap();
            d6Var2.c = e.c;
            qaVar.a(d6Var2);
            HashMap hashMap = new HashMap((HashMap) d6Var2.a);
            HashMap hashMap2 = new HashMap((HashMap) d6Var2.b);
            e eVar = (e) d6Var2.c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (na.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new na.b("No encoder for ".concat(String.valueOf(l7.class)));
            }
            dVar.a(l7Var, fVar);
            rVar.a(new l5.a(null, byteArrayOutputStream.toByteArray(), l5.d.b, null), new ni.a(3));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
