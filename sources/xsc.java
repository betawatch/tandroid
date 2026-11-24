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

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xsc extends WebViewClient {
    public boolean a = true;
    public boolean b;
    public final /* synthetic */ InputStream c;
    public final /* synthetic */ ctc d;

    public xsc(ctc ctcVar, InputStream inputStream) {
        this.d = ctcVar;
        this.c = inputStream;
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        InputStream a;
        String str2;
        if (this.a) {
            this.a = false;
            String v2 = gl.v2(null, R.raw.instant);
            boolean z = w01.a;
            return new WebResourceResponse("text/html", "UTF-8", new ByteArrayInputStream(tb4.y("<script>\n", v2.replace("$DEBUG$", "true"), "\n</script>").getBytes(StandardCharsets.UTF_8)));
        }
        ctc ctcVar = this.d;
        if (str == null || !str.endsWith("/index.html")) {
            c5a c5aVar = ctcVar.b;
            jg6 jg6Var = c5aVar != null ? (jg6) ((HashMap) c5aVar.d).get(str) : null;
            if (jg6Var == null) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            kg6 kg6Var = (kg6) jg6Var.a.get("content-type");
            String str3 = kg6Var == null ? null : kg6Var.a;
            if (!"text/html".equalsIgnoreCase(str3) && !"text/css".equalsIgnoreCase(str3)) {
                return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
            }
            try {
                a = jg6Var.a();
                str2 = str3;
            } catch (IOException e) {
                fa4.g(e, true);
                return new WebResourceResponse("text/plain", "utf-8", 503, "Server error", null, null);
            }
        } else {
            str2 = "application/octet-stream";
            if (this.b) {
                c5a c5aVar2 = ctcVar.b;
                jg6 jg6Var2 = c5aVar2 != null ? (jg6) ((ArrayList) c5aVar2.c).get(0) : null;
                if (jg6Var2 == null) {
                    return new WebResourceResponse("text/plain", "utf-8", 404, "Not Found", null, null);
                }
                try {
                    a = jg6Var2.a();
                } catch (IOException e2) {
                    fa4.g(e2, true);
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
