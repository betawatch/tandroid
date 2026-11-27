// default package

import android.os.Binder;
import android.os.Bundle;
import android.os.Trace;
import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class tv implements Runnable {
    public static final /* synthetic */ tv b = new tv(14);
    public final /* synthetic */ byte a;

    public tv(ve9 ve9Var, int i) {
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
                ArrayList arrayList = vo3.j;
                if (arrayList == null || arrayList.isEmpty()) {
                    vo3.j = null;
                    return;
                }
                ArrayList arrayList2 = vo3.j;
                vo3.j = null;
                if (vo3.k == null) {
                    int max = Math.max(1, Runtime.getRuntime().availableProcessors());
                    vo3 vo3Var = new vo3();
                    vo3Var.a = new ArrayList(10);
                    vo3Var.b = new SparseIntArray();
                    vo3Var.c = new ArrayList(10);
                    vo3Var.i = new p1(vo3Var, (byte) 24);
                    vo3Var.d = max;
                    vo3Var.f = Utilities.b.nextInt();
                    vo3.k = vo3Var;
                }
                Utilities.e.c(new se(arrayList2, (byte) 4));
                return;
            case 7:
                try {
                    int i = n1c.a;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (gx3.j != null) {
                        gx3.a().c();
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    int i2 = n1c.a;
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
                o15[] o15VarArr = t6b.a;
                jn7.f(yac.t0).k(2, 0);
                hl.d3(t6b.o, 1000L);
                LaunchActivity.Q().getFragmentView();
                return;
            case 11:
                aob.j = false;
                aob.l(false);
                return;
            case 12:
                aob.k = false;
                aob.l(true);
                return;
            case 13:
                dlc dlcVar = dlc.U;
                if (dlcVar != null) {
                    clc clcVar = dlcVar.b;
                    int i3 = clc.h;
                    hl.r(clcVar.f.O);
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

    public /* synthetic */ tv(p53 p53Var, String str, Bundle bundle, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ tv(Binder binder, Object obj, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ tv(Object obj, byte b2) {
        this.a = b2;
    }

    public /* synthetic */ tv(byte b2) {
        this.a = b2;
    }

    public tv(p53 p53Var, int i, Bundle bundle) {
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
