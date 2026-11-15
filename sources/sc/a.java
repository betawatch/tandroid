package sc;

import android.os.AsyncTask;
import c8.pd;
import f5.g;
import java.util.Locale;
import org.telegram.messenger.g0;
import org.telegram.ui.Components.cf;
import org.telegram.ui.ef0;
import org.telegram.ui.f;
import org.telegram.ui.kl0;
import org.telegram.ui.ld0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ f c;
    public final /* synthetic */ cf d;

    public a(cf cfVar, String str, uc.a aVar, f fVar) {
        this.d = cfVar;
        this.a = str;
        this.b = aVar;
        this.c = fVar;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        cf cfVar = this.d;
        try {
            ld0 c10 = vc.b.c(pd.a(this.b), new g(this.a, 3));
            Object obj = cfVar.a;
            return new b(c10, null);
        } catch (tc.g e10) {
            Object obj2 = cfVar.a;
            return new b(null, e10);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.a;
        ld0 ld0Var = bVar.a;
        f fVar = this.c;
        if (ld0Var != null) {
            kl0 kl0Var = (kl0) fVar.b;
            if (kl0Var.R0) {
                return;
            }
            kl0Var.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) ld0Var.b, (String) ld0Var.d);
            g0.h3(new ef0(fVar, 11));
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
