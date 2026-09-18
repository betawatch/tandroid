package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import lf.i;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.sl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.s8;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ mo0 c;
    public final /* synthetic */ u d;

    public a(u uVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = uVar;
        this.a = str;
        this.b = aVar;
        this.c = mo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        u uVar = this.d;
        try {
            i c10 = vc.b.c(s8.a(this.b), new v(this.a, 3));
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
        i iVar = bVar.a;
        mo0 mo0Var = this.c;
        if (iVar != null) {
            xo0 xo0Var = mo0Var.a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.c, (String) iVar.b);
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
