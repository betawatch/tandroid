package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import ji.h5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.cp0;
import org.telegram.ui.ro0;
import org.telegram.ui.yk0;
import u2.c;
import vc.g;
import w7.n9;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ wc.a b;
    public final /* synthetic */ ro0 c;
    public final /* synthetic */ h5 d;

    public a(h5 h5Var, String str, wc.a aVar, ro0 ro0Var) {
        this.d = h5Var;
        this.a = str;
        this.b = aVar;
        this.c = ro0Var;
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
        ro0 ro0Var = this.c;
        if (cVar != null) {
            cp0 cp0Var = ro0Var.a;
            if (cp0Var.Q0) {
                return;
            }
            cp0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.c, (String) cVar.b);
            AndroidUtilities.runOnUIThread(new yk0(ro0Var, 9));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            ro0Var.a(exc);
        } else {
            ro0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
