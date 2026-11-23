package sc;

import android.os.AsyncTask;
import c8.td;
import ee.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.i5;
import org.telegram.ui.Components.i61;
import org.telegram.ui.f;
import org.telegram.ui.gf0;
import org.telegram.ui.kl0;
import tc.g;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ f c;
    public final /* synthetic */ i5 d;

    public a(i5 i5Var, String str, uc.a aVar, f fVar) {
        this.d = i5Var;
        this.a = str;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        i5 i5Var = this.d;
        try {
            i61 c10 = vc.b.c(td.a(this.b), new t(this.a, 2));
            Object obj = i5Var.a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = i5Var.a;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.a;
        i61 i61Var = bVar.a;
        f fVar = this.c;
        if (i61Var != null) {
            kl0 kl0Var = (kl0) fVar.b;
            if (kl0Var.R0) {
                return;
            }
            kl0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) i61Var.c, (String) i61Var.b);
            g0.g3(new gf0(fVar, 11));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            fVar.v1(exc);
        } else {
            fVar.v1(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
