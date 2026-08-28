package s4;

import d5.f0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import kh.p;
import r4.k;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class i implements r4.g {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final PriorityQueue c;
    public g d;
    public long e;
    public long f;

    public i() {
        for (int i9 = 0; i9 < 10; i9++) {
            this.a.add(new g());
        }
        this.b = new ArrayDeque();
        for (int i10 = 0; i10 < 2; i10++) {
            ArrayDeque arrayDeque = this.b;
            p pVar = new p(this, 29);
            h hVar = new h();
            hVar.c = pVar;
            arrayDeque.add(hVar);
        }
        this.c = new PriorityQueue();
    }

    @Override // r4.g
    public final void a(long j10) {
        this.e = j10;
    }

    public abstract j b();

    public abstract void c(g gVar);

    @Override // k3.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public k dequeueOutputBuffer() {
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
            int i9 = f0.a;
            if (gVar.d > this.e) {
                return null;
            }
            g gVar2 = (g) priorityQueue.poll();
            boolean isEndOfStream = gVar2.isEndOfStream();
            ArrayDeque arrayDeque2 = this.a;
            if (isEndOfStream) {
                k kVar = (k) arrayDeque.pollFirst();
                kVar.addFlag(4);
                gVar2.clear();
                arrayDeque2.add(gVar2);
                return kVar;
            }
            c(gVar2);
            if (e()) {
                j b10 = b();
                k kVar2 = (k) arrayDeque.pollFirst();
                kVar2.a(gVar2.d, b10, Long.MAX_VALUE);
                gVar2.clear();
                arrayDeque2.add(gVar2);
                return kVar2;
            }
            gVar2.clear();
            arrayDeque2.add(gVar2);
        }
    }

    @Override // k3.e
    public final Object dequeueInputBuffer() {
        d5.a.i(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.d = gVar;
        return gVar;
    }

    public abstract boolean e();

    @Override // k3.e
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
            int i9 = f0.a;
            gVar.clear();
            arrayDeque.add(gVar);
        }
        g gVar2 = this.d;
        if (gVar2 != null) {
            gVar2.clear();
            arrayDeque.add(gVar2);
            this.d = null;
        }
    }

    @Override // k3.e
    public final void queueInputBuffer(Object obj) {
        r4.j jVar = (r4.j) obj;
        d5.a.f(jVar == this.d);
        g gVar = (g) jVar;
        if (gVar.isDecodeOnly()) {
            gVar.clear();
            this.a.add(gVar);
        } else {
            long j10 = this.f;
            this.f = 1 + j10;
            gVar.r = j10;
            this.c.add(gVar);
        }
        this.d = null;
    }

    @Override // k3.e
    public void release() {
    }
}
