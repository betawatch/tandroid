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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes4.dex */
public final class y1 extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ d2 d;

    public y1(d2 d2Var, InputStream inputStream) {
        this.d = d2Var;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a2;
        String str2;
        if (this.a) {
            this.a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(aa.d.o("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        d2 d2Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            com.google.firebase.messaging.t tVar = d2Var.b;
            g1 g1Var = tVar != null ? (g1) ((HashMap) tVar.d).get(str) : null;
            if (g1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            h1 h1Var = (h1) g1Var.a.get("content-type");
            String str3 = h1Var == null ? null : h1Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = g1Var.a();
                str2 = str3;
            } catch (IOException e10) {
                FileLog.e(e10);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                com.google.firebase.messaging.t tVar2 = d2Var.b;
                g1 g1Var2 = tVar2 != null ? (g1) ((ArrayList) tVar2.c).get(0) : null;
                if (g1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = g1Var2.a();
                } catch (IOException e11) {
                    FileLog.e(e11);
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
