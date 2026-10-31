package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class ka implements ha {
    public final r9.n a;
    public final ga b;

    public ka(Context context, ga gaVar) {
        this.b = gaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.z8(c10, 2));
        }
        this.a = new r9.n(new v7.z8(c10, 3));
    }

    @Override // w7.ha
    public final void a(m5.e eVar) {
        f fVar;
        ja.d dVar;
        ga gaVar = this.b;
        gaVar.getClass();
        l5.r rVar = (l5.r) this.a.get();
        gaVar.getClass();
        na naVar = na.c;
        q5.d dVar2 = (q5.d) eVar.b;
        ((v7.a8) eVar.c).h = false;
        v7.a8 a8Var = (v7.a8) eVar.c;
        a8Var.f = Boolean.FALSE;
        dVar2.b = new j9(a8Var);
        try {
            na.b();
            j7 j7Var = new j7(dVar2);
            q5.d dVar3 = new q5.d(16);
            naVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.c);
            e eVar2 = (e) dVar3.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar2);
                dVar = (ja.d) hashMap.get(j7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new ja.b("No encoder for ".concat(String.valueOf(j7.class)));
            }
            dVar.a(j7Var, fVar);
            rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.b, null), new k2.k0(5));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
