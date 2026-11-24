// default package

import android.webkit.JavascriptInterface;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class yv3 {
    public final /* synthetic */ zv3 a;

    public yv3(zv3 zv3Var) {
        this.a = zv3Var;
    }

    @JavascriptInterface
    public void postEvent(String str, String str2) {
        if ("loaded".equals(str)) {
            gm.c3(new bi3(this, (byte) 22));
        }
    }
}
