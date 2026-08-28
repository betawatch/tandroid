package pf;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import kh.b8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.j2;
import org.telegram.ui.Cells.j5;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.jp;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.z41;
import org.telegram.ui.xe1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y0 extends o2 implements NotificationCenter.NotificationCenterDelegate {
    public i51 a;
    public fr b;
    public org.telegram.ui.ActionBar.w0 c;
    public boolean d;
    public boolean e;
    public ArrayList[] f;
    public ArrayList[] h;
    public String n;
    public String r;

    public y0() {
        super(null);
        this.f = null;
        this.h = new ArrayList[]{new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList(), new ArrayList()};
    }

    public static void T(y0 y0Var, TLRPC.TL_error tL_error, TLObject tLObject) {
        if (tL_error != null) {
            y0Var.b.a(0.0f);
            oc.b0(tL_error);
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolFalse)) {
            if (y0Var.isFinished || y0Var.finishing) {
                return;
            }
            y0Var.finishFragment();
            return;
        }
        if (y0Var.getParentActivity() == null) {
            return;
        }
        y0Var.b.a(0.0f);
        ll.p(R.string.UnknownError, oc.a0(y0Var), null);
    }

    public static void U(y0 y0Var, ArrayList arrayList) {
        String string = LocaleController.getString(R.string.BusinessHours);
        String string2 = LocaleController.getString(R.string.BusinessHoursInfo);
        int i9 = R.raw.biz_clock;
        l41 l41Var = new l41(2);
        l41Var.l = string;
        l41Var.o = string2;
        l41Var.k = i9;
        arrayList.add(l41Var);
        l41 i10 = l41.i(-1, LocaleController.getString(R.string.BusinessHoursShow));
        i10.K(y0Var.e);
        arrayList.add(i10);
        arrayList.add(l41.A(-100, null));
        if (!y0Var.e) {
            return;
        }
        j2.l(R.string.BusinessHours, arrayList);
        int i11 = 0;
        while (true) {
            ArrayList[] arrayListArr = y0Var.h;
            if (i11 >= arrayListArr.length) {
                arrayList.add(l41.A(-101, null));
                arrayList.add(l41.f(LocaleController.getString(R.string.BusinessHoursTimezone), u1.b(y0Var.currentAccount).d(y0Var.r, false), -2));
                arrayList.add(l41.A(-102, null));
                return;
            }
            if (arrayListArr[i11] == null) {
                arrayListArr[i11] = new ArrayList();
            }
            String displayName = DayOfWeek.values()[i11].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            String str = displayName.substring(0, 1).toUpperCase() + displayName.substring(1);
            String Z = Z(y0Var.h[i11]);
            l41 l41Var2 = new l41(5);
            l41Var2.d = i11;
            l41Var2.l = str;
            l41Var2.m = Z;
            l41Var2.K(!y0Var.h[i11].isEmpty());
            arrayList.add(l41Var2);
            i11++;
        }
    }

    public static /* synthetic */ void V(y0 y0Var, View view, String str) {
        u1 b10 = u1.b(y0Var.currentAccount);
        y0Var.r = str;
        ((p8) view).u(b10.d(str, false), true);
        y0Var.X(true);
    }

    public static ArrayList[] Y(ArrayList arrayList) {
        int i9;
        ArrayList[] arrayListArr = new ArrayList[7];
        for (int i10 = 0; i10 < 7; i10++) {
            arrayListArr[i10] = new ArrayList();
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = (TL_account.TL_businessWeeklyOpen) arrayList.get(i11);
            int i12 = tL_businessWeeklyOpen.start_minute;
            int i13 = i12 % 1440;
            arrayListArr[(i12 / 1440) % 7].add(new x0(i13, (tL_businessWeeklyOpen.end_minute - i12) + i13));
        }
        int i14 = 0;
        while (i14 < 7) {
            int i15 = i14 * 1440;
            int i16 = i14 + 1;
            int i17 = i16 * 1440;
            int i18 = i15;
            for (int i19 = 0; i19 < arrayList.size(); i19++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i19);
                if (tL_businessWeeklyOpen2.start_minute <= i18 && (i9 = tL_businessWeeklyOpen2.end_minute) >= i18) {
                    i18 = i9 + 1;
                }
            }
            if (i18 >= i17) {
                int i20 = (i14 + 6) % 7;
                if (!arrayListArr[i20].isEmpty() && ((x0) j3.r0.j(1, arrayListArr[i20])).b >= 1440) {
                    ((x0) j3.r0.j(1, arrayListArr[i20])).b = 1439;
                }
                int min = Math.min((i18 - i15) - 1, 2879);
                ArrayList arrayList2 = arrayListArr[(i14 + 8) % 7];
                if (min >= 1440 && !arrayList2.isEmpty() && ((x0) arrayList2.get(0)).a < min - 1440) {
                    min = ((x0) arrayList2.get(0)).a + 1439;
                }
                arrayListArr[i14].clear();
                arrayListArr[i14].add(new x0(0, min));
            } else {
                int i21 = i16 % 7;
                if (!arrayListArr[i14].isEmpty() && !arrayListArr[i21].isEmpty()) {
                    x0 x0Var = (x0) j3.r0.j(1, arrayListArr[i14]);
                    x0 x0Var2 = (x0) arrayListArr[i21].get(0);
                    int i22 = x0Var.b;
                    if (i22 > 1440 && i22 - 1439 == x0Var2.a) {
                        x0Var.b = 1439;
                        x0Var2.a = 0;
                    }
                }
            }
            i14 = i16;
        }
        return arrayListArr;
    }

    public static String Z(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return LocaleController.getString(R.string.BusinessHoursDayClosed);
        }
        if (b0(arrayList)) {
            return LocaleController.getString(R.string.BusinessHoursDayFullOpened);
        }
        String str = "";
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            x0 x0Var = (x0) arrayList.get(i9);
            if (i9 > 0) {
                str = ta.b.j(str, "\n");
            }
            StringBuilder n10 = e2.c.n(str);
            n10.append(x0.a(x0Var.a));
            n10.append(" - ");
            n10.append(x0.a(x0Var.b));
            str = n10.toString();
        }
        return str;
    }

    public static boolean b0(ArrayList arrayList) {
        if (arrayList == null || arrayList.isEmpty()) {
            return false;
        }
        int i9 = 0;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            x0 x0Var = (x0) arrayList.get(i10);
            if (i9 < x0Var.a) {
                return false;
            }
            i9 = x0Var.b;
        }
        return i9 == 1439 || i9 == 1440;
    }

    public static String e0(int i9, TLRPC.User user, TL_account.TL_businessWorkHours tL_businessWorkHours) {
        if (tL_businessWorkHours == null) {
            return null;
        }
        ArrayList[] Y = Y(tL_businessWorkHours.weekly_open);
        StringBuilder sb2 = new StringBuilder();
        if (user != null) {
            sb2.append(LocaleController.formatString(R.string.BusinessHoursCopyHeader, UserObject.getUserName(user)));
            sb2.append("\n");
        }
        for (int i10 = 0; i10 < 7; i10++) {
            ArrayList arrayList = Y[i10];
            String displayName = DayOfWeek.values()[i10].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
            sb2.append(displayName.substring(0, 1).toUpperCase() + displayName.substring(1));
            sb2.append(": ");
            if (b0(arrayList)) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileOpen));
            } else if (arrayList.isEmpty()) {
                sb2.append(LocaleController.getString(R.string.BusinessHoursProfileClose));
            } else {
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    if (i11 > 0) {
                        sb2.append(", ");
                    }
                    x0 x0Var = (x0) arrayList.get(i11);
                    sb2.append(x0.a(x0Var.a));
                    sb2.append(" - ");
                    sb2.append(x0.a(x0Var.b));
                }
            }
            sb2.append("\n");
        }
        TLRPC.TL_timezone a2 = u1.b(i9).a(tL_businessWorkHours.timezone_id);
        if (((Calendar.getInstance().getTimeZone().getRawOffset() / MediaDataController.MAX_STYLE_RUNS_COUNT) - (a2 == null ? 0 : a2.utc_offset)) / 60 != 0 && a2 != null) {
            int i12 = R.string.BusinessHoursCopyFooter;
            u1.b(i9);
            sb2.append(LocaleController.formatString(i12, u1.e(a2, true)));
        }
        return sb2.toString();
    }

    public final void W(int i9) {
        if ((this.h[i9].isEmpty() ? null : (x0) j3.r0.j(1, this.h[i9])) == null) {
            return;
        }
        int i10 = (i9 + 6) % 7;
        x0 x0Var = this.h[i10].isEmpty() ? null : (x0) j3.r0.j(1, this.h[i10]);
        if (x0Var == null || x0Var.b <= 1439) {
            return;
        }
        x0Var.b = 1439;
        if (x0Var.a >= 1439) {
            this.h[i10].remove(x0Var);
        }
        View y12 = this.a.y1(i10);
        if (y12 instanceof j5) {
            ((j5) y12).setValue(Z(this.h[i10]));
        } else {
            this.a.U2.N(true);
        }
    }

    public final void X(boolean z10) {
        if (this.c == null) {
            return;
        }
        boolean a02 = a0();
        this.c.setEnabled(a02);
        if (z10) {
            this.c.animate().alpha(a02 ? 1.0f : 0.0f).scaleX(a02 ? 1.0f : 0.0f).scaleY(a02 ? 1.0f : 0.0f).setDuration(180L).start();
            return;
        }
        this.c.setAlpha(a02 ? 1.0f : 0.0f);
        this.c.setScaleX(a02 ? 1.0f : 0.0f);
        this.c.setScaleY(a02 ? 1.0f : 0.0f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x006c, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a0() {
        if ((this.f != null) != this.e || !TextUtils.equals(this.n, this.r)) {
            return true;
        }
        if (this.f != null && this.e) {
            if (this.h == null) {
                return true;
            }
            int i9 = 0;
            loop0: while (true) {
                ArrayList[] arrayListArr = this.f;
                if (i9 >= arrayListArr.length) {
                    break;
                }
                if (arrayListArr[i9].size() != this.h[i9].size()) {
                    return true;
                }
                for (int i10 = 0; i10 < this.h[i9].size(); i10++) {
                    x0 x0Var = (x0) this.f[i9].get(i10);
                    x0 x0Var2 = (x0) this.h[i9].get(i10);
                    if (x0Var.a != x0Var2.a || x0Var.b != x0Var2.b) {
                        break loop0;
                    }
                }
                i9++;
            }
        }
        return false;
    }

    public final void c0() {
        if (this.b.c > 0.0f) {
            return;
        }
        if (!a0()) {
            finishFragment();
            return;
        }
        this.b.a(1.0f);
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        TL_account.updateBusinessWorkHours updatebusinessworkhours = new TL_account.updateBusinessWorkHours();
        ArrayList[] arrayListArr = this.h;
        ArrayList arrayList = new ArrayList();
        if (arrayListArr != null) {
            for (int i9 = 0; i9 < arrayListArr.length; i9++) {
                if (arrayListArr[i9] != null) {
                    for (int i10 = 0; i10 < arrayListArr[i9].size(); i10++) {
                        x0 x0Var = (x0) arrayListArr[i9].get(i10);
                        TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = new TL_account.TL_businessWeeklyOpen();
                        int i11 = i9 * 1440;
                        tL_businessWeeklyOpen.start_minute = x0Var.a + i11;
                        tL_businessWeeklyOpen.end_minute = i11 + x0Var.b;
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
        getConnectionsManager().sendRequest(updatebusinessworkhours, new bf.a(this, 26));
        getMessagesStorage().updateUserInfo(userFull, false);
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        this.actionBar.setBackButtonImage(R.drawable.ic_ab_back);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(LocaleController.getString(R.string.BusinessHours));
        this.actionBar.setActionBarMenuOnItemClick(new xe1(this, 10));
        Drawable mutate = context.getResources().getDrawable(R.drawable.ic_ab_done).mutate();
        int i9 = f6.v8;
        mutate.setColorFilter(new PorterDuffColorFilter(f6.w0(null, i9, false), PorterDuff.Mode.MULTIPLY));
        this.b = new fr(mutate, new jp(f6.w0(null, i9, false)));
        this.c = this.actionBar.n().i(AndroidUtilities.dp(56.0f), LocaleController.getString(R.string.Done), this.b);
        X(false);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackgroundColor(f6.w0(null, f6.a7, false));
        i51 i51Var = new i51(this, new b8(this, 21), new kh.p(this, 16), null);
        this.a = i51Var;
        i51Var.p1();
        i51 i51Var2 = this.a;
        i51Var2.U2.r = false;
        frameLayout.addView(i51Var2, e6.c(-1.0f, -1));
        this.actionBar.z(this.a, true);
        d0();
        this.fragmentView = frameLayout;
        return frameLayout;
    }

    public final void d0() {
        z41 z41Var;
        if (this.d) {
            return;
        }
        TLRPC.UserFull userFull = getMessagesController().getUserFull(getUserConfig().getClientUserId());
        if (userFull == null) {
            getMessagesController().loadUserInfo(getUserConfig().getCurrentUser(), true, getClassGuid());
            return;
        }
        TL_account.TL_businessWorkHours tL_businessWorkHours = userFull.business_work_hours;
        boolean z10 = tL_businessWorkHours != null;
        this.e = z10;
        if (!z10) {
            String c10 = u1.b(this.currentAccount).c();
            this.r = c10;
            this.n = c10;
            this.f = null;
            this.h = new ArrayList[7];
            int i9 = 0;
            while (true) {
                ArrayList[] arrayListArr = this.h;
                if (i9 >= arrayListArr.length) {
                    break;
                }
                arrayListArr[i9] = new ArrayList();
                if (i9 >= 0 && i9 < 5) {
                    this.h[i9].add(new x0(0, 1439));
                }
                i9++;
            }
        } else {
            String str = tL_businessWorkHours.timezone_id;
            this.r = str;
            this.n = str;
            this.f = Y(tL_businessWorkHours.weekly_open);
            this.h = Y(userFull.business_work_hours.weekly_open);
        }
        i51 i51Var = this.a;
        if (i51Var != null && (z41Var = i51Var.U2) != null) {
            z41Var.N(true);
        }
        X(false);
        this.d = true;
    }

    @Override // org.telegram.messenger.NotificationCenter.NotificationCenterDelegate
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        z41 z41Var;
        if (i9 == NotificationCenter.userInfoDidLoad) {
            d0();
            return;
        }
        if (i9 == NotificationCenter.timezonesUpdated) {
            if (this.f == null) {
                this.r = u1.b(this.currentAccount).c();
            }
            i51 i51Var = this.a;
            if (i51Var == null || (z41Var = i51Var.U2) == null) {
                return;
            }
            z41Var.N(true);
        }
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean onFragmentCreate() {
        u1.b(this.currentAccount).g();
        this.r = u1.b(this.currentAccount).c();
        getNotificationCenter().addObserver(this, NotificationCenter.userInfoDidLoad);
        return super.onFragmentCreate();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onFragmentDestroy() {
        getNotificationCenter().removeObserver(this, NotificationCenter.userInfoDidLoad);
        super.onFragmentDestroy();
        c0();
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onInsets(int i9, int i10, int i11, int i12) {
        this.a.setPadding(0, 0, 0, i12);
        this.a.setClipToPadding(false);
    }
}
