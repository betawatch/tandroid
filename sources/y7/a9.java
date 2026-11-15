package y7;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a9 {
    public final String a;

    public a9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof a9) && this.a.equals(((a9) obj).a);
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ 1231) * 1000003) ^ 1;
    }

    public final String toString() {
        return a8.p0.p("MLKitLoggingOptions{libraryName=", this.a, ", enableFirelog=true, firelogEventType=1}");
    }
}
