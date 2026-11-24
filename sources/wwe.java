// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class wwe {
    public static npd a(hcb hcbVar) {
        hjd hjdVar = (hjd) cg7.c().a(hjd.class);
        yoe yoeVar = (yoe) hjdVar.a.c(hcbVar);
        Executor executor = (Executor) hjdVar.b.a.get();
        tgf b = bhf.b();
        npd npdVar = new npd(yoeVar, executor);
        ovb ovbVar = new ovb();
        ovbVar.c = x6f.b;
        xab xabVar = new xab((byte) 20, false);
        xabVar.c = hcbVar.a();
        xabVar.b = o7f.b;
        ovbVar.d = new zcf(xabVar);
        mlb.c(1, new de1(b, new ry(ovbVar, 1), r7f.O4, b.c(), (byte) 4));
        return npdVar;
    }
}
