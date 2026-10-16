package v7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.wf;
import z7.zf;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        cc.f fVar = (cc.f) bVar.a.R0(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        wf b10 = zf.b();
        zzd zzdVar = new zzd(fVar, executor);
        m.t3 t3Var = new m.t3();
        t3Var.c = fb.b;
        x9.l lVar = new x9.l();
        lVar.b = eVar.a();
        lVar.a = gb.b;
        t3Var.d = new ce(lVar);
        rb.m.a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a(t3Var, 1), hb.N4, b10.c(), 8));
        return zzdVar;
    }
}
