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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class b2 extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ g2 d;

    public b2(g2 g2Var, InputStream inputStream) {
        this.d = g2Var;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a2;
        String str2;
        if (this.a) {
            this.a = false;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(android.support.v4.media.a.o("<script>\n", AndroidUtilities.readRes(R.raw.instant).replace("$DEBUG$", "" + BuildVars.DEBUG_VERSION), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        g2 g2Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            com.google.firebase.messaging.r rVar = g2Var.b;
            i1 i1Var = rVar != null ? (i1) ((HashMap) rVar.d).get(str) : null;
            if (i1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            j1 j1Var = (j1) i1Var.a.get("content-type");
            String str3 = j1Var == null ? null : j1Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = i1Var.a();
                str2 = str3;
            } catch (IOException e) {
                FileLog.e(e);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                com.google.firebase.messaging.r rVar2 = g2Var.b;
                i1 i1Var2 = rVar2 != null ? (i1) ((ArrayList) rVar2.c).get(0) : null;
                if (i1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = i1Var2.a();
                } catch (IOException e6) {
                    FileLog.e(e6);
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
