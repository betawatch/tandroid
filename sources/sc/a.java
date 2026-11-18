package sc;

import android.os.AsyncTask;
import c8.sd;
import ee.t;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Cells.b5;
import org.telegram.ui.f;
import org.telegram.ui.hf0;
import org.telegram.ui.md0;
import org.telegram.ui.ml0;
import tc.g;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ f c;
    public final /* synthetic */ b5 d;

    public a(b5 b5Var, String str, uc.a aVar, f fVar) {
        this.d = b5Var;
        this.a = str;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        b5 b5Var = this.d;
        try {
            md0 c10 = vc.b.c(sd.a(this.b), new t(this.a, 2));
            Object obj = b5Var.a;
            return new b(c10, null);
        } catch (g e10) {
            Object obj2 = b5Var.a;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.a;
        md0 md0Var = bVar.a;
        f fVar = this.c;
        if (md0Var != null) {
            ml0 ml0Var = (ml0) fVar.b;
            if (ml0Var.R0) {
                return;
            }
            ml0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) md0Var.b, (String) md0Var.d);
            g0.g3(new hf0(fVar, 11));
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
