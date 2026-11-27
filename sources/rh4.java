// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rh4 extends d79 implements snb {
    public static final ph4[] k3 = {new ph4(R.drawable.search_media_filled, 2131745135, new TLRPC.TL_inputMessagesFilterPhotoVideo(), 0), new ph4(R.drawable.search_links_filled, 2131745138, new TLRPC.TL_inputMessagesFilterUrl(), 2), new ph4(R.drawable.search_files_filled, 2131745142, new TLRPC.TL_inputMessagesFilterDocument(), 1), new ph4(R.drawable.search_music_filled, 2131745133, new TLRPC.TL_inputMessagesFilterMusic(), 3), new ph4(R.drawable.search_voice_filled, 2131745130, new TLRPC.TL_inputMessagesFilterRoundVoice(), 5)};
    public static final Pattern l3 = Pattern.compile("20[0-9]{1,2}");
    public static final Pattern m3 = Pattern.compile("(\\w{3,}) ([0-9]{0,4})");
    public static final Pattern n3 = Pattern.compile("([0-9]{0,4}) (\\w{2,})");
    public static final Pattern o3 = Pattern.compile("^([0-9]{1,4})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final Pattern p3 = Pattern.compile("^([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,2})(\\.| |/|\\-)([0-9]{1,4})$");
    public static final int[] q3 = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public final ArrayList f3;
    public final ArrayList g3;
    public final of2 h3;
    public boolean i3;
    public final mh4 j3;

    public rh4(Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.f3 = new ArrayList();
        this.g3 = new ArrayList();
        this.i3 = true;
        this.j3 = new mh4(this);
        of2 of2Var = new of2((byte) 2, this, false);
        this.h3 = of2Var;
        of2Var.i1(0);
        setLayoutManager(of2Var);
        setAdapter(new ox0(this, (byte) 3));
        i(new br1((byte) 4));
        setItemAnimator(new lh4());
        setWillNotDraw(false);
        setHideIfEmpty(false);
        setSelectorRadius(hl.L(28.0f));
        yob.l(this, 20, aob.i6, vnbVar);
    }

    public static void A1(int i, int i2, ArrayList arrayList) {
        int i3 = i2;
        if (i3 < 0 || i3 >= 12 || i < 0 || i >= q3[i3]) {
            return;
        }
        int i4 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        GregorianCalendar gregorianCalendar = (GregorianCalendar) Calendar.getInstance();
        int i5 = i4;
        while (i5 >= 2013) {
            if (i3 != 1 || i != 28 || gregorianCalendar.isLeapYear(i5)) {
                Calendar calendar = Calendar.getInstance();
                calendar.set(i5, i3, i + 1, 0, 0, 0);
                long timeInMillis2 = calendar.getTimeInMillis();
                if (timeInMillis2 <= timeInMillis) {
                    calendar.set(i5, i2, i + 2, 0, 0, 0);
                    long timeInMillis3 = calendar.getTimeInMillis() - 1;
                    if (i5 == i4) {
                        arrayList.add(new nh4(timeInMillis2, timeInMillis3, ob6.D0().p0().format(timeInMillis2)));
                    } else {
                        arrayList.add(new nh4(timeInMillis2, timeInMillis3, ob6.D0().C0().format(timeInMillis2)));
                    }
                }
            }
            i5--;
            i3 = i2;
        }
    }

    public static void B1(int i, int i2, ArrayList arrayList) {
        int i3 = Calendar.getInstance().get(1);
        long timeInMillis = Calendar.getInstance().getTimeInMillis();
        if (i2 < 2013 || i2 > i3) {
            return;
        }
        Calendar calendar = Calendar.getInstance();
        calendar.set(i2, i, 1, 0, 0, 0);
        long timeInMillis2 = calendar.getTimeInMillis();
        if (timeInMillis2 <= timeInMillis) {
            calendar.add(2, 1);
            arrayList.add(new nh4(timeInMillis2, calendar.getTimeInMillis() - 1, ob6.D0().u0().format(timeInMillis2)));
        }
    }

    public static void C1(String str, ArrayList arrayList) {
        arrayList.clear();
        if (str != null) {
            String trim = str.trim();
            if (trim.length() >= 3) {
                if (ob6.M0(2131745436, null).toLowerCase().startsWith(trim) || "today".startsWith(trim)) {
                    Calendar calendar = Calendar.getInstance();
                    int i = calendar.get(1);
                    int i2 = calendar.get(2);
                    int i3 = calendar.get(5);
                    calendar.set(i, i2, i3, 0, 0, 0);
                    long timeInMillis = calendar.getTimeInMillis();
                    calendar.set(i, i2, i3 + 1, 0, 0, 0);
                    arrayList.add(new nh4(timeInMillis, calendar.getTimeInMillis() - 1, ob6.M0(2131745436, null)));
                    return;
                }
                if (ob6.M0(2131745435, null).toLowerCase().startsWith(trim) || "yesterday".startsWith(trim)) {
                    Calendar calendar2 = Calendar.getInstance();
                    int i4 = calendar2.get(1);
                    int i5 = calendar2.get(2);
                    int i6 = calendar2.get(5);
                    calendar2.set(i4, i5, i6, 0, 0, 0);
                    long timeInMillis2 = calendar2.getTimeInMillis() - 86400000;
                    calendar2.set(i4, i5, i6 + 1, 0, 0, 0);
                    arrayList.add(new nh4(timeInMillis2, calendar2.getTimeInMillis() - 86400001, ob6.M0(2131745435, null)));
                    return;
                }
                Calendar calendar3 = Calendar.getInstance();
                int i7 = -1;
                if (trim.length() > 3) {
                    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE", Locale.ENGLISH);
                    for (int i8 = 0; i8 < 7; i8++) {
                        calendar3.set(7, i8);
                        if (ob6.D0().A0().format(calendar3.getTime()).toLowerCase().startsWith(trim) || simpleDateFormat.format(calendar3.getTime()).toLowerCase().startsWith(trim)) {
                            i7 = i8;
                            break;
                        }
                    }
                }
                if (i7 >= 0) {
                    Calendar calendar4 = Calendar.getInstance();
                    long timeInMillis3 = calendar4.getTimeInMillis();
                    calendar4.set(7, i7);
                    if (calendar4.getTimeInMillis() > timeInMillis3) {
                        calendar4.setTimeInMillis(calendar4.getTimeInMillis() - 604800000);
                    }
                    int i9 = calendar4.get(1);
                    int i10 = calendar4.get(2);
                    int i11 = calendar4.get(5);
                    calendar4.set(i9, i10, i11, 0, 0, 0);
                    long timeInMillis4 = calendar4.getTimeInMillis();
                    calendar4.set(i9, i10, i11 + 1, 0, 0, 0);
                    arrayList.add(new nh4(timeInMillis4, calendar4.getTimeInMillis() - 1, ob6.D0().A0().format(timeInMillis4)));
                    return;
                }
                Matcher matcher = o3.matcher(trim);
                if (matcher.matches()) {
                    String group = matcher.group(1);
                    String group2 = matcher.group(3);
                    int parseInt = Integer.parseInt(group);
                    int parseInt2 = Integer.parseInt(group2);
                    if (parseInt <= 0 || parseInt > 31) {
                        if (parseInt < 2013 || parseInt2 > 12) {
                            return;
                        }
                        B1(parseInt2 - 1, parseInt, arrayList);
                        return;
                    }
                    if (parseInt2 >= 2013 && parseInt <= 12) {
                        B1(parseInt - 1, parseInt2, arrayList);
                        return;
                    } else {
                        if (parseInt2 <= 12) {
                            A1(parseInt - 1, parseInt2 - 1, arrayList);
                            return;
                        }
                        return;
                    }
                }
                Matcher matcher2 = p3.matcher(trim);
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
                        int i12 = parseInt5;
                        int i13 = Calendar.getInstance().get(1);
                        int i14 = parseInt3 - 1;
                        if (parseInt4 < 0 || parseInt4 >= 12 || i14 < 0 || i14 >= q3[parseInt4] || i12 < 2013 || i12 > i13) {
                            return;
                        }
                        Calendar calendar5 = Calendar.getInstance();
                        calendar5.set(i12, parseInt4, parseInt3, 0, 0, 0);
                        long timeInMillis5 = calendar5.getTimeInMillis();
                        calendar5.set(i12, parseInt4, parseInt3 + 1, 0, 0, 0);
                        arrayList.add(new nh4(timeInMillis5, calendar5.getTimeInMillis() - 1, ob6.D0().C0().format(timeInMillis5)));
                        return;
                    }
                    return;
                }
                if (l3.matcher(trim).matches()) {
                    int intValue = Integer.valueOf(trim).intValue();
                    int i15 = Calendar.getInstance().get(1);
                    if (intValue < 2013) {
                        while (i15 >= 2013) {
                            Calendar calendar6 = Calendar.getInstance();
                            calendar6.set(i15, 0, 1, 0, 0, 0);
                            long timeInMillis6 = calendar6.getTimeInMillis();
                            calendar6.set(i15 + 1, 0, 1, 0, 0, 0);
                            arrayList.add(new nh4(timeInMillis6, calendar6.getTimeInMillis() - 1, Integer.toString(i15)));
                            i15--;
                        }
                        return;
                    }
                    if (intValue <= i15) {
                        Calendar calendar7 = Calendar.getInstance();
                        calendar7.set(intValue, 0, 1, 0, 0, 0);
                        long timeInMillis7 = calendar7.getTimeInMillis();
                        calendar7.set(intValue + 1, 0, 1, 0, 0, 0);
                        arrayList.add(new nh4(timeInMillis7, calendar7.getTimeInMillis() - 1, Integer.toString(intValue)));
                        return;
                    }
                    return;
                }
                Matcher matcher3 = m3.matcher(trim);
                if (matcher3.matches()) {
                    String group6 = matcher3.group(1);
                    String group7 = matcher3.group(2);
                    int D1 = D1(group6);
                    if (D1 >= 0) {
                        int intValue2 = Integer.valueOf(group7).intValue();
                        if (intValue2 > 0 && intValue2 <= 31) {
                            A1(intValue2 - 1, D1, arrayList);
                            return;
                        } else if (intValue2 >= 2013) {
                            B1(D1, intValue2, arrayList);
                            return;
                        }
                    }
                }
                Matcher matcher4 = n3.matcher(trim);
                if (matcher4.matches()) {
                    String group8 = matcher4.group(1);
                    int D12 = D1(matcher4.group(2));
                    if (D12 >= 0) {
                        int intValue3 = Integer.valueOf(group8).intValue();
                        if (intValue3 > 0 && intValue3 <= 31) {
                            A1(intValue3 - 1, D12, arrayList);
                            return;
                        } else if (intValue3 >= 2013) {
                            B1(D12, intValue3, arrayList);
                        }
                    }
                }
                if (TextUtils.isEmpty(trim) || trim.length() <= 2) {
                    return;
                }
                int D13 = D1(trim);
                long timeInMillis8 = Calendar.getInstance().getTimeInMillis();
                if (D13 >= 0) {
                    for (int i16 = Calendar.getInstance().get(1); i16 >= 2013; i16--) {
                        Calendar calendar8 = Calendar.getInstance();
                        calendar8.set(i16, D13, 1, 0, 0, 0);
                        long timeInMillis9 = calendar8.getTimeInMillis();
                        if (timeInMillis9 <= timeInMillis8) {
                            calendar8.add(2, 1);
                            arrayList.add(new nh4(timeInMillis9, calendar8.getTimeInMillis() - 1, ob6.D0().u0().format(timeInMillis9)));
                        }
                    }
                }
            }
        }
    }

    public static int D1(String str) {
        String[] strArr = {ob6.M0(2131748840, null).toLowerCase(), ob6.M0(2131750794, null).toLowerCase(), ob6.M0(2131748437, null).toLowerCase(), ob6.M0(2131754166, null).toLowerCase(), ob6.M0(2131748416, null).toLowerCase(), ob6.M0(2131748818, null).toLowerCase(), ob6.M0(2131748820, null).toLowerCase(), ob6.M0(2131753888, null).toLowerCase(), ob6.M0(2131745293, null).toLowerCase(), ob6.M0(2131747557, null).toLowerCase(), ob6.M0(2131747562, null).toLowerCase(), ob6.M0(2131751570, null).toLowerCase()};
        String[] strArr2 = new String[12];
        Calendar calendar = Calendar.getInstance();
        for (int i = 1; i <= 12; i++) {
            calendar.set(0, 0, 0, 0, 0, 0);
            calendar.set(2, i);
            strArr2[i - 1] = calendar.getDisplayName(2, 2, Locale.ENGLISH).toLowerCase();
        }
        for (int i2 = 0; i2 < 12; i2++) {
            if (strArr2[i2].startsWith(str) || strArr[i2].startsWith(str)) {
                return i2;
            }
        }
        return -1;
    }

    public final void E1(ArrayList arrayList, ArrayList arrayList2, boolean z) {
        ArrayList arrayList3 = this.g3;
        arrayList3.clear();
        ArrayList arrayList4 = this.f3;
        arrayList3.addAll(arrayList4);
        arrayList4.clear();
        if (arrayList != null) {
            for (int i = 0; i < arrayList.size(); i++) {
                Object obj = arrayList.get(i);
                if (obj instanceof TLRPC.User) {
                    TLRPC.User user = (TLRPC.User) obj;
                    ph4 ph4Var = new ph4(R.drawable.search_users_filled, 4, yac.h(yac.t0).f().id == user.id ? ob6.M0(2131745629, null) : lv2.m(10, user.first_name, user.last_name));
                    ph4Var.f = user;
                    arrayList4.add(ph4Var);
                } else if (obj instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) obj;
                    String str = chat.title;
                    if (str.length() > 12) {
                        str = str.substring(0, 10).concat("...");
                    }
                    ph4 ph4Var2 = new ph4(R.drawable.search_users_filled, 4, str);
                    ph4Var2.f = chat;
                    arrayList4.add(ph4Var2);
                }
            }
        }
        if (arrayList2 != null) {
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                nh4 nh4Var = (nh4) arrayList2.get(i2);
                ph4 ph4Var3 = new ph4(R.drawable.search_date_filled, 6, nh4Var.a);
                ph4Var3.g = nh4Var;
                arrayList4.add(ph4Var3);
            }
        }
        if (z) {
            arrayList4.add(new ph4(R.drawable.chats_archive, 2131754143, null, 7));
        }
        if (getAdapter() != null) {
            n31 n31Var = new n31((byte) 4, (Object) getAdapter(), false);
            cy7.a(this.j3, true).b(n31Var);
            if (arrayList4.isEmpty() || !n31Var.b) {
                return;
            }
            this.h3.g1(0, 0);
        }
    }

    public ArrayList<apb> getThemeDescriptions() {
        ArrayList<apb> arrayList = new ArrayList<>();
        arrayList.add(new apb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.e7));
        arrayList.add(new apb(this, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (zob) null, aob.f7));
        return arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.i3) {
            canvas.drawRect(0.0f, getMeasuredHeight() - 1, getMeasuredWidth(), getMeasuredHeight(), aob.j0);
        }
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // d79, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // snb
    public final void updateColors() {
        for (int i = 0; i < getCachedChildCount(); i++) {
            View Q = Q(i);
            if (Q instanceof oh4) {
                ((oh4) Q).updateColors();
            }
        }
        for (int i2 = 0; i2 < getAttachedScrapChildCount(); i2++) {
            View P = P(i2);
            if (P instanceof oh4) {
                ((oh4) P).updateColors();
            }
        }
    }

    @Override // snb
    public final void addColorKeys(HashSet hashSet) {
    }
}
