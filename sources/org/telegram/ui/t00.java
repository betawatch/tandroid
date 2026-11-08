package org.telegram.ui;

import java.util.Calendar;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t00 implements org.telegram.ui.Components.db0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ t00(long j3, Calendar calendar, int i7, int i10) {
        this.a = i10;
        this.b = j3;
        this.c = calendar;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.db0
    public final String h(int i7) {
        int i10 = this.a;
        int i11 = this.d;
        Calendar calendar = this.c;
        long j3 = this.b;
        switch (i10) {
            case 0:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131748532, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) != i11) {
                    return org.telegram.messenger.id.E0().y0().format(j10);
                }
                return org.telegram.messenger.id.E0().A0().format(j10) + " " + org.telegram.messenger.id.E0().w0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131748532, "MessageScheduleToday");
                }
                long j11 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j11);
                return calendar.get(1) == i11 ? org.telegram.messenger.id.E0().w0().format(j11) : org.telegram.messenger.id.E0().y0().format(j11);
        }
    }
}
