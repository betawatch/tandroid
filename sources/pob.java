// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
