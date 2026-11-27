// default package

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
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
