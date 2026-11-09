package sc;

import android.os.AsyncTask;
import c8.pd;
import g9.l;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.n;
import org.telegram.ui.f;
import org.telegram.ui.gf0;
import org.telegram.ui.jl0;
import org.telegram.ui.ky0;
import tc.g;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
            ky0 c10 = vc.b.c(pd.a(this.b), new l(this.a, 2));
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
        ky0 ky0Var = bVar.a;
        f fVar = this.c;
        if (ky0Var != null) {
            jl0 jl0Var = (jl0) fVar.b;
            if (jl0Var.Q0) {
                return;
            }
            jl0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) ky0Var.c, (String) ky0Var.b);
            g0.h3(new gf0(fVar, 11));
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
