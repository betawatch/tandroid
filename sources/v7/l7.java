package v7;

import java.io.IOException;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public abstract class l7 {
    public static void a(g2.h hVar) {
        if (hVar != null) {
            try {
                hVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
