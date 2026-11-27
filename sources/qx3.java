// default package

import java.io.IOException;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public abstract class qx3 {
    public static final rx3 a;

    static {
        try {
            a = new rx3();
        } catch (IOException e) {
            su3.f("Unable to open emoji.pack", e);
        }
    }
}
