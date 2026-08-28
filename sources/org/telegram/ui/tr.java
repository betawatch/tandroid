package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.ui.Components.nu0, org.telegram.ui.Components.ou0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.xb0, org.telegram.ui.ActionBar.b2, org.telegram.ui.Components.zb0 {
    public final /* synthetic */ int a;

    public /* synthetic */ tr(int i9) {
        this.a = i9;
    }

    @Override // org.telegram.ui.Components.ou0
    public void b(Object obj, float f10) {
        vr vrVar = (vr) obj;
        switch (this.a) {
            case 1:
                vrVar.d = f10;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                vrVar.e = f10;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.b2
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.a) {
            case 9:
                c2Var.dismiss();
                break;
            case 20:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.xb0
    public String g(int i9) {
        switch (this.a) {
            case 6:
                return j3.r0.l(i9, "");
            case 7:
                switch (i9) {
                    case 0:
                        return LocaleController.getString(R.string.January);
                    case 1:
                        return LocaleController.getString(R.string.February);
                    case 2:
                        return LocaleController.getString(R.string.March);
                    case 3:
                        return LocaleController.getString(R.string.April);
                    case 4:
                        return LocaleController.getString(R.string.May);
                    case 5:
                        return LocaleController.getString(R.string.June);
                    case 6:
                        return LocaleController.getString(R.string.July);
                    case 7:
                        return LocaleController.getString(R.string.August);
                    case 8:
                        return LocaleController.getString(R.string.September);
                    case 9:
                        return LocaleController.getString(R.string.October);
                    case 10:
                        return LocaleController.getString(R.string.November);
                    default:
                        return LocaleController.getString(R.string.December);
                }
            case 8:
                return String.format("%02d", Integer.valueOf(i9));
            case 9:
            case 10:
            case 20:
            case 27:
            default:
                return String.format("%02d", Integer.valueOf(i9));
            case 11:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(1);
                calendar.add(6, i9);
                long timeInMillis = calendar.getTimeInMillis();
                int i11 = calendar.get(1);
                if (i11 != i10 || i9 >= 7) {
                    return i11 == i10 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            case 12:
                return String.format("%02d", Integer.valueOf(i9));
            case 13:
                return String.format("%02d", Integer.valueOf(i9));
            case 14:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i9);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 15:
                return String.format("%02d", Integer.valueOf(i9));
            case 16:
                return String.format("%02d", Integer.valueOf(i9));
            case 17:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i12 = calendar3.get(1);
                calendar3.add(6, i9);
                long timeInMillis2 = calendar3.getTimeInMillis();
                return calendar3.get(1) == i12 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 18:
                return String.format("%02d", Integer.valueOf(i9));
            case 19:
                return String.format("%02d", Integer.valueOf(i9));
            case 21:
                return LocaleController.formatPluralString("Times", i9 + 1, new Object[0]);
            case 22:
                return LocaleController.formatPluralString("Minutes", i9 + 1, new Object[0]);
            case 23:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 24:
                if (i9 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i13 = calendar4.get(1);
                calendar4.add(6, i9);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) != i13) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
            case 25:
                return String.format("%02d", Integer.valueOf(i9));
            case 26:
                return String.format("%02d", Integer.valueOf(i9));
            case 28:
                boolean z10 = LocaleController.is24HourFormat;
                String format = String.format("%02d", Integer.valueOf((i9 % 12 != 0 || z10) ? i9 % (z10 ? 24 : 12) : 12));
                return i9 >= 24 ? LocaleController.formatString(R.string.BusinessHoursNextDayPicker, format) : format;
        }
    }

    @Override // org.telegram.ui.Components.nu0
    public float get(Object obj) {
        vr vrVar = (vr) obj;
        switch (this.a) {
            case 0:
                return vrVar.d;
            default:
                return vrVar.e;
        }
    }

    @Override // org.telegram.ui.Components.zb0
    public void m(org.telegram.ui.Components.bc0 bc0Var, int i9) {
        Pattern pattern = org.telegram.ui.Components.y4.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 4:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
