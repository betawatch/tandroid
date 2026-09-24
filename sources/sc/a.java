package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import la.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.do0;
import org.telegram.ui.il0;
import org.telegram.ui.oo0;
import tc.g;
import w7.s8;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ do0 c;
    public final /* synthetic */ u d;

    public a(u uVar, String str, uc.a aVar, do0 do0Var) {
        this.d = uVar;
        this.a = str;
        this.b = aVar;
        this.c = do0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        u uVar = this.d;
        try {
            h c10 = vc.b.c(s8.a(this.b), new v(this.a, 3));
            Object obj = uVar.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = uVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        h hVar = bVar.a;
        do0 do0Var = this.c;
        if (hVar != null) {
            oo0 oo0Var = do0Var.a;
            if (oo0Var.Q0) {
                return;
            }
            oo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.c, (String) hVar.b);
            AndroidUtilities.runOnUIThread(new il0(do0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            do0Var.a(exc);
        } else {
            do0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
