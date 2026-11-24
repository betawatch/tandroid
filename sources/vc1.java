// default package

import android.content.res.Resources;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class vc1 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public vc1(lj9 lj9Var, wc1 wc1Var, c07 c07Var, yz6 yz6Var) {
        this.a = (byte) 0;
        this.e = lj9Var;
        this.b = wc1Var;
        this.c = c07Var;
        this.d = yz6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void a() {
        String str;
        shf shfVar;
        sxe sxeVar = (sxe) this.b;
        qx qxVar = (qx) this.c;
        jhe jheVar = (jhe) this.d;
        String str2 = (String) this.e;
        wtc wtcVar = (wtc) qxVar.c;
        wtcVar.b = jheVar;
        bte bteVar = (bte) wtcVar.a;
        if (bteVar != null) {
            str = bteVar.d;
            int i = pme.a;
            if (str != null) {
            }
        }
        str = "NA";
        pse pseVar = new pse();
        pseVar.a = sxeVar.a;
        pseVar.b = sxeVar.b;
        synchronized (sxe.class) {
            shfVar = sxe.j;
            if (shfVar == null) {
                m96 a = rtd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    ce3 ce3Var = om2.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArr.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            i5 = Integer.highestOneBit(i3) << 1;
                        }
                        if (i5 < 0) {
                            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    objArr[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                scf scfVar = jff.f;
                shfVar = i3 == 0 ? shf.r : new shf(i3, objArr);
                sxe.j = shfVar;
            }
        }
        pseVar.k = shfVar;
        pseVar.g = Boolean.TRUE;
        pseVar.d = str;
        pseVar.c = str2;
        pseVar.e = sxeVar.f.isSuccessful() ? (String) sxeVar.f.getResult() : sxeVar.d.a();
        pseVar.i = 10;
        pseVar.j = Integer.valueOf(sxeVar.h);
        qxVar.d = pseVar;
        sxeVar.c.a(qxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0026, code lost:
    
        if (r2.isEmpty() == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void b() {
        String str;
        hfd hfdVar;
        z3f z3fVar = (z3f) this.b;
        qx qxVar = (qx) this.c;
        ete eteVar = (ete) this.d;
        String str2 = (String) this.e;
        ep epVar = (ep) qxVar.c;
        epVar.b = eteVar;
        d1f d1fVar = (d1f) epVar.a;
        if (d1fVar != null) {
            str = d1fVar.d;
            int i = zaf.a;
            if (str != null) {
            }
        }
        str = "NA";
        pse pseVar = new pse();
        pseVar.a = z3fVar.a;
        pseVar.b = z3fVar.b;
        synchronized (z3f.class) {
            hfdVar = z3f.k;
            if (hfdVar == null) {
                m96 a = rtd.a(Resources.getSystem().getConfiguration());
                Object[] objArr = new Object[4];
                int i2 = 0;
                int i3 = 0;
                while (i2 < a.a.size()) {
                    Locale locale = a.a.get(i2);
                    ce3 ce3Var = om2.a;
                    String languageTag = locale.toLanguageTag();
                    languageTag.getClass();
                    int i4 = i3 + 1;
                    int length = objArr.length;
                    if (length < i4) {
                        int i5 = length + (length >> 1) + 1;
                        if (i5 < i4) {
                            i5 = Integer.highestOneBit(i3) << 1;
                        }
                        if (i5 < 0) {
                            i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                        }
                        objArr = Arrays.copyOf(objArr, i5);
                    }
                    objArr[i3] = languageTag;
                    i2++;
                    i3 = i4;
                }
                ccd ccdVar = ncd.f;
                hfdVar = i3 == 0 ? hfd.r : new hfd(i3, objArr);
                z3f.k = hfdVar;
            }
        }
        pseVar.k = hfdVar;
        pseVar.g = Boolean.TRUE;
        pseVar.d = str;
        pseVar.c = str2;
        pseVar.e = z3fVar.f.isSuccessful() ? (String) z3fVar.f.getResult() : z3fVar.d.a();
        pseVar.i = 10;
        pseVar.j = Integer.valueOf(z3fVar.h);
        qxVar.d = pseVar;
        z3fVar.c.a(qxVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r7.isEmpty() == false) goto L11;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        byte b;
        Task task;
        String str;
        tdd tddVar;
        p6a p6aVar = null;
        int i = 0;
        switch (this.a) {
            case 0:
                xc1 xc1Var = (xc1) ((lj9) this.e).b;
                c07 c07Var = (c07) this.c;
                wc1 wc1Var = (wc1) this.b;
                if (wc1Var != null) {
                    xc1Var.Q = true;
                    wc1Var.b.c(false);
                    xc1Var.Q = false;
                }
                if (c07Var.isEnabled() && c07Var.hasSubMenu()) {
                    ((yz6) this.d).q(c07Var, null, 4);
                    return;
                }
                return;
            case 1:
                vbd vbdVar = (vbd) this.b;
                eu6 eu6Var = (eu6) this.c;
                eu6 eu6Var2 = (eu6) this.d;
                k91 k91Var = (k91) this.e;
                ydd yddVar = vbdVar.a;
                yddVar.getClass();
                dc6 dc6Var = ydd.i;
                Set set = yddVar.b;
                if (new HashSet(set).isEmpty()) {
                    dc6Var.b("No need to prepare transfer without any callback", new Object[0]);
                    k91Var.a();
                    return;
                }
                if (eu6Var.l != 1) {
                    dc6Var.b("No need to prepare transfer when transferring from local", new Object[0]);
                    k91Var.a();
                    return;
                }
                i69 a = yddVar.a();
                if (a == null || !a.h()) {
                    dc6Var.b("No need to prepare transfer when there is no media session", new Object[0]);
                    k91Var.a();
                    return;
                }
                dc6Var.b("Prepare route transfer for changing endpoint", new Object[0]);
                if (eu6Var2.l == 0) {
                    i5f.a(k1f.h0);
                    b = 1;
                } else {
                    b = CastDevice.b(eu6Var2.s) == null ? (byte) 3 : (byte) 2;
                }
                yddVar.e = b;
                yddVar.g = k91Var;
                dc6Var.b("notify transferring with type = %d", Integer.valueOf(b));
                Iterator it = new HashSet(set).iterator();
                while (it.hasNext()) {
                    yme ymeVar = (yme) it.next();
                    byte b2 = yddVar.e;
                    switch (ymeVar.a) {
                        case 0:
                            ese.j.b("onTransferring with type = %d", Integer.valueOf(b2));
                            ese eseVar = (ese) ymeVar.b;
                            eseVar.i = true;
                            eseVar.c();
                            w3f b3 = eseVar.c.b(eseVar.g);
                            k3f m = l3f.m(b3.d());
                            m.c();
                            l3f.v((l3f) m.b, b2);
                            b3.e((l3f) m.a());
                            eseVar.a.a((y3f) b3.a(), kk7.F3);
                            break;
                        default:
                            ab8 ab8Var = new ab8(10);
                            gl2 gl2Var = (gl2) ymeVar.b;
                            ab8Var.c = Boolean.valueOf(((p6d) gl2Var.c).c == 2);
                            gl2.S(gl2Var, new xhf(ab8Var));
                            mhf T = gl2Var.T();
                            o5d o5dVar = new o5d(new d00(b2));
                            o5dVar.c = T.h;
                            T.c.add(o5dVar);
                            break;
                    }
                }
                yddVar.h = null;
                fre.e("Must be called from the main thread.");
                if (a.w()) {
                    a.g = new TaskCompletionSource();
                    i69.k.b("create SessionState with cached mediaInfo and mediaStatus", new Object[0]);
                    MediaInfo d = a.d();
                    fy6 e = a.e();
                    if (d != null && e != null) {
                        Boolean bool = Boolean.TRUE;
                        long a2 = a.a();
                        yr6 yr6Var = e.M;
                        double d2 = e.d;
                        if (Double.compare(d2, 2.0d) > 0 || Double.compare(d2, 0.5d) < 0) {
                            w26.j("playbackRate must be between PLAYBACK_RATE_MIN and PLAYBACK_RATE_MAX");
                            return;
                        }
                        p6aVar = new p6a(new gr6(d, yr6Var, bool, a2, d2, e.w, e.F, null, null, null, null, 0L), null);
                    }
                    TaskCompletionSource taskCompletionSource = a.g;
                    if (p6aVar != null) {
                        taskCompletionSource.setResult(p6aVar);
                    } else {
                        taskCompletionSource.setException(new m8d());
                    }
                    task = a.g.getTask();
                } else {
                    task = Tasks.forException(new m8d());
                }
                task.addOnSuccessListener(new ln8((Object) yddVar, (byte) 29)).addOnFailureListener(new g29((Object) yddVar, (byte) 26));
                yddVar.c.postDelayed(yddVar.d, 10000L);
                return;
            case 2:
                a();
                return;
            case 3:
                b();
                return;
            default:
                sef sefVar = (sef) this.b;
                qx qxVar = (qx) this.c;
                p5f p5fVar = (p5f) this.d;
                String str2 = (String) this.e;
                ntb ntbVar = (ntb) qxVar.c;
                ntbVar.b = p5fVar;
                bdf bdfVar = (bdf) ntbVar.a;
                if (bdfVar != null) {
                    str = bdfVar.d;
                    int i2 = fce.a;
                    if (str != null) {
                        break;
                    }
                }
                str = "NA";
                pse pseVar = new pse();
                pseVar.a = sefVar.a;
                pseVar.b = sefVar.b;
                synchronized (sef.class) {
                    tddVar = sef.k;
                    if (tddVar == null) {
                        m96 a3 = rtd.a(Resources.getSystem().getConfiguration());
                        Object[] objArr = new Object[4];
                        int i3 = 0;
                        while (i < a3.a.size()) {
                            Locale locale = a3.a.get(i);
                            ce3 ce3Var = om2.a;
                            String languageTag = locale.toLanguageTag();
                            languageTag.getClass();
                            int i4 = i3 + 1;
                            int length = objArr.length;
                            if (length < i4) {
                                int i5 = length + (length >> 1) + 1;
                                if (i5 < i4) {
                                    i5 = Integer.highestOneBit(i3) << 1;
                                }
                                if (i5 < 0) {
                                    i5 = ConnectionsManager.DEFAULT_DATACENTER_ID;
                                }
                                objArr = Arrays.copyOf(objArr, i5);
                            }
                            objArr[i3] = languageTag;
                            i++;
                            i3 = i4;
                        }
                        tddVar = aad.m(i3, objArr);
                        sef.k = tddVar;
                    }
                }
                pseVar.k = tddVar;
                pseVar.g = Boolean.TRUE;
                pseVar.d = str;
                pseVar.c = str2;
                pseVar.e = sefVar.f.isSuccessful() ? (String) sefVar.f.getResult() : sefVar.d.a();
                pseVar.i = 10;
                pseVar.j = Integer.valueOf(sefVar.h);
                qxVar.d = pseVar;
                sefVar.c.a(qxVar);
                return;
        }
    }

    public /* synthetic */ vc1(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
