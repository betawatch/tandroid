package vc;

import a8.s0;
import android.os.AsyncTask;
import he.v;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.eo0;
import org.telegram.ui.lj0;
import org.telegram.ui.po0;
import s4.d;
import s4.o0;
import wc.g;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ xc.a b;
    public final /* synthetic */ eo0 c;
    public final /* synthetic */ o0 d;

    public a(o0 o0Var, String str, xc.a aVar, eo0 eo0Var) {
        this.d = o0Var;
        this.a = str;
        this.b = aVar;
        this.c = eo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        o0 o0Var = this.d;
        try {
            d c10 = yc.b.c(s0.a(this.b), new v(this.a, 1));
            Object obj = o0Var.a;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = o0Var.a;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.a;
        d dVar = bVar.a;
        eo0 eo0Var = this.c;
        if (dVar != null) {
            po0 po0Var = eo0Var.a;
            if (po0Var.Q0) {
                return;
            }
            po0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.c, (String) dVar.b);
            AndroidUtilities.runOnUIThread(new lj0(eo0Var, 10));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            eo0Var.a(exc);
        } else {
            eo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
