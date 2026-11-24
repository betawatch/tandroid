// default package

import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class vbe {
    public static void a(o63 o63Var) {
        if (o63Var != null) {
            try {
                o63Var.close();
            } catch (IOException unused) {
            }
        }
    }
}
