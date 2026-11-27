// default package

import j$.util.Objects;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class yh7 {
    public final p1c a;
    public final y1c b;
    public final x1c c;
    public final g6c d;
    public final boolean e;
    public final boolean f;
    public int g;
    public ko4 h;

    public yh7(p1c p1cVar, y1c y1cVar, x1c x1cVar) {
        this.a = p1cVar;
        this.b = y1cVar;
        this.c = x1cVar;
        int i = p1cVar.b;
        ko4 ko4Var = p1cVar.g;
        this.e = i == 2;
        this.f = Objects.equals(ko4Var.t, "application/x-itut-t35");
        this.d = "audio/true-hd".equals(ko4Var.t) ? new g6c() : null;
    }
}
