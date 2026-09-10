package xh;

import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final /* synthetic */ class i implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ p b;
    public final /* synthetic */ long c;

    public /* synthetic */ i(p pVar, long j3, int i10) {
        this.a = i10;
        this.b = pVar;
        this.c = j3;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                final int i10 = 1;
                final p pVar = this.b;
                final long j3 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i11 = i10;
                        long j10 = j3;
                        TLObject tLObject2 = tLObject;
                        p pVar2 = pVar;
                        switch (i11) {
                            case 0:
                                HashMap hashMap = pVar2.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j10), null);
                                }
                                pVar2.d.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                break;
                            default:
                                HashMap hashMap2 = pVar2.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j10), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j10), null);
                                }
                                pVar2.b.put(Long.valueOf(j10), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar2.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j10));
                                break;
                        }
                    }
                });
                break;
            default:
                final int i11 = 0;
                final p pVar2 = this.b;
                final long j10 = this.c;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: xh.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i112 = i11;
                        long j102 = j10;
                        TLObject tLObject2 = tLObject;
                        p pVar22 = pVar2;
                        switch (i112) {
                            case 0:
                                HashMap hashMap = pVar22.e;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap.put(Long.valueOf(j102), null);
                                }
                                pVar22.d.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                break;
                            default:
                                HashMap hashMap2 = pVar22.c;
                                if (tLObject2 instanceof TLRPC.TL_payments_starsRevenueStats) {
                                    hashMap2.put(Long.valueOf(j102), (TLRPC.TL_payments_starsRevenueStats) tLObject2);
                                } else {
                                    hashMap2.put(Long.valueOf(j102), null);
                                }
                                pVar22.b.put(Long.valueOf(j102), Long.valueOf(System.currentTimeMillis()));
                                NotificationCenter.getInstance(pVar22.a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.botStarsUpdated, Long.valueOf(j102));
                                break;
                        }
                    }
                });
                break;
        }
    }
}
