// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class w46 {
    public final t46 a;
    public final a9c b = new a9c(0.0f);
    public final a9c c = new a9c(0.0f);
    public final a9c d = new a9c(0.0f);
    public final a9c e = new a9c(0.0f);
    public final a9c f = new a9c(0.0f);
    public final a9c g = new a9c(0.0f);

    public w46(x46 x46Var, t46 t46Var) {
        this.a = t46Var;
    }

    public final void a(int i, boolean z) {
        a9c a9cVar = this.c;
        a9c a9cVar2 = this.b;
        if (z) {
            a9cVar2.c = i;
            a9cVar.c = i > 0 ? 1.0f : 0.0f;
        } else {
            a9cVar2.d(i);
            a9cVar.d(i > 0 ? 1.0f : 0.0f);
        }
    }
}
