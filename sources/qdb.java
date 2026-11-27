// default package

import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
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
