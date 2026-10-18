package v7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.de;
import z7.gb;
import z7.hb;
import z7.ib;
import z7.xf;
import z7.zf;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        cc.f fVar = (cc.f) bVar.a.R0(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        xf b10 = zf.b();
        zzd zzdVar = new zzd(fVar, executor);
        m.s3 s3Var = new m.s3();
        s3Var.c = gb.b;
        xf.c cVar = new xf.c();
        cVar.b = eVar.a();
        cVar.a = hb.b;
        s3Var.d = new de(cVar);
        rb.m.a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a(s3Var, 1), ib.N4, b10.c(), 8));
        return zzdVar;
    }
}
