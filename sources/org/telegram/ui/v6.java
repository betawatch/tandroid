package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.RelativeSizeSpan;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class v6 extends zf.b {
    public final Context d;
    public final /* synthetic */ x6 e;

    public v6(x6 x6Var, Context context) {
        this.e = x6Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.il0
    public final boolean D(f2.n1 n1Var) {
        long b10 = n1Var.b();
        x6 x6Var = this.e;
        if (b10 == x6Var.G) {
            return true;
        }
        int i10 = n1Var.f;
        return (i10 == 2 && x6Var.D > 0 && !x6Var.H) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // f2.p0
    public final int h() {
        return this.e.W.size();
    }

    @Override // f2.p0
    public final int j(int i10) {
        return ((s6) this.e.W.get(i10)).a;
    }

    @Override // f2.p0
    public final void v(f2.n1 n1Var, int i10) {
        int i11;
        x6 x6Var = this.e;
        ArrayList arrayList = x6Var.W;
        s6 s6Var = (s6) arrayList.get(i10);
        int i12 = n1Var.f;
        View view = n1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.y9 y9Var = (org.telegram.ui.Cells.y9) view;
            if (i10 == x6Var.G) {
                y9Var.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.y8) view).setText(AndroidUtilities.replaceTags(s6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) view;
                k4Var.setText(((s6) arrayList.get(i10)).d);
                ((s6) arrayList.get(i10)).getClass();
                k4Var.setTopMargin(15);
                ((s6) arrayList.get(i10)).getClass();
                k4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) view;
                CacheByChatsController cacheByChatsController = x6Var.getMessagesController().getCacheByChatsController();
                int i14 = s6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((s6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((s6) arrayList.get(i10)).c == 0) {
                    m8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((s6) arrayList.get(i10)).c == 1) {
                    m8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((s6) arrayList.get(i10)).c == 2) {
                    m8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((s6) arrayList.get(i10)).c == 3) {
                    m8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                m8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    x6Var.v0();
                    break;
                case 10:
                    j6 j6Var = x6Var.N;
                    if (j6Var != null && !x6Var.H) {
                        long j10 = x6Var.D;
                        boolean z10 = j10 > 0;
                        long j11 = x6Var.E;
                        j6Var.b(j11 <= 0 ? 0.0f : j10 / j11, (x6Var.F <= 0 || j11 <= 0) ? 0.0f : (j11 - r9) / j11, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                    int i15 = s6Var.f;
                    boolean r02 = i15 < 0 ? x6Var.r0() : x6Var.e[i15];
                    CharSequence charSequence = s6Var.d;
                    int[] iArr = x6Var.K;
                    int i16 = s6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    y1Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(s6Var.g), r02, s6Var.f >= 0 ? !s6Var.j : !x6Var.I, false);
                    int i18 = s6Var.h;
                    int i19 = org.telegram.ui.ActionBar.g6.k7;
                    org.telegram.ui.Components.hp hpVar = y1Var.r;
                    if (hpVar != null) {
                        hpVar.b(i18, i18, i19);
                    }
                    y1Var.setCollapsed(s6Var.f < 0 ? Boolean.valueOf(x6Var.I) : null);
                    if (s6Var.f == -1) {
                        y1Var.d(new a(this, i13), new nh.r7(13, this, y1Var));
                    } else {
                        y1Var.d(null, null);
                    }
                    y1Var.setPad(s6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.xx0 xx0Var = (org.telegram.ui.Components.xx0) view;
        boolean z11 = x6Var.H;
        long j12 = x6Var.f;
        long j13 = x6Var.D;
        long j14 = x6Var.F;
        long j15 = x6Var.E;
        ab.m mVar = xx0Var.E;
        View view2 = xx0Var.w;
        TextView textView = xx0Var.n;
        TextView textView2 = xx0Var.h;
        TextView textView3 = xx0Var.v;
        org.telegram.ui.Cells.y9 y9Var2 = xx0Var.y;
        xx0Var.e = z11;
        TextView textView4 = xx0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
        TextView textView5 = xx0Var.s;
        long j16 = j15 - j14;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            y9Var2.setVisibility(8);
            xx0Var.A = 0.0f;
            xx0Var.B = 0.0f;
            if (mVar != null) {
                mVar.c(textView3);
            }
        } else {
            if (mVar != null) {
                mVar.q(textView3);
            }
            textView3.setVisibility(8);
            if (j13 > 0) {
                i11 = 0;
                view2.setVisibility(0);
                y9Var2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                y9Var2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                view2.setVisibility(8);
                y9Var2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f9 = j15;
            float f10 = (j13 + j12) / f9;
            float f11 = j16 / f9;
            if (xx0Var.A != f10) {
                ValueAnimator valueAnimator = xx0Var.C;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(xx0Var.A, f10);
                xx0Var.C = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.wx0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                xx0 xx0Var2 = xx0Var;
                                xx0Var2.getClass();
                                xx0Var2.A = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xx0Var2.invalidate();
                                break;
                            default:
                                xx0 xx0Var3 = xx0Var;
                                xx0Var3.getClass();
                                xx0Var3.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                xx0Var3.invalidate();
                                break;
                        }
                    }
                });
                xx0Var.C.start();
            }
            if (xx0Var.B != f11) {
                ValueAnimator valueAnimator2 = xx0Var.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(xx0Var.B, f11);
                xx0Var.D = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.wx0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                xx0 xx0Var2 = xx0Var;
                                xx0Var2.getClass();
                                xx0Var2.A = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                xx0Var2.invalidate();
                                break;
                            default:
                                xx0 xx0Var3 = xx0Var;
                                xx0Var3.getClass();
                                xx0Var3.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                xx0Var3.invalidate();
                                break;
                        }
                    }
                });
                xx0Var.D.start();
            }
        }
        y9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        xx0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.p0
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 0;
            x6 x6Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.xx0 xx0Var = new org.telegram.ui.Components.xx0(context);
                    Paint paint = new Paint(1);
                    xx0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    xx0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    xx0Var.c = paint4;
                    xx0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    xx0Var.H = hVar;
                    xx0Var.setWillNotDraw(false);
                    hVar.k = false;
                    paint.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint2.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint3.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    paint4.setStrokeWidth(AndroidUtilities.dp(6.0f));
                    Paint.Cap cap = Paint.Cap.ROUND;
                    paint.setStrokeCap(cap);
                    paint2.setStrokeCap(cap);
                    paint3.setStrokeCap(cap);
                    paint4.setStrokeCap(cap);
                    cg.h0 h0Var = new cg.h0(xx0Var, context, 23);
                    xx0Var.f = h0Var;
                    xx0Var.addView(h0Var, i7.f6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    xx0Var.addView(linearLayout, i7.f6.c(-2.0f, -1));
                    bh.d dVar = new bh.d(context, 21);
                    linearLayout.addView(dVar, i7.f6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    xx0Var.v = textView;
                    int i12 = org.telegram.ui.ActionBar.g6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        ab.m mVar = new ab.m(textView);
                        xx0Var.E = mVar;
                        mVar.u(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    xx0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    xx0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    xx0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    xx0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    xx0Var.x = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), xx0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(xx0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.a.k(xx0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), xx0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    dVar.addView(textView, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView3, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView2, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView5, i7.f6.c(-2.0f, -2));
                    dVar.addView(textView4, i7.f6.c(-2.0f, -2));
                    View view = new View(xx0Var.getContext());
                    xx0Var.w = view;
                    linearLayout.addView(view, i7.f6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d7, false));
                    org.telegram.ui.Cells.y9 y9Var = new org.telegram.ui.Cells.y9(xx0Var.getContext());
                    xx0Var.y = y9Var;
                    linearLayout.addView(y9Var, i7.f6.n(-1, -2));
                    frameLayout = xx0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.k4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.lv0 lv0Var = new org.telegram.ui.Components.lv0(context, null);
                    lv0Var.setCallback(new m4.a(11));
                    int i13 = SharedConfig.keepMedia;
                    lv0Var.b(i13 == 3 ? 0 : i13 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = lv0Var;
                    break;
                case 5:
                    frameLayout = new w6(x6Var.getParentActivity(), x6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(x6Var.getParentActivity(), null);
                    p00Var.setIsSingleCell(true);
                    p00Var.setItemsCount(3);
                    p00Var.setIgnoreHeightCheck(true);
                    p00Var.setViewType(25);
                    frameLayout = p00Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.m8(context);
                    break;
                case 8:
                    u6 u6Var = new u6(this, context, x6Var, i11);
                    x6Var.J = u6Var;
                    u6Var.setDelegate(new h(this, 7));
                    x6Var.J.setCacheModel(x6Var.U);
                    x6Var.R.a0(x6Var.J, AndroidUtilities.dp(40.0f));
                    u6Var.setLayoutParams(new f2.x0(-1, -1));
                    frameLayout = u6Var;
                    break;
                case 9:
                    t6 t6Var = new t6(this, context);
                    x6Var.M = t6Var;
                    t6Var.setTag(-33024);
                    frameLayout2 = t6Var;
                    frameLayout = frameLayout2;
                    break;
                case 10:
                    j6 j6Var = new j6(x6Var, context);
                    x6Var.N = j6Var;
                    j6Var.setTag(-33024);
                    frameLayout2 = j6Var;
                    frameLayout = frameLayout2;
                    break;
                case 11:
                    frameLayout2 = new org.telegram.ui.Cells.y1(4, 21, this.d, x6Var.getResourceProvider(), false);
                    frameLayout = frameLayout2;
                    break;
                case 12:
                    org.telegram.ui.Components.p00 p00Var2 = new org.telegram.ui.Components.p00(x6Var.getParentActivity(), null);
                    p00Var2.setIsSingleCell(true);
                    p00Var2.setItemsCount(1);
                    p00Var2.setIgnoreHeightCheck(true);
                    p00Var2.setViewType(26);
                    frameLayout = p00Var2;
                    break;
                case 13:
                    o6 o6Var = new o6(x6Var, context);
                    x6Var.O = o6Var;
                    frameLayout = o6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.lv0 lv0Var2 = new org.telegram.ui.Components.lv0(context, null);
                    float f9 = ((int) ((x6Var.E / 1024) / 1024)) / 1000.0f;
                    ArrayList arrayList = new ArrayList();
                    if (f9 <= 17.0f) {
                        arrayList.add(2);
                    }
                    if (f9 > 5.0f) {
                        arrayList.add(5);
                    }
                    if (f9 > 16.0f) {
                        arrayList.add(16);
                    }
                    if (f9 > 32.0f) {
                        arrayList.add(32);
                    }
                    arrayList.add(Integer.valueOf(ConnectionsManager.DEFAULT_DATACENTER_ID));
                    String[] strArr = new String[arrayList.size()];
                    for (int i14 = 0; i14 < arrayList.size(); i14++) {
                        if (((Integer) arrayList.get(i14)).intValue() == 1) {
                            strArr[i14] = "300 MB";
                        } else if (((Integer) arrayList.get(i14)).intValue() == Integer.MAX_VALUE) {
                            strArr[i14] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i14] = String.format("%d GB", arrayList.get(i14));
                        }
                    }
                    lv0Var2.setCallback(new c1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    lv0Var2.b(indexOf2, null, strArr);
                    frameLayout = lv0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.y8(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.y9(context);
        }
        return new org.telegram.ui.Components.vk0(frameLayout);
    }
}
