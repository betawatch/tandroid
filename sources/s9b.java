// default package

import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class s9b extends Exception {
    public final String a;

    public s9b(String str, String str2) {
        super(str, null);
        this.a = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.a;
        return b00.j(new StringBuilder(), super.toString(), str != null ? b00.h("; request-id: ", str) : "");
    }

    public s9b(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
