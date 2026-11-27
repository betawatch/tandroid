// default package

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
