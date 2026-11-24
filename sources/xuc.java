// default package

import android.webkit.ValueCallback;
import android.webkit.WebView;
import java.io.File;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.ui.web.a;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final /* synthetic */ class xuc implements ValueCallback {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ xuc(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
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
                dvc dvcVar = (dvc) this.b;
                mw0 mw0Var = (mw0) this.c;
                File file = (File) this.d;
                mw0Var.saveWebArchive(file.getAbsolutePath(), false, new xuc(dvcVar, mw0Var, file, (a) this.e, (byte) 1));
                return;
            case 1:
                dvc dvcVar2 = (dvc) this.b;
                mw0 mw0Var2 = (mw0) this.c;
                File file2 = (File) this.d;
                a aVar = (a) this.e;
                mw0Var2.evaluateJavascript(gm.v2(null, R.raw.open_collapsed).replace("$OPEN$", "false"), new vv0());
                try {
                    xvc xvcVar = new xvc(file2);
                    dvcVar2.b = xvcVar;
                    if (!((ArrayList) xvcVar.c).isEmpty()) {
                        aVar.a(((ji6) ((ArrayList) dvcVar2.b.c).get(0)).a());
                        return;
                    }
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                aVar.a(null);
                return;
            default:
                bwc bwcVar = (bwc) this.b;
                gcc gccVar = (gcc) this.c;
                WebView webView = (WebView) this.d;
                yu5 yu5Var = (yu5) this.e;
                String str = (String) obj;
                gm.r(gccVar);
                synchronized (bwcVar.a) {
                    if (bwcVar.u || bwcVar.o != webView || bwcVar.p != yu5Var || bwcVar.r) {
                        return;
                    }
                    if (!"true".equals(str)) {
                        fc4.d("WEB proxy: Base64 bridge installation failed; transport stopped");
                        bwcVar.q();
                        return;
                    } else {
                        if (!bwcVar.j(webView)) {
                            bwcVar.h();
                            return;
                        }
                        bwcVar.s = false;
                        bwcVar.r = true;
                        fc4.b("WEB proxy: Base64 bridge ready");
                        bwcVar.n(16, 0, new byte[]{1});
                        return;
                    }
                }
        }
    }
}
