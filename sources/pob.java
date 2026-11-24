// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class pob {
    public final String c;
    public int d;
    public final /* synthetic */ qob e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public pob(qob qobVar, String str) {
        this.e = qobVar;
        this.c = str;
        qobVar.a++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(": ");
        sb.append(this.b < 0 ? "not done" : ls6.p(new StringBuilder(), this.b - this.a, "ms"));
        return sb.toString();
    }
}
