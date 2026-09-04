package zh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes4.dex */
public final /* synthetic */ class h implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ o b;
    public final /* synthetic */ long c;

    public /* synthetic */ h(o oVar, long j3, int i10) {
        this.a = i10;
        this.b = oVar;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final o oVar = this.b;
                final long j3 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        o oVar2 = oVar;
                        switch (i11) {
                            case 0:
                                HashMap hashMap = oVar2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                oVar2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                break;
                            default:
                                HashMap hashMap2 = oVar2.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                oVar2.b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final o oVar2 = this.b;
                final long j10 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: zh.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        o oVar22 = oVar2;
                        switch (i112) {
                            case 0:
                                HashMap hashMap = oVar22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                oVar22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                break;
                            default:
                                HashMap hashMap2 = oVar22.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                oVar22.b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(oVar22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
