// default package

import java.io.IOException;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public abstract class ubb extends Exception {
    public final String a;

    public ubb(String str, String str2) {
        super(str, null);
        this.a = str2;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        String str = this.a;
        return b10.j(new StringBuilder(), super.toString(), str != null ? b10.h("; request-id: ", str) : "");
    }

    public ubb(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
