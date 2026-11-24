// default package

import android.content.Context;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class tye implements oxe {
    public final e06 a;
    public final hwe b;

    public tye(Context context, hwe hweVar) {
        this.b = hweVar;
        i51 i51Var = i51.e;
        i1c.b(context);
        g1c c = i1c.a().c(i51Var);
        if (i51.d.contains(new s24("json"))) {
            new e06(new jye(c, (byte) 0));
        }
        this.a = new e06(new jye(c, (byte) 1));
    }

    @Override // oxe
    public final void a(qx qxVar) {
        this.b.getClass();
        ((h1c) this.a.get()).a(qxVar.b ? n90.a(qxVar.i()) : new n90(null, qxVar.i(), cj8.b, null), new fyb((byte) 3));
    }
}
