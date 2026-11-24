// default package

import android.os.AsyncTask;
import java.util.Locale;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class qbb extends AsyncTask {
    public final /* synthetic */ String a;
    public final /* synthetic */ zd1 b;
    public final /* synthetic */ ai4 c;
    public final /* synthetic */ et8 d;

    public qbb(et8 et8Var, String str, zd1 zd1Var, ai4 ai4Var) {
        this.d = et8Var;
        this.a = str;
        this.b = zd1Var;
        this.c = ai4Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        et8 et8Var = this.d;
        try {
            wm9 c = tbb.c(twe.a(this.b), new jw5(this.a, (byte) 1));
            Object obj = et8Var.b;
            return new rbb(c, null);
        } catch (ubb e) {
            Object obj2 = et8Var.b;
            return new rbb(null, e);
        }
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        rbb rbbVar = (rbb) obj;
        Object obj2 = this.d.b;
        wm9 wm9Var = rbbVar.a;
        ai4 ai4Var = this.c;
        if (wm9Var != null) {
            p pVar = (p) ai4Var.b;
            if (pVar.R0) {
                return;
            }
            pVar.x0 = String.format(Locale.US, "{\"type\":\"%1$s\", \"id\":\"%2$s\"}", (String) wm9Var.c, (String) wm9Var.b);
            gm.c3(new kl7(ai4Var, (byte) 19));
            return;
        }
        ubb ubbVar = rbbVar.b;
        if (ubbVar != null) {
            ai4Var.H(ubbVar);
        } else {
            ai4Var.H(new RuntimeException("Somehow got neither a token response or an error response"));
        }
    }
}
