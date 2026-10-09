package tc;

import android.os.AsyncTask;
import java.util.Locale;
import m.f3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ko0;
import org.telegram.ui.tk0;
import org.telegram.ui.vo0;
import uc.g;
import v7.k;
import w7.y8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ vc.a b;
    public final /* synthetic */ ko0 c;
    public final /* synthetic */ f3 d;

    public a(f3 f3Var, String str, vc.a aVar, ko0 ko0Var) {
        this.d = f3Var;
        this.a = str;
        this.b = aVar;
        this.c = ko0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        f3 f3Var = this.d;
        try {
            k c10 = wc.b.c(y8.a(this.b), new f2.a(this.a));
            Object obj = f3Var.b;
            return new b(c10, null);
        } catch (g e7) {
            Object obj2 = f3Var.b;
            return new b(null, e7);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        k kVar = bVar.a;
        ko0 ko0Var = this.c;
        if (kVar != null) {
            vo0 vo0Var = ko0Var.a;
            if (vo0Var.Q0) {
                return;
            }
            vo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) kVar.c, (String) kVar.b);
            AndroidUtilities.runOnUIThread(new tk0(ko0Var, 9));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            ko0Var.a(exc);
        } else {
            ko0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
