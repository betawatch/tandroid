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
import org.telegram.messenger.s2;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes4.dex */
public final class q1 extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ v1 d;

    public q1(v1 v1Var, InputStream inputStream) {
        this.d = v1Var;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a10;
        String str2;
        if (this.a) {
            this.a = false;
            String y22 = org.telegram.messenger.g0.y2(null, R.raw.instant);
            boolean z10 = s2.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a8.p0.p("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        v1 v1Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            xi.e eVar = v1Var.b;
            b1 b1Var = eVar != null ? (b1) ((HashMap) eVar.c).get(str) : null;
            if (b1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            c1 c1Var = (c1) b1Var.a.get("content-type");
            String str3 = c1Var == null ? null : c1Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a10 = b1Var.a();
                str2 = str3;
            } catch (IOException e10) {
                a8.g(e10, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                xi.e eVar2 = v1Var.b;
                b1 b1Var2 = eVar2 != null ? (b1) ((ArrayList) eVar2.b).get(0) : null;
                if (b1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a10 = b1Var2.a();
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
