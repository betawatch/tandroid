// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class pd8 {
    public final /* synthetic */ nc8 a;

    public pd8(nc8 nc8Var) {
        this.a = nc8Var;
    }

    @JavascriptInterface
    public void onPlayerError(String str) {
        hl.c3(new me7((Object) this, Integer.parseInt(str), (byte) 7));
    }

    @JavascriptInterface
    public void onPlayerLoaded() {
        hl.c3(new nd8(this, (byte) 0));
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
        nc8 nc8Var = this.a;
        nc8Var.I = i * 1000;
        String str = nc8Var.s;
        if (str != null) {
            nc8Var.g(str);
            nc8Var.s = null;
        }
    }

    @JavascriptInterface
    public void onPlayerStateChange(String str) {
        int i;
        int parseInt = Integer.parseInt(str);
        nc8 nc8Var = this.a;
        boolean z = nc8Var.H;
        boolean z2 = false;
        byte b = 1;
        nc8Var.H = parseInt == 1 || parseInt == 3;
        nc8Var.a(z);
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
        if (i == 3 && nc8Var.h.getVisibility() != 4) {
            hl.d3(new nd8(this, b), 300L);
        }
        hl.c3(new wr6(this, z2, i, b));
    }
}
