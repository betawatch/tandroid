package sc;

import android.os.AsyncTask;
import c5.i;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ia;
import org.telegram.ui.no0;
import org.telegram.ui.sl0;
import org.telegram.ui.yo0;
import tc.g;
import w7.r8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ no0 c;
    public final /* synthetic */ ia d;

    public a(ia iaVar, String str, uc.a aVar, no0 no0Var) {
        this.d = iaVar;
        this.a = str;
        this.b = aVar;
        this.c = no0Var;
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
        no0 no0Var = this.c;
        if (iVar != null) {
            yo0 yo0Var = no0Var.a;
            if (yo0Var.Q0) {
                return;
            }
            yo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.c, (String) iVar.b);
            AndroidUtilities.runOnUIThread(new sl0(no0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            no0Var.a(exc);
        } else {
            no0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
