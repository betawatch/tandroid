// default package

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
