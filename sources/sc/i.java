package sc;

import java.io.IOException;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
