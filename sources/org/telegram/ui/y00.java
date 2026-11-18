package org.telegram.ui;

import java.util.Calendar;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final /* synthetic */ class y00 implements org.telegram.ui.Components.ob0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ y00(long j3, Calendar calendar, int i7, int i10) {
        this.a = i10;
        this.b = j3;
        this.c = calendar;
        this.d = i7;
    }

    @Override // org.telegram.ui.Components.ob0
    public final String i(int i7) {
        int i10 = this.a;
        int i11 = this.d;
        Calendar calendar = this.c;
        long j3 = this.b;
        switch (i10) {
            case 0:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.M0(2131748339, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) != i11) {
                    return org.telegram.messenger.gd.E0().y0().format(j10);
                }
                return org.telegram.messenger.gd.E0().A0().format(j10) + " " + org.telegram.messenger.gd.E0().w0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.gd.M0(2131748339, "MessageScheduleToday");
                }
                long j11 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j11);
                return calendar.get(1) == i11 ? org.telegram.messenger.gd.E0().w0().format(j11) : org.telegram.messenger.gd.E0().y0().format(j11);
        }
    }
}
