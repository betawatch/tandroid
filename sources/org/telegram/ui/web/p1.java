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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes4.dex */
public final class p1 extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ u1 d;

    public p1(u1 u1Var, InputStream inputStream) {
        this.d = u1Var;
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
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a1.g.q("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        u1 u1Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            za.p pVar = u1Var.b;
            b1 b1Var = pVar != null ? (b1) ((HashMap) pVar.c).get(str) : null;
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
                za.p pVar2 = u1Var.b;
                b1 b1Var2 = pVar2 != null ? (b1) ((ArrayList) pVar2.b).get(0) : null;
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
