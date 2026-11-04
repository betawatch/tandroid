package pc;

import android.os.AsyncTask;
import be.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.i9;
import org.telegram.ui.dl0;
import org.telegram.ui.f;
import org.telegram.ui.sg0;
import p7.d;
import qc.g;
import x7.c5;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ rc.a b;
    public final /* synthetic */ f c;
    public final /* synthetic */ i9 d;

    public a(i9 i9Var, String str, rc.a aVar, f fVar) {
        this.d = i9Var;
        this.a = str;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i9 i9Var = this.d;
        try {
            d c2 = sc.b.c(c5.a(this.b), new t(this.a, 2));
            Object obj = i9Var.b;
            return new b(c2, null);
        } catch (g e10) {
            Object obj2 = i9Var.b;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        d dVar = bVar.a;
        f fVar = this.c;
        if (dVar != null) {
            dl0 dl0Var = (dl0) fVar.b;
            if (dl0Var.R0) {
                return;
            }
            dl0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) dVar.d, (String) dVar.b);
            g0.h3(new sg0(fVar, 10));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            fVar.R1(exc);
        } else {
            fVar.R1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
