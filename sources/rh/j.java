package rh;

import java.util.HashMap;
import org.telegram.messenger.zs;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class j implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ r b;
    public final /* synthetic */ long c;

    public /* synthetic */ j(r rVar, long j10, int i10) {
        this.a = i10;
        this.b = rVar;
        this.c = j10;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final r rVar = this.b;
                final long j10 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        long j11 = j10;
                        TLObject tLObject2 = tLObject;
                        r rVar2 = rVar;
                        switch (i11) {
                            case 0:
                                HashMap hashMap = rVar2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j11), null);
                                }
                                rVar2.d.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                zs.f(rVar2.a).k(zs.C3, Long.valueOf(j11));
                                break;
                            default:
                                HashMap hashMap2 = rVar2.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j11), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j11), null);
                                }
                                rVar2.b.put(Long.valueOf(j11), Long.valueOf(System.currentTimeMillis()));
                                zs.f(rVar2.a).k(zs.C3, Long.valueOf(j11));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final r rVar2 = this.b;
                final long j11 = this.c;
                org.telegram.messenger.i0.g3(new Runnable() { // from class: rh.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        long j112 = j11;
                        TLObject tLObject2 = tLObject;
                        r rVar22 = rVar2;
                        switch (i112) {
                            case 0:
                                HashMap hashMap = rVar22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j112), null);
                                }
                                rVar22.d.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                zs.f(rVar22.a).k(zs.C3, Long.valueOf(j112));
                                break;
                            default:
                                HashMap hashMap2 = rVar22.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j112), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j112), null);
                                }
                                rVar22.b.put(Long.valueOf(j112), Long.valueOf(System.currentTimeMillis()));
                                zs.f(rVar22.a).k(zs.C3, Long.valueOf(j112));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
