package w7;

import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;
import z7.ce;
import z7.fb;
import z7.gb;
import z7.hb;
import z7.xf;
import z7.zf;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class w7 {
    public static zzd a(tb.d dVar) {
        ub.b bVar = (ub.b) jb.g.c().a(ub.b.class);
        ub.d dVar2 = (ub.d) bVar.a.R0(dVar);
        Executor executor = (Executor) bVar.b.a.get();
        xf b10 = zf.b();
        zzd zzdVar = new zzd(dVar2, executor);
        m.p3 p3Var = new m.p3();
        p3Var.c = fb.b;
        u9.b bVar2 = new u9.b(11);
        bVar2.c = dVar.a();
        bVar2.b = gb.b;
        p3Var.d = new ce(bVar2);
        jb.m.a.execute(new com.google.android.gms.internal.cast.o(b10, new a5.a(p3Var, 1), hb.N4, b10.c(), 8));
        return zzdVar;
    }
}
