// default package

import android.app.NotificationManager;
import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.gms.tasks.TaskCompletionSource;
import j$.util.Objects;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.ThemeEditorView;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class xia implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    public xia(i2d i2dVar) {
        this.a = (byte) 22;
        Objects.requireNonNull(i2dVar);
        this.b = i2dVar;
    }

    private final void a() {
        u9d u9dVar = (u9d) this.b;
        synchronized (u9d.i) {
            if (u9dVar.d()) {
                u9dVar.f(15);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b9 b9Var;
        hu7 hu7Var;
        g98 g98Var;
        int i;
        ymd ymdVar;
        ljd ljdVar;
        r3b r3bVar = null;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                throw null;
            case 1:
                cra craVar = (cra) this.b;
                try {
                    bra braVar = craVar.a;
                    if (braVar != null) {
                        braVar.g();
                        craVar.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 2:
                ((uxa) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                yxa yxaVar = (yxa) this.b;
                int[][] iArr = yxaVar.f;
                int[][] iArr2 = yxaVar.e;
                long[][] jArr = yxaVar.d;
                long[][] jArr2 = yxaVar.c;
                RandomAccessFile randomAccessFile = yxaVar.r;
                dm5 dm5Var = yxaVar.s;
                if (Math.abs(currentTimeMillis - yxaVar.b) < 2000) {
                    return;
                }
                yxaVar.b = currentTimeMillis;
                try {
                    dm5Var.b();
                    int i2 = 0;
                    while (true) {
                        int i3 = 7;
                        if (i2 >= 3) {
                            int[][] iArr3 = iArr2;
                            for (int i4 = 0; i4 < 3; i4++) {
                                dm5Var.write(yxaVar.k(jArr2[i4][7]), 0, 8);
                                dm5Var.write(yxaVar.k(jArr[i4][7]), 0, 8);
                                dm5Var.write(yxaVar.j(iArr3[i4][7]), 0, 4);
                                dm5Var.write(yxaVar.j(iArr[i4][7]), 0, 4);
                            }
                            randomAccessFile.seek(0L);
                            randomAccessFile.write(dm5Var.a, 0, dm5Var.b);
                            randomAccessFile.getFD().sync();
                            return;
                        }
                        int i5 = 0;
                        while (i5 < i3) {
                            int[][] iArr4 = iArr2;
                            dm5Var.write(yxaVar.k(jArr2[i2][i5]), 0, 8);
                            dm5Var.write(yxaVar.k(jArr[i2][i5]), 0, 8);
                            dm5Var.write(yxaVar.j(iArr4[i2][i5]), 0, 4);
                            dm5Var.write(yxaVar.j(iArr[i2][i5]), 0, 4);
                            i5++;
                            i3 = i3;
                            iArr2 = iArr4;
                        }
                        dm5Var.write(yxaVar.j(yxaVar.n[i2]), 0, 4);
                        dm5Var.write(yxaVar.k(yxaVar.h[i2]), 0, 8);
                        i2++;
                        iArr2 = iArr2;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 4:
                zya zyaVar = (zya) this.b;
                View view = zyaVar.s;
                if (view == null) {
                    zyaVar.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
                    return;
                }
                if (view.getVisibility() != 0) {
                    view.setVisibility(0);
                    view.setAlpha(0.0f);
                }
                view.animate().setListener(null).cancel();
                view.animate().alpha(1.0f).setDuration(150L).start();
                return;
            case 5:
                ((c8b) this.b).M0 = false;
                return;
            case 6:
                c3b c3bVar = (c3b) this.b;
                c3bVar.b = false;
                c3bVar.invalidate();
                return;
            case 7:
                ((ThemeEditorView) this.b).a = false;
                try {
                    bkb.k();
                    bkb.n();
                    bkb.p();
                    bkb.j(false, false);
                    zkb.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.b0();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fa4.g(e2, true);
                    return;
                }
            case 8:
                zsb zsbVar = (zsb) this.b;
                zsbVar.G.setVisibility(0);
                zsbVar.G.setAlpha(0.0f);
                zsbVar.G.animate().alpha(1.0f).start();
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (b9Var = actionMenuView.K) == null) {
                    return;
                }
                b9Var.l();
                return;
            case 10:
                s7c s7cVar = (s7c) this.b;
                String str = s7cVar.i2;
                if (str != null) {
                    if (s7cVar.q2 >= 0) {
                        ConnectionsManager.getInstance(s7cVar.a).cancelRequest(s7cVar.q2, true);
                        s7cVar.q2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    s7cVar.q2 = ConnectionsManager.getInstance(s7cVar.a).sendRequest(tL_contacts_search, new wx9(s7cVar, (byte) 21));
                    return;
                }
                return;
            case 11:
                mbc mbcVar = (mbc) this.b;
                if (mbcVar.d && (hu7Var = mbcVar.f) != null && hu7Var.isAttachedToWindow()) {
                    PhotoViewer photoViewer = mbcVar.a.a;
                    lbc lbcVar = photoViewer.G2;
                    long S = lbcVar != null ? lbcVar.S() : 0L;
                    u3b u3bVar = mbcVar.b;
                    if (u3bVar != null && u3bVar.o && !u3bVar.h && !u3bVar.e(u3b.a(S))) {
                        u3bVar.f();
                    }
                    if (mbcVar.g != null) {
                        int i6 = 0;
                        while (true) {
                            if (i6 < mbcVar.g.size()) {
                                r3b r3bVar2 = (r3b) mbcVar.g.get(i6);
                                if (S < r3bVar2.a || S >= r3bVar2.b) {
                                    i6++;
                                } else {
                                    r3bVar = r3bVar2;
                                }
                            }
                        }
                    }
                    r8 = (r3bVar == null || TextUtils.isEmpty(r3bVar.c)) ? false : true;
                    if (r8) {
                        if (r3bVar != mbcVar.h || !TextUtils.equals(r3bVar.c, mbcVar.f.getText())) {
                            mbcVar.h = r3bVar;
                            mbcVar.f.setText(r3bVar.c);
                        }
                        mbcVar.f.setSpokenWords(r3bVar.d);
                        mbcVar.f.A(S);
                    }
                    if (r8 != mbcVar.i) {
                        mbcVar.i = r8;
                        mbcVar.f.animate().cancel();
                        mbcVar.f.animate().alpha(r8 ? 1.0f : 0.0f).setDuration(r8 ? 120L : 180L).start();
                    }
                    float height = (photoViewer.f0.getHeight() - photoViewer.t2.bottom) - gl.L(8.0f);
                    u98 u98Var = photoViewer.i3;
                    if (u98Var != null && u98Var.getVisibility() == 0) {
                        height = gl.R1(height, Math.min(height, photoViewer.i3.getY()), Utilities.i(photoViewer.i3.getAlpha(), 1.0f, 0.0f));
                    }
                    r88 r88Var = photoViewer.U1;
                    if (r88Var != null && photoViewer.a2 != null && r88Var.getVisibility() == 0 && (g98Var = photoViewer.R1) != null && g98Var.getVisibility() == 0) {
                        height = gl.R1(height, Math.min(height, photoViewer.R1.getTranslationY() + ((photoViewer.U1.getY() + photoViewer.a2.getTop()) - photoViewer.U1.getScrollY())), Utilities.i(photoViewer.U1.getAlpha(), 1.0f, 0.0f));
                    }
                    float L = (height - gl.L(8.0f)) - mbcVar.f.getHeight();
                    if (mbcVar.f.getTranslationY() != L) {
                        mbcVar.f.setTranslationY(L);
                    }
                    mbcVar.f.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                gec gecVar = (gec) this.b;
                gecVar.setScrollState(0);
                gecVar.s();
                return;
            case 13:
                vec vecVar = (vec) this.b;
                if (vecVar.K) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f = vecVar.g0 + (elapsedRealtime / 200.0f);
                    vecVar.g0 = f;
                    vecVar.setAnimationIdicatorProgress(vecVar.b0.getInterpolation(f));
                    float f2 = vecVar.g0;
                    if (f2 > 1.0f) {
                        vecVar.g0 = 1.0f;
                        f2 = 1.0f;
                    }
                    if (f2 < 1.0f) {
                        gl.c3(vecVar.j0);
                        return;
                    }
                    vecVar.K = false;
                    vecVar.setEnabled(true);
                    uec uecVar = vecVar.E;
                    if (uecVar != null) {
                        uecVar.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                ygc ygcVar = (ygc) this.b;
                h91 h91Var = ygcVar.b;
                if (h91Var != null) {
                    h91Var.b();
                }
                long c = b91.c();
                boolean a = h91.a(VoIPService.getSharedInstance());
                if (c != ygcVar.c || a != ygcVar.d) {
                    ygcVar.c = c;
                    ygcVar.d = a;
                    xa8 xa8Var = ygcVar.a;
                    if (xa8Var != null) {
                        xa8Var.d();
                    }
                }
                gl.d3(this, 500L);
                return;
            case 15:
                hmc hmcVar = (hmc) this.b;
                if (hmcVar.a == null || hmcVar.e == null) {
                    return;
                }
                hmcVar.a1();
                if (hmcVar.s) {
                    hmcVar.a.postOnAnimation(this);
                    return;
                }
                return;
            case 16:
                mmc mmcVar = (mmc) this.b;
                vmc vmcVar = mmcVar.H;
                if (mmcVar.b0) {
                    long nanoTime = System.nanoTime();
                    if (vmcVar.a) {
                        if (vmcVar.j == 0) {
                            vmcVar.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r9) * 1.0E-9f));
                            vmcVar.j = nanoTime;
                            if (vmcVar.i - vmcVar.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f3 = vmcVar.d;
                                vmcVar.d = tb4.A(vmcVar.b, f3, exp, f3);
                                float f4 = vmcVar.e;
                                vmcVar.e = tb4.A(vmcVar.c, f4, exp, f4);
                            }
                        }
                    }
                    mmcVar.L = vmcVar.a ? Math.max(-15.0f, Math.min(15.0f, vmcVar.b - vmcVar.d)) : 0.0f;
                    float c2 = mmc.c((vmcVar.a ? Math.max(-15.0f, Math.min(15.0f, vmcVar.c - vmcVar.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f5 = mmcVar.L;
                    float f6 = mmcVar.M;
                    float A = tb4.A(f5, f6, 1.0f, f6);
                    mmcVar.M = A;
                    float f7 = mmcVar.N;
                    float A2 = tb4.A(c2, f7, 1.0f, f7);
                    mmcVar.N = A2;
                    float f8 = mmcVar.f0;
                    mmcVar.b((A * f8) + mmcVar.O + mmcVar.e0, (A2 * f8) + mmcVar.P);
                    mmcVar.postOnAnimation(this);
                    return;
                }
                return;
            case 17:
                tuc tucVar = (tuc) this.b;
                k27 k27Var = tucVar.n;
                if (k27Var == null || tucVar.getParentActivity() == null || tucVar.s == null) {
                    return;
                }
                i = ((d) tucVar).currentAccount;
                na7.q1(i).H4(6, 0, k27.B0(k27Var.k), 0L, null);
                gl.d3(tucVar.s, 25000L);
                return;
            case 18:
                if (vvc.h.remove(this)) {
                    gl.r(this);
                    ((my) this.b).run();
                    return;
                }
                return;
            case 19:
                j1d j1dVar = (j1d) this.b;
                dy4 dy4Var = j1dVar.d;
                Context context = j1dVar.c;
                dy4Var.getClass();
                if (yy4.a.getAndSet(true)) {
                    return;
                }
                try {
                    NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
                    if (notificationManager != null) {
                        notificationManager.cancel(10436);
                        return;
                    }
                    return;
                } catch (SecurityException e3) {
                    Log.d("GooglePlayServicesUtil", "Suppressing Security Exception %s in cancelAvailabilityErrorNotifications.", e3);
                    return;
                }
            case 20:
                ((u1d) this.b).a();
                return;
            case 21:
                xx4 xx4Var = ((u1d) ((u39) this.b).b).b;
                xx4Var.d(xx4Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 22:
                ((i2d) this.b).k.b(new ds2(4, null, null));
                return;
            case 23:
                return;
            case 24:
                k3d k3dVar = (k3d) this.b;
                ReentrantLock reentrantLock = k3dVar.o;
                reentrantLock.lock();
                try {
                    k3dVar.j();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 25:
                ckc ckcVar = (ckc) this.b;
                synchronized (ckcVar.a) {
                    if (ckcVar.b()) {
                        Log.e("WakeLock", String.valueOf(ckcVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        ckcVar.d();
                        if (ckcVar.b()) {
                            ckcVar.c = 1;
                            ckcVar.e();
                            return;
                        }
                        return;
                    }
                    return;
                }
            case 26:
                if (((TaskCompletionSource) this.b).trySetException(new IOException("TIMEOUT"))) {
                    Log.w("Rpc", "No response");
                    return;
                }
                return;
            case 27:
                a();
                return;
            case 28:
                ucd ucdVar = (ucd) this.b;
                uh0 uh0Var = ucdVar.d;
                uh0Var.k(0);
                fi0 fi0Var = qjd.i;
                uh0Var.j(24, fi0Var);
                ucdVar.c(fi0Var);
                return;
            default:
                tod todVar = (tod) this.b;
                if (todVar == null || (ymdVar = todVar.n) == null) {
                    return;
                }
                this.b = null;
                if (ymdVar.isDone()) {
                    Object obj = todVar.a;
                    if (obj == null) {
                        if (ymdVar.isDone()) {
                            if (akd.h.f(todVar, null, tod.h(ymdVar))) {
                                tod.j(todVar);
                                return;
                            }
                            return;
                        }
                        jjd jjdVar = new jjd(todVar, ymdVar);
                        if (akd.h.f(todVar, null, jjdVar)) {
                            try {
                                ymdVar.c(jjdVar, ald.a);
                                return;
                            } catch (Throwable th) {
                                try {
                                    ljdVar = new ljd(th);
                                } catch (Error | Exception unused2) {
                                    ljdVar = ljd.b;
                                }
                                akd.h.f(todVar, jjdVar, ljdVar);
                                return;
                            }
                        }
                        obj = todVar.a;
                    }
                    if (obj instanceof ijd) {
                        ymdVar.cancel(((ijd) obj).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = todVar.r;
                    todVar.r = null;
                    String str2 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str2 = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            if (akd.h.f(todVar, null, new ljd(new god(str2)))) {
                                tod.j(todVar);
                            }
                            throw th2;
                        }
                    }
                    if (akd.h.f(todVar, null, new ljd(new god(str2 + ": " + ymdVar.toString())))) {
                        tod.j(todVar);
                    }
                    return;
                } finally {
                    ymdVar.cancel(true);
                }
        }
    }

    public /* synthetic */ xia(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ xia() {
        this.a = (byte) 29;
    }

    public xia(f3d f3dVar, dd ddVar) {
        this.a = (byte) 23;
        this.b = ddVar;
    }
}
