// default package

import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final class ya1 {
    public final int a;
    public final int b;
    public final int c;
    public boolean d;

    public ya1(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void a(String str) {
        if (this.d) {
            return;
        }
        this.d = true;
        ConnectionsManager.native_receivedCaptchaResult(this.a, this.b, this.c, str);
    }
}
