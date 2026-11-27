// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public class psb {
    public final String c;
    public int d;
    public final /* synthetic */ qsb e;
    public long b = -1;
    public final long a = System.currentTimeMillis();

    public psb(qsb qsbVar, String str) {
        this.e = qsbVar;
        this.c = str;
        qsbVar.a++;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(this.c);
        sb.append(": ");
        sb.append(this.b < 0 ? "not done" : qu6.p(new StringBuilder(), this.b - this.a, "ms"));
        return sb.toString();
    }
}
