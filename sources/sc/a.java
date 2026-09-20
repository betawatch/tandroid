package sc;

import android.os.AsyncTask;
import ee.v;
import java.util.Locale;
import k2.u;
import lf.h;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.mo0;
import org.telegram.ui.sl0;
import org.telegram.ui.xo0;
import tc.g;
import w7.t8;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ mo0 c;
    public final /* synthetic */ u d;

    public a(u uVar, String str, uc.a aVar, mo0 mo0Var) {
        this.d = uVar;
        this.a = str;
        this.b = aVar;
        this.c = mo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        u uVar = this.d;
        try {
            h c10 = vc.b.c(t8.a(this.b), new v(this.a, 3));
            Object obj = uVar.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = uVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        h hVar = bVar.a;
        mo0 mo0Var = this.c;
        if (hVar != null) {
            xo0 xo0Var = mo0Var.a;
            if (xo0Var.Q0) {
                return;
            }
            xo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) hVar.c, (String) hVar.b);
            AndroidUtilities.runOnUIThread(new sl0(mo0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            mo0Var.a(exc);
        } else {
            mo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
