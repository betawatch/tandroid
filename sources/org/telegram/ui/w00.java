package org.telegram.ui;

import java.util.Calendar;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class w00 implements org.telegram.ui.Components.db0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ w00(long j3, Calendar calendar, int i7, int i10) {
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
                    return org.telegram.messenger.id.M0(2131748531, null);
                }
                long j10 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j10);
                if (calendar.get(1) != i11) {
                    return org.telegram.messenger.id.E0().y0().format(j10);
                }
                return org.telegram.messenger.id.E0().A0().format(j10) + " " + org.telegram.messenger.id.E0().w0().format(j10);
            default:
                if (i7 == 0) {
                    return org.telegram.messenger.id.M0(2131748531, "MessageScheduleToday");
                }
                long j11 = (i7 * 86400000) + j3;
                calendar.setTimeInMillis(j11);
                return calendar.get(1) == i11 ? org.telegram.messenger.id.E0().w0().format(j11) : org.telegram.messenger.id.E0().y0().format(j11);
        }
    }
}
