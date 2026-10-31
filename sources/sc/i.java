package sc;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class i extends Exception {
    public final g a;

    public i(String str) {
        super(str);
        this.a = g.f;
    }

    public final g a() {
        return this.a;
    }

    public i(String str, IOException iOException) {
        super(str, iOException);
        this.a = g.n;
    }
}
