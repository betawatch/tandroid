package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import org.webrtc.i;
import ri.k;
import ri.q;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class uo implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;

    public /* synthetic */ uo(Object obj, long j10, long j11, int i10) {
        this.a = i10;
        this.d = obj;
        this.b = j10;
        this.c = j11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        org.telegram.ui.Components.z61 z61Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new f5((zo) this.d, 4));
                break;
            case 1:
                org.telegram.ui.web.y1 y1Var = (org.telegram.ui.web.y1) this.d;
                long j10 = this.b;
                long j11 = this.c;
                y1Var.f = j10;
                y1Var.h = j11;
                org.telegram.ui.Components.b71 b71Var = y1Var.a;
                if (b71Var != null && (z61Var = b71Var.W2) != null && b71Var.G) {
                    z61Var.N(true);
                    break;
                }
                break;
            case 2:
                ri.q qVar = (ri.q) this.d;
                long j12 = this.b;
                long j13 = this.c;
                if (qVar.m == ri.o.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    qVar.p = j14;
                    qVar.r = 0L;
                    qVar.s = ri.q.q(j14);
                    qVar.i();
                    break;
                }
                break;
            default:
                cc.e eVar = (cc.e) this.d;
                long j15 = this.b;
                long j16 = this.c;
                final ri.q qVar2 = (ri.q) eVar.c;
                if (j15 == qVar2.o) {
                    qVar2.n = null;
                    qVar2.p += j16;
                    qVar2.q = 0L;
                    qVar2.h.removeCallbacks(qVar2.D);
                    ri.o oVar = qVar2.m;
                    if (oVar != ri.o.s) {
                        if (oVar != ri.o.r) {
                            if (!qVar2.v) {
                                if (oVar == ri.o.d) {
                                    final ri.k kVar = qVar2.z;
                                    if (kVar != null) {
                                        long j17 = qVar2.j();
                                        qVar2.r = 0L;
                                        qVar2.s = j17;
                                        qVar2.i.execute(new Runnable() { // from class: org.telegram.utils.recorder.audio.d
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                byte[] bArr;
                                                q qVar3 = q.this;
                                                k kVar2 = kVar;
                                                try {
                                                    bArr = AudioRecorderNative.e(kVar2.b.getAbsolutePath());
                                                } catch (Throwable th2) {
                                                    qVar3.g.a("waveform extraction failed", th2);
                                                    bArr = null;
                                                }
                                                qVar3.h.post(new i(qVar3, kVar2, bArr, 4));
                                            }
                                        });
                                        break;
                                    } else {
                                        qVar2.g(new IllegalStateException("Output generation is missing"));
                                        break;
                                    }
                                }
                            } else {
                                qVar2.v = false;
                                qVar2.i();
                                break;
                            }
                        } else {
                            qVar2.c();
                            qVar2.s();
                            break;
                        }
                    } else {
                        qVar2.c();
                        qVar2.s();
                        qVar2.l("cancelled");
                        break;
                    }
                }
                break;
        }
    }
}
