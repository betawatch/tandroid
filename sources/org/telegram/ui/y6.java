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
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class y6 extends og.b {
    public final Context d;
    public final /* synthetic */ a7 e;

    public y6(a7 a7Var, Context context) {
        this.e = a7Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.yl0
    public final boolean D(s4.c1 c1Var) {
        long b10 = c1Var.b();
        a7 a7Var = this.e;
        if (b10 == a7Var.J) {
            return true;
        }
        int i10 = c1Var.f;
        return (i10 == 2 && a7Var.G > 0 && !a7Var.K) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.g0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((w6) this.e.g0.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        a7 a7Var = this.e;
        ArrayList arrayList = a7Var.g0;
        w6 w6Var = (w6) arrayList.get(i10);
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.ea eaVar = (org.telegram.ui.Cells.ea) view;
            if (i10 == a7Var.J) {
                eaVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(w6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(((w6) arrayList.get(i10)).d);
                ((w6) arrayList.get(i10)).getClass();
                m4Var.setTopMargin(15);
                ((w6) arrayList.get(i10)).getClass();
                m4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                CacheByChatsController cacheByChatsController = a7Var.getMessagesController().getCacheByChatsController();
                int i14 = w6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((w6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((w6) arrayList.get(i10)).c == 0) {
                    r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((w6) arrayList.get(i10)).c == 1) {
                    r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((w6) arrayList.get(i10)).c == 2) {
                    r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((w6) arrayList.get(i10)).c == 3) {
                    r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                r8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    a7Var.t0();
                    break;
                case 10:
                    m6 m6Var = a7Var.X;
                    if (m6Var != null && !a7Var.K) {
                        long j3 = a7Var.G;
                        boolean z10 = j3 > 0;
                        long j10 = a7Var.H;
                        m6Var.b(j10 <= 0 ? 0.0f : j3 / j10, (a7Var.I <= 0 || j10 <= 0) ? 0.0f : (j10 - r9) / j10, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                    int i15 = w6Var.f;
                    boolean o02 = i15 < 0 ? a7Var.o0() : a7Var.d[i15];
                    CharSequence charSequence = w6Var.d;
                    int[] iArr = a7Var.U;
                    int i16 = w6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    a2Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(w6Var.g), o02, w6Var.f >= 0 ? !w6Var.j : !a7Var.L, false);
                    int i18 = w6Var.h;
                    int i19 = org.telegram.ui.ActionBar.i6.k7;
                    org.telegram.ui.Components.qp qpVar = a2Var.r;
                    if (qpVar != null) {
                        qpVar.b(i18, i18, i19);
                    }
                    a2Var.setCollapsed(w6Var.f < 0 ? Boolean.valueOf(a7Var.L) : null);
                    if (w6Var.f == -1) {
                        a2Var.d(new a(this, i13), new ai.f2(25, this, a2Var));
                    } else {
                        a2Var.d(null, null);
                    }
                    a2Var.setPad(w6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.bz0 bz0Var = (org.telegram.ui.Components.bz0) view;
        boolean z11 = a7Var.K;
        long j11 = a7Var.e;
        long j12 = a7Var.G;
        long j13 = a7Var.I;
        long j14 = a7Var.H;
        com.google.firebase.messaging.m mVar = bz0Var.I;
        View view2 = bz0Var.w;
        TextView textView = bz0Var.n;
        TextView textView2 = bz0Var.h;
        TextView textView3 = bz0Var.v;
        org.telegram.ui.Cells.ea eaVar2 = bz0Var.y;
        bz0Var.e = z11;
        TextView textView4 = bz0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j13)));
        TextView textView5 = bz0Var.s;
        long j15 = j14 - j13;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j15)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            eaVar2.setVisibility(8);
            bz0Var.E = 0.0f;
            bz0Var.F = 0.0f;
            if (mVar != null) {
                mVar.c(textView3);
            }
        } else {
            if (mVar != null) {
                mVar.s(textView3);
            }
            textView3.setVisibility(8);
            if (j12 > 0) {
                i11 = 0;
                view2.setVisibility(0);
                eaVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                eaVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j12), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j12 + j11)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j11)));
                view2.setVisibility(8);
                eaVar2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f7 = j14;
            float f10 = (j12 + j11) / f7;
            float f11 = j15 / f7;
            if (bz0Var.E != f10) {
                ValueAnimator valueAnimator = bz0Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(bz0Var.E, f10);
                bz0Var.G = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.az0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                bz0 bz0Var2 = bz0Var;
                                bz0Var2.getClass();
                                bz0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                bz0Var2.invalidate();
                                break;
                            default:
                                bz0 bz0Var3 = bz0Var;
                                bz0Var3.getClass();
                                bz0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                bz0Var3.invalidate();
                                break;
                        }
                    }
                });
                bz0Var.G.start();
            }
            if (bz0Var.F != f11) {
                ValueAnimator valueAnimator2 = bz0Var.H;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(bz0Var.F, f11);
                bz0Var.H = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.az0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                bz0 bz0Var2 = bz0Var;
                                bz0Var2.getClass();
                                bz0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                bz0Var2.invalidate();
                                break;
                            default:
                                bz0 bz0Var3 = bz0Var;
                                bz0Var3.getClass();
                                bz0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                bz0Var3.invalidate();
                                break;
                        }
                    }
                });
                bz0Var.H.start();
            }
        }
        eaVar2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.G6, false));
        bz0Var.requestLayout();
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        View view2;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 1;
            a7 a7Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.bz0 bz0Var = new org.telegram.ui.Components.bz0(context);
                    Paint paint = new Paint(1);
                    bz0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    bz0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    bz0Var.c = paint4;
                    bz0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    bz0Var.L = hVar;
                    bz0Var.setWillNotDraw(false);
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
                    ci.ab abVar = new ci.ab(bz0Var, context, 27);
                    bz0Var.f = abVar;
                    bz0Var.addView(abVar, w7.z5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    bz0Var.addView(linearLayout, w7.z5.c(-2.0f, -1));
                    ai.w5 w5Var = new ai.w5(context, 20);
                    linearLayout.addView(w5Var, w7.z5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    bz0Var.v = textView;
                    int i12 = org.telegram.ui.ActionBar.i6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(textView);
                        bz0Var.I = mVar;
                        mVar.x(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    bz0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    bz0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    bz0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    bz0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i12, false));
                    bz0Var.x = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), bz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(bz0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), i0.a.k(bz0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(10.0f), bz0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    w5Var.addView(textView, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView3, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView2, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView5, w7.z5.c(-2.0f, -2));
                    w5Var.addView(textView4, w7.z5.c(-2.0f, -2));
                    View view3 = new View(bz0Var.getContext());
                    bz0Var.w = view3;
                    linearLayout.addView(view3, w7.z5.t(-1, -2, 0, 21, 0, 0, 0));
                    view3.getLayoutParams().height = 1;
                    view3.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d7, false));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(bz0Var.getContext());
                    bz0Var.y = eaVar;
                    linearLayout.addView(eaVar, w7.z5.n(-1, -2));
                    view = bz0Var;
                    break;
                case 3:
                    view = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(context, null);
                    qw0Var.setCallback(new m4(i11));
                    int i13 = SharedConfig.keepMedia;
                    qw0Var.b(i13 == 3 ? 0 : i13 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    view = qw0Var;
                    break;
                case 5:
                    view = new z6(a7Var.getParentActivity(), a7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(a7Var.getParentActivity(), null);
                    w00Var.setIsSingleCell(true);
                    w00Var.setItemsCount(3);
                    w00Var.setIgnoreHeightCheck(true);
                    w00Var.setViewType(25);
                    view = w00Var;
                    break;
                case 7:
                    view = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    org.telegram.ui.Components.bw0 bw0Var = a7Var.b0;
                    bw0Var.getClass();
                    View abVar2 = new ci.ab(bw0Var, context, 24);
                    abVar2.setTag(-33024);
                    abVar2.setLayoutParams(new s4.p0(-1, -1));
                    view = abVar2;
                    break;
                case 9:
                    x6 x6Var = new x6(this, context);
                    a7Var.W = x6Var;
                    x6Var.setTag(-33024);
                    view2 = x6Var;
                    view = view2;
                    break;
                case 10:
                    m6 m6Var = new m6(a7Var, context);
                    a7Var.X = m6Var;
                    m6Var.setTag(-33024);
                    view2 = m6Var;
                    view = view2;
                    break;
                case 11:
                    view2 = new org.telegram.ui.Cells.a2(4, 21, this.d, a7Var.getResourceProvider(), false);
                    view = view2;
                    break;
                case 12:
                    org.telegram.ui.Components.w00 w00Var2 = new org.telegram.ui.Components.w00(a7Var.getParentActivity(), null);
                    w00Var2.setIsSingleCell(true);
                    w00Var2.setItemsCount(1);
                    w00Var2.setIgnoreHeightCheck(true);
                    w00Var2.setViewType(26);
                    view = w00Var2;
                    break;
                case 13:
                    r6 r6Var = new r6(a7Var, context);
                    a7Var.Y = r6Var;
                    view = r6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.qw0 qw0Var2 = new org.telegram.ui.Components.qw0(context, null);
                    float f7 = ((int) ((a7Var.H / 1024) / 1024)) / 1000.0f;
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
                    qw0Var2.setCallback(new z0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    qw0Var2.b(indexOf2, null, strArr);
                    view = qw0Var2;
                    break;
                default:
                    view = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            view = new org.telegram.ui.Cells.ea(context);
        }
        return new org.telegram.ui.Components.il0(view);
    }
}
