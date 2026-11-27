// default package

import java.io.IOException;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public abstract class qdb extends Exception {
    public final String a;

    public qdb(String str, String str2) {
        super(str, null);
        this.a = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.a;
        return c00.k(new StringBuilder(), super.toString(), str != null ? c00.i("; request-id: ", str) : "");
    }

    public qdb(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
