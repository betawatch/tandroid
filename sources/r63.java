// default package

import java.io.IOException;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public class r63 extends IOException {
    public final int a;

    public r63(int i) {
        this.a = i;
    }

    public r63(Exception exc, int i) {
        super(exc);
        this.a = i;
    }

    public r63(String str, int i) {
        super(str);
        this.a = i;
    }

    public r63(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
