package org.telegram.ui.web;

import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.a8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.r2;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes4.dex */
public final class r1 extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ w1 d;

    public r1(w1 w1Var, InputStream inputStream) {
        this.d = w1Var;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a10;
        String str2;
        if (this.a) {
            this.a = false;
            String y22 = org.telegram.messenger.g0.y2(null, R.raw.instant);
            boolean z9 = r2.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a8.p0.p("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        w1 w1Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            ab.b0 b0Var = w1Var.b;
            c1 c1Var = b0Var != null ? (c1) ((HashMap) b0Var.d).get(str) : null;
            if (c1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            d1 d1Var = (d1) c1Var.a.get("content-type");
            String str3 = d1Var == null ? null : d1Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a10 = c1Var.a();
                str2 = str3;
            } catch (IOException e10) {
                a8.g(e10, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                ab.b0 b0Var2 = w1Var.b;
                c1 c1Var2 = b0Var2 != null ? (c1) ((ArrayList) b0Var2.c).get(0) : null;
                if (c1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a10 = c1Var2.a();
                } catch (IOException e11) {
                    a8.g(e11, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.b = true;
                a10 = this.c;
            }
        }
        return new WebResourceResponse(str2, null, a10);
    }
}
