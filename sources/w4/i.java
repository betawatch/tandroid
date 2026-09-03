package w4;

import h5.d0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import org.telegram.tgnet.TLObject;
import ph.z8;
import v4.j;
import v4.k;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class i implements v4.g {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public g d;
    public long e;
    public long f;

    public i() {
        for (int i10 = 0; i10 < 10; i10++) {
            this.a.add(new g());
        }
        this.b = new ArrayDeque();
        for (int i11 = 0; i11 < 2; i11++) {
            ArrayDeque arrayDeque = this.b;
            z8 z8Var = new z8(this, 21);
            h hVar = new h();
            hVar.h = z8Var;
            arrayDeque.add(hVar);
        }
        this.c = new PriorityQueue();
    }

    @Override // v4.g
    public final void a(long j10) {
        this.e = j10;
    }

    @Override // n3.e
    public final Object c() {
        h5.a.i(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.d = gVar;
        return gVar;
    }

    @Override // n3.e
    public final void d(Object obj) {
        j jVar = (j) obj;
        h5.a.f(jVar == this.d);
        g gVar = (g) jVar;
        if (gVar.d(TLObject.FLAG_31)) {
            gVar.b();
            this.a.add(gVar);
        } else {
            long j10 = this.f;
            this.f = 1 + j10;
            gVar.v = j10;
            this.c.add(gVar);
        }
        this.d = null;
    }

    public abstract o3.c e();

    public abstract void f(g gVar);

    @Override // n3.e
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            PriorityQueue priorityQueue = this.c;
            boolean isEmpty = priorityQueue.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            g gVar = (g) priorityQueue.poll();
            int i10 = d0.a;
            gVar.b();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.b();
            arrayDeque.add(gVar2);
            this.d = null;
        }
    }

    @Override // n3.e
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public k b() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            PriorityQueue priorityQueue = this.c;
            if (priorityQueue.isEmpty()) {
                return null;
            }
            g gVar = (g) priorityQueue.peek();
            int i10 = d0.a;
            if (gVar.f > this.e) {
                return null;
            }
            g gVar2 = (g) priorityQueue.poll();
            boolean d = gVar2.d(4);
            ArrayDeque arrayDeque2 = this.a;
            if (d) {
                k kVar = (k) arrayDeque.pollFirst();
                kVar.a(4);
                gVar2.b();
                arrayDeque2.add(gVar2);
                return kVar;
            }
            f(gVar2);
            if (h()) {
                o3.c e = e();
                k kVar2 = (k) arrayDeque.pollFirst();
                kVar2.k(gVar2.f, e, Long.MAX_VALUE);
                gVar2.b();
                arrayDeque2.add(gVar2);
                return kVar2;
            }
            gVar2.b();
            arrayDeque2.add(gVar2);
        }
    }

    public abstract boolean h();

    @Override // n3.e
    public void release() {
    }
}
