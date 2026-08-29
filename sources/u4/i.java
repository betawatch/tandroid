package u4;

import f5.d0;
import java.util.ArrayDeque;
import java.util.PriorityQueue;
import sf.f1;
import t4.k;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class i implements t4.g {
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
            f1 f1Var = new f1(this, 12);
            h hVar = new h();
            hVar.c = f1Var;
            arrayDeque.add(hVar);
        }
        this.c = new PriorityQueue();
    }

    @Override // t4.g
    public final void a(long j10) {
        this.e = j10;
    }

    public abstract j b();

    public abstract void c(g gVar);

    @Override // m3.e
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
            int i10 = d0.a;
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

    @Override // m3.e
    public final Object dequeueInputBuffer() {
        f5.a.i(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        g gVar = (g) arrayDeque.pollFirst();
        this.d = gVar;
        return gVar;
    }

    public abstract boolean e();

    @Override // m3.e
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

    @Override // m3.e
    public final void queueInputBuffer(Object obj) {
        t4.j jVar = (t4.j) obj;
        f5.a.f(jVar == this.d);
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

    @Override // m3.e
    public void release() {
    }
}
