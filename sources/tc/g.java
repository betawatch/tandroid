package tc;

import a8.p0;
import java.io.IOException;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
        return p0.s(new StringBuilder(), super.toString(), str != null ? rf.b.i("; request-id: ", str) : "");
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
