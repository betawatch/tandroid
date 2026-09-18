package org.telegram.ui;

import java.util.Calendar;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class z20 implements org.telegram.ui.Components.qc0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Calendar c;
    public final /* synthetic */ int d;

    public /* synthetic */ z20(long j3, Calendar calendar, int i10, int i11) {
        this.a = i11;
        this.b = j3;
        this.c = calendar;
        this.d = i10;
    }

    @Override // org.telegram.ui.Components.qc0
    public final String e(int i10) {
        switch (this.a) {
            case 0:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                long j3 = (i10 * 86400000) + this.b;
                Calendar calendar = this.c;
                calendar.setTimeInMillis(j3);
                if (calendar.get(1) != this.d) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(j3);
                }
                return LocaleController.getInstance().getFormatterWeek().format(j3) + " " + LocaleController.getInstance().getFormatterScheduleDay().format(j3);
            default:
                if (i10 == 0) {
                    return LocaleController.getString("MessageScheduleToday", R.string.MessageScheduleToday);
                }
                long j10 = (i10 * 86400000) + this.b;
                Calendar calendar2 = this.c;
                calendar2.setTimeInMillis(j10);
                return calendar2.get(1) == this.d ? LocaleController.getInstance().getFormatterScheduleDay().format(j10) : LocaleController.getInstance().getFormatterScheduleYear().format(j10);
        }
    }
}
