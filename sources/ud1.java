// default package

import java.util.ArrayDeque;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes.dex */
public abstract class ud1 implements lab {
    public final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    public final ArrayDeque c;
    public sd1 d;
    public long e;
    public long f;
    public long g;

    public ud1() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new sd1());
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            ArrayDeque arrayDeque = this.b;
            sg0 sg0Var = new sg0(this, (byte) 29);
            td1 td1Var = new td1();
            td1Var.c = sg0Var;
            arrayDeque.add(td1Var);
        }
        this.c = new ArrayDeque();
        this.g = -9223372036854775807L;
    }

    @Override // u83
    public final void a(long j) {
        this.g = j;
    }

    @Override // lab
    public final void b(long j) {
        this.e = j;
    }

    @Override // u83
    public final Object d() {
        gre.p(this.d == null);
        ArrayDeque arrayDeque = this.a;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        sd1 sd1Var = (sd1) arrayDeque.pollFirst();
        this.d = sd1Var;
        return sd1Var;
    }

    @Override // u83
    public final void e(Object obj) {
        qab qabVar = (qab) obj;
        gre.f(qabVar == this.d);
        sd1 sd1Var = (sd1) qabVar;
        if (!sd1Var.isEndOfStream()) {
            long j = sd1Var.e;
            if (j != Long.MIN_VALUE) {
                long j2 = this.g;
                if (j2 != -9223372036854775807L && j < j2) {
                    sd1Var.clear();
                    this.a.add(sd1Var);
                    this.d = null;
                }
            }
        }
        long j3 = this.f;
        this.f = 1 + j3;
        sd1Var.s = j3;
        this.c.add(sd1Var);
        this.d = null;
    }

    public abstract qx4 f();

    @Override // u83
    public void flush() {
        ArrayDeque arrayDeque;
        this.f = 0L;
        this.e = 0L;
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            boolean isEmpty = arrayDeque2.isEmpty();
            arrayDeque = this.a;
            if (isEmpty) {
                break;
            }
            sd1 sd1Var = (sd1) arrayDeque2.poll();
            String str = g8c.a;
            sd1Var.clear();
            arrayDeque.add(sd1Var);
        }
        sd1 sd1Var2 = this.d;
        if (sd1Var2 != null) {
            sd1Var2.clear();
            arrayDeque.add(sd1Var2);
            this.d = null;
        }
    }

    public abstract void g(sd1 sd1Var);

    @Override // u83
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public rab c() {
        ArrayDeque arrayDeque = this.b;
        if (arrayDeque.isEmpty()) {
            return null;
        }
        while (true) {
            ArrayDeque arrayDeque2 = this.c;
            if (arrayDeque2.isEmpty()) {
                return null;
            }
            sd1 sd1Var = (sd1) arrayDeque2.peek();
            String str = g8c.a;
            if (sd1Var.e > this.e) {
                return null;
            }
            sd1 sd1Var2 = (sd1) arrayDeque2.poll();
            boolean isEndOfStream = sd1Var2.isEndOfStream();
            ArrayDeque arrayDeque3 = this.a;
            if (isEndOfStream) {
                rab rabVar = (rab) arrayDeque.pollFirst();
                rabVar.addFlag(4);
                sd1Var2.clear();
                arrayDeque3.add(sd1Var2);
                return rabVar;
            }
            g(sd1Var2);
            if (i()) {
                qx4 f = f();
                rab rabVar2 = (rab) arrayDeque.pollFirst();
                long j = sd1Var2.e;
                rabVar2.timeUs = j;
                rabVar2.a = f;
                rabVar2.b = j;
                sd1Var2.clear();
                arrayDeque3.add(sd1Var2);
                return rabVar2;
            }
            sd1Var2.clear();
            arrayDeque3.add(sd1Var2);
        }
    }

    public abstract boolean i();

    @Override // u83
    public void release() {
    }
}
