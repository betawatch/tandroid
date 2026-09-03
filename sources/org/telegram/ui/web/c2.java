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

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class c2 extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ h2 d;

    public c2(h2 h2Var, InputStream inputStream) {
        this.d = h2Var;
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
        h2 h2Var = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            com.google.firebase.messaging.s sVar = h2Var.b;
            j1 j1Var = sVar != null ? (j1) ((HashMap) sVar.c).get(str) : null;
            if (j1Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            k1 k1Var = (k1) j1Var.a.get("content-type");
            String str3 = k1Var == null ? null : k1Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a2 = j1Var.a();
                str2 = str3;
            } catch (IOException e6) {
                FileLog.e(e6);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                com.google.firebase.messaging.s sVar2 = h2Var.b;
                j1 j1Var2 = sVar2 != null ? (j1) ((ArrayList) sVar2.b).get(0) : null;
                if (j1Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a2 = j1Var2.a();
                } catch (IOException e10) {
                    FileLog.e(e10);
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
