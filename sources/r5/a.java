package r5;

import android.graphics.Bitmap;
import android.os.Looper;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.AlarmManagerSchedulerBroadcastReceiver;
import ig.b0;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.t2;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.jd1;
import rf.x;
import rh.e6;
import rh.h8;
import th.e5;
import th.h4;
import th.w0;
import xh.m2;
import zh.h;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements Runnable {
    public final /* synthetic */ int a;

    public /* synthetic */ a(int i10) {
        this.a = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        k2 b02;
        int i10 = 1;
        switch (this.a) {
            case 0:
                int i11 = AlarmManagerSchedulerBroadcastReceiver.a;
                break;
            case 1:
                a5.a aVar = rf.e.B;
                if (aVar != null) {
                    ArrayList arrayList = null;
                    for (int i12 = 0; i12 < rf.e.y; i12++) {
                        if (((Bitmap[]) aVar.d)[i12] != null) {
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                            }
                            arrayList.add(((Bitmap[]) aVar.d)[i12]);
                        }
                        ((Bitmap[]) aVar.d)[i12] = null;
                        ((x[]) aVar.c)[i12] = null;
                    }
                    if (!arrayList.isEmpty()) {
                        Utilities.e.c(new b0(i10, arrayList));
                    }
                    rf.e.B = null;
                    break;
                }
                break;
            case 2:
                k2 T = LaunchActivity.T();
                if ((T instanceof jd1) && (b02 = ((jd1) T).b0()) != null) {
                    T = b02;
                }
                wb Q = (T != null ? cc.a0(T) : cc.X()).Q(R.raw.ic_delete, 36, cd.L0(2131750225, null));
                Q.t = true;
                Q.j();
                break;
            case 3:
                t2.D.a();
                break;
            case 4:
                k2 T2 = LaunchActivity.T();
                if (T2 != null) {
                    T2.presentFragment(new h8());
                    break;
                }
                break;
            case 5:
                e6[][] e6VarArr = e6.S;
                break;
            case 6:
                zs.e().k(99, 512);
                break;
            case 7:
                break;
            case 8:
                zs.e().k(zs.F2, new Object[0]);
                break;
            case 9:
                w0.b();
                break;
            case 10:
                w0 w0Var = w0.Z;
                w0Var.e.invalidate();
                if (!w0Var.e.isInLayout()) {
                    w0Var.e.requestLayout();
                    w0Var.d.requestLayout();
                    w0Var.f.requestLayout();
                    break;
                }
                break;
            case 11:
                int i13 = h4.n1;
                break;
            case 12:
                Comparator comparator = e5.X;
                break;
            case 13:
                int i14 = vh.x.x0;
                break;
            case 14:
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    break;
                }
                break;
            case 15:
                break;
            case 16:
                vp.d1().edit().putInt("storydualhint", vp.d1().getInt("storydualhint", 0) + 1).apply();
                break;
            case 17:
                HashSet hashSet = m2.a1;
                break;
            case 18:
                break;
            default:
                int i15 = h.H;
                break;
        }
    }

    private final void a() {
    }

    private final void b() {
    }

    private final void c() {
    }
}
