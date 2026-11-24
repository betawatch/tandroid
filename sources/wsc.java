// default package

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.web.a;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public final /* synthetic */ class wsc implements ValueCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ wsc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    @Override // android.webkit.ValueCallback
    public final void onReceiveValue(Object obj) {
        switch (this.a) {
            case 0:
                ctc ctcVar = (ctc) this.b;
                cv0 cv0Var = (cv0) this.c;
                File file = (File) this.d;
                cv0Var.saveWebArchive(file.getAbsolutePath(), false, new wsc(ctcVar, cv0Var, file, (a) this.e, (byte) 1));
                return;
            case 1:
                ctc ctcVar2 = (ctc) this.b;
                cv0 cv0Var2 = (cv0) this.c;
                File file2 = (File) this.d;
                a aVar = (a) this.e;
                cv0Var2.evaluateJavascript(gl.v2(null, R.raw.open_collapsed).replace("$OPEN$", "false"), new lu0());
                try {
                    c5a c5aVar = new c5a(file2);
                    ctcVar2.b = c5aVar;
                    if (!((ArrayList) c5aVar.c).isEmpty()) {
                        aVar.a(((jg6) ((ArrayList) ctcVar2.b.c).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                aVar.a(null);
                return;
            default:
                auc aucVar = (auc) this.b;
                wbc wbcVar = (wbc) this.c;
                WebView webView = (WebView) this.d;
                zs5 zs5Var = (zs5) this.e;
                String str = (String) obj;
                gl.r(wbcVar);
                synchronized (aucVar.a) {
                    if (aucVar.u || aucVar.o != webView || aucVar.p != zs5Var || aucVar.r) {
                        return;
                    }
                    if (!"true".equals(str)) {
                        fa4.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                        aucVar.q();
                        return;
                    } else {
                        if (!aucVar.j(webView)) {
                            aucVar.h();
                            return;
                        }
                        aucVar.s = false;
                        aucVar.r = true;
                        fa4.b("WEB proxy: Base64 bridge ready");
                        aucVar.n(16, 0, new byte[]{1});
                        return;
                    }
                }
        }
    }
}
