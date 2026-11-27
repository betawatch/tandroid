// default package

import java.io.IOException;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
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
