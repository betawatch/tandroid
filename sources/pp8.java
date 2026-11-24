// default package

import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.os.SystemClock;
import android.util.StateSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import java.util.ArrayList;
import org.telegram.messenger.a;
import org.telegram.messenger.b;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.RLottieNative;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.Stories.ProfileStoriesView;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final /* synthetic */ class pp8 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pp8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d0  */
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
                ProfileActivity profileActivity = ((sp8) obj).b;
                RectF rectF = ProfileActivity.e7;
                profileActivity.getMessagesController().l5(profileActivity.e1, 0, true, new gp2(profileActivity, true, b2));
                return;
            case 1:
                wp8 wp8Var = (wp8) obj;
                wp8Var.T0(wp8Var.getTabProgress());
                return;
            case 2:
                ((nq8) obj).c();
                return;
            case 3:
                ((cr8) obj).a();
                return;
            case 4:
                zq8 zq8Var = (zq8) obj;
                zq8Var.f.add(zq8Var.c);
                zq8Var.a();
                return;
            case 5:
                Runnable[] runnableArr = (Runnable[]) obj;
                runnableArr[0].run();
                runnableArr[0] = null;
                return;
            case 6:
                ((tt8) obj).invalidate();
                return;
            case 7:
                ut8 ut8Var = (ut8) obj;
                if (ut8Var.getParent() instanceof r59) {
                    ((r59) ut8Var.getParent()).getOnItemClickListener().g(RecyclerView.R(ut8Var), ut8Var);
                    return;
                } else {
                    ut8Var.callOnClick();
                    return;
                }
            case 8:
                ((v3b) obj).e();
                return;
            case 9:
                int i = ProfileStoriesView.t0;
                gm.W3((ProfileStoriesView) obj);
                return;
            case 10:
                try {
                    tv8 tv8Var = ((sv8) obj).b;
                    if (tv8Var.getParent() instanceof ViewGroup) {
                        ((ViewGroup) tv8Var.getParent()).removeView(tv8Var);
                    }
                    tv8Var.R.run();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 11:
                aw8 aw8Var = (aw8) obj;
                aw8Var.a = true;
                int i2 = z8c.t0;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    ArrayList arrayList = gda.v1;
                    if (i3 >= arrayList.size()) {
                        if (z2) {
                            return;
                        }
                        aw8Var.a = false;
                        aw8Var.a();
                        return;
                    }
                    fda fdaVar = (fda) arrayList.get(i3);
                    if (!fdaVar.c && SystemClock.elapsedRealtime() - fdaVar.e >= 120000) {
                        fdaVar.c = true;
                        ConnectionsManager.getInstance(i2).checkProxy(fdaVar.a, new xv8(fdaVar, b2));
                        z2 = true;
                    }
                    i3++;
                }
                break;
            case 12:
                b bVar = (b) obj;
                try {
                    gda.h = SystemClock.elapsedRealtime();
                    li4.f(a.b);
                    synchronized (FirebaseMessaging.class) {
                        firebaseMessaging = FirebaseMessaging.getInstance(li4.c());
                    }
                    if (firebaseMessaging.d.z()) {
                        task = Tasks.forException(new IllegalStateException("API disabled. Please use {@link #register()} instead or enable this API by removing {@code <meta-data android:name=\"firebase_messaging_installation_id_enabled\" android:value=\"true\" />} from your app's manifest."));
                    } else {
                        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
                        firebaseMessaging.g.execute(new ve4(firebaseMessaging, taskCompletionSource, (byte) 9));
                        task = taskCompletionSource.getTask();
                    }
                    task.addOnCompleteListener(new i98(bVar, (byte) 10));
                    return;
                } catch (Throwable th) {
                    fc4.g(th, true);
                    return;
                }
            case 13:
                ((jv0) obj).a(Boolean.FALSE);
                return;
            case 14:
                nm7.f(((pz8) obj).a).k(nm7.F1, new Object[0]);
                return;
            case 15:
                ((RLottieNative) obj).d();
                return;
            case 16:
                v29 v29Var = (v29) obj;
                v29Var.y0 = null;
                v29Var.g();
                u29 u29Var = v29Var.h0;
                if (u29Var != null) {
                    u29Var.o();
                    return;
                }
                return;
            case 17:
                ((s29) obj).I.a.setVisibility(4);
                return;
            case 18:
                ((g49) obj).c.g3.O(true);
                return;
            case 19:
                ((f49) obj).a();
                return;
            case 20:
                j49 j49Var = (j49) ((bz0) obj).q;
                j49Var.R = System.currentTimeMillis();
                j49Var.S = 0L;
                j49Var.s0 = true;
                ((v8b) j49Var.a).a.K0.a(0L, true);
                j49Var.invalidate();
                return;
            case 21:
                ((wx1) obj).a();
                return;
            case 22:
                l49 l49Var = (l49) obj;
                ndc ndcVar = l49Var.n;
                if (ndcVar != null) {
                    boolean c0 = ndcVar.c0();
                    float S = l49Var.n.S() / l49Var.n.U();
                    float f = l49Var.s;
                    if (S < f) {
                        l49Var.n.p0((long) (f * r2.U()), false);
                    } else if (S > l49Var.w || (l49Var.d0 && !c0 && l49Var.x && l49Var.n.S() >= l49Var.n.U() - 50)) {
                        l49Var.setPlaying(false);
                        if (z) {
                            gm.d3(l49Var.y, 16L);
                        }
                        if (l49Var.d0) {
                            l49Var.i(true);
                        }
                    }
                    z = c0;
                    if (z) {
                    }
                    if (l49Var.d0) {
                    }
                }
                l49Var.invalidate();
                return;
            case 23:
                r59 r59Var = (r59) obj;
                r59Var.U1 = null;
                r59Var.T1 = null;
                fg0 fg0Var = r59Var.C1;
                if (fg0Var != null) {
                    Drawable current = fg0Var.getCurrent();
                    if (current instanceof TransitionDrawable) {
                        ((TransitionDrawable) current).resetTransition();
                    }
                }
                fg0 fg0Var2 = r59Var.C1;
                if (fg0Var2 == null || !fg0Var2.isStateful()) {
                    return;
                }
                r59Var.C1.setState(StateSet.NOTHING);
                return;
            case 24:
                ((c99) ((ei7) obj).b).E.a.w();
                return;
            case 25:
                ((qb9) obj).c.a(Boolean.TRUE);
                return;
            case 26:
                gm.E3(((gd9) obj).Z1.d);
                return;
            case 27:
                ((md9) obj).invalidate();
                return;
            case 28:
                pr2 pr2Var = (pr2) obj;
                pr2Var.c = null;
                pr2Var.d = null;
                pr2Var.e = null;
                pr2Var.f = null;
                pr2Var.x(null);
                return;
            default:
                ((gf9) obj).invalidateSelf();
                return;
        }
    }
}
