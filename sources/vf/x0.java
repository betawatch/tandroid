package vf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.o8;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.or;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.w51;
import org.telegram.ui.yh;
import qh.c4;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class x0 extends p2 implements NotificationCenter.NotificationCenterDelegate {
    public h61 a;
    public or b;
    public org.telegram.ui.ActionBar.w0 c;
    public boolean d;
    public boolean e;
    public ArrayList[] f;
    public ArrayList[] h;
    public String n;
    public String r;

    public x0() {
        super(null);
        this.f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void U(x0 x0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            x0Var.b.a(0.0f);
            qc.b0(tL_error);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
            if (x0Var.isFinished || x0Var.finishing) {
                return;
            }
            x0Var.finishFragment();
            return;
        }
        if (x0Var.getParentActivity() == null) {
            return;
        }
        x0Var.b.a(0.0f);
        y3.s(R.string.UnknownError, qc.a0(x0Var), null);
    }

    public static void V(x0 x0Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i10 = R.raw.biz_clock;
        h51 h51Var = new h51(2);
        h51Var.l = string;
        h51Var.o = string2;
        h51Var.k = i10;
        arrayList.add(h51Var);
        h51 i11 = h51.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i11.K(x0Var.e);
        arrayList.add(i11);
        arrayList.add(h51.A(-100, null));
        if (!x0Var.e) {
            return;
        }
        yh.r(R.string.BusinessHours, arrayList);
        int i12 = 0;
        while (true) {
            ArrayList[] arrayListArr = x0Var.h;
            if (i12 >= arrayListArr.length) {
                arrayList.add(h51.A(-101, null));
                arrayList.add(h51.f(LocaleController.getString(R.string.BusinessHoursTimezone), s1.b(x0Var.currentAccount).d(x0Var.r, false), -2));
                arrayList.add(h51.A(-102, null));
                return;
            }
            if (arrayListArr[i12] == null) {
                arrayListArr[i12] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i12].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String a02 = a0(x0Var.h[i12]);
            h51 h51Var2 = new h51(5);
            h51Var2.d = i12;
            h51Var2.l = str;
            h51Var2.m = a02;
            h51Var2.K(!x0Var.h[i12].isEmpty());
            arrayList.add(h51Var2);
            i12++;
        }
    }

    public static /* synthetic */ void W(x0 x0Var, View view, String str) {
        s1 b10 = s1.b(x0Var.currentAccount);
        x0Var.r = str;
        ((o8) view).u(b10.d(str, false), true);
        x0Var.Y(true);
    }

    public static ArrayList[] Z(ArrayList arrayList) {
        int i10;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i11 = 0; i11 < 7; i11++) {
            arrayListArr[i11] = new ArrayList();
        }
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
            int i13 = tL_businessWeeklyOpen.start_minute;
            int i14 = i13 % 1440;
            arrayListArr[(i13 / 1440) % 7].add(new w0(i14, (tL_businessWeeklyOpen.end_minute - i13) + i14));
        }
        int i15 = 0;
        while (i15 < 7) {
            int i16 = i15 * 1440;
            int i17 = i15 + 1;
            int i18 = i17 * 1440;
            int i19 = i16;
            for (int i20 = 0; i20 < arrayList.size(); i20++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i20);
                if (tL_businessWeeklyOpen2.start_minute <= i19 && (i10 = tL_businessWeeklyOpen2.end_minute) >= i19) {
                    i19 = i10 + 1;
                }
            }
            if (i19 >= i18) {
                int i21 = (i15 + 6) % 7;
                if (!arrayListArr[i21].isEmpty() && ((w0) l.d.i(1, arrayListArr[i21])).b >= 1440) {
                    ((w0) l.d.i(1, arrayListArr[i21])).b = 1439;
                }
                int min = Math.min((i19 - i16) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i15 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((w0) arrayList2.get(0)).a < min - 1440) {
                    min = ((w0) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i15].clear();
                arrayListArr[i15].add(new w0(0, min));
            } else {
                int i22 = i17 % 7;
                if (!arrayListArr[i15].isEmpty() && !arrayListArr[i22].isEmpty()) {
                    w0 w0Var = (w0) l.d.i(1, arrayListArr[i15]);
                    w0 w0Var2 = (w0) arrayListArr[i22].get(0);
                    int i23 = w0Var.b;
                    if (i23 > 1440 && i23 - 1439 == w0Var2.a) {
                        w0Var.b = 1439;
                        w0Var2.a = 0;
                    }
                }
            }
            i15 = i17;
        }
        return arrayListArr;
    }

    public static String a0(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (c0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            w0 w0Var = (w0) arrayList.get(i10);
            if (i10 > 0) {
                str = w.c.e(str, "\n");
            }
            StringBuilder l10 = e2.c.l(str);
            l10.append(w0.a(w0Var.a));
            l10.append(" - ");
            l10.append(w0.a(w0Var.b));
            str = l10.toString();
        }
        return str;
    }

    public static boolean c0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i10 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            w0 w0Var = (w0) arrayList.get(i11);
            if (i10 < w0Var.a) {
                return false;
            }
            i10 = w0Var.b;
        }
        return i10 == 1439 || i10 == 1440;
    }

    public static String f0(int i10, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] Z = Z(tL_businessWorkHours.weekly_open);
        StringBuilder sb = new StringBuilder();
        if (user != null) {
            sb.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb.append("\n");
        }
        for (int i11 = 0; i11 < 7; i11++) {
            ArrayList arrayList = Z[i11];
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb.append(": ");
            if (c0(arrayList)) {
                sb.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    if (i12 > 0) {
                        sb.append(", ");
                    }
                    w0 w0Var = (w0) arrayList.get(i12);
                    sb.append(w0.a(w0Var.a));
                    sb.append(" - ");
                    sb.append(w0.a(w0Var.b));
                }
            }
            sb.append("\n");
        }
        TLRPC.TL_timezone a2 = s1.b(i10).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / MediaDataController.MAX_STYLE_RUNS_COUNT) - (a2 == null ? 0 : a2.utc_offset)) / 60 != 0 && a2 != null) {
            int i13 = R.string.BusinessHoursCopyFooter;
            s1.b(i10);
            sb.append(LocaleController.formatString(i13, s1.e(a2, true)));
        }
        return sb.toString();
    }

    public final void X(int i10) {
        if ((this.h[i10].isEmpty() ? null : (w0) l.d.i(1, this.h[i10])) == null) {
            return;
        }
        int i11 = (i10 + 6) % 7;
        w0 w0Var = this.h[i11].isEmpty() ? null : (w0) l.d.i(1, this.h[i11]);
        if (w0Var == null || w0Var.b <= 1439) {
            return;
        }
        w0Var.b = 1439;
        if (w0Var.a >= 1439) {
            this.h[i11].remove(w0Var);
        }
        View x12 = this.a.x1(i11);
        if (x12 instanceof j5) {
            ((j5) x12).setValue(a0(this.h[i11]));
        } else {
            this.a.V2.N(true);
        }
    }

    public final void Y(boolean z4) {
        if (this.c == null) {
            return;
        }
        boolean b02 = b0();
        this.c.setEnabled(b02);
        if (z4) {
            this.c.animate().alpha(b02 ? 1.0f : 0.0f).scaleX(b02 ? 1.0f : 0.0f).scaleY(b02 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.c.setAlpha(b02 ? 1.0f : 0.0f);
        this.c.setScaleX(b02 ? 1.0f : 0.0f);
        this.c.setScaleY(b02 ? 1.0f : 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b0() {
        if ((this.f != null) != this.e || !TextUtils.equals(this.n, this.r)) {
            return true;
        }
        if (this.f != null && this.e) {
            if (this.h == null) {
                return true;
            }
            int i10 = 0;
            loop0: while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i10].size() != this.h[i10].size()) {
                    return true;
                }
                for (int i11 = 0; i11 < this.h[i10].size(); i11++) {
                    w0 w0Var = (w0) this.f[i10].get(i11);
                    w0 w0Var2 = (w0) this.h[i10].get(i11);
                    if (w0Var.a != w0Var2.a || w0Var.b != w0Var2.b) {
                        break loop0;
                    }
                }
                i10++;
            }
        }
        return false;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new th.e(this, 11));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i10 = k6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(k6.w0(null, i10, false), PorterDuff.Mode.MULTIPLY));
        this.b = new or(mutate, new tp(k6.w0(null, i10, false)));
        this.c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        Y(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(k6.w0(null, k6.a7, false));
        h61 h61Var = new h61(this, new c4(this, 22), new sf.h(this, 6), null);
        this.a = h61Var;
        h61Var.o1();
        h61 h61Var2 = this.a;
        h61Var2.V2.r = false;
        frameLayout.addView(h61Var2, c6.c(-1.0f, -1));
        this.actionBar.A(this.a, true);
        e0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        if (this.b.c > 0.0f) {
            return;
        }
        if (!b0()) {
            finishFragment();
            return;
        }
        this.b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i10 = 0; i10 < arrayListArr.length; i10++) {
                if (arrayListArr[i10] != null) {
                    for (int i11 = 0; i11 < arrayListArr[i10].size(); i11++) {
                        w0 w0Var = (w0) arrayListArr[i10].get(i11);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i12 = i10 * 1440;
                        tL_businessWeeklyOpen.start_minute = w0Var.a + i12;
                        tL_businessWeeklyOpen.end_minute = i12 + w0Var.b;
                        arrayList.add(tL_businessWeeklyOpen);
                    }
                }
            }
        }
        if (this.e && !arrayList.isEmpty()) {
            TL_account.TL_businessWorkHours tL_businessWorkHours = new TL_account.TL_businessWorkHours();
            tL_businessWorkHours.timezone_id = this.r;
            tL_businessWorkHours.weekly_open.addAll(arrayList);
            updatebusinessworkhours.flags |= 1;
            updatebusinessworkhours.business_work_hours = tL_businessWorkHours;
            if (userFull != null) {
                userFull.flags2 |= 1;
                userFull.business_work_hours = tL_businessWorkHours;
            }
        } else if (userFull != null) {
            userFull.flags2 &= -2;
            userFull.business_work_hours = null;
        }
        getConnectionsManager().sendRequest(updatebusinessworkhours, new gf.a(this, 26));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        if (i10 == NotificationCenter.userInfoDidLoad) {
            e0();
            return;
        }
        if (i10 == NotificationCenter.timezonesUpdated) {
            if (this.f == null) {
                this.r = s1.b(this.currentAccount).c();
            }
            h61 h61Var = this.a;
            if (h61Var == null || (w51Var = h61Var.V2) == null) {
                return;
            }
            w51Var.N(true);
        }
    }

    public final void e0() {
        w51 w51Var;
        if (this.d) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        boolean z4 = tL_businessWorkHours != null;
        this.e = z4;
        if (!z4) {
            String c3 = s1.b(this.currentAccount).c();
            this.r = c3;
            this.n = c3;
            this.f = null;
            this.h = new ArrayList[7];
            int i10 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i10 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i10] = new ArrayList();
                if (i10 >= 0 && i10 < 5) {
                    this.h[i10].add(new w0(0, 1439));
                }
                i10++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.r = str;
            this.n = str;
            this.f = Z(tL_businessWorkHours.weekly_open);
            this.h = Z(userFull.business_work_hours.weekly_open);
        }
        h61 h61Var = this.a;
        if (h61Var != null && (w51Var = h61Var.V2) != null) {
            w51Var.N(true);
        }
        Y(false);
        this.d = true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final boolean onFragmentCreate() {
        s1.b(this.currentAccount).g();
        this.r = s1.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        d0();
    }

    @Override // org.telegram.ui.ActionBar.p2
    public final void onInsets(int i10, int i11, int i12, int i13) {
        this.a.setPadding(0, 0, 0, i13);
        this.a.setClipToPadding(false);
    }
}
