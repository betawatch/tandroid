package sc;

import android.os.AsyncTask;
import c8.pd;
import g9.l;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.n;
import org.telegram.ui.ef0;
import org.telegram.ui.f;
import org.telegram.ui.hl0;
import org.telegram.ui.hy0;
import tc.g;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ f c;
    public final /* synthetic */ n d;

    public a(n nVar, String str, uc.a aVar, f fVar) {
        this.d = nVar;
        this.a = str;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        n nVar = this.d;
        try {
            hy0 c10 = vc.b.c(pd.a(this.b), new l(this.a, 2));
            Object obj = nVar.a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = nVar.a;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.a;
        hy0 hy0Var = bVar.a;
        f fVar = this.c;
        if (hy0Var != null) {
            hl0 hl0Var = (hl0) fVar.b;
            if (hl0Var.Q0) {
                return;
            }
            hl0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hy0Var.c, (String) hy0Var.b);
            g0.h3(new ef0(fVar, 11));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            fVar.Y1(exc);
        } else {
            fVar.Y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
