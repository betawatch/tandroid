package rh;

import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class y0 implements NotificationCenter.NotificationCenterDelegate {
    public final /* synthetic */ long a;
    public final /* synthetic */ NotificationCenter.NotificationCenterDelegate[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ x0 d;

    public y0(long j10, NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr, int i10, x0 x0Var) {
        this.a = j10;
        this.b = notificationCenterDelegateArr;
        this.c = i10;
        this.d = x0Var;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        a0.h hVar;
        int i12 = NotificationCenter.didReceivedWebpagesInUpdates;
        if (i10 != i12 || (hVar = (a0.h) objArr[0]) == null) {
            return;
        }
        long j10 = this.a;
        if (hVar.d(j10)) {
            TLRPC.WebPage webPage = (TLRPC.WebPage) hVar.f(j10);
            NotificationCenter.NotificationCenterDelegate[] notificationCenterDelegateArr = this.b;
            if (notificationCenterDelegateArr[0] != null) {
                NotificationCenter.getInstance(this.c).addObserver(notificationCenterDelegateArr[0], i12);
                notificationCenterDelegateArr[0] = null;
            }
            if (!(webPage instanceof TLRPC.TL_webPage)) {
                webPage = null;
            }
            this.d.run(webPage);
        }
    }
}
