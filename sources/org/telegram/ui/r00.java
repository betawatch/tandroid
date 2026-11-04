package org.telegram.ui;

import java.util.Calendar;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class r00 implements org.telegram.ui.Components.ya0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ r00(long j10, Calendar calendar, int i3, int i10) {
        this.a = i10;
        this.b = j10;
        this.c = calendar;
        this.d = i3;
    }

    @Override // org.telegram.ui.Components.ya0
    public final String e(int i3) {
        int i10 = this.a;
        int i11 = this.d;
        Calendar calendar = this.c;
        long j10 = this.b;
        switch (i10) {
            case 0:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, null);
                }
                long j11 = (i3 * 86400000) + j10;
                calendar.setTimeInMillis(j11);
                if (calendar.get(1) != i11) {
                    return org.telegram.messenger.bd.E0().y0().format(j11);
                }
                return org.telegram.messenger.bd.E0().A0().format(j11) + " " + org.telegram.messenger.bd.E0().w0().format(j11);
            default:
                if (i3 == 0) {
                    return org.telegram.messenger.bd.M0(2131748539, "MessageScheduleToday");
                }
                long j12 = (i3 * 86400000) + j10;
                calendar.setTimeInMillis(j12);
                return calendar.get(1) == i11 ? org.telegram.messenger.bd.E0().w0().format(j12) : org.telegram.messenger.bd.E0().y0().format(j12);
        }
    }
}
