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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class x6 extends og.b {
    public final Context d;
    public final /* synthetic */ z6 e;

    public x6(z6 z6Var, Context context) {
        this.e = z6Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.xl0
    public final boolean D(s4.c1 c1Var) {
        long b10 = c1Var.b();
        z6 z6Var = this.e;
        if (b10 == z6Var.J) {
            return true;
        }
        int i10 = c1Var.f;
        return (i10 == 2 && z6Var.G > 0 && !z6Var.K) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.e0.size();
    }

    @Override // s4.h0
    public final int j(int i10) {
        return ((u6) this.e.e0.get(i10)).a;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        int i11;
        z6 z6Var = this.e;
        ArrayList arrayList = z6Var.e0;
        u6 u6Var = (u6) arrayList.get(i10);
        int i12 = c1Var.f;
        View view = c1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.fa faVar = (org.telegram.ui.Cells.fa) view;
            if (i10 == z6Var.J) {
                faVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.f9) view).setText(AndroidUtilities.replaceTags(u6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
                n4Var.setText(((u6) arrayList.get(i10)).d);
                ((u6) arrayList.get(i10)).getClass();
                n4Var.setTopMargin(15);
                ((u6) arrayList.get(i10)).getClass();
                n4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.s8 s8Var = (org.telegram.ui.Cells.s8) view;
                CacheByChatsController cacheByChatsController = z6Var.getMessagesController().getCacheByChatsController();
                int i14 = u6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((u6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((u6) arrayList.get(i10)).c == 0) {
                    s8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((u6) arrayList.get(i10)).c == 1) {
                    s8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((u6) arrayList.get(i10)).c == 2) {
                    s8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((u6) arrayList.get(i10)).c == 3) {
                    s8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                s8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    z6Var.w0();
                    break;
                case 10:
                    k6 k6Var = z6Var.V;
                    if (k6Var != null && !z6Var.K) {
                        long j3 = z6Var.G;
                        boolean z10 = j3 > 0;
                        long j10 = z6Var.H;
                        k6Var.b(j10 <= 0 ? 0.0f : j3 / j10, (z6Var.I <= 0 || j10 <= 0) ? 0.0f : (j10 - r9) / j10, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.a2 a2Var = (org.telegram.ui.Cells.a2) view;
                    int i15 = u6Var.f;
                    boolean r02 = i15 < 0 ? z6Var.r0() : z6Var.d[i15];
                    CharSequence charSequence = u6Var.d;
                    int[] iArr = z6Var.S;
                    int i16 = u6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.v51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    a2Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(u6Var.g), r02, u6Var.f >= 0 ? !u6Var.j : !z6Var.L, false);
                    int i18 = u6Var.h;
                    int i19 = org.telegram.ui.ActionBar.j6.k7;
                    org.telegram.ui.Components.np npVar = a2Var.r;
                    if (npVar != null) {
                        npVar.b(i18, i18, i19);
                    }
                    a2Var.setCollapsed(u6Var.f < 0 ? Boolean.valueOf(z6Var.L) : null);
                    if (u6Var.f == -1) {
                        a2Var.d(new a(this, i13), new ai.f2(25, this, a2Var));
                    } else {
                        a2Var.d(null, null);
                    }
                    a2Var.setPad(u6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.sy0 sy0Var = (org.telegram.ui.Components.sy0) view;
        boolean z11 = z6Var.K;
        long j11 = z6Var.e;
        long j12 = z6Var.G;
        long j13 = z6Var.I;
        long j14 = z6Var.H;
        com.google.firebase.messaging.m mVar = sy0Var.I;
        View view2 = sy0Var.w;
        TextView textView = sy0Var.n;
        TextView textView2 = sy0Var.h;
        TextView textView3 = sy0Var.v;
        org.telegram.ui.Cells.fa faVar2 = sy0Var.y;
        sy0Var.e = z11;
        TextView textView4 = sy0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j13)));
        TextView textView5 = sy0Var.s;
        long j15 = j14 - j13;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j15)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            faVar2.setVisibility(8);
            sy0Var.E = 0.0f;
            sy0Var.F = 0.0f;
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
                faVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                faVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j12), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j12 + j11)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j11)));
                view2.setVisibility(8);
                faVar2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f7 = j14;
            float f10 = (j12 + j11) / f7;
            float f11 = j15 / f7;
            if (sy0Var.E != f10) {
                ValueAnimator valueAnimator = sy0Var.G;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(sy0Var.E, f10);
                sy0Var.G = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ry0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                sy0 sy0Var2 = sy0Var;
                                sy0Var2.getClass();
                                sy0Var2.E = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                sy0Var2.invalidate();
                                break;
                            default:
                                sy0 sy0Var3 = sy0Var;
                                sy0Var3.getClass();
                                sy0Var3.F = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                sy0Var3.invalidate();
                                break;
                        }
                    }
                });
                sy0Var.G.start();
            }
            if (sy0Var.F != f11) {
                ValueAnimator valueAnimator2 = sy0Var.H;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(sy0Var.F, f11);
                sy0Var.H = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.ry0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                sy0 sy0Var2 = sy0Var;
                                sy0Var2.getClass();
                                sy0Var2.E = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                sy0Var2.invalidate();
                                break;
                            default:
                                sy0 sy0Var3 = sy0Var;
                                sy0Var3.getClass();
                                sy0Var3.F = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                sy0Var3.invalidate();
                                break;
                        }
                    }
                });
                sy0Var.H.start();
            }
        }
        faVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        sy0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        li.i iVar;
        org.telegram.ui.ActionBar.f6 f6Var;
        org.telegram.ui.ActionBar.k kVar;
        k6 k6Var;
        Context context = this.d;
        if (i10 != 0) {
            z6 z6Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.sy0 sy0Var = new org.telegram.ui.Components.sy0(context);
                    Paint paint = new Paint(1);
                    sy0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    sy0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    sy0Var.c = paint4;
                    sy0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    sy0Var.L = hVar;
                    sy0Var.setWillNotDraw(false);
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
                    ci.eb ebVar = new ci.eb(sy0Var, context, 26);
                    sy0Var.f = ebVar;
                    sy0Var.addView(ebVar, w7.y5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    sy0Var.addView(linearLayout, w7.y5.c(-2.0f, -1));
                    ai.x5 x5Var = new ai.x5(context, 20);
                    linearLayout.addView(x5Var, w7.y5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    sy0Var.v = textView;
                    int i11 = org.telegram.ui.ActionBar.j6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.m mVar = new com.google.firebase.messaging.m(textView);
                        sy0Var.I = mVar;
                        mVar.x(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    sy0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    TextView textView3 = new TextView(context);
                    sy0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    TextView textView4 = new TextView(context);
                    sy0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    TextView textView5 = new TextView(context);
                    sy0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i11, false));
                    sy0Var.x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), sy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(sy0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(sy0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), sy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    x5Var.addView(textView, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView3, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView2, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView5, w7.y5.c(-2.0f, -2));
                    x5Var.addView(textView4, w7.y5.c(-2.0f, -2));
                    View view = new View(sy0Var.getContext());
                    sy0Var.w = view;
                    linearLayout.addView(view, w7.y5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false));
                    org.telegram.ui.Cells.fa faVar = new org.telegram.ui.Cells.fa(sy0Var.getContext());
                    sy0Var.y = faVar;
                    linearLayout.addView(faVar, w7.y5.n(-1, -2));
                    frameLayout = sy0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.n4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(context, null);
                    gw0Var.setCallback(new m4.q0(19));
                    int i12 = SharedConfig.keepMedia;
                    gw0Var.b(i12 == 3 ? 0 : i12 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = gw0Var;
                    break;
                case 5:
                    frameLayout = new y6(z6Var.getParentActivity(), z6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(z6Var.getParentActivity(), null);
                    t00Var.setIsSingleCell(true);
                    t00Var.setItemsCount(3);
                    t00Var.setIgnoreHeightCheck(true);
                    t00Var.setViewType(25);
                    frameLayout = t00Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.s8(context);
                    break;
                case 8:
                    iVar = ((org.telegram.ui.ActionBar.n2) z6Var).glassEngine;
                    w6 w6Var = new w6(this, context, z6Var, iVar);
                    z6Var.M = w6Var;
                    FrameLayout frameLayout2 = z6Var.N;
                    if (frameLayout2 != null && (frameLayout2.getParent() instanceof ViewGroup)) {
                        ((ViewGroup) z6Var.N.getParent()).removeView(z6Var.N);
                    }
                    w6 w6Var2 = z6Var.M;
                    w6Var2.x = true;
                    FrameLayout frameLayout3 = w6Var2.b;
                    AndroidUtilities.removeFromParent(frameLayout3);
                    frameLayout3.setTranslationY(0.0f);
                    z6Var.N = frameLayout3;
                    ch.d c10 = z6Var.getBaseSimpleGlass().b.c(z6Var.N, null, false);
                    f6Var = ((org.telegram.ui.ActionBar.n2) z6Var).resourceProvider;
                    c10.o(eh.b.m(f6Var));
                    c10.p(AndroidUtilities.dp(9.66f));
                    c10.q(AndroidUtilities.dp(18.0f));
                    frameLayout3.setBackground(c10);
                    z6Var.Z.addView(z6Var.N, w7.y5.d(-1, -2.0f, 48, -4.0f, 0.0f, -4.0f, 0.0f));
                    kVar = ((org.telegram.ui.ActionBar.n2) z6Var).actionBar;
                    kVar.bringToFront();
                    z6Var.N.bringToFront();
                    z6Var.M.c(AndroidUtilities.dp(56.0f), z6Var.b.getPaddingBottom());
                    ai.w0 w0Var = z6Var.b;
                    if (w0Var != null) {
                        z6Var.P = ((org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() / 2) + w0Var.getPaddingTop()) - AndroidUtilities.dp(9.0f);
                    }
                    z6Var.z0();
                    z6Var.M.setDelegate(new g(this, 7));
                    z6Var.M.setCacheModel(z6Var.c0);
                    z6Var.M.setTag(-33024);
                    h6 h6Var = z6Var.Z;
                    w6 w6Var3 = z6Var.M;
                    Objects.requireNonNull(w6Var3);
                    y0 y0Var = new y0(w6Var3, 9);
                    h6Var.z0 = w6Var3;
                    h6Var.A0 = y0Var;
                    h6Var.b0();
                    w6Var.setLayoutParams(new s4.p0(-1, -1));
                    frameLayout = w6Var;
                    break;
                case 9:
                    v6 v6Var = new v6(this, context);
                    z6Var.U = v6Var;
                    v6Var.setTag(-33024);
                    k6Var = v6Var;
                    frameLayout = k6Var;
                    break;
                case 10:
                    k6 k6Var2 = new k6(z6Var, context);
                    z6Var.V = k6Var2;
                    k6Var2.setTag(-33024);
                    k6Var = k6Var2;
                    frameLayout = k6Var;
                    break;
                case 11:
                    frameLayout = new org.telegram.ui.Cells.a2(4, 21, this.d, z6Var.getResourceProvider(), false);
                    break;
                case 12:
                    org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(z6Var.getParentActivity(), null);
                    t00Var2.setIsSingleCell(true);
                    t00Var2.setItemsCount(1);
                    t00Var2.setIgnoreHeightCheck(true);
                    t00Var2.setViewType(26);
                    frameLayout = t00Var2;
                    break;
                case 13:
                    p6 p6Var = new p6(z6Var, context);
                    z6Var.W = p6Var;
                    frameLayout = p6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.gw0 gw0Var2 = new org.telegram.ui.Components.gw0(context, null);
                    float f7 = ((int) ((z6Var.H / 1024) / 1024)) / 1000.0f;
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
                    gw0Var2.setCallback(new y0(arrayList, 10));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    gw0Var2.b(indexOf2, null, strArr);
                    frameLayout = gw0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.f9(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.fa(context);
        }
        return new org.telegram.ui.Components.il0(frameLayout);
    }
}
