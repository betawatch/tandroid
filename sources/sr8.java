// default package

import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class sr8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sr8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0155  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        FirebaseMessaging firebaseMessaging;
        Task task;
        byte b = this.a;
        boolean z = false;
        byte b2 = 1;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((u1b) obj).e();
                return;
            case 1:
                int i = ProfileStoriesView.t0;
                gl.W3((ProfileStoriesView) obj);
                return;
            case 2:
                try {
                    st8 st8Var = ((rt8) obj).b;
                    if (st8Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) st8Var.getParent()).removeView(st8Var);
                    }
                    st8Var.R.run();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 3:
                zt8 zt8Var = (zt8) obj;
                zt8Var.a = true;
                int i2 = y6c.t0;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    ArrayList arrayList = gba.v1;
                    if (i3 >= arrayList.size()) {
                        if (z2) {
                            return;
                        }
                        zt8Var.a = false;
                        zt8Var.a();
                        return;
                    }
                    fba fbaVar = (fba) arrayList.get(i3);
                    if (!fbaVar.c && SystemClock.elapsedRealtime() - fbaVar.e >= 120000) {
                        fbaVar.c = true;
                        ConnectionsManager.getInstance(i2).checkProxy(fbaVar.a, new wt8(fbaVar, b2));
                        z2 = true;
                    }
                    i3++;
                }
                break;
            case 4:
                b bVar = (b) obj;
                try {
                    gba.h = SystemClock.elapsedRealtime();
                    jg4.f(a.b);
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(jg4.c());
                    }
                    byte b3 = 8;
                    if (firebaseMessaging.d.w()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.g.execute(new vc4(firebaseMessaging, taskCompletionSource, b3));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new sc8(bVar, b3));
                    return;
                } catch (Throwable th) {
                    fa4.g(th, true);
                    return;
                }
            case 5:
                ((au0) obj).a(Boolean.FALSE);
                return;
            case 6:
                kk7.f(((ox8) obj).a).k(kk7.E1, new Object[0]);
                return;
            case 7:
                ((RLottieNative) obj).d();
                return;
            case 8:
                t09 t09Var = (t09) obj;
                t09Var.y0 = null;
                t09Var.g();
                s09 s09Var = t09Var.h0;
                if (s09Var != null) {
                    s09Var.A();
                    return;
                }
                return;
            case 9:
                ((q09) obj).I.a.setVisibility(4);
                return;
            case 10:
                ((c29) obj).c.g3.O(true);
                return;
            case 11:
                ((b29) obj).a();
                return;
            case 12:
                f29 f29Var = (f29) ((ux0) obj).q;
                f29Var.R = System.currentTimeMillis();
                f29Var.S = 0L;
                f29Var.s0 = true;
                ((t6b) f29Var.a).a.K0.a(0L, true);
                f29Var.invalidate();
                return;
            case 13:
                ((jw1) obj).a();
                return;
            case 14:
                i29 i29Var = (i29) obj;
                lbc lbcVar = i29Var.n;
                if (lbcVar != null) {
                    boolean c0 = lbcVar.c0();
                    float S = i29Var.n.S() / i29Var.n.U();
                    float f = i29Var.s;
                    if (S < f) {
                        i29Var.n.p0((long) (f * r1.U()), false);
                    } else if (S > i29Var.w || (i29Var.d0 && !c0 && i29Var.x && i29Var.n.S() >= i29Var.n.U() - 50)) {
                        i29Var.setPlaying(false);
                        if (z) {
                            gl.d3(i29Var.y, 16L);
                        }
                        if (i29Var.d0) {
                            i29Var.i(true);
                        }
                    }
                    z = c0;
                    if (z) {
                    }
                    if (i29Var.d0) {
                    }
                }
                i29Var.invalidate();
                return;
            case 15:
                o39 o39Var = (o39) obj;
                o39Var.U1 = null;
                o39Var.T1 = null;
                ff0 ff0Var = o39Var.C1;
                if (ff0Var != null) {
                    Drawable current = ff0Var.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                ff0 ff0Var2 = o39Var.C1;
                if (ff0Var2 == null || !ff0Var2.isStateful()) {
                    return;
                }
                o39Var.C1.setState(StateSet.NOTHING);
                return;
            case 16:
                ((a79) ((bg7) obj).b).E.a.q();
                return;
            case 17:
                ((q99) obj).c.a(Boolean.TRUE);
                return;
            case 18:
                gl.E3(((gb9) obj).Z1.d);
                return;
            case 19:
                ((mb9) obj).invalidate();
                return;
            case 20:
                eq2 eq2Var = (eq2) obj;
                eq2Var.c = null;
                eq2Var.d = null;
                eq2Var.e = null;
                eq2Var.f = null;
                eq2Var.x(null);
                return;
            case 21:
                ((ed9) obj).invalidateSelf();
                return;
            case 22:
                ((ld9) obj).c();
                return;
            case 23:
                ig9 ig9Var = (ig9) obj;
                rh9 rh9Var = ig9Var.e;
                if (rh9Var == null || !rh9Var.G()) {
                    ig9Var.w.k0();
                    return;
                }
                return;
            case 24:
                View view = ((pg9) obj).W;
                if (view != null) {
                    view.invalidate();
                    return;
                }
                return;
            case 25:
                View view2 = ((qg9) obj).h;
                if (view2 != null) {
                    view2.invalidate();
                    return;
                }
                return;
            case 26:
                bb2 bb2Var = ((rh9) obj).F;
                if (bb2Var != null) {
                    bb2Var.p();
                    return;
                }
                return;
            case 27:
                qh9 qh9Var = (qh9) obj;
                qh9Var.K = null;
                if (qh9Var.R == null) {
                    if (qh9Var.N != null) {
                        qh9Var.L = true;
                        View view3 = qh9Var.T;
                        if (view3 != null) {
                            try {
                                view3.performHapticFeedback(0);
                            } catch (Exception unused) {
                            }
                        }
                        qh9Var.l(qh9Var.N, true);
                        i46 i46Var = qh9Var.J;
                        if (i46Var != null) {
                            i46Var.e(true);
                            return;
                        }
                        return;
                    }
                    return;
                }
                qh9Var.L = true;
                View view4 = qh9Var.T;
                if (view4 != null) {
                    try {
                        view4.performHapticFeedback(0);
                    } catch (Exception unused2) {
                    }
                }
                qg9 qg9Var = qh9Var.R;
                rh9 rh9Var2 = qh9Var.a;
                gb2 gb2Var = rh9Var2.E;
                bb2 bb2Var2 = rh9Var2.F;
                qg9Var.getClass();
                if (gb2Var == null || bb2Var2 == null) {
                    return;
                }
                bb2Var2.v0(gb2Var, qg9Var.b);
                return;
            case 28:
                zi9 zi9Var = (zi9) obj;
                if (!zi9Var.f0 || zi9Var.k0() == zi9Var.j0) {
                    return;
                }
                zi9Var.q0("on screen, settled after start", true);
                return;
            default:
                ((rh3) obj).invalidate();
                return;
        }
    }
}
