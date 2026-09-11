package sc;

import android.os.AsyncTask;
import c5.i;
import java.util.Locale;
import m2.t;
import mg.n;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.rl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.r8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ mo0 c;
    public final /* synthetic */ n d;

    public a(n nVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = nVar;
        this.a = str;
        this.b = aVar;
        this.c = mo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        n nVar = this.d;
        try {
            t c10 = vc.b.c(r8.a(this.b), new i(this.a));
            Object obj = nVar.b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = nVar.b;
            return new b(null, e7);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        t tVar = bVar.a;
        mo0 mo0Var = this.c;
        if (tVar != null) {
            xo0 xo0Var = mo0Var.a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) tVar.c, (String) tVar.b);
            AndroidUtilities.runOnUIThread(new rl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
