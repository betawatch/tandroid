package sc;

import android.os.AsyncTask;
import c5.i;
import java.util.Locale;
import la.h;
import n2.c;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ho0;
import org.telegram.ui.nl0;
import org.telegram.ui.so0;
import tc.g;
import w7.t8;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ ho0 c;
    public final /* synthetic */ c d;

    public a(c cVar, String str, uc.a aVar, ho0 ho0Var) {
        this.d = cVar;
        this.a = str;
        this.b = aVar;
        this.c = ho0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        c cVar = this.d;
        try {
            h c10 = vc.b.c(t8.a(this.b), new i(this.a));
            Object obj = cVar.b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = cVar.b;
            return new b(null, e7);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        h hVar = bVar.a;
        ho0 ho0Var = this.c;
        if (hVar != null) {
            so0 so0Var = ho0Var.a;
            if (so0Var.Q0) {
                return;
            }
            so0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.c, (String) hVar.b);
            AndroidUtilities.runOnUIThread(new nl0(ho0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            ho0Var.a(exc);
        } else {
            ho0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
