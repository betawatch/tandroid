package tc;

import java.io.IOException;
import org.telegram.ui.Cells.p6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
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
        return a4.a.s(new StringBuilder(), super.toString(), str != null ? p6.i("; request-id: ", str) : "");
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
