// default package

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class toa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ toa(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        int i = 0;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                ((x0) obj).a(Long.valueOf(j));
                return;
            case 1:
                c41.b0((nxa) obj).I(R.raw.stars_topup, jb6.M0(2131750154, null), jb6.H(',', "Gift2Converted", (int) j)).k(true);
                return;
            case 2:
                c41.b0((xza) obj).I(R.raw.stars_topup, jb6.M0(2131750154, null), jb6.H(',', "Gift2ConvertedChannel", (int) j)).k(true);
                return;
            case 3:
                d e0 = xza.e0(oc7.r1(((h4b) obj).a).L0(Long.valueOf(-j)), true);
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    v9b v9bVar = v9b.G2;
                    if (v9bVar == null || !v9bVar.d) {
                        Q.presentFragment(e0);
                        return;
                    }
                    bh0 bh0Var = new bh0();
                    bh0Var.a = true;
                    Q.showAsSheet(e0, bh0Var);
                    return;
                }
                return;
            case 4:
                cf7 cf7Var = ((t4b) obj).b;
                SQLiteDatabase sQLiteDatabase = cf7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    cf7Var.n(th, true);
                    return;
                }
            case 5:
                v7b v7bVar = (v7b) obj;
                Context context = v7bVar.getContext();
                a8b a8bVar = v7bVar.a0;
                d dVar = a8bVar.i1;
                int i2 = a8b.X1;
                ik.P(context, dVar, a8bVar.J0, new d12((Object) v7bVar, j, (byte) 11));
                return;
            case 6:
                v9b v9bVar2 = (v9b) obj;
                q9b q9bVar = v9bVar2.G;
                if (q9bVar != null) {
                    q9bVar.f(true);
                    v9bVar2.G = null;
                }
                m9b m9bVar = v9bVar2.y;
                q9b b2 = m9bVar != null ? m9bVar.b(j) : null;
                v9bVar2.G = b2;
                if (b2 != null) {
                    v9bVar2.K = b2.a;
                    v9bVar2.r.c();
                    i9b i9bVar = v9bVar2.i0;
                    boolean z = v9bVar2.K;
                    if (!z && z) {
                        i = -14737633;
                    }
                    i9bVar.setBackgroundColor(i);
                    v9bVar2.I.set(v9bVar2.G.c);
                    q9b q9bVar2 = v9bVar2.G;
                    v9bVar2.H = q9bVar2.b;
                    q9bVar2.e();
                    if (gda.o() > 1) {
                        e86.e(360928);
                    }
                }
                v9bVar2.y = null;
                Activity activity = v9bVar2.b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).y0.post(new f8b(v9bVar2, (byte) 5));
                    return;
                } else {
                    v9bVar2.o(true);
                    return;
                }
            case 7:
                fqb fqbVar = ((lqb) obj).a;
                if (fqbVar != null) {
                    fqbVar.C(j, false);
                    return;
                }
                return;
            case 8:
                ((VideoCapturerDevice) obj).lambda$init$3(j);
                return;
            case 9:
                ((VideoPlayerHolderBase) obj).lambda$seekTo$11(j);
                return;
            default:
                z zVar = (z) obj;
                Trace.beginSection("WidgetSandbox:Destroy");
                try {
                    zVar.c.d(j);
                    return;
                } finally {
                    Trace.endSection();
                }
        }
    }
}
