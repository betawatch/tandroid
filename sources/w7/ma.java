package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class ma implements ja {
    public final q9.n a;
    public final ia b;

    public ma(Context context, ia iaVar) {
        this.b = iaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new q9.n(new v7.a9(c10, 2));
        }
        this.a = new q9.n(new v7.a9(c10, 3));
    }

    @Override // w7.ja
    public final void a(n7.a1 a1Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.a.get();
        iaVar.getClass();
        pa paVar = pa.c;
        v7.a6 a6Var = (v7.a6) a1Var.b;
        ((v7.d8) a1Var.c).h = false;
        v7.d8 d8Var = (v7.d8) a1Var.c;
        d8Var.f = Boolean.FALSE;
        a6Var.b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(a6Var);
            v7.a6 a6Var2 = new v7.a6(2);
            paVar.a(a6Var2);
            HashMap hashMap = new HashMap((HashMap) a6Var2.b);
            HashMap hashMap2 = new HashMap((HashMap) a6Var2.c);
            e eVar = (e) a6Var2.d;
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
            rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.b, null), new j2.h(10));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
