package tg;

import android.graphics.Rect;
import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationUtils;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.a8;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.up0;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class y implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x00cd, code lost:
    
        if (r12 < 0) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00f0, code lost:
    
        if (r12 > 0) goto L50;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        int R;
        int i7;
        l2.i0 i0Var;
        int i10 = this.a;
        int i11 = 0;
        Object obj = this.b;
        switch (i10) {
            case 0:
                j jVar = ((up0) obj).B0;
                if (jVar instanceof k2) {
                    ((k2) jVar).getEditText();
                    return;
                }
                return;
            case 1:
                u0.d dVar = (u0.d) obj;
                m.s1 s1Var = dVar.c;
                u0.a aVar = dVar.a;
                if (dVar.E) {
                    if (dVar.y) {
                        dVar.y = false;
                        long currentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
                        aVar.e = currentAnimationTimeMillis;
                        aVar.g = -1L;
                        aVar.f = currentAnimationTimeMillis;
                        aVar.h = 0.5f;
                    }
                    if ((aVar.g > 0 && AnimationUtils.currentAnimationTimeMillis() > aVar.g + aVar.i) || !dVar.e()) {
                        dVar.E = false;
                        return;
                    }
                    if (dVar.D) {
                        dVar.D = false;
                        long uptimeMillis = SystemClock.uptimeMillis();
                        MotionEvent obtain = MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0);
                        s1Var.onTouchEvent(obtain);
                        obtain.recycle();
                    }
                    if (aVar.f == 0) {
                        throw new RuntimeException("Cannot compute scroll delta before calling start()");
                    }
                    long currentAnimationTimeMillis2 = AnimationUtils.currentAnimationTimeMillis();
                    float a10 = aVar.a(currentAnimationTimeMillis2);
                    long j3 = currentAnimationTimeMillis2 - aVar.f;
                    aVar.f = currentAnimationTimeMillis2;
                    dVar.G.scrollListBy((int) (j3 * ((a10 * 4.0f) + ((-4.0f) * a10 * a10)) * aVar.d));
                    WeakHashMap weakHashMap = r0.i0.a;
                    s1Var.postOnAnimation(this);
                    return;
                }
                return;
            case 2:
                ug.s0 s0Var = (ug.s0) obj;
                ArrayList arrayList = s0Var.n3;
                if (s0Var.u3) {
                    if (!arrayList.isEmpty() && (R = RecyclerView.R((ug.i1) jg.g.i(1, arrayList))) >= 0) {
                        View m10 = s0Var.f3.m(R + 1);
                        if (m10 != null) {
                            s0Var.k3 = false;
                            s0Var.z1(m10, true);
                            s0Var.w0(0, m10.getTop() - ((s0Var.getMeasuredHeight() - m10.getMeasuredHeight()) / 2), org.telegram.messenger.g0.H);
                        }
                    }
                    s0Var.A1();
                    return;
                }
                return;
            case 3:
                ug.q1 q1Var = (ug.q1) obj;
                try {
                    ug.p1 p1Var = q1Var.a;
                    if (p1Var != null) {
                        p1Var.g();
                        q1Var.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e10) {
                    a8.g(e10, true);
                    return;
                }
            case 4:
                v4.y yVar = (v4.y) obj;
                v4.v vVar = yVar.y;
                if (yVar.c != null) {
                    long currentTimeMillis = System.currentTimeMillis();
                    long j10 = yVar.R;
                    long j11 = j10 != Long.MIN_VALUE ? currentTimeMillis - j10 : 0L;
                    v4.n0 layoutManager = yVar.H.getLayoutManager();
                    if (yVar.Q == null) {
                        yVar.Q = new Rect();
                    }
                    layoutManager.c(yVar.c.a, yVar.Q);
                    if (layoutManager.d()) {
                        int i12 = (int) (yVar.s + yVar.n);
                        i7 = (i12 - yVar.Q.left) - yVar.H.getPaddingLeft();
                        float f10 = yVar.n;
                        if (f10 < 0.0f) {
                        }
                        if (f10 > 0.0f) {
                            i7 = ((yVar.c.a.getWidth() + i12) + yVar.Q.right) - (yVar.H.getWidth() - yVar.H.getPaddingRight());
                            break;
                        }
                    }
                    i7 = 0;
                    if (layoutManager.e()) {
                        int i13 = (int) (yVar.w + yVar.r);
                        int paddingTop = (i13 - yVar.Q.top) - yVar.H.getPaddingTop();
                        float f11 = yVar.r;
                        if ((f11 < 0.0f && paddingTop < 0) || (f11 > 0.0f && (paddingTop = ((yVar.c.a.getHeight() + i13) + yVar.Q.bottom) - (yVar.H.getHeight() - yVar.H.getPaddingBottom())) > 0)) {
                            i11 = paddingTop;
                        }
                    }
                    if (i7 != 0) {
                        int width = yVar.c.a.getWidth();
                        yVar.H.getWidth();
                        i7 = vVar.i(width, i7, j11);
                    }
                    if (i11 != 0) {
                        int height = yVar.c.a.getHeight();
                        yVar.H.getHeight();
                        i11 = vVar.i(height, i11, j11);
                    }
                    if (i7 == 0 && i11 == 0) {
                        yVar.R = Long.MIN_VALUE;
                        return;
                    }
                    if (yVar.R == Long.MIN_VALUE) {
                        yVar.R = currentTimeMillis;
                    }
                    yVar.H.scrollBy(i7, i11);
                    v4.d1 d1Var = yVar.c;
                    if (d1Var != null) {
                        yVar.p(d1Var);
                    }
                    yVar.H.removeCallbacks(yVar.I);
                    RecyclerView recyclerView = yVar.H;
                    WeakHashMap weakHashMap2 = r0.i0.a;
                    recyclerView.postOnAnimation(this);
                    return;
                }
                return;
            case 5:
                wg.w0 w0Var = (wg.w0) obj;
                String str = w0Var.f2;
                if (str != null) {
                    w0Var.f1(w0Var.j2, str, false);
                    return;
                }
                return;
            case 6:
                wg.f1 f1Var = (wg.f1) obj;
                String str2 = f1Var.g2;
                if (str2 != null) {
                    if (f1Var.p2 >= 0) {
                        ConnectionsManager.getInstance(f1Var.a).cancelRequest(f1Var.p2, true);
                        f1Var.p2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str2;
                    f1Var.p2 = ConnectionsManager.getInstance(f1Var.a).sendRequest(tL_contacts_search, new bi.j0(f1Var, 25));
                    return;
                }
                return;
            default:
                wi.t0 t0Var = (wi.t0) obj;
                if (t0Var.Z == 5 && (i0Var = t0Var.V) != null && t0Var.z) {
                    long l10 = i0Var.l();
                    long j12 = t0Var.J;
                    if (l10 < j12 || l10 >= t0Var.K) {
                        t0Var.V.Z0(5, j12);
                    }
                    t0Var.d.getClass();
                    t0Var.i.postDelayed(this, 33L);
                    return;
                }
                return;
        }
    }
}
