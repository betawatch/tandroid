// default package

import android.content.Context;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class xef implements mef {
    public final e06 a;
    public final gef b;

    public xef(Context context, gef gefVar) {
        this.b = gefVar;
        i51 i51Var = i51.e;
        i1c.b(context);
        g1c c = i1c.a().c(i51Var);
        if (i51.d.contains(new s24("json"))) {
            new e06(new jye(c, (byte) 6));
        }
        this.a = new e06(new jye(c, (byte) 7));
    }

    @Override // mef
    public final void a(qx qxVar) {
        this.b.getClass();
        ((h1c) this.a.get()).a(qxVar.b ? n90.a(qxVar.i()) : new n90(null, qxVar.i(), cj8.b, null), new fyb((byte) 3));
    }
}
