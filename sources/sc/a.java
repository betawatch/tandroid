package sc;

import android.os.AsyncTask;
import c5.i;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Cells.ja;
import org.telegram.ui.fo0;
import org.telegram.ui.jl0;
import org.telegram.ui.qo0;
import tc.g;
import w7.r8;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes.dex */
public final class a extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ uc.a b;
    public final /* synthetic */ fo0 c;
    public final /* synthetic */ ja d;

    public a(ja jaVar, String str, uc.a aVar, fo0 fo0Var) {
        this.d = jaVar;
        this.a = str;
        this.b = aVar;
        this.c = fo0Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        ja jaVar = this.d;
        try {
            String str = this.a;
            i iVar = new i();
            iVar.a = str;
            lf.i c10 = vc.b.c(r8.a(this.b), iVar);
            Object obj = jaVar.b;
            return new b(c10, null);
        } catch (g e) {
            Object obj2 = jaVar.b;
            return new b(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        b bVar = (b) obj;
        Object obj2 = this.d.b;
        lf.i iVar = bVar.a;
        fo0 fo0Var = this.c;
        if (iVar != null) {
            qo0 qo0Var = fo0Var.a;
            if (qo0Var.Q0) {
                return;
            }
            qo0Var.w0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) iVar.c, (String) iVar.b);
            AndroidUtilities.runOnUIThread(new jl0(fo0Var, 8));
            return;
        }
        Exception exc = bVar.b;
        if (exc != null) {
            fo0Var.a(exc);
        } else {
            fo0Var.a(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
