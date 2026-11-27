// default package

import android.app.Activity;
import android.content.Context;
import android.os.Trace;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.video.VideoPlayerHolderBase;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.utils.twidget.z;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final /* synthetic */ class pqa implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ pqa(Object obj, long j, byte b) {
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
                ((y0) obj).a(Long.valueOf(j));
                return;
            case 1:
                d31.b0((nza) obj).I(R.raw.stars_topup, ob6.M0(2131750180, null), ob6.H(',', "Gift2Converted", (int) j)).k(true);
                return;
            case 2:
                d31.b0((w1b) obj).I(R.raw.stars_topup, ob6.M0(2131750180, null), ob6.H(',', "Gift2ConvertedChannel", (int) j)).k(true);
                return;
            case 3:
                e d0 = w1b.d0(uc7.s1(((c6b) obj).a).M0(Long.valueOf(-j)), true);
                e Q = LaunchActivity.Q();
                if (Q != null) {
                    sbb sbbVar = sbb.G2;
                    if (sbbVar == null || !sbbVar.d) {
                        Q.presentFragment(d0);
                        return;
                    }
                    bg0 bg0Var = new bg0();
                    bg0Var.a = true;
                    Q.showAsSheet(d0, bg0Var);
                    return;
                }
                return;
            case 4:
                kf7 kf7Var = ((o6b) obj).b;
                SQLiteDatabase sQLiteDatabase = kf7Var.b;
                try {
                    Locale locale = Locale.US;
                    sQLiteDatabase.executeFast("DELETE FROM stories WHERE dialog_id = " + j).stepThis().dispose();
                    return;
                } catch (Throwable th) {
                    kf7Var.p(th, true);
                    return;
                }
            case 5:
                r9b r9bVar = (r9b) obj;
                Context context = r9bVar.getContext();
                w9b w9bVar = r9bVar.a0;
                e eVar = w9bVar.i1;
                int i2 = w9b.X1;
                jj.P(context, eVar, w9bVar.J0, new i02((Object) r9bVar, j, (byte) 11));
                return;
            case 6:
                sbb sbbVar2 = (sbb) obj;
                nbb nbbVar = sbbVar2.G;
                if (nbbVar != null) {
                    nbbVar.f(true);
                    sbbVar2.G = null;
                }
                jbb jbbVar = sbbVar2.y;
                nbb b2 = jbbVar != null ? jbbVar.b(j) : null;
                sbbVar2.G = b2;
                if (b2 != null) {
                    sbbVar2.K = b2.a;
                    sbbVar2.r.c();
                    fbb fbbVar = sbbVar2.i0;
                    boolean z = sbbVar2.K;
                    if (!z && z) {
                        i = -14737633;
                    }
                    fbbVar.setBackgroundColor(i);
                    sbbVar2.I.set(sbbVar2.G.c);
                    nbb nbbVar2 = sbbVar2.G;
                    sbbVar2.H = nbbVar2.b;
                    nbbVar2.e();
                    if (xea.o() > 1) {
                        i86.e(360928);
                    }
                }
                sbbVar2.y = null;
                Activity activity = sbbVar2.b;
                if (activity instanceof LaunchActivity) {
                    ((LaunchActivity) activity).y0.post(new bab(sbbVar2, (byte) 4));
                    return;
                } else {
                    sbbVar2.o(true);
                    return;
                }
            case 7:
                esb esbVar = ((ksb) obj).a;
                if (esbVar != null) {
                    esbVar.C(j, false);
                    return;
                }
                return;
            case 8:
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
