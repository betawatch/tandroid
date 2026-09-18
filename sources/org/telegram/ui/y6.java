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
import j$.util.Objects;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.CacheByChatsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.tgnet.ConnectionsManager;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y6 extends og.b {
    public final Context d;
    public final /* synthetic */ a7 e;

    public y6(a7 a7Var, Context context) {
        this.e = a7Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.ll0
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
        return this.e.e0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((v6) this.e.e0.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        a7 a7Var = this.e;
        ArrayList arrayList = a7Var.e0;
        v6 v6Var = (v6) arrayList.get(i10);
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
            ((org.telegram.ui.Cells.e9) view).setText(AndroidUtilities.replaceTags(v6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
                l4Var.setText(((v6) arrayList.get(i10)).d);
                ((v6) arrayList.get(i10)).getClass();
                l4Var.setTopMargin(15);
                ((v6) arrayList.get(i10)).getClass();
                l4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.r8 r8Var = (org.telegram.ui.Cells.r8) view;
                CacheByChatsController cacheByChatsController = a7Var.getMessagesController().getCacheByChatsController();
                int i14 = v6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((v6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((v6) arrayList.get(i10)).c == 0) {
                    r8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((v6) arrayList.get(i10)).c == 1) {
                    r8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((v6) arrayList.get(i10)).c == 2) {
                    r8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((v6) arrayList.get(i10)).c == 3) {
                    r8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                r8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    a7Var.w0();
                    break;
                case 10:
                    l6 l6Var = a7Var.V;
                    if (l6Var != null && !a7Var.K) {
                        long j3 = a7Var.G;
                        boolean z10 = j3 > 0;
                        long j10 = a7Var.H;
                        l6Var.b(j10 <= 0 ? 0.0f : j3 / j10, (a7Var.I <= 0 || j10 <= 0) ? 0.0f : (j10 - r9) / j10, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    int i15 = v6Var.f;
                    boolean r02 = i15 < 0 ? a7Var.r0() : a7Var.d[i15];
                    CharSequence charSequence = v6Var.d;
                    int[] iArr = a7Var.S;
                    int i16 = v6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.g51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    z1Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(v6Var.g), r02, v6Var.f >= 0 ? !v6Var.j : !a7Var.L, false);
                    int i18 = v6Var.h;
                    int i19 = org.telegram.ui.ActionBar.j6.k7;
                    org.telegram.ui.Components.np npVar = z1Var.r;
                    if (npVar != null) {
                        npVar.b(i18, i18, i19);
                    }
                    z1Var.setCollapsed(v6Var.f < 0 ? Boolean.valueOf(a7Var.L) : null);
                    if (v6Var.f == -1) {
                        z1Var.d(new a(this, i13), new ai.f2(25, this, z1Var));
                    } else {
                        z1Var.d(null, null);
                    }
                    z1Var.setPad(v6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.gy0 gy0Var = (org.telegram.ui.Components.gy0) view;
        boolean z11 = a7Var.K;
        long j11 = a7Var.e;
        long j12 = a7Var.G;
        long j13 = a7Var.I;
        long j14 = a7Var.H;
        com.google.firebase.messaging.m mVar = gy0Var.I;
        View view2 = gy0Var.w;
        TextView textView = gy0Var.n;
        TextView textView2 = gy0Var.h;
        TextView textView3 = gy0Var.v;
        org.telegram.ui.Cells.ea eaVar2 = gy0Var.y;
        gy0Var.e = z11;
        TextView textView4 = gy0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j13)));
        TextView textView5 = gy0Var.s;
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
            gy0Var.E = 0.0f;
            gy0Var.F = 0.0f;
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
            if (gy0Var.E != f10) {
                ValueAnimator valueAnimator = gy0Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(gy0Var.E, f10);
                gy0Var.G = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.fy0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                gy0 gy0Var2 = gy0Var;
                                gy0Var2.getClass();
                                gy0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                gy0Var2.invalidate();
                                break;
                            default:
                                gy0 gy0Var3 = gy0Var;
                                gy0Var3.getClass();
                                gy0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                gy0Var3.invalidate();
                                break;
                        }
                    }
                });
                gy0Var.G.start();
            }
            if (gy0Var.F != f11) {
                ValueAnimator valueAnimator2 = gy0Var.H;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(gy0Var.F, f11);
                gy0Var.H = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.fy0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                gy0 gy0Var2 = gy0Var;
                                gy0Var2.getClass();
                                gy0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                gy0Var2.invalidate();
                                break;
                            default:
                                gy0 gy0Var3 = gy0Var;
                                gy0Var3.getClass();
                                gy0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                gy0Var3.invalidate();
                                break;
                        }
                    }
                });
                gy0Var.H.start();
            }
        }
        eaVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        gy0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        ki.i iVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar;
        l6 l6Var;
        Context context = this.d;
        if (i10 != 0) {
            a7 a7Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.gy0 gy0Var = new org.telegram.ui.Components.gy0(context);
                    Paint paint = new Paint(1);
                    gy0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    gy0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    gy0Var.c = paint4;
                    gy0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    gy0Var.L = hVar;
                    gy0Var.setWillNotDraw(false);
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
                    ci.eb ebVar = new ci.eb(gy0Var, context, 26);
                    gy0Var.f = ebVar;
                    gy0Var.addView(ebVar, w7.x5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    gy0Var.addView(linearLayout, w7.x5.c(-2.0f, -1));
                    ai.x5 x5Var = new ai.x5(context, 20);
                    linearLayout.addView(x5Var, w7.x5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    gy0Var.v = textView;
                    int i11 = org.telegram.ui.ActionBar.j6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(textView);
                        gy0Var.I = mVar;
                        mVar.x(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    gy0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    TextView textView3 = new TextView(context);
                    gy0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    TextView textView4 = new TextView(context);
                    gy0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    TextView textView5 = new TextView(context);
                    gy0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    gy0Var.x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), gy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(gy0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(gy0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), gy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    x5Var.addView(textView, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView3, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView2, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView5, w7.x5.c(-2.0f, -2));
                    x5Var.addView(textView4, w7.x5.c(-2.0f, -2));
                    View view = new View(gy0Var.getContext());
                    gy0Var.w = view;
                    linearLayout.addView(view, w7.x5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false));
                    org.telegram.ui.Cells.ea eaVar = new org.telegram.ui.Cells.ea(gy0Var.getContext());
                    gy0Var.y = eaVar;
                    linearLayout.addView(eaVar, w7.x5.n(-1, -2));
                    frameLayout = gy0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.l4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
                    uv0Var.setCallback(new m4.u0(15));
                    int i12 = SharedConfig.keepMedia;
                    uv0Var.b(i12 == 3 ? 0 : i12 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = uv0Var;
                    break;
                case 5:
                    frameLayout = new z6(a7Var.getParentActivity(), a7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(a7Var.getParentActivity(), null);
                    t00Var.setIsSingleCell(true);
                    t00Var.setItemsCount(3);
                    t00Var.setIgnoreHeightCheck(true);
                    t00Var.setViewType(25);
                    frameLayout = t00Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.r8(context);
                    break;
                case 8:
                    iVar = ((org.telegram.ui.ActionBar.o2) a7Var).glassEngine;
                    x6 x6Var = new x6(this, context, a7Var, iVar);
                    a7Var.M = x6Var;
                    FrameLayout frameLayout2 = a7Var.N;
                    if (frameLayout2 != null && (frameLayout2.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) a7Var.N.getParent()).removeView(a7Var.N);
                    }
                    x6 x6Var2 = a7Var.M;
                    x6Var2.x = true;
                    FrameLayout frameLayout3 = x6Var2.b;
                    AndroidUtilities.removeFromParent(frameLayout3);
                    frameLayout3.setTranslationY(0.0f);
                    a7Var.N = frameLayout3;
                    ch.d c10 = a7Var.getBaseSimpleGlass().b.c(a7Var.N, null, false);
                    f6Var = ((org.telegram.ui.ActionBar.o2) a7Var).resourceProvider;
                    c10.o(eh.b.m(f6Var));
                    c10.p(AndroidUtilities.dp(9.66f));
                    c10.q(AndroidUtilities.dp(18.0f));
                    frameLayout3.setBackground(c10);
                    a7Var.Z.addView(a7Var.N, w7.x5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
                    kVar = ((org.telegram.ui.ActionBar.o2) a7Var).actionBar;
                    kVar.bringToFront();
                    a7Var.N.bringToFront();
                    a7Var.M.c(AndroidUtilities.dp(56.0f), a7Var.b.getPaddingBottom());
                    ai.w0 w0Var = a7Var.b;
                    if (w0Var != null) {
                        a7Var.P = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
                    }
                    a7Var.z0();
                    a7Var.M.setDelegate(new g(this, 7));
                    a7Var.M.setCacheModel(a7Var.c0);
                    a7Var.M.setTag(-33024);
                    i6 i6Var = a7Var.Z;
                    x6 x6Var3 = a7Var.M;
                    Objects.requireNonNull(x6Var3);
                    y0 y0Var = new y0(x6Var3, 9);
                    i6Var.z0 = x6Var3;
                    i6Var.A0 = y0Var;
                    i6Var.b0();
                    x6Var.setLayoutParams(new s4.p0(-1, -1));
                    frameLayout = x6Var;
                    break;
                case 9:
                    w6 w6Var = new w6(this, context);
                    a7Var.U = w6Var;
                    w6Var.setTag(-33024);
                    l6Var = w6Var;
                    frameLayout = l6Var;
                    break;
                case 10:
                    l6 l6Var2 = new l6(a7Var, context);
                    a7Var.V = l6Var2;
                    l6Var2.setTag(-33024);
                    l6Var = l6Var2;
                    frameLayout = l6Var;
                    break;
                case 11:
                    frameLayout = new org.telegram.ui.Cells.z1(4, 21, this.d, a7Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(a7Var.getParentActivity(), null);
                    t00Var2.setIsSingleCell(true);
                    t00Var2.setItemsCount(1);
                    t00Var2.setIgnoreHeightCheck(true);
                    t00Var2.setViewType(26);
                    frameLayout = t00Var2;
                    break;
                case 13:
                    q6 q6Var = new q6(a7Var, context);
                    a7Var.W = q6Var;
                    frameLayout = q6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
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
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (((Integer) arrayList.get(i13)).intValue() == 1) {
                            strArr[i13] = "300 MB";
                        } else if (((Integer) arrayList.get(i13)).intValue() == Integer.MAX_VALUE) {
                            strArr[i13] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i13] = String.format("%d GB", arrayList.get(i13));
                        }
                    }
                    uv0Var2.setCallback(new y0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    uv0Var2.b(indexOf2, null, strArr);
                    frameLayout = uv0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.e9(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.ea(context);
        }
        return new org.telegram.ui.Components.wk0(frameLayout);
    }
}
