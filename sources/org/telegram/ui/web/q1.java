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

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
            boolean z10 = r2.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a8.p0.p("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        v1 v1Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            xi.e eVar = v1Var.b;
            a1 a1Var = eVar != null ? (a1) ((HashMap) eVar.c).get(str) : null;
            if (a1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            b1 b1Var = (b1) a1Var.a.get("content-type");
            String str3 = b1Var == null ? null : b1Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a10 = a1Var.a();
                str2 = str3;
            } catch (IOException e10) {
                a8.g(e10, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                xi.e eVar2 = v1Var.b;
                a1 a1Var2 = eVar2 != null ? (a1) ((ArrayList) eVar2.b).get(0) : null;
                if (a1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a10 = a1Var2.a();
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
