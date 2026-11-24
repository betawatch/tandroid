// default package

import java.io.IOException;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
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
