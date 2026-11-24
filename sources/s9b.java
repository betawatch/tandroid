// default package

import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
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
