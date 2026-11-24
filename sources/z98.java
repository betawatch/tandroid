// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class z98 {
    public final /* synthetic */ x88 a;

    public z98(x88 x88Var) {
        this.a = x88Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        gl.c3(new on7((Object) this, Integer.parseInt(str), (byte) 4));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        gl.c3(new x98(this, (byte) 0));
    }

    @JavascriptInterface
    public void onPlayerNotifyBufferedPosition(float f) {
        this.a.K = f;
    }

    @JavascriptInterface
    public void onPlayerNotifyCurrentPosition(int i) {
        this.a.J = i * 1000;
    }

    @JavascriptInterface
    public void onPlayerNotifyDuration(int i) {
        x88 x88Var = this.a;
        x88Var.I = i * 1000;
        String str = x88Var.s;
        if (str != null) {
            x88Var.g(str);
            x88Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int i;
        int parseInt = Integer.parseInt(str);
        x88 x88Var = this.a;
        boolean z = x88Var.H;
        boolean z2 = false;
        byte b = 1;
        x88Var.H = parseInt == 1 || parseInt == 3;
        x88Var.a(z);
        if (parseInt != 0) {
            if (parseInt != 1) {
                i = 2;
                if (parseInt == 2) {
                    i = 3;
                } else if (parseInt != 3) {
                    i = 1;
                }
            } else {
                i = 3;
            }
            z2 = true;
        } else {
            i = 4;
        }
        if (i == 3 && x88Var.h.getVisibility() != 4) {
            gl.d3(new x98(this, b), 300L);
        }
        gl.c3(new sp6(this, z2, i, b));
    }
}
