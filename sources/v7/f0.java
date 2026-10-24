package v7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.wf;
import z7.zf;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public abstract class f0 {
    public static zzd a(bc.e eVar) {
        cc.b bVar = (cc.b) rb.g.c().a(cc.b.class);
        cc.f fVar = (cc.f) bVar.a.R0(eVar);
        Executor executor = (Executor) bVar.b.a.get();
        wf b10 = zf.b();
        zzd zzdVar = new zzd(fVar, executor);
        m.s3 s3Var = new m.s3();
        s3Var.c = fb.b;
        z4.b bVar2 = new z4.b();
        bVar2.b = eVar.a();
        bVar2.a = gb.b;
        s3Var.d = new ce(bVar2);
        rb.m.a.execute(new com.google.android.gms.internal.cast.p(b10, new a5.a(s3Var, 1), hb.N4, b10.c(), 8));
        return zzdVar;
    }
}
