package tc;

import java.io.IOException;
import v7.j;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public abstract class g extends Exception {
    public final String a;

    public g(String str, String str2) {
        super(str, null);
        this.a = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.a;
        return a4.a.t(new StringBuilder(), super.toString(), str != null ? j.g("; request-id: ", str) : "");
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
