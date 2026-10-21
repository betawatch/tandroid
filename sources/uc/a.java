package uc;

import android.os.AsyncTask;
import d9.l;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ck0;
import org.telegram.ui.eo0;
import org.telegram.ui.tn0;
import u2.c;
import vc.g;
import w7.n9;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ wc.a b;
    public final /* synthetic */ tn0 c;
    public final /* synthetic */ le.b d;

    public a(le.b bVar, String str, wc.a aVar, tn0 tn0Var) {
        this.d = bVar;
        this.a = str;
        this.b = aVar;
        this.c = tn0Var;
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
        tn0 tn0Var = this.c;
        if (cVar != null) {
            eo0 eo0Var = tn0Var.a;
            if (eo0Var.Q0) {
                return;
            }
            eo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar.c, (String) cVar.b);
            AndroidUtilities.runOnUIThread(new ck0(tn0Var, 9));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            tn0Var.a(exc);
        } else {
            tn0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
