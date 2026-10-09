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

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class w6 extends og.b {
    public final Context d;
    public final /* synthetic */ y6 e;

    public w6(y6 y6Var, Context context) {
        this.e = y6Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.pm0
    public final boolean D(s4.d1 d1Var) {
        long b10 = d1Var.b();
        y6 y6Var = this.e;
        if (b10 == y6Var.K) {
            return true;
        }
        int i10 = d1Var.f;
        return (i10 == 2 && y6Var.H > 0 && !y6Var.L) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // s4.i0
    public final int h() {
        return this.e.a0.size();
    }

    @Override // s4.i0
    public final int j(int i10) {
        return ((t6) this.e.a0.get(i10)).a;
    }

    @Override // s4.i0
    public final void v(s4.d1 d1Var, int i10) {
        int i11;
        y6 y6Var = this.e;
        ArrayList arrayList = y6Var.a0;
        t6 t6Var = (t6) arrayList.get(i10);
        int i12 = d1Var.f;
        View view = d1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.ca caVar = (org.telegram.ui.Cells.ca) view;
            if (i10 == y6Var.K) {
                caVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(t6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(((t6) arrayList.get(i10)).d);
                ((t6) arrayList.get(i10)).getClass();
                m4Var.setTopMargin(15);
                ((t6) arrayList.get(i10)).getClass();
                m4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                CacheByChatsController cacheByChatsController = y6Var.getMessagesController().getCacheByChatsController();
                int i14 = t6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((t6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((t6) arrayList.get(i10)).c == 0) {
                    r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((t6) arrayList.get(i10)).c == 1) {
                    r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((t6) arrayList.get(i10)).c == 2) {
                    r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((t6) arrayList.get(i10)).c == 3) {
                    r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                r8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    y6Var.v0();
                    break;
                case 10:
                    j6 j6Var = y6Var.R;
                    if (j6Var != null && !y6Var.L) {
                        long j3 = y6Var.H;
                        boolean z10 = j3 > 0;
                        long j10 = y6Var.I;
                        j6Var.b(j10 <= 0 ? 0.0f : j3 / j10, (y6Var.J <= 0 || j10 <= 0) ? 0.0f : (j10 - r9) / j10, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                    int i15 = t6Var.f;
                    boolean r02 = i15 < 0 ? y6Var.r0() : y6Var.e[i15];
                    CharSequence charSequence = t6Var.d;
                    int[] iArr = y6Var.O;
                    int i16 = t6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.m61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    a2Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(t6Var.g), r02, t6Var.f >= 0 ? !t6Var.j : !y6Var.M, false);
                    int i18 = t6Var.h;
                    int i19 = org.telegram.ui.ActionBar.i6.k7;
                    org.telegram.ui.Components.dq dqVar = a2Var.r;
                    if (dqVar != null) {
                        dqVar.b(i18, i18, i19);
                    }
                    a2Var.setCollapsed(t6Var.f < 0 ? Boolean.valueOf(y6Var.M) : null);
                    if (t6Var.f == -1) {
                        a2Var.d(new a(this, i13), new ai.f2(25, this, a2Var));
                    } else {
                        a2Var.d(null, null);
                    }
                    a2Var.setPad(t6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.gz0 gz0Var = (org.telegram.ui.Components.gz0) view;
        boolean z11 = y6Var.L;
        long j11 = y6Var.f;
        long j12 = y6Var.H;
        long j13 = y6Var.J;
        long j14 = y6Var.I;
        com.google.firebase.messaging.m mVar = gz0Var.I;
        View view2 = gz0Var.w;
        TextView textView = gz0Var.n;
        TextView textView2 = gz0Var.h;
        TextView textView3 = gz0Var.v;
        org.telegram.ui.Cells.ca caVar2 = gz0Var.y;
        gz0Var.e = z11;
        TextView textView4 = gz0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j13)));
        TextView textView5 = gz0Var.s;
        long j15 = j14 - j13;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j15)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            caVar2.setVisibility(8);
            gz0Var.E = 0.0f;
            gz0Var.F = 0.0f;
            if (mVar != null) {
                mVar.c(textView3);
            }
        } else {
            if (mVar != null) {
                mVar.v(textView3);
            }
            textView3.setVisibility(8);
            if (j12 > 0) {
                i11 = 0;
                view2.setVisibility(0);
                caVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                caVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j12), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j12 + j11)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j11)));
                view2.setVisibility(8);
                caVar2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f7 = j14;
            float f10 = (j12 + j11) / f7;
            float f11 = j15 / f7;
            if (gz0Var.E != f10) {
                ValueAnimator valueAnimator = gz0Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(gz0Var.E, f10);
                gz0Var.G = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.fz0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                gz0 gz0Var2 = gz0Var;
                                gz0Var2.getClass();
                                gz0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                gz0Var2.invalidate();
                                break;
                            default:
                                gz0 gz0Var3 = gz0Var;
                                gz0Var3.getClass();
                                gz0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                gz0Var3.invalidate();
                                break;
                        }
                    }
                });
                gz0Var.G.start();
            }
            if (gz0Var.F != f11) {
                ValueAnimator valueAnimator2 = gz0Var.H;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gz0Var.F, f11);
                gz0Var.H = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.fz0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                gz0 gz0Var2 = gz0Var;
                                gz0Var2.getClass();
                                gz0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                gz0Var2.invalidate();
                                break;
                            default:
                                gz0 gz0Var3 = gz0Var;
                                gz0Var3.getClass();
                                gz0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                gz0Var3.invalidate();
                                break;
                        }
                    }
                });
                gz0Var.H.start();
            }
        }
        caVar2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.G6, false));
        gz0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.i0
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        j6 j6Var;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 0;
            y6 y6Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.gz0 gz0Var = new org.telegram.ui.Components.gz0(context);
                    Paint paint = new Paint(1);
                    gz0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    gz0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    gz0Var.c = paint4;
                    gz0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    gz0Var.L = hVar;
                    gz0Var.setWillNotDraw(false);
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
                    ci.bb bbVar = new ci.bb(gz0Var, context, 26);
                    gz0Var.f = bbVar;
                    gz0Var.addView(bbVar, w7.x5.d(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    gz0Var.addView(linearLayout, w7.x5.d(-2.0f, -1));
                    ai.x5 x5Var = new ai.x5(context, 20);
                    linearLayout.addView(x5Var, w7.x5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    gz0Var.v = textView;
                    int i12 = org.telegram.ui.ActionBar.i6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(textView);
                        gz0Var.I = mVar;
                        mVar.A(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    gz0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    gz0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    gz0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    gz0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i12, false));
                    gz0Var.x = org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), gz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(gz0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(gz0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), gz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    x5Var.addView(textView, w7.x5.d(-2.0f, -2));
                    x5Var.addView(textView3, w7.x5.d(-2.0f, -2));
                    x5Var.addView(textView2, w7.x5.d(-2.0f, -2));
                    x5Var.addView(textView5, w7.x5.d(-2.0f, -2));
                    x5Var.addView(textView4, w7.x5.d(-2.0f, -2));
                    View view = new View(gz0Var.getContext());
                    gz0Var.w = view;
                    linearLayout.addView(view, w7.x5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.d7, false));
                    org.telegram.ui.Cells.ca caVar = new org.telegram.ui.Cells.ca(gz0Var.getContext());
                    gz0Var.y = caVar;
                    linearLayout.addView(caVar, w7.x5.n(-1, -2));
                    frameLayout = gz0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.ww0 ww0Var = new org.telegram.ui.Components.ww0(context, null);
                    ww0Var.setCallback(new m4.q0(23));
                    int i13 = SharedConfig.keepMedia;
                    ww0Var.b(i13 == 3 ? 0 : i13 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = ww0Var;
                    break;
                case 5:
                    frameLayout = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.j10 j10Var = new org.telegram.ui.Components.j10(y6Var.getParentActivity(), null);
                    j10Var.setIsSingleCell(true);
                    j10Var.setItemsCount(3);
                    j10Var.setIgnoreHeightCheck(true);
                    j10Var.setViewType(25);
                    frameLayout = j10Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    v6 v6Var = new v6(this, context, y6Var, i11);
                    y6Var.N = v6Var;
                    v6Var.setDelegate(new g(this, 7));
                    y6Var.N.setCacheModel(y6Var.Y);
                    y6Var.V.a0(y6Var.N, AndroidUtilities.dp(40.0f));
                    v6Var.setLayoutParams(new s4.q0(-1, -1));
                    frameLayout = v6Var;
                    break;
                case 9:
                    u6 u6Var = new u6(this, context);
                    y6Var.Q = u6Var;
                    u6Var.setTag(-33024);
                    j6Var = u6Var;
                    frameLayout = j6Var;
                    break;
                case 10:
                    j6 j6Var2 = new j6(y6Var, context);
                    y6Var.R = j6Var2;
                    j6Var2.setTag(-33024);
                    j6Var = j6Var2;
                    frameLayout = j6Var;
                    break;
                case 11:
                    frameLayout = new org.telegram.ui.Cells.a2(4, 21, this.d, y6Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.j10 j10Var2 = new org.telegram.ui.Components.j10(y6Var.getParentActivity(), null);
                    j10Var2.setIsSingleCell(true);
                    j10Var2.setItemsCount(1);
                    j10Var2.setIgnoreHeightCheck(true);
                    j10Var2.setViewType(26);
                    frameLayout = j10Var2;
                    break;
                case 13:
                    o6 o6Var = new o6(y6Var, context);
                    y6Var.S = o6Var;
                    frameLayout = o6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.ww0 ww0Var2 = new org.telegram.ui.Components.ww0(context, null);
                    float f7 = ((int) ((y6Var.I / 1024) / 1024)) / 1000.0f;
                    ArrayList arrayList = new ArrayList();
                    if (f7 <= 17.0f) {
                        arrayList.add(2);
                    }
                    if (f7 > 5.0f) {
                        arrayList.add(5);
                    }
                    if (f7 > 16.0f) {
                        arrayList.add(16);
                    }
                    if (f7 > 32.0f) {
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
                    ww0Var2.setCallback(new z0(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    ww0Var2.b(indexOf2, null, strArr);
                    frameLayout = ww0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.ca(context);
        }
        return new org.telegram.ui.Components.am0(frameLayout);
    }
}
