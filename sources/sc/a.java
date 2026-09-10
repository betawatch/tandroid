package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import m.e3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.lo0;
import org.telegram.ui.ql0;
import org.telegram.ui.wo0;
import tc.g;
import w7.r8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ lo0 c;
    public final /* synthetic */ o0.b d;

    public a(o0.b bVar, String str, uc.a aVar, lo0 lo0Var) {
        this.d = bVar;
        this.a = str;
        this.b = aVar;
        this.c = lo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        o0.b bVar = this.d;
        try {
            e3 c10 = vc.b.c(r8.a(this.b), new v(this.a, 2));
            Object obj = bVar.a;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = bVar.a;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.a;
        e3 e3Var = bVar.a;
        lo0 lo0Var = this.c;
        if (e3Var != null) {
            wo0 wo0Var = lo0Var.a;
            if (wo0Var.Q0) {
                return;
            }
            wo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) e3Var.c, (String) e3Var.b);
            AndroidUtilities.runOnUIThread(new ql0(lo0Var, 8));
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
