package z3;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import d5.f0;
import d5.n;
import g7.y8;
import gh.i3;
import h3.g1;
import h3.h0;
import h3.h1;
import h3.k0;
import h3.t0;
import h3.u0;
import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class f extends h3.e implements Handler.Callback {
    public final d a;
    public final h0 b;
    public final Handler c;
    public final e d;
    public y8 e;
    public boolean f;
    public boolean h;
    public long n;
    public c r;
    public long s;

    public f(h0 h0Var, Looper looper) {
        super(5);
        Handler handler;
        this.b = h0Var;
        if (looper == null) {
            handler = null;
        } else {
            int i9 = f0.a;
            handler = new Handler(looper, this);
        }
        this.c = handler;
        this.a = d.a;
        this.d = new e();
        this.s = -9223372036854775807L;
    }

    public final void a(c cVar, ArrayList arrayList) {
        int i9 = 0;
        while (true) {
            b[] bVarArr = cVar.a;
            if (i9 >= bVarArr.length) {
                return;
            }
            t0 wrappedMetadataFormat = bVarArr[i9].getWrappedMetadataFormat();
            if (wrappedMetadataFormat != null) {
                d dVar = this.a;
                if (dVar.b(wrappedMetadataFormat)) {
                    y8 a2 = dVar.a(wrappedMetadataFormat);
                    byte[] wrappedMetadataBytes = bVarArr[i9].getWrappedMetadataBytes();
                    wrappedMetadataBytes.getClass();
                    e eVar = this.d;
                    eVar.clear();
                    eVar.c(wrappedMetadataBytes.length);
                    eVar.b.put(wrappedMetadataBytes);
                    eVar.d();
                    c a3 = a2.a(eVar);
                    if (a3 != null) {
                        a(a3, arrayList);
                    }
                    i9++;
                }
            }
            arrayList.add(bVarArr[i9]);
            i9++;
        }
    }

    public final long b(long j10) {
        d5.a.i(j10 != -9223372036854775807L);
        d5.a.i(this.s != -9223372036854775807L);
        return j10 - this.s;
    }

    public final void c(c cVar) {
        h0 h0Var = this.b;
        k0 k0Var = h0Var.a;
        h1 h1Var = k0Var.h0;
        n nVar = k0Var.l;
        g1 a2 = h1Var.a();
        int i9 = 0;
        while (true) {
            b[] bVarArr = cVar.a;
            if (i9 >= bVarArr.length) {
                break;
            }
            bVarArr[i9].populateMediaMetadata(a2);
            i9++;
        }
        k0Var.h0 = new h1(a2);
        h1 R = k0Var.R();
        if (!R.equals(k0Var.O)) {
            k0Var.O = R;
            nVar.c(14, new i3(h0Var, 11));
        }
        nVar.c(28, new i3(cVar, 12));
        nVar.b();
    }

    @Override // h3.e, h3.h2
    public final String getName() {
        return "MetadataRenderer";
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            throw new IllegalStateException();
        }
        c((c) message.obj);
        return true;
    }

    @Override // h3.e
    public final boolean isEnded() {
        return this.h;
    }

    @Override // h3.e
    public final boolean isReady() {
        return true;
    }

    @Override // h3.e
    public final void onDisabled() {
        this.r = null;
        this.e = null;
        this.s = -9223372036854775807L;
    }

    @Override // h3.e
    public final void onPositionReset(long j10, boolean z10) {
        this.r = null;
        this.f = false;
        this.h = false;
    }

    @Override // h3.e
    public final void onStreamChanged(t0[] t0VarArr, long j10, long j11) {
        this.e = this.a.a(t0VarArr[0]);
        c cVar = this.r;
        if (cVar != null) {
            long j12 = cVar.b;
            long j13 = (this.s + j12) - j11;
            if (j12 != j13) {
                cVar = new c(j13, cVar.a);
            }
            this.r = cVar;
        }
        this.s = j11;
    }

    @Override // h3.e
    public final void render(long j10, long j11) {
        boolean z10 = true;
        while (z10) {
            if (!this.f && this.r == null) {
                e eVar = this.d;
                eVar.clear();
                u0 formatHolder = getFormatHolder();
                int readSource = readSource(formatHolder, eVar, 0);
                if (readSource == -4) {
                    if (eVar.isEndOfStream()) {
                        this.f = true;
                    } else {
                        eVar.n = this.n;
                        eVar.d();
                        y8 y8Var = this.e;
                        int i9 = f0.a;
                        c a2 = y8Var.a(eVar);
                        if (a2 != null) {
                            ArrayList arrayList = new ArrayList(a2.a.length);
                            a(a2, arrayList);
                            if (!arrayList.isEmpty()) {
                                this.r = new c(b(eVar.d), (b[]) arrayList.toArray(new b[0]));
                            }
                        }
                    }
                } else if (readSource == -5) {
                    t0 t0Var = formatHolder.b;
                    t0Var.getClass();
                    this.n = t0Var.F;
                }
            }
            c cVar = this.r;
            if (cVar == null || cVar.b > b(j10)) {
                z10 = false;
            } else {
                c cVar2 = this.r;
                Handler handler = this.c;
                if (handler != null) {
                    handler.obtainMessage(0, cVar2).sendToTarget();
                } else {
                    c(cVar2);
                }
                this.r = null;
                z10 = true;
            }
            if (this.f && this.r == null) {
                this.h = true;
            }
        }
    }

    @Override // h3.h2
    public final int supportsFormat(t0 t0Var) {
        if (this.a.b(t0Var)) {
            return e2.c.b(t0Var.W == 0 ? 4 : 2, 0, 0);
        }
        return e2.c.b(0, 0, 0);
    }
}
