package vc;

import java.io.IOException;
import si.o0;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
        return a1.g.s(new StringBuilder(), super.toString(), str != null ? o0.h("; request-id: ", str) : "");
    }

    public g(String str, String str2, IOException iOException) {
        super(str, iOException);
        this.a = str2;
    }
}
