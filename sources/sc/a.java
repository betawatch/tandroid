package sc;

import android.os.AsyncTask;
import d9.f;
import java.util.Locale;
import k2.e;
import lf.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.sl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.s8;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ mo0 c;
    public final /* synthetic */ e d;

    public a(e eVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = eVar;
        this.a = str;
        this.b = aVar;
        this.c = mo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        e eVar = this.d;
        try {
            h c10 = vc.b.c(s8.a(this.b), new f(this.a, 2));
            Object obj = eVar.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = eVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        h hVar = bVar.a;
        mo0 mo0Var = this.c;
        if (hVar != null) {
            xo0 xo0Var = mo0Var.a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.c, (String) hVar.b);
            AndroidUtilities.runOnUIThread(new sl0(mo0Var, 8));
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
