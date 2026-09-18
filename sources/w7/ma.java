package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
    public final void a(n7.z0 z0Var) {
        f fVar;
        ia.d dVar;
        ia iaVar = this.b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.a.get();
        iaVar.getClass();
        pa paVar = pa.c;
        v7.r1 r1Var = (v7.r1) z0Var.b;
        ((v7.d8) z0Var.c).h = false;
        v7.d8 d8Var = (v7.d8) z0Var.c;
        d8Var.f = Boolean.FALSE;
        r1Var.b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(r1Var);
            v7.r1 r1Var2 = new v7.r1(4);
            paVar.a(r1Var2);
            HashMap hashMap = new HashMap((HashMap) r1Var2.b);
            HashMap hashMap2 = new HashMap((HashMap) r1Var2.d);
            e eVar = (e) r1Var2.c;
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
            rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.b, null), new j2.e(20));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
