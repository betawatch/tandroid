package uc;

import android.os.AsyncTask;
import com.google.android.gms.internal.clearcut.e;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.ek0;
import org.telegram.ui.fo0;
import org.telegram.ui.un0;
import vc.g;
import w7.o9;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ wc.a b;
    public final /* synthetic */ un0 c;
    public final /* synthetic */ b d;

    public a(b bVar, String str, wc.a aVar, un0 un0Var) {
        this.d = bVar;
        this.a = str;
        this.b = aVar;
        this.c = un0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        b bVar = this.d;
        try {
            u2.c c10 = xc.b.c(o9.a(this.b), new e(this.a, 3));
            Object obj = bVar.a;
            return new c(c10, null);
        } catch (g e) {
            Object obj2 = bVar.a;
            return new c(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        c cVar = (c) obj;
        Object obj2 = this.d.a;
        u2.c cVar2 = cVar.a;
        un0 un0Var = this.c;
        if (cVar2 != null) {
            fo0 fo0Var = un0Var.a;
            if (fo0Var.Q0) {
                return;
            }
            fo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) cVar2.c, (String) cVar2.b);
            AndroidUtilities.runOnUIThread(new ek0(un0Var, 9));
            return;
        }
        Exception exc = cVar.b;
        if (exc != null) {
            un0Var.a(exc);
        } else {
            un0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
