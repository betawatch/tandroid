package org.telegram.ui;

import org.telegram.messenger.MessagesController;
import pi.g;
import qi.k;
import qi.q;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
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
        org.telegram.ui.Components.a71 a71Var;
        switch (this.a) {
            case 0:
                MessagesController.getInstance(r0.currentAccount).unlinkCommunity(this.b, this.c, new f5((zo) this.d, 4));
                break;
            case 1:
                org.telegram.ui.web.z1 z1Var = (org.telegram.ui.web.z1) this.d;
                long j10 = this.b;
                long j11 = this.c;
                z1Var.f = j10;
                z1Var.h = j11;
                org.telegram.ui.Components.c71 c71Var = z1Var.a;
                if (c71Var != null && (a71Var = c71Var.W2) != null && c71Var.G) {
                    a71Var.N(true);
                    break;
                }
                break;
            case 2:
                qi.q qVar = (qi.q) this.d;
                long j12 = this.b;
                long j13 = this.c;
                if (qVar.m == qi.o.h) {
                    long j14 = ((j12 - j13) * 48000) / 1000;
                    qVar.p = j14;
                    qVar.r = 0L;
                    qVar.s = qi.q.q(j14);
                    qVar.i();
                    break;
                }
                break;
            default:
                cc.e eVar = (cc.e) this.d;
                long j15 = this.b;
                long j16 = this.c;
                final qi.q qVar2 = (qi.q) eVar.c;
                if (j15 == qVar2.o) {
                    qVar2.n = null;
                    qVar2.p += j16;
                    qVar2.q = 0L;
                    qVar2.h.removeCallbacks(qVar2.D);
                    qi.o oVar = qVar2.m;
                    if (oVar != qi.o.s) {
                        if (oVar != qi.o.r) {
                            if (!qVar2.v) {
                                if (oVar == qi.o.d) {
                                    final qi.k kVar = qVar2.z;
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
                                                qVar3.h.post(new g(qVar3, kVar2, bArr, 1));
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
