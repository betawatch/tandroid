package org.telegram.ui;

import org.telegram.messenger.NotificationCenter;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class wk implements NotificationCenter.PostponeNotificationCallback {
    public final /* synthetic */ qn a;

    public wk(qn qnVar) {
        this.a = qnVar;
    }

    @Override // org.telegram.messenger.NotificationCenter.PostponeNotificationCallback
    public final boolean needPostpone(int i10, int i11, Object[] objArr) {
        if (i10 == NotificationCenter.didReceiveNewMessages) {
            long longValue = ((Long) objArr[0]).longValue();
            qn qnVar = this.a;
            if (qnVar.H6 && longValue == qnVar.T5) {
                return true;
            }
        }
        return false;
    }
}
