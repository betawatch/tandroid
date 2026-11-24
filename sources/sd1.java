// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class sd1 extends qab implements Comparable {
    public long s;

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        sd1 sd1Var = (sd1) obj;
        if (isEndOfStream() != sd1Var.isEndOfStream()) {
            return isEndOfStream() ? 1 : -1;
        }
        long j = this.e - sd1Var.e;
        if (j == 0) {
            j = this.s - sd1Var.s;
            if (j == 0) {
                return 0;
            }
        }
        return j > 0 ? 1 : -1;
    }
}
