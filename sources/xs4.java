// default package

import android.app.Application;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteException;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.sharetarget.ShortcutInfoCompatSaverImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.WearAuthListenerService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes.dex */
public final class xs4 implements Runnable {
    public final /* synthetic */ byte a;
    public Object b;
    public final Object c;

    public /* synthetic */ xs4(vh0 vh0Var, nt2 nt2Var, mt2 mt2Var) {
        this.a = (byte) 17;
        this.b = vh0Var;
        this.c = nt2Var;
    }

    private final void a() {
        IBinder iBinder = (IBinder) this.c;
        ccf ccfVar = (ccf) this.b;
        synchronized (ccfVar) {
            if (iBinder == null) {
                ccfVar.b("Null service connection");
                return;
            }
            try {
                ccfVar.c = new zhc(iBinder);
                ccfVar.a = (byte) 2;
                ((ScheduledExecutorService) ccfVar.f.c).execute(new kre(ccfVar, (byte) 1));
            } catch (RemoteException e) {
                ccfVar.b(e.getMessage());
            }
        }
    }

    private final void b() {
        uff uffVar = (uff) this.c;
        ccf ccfVar = (ccf) this.b;
        int i = uffVar.a;
        synchronized (ccfVar) {
            SparseArray sparseArray = ccfVar.e;
            uff uffVar2 = (uff) sparseArray.get(i);
            if (uffVar2 != null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 20);
                sb.append("Timing out request: ");
                sb.append(i);
                Log.w("MessengerIpcClient", sb.toString());
                sparseArray.remove(i);
                uffVar2.c(new w30("Timed out waiting for response", null));
                ccfVar.d();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0049, code lost:
    
        r1 = r1 | java.lang.Thread.interrupted();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004b, code lost:
    
        ((java.lang.Runnable) r10.b).run();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        r10.b = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0076, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        r3 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0054, code lost:
    
        n8a.f.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + ((java.lang.Runnable) r10.b), (java.lang.Throwable) r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:?, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c() {
        boolean z = false;
        boolean z2 = false;
        while (true) {
            try {
                synchronized (((n8a) this.c).b) {
                    if (!z) {
                        n8a n8aVar = (n8a) this.c;
                        if (n8aVar.c != 4) {
                            n8aVar.d++;
                            n8aVar.c = 4;
                            z = true;
                        }
                    }
                    Runnable runnable = (Runnable) ((n8a) this.c).b.poll();
                    this.b = runnable;
                    if (runnable == null) {
                        ((n8a) this.c).c = 1;
                    }
                }
                if (!z2) {
                    return;
                }
                this.b = null;
            } finally {
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        d27 d27Var;
        boolean z;
        byte b = 9;
        Throwable th = null;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                ws4 ws4Var = (ws4) this.c;
                x76 x76Var = (x76) this.b;
                if (x76Var instanceof u2) {
                    u2 u2Var = (u2) x76Var;
                    if (u2Var instanceof p2) {
                        Object obj = u2Var.a;
                        if (obj instanceof k2) {
                            th = ((k2) obj).a;
                        }
                    }
                    if (th != null) {
                        ws4Var.k(th);
                        return;
                    }
                }
                try {
                    ws4Var.onSuccess(fne.a(x76Var));
                    return;
                } catch (ExecutionException e) {
                    ws4Var.k(e.getCause());
                    return;
                } catch (Throwable th2) {
                    ws4Var.k(th2);
                    return;
                }
            case 1:
                z8 z8Var = (z8) this.b;
                c9 c9Var = (c9) this.c;
                f27 f27Var = c9Var.c;
                if (f27Var != null && (d27Var = f27Var.e) != null) {
                    d27Var.Q1(f27Var);
                }
                View view = (View) c9Var.n;
                if (view != null && view.getWindowToken() != null) {
                    if (!z8Var.b()) {
                        if (z8Var.e != null) {
                            z8Var.d(0, 0, false, false);
                        }
                    }
                    c9Var.J = z8Var;
                }
                c9Var.L = null;
                return;
            case 2:
                ((Application) this.b).unregisterActivityLifecycleCallbacks((p9) this.c);
                return;
            case 3:
                mj0 mj0Var = ((bj0) this.c).m0;
                rsd rsdVar = mj0Var.c;
                if (rsdVar == null) {
                    rsdVar = new jj0();
                    mj0Var.c = rsdVar;
                }
                rsdVar.c((gj0) this.b);
                return;
            case 4:
                zu1 zu1Var = ((kt1) this.c).b;
                if (this == zu1Var.b6) {
                    zu1Var.ub((CharSequence) this.b, false);
                    zu1Var.b6 = null;
                    return;
                }
                return;
            case 5:
                vkb vkbVar = (vkb) this.b;
                boolean z2 = vkbVar.d.h;
                vkbVar.setChecked(!z2);
                bg2 bg2Var = ((xf2) this.c).d;
                TLRPC.TL_chatBannedRights tL_chatBannedRights = bg2Var.E;
                tL_chatBannedRights.send_media = z2;
                tL_chatBannedRights.send_gifs = z2;
                tL_chatBannedRights.send_inline = z2;
                tL_chatBannedRights.send_games = z2;
                tL_chatBannedRights.send_photos = z2;
                tL_chatBannedRights.send_videos = z2;
                tL_chatBannedRights.send_stickers = z2;
                tL_chatBannedRights.send_audios = z2;
                tL_chatBannedRights.send_docs = z2;
                tL_chatBannedRights.send_voices = z2;
                tL_chatBannedRights.send_roundvideos = z2;
                tL_chatBannedRights.embed_links = z2;
                tL_chatBannedRights.send_polls = z2;
                tL_chatBannedRights.send_reactions = z2;
                hl.V3(bg2Var.c);
                vf2 A0 = bg2Var.A0();
                bg2Var.F0();
                bg2Var.D0(A0);
                return;
            case 6:
                zb3 zb3Var = (zb3) this.c;
                ArrayList arrayList = (ArrayList) this.b;
                int size = arrayList.size();
                while (b2 < size) {
                    xb3 xb3Var = (xb3) arrayList.get(b2);
                    zb3Var.B(xb3Var);
                    zb3Var.x.add(xb3Var);
                    b2++;
                }
                arrayList.clear();
                zb3Var.v.remove(arrayList);
                return;
            case 7:
                ((v21) this.b).j();
                ((tv3) this.c).F = null;
                return;
            case 8:
                hu5 hu5Var = (hu5) this.b;
                f89 f89Var = hu5Var.e;
                lu5 lu5Var = (lu5) this.c;
                RecyclerView recyclerView = lu5Var.I;
                if (recyclerView == null || !recyclerView.H || hu5Var.w || f89Var.b() == -1) {
                    return;
                }
                o79 itemAnimator = lu5Var.I.getItemAnimator();
                if (itemAnimator == null || !itemAnimator.k()) {
                    ArrayList arrayList2 = lu5Var.G;
                    int size2 = arrayList2.size();
                    for (int i = 0; i < size2; i++) {
                        if (((hu5) arrayList2.get(i)).x) {
                        }
                    }
                    lu5Var.y.r(f89Var);
                    return;
                }
                lu5Var.I.post(this);
                return;
            case 9:
                ArrayList arrayList3 = (ArrayList) this.b;
                for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                    if (arrayList3.get(i2) != null && ((ne2) arrayList3.get(i2)).a != null) {
                        ((ne2) arrayList3.get(i2)).a.m(0);
                    }
                }
                hl.c3(new mn6(this, arrayList3, b));
                return;
            case 10:
                ((yn4) this.b).accept(this.c);
                return;
            case 11:
                try {
                    c();
                    return;
                } catch (Error e2) {
                    synchronized (((n8a) this.c).b) {
                        ((n8a) this.c).c = 1;
                        throw e2;
                    }
                }
            case 12:
                sd9 sd9Var = (sd9) this.c;
                try {
                    ((sd9) this.b).get();
                    sd9Var.k(null);
                    return;
                } catch (Exception e3) {
                    sd9Var.l(e3);
                    return;
                }
            case 13:
                ShortcutInfoCompatSaverImpl shortcutInfoCompatSaverImpl = (ShortcutInfoCompatSaverImpl) this.c;
                shortcutInfoCompatSaverImpl.b.clear();
                qs qsVar = shortcutInfoCompatSaverImpl.c;
                Iterator it = ((ks) qsVar.values()).iterator();
                while (it.hasNext()) {
                    ((x76) it.next()).cancel(false);
                }
                qsVar.clear();
                shortcutInfoCompatSaverImpl.h((sd9) this.b);
                return;
            case 14:
                if (((sd9) this.b).a instanceof u3) {
                    return;
                }
                try {
                    ((Runnable) this.c).run();
                    ((sd9) this.b).k(null);
                    return;
                } catch (Exception e4) {
                    ((sd9) this.b).l(e4);
                    return;
                }
            case 15:
                a86 a86Var = (a86) this.b;
                z76 z76Var = (z76) this.c;
                y76 y76Var = a86Var.b;
                if (y76Var != null) {
                    z76Var.R(y76Var.a);
                    return;
                }
                return;
            case 16:
                vh0 vh0Var = (vh0) this.b;
                gi0 gi0Var = (gi0) this.c;
                di0 di0Var = (di0) vh0Var.f.c;
                fi0 fi0Var = vh0Var.f;
                if (di0Var != null) {
                    ((di0) fi0Var.c).m(gi0Var, null, null);
                    return;
                } else {
                    old.h("BillingClient", "No valid listener is set in BroadcastManager");
                    return;
                }
            case 17:
                vh0 vh0Var2 = (vh0) this.b;
                nt2 nt2Var = (nt2) this.c;
                gi0 gi0Var2 = hod.i;
                vh0Var2.x(24, 4, gi0Var2);
                nt2Var.e(gi0Var2);
                return;
            case 18:
                vh0 vh0Var3 = (vh0) this.b;
                fy8 fy8Var = (fy8) this.c;
                gi0 gi0Var3 = hod.i;
                vh0Var3.x(24, 9, gi0Var3);
                jjd jjdVar = vjd.b;
                fy8Var.a(gi0Var3, emd.e);
                return;
            case 19:
                ((hhd) this.b).V((dw6) this.c);
                return;
            case 20:
                rjd rjdVar = ((kjd) this.b).c;
                t9d t9dVar = (t9d) this.c;
                he6 he6Var = rjd.H;
                String str = t9dVar.a;
                if (qd1.d(str, rjdVar.v)) {
                    z = false;
                } else {
                    rjdVar.v = str;
                    z = true;
                }
                rjd.H.b("hasChanged=%b, mFirstApplicationStatusUpdate=%b", Boolean.valueOf(z), Boolean.valueOf(rjdVar.o));
                kmf kmfVar = rjdVar.E;
                if (kmfVar != null && (z || rjdVar.o)) {
                    kmfVar.d();
                }
                rjdVar.o = false;
                return;
            case 21:
                a();
                return;
            case 22:
                b();
                return;
            case 23:
                WearAuthListenerService wearAuthListenerService = ((x9d) this.c).c;
                x9e x9eVar = (x9e) this.b;
                String str2 = x9eVar.b;
                String str3 = x9eVar.d;
                byte[] bArr = x9eVar.c;
                if ("/tg-wear-auth/offer".equals(str2)) {
                    try {
                        Intent intent = new Intent(wearAuthListenerService, (Class<?>) LaunchActivity.class);
                        intent.addFlags(268566528);
                        wearAuthListenerService.startActivity(intent);
                    } catch (Exception e5) {
                        cc4.e("wear-auth: failed to pop LaunchActivity", e5);
                    }
                }
                hl.c3(new jwc(str2, str3, bArr, b2));
                return;
            case 24:
                vh4 vh4Var = (vh4) this.b;
                AtomicReference atomicReference = (AtomicReference) vh4Var.d;
                xve.k(((Thread) atomicReference.getAndSet(Thread.currentThread())) == null);
                try {
                    ((Runnable) this.c).run();
                    atomicReference.set(null);
                    vh4Var.N();
                    return;
                } catch (Throwable th3) {
                    try {
                        atomicReference.set(null);
                        vh4Var.N();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            default:
                mhd mhdVar = (mhd) this.b;
                WearAuthListenerService wearAuthListenerService2 = ((x9d) this.c).c;
                mhdVar.b(wearAuthListenerService2);
                mhdVar.b(wearAuthListenerService2.n);
                return;
        }
    }

    public final String toString() {
        byte b = this.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                pm3 pm3Var = new pm3(xs4.class.getSimpleName(), (byte) 22);
                um4 um4Var = new um4((byte) 13);
                ((um4) pm3Var.d).c = um4Var;
                pm3Var.d = um4Var;
                um4Var.b = (ws4) obj;
                return pm3Var.toString();
            case 11:
                Runnable runnable = (Runnable) this.b;
                if (runnable != null) {
                    return "SequentialExecutorWorker{running=" + runnable + "}";
                }
                StringBuilder sb = new StringBuilder("SequentialExecutorWorker{state=");
                int i = ((n8a) obj).c;
                sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "RUNNING" : "QUEUED" : "QUEUING" : "IDLE");
                sb.append("}");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public /* synthetic */ xs4(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public /* synthetic */ xs4(Object obj, Object obj2, boolean z, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public xs4(n8a n8aVar) {
        this.a = (byte) 11;
        this.c = n8aVar;
    }

    public xs4(lu5 lu5Var, hu5 hu5Var, int i) {
        this.a = (byte) 8;
        this.c = lu5Var;
        this.b = hu5Var;
    }
}
