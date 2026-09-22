package sc;

import android.os.AsyncTask;
import c5.i;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.lo0;
import org.telegram.ui.pl0;
import org.telegram.ui.wo0;
import tc.g;
import w7.r8;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ lo0 c;
    public final /* synthetic */ ia d;

    public a(ia iaVar, String str, uc.a aVar, lo0 lo0Var) {
        this.d = iaVar;
        this.a = str;
        this.b = aVar;
        this.c = lo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ia iaVar = this.d;
        try {
            String str = this.a;
            i iVar = new i();
            iVar.a = str;
            lf.i c10 = vc.b.c(r8.a(this.b), iVar);
            Object obj = iaVar.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = iaVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        lf.i iVar = bVar.a;
        lo0 lo0Var = this.c;
        if (iVar != null) {
            wo0 wo0Var = lo0Var.a;
            if (wo0Var.Q0) {
                return;
            }
            wo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.c, (String) iVar.b);
            AndroidUtilities.runOnUIThread(new pl0(lo0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            lo0Var.a(exc);
        } else {
            lo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
