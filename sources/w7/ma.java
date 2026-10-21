package w7;

import android.content.Context;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class ma implements ja {
    public final r9.n a;
    public final ia b;

    public ma(Context context, ia iaVar) {
        this.b = iaVar;
        j5.a aVar = j5.a.e;
        l5.t.b(context);
        l5.r c10 = l5.t.a().c(aVar);
        if (j5.a.d.contains(new i5.c("json"))) {
            new r9.n(new v7.a9(c10, 2));
        }
        this.a = new r9.n(new v7.a9(c10, 3));
    }

    @Override // w7.ja
    public final void a(n2.e eVar) {
        f fVar;
        ja.d dVar;
        ia iaVar = this.b;
        iaVar.getClass();
        l5.s sVar = (l5.s) this.a.get();
        iaVar.getClass();
        pa paVar = pa.c;
        u2.c cVar = (u2.c) eVar.b;
        ((v7.d8) eVar.c).h = false;
        v7.d8 d8Var = (v7.d8) eVar.c;
        d8Var.f = Boolean.FALSE;
        cVar.b = new l9(d8Var);
        try {
            pa.b();
            k7 k7Var = new k7(cVar);
            u2.c cVar2 = new u2.c(6);
            paVar.a(cVar2);
            HashMap hashMap = new HashMap((HashMap) cVar2.b);
            HashMap hashMap2 = new HashMap((HashMap) cVar2.c);
            e eVar2 = (e) cVar2.d;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar2);
                dVar = (ja.d) hashMap.get(k7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new ja.b("No encoder for ".concat(String.valueOf(k7.class)));
            }
            dVar.a(k7Var, fVar);
            sVar.a(new i5.a(null, byteArrayOutputStream.toByteArray(), i5.d.b, null), new k2.f0(4));
        } catch (UnsupportedEncodingException e) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e);
        }
    }
}
