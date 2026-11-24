// default package

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes.dex */
public final class r5a {
    public String a;
    public TLRPC.InputPeer g;
    public long h;
    public long i;
    public long j;
    public long k;
    public int l;
    public double m;
    public long n;
    public long o;
    public final /* synthetic */ a6a q;
    public ArrayList b = new ArrayList();
    public final HashSet c = new HashSet();
    public final HashMap d = new HashMap();
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();
    public int p = ConnectionsManager.DEFAULT_DATACENTER_ID;

    public r5a(a6a a6aVar) {
        this.q = a6aVar;
    }

    public final void a(String str, long j, float f) {
        this.d.put(str, Float.valueOf(f));
        Long valueOf = Long.valueOf(j);
        HashMap hashMap = this.e;
        hashMap.put(str, valueOf);
        this.i = 0L;
        Iterator it = hashMap.entrySet().iterator();
        while (it.hasNext()) {
            this.i = ((Long) ((Map.Entry) it.next()).getValue()).longValue() + this.i;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (!str.equals(this.a)) {
            long j2 = this.i;
            if (j2 != this.o) {
                if (elapsedRealtime != this.n) {
                    double d = (j2 - r2) / ((elapsedRealtime - r4) / 1000.0d);
                    double d2 = this.m;
                    if (d2 == 0.0d) {
                        this.m = d;
                    } else {
                        d = (d * 0.01d) + (0.99d * d2);
                        this.m = d;
                    }
                    this.p = (int) (((this.h - j2) * 1000) / d);
                    this.o = j2;
                    this.n = elapsedRealtime;
                }
            }
        }
        int i = (int) ((this.i / this.h) * 100.0f);
        if (this.l != i) {
            this.l = i;
            this.q.getNotificationCenter().k(nm7.v1, Long.valueOf(this.j));
        }
    }

    public final void b(int i) {
        a6a a6aVar = this.q;
        if (i == 100) {
            a6aVar.E.l(this.j);
        }
        a6aVar.getNotificationCenter().k(nm7.v1, Long.valueOf(this.j));
    }
}
