// default package

import j$.util.Objects;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class rh7 {
    public final qzb a;
    public final zzb b;
    public final yzb c;
    public final g4c d;
    public final boolean e;
    public final boolean f;
    public int g;
    public go4 h;

    public rh7(qzb qzbVar, zzb zzbVar, yzb yzbVar) {
        this.a = qzbVar;
        this.b = zzbVar;
        this.c = yzbVar;
        int i = qzbVar.b;
        go4 go4Var = qzbVar.g;
        this.e = i == 2;
        this.f = Objects.equals(go4Var.t, "application/x-itut-t35");
        this.d = "audio/true-hd".equals(go4Var.t) ? new g4c() : null;
    }
}
