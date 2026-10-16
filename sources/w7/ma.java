package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class ma implements ja {
    public final r9.n a;
    public final ia b;

    public ma(Context context, ia iaVar) {
        this.b = iaVar;
        j5.a aVar = j5.a.e;
        l5.s.b(context);
        l5.q c10 = l5.s.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 2));
        }
        this.a = new r9.n(new v7.a9(c10, 3));
    }

    @Override // w7.ja
    public final void a(n3.b bVar) {
        f fVar;
        ja.d dVar;
        ia iaVar = this.b;
        iaVar.getClass();
        l5.r rVar = (l5.r) this.a.get();
        iaVar.getClass();
        pa paVar = pa.c;
        u2.c cVar = (u2.c) bVar.b;
        ((v7.d8) bVar.c).h = false;
        v7.d8 d8Var = (v7.d8) bVar.c;
        d8Var.f = Boolean.FALSE;
        cVar.b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(cVar);
            u2.c cVar2 = new u2.c(6);
            paVar.a(cVar2);
            HashMap hashMap = new HashMap((HashMap) cVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) cVar2.c);
            e eVar = (e) cVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ja.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new ja.b("No encoder for ".concat(String.valueOf(k7.class)));
            }
            dVar.a(k7Var, fVar);
            rVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.b, null), new k2.y0(2));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
