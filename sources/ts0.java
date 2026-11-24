// default package

import java.util.HashMap;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final /* synthetic */ class ts0 implements RequestDelegate {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ct0 b;
    public final /* synthetic */ long c;

    public /* synthetic */ ts0(ct0 ct0Var, long j, byte b) {
        this.a = b;
        this.b = ct0Var;
        this.c = j;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final byte b = 1;
                final ct0 ct0Var = this.b;
                final long j = this.c;
                gl.c3(new Runnable() { // from class: ys0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b2 = b;
                        long j2 = j;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var2 = ct0Var;
                        switch (b2) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap = ct0Var2.e;
                                if (z) {
                                    hashMap.put(Long.valueOf(j2), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j2), null);
                                }
                                ct0Var2.d.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var2.a).k(kk7.D3, Long.valueOf(j2));
                                break;
                            default:
                                boolean z2 = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap2 = ct0Var2.c;
                                if (z2) {
                                    hashMap2.put(Long.valueOf(j2), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j2), null);
                                }
                                ct0Var2.b.put(Long.valueOf(j2), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var2.a).k(kk7.D3, Long.valueOf(j2));
                                break;
                        }
                    }
                });
                break;
            default:
                final byte b2 = 0;
                final ct0 ct0Var2 = this.b;
                final long j2 = this.c;
                gl.c3(new Runnable() { // from class: ys0
                    @Override // java.lang.Runnable
                    public final void run() {
                        byte b22 = b2;
                        long j22 = j2;
                        TLObject tLObject2 = tLObject;
                        ct0 ct0Var22 = ct0Var2;
                        switch (b22) {
                            case 0:
                                boolean z = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap = ct0Var22.e;
                                if (z) {
                                    hashMap.put(Long.valueOf(j22), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j22), null);
                                }
                                ct0Var22.d.put(Long.valueOf(j22), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var22.a).k(kk7.D3, Long.valueOf(j22));
                                break;
                            default:
                                boolean z2 = tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats;
                                HashMap hashMap2 = ct0Var22.c;
                                if (z2) {
                                    hashMap2.put(Long.valueOf(j22), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j22), null);
                                }
                                ct0Var22.b.put(Long.valueOf(j22), Long.valueOf(System.currentTimeMillis()));
                                kk7.f(ct0Var22.a).k(kk7.D3, Long.valueOf(j22));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
