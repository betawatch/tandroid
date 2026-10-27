package vc;

import a8.s0;
import android.os.AsyncTask;
import he.v;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.go0;
import org.telegram.ui.nj0;
import org.telegram.ui.ro0;
import s4.d;
import s4.o0;
import wc.g;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ xc.a b;
    public final /* synthetic */ go0 c;
    public final /* synthetic */ o0 d;

    public a(o0 o0Var, String str, xc.a aVar, go0 go0Var) {
        this.d = o0Var;
        this.a = str;
        this.b = aVar;
        this.c = go0Var;
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
        go0 go0Var = this.c;
        if (dVar != null) {
            ro0 ro0Var = go0Var.a;
            if (ro0Var.Q0) {
                return;
            }
            ro0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.c, (String) dVar.b);
            AndroidUtilities.runOnUIThread(new nj0(go0Var, 10));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            go0Var.a(exc);
        } else {
            go0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
