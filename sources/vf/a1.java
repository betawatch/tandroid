package vf;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.time.DayOfWeek;
import j$.time.format.TextStyle;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import k7.c6;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.y3;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.du;
import org.telegram.ui.h51;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public abstract class a1 extends LinearLayout {
    public boolean B;
    public boolean C;
    public final g6 a;
    public final TextView b;
    public final TextView[] c;
    public final ImageView d;
    public final FrameLayout e;
    public final ViewGroup[] f;
    public final TextView[] h;
    public final TextView[][] n;
    public final dq r;
    public final FrameLayout s;
    public final LinearLayout v;
    public int w;
    public int x;
    public boolean y;

    public a1(Context context, g6 g6Var) {
        super(context);
        this.c = new TextView[2];
        this.f = new ViewGroup[7];
        this.h = new TextView[7];
        this.n = new TextView[7][];
        this.w = 1;
        this.x = 0;
        this.y = true;
        this.a = g6Var;
        setOrientation(1);
        setClipChildren(false);
        int i10 = 0;
        for (int i11 = 7; i10 < i11; i11 = 7) {
            if (i10 == 0) {
                ViewGroup h51Var = new h51(context, 11);
                h51Var.setMinimumHeight(AndroidUtilities.dp(60.0f));
                TextView textView = new TextView(context);
                this.b = textView;
                textView.setGravity(LocaleController.isRTL ? 5 : 3);
                textView.setTextSize(1, 16.0f);
                h51Var.addView(textView, c6.i(-1.0f, -2.0f, 8388659, 0.0f, 9.33f, 0.0f, 0.0f));
                this.h[i10] = new TextView(context);
                this.h[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                this.h[i10].setTextSize(1, 13.0f);
                this.h[i10].setTextColor(k6.v0(k6.z6, g6Var));
                h51Var.addView(this.h[i10], c6.i(-2.0f, -2.0f, 8388659, 0.0f, 33.0f, 0.0f, 10.0f));
                LinearLayout linearLayout = new LinearLayout(context);
                this.v = linearLayout;
                linearLayout.setOrientation(1);
                this.s = new FrameLayout(context);
                this.n[i10] = new TextView[2];
                for (int i12 = 0; i12 < 2; i12++) {
                    this.n[i10][i12] = new TextView(context);
                    this.n[i10][i12].setTextSize(1, 14.0f);
                    this.n[i10][i12].setTextColor(k6.v0(k6.z6, g6Var));
                    this.n[i10][i12].setGravity(LocaleController.isRTL ? 3 : 5);
                    this.s.addView(this.n[i10][i12], c6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    this.c[i13] = new TextView(context);
                    this.c[i13].setTextSize(1, 14.0f);
                    this.c[i13].setTextColor(k6.v0(k6.z6, g6Var));
                    this.c[i13].setGravity(LocaleController.isRTL ? 3 : 5);
                    this.s.addView(this.c[i13], c6.i(-1.0f, -1.0f, 119, 0.0f, 0.0f, 20.0f, 0.0f));
                }
                ImageView imageView = new ImageView(context);
                this.d = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setScaleX(0.6f);
                imageView.setScaleY(0.6f);
                imageView.setImageResource(R.drawable.arrow_more);
                imageView.setColorFilter(new PorterDuffColorFilter(k6.v0(k6.z6, g6Var), PorterDuff.Mode.SRC_IN));
                this.s.addView(imageView, c6.h(20.0f, 20.0f, 8388629));
                this.v.addView(this.s, new LinearLayout.LayoutParams(c6.z(-1.0f), c6.z(-1.0f), Gravity.getAbsoluteGravity(119, LocaleController.isRTL ? 1 : 0)));
                dq dqVar = new dq(context);
                this.r = dqVar;
                dqVar.getDrawable().F = true;
                dqVar.setTextSize(AndroidUtilities.dp(13.0f));
                dqVar.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                dqVar.setGravity(LocaleController.isRTL ? 3 : 5);
                int dp = AndroidUtilities.dp(8.0f);
                int i14 = k6.o6;
                int v02 = k6.v0(i14, g6Var);
                a(v02);
                int l1 = k6.l1(0.1f, v02);
                int v03 = k6.v0(i14, g6Var);
                a(v03);
                int l12 = k6.l1(0.22f, v03);
                dqVar.setBackground(k6.i0(dp, dp, dp, dp, l1, l12, l12));
                int v04 = k6.v0(i14, g6Var);
                a(v04);
                dqVar.setTextColor(v04);
                dqVar.getDrawable().v = 0.6f;
                dqVar.setVisibility(8);
                this.v.addView(dqVar, c6.u(-1.0f, 17.0f, 8388613, 0.0f, 4.0f, 18.0f, 0.0f));
                FrameLayout frameLayout = new FrameLayout(context);
                this.e = frameLayout;
                frameLayout.addView(this.v, c6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 0.0f));
                h51Var.addView(frameLayout, c6.i(-1.0f, -2.0f, 8388693, 0.0f, 0.0f, 0.0f, 12.0f));
                this.f[i10] = h51Var;
                addView(h51Var, c6.i(-1.0f, -2.0f, 51, 18.0f, 0.0f, 8.0f, 0.0f));
            } else {
                ViewGroup f10 = y3.f(context, 0);
                this.h[i10] = new TextView(context);
                this.h[i10].setTextSize(1, 14.0f);
                this.h[i10].setTextColor(k6.v0(k6.G6, g6Var));
                this.h[i10].setGravity(LocaleController.isRTL ? 5 : 3);
                FrameLayout frameLayout2 = new FrameLayout(context);
                this.n[i10] = new TextView[2];
                for (int i15 = 0; i15 < 2; i15++) {
                    this.n[i10][i15] = new TextView(context);
                    this.n[i10][i15].setTextSize(1, 14.0f);
                    this.n[i10][i15].setTextColor(k6.v0(k6.z6, g6Var));
                    this.n[i10][i15].setGravity(LocaleController.isRTL ? 3 : 5);
                    frameLayout2.addView(this.n[i10][i15], c6.e(-1, -1, 119));
                }
                if (LocaleController.isRTL) {
                    f10.addView(frameLayout2, c6.q(-2, -1, 51));
                    f10.addView(this.h[i10], c6.q(-1, -1, 53));
                } else {
                    f10.addView(this.h[i10], c6.q(-2, -1, 51));
                    f10.addView(frameLayout2, c6.q(-1, -1, 53));
                }
                this.f[i10] = f10;
                addView(f10, c6.u(-1.0f, -2.0f, 51, 18.0f, i10 == 1 ? 1.0f : 11.66f, 28.0f, i10 == 6 ? 16.66f : 0.0f));
            }
            i10++;
        }
        setWillNotDraw(false);
    }

    public abstract int a(int i10);

    /* JADX WARN: Removed duplicated region for block: B:103:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02fb  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0535  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x02fe  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x02ee  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x024d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0270  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(TL_account.TL_businessWorkHours tL_businessWorkHours, boolean z4, boolean z10, boolean z11) {
        boolean z12;
        int i10;
        int offset;
        boolean z13;
        TextView[][] textViewArr;
        int i11;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i12;
        int i13;
        boolean z14;
        int i14;
        int i15;
        float f10;
        ArrayList[] arrayListArr;
        boolean z15;
        int i16;
        ArrayList arrayList3;
        TextView[][] textViewArr2;
        int i17;
        int i18;
        int i19;
        boolean z16;
        ArrayList[] arrayListArr2;
        int i20;
        int i21;
        float f11;
        boolean z17 = z4;
        this.C = z17;
        this.B = z11;
        if (tL_businessWorkHours == null) {
            return;
        }
        int i22 = 1;
        if (!tL_businessWorkHours.weekly_open.isEmpty()) {
            int i23 = 0;
            int i24 = 0;
            while (true) {
                if (i23 < tL_businessWorkHours.weekly_open.size()) {
                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen = tL_businessWorkHours.weekly_open.get(i23);
                    if (tL_businessWeeklyOpen.start_minute > i24 + 1) {
                        break;
                    }
                    i24 = tL_businessWeeklyOpen.end_minute;
                    i23++;
                } else if (i24 >= 10079) {
                    z12 = true;
                }
            }
            if (z12) {
                this.C = false;
                z17 = false;
            }
            i10 = 8;
            int i25 = !z12 ? 8 : 0;
            ImageView imageView = this.d;
            imageView.setVisibility(i25);
            this.v.setTranslationX(!z12 ? AndroidUtilities.dp(11.0f) : 0.0f);
            TLRPC.TL_timezone a2 = s1.b(UserConfig.selectedAccount).a(tL_businessWorkHours.timezone_id);
            Calendar calendar = Calendar.getInstance();
            offset = ((calendar.getTimeZone().getOffset(System.currentTimeMillis()) / MediaDataController.MAX_STYLE_RUNS_COUNT) - (a2 != null ? 0 : a2.utc_offset)) / 60;
            if (offset != 0 && !z12) {
                i10 = 0;
            }
            dq dqVar = this.r;
            dqVar.setVisibility(i10);
            boolean z18 = offset != 0 ? false : z10;
            invalidate();
            z13 = this.y;
            TextView[] textViewArr3 = this.c;
            textViewArr = this.n;
            if (z13) {
                ViewPropertyAnimator duration = textViewArr3[0].animate().alpha((z17 || z18) ? 0.0f : 1.0f).setDuration(320L);
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
                textViewArr3[1].animate().alpha((z17 || !z18) ? 0.0f : 1.0f).setDuration(320L).setInterpolator(prVar).start();
                textViewArr[0][0].animate().alpha(z17 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(prVar).start();
                textViewArr[0][1].animate().alpha(z17 ? 1.0f : 0.0f).setDuration(320L).setInterpolator(prVar).start();
                imageView.animate().rotation(z17 ? 180.0f : 0.0f).setDuration(320L).setInterpolator(prVar).start();
            } else {
                textViewArr3[0].setAlpha((z17 || z18) ? 0.0f : 1.0f);
                textViewArr3[1].setAlpha((z17 || !z18) ? 0.0f : 1.0f);
                imageView.setRotation(z17 ? 180.0f : 0.0f);
            }
            i11 = 0;
            while (i11 < textViewArr.length) {
                int i26 = 0;
                while (true) {
                    TextView[] textViewArr4 = textViewArr[i11];
                    if (i26 < textViewArr4.length) {
                        if (i11 != 0 || z17) {
                            if ((i26 == i22) == z18) {
                                f11 = 1.0f;
                                if (this.y) {
                                    textViewArr4[i26].animate().alpha(f11).setDuration(320L).setInterpolator(pr.h).start();
                                } else {
                                    textViewArr4[i26].setAlpha(f11);
                                }
                                i26++;
                                i22 = 1;
                            }
                        }
                        f11 = 0.0f;
                        if (this.y) {
                        }
                        i26++;
                        i22 = 1;
                    }
                }
                i11++;
                i22 = 1;
            }
            dqVar.c(LocaleController.getString(!z18 ? R.string.BusinessHoursProfileSwitchMy : R.string.BusinessHoursProfileSwitchLocal), LocaleController.isRTL && !this.y, true);
            this.y = false;
            ArrayList[] Z = x0.Z(new ArrayList(tL_businessWorkHours.weekly_open));
            int i27 = (calendar.get(7) + 5) % 7;
            int i28 = calendar.get(11);
            int i29 = calendar.get(12);
            arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
            arrayList2 = new ArrayList(arrayList.size());
            i12 = 0;
            while (i12 < arrayList.size()) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen2 = (TL_account.TL_businessWeeklyOpen) arrayList.get(i12);
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen3 = new TL_account.TL_businessWeeklyOpen();
                boolean z19 = z17;
                if (offset != 0) {
                    int i30 = tL_businessWeeklyOpen2.start_minute;
                    z16 = z12;
                    int i31 = i30 % 1440;
                    int i32 = tL_businessWeeklyOpen2.end_minute;
                    arrayListArr2 = Z;
                    int i33 = (i32 - i30) + i31;
                    if (i31 == 0) {
                        i20 = i29;
                        if (i33 == 1440 || i33 == 1439) {
                            tL_businessWeeklyOpen3.start_minute = i30;
                            tL_businessWeeklyOpen3.end_minute = i32;
                            arrayList2.add(tL_businessWeeklyOpen3);
                            i12++;
                            z17 = z19;
                            z12 = z16;
                            i29 = i20;
                            Z = arrayListArr2;
                        }
                        tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                        tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                        arrayList2.add(tL_businessWeeklyOpen3);
                        i21 = tL_businessWeeklyOpen3.start_minute;
                        if (i21 >= 0) {
                            int i34 = tL_businessWeeklyOpen3.end_minute;
                            if (i34 < 0) {
                                tL_businessWeeklyOpen3.start_minute = i21 + 10080;
                                tL_businessWeeklyOpen3.end_minute = i34 + 10080;
                            } else {
                                tL_businessWeeklyOpen3.start_minute = 0;
                                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen4 = new TL_account.TL_businessWeeklyOpen();
                                tL_businessWeeklyOpen4.start_minute = tL_businessWeeklyOpen2.start_minute + 10080 + offset;
                                tL_businessWeeklyOpen4.end_minute = 10079;
                                arrayList2.add(tL_businessWeeklyOpen4);
                            }
                        } else {
                            int i35 = tL_businessWeeklyOpen3.end_minute;
                            if (i35 > 10080) {
                                if (i21 > 10080) {
                                    tL_businessWeeklyOpen3.start_minute = i21 - 10080;
                                    tL_businessWeeklyOpen3.end_minute = i35 - 10080;
                                } else {
                                    tL_businessWeeklyOpen3.end_minute = 10079;
                                    TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen5 = new TL_account.TL_businessWeeklyOpen();
                                    tL_businessWeeklyOpen5.start_minute = 0;
                                    tL_businessWeeklyOpen5.end_minute = (tL_businessWeeklyOpen2.end_minute + offset) - 10079;
                                    arrayList2.add(tL_businessWeeklyOpen5);
                                    i12++;
                                    z17 = z19;
                                    z12 = z16;
                                    i29 = i20;
                                    Z = arrayListArr2;
                                }
                            }
                        }
                        i12++;
                        z17 = z19;
                        z12 = z16;
                        i29 = i20;
                        Z = arrayListArr2;
                    }
                } else {
                    z16 = z12;
                    arrayListArr2 = Z;
                }
                i20 = i29;
                tL_businessWeeklyOpen3.start_minute = tL_businessWeeklyOpen2.start_minute + offset;
                tL_businessWeeklyOpen3.end_minute = tL_businessWeeklyOpen2.end_minute + offset;
                arrayList2.add(tL_businessWeeklyOpen3);
                i21 = tL_businessWeeklyOpen3.start_minute;
                if (i21 >= 0) {
                }
                i12++;
                z17 = z19;
                z12 = z16;
                i29 = i20;
                Z = arrayListArr2;
            }
            boolean z20 = z17;
            boolean z21 = z12;
            ArrayList[] arrayListArr3 = Z;
            Collections.sort(arrayList2, new du(22));
            int i36 = (i27 * 1440) + (i28 * 60) + i29;
            for (i13 = 0; i13 < arrayList2.size(); i13++) {
                TL_account.TL_businessWeeklyOpen tL_businessWeeklyOpen6 = (TL_account.TL_businessWeeklyOpen) arrayList2.get(i13);
                int i37 = tL_businessWeeklyOpen6.start_minute;
                if ((i36 >= i37 && i36 <= tL_businessWeeklyOpen6.end_minute) || (((i18 = i36 + 10080) >= i37 && i18 <= tL_businessWeeklyOpen6.end_minute) || (i36 - 10080 >= i37 && i19 <= tL_businessWeeklyOpen6.end_minute))) {
                    z14 = true;
                    break;
                }
            }
            z14 = false;
            ArrayList[] Z2 = x0.Z(arrayList2);
            String string = LocaleController.getString(!z14 ? R.string.BusinessHoursProfileNowOpen : R.string.BusinessHoursProfileNowClosed);
            TextView textView = this.b;
            textView.setText(string);
            textView.setTextColor(k6.v0(!z14 ? k6.l8 : k6.p7, this.a));
            int i38 = this.x;
            i14 = this.w;
            this.w = 1;
            this.x = 0;
            i15 = 0;
            while (i15 < 2) {
                ArrayList[] arrayListArr4 = i15 == 0 ? arrayListArr3 : Z2;
                int i39 = 0;
                while (i39 < 7) {
                    int i40 = (i27 + i39) % 7;
                    TextView[] textViewArr5 = this.h;
                    if (i39 == 0) {
                        textViewArr5[i39].setText(LocaleController.getString(R.string.BusinessHoursProfile));
                        arrayListArr = Z2;
                        z15 = z14;
                        i16 = i27;
                    } else {
                        arrayListArr = Z2;
                        z15 = z14;
                        String displayName = DayOfWeek.values()[i40].getDisplayName(TextStyle.FULL, LocaleController.getInstance().getCurrentLocale());
                        StringBuilder sb = new StringBuilder();
                        i16 = i27;
                        sb.append(displayName.substring(0, 1).toUpperCase());
                        sb.append(displayName.substring(1));
                        textViewArr5[i39].setText(sb.toString());
                        textViewArr[i39][0].setVisibility(z20 ? 0 : 4);
                        textViewArr[i39][1].setVisibility(z20 ? 0 : 4);
                        textViewArr5[i39].setVisibility(z20 ? 0 : 4);
                    }
                    int i41 = 0;
                    while (true) {
                        if (i41 < (i39 == 0 ? 2 : 1)) {
                            TextView textView2 = i41 == 0 ? textViewArr[i39][i15] : textViewArr3[i15];
                            if (i39 == 0 && !z15 && i41 == 1) {
                                int i42 = 0;
                                while (true) {
                                    if (i42 >= arrayList2.size()) {
                                        i17 = -1;
                                        break;
                                    }
                                    i17 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(i42)).start_minute;
                                    if (i36 < i17) {
                                        break;
                                    } else {
                                        i42++;
                                    }
                                }
                                if (i17 == -1 && !arrayList2.isEmpty()) {
                                    i17 = ((TL_account.TL_businessWeeklyOpen) arrayList2.get(0)).start_minute;
                                }
                                if (i17 == -1) {
                                    textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                                    arrayList3 = arrayList2;
                                } else {
                                    int i43 = i17 < i36 ? (10080 - i36) + i17 : i17 - i36;
                                    if (i43 < 60) {
                                        arrayList3 = arrayList2;
                                        textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInMinutes", i43, new Object[0]));
                                    } else {
                                        arrayList3 = arrayList2;
                                        if (i43 < 1440) {
                                            textViewArr2 = textViewArr;
                                            textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInHours", (int) Math.ceil(i43 / 60.0f), new Object[0]));
                                        } else {
                                            textViewArr2 = textViewArr;
                                            textView2.setText(LocaleController.formatPluralString("BusinessHoursProfileOpensInDays", (int) Math.ceil((i43 / 60.0f) / 24.0f), new Object[0]));
                                        }
                                    }
                                }
                                textViewArr2 = textViewArr;
                            } else {
                                arrayList3 = arrayList2;
                                textViewArr2 = textViewArr;
                                if (z21) {
                                    textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileFullOpen));
                                } else if (arrayListArr4[i40].isEmpty()) {
                                    textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileClose));
                                } else if (x0.c0(arrayListArr4[i40])) {
                                    textView2.setText(LocaleController.getString(R.string.BusinessHoursProfileOpen));
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    for (int i44 = 0; i44 < arrayListArr4[i40].size(); i44++) {
                                        if (i44 > 0) {
                                            sb2.append("\n");
                                        }
                                        sb2.append(arrayListArr4[i40].get(i44));
                                    }
                                    int size = arrayListArr4[i40].size();
                                    textView2.setText(sb2);
                                    if (i39 == 0) {
                                        this.w = Math.max(this.w, size);
                                        this.x = Math.max(this.x, textView2.getLineHeight() * size);
                                    }
                                }
                            }
                            i41++;
                            arrayList2 = arrayList3;
                            textViewArr = textViewArr2;
                        }
                    }
                    i39++;
                    Z2 = arrayListArr;
                    i27 = i16;
                    z14 = z15;
                }
                i15++;
                i27 = i27;
            }
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.e.getLayoutParams();
            f10 = 6.0f;
            layoutParams.topMargin = AndroidUtilities.dp((this.w <= 2 || dqVar.getVisibility() == 0) ? 6.0f : 12.0f);
            if (this.w <= 2 && dqVar.getVisibility() != 0) {
                f10 = 12.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f10);
            layoutParams.gravity = ((this.w <= 2 || dqVar.getVisibility() == 0) ? 16 : 80) | (!LocaleController.isRTL ? 3 : 5);
            if (i14 == this.w || i38 != this.x) {
                requestLayout();
            }
            return;
        }
        z12 = false;
        if (z12) {
        }
        i10 = 8;
        if (!z12) {
        }
        ImageView imageView2 = this.d;
        imageView2.setVisibility(i25);
        this.v.setTranslationX(!z12 ? AndroidUtilities.dp(11.0f) : 0.0f);
        TLRPC.TL_timezone a22 = s1.b(UserConfig.selectedAccount).a(tL_businessWorkHours.timezone_id);
        Calendar calendar2 = Calendar.getInstance();
        offset = ((calendar2.getTimeZone().getOffset(System.currentTimeMillis()) / MediaDataController.MAX_STYLE_RUNS_COUNT) - (a22 != null ? 0 : a22.utc_offset)) / 60;
        if (offset != 0) {
            i10 = 0;
        }
        dq dqVar2 = this.r;
        dqVar2.setVisibility(i10);
        if (offset != 0) {
        }
        invalidate();
        z13 = this.y;
        TextView[] textViewArr32 = this.c;
        textViewArr = this.n;
        if (z13) {
        }
        i11 = 0;
        while (i11 < textViewArr.length) {
        }
        dqVar2.c(LocaleController.getString(!z18 ? R.string.BusinessHoursProfileSwitchMy : R.string.BusinessHoursProfileSwitchLocal), LocaleController.isRTL && !this.y, true);
        this.y = false;
        ArrayList[] Z3 = x0.Z(new ArrayList(tL_businessWorkHours.weekly_open));
        int i272 = (calendar2.get(7) + 5) % 7;
        int i282 = calendar2.get(11);
        int i292 = calendar2.get(12);
        arrayList = new ArrayList(tL_businessWorkHours.weekly_open);
        arrayList2 = new ArrayList(arrayList.size());
        i12 = 0;
        while (i12 < arrayList.size()) {
        }
        boolean z202 = z17;
        boolean z212 = z12;
        ArrayList[] arrayListArr32 = Z3;
        Collections.sort(arrayList2, new du(22));
        int i362 = (i272 * 1440) + (i282 * 60) + i292;
        while (i13 < arrayList2.size()) {
        }
        z14 = false;
        ArrayList[] Z22 = x0.Z(arrayList2);
        String string2 = LocaleController.getString(!z14 ? R.string.BusinessHoursProfileNowOpen : R.string.BusinessHoursProfileNowClosed);
        TextView textView3 = this.b;
        textView3.setText(string2);
        textView3.setTextColor(k6.v0(!z14 ? k6.l8 : k6.p7, this.a));
        int i382 = this.x;
        i14 = this.w;
        this.w = 1;
        this.x = 0;
        i15 = 0;
        while (i15 < 2) {
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.e.getLayoutParams();
        f10 = 6.0f;
        layoutParams2.topMargin = AndroidUtilities.dp((this.w <= 2 || dqVar2.getVisibility() == 0) ? 6.0f : 12.0f);
        if (this.w <= 2) {
            f10 = 12.0f;
        }
        layoutParams2.bottomMargin = AndroidUtilities.dp(f10);
        layoutParams2.gravity = ((this.w <= 2 || dqVar2.getVisibility() == 0) ? 16 : 80) | (!LocaleController.isRTL ? 3 : 5);
        if (i14 == this.w) {
        }
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.B) {
            Paint T0 = k6.T0("paintDivider", this.a);
            if (T0 == null) {
                T0 = k6.k0;
            }
            canvas.drawRect(AndroidUtilities.dp(LocaleController.isRTL ? 0.0f : 21.33f), getMeasuredHeight() - 1, getWidth() - AndroidUtilities.dp(LocaleController.isRTL ? 21.33f : 0.0f), getMeasuredHeight(), T0);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int dp;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30);
        if (!this.C) {
            int dp2 = AndroidUtilities.dp(60.0f);
            int i12 = this.w;
            dq dqVar = this.r;
            if (i12 > 2 || dqVar.getVisibility() == 0) {
                dp = AndroidUtilities.dp(dqVar.getVisibility() == 0 ? 21.0f : 0.0f) + AndroidUtilities.dp(15.0f) + this.x;
            } else {
                dp = 0;
            }
            i11 = View.MeasureSpec.makeMeasureSpec(Math.max(dp2, dp) + (this.B ? 1 : 0), TLObject.FLAG_30);
        }
        super.onMeasure(makeMeasureSpec, i11);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        dq dqVar = this.r;
        if (dqVar == null || dqVar.getVisibility() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        float x10 = motionEvent.getX();
        ViewGroup[] viewGroupArr = this.f;
        float x11 = x10 - viewGroupArr[0].getX();
        FrameLayout frameLayout = this.e;
        float x12 = x11 - frameLayout.getX();
        FrameLayout frameLayout2 = this.s;
        return dqVar.getClickBounds().contains((int) ((x12 - frameLayout2.getX()) - dqVar.getX()), (int) ((((motionEvent.getY() - viewGroupArr[0].getY()) - frameLayout.getY()) - frameLayout2.getY()) - dqVar.getY()));
    }

    public void setOnTimezoneSwitchClick(View.OnClickListener onClickListener) {
        dq dqVar = this.r;
        if (dqVar != null) {
            dqVar.setOnClickListener(onClickListener);
        }
    }
}
