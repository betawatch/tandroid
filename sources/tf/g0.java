package tf;

import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.dr;
import vh.w2;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class g0 extends rl0 {
    public static final e0[] Z2 = {new e0(R.drawable.search_media_filled, R.string.SharedMediaTab2, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new e0(R.drawable.search_links_filled, R.string.SharedLinksTab2, new TLRPC.TL_inputMessagesFilterUrl(), 2), new e0(R.drawable.search_files_filled, R.string.SharedFilesTab2, new TLRPC.TL_inputMessagesFilterDocument(), 1), new e0(R.drawable.search_music_filled, R.string.SharedMusicTab2, new TLRPC.TL_inputMessagesFilterMusic(), 3), new e0(R.drawable.search_voice_filled, R.string.SharedVoiceTab2, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern a3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern b3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern c3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern d3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern e3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] f3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList U2;
    public final ArrayList V2;
    public final dr W2;
    public boolean X2;
    public final b0 Y2;

    public g0(Context context, f6 f6Var) {
        super(context, f6Var);
        this.U2 = new ArrayList();
        this.V2 = new ArrayList();
        this.X2 = true;
        this.Y2 = new b0(this);
        dr drVar = new dr((Object) this, 7);
        this.W2 = drVar;
        drVar.j1(0);
        setLayoutManager(drVar);
        setAdapter(new eg.g(this, 6));
        i(new nh.k(9));
        setItemAnimator(new a0());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(AndroidUtilities.dp(28.0f));
        setSelectorDrawableColor(j6.v0(j6.i6, this.m2));
    }

    public static void v1(int i10, int i11, ArrayList arrayList) {
        int i12 = i11;
        if (i12 < 0 || i12 >= 12 || i10 < 0 || i10 >= f3[i12]) {
            return;
        }
        int i13 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
        int i14 = i13;
        while (i14 >= 2013) {
            if (i12 != 1 || i10 != 28 || gregorianCalendar.isLeapYear(i14)) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(i14, i12, i10 + 1, 0, 0, 0);
                long timeInMillis2 = calendar.getTimeInMillis();
                if (timeInMillis2 <= timeInMillis) {
                    calendar.set(i14, i11, i10 + 2, 0, 0, 0);
                    long timeInMillis3 = calendar.getTimeInMillis() - 1;
                    if (i14 == i13) {
                        arrayList.add(new c0(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterDayMonth().format(timeInMillis2)));
                    } else {
                        arrayList.add(new c0(timeInMillis2, timeInMillis3, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis2)));
                    }
                }
            }
            i14--;
            i12 = i11;
        }
    }

    public static void w1(int i10, int i11, ArrayList arrayList) {
        int i12 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i11 < 2013 || i11 > i12) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i11, i10, 1, 0, 0, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 > timeInMillis) {
            return;
        }
        calendar.add(2, 1);
        arrayList.add(new c0(timeInMillis2, calendar.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis2)));
    }

    public static void x1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str == null) {
            return;
        }
        String trim = str.trim();
        if (trim.length() < 3) {
            return;
        }
        if (LocaleController.getString(R.string.SearchTipToday).toLowerCase().startsWith(trim) || "today".startsWith(trim)) {
            Calendar calendar = Calendar.getInstance();
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.set(i10, i11, i12, 0, 0, 0);
            long timeInMillis = calendar.getTimeInMillis();
            calendar.set(i10, i11, i12 + 1, 0, 0, 0);
            arrayList.add(new c0(timeInMillis, calendar.getTimeInMillis() - 1, LocaleController.getString(R.string.SearchTipToday)));
            return;
        }
        if (LocaleController.getString(R.string.SearchTipYesterday).toLowerCase().startsWith(trim) || "yesterday".startsWith(trim)) {
            Calendar calendar2 = Calendar.getInstance();
            int i13 = calendar2.get(1);
            int i14 = calendar2.get(2);
            int i15 = calendar2.get(5);
            calendar2.set(i13, i14, i15, 0, 0, 0);
            long timeInMillis2 = calendar2.getTimeInMillis() - 86400000;
            calendar2.set(i13, i14, i15 + 1, 0, 0, 0);
            arrayList.add(new c0(timeInMillis2, calendar2.getTimeInMillis() - 86400001, LocaleController.getString(R.string.SearchTipYesterday)));
            return;
        }
        Calendar calendar3 = Calendar.getInstance();
        int i16 = -1;
        if (trim.length() > 3) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
            for (int i17 = 0; i17 < 7; i17++) {
                calendar3.set(7, i17);
                if (LocaleController.getInstance().getFormatterWeekLong().format(calendar3.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar3.getTime()).toLowerCase().startsWith(trim)) {
                    i16 = i17;
                    break;
                }
            }
        }
        if (i16 >= 0) {
            Calendar calendar4 = Calendar.getInstance();
            long timeInMillis3 = calendar4.getTimeInMillis();
            calendar4.set(7, i16);
            if (calendar4.getTimeInMillis() > timeInMillis3) {
                calendar4.setTimeInMillis(calendar4.getTimeInMillis() - 604800000);
            }
            int i18 = calendar4.get(1);
            int i19 = calendar4.get(2);
            int i20 = calendar4.get(5);
            calendar4.set(i18, i19, i20, 0, 0, 0);
            long timeInMillis4 = calendar4.getTimeInMillis();
            calendar4.set(i18, i19, i20 + 1, 0, 0, 0);
            arrayList.add(new c0(timeInMillis4, calendar4.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterWeekLong().format(timeInMillis4)));
            return;
        }
        Matcher matcher = d3.matcher(trim);
        if (matcher.matches()) {
            String group = matcher.group(1);
            String group2 = matcher.group(3);
            int parseInt = Integer.parseInt(group);
            int parseInt2 = Integer.parseInt(group2);
            if (parseInt <= 0 || parseInt > 31) {
                if (parseInt < 2013 || parseInt2 > 12) {
                    return;
                }
                w1(parseInt2 - 1, parseInt, arrayList);
                return;
            }
            if (parseInt2 >= 2013 && parseInt <= 12) {
                w1(parseInt - 1, parseInt2, arrayList);
                return;
            } else {
                if (parseInt2 <= 12) {
                    v1(parseInt - 1, parseInt2 - 1, arrayList);
                    return;
                }
                return;
            }
        }
        Matcher matcher2 = e3.matcher(trim);
        if (matcher2.matches()) {
            String group3 = matcher2.group(1);
            String group4 = matcher2.group(3);
            String group5 = matcher2.group(5);
            if (matcher2.group(2).equals(matcher2.group(4))) {
                int parseInt3 = Integer.parseInt(group3);
                int parseInt4 = Integer.parseInt(group4) - 1;
                int parseInt5 = Integer.parseInt(group5);
                if (parseInt5 >= 10 && parseInt5 <= 99) {
                    parseInt5 += 2000;
                }
                int i21 = parseInt5;
                int i22 = Calendar.getInstance().get(1);
                int i23 = parseInt3 - 1;
                if (parseInt4 < 0 || parseInt4 >= 12 || i23 < 0 || i23 >= f3[parseInt4] || i21 < 2013 || i21 > i22) {
                    return;
                }
                Calendar calendar5 = Calendar.getInstance();
                calendar5.set(i21, parseInt4, parseInt3, 0, 0, 0);
                long timeInMillis5 = calendar5.getTimeInMillis();
                calendar5.set(i21, parseInt4, parseInt3 + 1, 0, 0, 0);
                arrayList.add(new c0(timeInMillis5, calendar5.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterYearMax().format(timeInMillis5)));
                return;
            }
            return;
        }
        if (a3.matcher(trim).matches()) {
            int intValue = Integer.valueOf(trim).intValue();
            int i24 = Calendar.getInstance().get(1);
            if (intValue < 2013) {
                while (i24 >= 2013) {
                    Calendar calendar6 = Calendar.getInstance();
                    calendar6.set(i24, 0, 1, 0, 0, 0);
                    long timeInMillis6 = calendar6.getTimeInMillis();
                    calendar6.set(i24 + 1, 0, 1, 0, 0, 0);
                    arrayList.add(new c0(timeInMillis6, calendar6.getTimeInMillis() - 1, Integer.toString(i24)));
                    i24--;
                }
                return;
            }
            if (intValue <= i24) {
                Calendar calendar7 = Calendar.getInstance();
                calendar7.set(intValue, 0, 1, 0, 0, 0);
                long timeInMillis7 = calendar7.getTimeInMillis();
                calendar7.set(intValue + 1, 0, 1, 0, 0, 0);
                arrayList.add(new c0(timeInMillis7, calendar7.getTimeInMillis() - 1, Integer.toString(intValue)));
                return;
            }
            return;
        }
        Matcher matcher3 = b3.matcher(trim);
        if (matcher3.matches()) {
            String group6 = matcher3.group(1);
            String group7 = matcher3.group(2);
            int y12 = y1(group6);
            if (y12 >= 0) {
                int intValue2 = Integer.valueOf(group7).intValue();
                if (intValue2 > 0 && intValue2 <= 31) {
                    v1(intValue2 - 1, y12, arrayList);
                    return;
                } else if (intValue2 >= 2013) {
                    w1(y12, intValue2, arrayList);
                    return;
                }
            }
        }
        Matcher matcher4 = c3.matcher(trim);
        if (matcher4.matches()) {
            String group8 = matcher4.group(1);
            int y13 = y1(matcher4.group(2));
            if (y13 >= 0) {
                int intValue3 = Integer.valueOf(group8).intValue();
                if (intValue3 > 0 && intValue3 <= 31) {
                    v1(intValue3 - 1, y13, arrayList);
                    return;
                } else if (intValue3 >= 2013) {
                    w1(y13, intValue3, arrayList);
                }
            }
        }
        if (TextUtils.isEmpty(trim) || trim.length() <= 2) {
            return;
        }
        int y14 = y1(trim);
        long timeInMillis8 = Calendar.getInstance().getTimeInMillis();
        if (y14 >= 0) {
            for (int i25 = Calendar.getInstance().get(1); i25 >= 2013; i25--) {
                Calendar calendar8 = Calendar.getInstance();
                calendar8.set(i25, y14, 1, 0, 0, 0);
                long timeInMillis9 = calendar8.getTimeInMillis();
                if (timeInMillis9 <= timeInMillis8) {
                    calendar8.add(2, 1);
                    arrayList.add(new c0(timeInMillis9, calendar8.getTimeInMillis() - 1, LocaleController.getInstance().getFormatterMonthYear().format(timeInMillis9)));
                }
            }
        }
    }

    public static int y1(String str) {
        String[] strArr = {LocaleController.getString(R.string.January).toLowerCase(), LocaleController.getString(R.string.February).toLowerCase(), LocaleController.getString(R.string.March).toLowerCase(), LocaleController.getString(R.string.April).toLowerCase(), LocaleController.getString(R.string.May).toLowerCase(), LocaleController.getString(R.string.June).toLowerCase(), LocaleController.getString(R.string.July).toLowerCase(), LocaleController.getString(R.string.August).toLowerCase(), LocaleController.getString(R.string.September).toLowerCase(), LocaleController.getString(R.string.October).toLowerCase(), LocaleController.getString(R.string.November).toLowerCase(), LocaleController.getString(R.string.December).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i10 = 1; i10 <= 12; i10++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i10);
            strArr2[i10 - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i11 = 0; i11 < 12; i11++) {
            if (strArr2[i11].startsWith(str) || strArr[i11].startsWith(str)) {
                return i11;
            }
        }
        return -1;
    }

    public final void A1() {
        getRecycledViewPool().a();
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt instanceof d0) {
                int i11 = d0.f;
                ((d0) childAt).a();
            }
        }
        for (int i12 = 0; i12 < getCachedChildCount(); i12++) {
            View P = P(i12);
            if (P instanceof d0) {
                int i13 = d0.f;
                ((d0) P).a();
            }
        }
        for (int i14 = 0; i14 < getAttachedScrapChildCount(); i14++) {
            View O = O(i14);
            if (O instanceof d0) {
                int i15 = d0.f;
                ((d0) O).a();
            }
        }
        setSelectorDrawableColor(j6.v0(j6.i6, this.m2));
    }

    public ArrayList<l6> getThemeDescriptions() {
        ArrayList<l6> arrayList = new ArrayList<>();
        arrayList.add(new l6(this, 0, null, null, null, null, j6.e7));
        arrayList.add(new l6(this, 0, null, null, null, null, j6.f7));
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.X2) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), j6.k0);
        }
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // org.telegram.ui.Components.rl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    public final void z1(ArrayList arrayList, ArrayList arrayList2, boolean z4) {
        ArrayList arrayList3 = this.V2;
        arrayList3.clear();
        ArrayList arrayList4 = this.U2;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                Object obj = arrayList.get(i10);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    e0 e0Var = new e0(R.drawable.search_users_filled, 4, UserConfig.getInstance(UserConfig.selectedAccount).getCurrentUser().id == user.id ? LocaleController.getString(R.string.SavedMessages) : ContactsController.formatName(user.first_name, user.last_name, 10));
                    e0Var.f = user;
                    arrayList4.add(e0Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = w2.k(str.substring(0, 10), "...");
                    }
                    e0 e0Var2 = new e0(R.drawable.search_users_filled, 4, str);
                    e0Var2.f = chat;
                    arrayList4.add(e0Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                c0 c0Var = (c0) arrayList2.get(i11);
                e0 e0Var3 = new e0(R.drawable.search_date_filled, 6, c0Var.a);
                e0Var3.g = c0Var;
                arrayList4.add(e0Var3);
            }
        }
        if (z4) {
            arrayList4.add(new e0(R.drawable.chats_archive, R.string.ArchiveSearchFilter, null, 7));
        }
        if (getAdapter() != null) {
            c2.u uVar = new c2.u(getAdapter(), 7);
            f2.q.c(this.Y2, true).a(uVar);
            if (arrayList4.isEmpty() || !uVar.b) {
                return;
            }
            this.W2.h1(0, 0);
        }
    }
}
