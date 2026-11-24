// default package

import android.content.Context;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class v0f implements qze {
    public final e26 a;
    public final jye b;

    public v0f(Context context, jye jyeVar) {
        this.b = jyeVar;
        p61 p61Var = p61.e;
        i3c.b(context);
        g3c c = i3c.a().c(p61Var);
        if (p61.d.contains(new d44("json"))) {
            new e26(new l0f(c, (byte) 0));
        }
        this.a = new e26(new l0f(c, (byte) 1));
    }

    @Override // qze
    public final void a(ry ryVar) {
        this.b.getClass();
        ((h3c) this.a.get()).a(ryVar.b ? na0.a(ryVar.i()) : new na0(null, ryVar.i(), fl8.b, null), new rjb((byte) 9));
    }
}
