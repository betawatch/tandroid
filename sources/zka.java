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

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class zka implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;

    public zka(k4d k4dVar) {
        this.a = (byte) 22;
        Objects.requireNonNull(k4dVar);
        this.b = k4dVar;
    }

    private final void a() {
        wbd wbdVar = (wbd) this.b;
        synchronized (wbd.i) {
            if (wbdVar.d()) {
                wbdVar.f(15);
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        b9 b9Var;
        iw7 iw7Var;
        hb8 hb8Var;
        int i;
        bpd bpdVar;
        nld nldVar;
        s5b s5bVar = null;
        switch (this.a) {
            case 0:
                System.currentTimeMillis();
                throw null;
            case 1:
                dta dtaVar = (dta) this.b;
                try {
                    cta ctaVar = dtaVar.a;
                    if (ctaVar != null) {
                        ctaVar.g();
                        dtaVar.invalidate();
                        return;
                    }
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 2:
                ((xza) this.b).b0.animate().alpha(1.0f).setDuration(230L);
                return;
            case 3:
                long currentTimeMillis = System.currentTimeMillis();
                b0b b0bVar = (b0b) this.b;
                int[][] iArr = b0bVar.f;
                int[][] iArr2 = b0bVar.e;
                long[][] jArr = b0bVar.d;
                long[][] jArr2 = b0bVar.c;
                RandomAccessFile randomAccessFile = b0bVar.r;
                do5 do5Var = b0bVar.s;
                if (Math.abs(currentTimeMillis - b0bVar.b) < 2000) {
                    return;
                }
                b0bVar.b = currentTimeMillis;
                try {
                    do5Var.b();
                    int i2 = 0;
                    while (true) {
                        int i3 = 7;
                        if (i2 >= 3) {
                            int[][] iArr3 = iArr2;
                            for (int i4 = 0; i4 < 3; i4++) {
                                do5Var.write(b0bVar.k(jArr2[i4][7]), 0, 8);
                                do5Var.write(b0bVar.k(jArr[i4][7]), 0, 8);
                                do5Var.write(b0bVar.j(iArr3[i4][7]), 0, 4);
                                do5Var.write(b0bVar.j(iArr[i4][7]), 0, 4);
                            }
                            randomAccessFile.seek(0L);
                            randomAccessFile.write(do5Var.a, 0, do5Var.b);
                            randomAccessFile.getFD().sync();
                            return;
                        }
                        int i5 = 0;
                        while (i5 < i3) {
                            int[][] iArr4 = iArr2;
                            do5Var.write(b0bVar.k(jArr2[i2][i5]), 0, 8);
                            do5Var.write(b0bVar.k(jArr[i2][i5]), 0, 8);
                            do5Var.write(b0bVar.j(iArr4[i2][i5]), 0, 4);
                            do5Var.write(b0bVar.j(iArr[i2][i5]), 0, 4);
                            i5++;
                            i3 = i3;
                            iArr2 = iArr4;
                        }
                        do5Var.write(b0bVar.j(b0bVar.n[i2]), 0, 4);
                        do5Var.write(b0bVar.k(b0bVar.h[i2]), 0, 8);
                        i2++;
                        iArr2 = iArr2;
                    }
                } catch (Exception unused) {
                    return;
                }
            case 4:
                a1b a1bVar = (a1b) this.b;
                View view = a1bVar.s;
                if (view == null) {
                    a1bVar.c.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).start();
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
                ((eab) this.b).M0 = false;
                return;
            case 6:
                d5b d5bVar = (d5b) this.b;
                d5bVar.b = false;
                d5bVar.invalidate();
                return;
            case 7:
                ((ThemeEditorView) this.b).a = false;
                try {
                    cmb.k();
                    cmb.n();
                    cmb.p();
                    cmb.j(false, false);
                    anb.b0(null, true);
                    LaunchActivity launchActivity = LaunchActivity.H1;
                    if (launchActivity != null) {
                        launchActivity.b0();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    fc4.g(e2, true);
                    return;
                }
            case 8:
                avb avbVar = (avb) this.b;
                avbVar.G.setVisibility(0);
                avbVar.G.setAlpha(0.0f);
                avbVar.G.animate().alpha(1.0f).start();
                return;
            case 9:
                ActionMenuView actionMenuView = ((Toolbar) this.b).a;
                if (actionMenuView == null || (b9Var = actionMenuView.K) == null) {
                    return;
                }
                b9Var.l();
                return;
            case 10:
                t9c t9cVar = (t9c) this.b;
                String str = t9cVar.i2;
                if (str != null) {
                    if (t9cVar.q2 >= 0) {
                        ConnectionsManager.getInstance(t9cVar.a).cancelRequest(t9cVar.q2, true);
                        t9cVar.q2 = -1;
                    }
                    TLRPC.TL_contacts_search tL_contacts_search = new TLRPC.TL_contacts_search();
                    tL_contacts_search.q = str;
                    t9cVar.q2 = ConnectionsManager.getInstance(t9cVar.a).sendRequest(tL_contacts_search, new go9(t9cVar, (byte) 22));
                    return;
                }
                return;
            case 11:
                odc odcVar = (odc) this.b;
                if (odcVar.d && (iw7Var = odcVar.f) != null && iw7Var.isAttachedToWindow()) {
                    PhotoViewer photoViewer = odcVar.a.a;
                    ndc ndcVar = photoViewer.G2;
                    long S = ndcVar != null ? ndcVar.S() : 0L;
                    v5b v5bVar = odcVar.b;
                    if (v5bVar != null && v5bVar.o && !v5bVar.h && !v5bVar.e(v5b.a(S))) {
                        v5bVar.f();
                    }
                    if (odcVar.g != null) {
                        int i6 = 0;
                        while (true) {
                            if (i6 < odcVar.g.size()) {
                                s5b s5bVar2 = (s5b) odcVar.g.get(i6);
                                if (S < s5bVar2.a || S >= s5bVar2.b) {
                                    i6++;
                                } else {
                                    s5bVar = s5bVar2;
                                }
                            }
                        }
                    }
                    r8 = (s5bVar == null || TextUtils.isEmpty(s5bVar.c)) ? false : true;
                    if (r8) {
                        if (s5bVar != odcVar.h || !TextUtils.equals(s5bVar.c, odcVar.f.getText())) {
                            odcVar.h = s5bVar;
                            odcVar.f.setText(s5bVar.c);
                        }
                        odcVar.f.setSpokenWords(s5bVar.d);
                        odcVar.f.A(S);
                    }
                    if (r8 != odcVar.i) {
                        odcVar.i = r8;
                        odcVar.f.animate().cancel();
                        odcVar.f.animate().alpha(r8 ? 1.0f : 0.0f).setDuration(r8 ? 120L : 180L).start();
                    }
                    float height = (photoViewer.f0.getHeight() - photoViewer.t2.bottom) - gm.L(8.0f);
                    vb8 vb8Var = photoViewer.i3;
                    if (vb8Var != null && vb8Var.getVisibility() == 0) {
                        height = gm.R1(height, Math.min(height, photoViewer.i3.getY()), Utilities.i(photoViewer.i3.getAlpha(), 1.0f, 0.0f));
                    }
                    ta8 ta8Var = photoViewer.U1;
                    if (ta8Var != null && photoViewer.a2 != null && ta8Var.getVisibility() == 0 && (hb8Var = photoViewer.R1) != null && hb8Var.getVisibility() == 0) {
                        height = gm.R1(height, Math.min(height, photoViewer.R1.getTranslationY() + ((photoViewer.U1.getY() + photoViewer.a2.getTop()) - photoViewer.U1.getScrollY())), Utilities.i(photoViewer.U1.getAlpha(), 1.0f, 0.0f));
                    }
                    float L = (height - gm.L(8.0f)) - odcVar.f.getHeight();
                    if (odcVar.f.getTranslationY() != L) {
                        odcVar.f.setTranslationY(L);
                    }
                    odcVar.f.postOnAnimation(this);
                    return;
                }
                return;
            case 12:
                ggc ggcVar = (ggc) this.b;
                ggcVar.setScrollState(0);
                ggcVar.s();
                return;
            case 13:
                vgc vgcVar = (vgc) this.b;
                if (vgcVar.K) {
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    if (elapsedRealtime > 17) {
                        elapsedRealtime = 17;
                    }
                    float f = vgcVar.g0 + (elapsedRealtime / 200.0f);
                    vgcVar.g0 = f;
                    vgcVar.setAnimationIdicatorProgress(vgcVar.b0.getInterpolation(f));
                    float f2 = vgcVar.g0;
                    if (f2 > 1.0f) {
                        vgcVar.g0 = 1.0f;
                        f2 = 1.0f;
                    }
                    if (f2 < 1.0f) {
                        gm.c3(vgcVar.j0);
                        return;
                    }
                    vgcVar.K = false;
                    vgcVar.setEnabled(true);
                    ugc ugcVar = vgcVar.E;
                    if (ugcVar != null) {
                        ugcVar.g(1.0f);
                        return;
                    }
                    return;
                }
                return;
            case 14:
                zic zicVar = (zic) this.b;
                qa1 qa1Var = zicVar.b;
                if (qa1Var != null) {
                    qa1Var.b();
                }
                long c = ka1.c();
                boolean a = qa1.a(VoIPService.getSharedInstance());
                if (c != zicVar.c || a != zicVar.d) {
                    zicVar.c = c;
                    zicVar.d = a;
                    ad8 ad8Var = zicVar.a;
                    if (ad8Var != null) {
                        ad8Var.d();
                    }
                }
                gm.d3(this, 500L);
                return;
            case 15:
                goc gocVar = (goc) this.b;
                if (gocVar.a == null || gocVar.e == null) {
                    return;
                }
                gocVar.b1();
                if (gocVar.s) {
                    gocVar.a.postOnAnimation(this);
                    return;
                }
                return;
            case 16:
                moc mocVar = (moc) this.b;
                voc vocVar = mocVar.H;
                if (mocVar.b0) {
                    long nanoTime = System.nanoTime();
                    if (vocVar.a) {
                        if (vocVar.j == 0) {
                            vocVar.j = nanoTime;
                        } else {
                            float min = Math.min(0.1f, Math.max(0.0f, (nanoTime - r9) * 1.0E-9f));
                            vocVar.j = nanoTime;
                            if (vocVar.i - vocVar.h >= 1000000000) {
                                float exp = 1.0f - ((float) Math.exp((-min) / 1.0f));
                                float f3 = vocVar.d;
                                vocVar.d = td4.A(vocVar.b, f3, exp, f3);
                                float f4 = vocVar.e;
                                vocVar.e = td4.A(vocVar.c, f4, exp, f4);
                            }
                        }
                    }
                    mocVar.L = vocVar.a ? Math.max(-15.0f, Math.min(15.0f, vocVar.b - vocVar.d)) : 0.0f;
                    float c2 = moc.c((vocVar.a ? Math.max(-15.0f, Math.min(15.0f, vocVar.c - vocVar.e)) : 0.0f) * 1.5f, -15.0f, 15.0f);
                    float f5 = mocVar.L;
                    float f6 = mocVar.M;
                    float A = td4.A(f5, f6, 1.0f, f6);
                    mocVar.M = A;
                    float f7 = mocVar.N;
                    float A2 = td4.A(c2, f7, 1.0f, f7);
                    mocVar.N = A2;
                    float f8 = mocVar.f0;
                    mocVar.b((A * f8) + mocVar.O + mocVar.e0, (A2 * f8) + mocVar.P);
                    mocVar.postOnAnimation(this);
                    return;
                }
                return;
            case 17:
                uwc uwcVar = (uwc) this.b;
                k47 k47Var = uwcVar.n;
                if (k47Var == null || uwcVar.getParentActivity() == null || uwcVar.s == null) {
                    return;
                }
                i = ((d) uwcVar).currentAccount;
                oc7.r1(i).J4(6, 0, k47.B0(k47Var.k), 0L, null);
                gm.d3(uwcVar.s, 25000L);
                return;
            case 18:
                if (wxc.h.remove(this)) {
                    gm.r(this);
                    ((en1) this.b).run();
                    return;
                }
                return;
            case 19:
                l3d l3dVar = (l3d) this.b;
                e05 e05Var = l3dVar.d;
                Context context = l3dVar.c;
                e05Var.getClass();
                if (x05.a.getAndSet(true)) {
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
                ((w3d) this.b).a();
                return;
            case 21:
                zz4 zz4Var = ((w3d) ((x59) this.b).b).b;
                zz4Var.d(zz4Var.getClass().getName().concat(" disconnecting because it was signed out."));
                return;
            case 22:
                ((k4d) this.b).k.b(new ot2(4, null, null));
                return;
            case 23:
                return;
            case 24:
                m5d m5dVar = (m5d) this.b;
                ReentrantLock reentrantLock = m5dVar.o;
                reentrantLock.lock();
                try {
                    m5dVar.j();
                    return;
                } finally {
                    reentrantLock.unlock();
                }
            case 25:
                cmc cmcVar = (cmc) this.b;
                synchronized (cmcVar.a) {
                    if (cmcVar.b()) {
                        Log.e("WakeLock", String.valueOf(cmcVar.j).concat(" ** IS FORCE-RELEASED ON TIMEOUT **"));
                        cmcVar.d();
                        if (cmcVar.b()) {
                            cmcVar.c = 1;
                            cmcVar.e();
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
                wed wedVar = (wed) this.b;
                ui0 ui0Var = wedVar.d;
                ui0Var.k(0);
                fj0 fj0Var = sld.i;
                ui0Var.j(24, fj0Var);
                wedVar.c(fj0Var);
                return;
            default:
                wqd wqdVar = (wqd) this.b;
                if (wqdVar == null || (bpdVar = wqdVar.n) == null) {
                    return;
                }
                this.b = null;
                if (bpdVar.isDone()) {
                    Object obj = wqdVar.a;
                    if (obj == null) {
                        if (bpdVar.isDone()) {
                            if (cmd.h.f(wqdVar, null, wqd.h(bpdVar))) {
                                wqd.j(wqdVar);
                                return;
                            }
                            return;
                        }
                        lld lldVar = new lld(wqdVar, bpdVar);
                        if (cmd.h.f(wqdVar, null, lldVar)) {
                            try {
                                bpdVar.c(lldVar, cnd.a);
                                return;
                            } catch (Throwable th) {
                                try {
                                    nldVar = new nld(th);
                                } catch (Error | Exception unused2) {
                                    nldVar = nld.b;
                                }
                                cmd.h.f(wqdVar, lldVar, nldVar);
                                return;
                            }
                        }
                        obj = wqdVar.a;
                    }
                    if (obj instanceof kld) {
                        bpdVar.cancel(((kld) obj).a);
                        return;
                    }
                    return;
                }
                try {
                    ScheduledFuture scheduledFuture = wqdVar.r;
                    wqdVar.r = null;
                    String str2 = "Timed out";
                    if (scheduledFuture != null) {
                        try {
                            long abs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10) {
                                str2 = "Timed out (timeout delayed by " + abs + " ms after scheduled time)";
                            }
                        } catch (Throwable th2) {
                            if (cmd.h.f(wqdVar, null, new nld(new jqd(str2)))) {
                                wqd.j(wqdVar);
                            }
                            throw th2;
                        }
                    }
                    if (cmd.h.f(wqdVar, null, new nld(new jqd(str2 + ": " + bpdVar.toString())))) {
                        wqd.j(wqdVar);
                    }
                    return;
                } finally {
                    bpdVar.cancel(true);
                }
        }
    }

    public /* synthetic */ zka(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public /* synthetic */ zka() {
        this.a = (byte) 29;
    }

    public zka(h5d h5dVar, de deVar) {
        this.a = (byte) 23;
        this.b = deVar;
    }
}
