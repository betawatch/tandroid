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
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes4.dex */
public final class s1 extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ y1 d;

    public s1(y1 y1Var, InputStream inputStream) {
        this.d = y1Var;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a2;
        String str2;
        if (this.a) {
            this.a = false;
            String y22 = org.telegram.messenger.i0.y2(null, R.raw.instant);
            boolean z10 = v2.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(a1.g.n("<script>\n", y22.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        y1 y1Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            xa.n nVar = y1Var.b;
            e1 e1Var = nVar != null ? (e1) ((HashMap) nVar.c).get(str) : null;
            if (e1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            f1 f1Var = (f1) e1Var.a.get("content-type");
            String str3 = f1Var == null ? null : f1Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = e1Var.a();
                str2 = str3;
            } catch (IOException e) {
                f8.g(e, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                xa.n nVar2 = y1Var.b;
                e1 e1Var2 = nVar2 != null ? (e1) ((ArrayList) nVar2.b).get(0) : null;
                if (e1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = e1Var2.a();
                } catch (IOException e7) {
                    f8.g(e7, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.b = true;
                a2 = this.c;
            }
        }
        return new WebResourceResponse(str2, null, a2);
    }
}
