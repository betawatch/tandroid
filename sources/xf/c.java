package xf;

import android.content.SharedPreferences;
import android.text.SpannableStringBuilder;
import android.util.Log;
import b8.cg;
import b8.ke;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import org.telegram.messenger.beta.R;
import org.telegram.ui.Components.ei;
import org.telegram.ui.Components.fc;
import vg.h1;
import xg.b0;
import xg.c0;
import xg.v;
import xg.y;
import z2.n;
import za.z;
import zh.j;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ((wf.b) ((cg) this.b).c).a(false);
                return;
            case 1:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) this.b;
                fc X = fc.X();
                if (X != null) {
                    X.Q(R.raw.forward, 30, spannableStringBuilder).j();
                    return;
                }
                return;
            case 2:
                ((y) this.b).a(null);
                return;
            case 3:
                ((ei) this.b).a(Collections.EMPTY_LIST);
                return;
            case 4:
                ((v) this.b).a(null);
                return;
            case 5:
                b0 b0Var = (b0) this.b;
                b0Var.getClass();
                c0 c0Var = b0Var.r;
                h1 h1Var = new h1(c0Var.p1, c0Var.a, null, null, null, c0Var.J0);
                h1Var.C2 = true;
                h1Var.V1 = true;
                c0Var.p1.showDialog(h1Var);
                return;
            case 6:
                ((n) this.b).k();
                return;
            case 7:
                ke keVar = (ke) this.b;
                synchronized (((ArrayDeque) keVar.e)) {
                    SharedPreferences.Editor edit = ((SharedPreferences) keVar.b).edit();
                    String str = (String) keVar.c;
                    StringBuilder sb2 = new StringBuilder();
                    Iterator it = ((ArrayDeque) keVar.e).iterator();
                    while (it.hasNext()) {
                        sb2.append((String) it.next());
                        sb2.append((String) keVar.d);
                    }
                    edit.putString(str, sb2.toString()).apply();
                }
                return;
            case 8:
                z zVar = (z) this.b;
                Log.w("FirebaseMessaging", "Service took too long to process intent: " + zVar.a.getAction() + " finishing.");
                zVar.b.trySetResult(null);
                return;
            default:
                j jVar = (j) this.b;
                jVar.f();
                jVar.e(true);
                return;
        }
    }
}
