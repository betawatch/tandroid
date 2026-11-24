// default package

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public class qqb {
    public final String c;
    public int d;
    public final /* synthetic */ rqb e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public qqb(rqb rqbVar, String str) {
        this.e = rqbVar;
        this.c = str;
        rqbVar.a++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(": ");
        sb.append(this.b < 0 ? "not done" : kt6.q(new StringBuilder(), this.b - this.a, "ms"));
        return sb.toString();
    }
}
