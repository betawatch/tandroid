package s4;

import d5.g0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import lh.p;
import r4.k;
import r4.l;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class i implements r4.h {
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
            p pVar = new p(this, 29);
            h hVar = new h();
            hVar.c = pVar;
            arrayDeque.add(hVar);
        }
        this.c = new PriorityQueue();
    }

    @Override // r4.h
    public final void a(long j10) {
        this.e = j10;
    }

    public abstract a5.b b();

    public abstract void c(g gVar);

    @Override // k3.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public l dequeueOutputBuffer() {
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
            int i10 = g0.a;
            if (gVar.d > this.e) {
                return null;
            }
            g gVar2 = (g) priorityQueue.poll();
            boolean isEndOfStream = gVar2.isEndOfStream();
            ArrayDeque arrayDeque2 = this.a;
            if (isEndOfStream) {
                l lVar = (l) arrayDeque.pollFirst();
                lVar.addFlag(4);
                gVar2.clear();
                arrayDeque2.add(gVar2);
                return lVar;
            }
            c(gVar2);
            if (e()) {
                a5.b b10 = b();
                l lVar2 = (l) arrayDeque.pollFirst();
                lVar2.a(gVar2.d, b10, Long.MAX_VALUE);
                gVar2.clear();
                arrayDeque2.add(gVar2);
                return lVar2;
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
            int i10 = g0.a;
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
        k kVar = (k) obj;
        d5.a.f(kVar == this.d);
        g gVar = (g) kVar;
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
