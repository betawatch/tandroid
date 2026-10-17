package v7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ag;
import z7.ee;
import z7.hb;
import z7.ib;
import z7.jb;
import z7.yf;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        cc.f fVar = (cc.f) bVar.a.R0(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        yf b10 = ag.b();
        zzd zzdVar = new zzd(fVar, executor);
        m.s3 s3Var = new m.s3();
        s3Var.c = hb.b;
        xf.c cVar = new xf.c();
        cVar.b = eVar.a();
        cVar.a = ib.b;
        s3Var.d = new ee(cVar);
        rb.m.a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a(s3Var, 1), jb.N4, b10.c(), 8));
        return zzdVar;
    }
}
