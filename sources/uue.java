// default package

import java.util.concurrent.Executor;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class uue {
    public static knd a(fab fabVar) {
        ghd ghdVar = (ghd) ae7.c().a(ghd.class);
        vme vmeVar = (vme) ghdVar.a.c(fabVar);
        Executor executor = (Executor) ghdVar.b.a.get();
        sef b = aff.b();
        knd kndVar = new knd(vmeVar, executor);
        ntb ntbVar = new ntb();
        ntbVar.c = v4f.b;
        v8b v8bVar = new v8b((byte) 20, false);
        v8bVar.c = fabVar.a();
        v8bVar.b = m5f.b;
        ntbVar.d = new yaf(v8bVar);
        yjb.c(1, new vc1(b, new qx(ntbVar, 1), p5f.O4, b.c(), (byte) 4));
        return kndVar;
    }
}
