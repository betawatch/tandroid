// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class sv implements Runnable {
    public static final /* synthetic */ sv b = new sv(14);
    public final /* synthetic */ byte a;

    public sv(u39 u39Var, int i) {
        this.a = (byte) 1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                return;
            case 6:
                ArrayList arrayList = eo3.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    eo3.j = null;
                    return;
                }
                ArrayList arrayList2 = eo3.j;
                eo3.j = null;
                if (eo3.k == null) {
                    int max = Math.max(1, Runtime.getRuntime().availableProcessors());
                    eo3 eo3Var = new eo3();
                    eo3Var.a = new ArrayList(10);
                    eo3Var.b = new SparseIntArray();
                    eo3Var.c = new ArrayList(10);
                    eo3Var.i = new o1(eo3Var, (byte) 24);
                    eo3Var.d = max;
                    eo3Var.f = Utilities.b.nextInt();
                    eo3.k = eo3Var;
                }
                Utilities.e.c(new se(arrayList2, (byte) 4));
                return;
            case 7:
                try {
                    int i = mxb.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (lw3.j != null) {
                        lw3.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = mxb.a;
                    Trace.endSection();
                    throw th;
                }
            case 8:
                return;
            case 9:
                String[] strArr = MediaController.W1;
                return;
            case 10:
                Utilities.b.nextInt();
                kz4[] kz4VarArr = x2b.a;
                kk7.f(y6c.t0).k(2, 0);
                gl.e3(x2b.o, 1000L);
                LaunchActivity.Q().getFragmentView();
                return;
            case 11:
                bkb.j = false;
                bkb.l(false);
                return;
            case 12:
                bkb.k = false;
                bkb.l(true);
                return;
            case 13:
                xgc xgcVar = xgc.U;
                if (xgcVar != null) {
                    wgc wgcVar = xgcVar.b;
                    int i3 = wgc.h;
                    gl.r(wgcVar.f.O);
                    return;
                }
                return;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            default:
                return;
        }
    }

    public /* synthetic */ sv(x43 x43Var, String str, Bundle bundle, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ sv(Binder binder, Object obj, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ sv(Object obj, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ sv(byte b2) {
        this.a = b2;
    }

    public sv(x43 x43Var, int i, Bundle bundle) {
        this.a = (byte) 2;
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }

    private final void e() {
    }

    private final void f() {
    }

    private final void g() {
    }

    private final /* synthetic */ void h() {
    }

    private final void i() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }

    private final void n() {
    }

    private final void o() {
    }

    private final void p() {
    }
}
