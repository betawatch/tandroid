// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class zuc implements Comparable {
    public final int a;
    public final vuc b;

    public zuc(int i, vuc vucVar) {
        this.a = i;
        this.b = vucVar;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((zuc) obj).a);
    }
}
