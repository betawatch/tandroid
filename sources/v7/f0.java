package v7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.wf;
import z7.yf;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        cc.f fVar = (cc.f) bVar.a.R0(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        wf b10 = yf.b();
        zzd zzdVar = new zzd(fVar, executor);
        m.q3 q3Var = new m.q3();
        q3Var.c = fb.b;
        x9.l lVar = new x9.l();
        lVar.b = eVar.a();
        lVar.a = gb.b;
        q3Var.d = new ce(lVar);
        rb.m.a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a(q3Var, 1), hb.N4, b10.c(), 8));
        return zzdVar;
    }
}
