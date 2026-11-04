package x7;

import java.io.IOException;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public abstract class y5 {
    public static void a(Appendable appendable, char c2) {
        try {
            appendable.append(c2);
        } catch (IOException e10) {
            throw new RuntimeException(e10);
        }
    }
}
