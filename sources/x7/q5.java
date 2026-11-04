package x7;

import b8.cg;
import b8.hg;
import b8.ie;
import b8.kg;
import b8.lb;
import b8.nb;
import b8.ob;
import b8.og;
import com.google.mlkit.vision.segmentation.subject.internal.zzd;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class q5 {
    public static zzd a(wb.d dVar) {
        xb.b bVar = (xb.b) mb.g.c().a(xb.b.class);
        xb.d dVar2 = (xb.d) bVar.a.R0(dVar);
        Executor executor = (Executor) bVar.b.a.get();
        hg e10 = og.e();
        zzd zzdVar = new zzd(dVar2, executor);
        fa.f fVar = new fa.f(1);
        fVar.d = lb.b;
        p4.q qVar = new p4.q();
        qVar.b = dVar.a();
        qVar.a = nb.b;
        fVar.e = new ie(qVar);
        mb.m.a.execute(new cg(e10, new kg(fVar, 1), ob.O4, e10.c(), 0));
        return zzdVar;
    }
}
