package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ap0;
import org.telegram.ui.po0;
import org.telegram.ui.xk0;
import u2.c;
import vc.g;
import w7.n9;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ wc.a b;
    public final /* synthetic */ po0 c;
    public final /* synthetic */ h5 d;

    public a(h5 h5Var, String str, wc.a aVar, po0 po0Var) {
        this.d = h5Var;
        this.a = str;
        this.b = aVar;
        this.c = po0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        h5 h5Var = this.d;
        try {
            c c10 = xc.b.c(n9.a(this.b), new l(this.a, false));
            Object obj = h5Var.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = h5Var.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        c cVar = bVar.a;
        po0 po0Var = this.c;
        if (cVar != null) {
            ap0 ap0Var = po0Var.a;
            if (ap0Var.Q0) {
                return;
            }
            ap0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.c, (String) cVar.b);
            AndroidUtilities.runOnUIThread(new xk0(po0Var, 9));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            po0Var.a(exc);
        } else {
            po0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
