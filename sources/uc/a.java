package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.io0;
import org.telegram.ui.oj0;
import org.telegram.ui.xn0;
import u2.c;
import vc.g;
import w7.n9;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ wc.a b;
    public final /* synthetic */ xn0 c;
    public final /* synthetic */ le.b d;

    public a(le.b bVar, String str, wc.a aVar, xn0 xn0Var) {
        this.d = bVar;
        this.a = str;
        this.b = aVar;
        this.c = xn0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        le.b bVar = this.d;
        try {
            c c10 = xc.b.c(n9.a(this.b), new l(this.a, 3));
            Object obj = bVar.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = bVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        c cVar = bVar.a;
        xn0 xn0Var = this.c;
        if (cVar != null) {
            io0 io0Var = xn0Var.a;
            if (io0Var.Q0) {
                return;
            }
            io0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.c, (String) cVar.b);
            AndroidUtilities.runOnUIThread(new oj0(xn0Var, 10));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            xn0Var.a(exc);
        } else {
            xn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
