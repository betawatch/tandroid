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

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final /* synthetic */ class sma implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sma(Object obj, long j, byte b) {
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
                u21.b0((jva) obj).I(R.raw.stars_topup, k96.M0(2131750205, null), k96.H(',', "Gift2Converted", (int) j)).k(true);
                return;
            case 2:
                u21.b0((uxa) obj).I(R.raw.stars_topup, k96.M0(2131750205, null), k96.H(',', "Gift2ConvertedChannel", (int) j)).k(true);
                return;
            case 3:
                d d0 = uxa.d0(na7.q1(((g2b) obj).a).K0(Long.valueOf(-j)), true);
                d Q = LaunchActivity.Q();
                if (Q != null) {
                    t7b t7bVar = t7b.G2;
                    if (t7bVar == null || !t7bVar.d) {
                        Q.presentFragment(d0);
                        return;
                    }
                    ag0 ag0Var = new ag0();
                    ag0Var.a = true;
                    Q.showAsSheet(d0, ag0Var);
                    return;
                }
                return;
            case 4:
                ad7 ad7Var = ((s2b) obj).b;
                SQLiteDatabase sQLiteDatabase = ad7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    ad7Var.n(th, true);
                    return;
                }
            case 5:
                t5b t5bVar = (t5b) obj;
                Context context = t5bVar.getContext();
                y5b y5bVar = t5bVar.a0;
                d dVar = y5bVar.i1;
                int i2 = y5b.X1;
                ij.P(context, dVar, y5bVar.J0, new rz1((Object) t5bVar, j, (byte) 11));
                return;
            case 6:
                t7b t7bVar2 = (t7b) obj;
                o7b o7bVar = t7bVar2.G;
                if (o7bVar != null) {
                    o7bVar.f(true);
                    t7bVar2.G = null;
                }
                k7b k7bVar = t7bVar2.y;
                o7b b2 = k7bVar != null ? k7bVar.b(j) : null;
                t7bVar2.G = b2;
                if (b2 != null) {
                    t7bVar2.K = b2.a;
                    t7bVar2.r.c();
                    g7b g7bVar = t7bVar2.i0;
                    boolean z = t7bVar2.K;
                    if (!z && z) {
                        i = -14737633;
                    }
                    g7bVar.setBackgroundColor(i);
                    t7bVar2.I.set(t7bVar2.G.c);
                    o7b o7bVar2 = t7bVar2.G;
                    t7bVar2.H = o7bVar2.b;
                    o7bVar2.e();
                    if (gba.o() > 1) {
                        e66.e(360928);
                    }
                }
                t7bVar2.y = null;
                Activity activity = t7bVar2.b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).y0.post(new d6b(t7bVar2, (byte) 5));
                    return;
                } else {
                    t7bVar2.o(true);
                    return;
                }
            case 7:
                eob eobVar = ((kob) obj).a;
                if (eobVar != null) {
                    eobVar.y(j, false);
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
