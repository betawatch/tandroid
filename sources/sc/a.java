package sc;

import android.os.AsyncTask;
import c8.sd;
import ee.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.c5;
import org.telegram.ui.f;
import org.telegram.ui.if0;
import org.telegram.ui.ml0;
import org.telegram.ui.nd0;
import tc.g;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ f c;
    public final /* synthetic */ c5 d;

    public a(c5 c5Var, String str, uc.a aVar, f fVar) {
        this.d = c5Var;
        this.a = str;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        c5 c5Var = this.d;
        try {
            nd0 c10 = vc.b.c(sd.a(this.b), new t(this.a, 2));
            Object obj = c5Var.a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = c5Var.a;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.a;
        nd0 nd0Var = bVar.a;
        f fVar = this.c;
        if (nd0Var != null) {
            ml0 ml0Var = (ml0) fVar.b;
            if (ml0Var.R0) {
                return;
            }
            ml0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) nd0Var.b, (String) nd0Var.d);
            g0.g3(new if0(fVar, 11));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            fVar.y1(exc);
        } else {
            fVar.y1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
