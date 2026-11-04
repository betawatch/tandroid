package y7;

import android.content.Context;
import b8.df;
import b8.lg;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class na implements ka {
    public final t9.n a;
    public final ja b;

    public na(Context context, ja jaVar) {
        this.b = jaVar;
        l5.a aVar = l5.a.e;
        n5.s.b(context);
        n5.q c2 = n5.s.a().c(aVar);
        if (l5.a.d.contains(new k5.c("json"))) {
            new t9.n(new lg(c2, 4));
        }
        this.a = new t9.n(new lg(c2, 5));
    }

    @Override // y7.ka
    public final void a(w9.b bVar) {
        f fVar;
        ma.d dVar;
        ja jaVar = this.b;
        jaVar.getClass();
        n5.r rVar = (n5.r) this.a.get();
        jaVar.getClass();
        qa qaVar = qa.c;
        p7.d dVar2 = (p7.d) bVar.b;
        ((df) bVar.c).h = false;
        df dfVar = (df) bVar.c;
        dfVar.f = Boolean.FALSE;
        dVar2.b = new m9(dfVar);
        try {
            qa.b();
            l7 l7Var = new l7(dVar2);
            p7.d dVar3 = new p7.d(25);
            qaVar.a(dVar3);
            HashMap hashMap = new HashMap((HashMap) dVar3.b);
            HashMap hashMap2 = new HashMap((HashMap) dVar3.d);
            e eVar = (e) dVar3.c;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                fVar = new f(byteArrayOutputStream, hashMap, hashMap2, eVar);
                dVar = (ma.d) hashMap.get(l7.class);
            } catch (IOException unused) {
            }
            if (dVar == null) {
                throw new ma.b("No encoder for ".concat(String.valueOf(l7.class)));
            }
            dVar.a(l7Var, fVar);
            rVar.a(new k5.a(null, byteArrayOutputStream.toByteArray(), k5.d.b, null), new l2.d(27));
        } catch (UnsupportedEncodingException e10) {
            throw new UnsupportedOperationException("Failed to covert logging to UTF-8 byte array", e10);
        }
    }
}
