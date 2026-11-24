// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
