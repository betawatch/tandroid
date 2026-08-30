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

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class z6 extends bg.c {
    public final Context d;
    public final /* synthetic */ b7 e;

    public z6(b7 b7Var, Context context) {
        this.e = b7Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.rl0
    public final boolean D(f2.l1 l1Var) {
        long b10 = l1Var.b();
        b7 b7Var = this.e;
        if (b10 == b7Var.H) {
            return true;
        }
        int i10 = l1Var.f;
        return (i10 == 2 && b7Var.E > 0 && !b7Var.I) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // f2.o0
    public final int h() {
        return this.e.X.size();
    }

    @Override // f2.o0
    public final int j(int i10) {
        return ((w6) this.e.X.get(i10)).a;
    }

    @Override // f2.o0
    public final void v(f2.l1 l1Var, int i10) {
        int i11;
        b7 b7Var = this.e;
        ArrayList arrayList = b7Var.X;
        w6 w6Var = (w6) arrayList.get(i10);
        int i12 = l1Var.f;
        View view = l1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.aa aaVar = (org.telegram.ui.Cells.aa) view;
            if (i10 == b7Var.H) {
                aaVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.a9) view).setText(AndroidUtilities.replaceTags(w6Var.e));
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
                org.telegram.ui.Cells.o8 o8Var = (org.telegram.ui.Cells.o8) view;
                CacheByChatsController cacheByChatsController = b7Var.getMessagesController().getCacheByChatsController();
                int i14 = w6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((w6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((w6) arrayList.get(i10)).c == 0) {
                    o8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((w6) arrayList.get(i10)).c == 1) {
                    o8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((w6) arrayList.get(i10)).c == 2) {
                    o8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((w6) arrayList.get(i10)).c == 3) {
                    o8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                o8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    b7Var.v0();
                    break;
                case 10:
                    n6 n6Var = b7Var.O;
                    if (n6Var != null && !b7Var.I) {
                        long j10 = b7Var.E;
                        boolean z4 = j10 > 0;
                        long j11 = b7Var.F;
                        n6Var.b(j11 <= 0 ? 0.0f : j10 / j11, (b7Var.G <= 0 || j11 <= 0) ? 0.0f : (j11 - r9) / j11, z4);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    int i15 = w6Var.f;
                    boolean r02 = i15 < 0 ? b7Var.r0() : b7Var.e[i15];
                    CharSequence charSequence = w6Var.d;
                    int[] iArr = b7Var.L;
                    int i16 = w6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.f51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    z1Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(w6Var.g), r02, w6Var.f >= 0 ? !w6Var.j : !b7Var.J, false);
                    int i18 = w6Var.h;
                    int i19 = org.telegram.ui.ActionBar.j6.k7;
                    org.telegram.ui.Components.lp lpVar = z1Var.r;
                    if (lpVar != null) {
                        lpVar.b(i18, i18, i19);
                    }
                    z1Var.setCollapsed(w6Var.f < 0 ? Boolean.valueOf(b7Var.J) : null);
                    if (w6Var.f == -1) {
                        z1Var.d(new a(this, i13), new org.telegram.messenger.video.g(10, this, z1Var));
                    } else {
                        z1Var.d(null, null);
                    }
                    z1Var.setPad(w6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.hy0 hy0Var = (org.telegram.ui.Components.hy0) view;
        boolean z10 = b7Var.I;
        long j12 = b7Var.f;
        long j13 = b7Var.E;
        long j14 = b7Var.G;
        long j15 = b7Var.F;
        cb.m mVar = hy0Var.F;
        View view2 = hy0Var.w;
        TextView textView = hy0Var.n;
        TextView textView2 = hy0Var.h;
        TextView textView3 = hy0Var.v;
        org.telegram.ui.Cells.aa aaVar2 = hy0Var.y;
        hy0Var.e = z10;
        TextView textView4 = hy0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
        TextView textView5 = hy0Var.s;
        long j16 = j15 - j14;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
        if (z10) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            aaVar2.setVisibility(8);
            hy0Var.B = 0.0f;
            hy0Var.C = 0.0f;
            if (mVar != null) {
                mVar.c(textView3);
            }
        } else {
            if (mVar != null) {
                mVar.t(textView3);
            }
            textView3.setVisibility(8);
            if (j13 > 0) {
                i11 = 0;
                view2.setVisibility(0);
                aaVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                aaVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                view2.setVisibility(8);
                aaVar2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f10 = j15;
            float f11 = (j13 + j12) / f10;
            float f12 = j16 / f10;
            if (hy0Var.B != f11) {
                ValueAnimator valueAnimator = hy0Var.D;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(hy0Var.B, f11);
                hy0Var.D = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.gy0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                hy0 hy0Var2 = hy0Var;
                                hy0Var2.getClass();
                                hy0Var2.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                hy0Var2.invalidate();
                                break;
                            default:
                                hy0 hy0Var3 = hy0Var;
                                hy0Var3.getClass();
                                hy0Var3.C = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                hy0Var3.invalidate();
                                break;
                        }
                    }
                });
                hy0Var.D.start();
            }
            if (hy0Var.C != f12) {
                ValueAnimator valueAnimator2 = hy0Var.E;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(hy0Var.C, f12);
                hy0Var.E = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.gy0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                hy0 hy0Var2 = hy0Var;
                                hy0Var2.getClass();
                                hy0Var2.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                hy0Var2.invalidate();
                                break;
                            default:
                                hy0 hy0Var3 = hy0Var;
                                hy0Var3.getClass();
                                hy0Var3.C = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                hy0Var3.invalidate();
                                break;
                        }
                    }
                });
                hy0Var.E.start();
            }
        }
        aaVar2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.G6, false));
        hy0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.o0
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 0;
            b7 b7Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.hy0 hy0Var = new org.telegram.ui.Components.hy0(context);
                    Paint paint = new Paint(1);
                    hy0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    hy0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    hy0Var.c = paint4;
                    hy0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    hy0Var.I = hVar;
                    hy0Var.setWillNotDraw(false);
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
                    eg.h0 h0Var = new eg.h0(hy0Var, context, 21);
                    hy0Var.f = h0Var;
                    hy0Var.addView(h0Var, k7.b6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    hy0Var.addView(linearLayout, k7.b6.c(-2.0f, -1));
                    dh.d dVar = new dh.d(context, 20);
                    linearLayout.addView(dVar, k7.b6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    hy0Var.v = textView;
                    int i12 = org.telegram.ui.ActionBar.j6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        cb.m mVar = new cb.m(textView);
                        hy0Var.F = mVar;
                        mVar.x(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    hy0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    hy0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    hy0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    hy0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i12, false));
                    hy0Var.x = org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), hy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(hy0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), i0.a.k(hy0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(10.0f), hy0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    dVar.addView(textView, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView3, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView2, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView5, k7.b6.c(-2.0f, -2));
                    dVar.addView(textView4, k7.b6.c(-2.0f, -2));
                    View view = new View(hy0Var.getContext());
                    hy0Var.w = view;
                    linearLayout.addView(view, k7.b6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d7, false));
                    org.telegram.ui.Cells.aa aaVar = new org.telegram.ui.Cells.aa(hy0Var.getContext());
                    hy0Var.y = aaVar;
                    linearLayout.addView(aaVar, k7.b6.n(-1, -2));
                    frameLayout = hy0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.uv0 uv0Var = new org.telegram.ui.Components.uv0(context, null);
                    uv0Var.setCallback(new m.j0(16));
                    int i13 = SharedConfig.keepMedia;
                    uv0Var.b(i13 == 3 ? 0 : i13 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = uv0Var;
                    break;
                case 5:
                    frameLayout = new a7(b7Var.getParentActivity(), b7Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.t00 t00Var = new org.telegram.ui.Components.t00(b7Var.getParentActivity(), null);
                    t00Var.setIsSingleCell(true);
                    t00Var.setItemsCount(3);
                    t00Var.setIgnoreHeightCheck(true);
                    t00Var.setViewType(25);
                    frameLayout = t00Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.o8(context);
                    break;
                case 8:
                    y6 y6Var = new y6(this, context, b7Var, i11);
                    b7Var.K = y6Var;
                    y6Var.setDelegate(new h(this, 7));
                    b7Var.K.setCacheModel(b7Var.V);
                    b7Var.S.a0(b7Var.K, AndroidUtilities.dp(40.0f));
                    y6Var.setLayoutParams(new f2.w0(-1, -1));
                    frameLayout = y6Var;
                    break;
                case 9:
                    x6 x6Var = new x6(this, context);
                    b7Var.N = x6Var;
                    x6Var.setTag(-33024);
                    frameLayout2 = x6Var;
                    frameLayout = frameLayout2;
                    break;
                case 10:
                    n6 n6Var = new n6(b7Var, context);
                    b7Var.O = n6Var;
                    n6Var.setTag(-33024);
                    frameLayout2 = n6Var;
                    frameLayout = frameLayout2;
                    break;
                case 11:
                    frameLayout2 = new org.telegram.ui.Cells.z1(4, 21, this.d, b7Var.getResourceProvider(), false);
                    frameLayout = frameLayout2;
                    break;
                case 12:
                    org.telegram.ui.Components.t00 t00Var2 = new org.telegram.ui.Components.t00(b7Var.getParentActivity(), null);
                    t00Var2.setIsSingleCell(true);
                    t00Var2.setItemsCount(1);
                    t00Var2.setIgnoreHeightCheck(true);
                    t00Var2.setViewType(26);
                    frameLayout = t00Var2;
                    break;
                case 13:
                    s6 s6Var = new s6(b7Var, context);
                    b7Var.P = s6Var;
                    frameLayout = s6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.uv0 uv0Var2 = new org.telegram.ui.Components.uv0(context, null);
                    float f10 = ((int) ((b7Var.F / 1024) / 1024)) / 1000.0f;
                    ArrayList arrayList = new ArrayList();
                    if (f10 <= 17.0f) {
                        arrayList.add(2);
                    }
                    if (f10 > 5.0f) {
                        arrayList.add(5);
                    }
                    if (f10 > 16.0f) {
                        arrayList.add(16);
                    }
                    if (f10 > 32.0f) {
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
                    uv0Var2.setCallback(new a1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    uv0Var2.b(indexOf2, null, strArr);
                    frameLayout = uv0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.a9(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.aa(context);
        }
        return new org.telegram.ui.Components.el0(frameLayout);
    }
}
