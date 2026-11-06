package org.telegram.ui;

import android.view.View;
import java.util.Calendar;
import java.util.Locale;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class zq implements org.telegram.ui.Components.kt0, org.telegram.ui.Components.jt0, org.telegram.messenger.oc, org.telegram.ui.ActionBar.r1, org.telegram.ui.Components.fb0, org.telegram.ui.Components.db0 {
    public final /* synthetic */ int a;

    public /* synthetic */ zq(int i7) {
        this.a = i7;
    }

    @Override // org.telegram.ui.Components.kt0
    public void f(Object obj, float f10) {
        br brVar = (br) obj;
        switch (this.a) {
            case 0:
                brVar.I1 = f10;
                if (brVar.getParent() != null) {
                    ((View) brVar.getParent()).invalidate();
                    break;
                }
                break;
            default:
                brVar.J1 = f10;
                if (brVar.getParent() != null) {
                    ((View) brVar.getParent()).invalidate();
                    break;
                }
                break;
        }
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 5:
                u1Var.dismiss();
                break;
            case 19:
                u1Var.dismiss();
                break;
            default:
                u1Var.dismiss();
                break;
        }
    }

    @Override // org.telegram.ui.Components.jt0
    public float get(Object obj) {
        return ((br) obj).J1;
    }

    @Override // org.telegram.ui.Components.db0
    public String h(int i7) {
        switch (this.a) {
            case 7:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar = Calendar.getInstance();
                int i10 = calendar.get(1);
                calendar.add(6, i7);
                long timeInMillis = calendar.getTimeInMillis();
                if (calendar.get(1) != i10) {
                    return org.telegram.messenger.hd.E0().y0().format(timeInMillis);
                }
                return org.telegram.messenger.hd.E0().A0().format(timeInMillis) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis);
            case 8:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar2 = Calendar.getInstance();
                int i11 = calendar2.get(1);
                calendar2.add(6, i7);
                long timeInMillis2 = calendar2.getTimeInMillis();
                int i12 = calendar2.get(1);
                if (i12 != i11 || i7 >= 7) {
                    return i12 == i11 ? org.telegram.messenger.hd.E0().w0().format(timeInMillis2) : org.telegram.messenger.hd.E0().y0().format(timeInMillis2);
                }
                return org.telegram.messenger.hd.E0().A0().format(timeInMillis2) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis2);
            case 9:
                return String.format("%02d", Integer.valueOf(i7));
            case 10:
                return String.format("%02d", Integer.valueOf(i7));
            case 11:
                return String.format("%02d", Integer.valueOf(i7));
            case 12:
                return String.format("%02d", Integer.valueOf(i7));
            case 13:
                Calendar calendar3 = Calendar.getInstance();
                calendar3.set(5, 1);
                calendar3.set(2, i7);
                return calendar3.getDisplayName(2, 1, Locale.getDefault());
            case 14:
                return String.format("%02d", Integer.valueOf(i7));
            case 15:
                return String.format("%02d", Integer.valueOf(i7));
            case 16:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar4 = Calendar.getInstance();
                int i13 = calendar4.get(1);
                calendar4.add(6, i7);
                long timeInMillis3 = calendar4.getTimeInMillis();
                return calendar4.get(1) == i13 ? org.telegram.messenger.hd.E0().w0().format(timeInMillis3) : org.telegram.messenger.hd.E0().y0().format(timeInMillis3);
            case 17:
                return String.format("%02d", Integer.valueOf(i7));
            case 18:
                return String.format("%02d", Integer.valueOf(i7));
            case 19:
            case 26:
            default:
                return i7 == 0 ? org.telegram.messenger.hd.M0(2131745362, null) : (i7 < 1 || i7 >= 16) ? i7 == 16 ? org.telegram.messenger.hd.c0(30) : i7 == 17 ? org.telegram.messenger.hd.c0(60) : i7 == 18 ? org.telegram.messenger.hd.c0(3600) : i7 == 19 ? org.telegram.messenger.hd.c0(86400) : i7 == 20 ? org.telegram.messenger.hd.c0(604800) : "" : org.telegram.messenger.hd.c0(i7);
            case 20:
                return org.telegram.messenger.hd.G(i7 + 1, "Times", new Object[0]);
            case 21:
                return org.telegram.messenger.hd.G(i7 + 1, "Minutes", new Object[0]);
            case 22:
                return org.telegram.messenger.hd.M0(2131747907, null);
            case 23:
                if (i7 == 0) {
                    return org.telegram.messenger.hd.M0(2131748530, null);
                }
                Calendar calendar5 = Calendar.getInstance();
                int i14 = calendar5.get(1);
                calendar5.add(6, i7);
                long timeInMillis4 = calendar5.getTimeInMillis();
                if (calendar5.get(1) != i14) {
                    return org.telegram.messenger.hd.E0().y0().format(timeInMillis4);
                }
                return org.telegram.messenger.hd.E0().A0().format(timeInMillis4) + ", " + org.telegram.messenger.hd.E0().w0().format(timeInMillis4);
            case 24:
                return String.format("%02d", Integer.valueOf(i7));
            case 25:
                return String.format("%02d", Integer.valueOf(i7));
            case 27:
                boolean z9 = org.telegram.messenger.hd.c0;
                String format = String.format("%02d", Integer.valueOf((i7 % 12 != 0 || z9) ? i7 % (z9 ? 24 : 12) : 12));
                return i7 >= 24 ? org.telegram.messenger.hd.a0(null, null, 2131752747, format) : format;
            case 28:
                return String.format("%02d", Integer.valueOf(i7));
        }
    }

    @Override // org.telegram.ui.Components.fb0
    public void n(org.telegram.ui.Components.hb0 hb0Var, int i7) {
        Pattern pattern = org.telegram.ui.Components.v4.a;
    }

    @Override // org.telegram.messenger.oc
    public void r(Exception exc) {
        switch (this.a) {
            case 3:
                org.telegram.messenger.a8.g(exc, true);
                break;
            default:
                org.telegram.messenger.a8.g(exc, true);
                break;
        }
    }
}
