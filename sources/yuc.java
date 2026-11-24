// default package

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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes3.dex */
public final class yuc extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ dvc d;

    public yuc(dvc dvcVar, InputStream inputStream) {
        this.d = dvcVar;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a;
        String str2;
        if (this.a) {
            this.a = false;
            String v2 = gm.v2(null, R.raw.instant);
            boolean z = e21.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(kt6.o("<script>\n", v2.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        dvc dvcVar = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            xvc xvcVar = dvcVar.b;
            ji6 ji6Var = xvcVar != null ? (ji6) ((HashMap) xvcVar.d).get(str) : null;
            if (ji6Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            ki6 ki6Var = (ki6) ji6Var.a.get("content-type");
            String str3 = ki6Var == null ? null : ki6Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a = ji6Var.a();
                str2 = str3;
            } catch (IOException e) {
                fc4.g(e, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                xvc xvcVar2 = dvcVar.b;
                ji6 ji6Var2 = xvcVar2 != null ? (ji6) ((ArrayList) xvcVar2.c).get(0) : null;
                if (ji6Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a = ji6Var2.a();
                } catch (IOException e2) {
                    fc4.g(e2, true);
                    return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
                }
            } else {
                this.b = true;
                a = this.c;
            }
        }
        return new WebResourceResponse(str2, null, a);
    }
}
