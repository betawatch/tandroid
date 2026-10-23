package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class tr implements org.telegram.ui.Components.fw0, org.telegram.ui.Components.gw0, LanguageDetector.ExceptionCallback, org.telegram.ui.Components.md0, org.telegram.ui.ActionBar.z1, org.telegram.ui.Components.od0 {
    public final /* synthetic */ int a;

    public /* synthetic */ tr(int i10) {
        this.a = i10;
    }

    @Override // org.telegram.ui.Components.gw0
    public void b(Object obj, float f7) {
        vr vrVar = (vr) obj;
        switch (this.a) {
            case 1:
                vrVar.b = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 2:
            case 4:
            default:
                vrVar.e = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 3:
                vrVar.c = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
            case 5:
                vrVar.d = f7;
                if (vrVar.getParent() != null) {
                    ((View) vrVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.Components.md0
    public String e(int i10) {
        switch (this.a) {
            case 10:
                return i2.o1.k(i10, "");
            case 11:
                switch (i10) {
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
            case 12:
                return String.format("%02d", Integer.valueOf(i10));
            case 13:
            case 14:
            case 24:
            default:
                return String.format("%02d", Integer.valueOf(i10));
            case 15:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar = Calendar.getInstance();
                int i11 = calendar.get(1);
                calendar.add(6, i10);
                long timeInMillis = calendar.getTimeInMillis();
                int i12 = calendar.get(1);
                if (i12 != i11 || i10 >= 7) {
                    return i12 == i11 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis);
            case 16:
                return String.format("%02d", Integer.valueOf(i10));
            case 17:
                return String.format("%02d", Integer.valueOf(i10));
            case 18:
                Calendar calendar2 = Calendar.getInstance();
                calendar2.set(5, 1);
                calendar2.set(2, i10);
                return calendar2.getDisplayName(2, 1, Locale.getDefault());
            case 19:
                return String.format("%02d", Integer.valueOf(i10));
            case 20:
                return String.format("%02d", Integer.valueOf(i10));
            case 21:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar3 = Calendar.getInstance();
                int i13 = calendar3.get(1);
                calendar3.add(6, i10);
                long timeInMillis2 = calendar3.getTimeInMillis();
                return calendar3.get(1) == i13 ? LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis2) : LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis2);
            case 22:
                return String.format("%02d", Integer.valueOf(i10));
            case 23:
                return String.format("%02d", Integer.valueOf(i10));
            case 25:
                return LocaleController.formatPluralString("Times", i10 + 1, new Object[0]);
            case 26:
                return LocaleController.formatPluralString("Minutes", i10 + 1, new Object[0]);
            case 27:
                return LocaleController.getString(R.string.NotificationsFrequencyDivider);
            case 28:
                if (i10 == 0) {
                    return LocaleController.getString(R.string.MessageScheduleToday);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i14 = calendar4.get(1);
                calendar4.add(6, i10);
                long timeInMillis3 = calendar4.getTimeInMillis();
                if (calendar4.get(1) != i14) {
                    return LocaleController.getInstance().getFormatterScheduleYear().format(timeInMillis3);
                }
                return LocaleController.getInstance().getFormatterWeek().format(timeInMillis3) + ", " + LocaleController.getInstance().getFormatterScheduleDay().format(timeInMillis3);
        }
    }

    @Override // org.telegram.ui.ActionBar.z1
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.a) {
            case 13:
                c2Var.dismiss();
                break;
            default:
                c2Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.fw0
    public float get(Object obj) {
        vr vrVar = (vr) obj;
        switch (this.a) {
            case 0:
                return vrVar.b;
            case 1:
            case 3:
            default:
                return vrVar.e;
            case 2:
                return vrVar.c;
            case 4:
                return vrVar.d;
        }
    }

    @Override // org.telegram.ui.Components.od0
    public void n(org.telegram.ui.Components.qd0 qd0Var, int i10) {
        Pattern pattern = org.telegram.ui.Components.f5.a;
    }

    @Override // org.telegram.messenger.LanguageDetector.ExceptionCallback
    public void run(Exception exc) {
        switch (this.a) {
            case 8:
                FileLog.e(exc);
                break;
            default:
                FileLog.e(exc);
                break;
        }
    }
}
