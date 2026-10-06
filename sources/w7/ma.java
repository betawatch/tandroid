package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class ma implements ja {
    public final q9.n a;
    public final ia b;

    public ma(Context context, ia iaVar) {
        this.b = iaVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.a = new q9.n(new v7.a9(c10, 3));
    }

    @Override // w7.ja
    public final void a(n7.z0 z0Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.b;
        iaVar.getClass();
        l5.s sVar = (l5.s) this.a.get();
        iaVar.getClass();
        pa paVar = pa.c;
        v7.k kVar = (v7.k) z0Var.b;
        ((v7.d8) z0Var.c).h = false;
        v7.d8 d8Var = (v7.d8) z0Var.c;
        d8Var.f = Boolean.FALSE;
        kVar.b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(kVar);
            v7.k kVar2 = new v7.k(5);
            paVar.a(kVar2);
            HashMap hashMap = new HashMap((HashMap) kVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) kVar2.c);
            e eVar = (e) kVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ia.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new ia.b("No encoder for ".concat(String.valueOf(k7.class)));
            }
            dVar.a(k7Var, fVar);
            sVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.b, null), new j2.e(20));
        } catch (UnsupportedEncodingException e7) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e7);
        }
    }
}
