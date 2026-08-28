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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class w6 extends wf.b {
    public final Context d;
    public final /* synthetic */ y6 e;

    public w6(y6 y6Var, Context context) {
        this.e = y6Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        long b10 = q1Var.b();
        y6 y6Var = this.e;
        if (b10 == y6Var.G) {
            return true;
        }
        int i9 = q1Var.f;
        return (i9 == 2 && y6Var.D > 0 && !y6Var.H) || i9 == 5 || i9 == 7 || i9 == 11;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.W.size();
    }

    @Override // f2.r0
    public final int j(int i9) {
        return ((t6) this.e.W.get(i9)).a;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        int i10;
        y6 y6Var = this.e;
        ArrayList arrayList = y6Var.W;
        t6 t6Var = (t6) arrayList.get(i9);
        int i11 = q1Var.f;
        View view = q1Var.a;
        if (i11 == 0) {
            org.telegram.ui.Cells.ba baVar = (org.telegram.ui.Cells.ba) view;
            if (i9 == y6Var.G) {
                baVar.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i11 == 1) {
            ((org.telegram.ui.Cells.b9) view).setText(AndroidUtilities.replaceTags(t6Var.e));
            return;
        }
        if (i11 != 2) {
            if (i11 == 3) {
                org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
                m4Var.setText(((t6) arrayList.get(i9)).d);
                ((t6) arrayList.get(i9)).getClass();
                m4Var.setTopMargin(15);
                ((t6) arrayList.get(i9)).getClass();
                m4Var.setBottomMargin(0);
                return;
            }
            int i12 = 7;
            if (i11 == 7) {
                org.telegram.ui.Cells.p8 p8Var = (org.telegram.ui.Cells.p8) view;
                CacheByChatsController cacheByChatsController = y6Var.getMessagesController().getCacheByChatsController();
                int i13 = t6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((t6) arrayList.get(i9)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i13));
                if (((t6) arrayList.get(i9)).c == 0) {
                    p8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((t6) arrayList.get(i9)).c == 1) {
                    p8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((t6) arrayList.get(i9)).c == 2) {
                    p8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((t6) arrayList.get(i9)).c == 3) {
                    p8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                p8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i11) {
                case 9:
                    y6Var.u0();
                    break;
                case 10:
                    i6 i6Var = y6Var.N;
                    if (i6Var != null && !y6Var.H) {
                        long j10 = y6Var.D;
                        boolean z10 = j10 > 0;
                        long j11 = y6Var.E;
                        i6Var.b(j11 <= 0 ? 0.0f : j10 / j11, (y6Var.F <= 0 || j11 <= 0) ? 0.0f : (j11 - r9) / j11, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.z1 z1Var = (org.telegram.ui.Cells.z1) view;
                    int i14 = t6Var.f;
                    boolean q02 = i14 < 0 ? y6Var.q0() : y6Var.e[i14];
                    CharSequence charSequence = t6Var.d;
                    int[] iArr = y6Var.K;
                    int i15 = t6Var.f;
                    if (i15 < 0) {
                        i15 = 9;
                    }
                    int i16 = iArr[i15];
                    SpannableString spannableString = new SpannableString(i16 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i16)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    z1Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(t6Var.g), q02, t6Var.f >= 0 ? !t6Var.j : !y6Var.I, false);
                    int i17 = t6Var.h;
                    int i18 = org.telegram.ui.ActionBar.f6.k7;
                    org.telegram.ui.Components.dp dpVar = z1Var.r;
                    if (dpVar != null) {
                        dpVar.b(i17, i17, i18);
                    }
                    z1Var.setCollapsed(t6Var.f < 0 ? Boolean.valueOf(y6Var.I) : null);
                    if (t6Var.f == -1) {
                        z1Var.d(new a(this, i12), new mh.k3(12, this, z1Var));
                    } else {
                        z1Var.d(null, null);
                    }
                    z1Var.setPad(t6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.mx0 mx0Var = (org.telegram.ui.Components.mx0) view;
        boolean z11 = y6Var.H;
        long j12 = y6Var.f;
        long j13 = y6Var.D;
        long j14 = y6Var.F;
        long j15 = y6Var.E;
        com.google.firebase.messaging.l lVar = mx0Var.E;
        View view2 = mx0Var.w;
        TextView textView = mx0Var.n;
        TextView textView2 = mx0Var.h;
        TextView textView3 = mx0Var.v;
        org.telegram.ui.Cells.ba baVar2 = mx0Var.y;
        mx0Var.e = z11;
        TextView textView4 = mx0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
        TextView textView5 = mx0Var.s;
        long j16 = j15 - j14;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            baVar2.setVisibility(8);
            mx0Var.A = 0.0f;
            mx0Var.B = 0.0f;
            if (lVar != null) {
                lVar.c(textView3);
            }
        } else {
            if (lVar != null) {
                lVar.q(textView3);
            }
            textView3.setVisibility(8);
            if (j13 > 0) {
                i10 = 0;
                view2.setVisibility(0);
                baVar2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                baVar2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
            } else {
                i10 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                view2.setVisibility(8);
                baVar2.setVisibility(8);
            }
            textView4.setVisibility(i10);
            textView5.setVisibility(i10);
            float f10 = j15;
            float f11 = (j13 + j12) / f10;
            float f12 = j16 / f10;
            if (mx0Var.A != f11) {
                ValueAnimator valueAnimator = mx0Var.C;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i19 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(mx0Var.A, f11);
                mx0Var.C = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.lx0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i19) {
                            case 0:
                                mx0 mx0Var2 = mx0Var;
                                mx0Var2.getClass();
                                mx0Var2.A = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mx0Var2.invalidate();
                                break;
                            default:
                                mx0 mx0Var3 = mx0Var;
                                mx0Var3.getClass();
                                mx0Var3.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                mx0Var3.invalidate();
                                break;
                        }
                    }
                });
                mx0Var.C.start();
            }
            if (mx0Var.B != f12) {
                ValueAnimator valueAnimator2 = mx0Var.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i20 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(mx0Var.B, f12);
                mx0Var.D = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.lx0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i20) {
                            case 0:
                                mx0 mx0Var2 = mx0Var;
                                mx0Var2.getClass();
                                mx0Var2.A = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                mx0Var2.invalidate();
                                break;
                            default:
                                mx0 mx0Var3 = mx0Var;
                                mx0Var3.getClass();
                                mx0Var3.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                mx0Var3.invalidate();
                                break;
                        }
                    }
                });
                mx0Var.D.start();
            }
        }
        baVar2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.G6, false));
        mx0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.d;
        if (i9 != 0) {
            int i10 = 0;
            y6 y6Var = this.e;
            switch (i9) {
                case 2:
                    org.telegram.ui.Components.mx0 mx0Var = new org.telegram.ui.Components.mx0(context);
                    Paint paint = new Paint(1);
                    mx0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    mx0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    mx0Var.c = paint4;
                    mx0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    mx0Var.H = hVar;
                    mx0Var.setWillNotDraw(false);
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
                    fh.l2 l2Var = new fh.l2(mx0Var, context, 25);
                    mx0Var.f = l2Var;
                    mx0Var.addView(l2Var, g7.e6.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    mx0Var.addView(linearLayout, g7.e6.c(-2.0f, -1));
                    dh.g gVar = new dh.g(context, 19);
                    linearLayout.addView(gVar, g7.e6.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    mx0Var.v = textView;
                    int i11 = org.telegram.ui.ActionBar.f6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(textView);
                        mx0Var.E = lVar;
                        lVar.u(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    mx0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    TextView textView3 = new TextView(context);
                    mx0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    TextView textView4 = new TextView(context);
                    mx0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    TextView textView5 = new TextView(context);
                    mx0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i11, false));
                    mx0Var.x = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), mx0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(mx0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), i0.a.k(mx0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(10.0f), mx0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    gVar.addView(textView, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView3, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView2, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView5, g7.e6.c(-2.0f, -2));
                    gVar.addView(textView4, g7.e6.c(-2.0f, -2));
                    View view = new View(mx0Var.getContext());
                    mx0Var.w = view;
                    linearLayout.addView(view, g7.e6.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d7, false));
                    org.telegram.ui.Cells.ba baVar = new org.telegram.ui.Cells.ba(mx0Var.getContext());
                    mx0Var.y = baVar;
                    linearLayout.addView(baVar, g7.e6.n(-1, -2));
                    frameLayout = mx0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.m4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.bv0 bv0Var = new org.telegram.ui.Components.bv0(context, null);
                    bv0Var.setCallback(new mg.b(17));
                    int i12 = SharedConfig.keepMedia;
                    bv0Var.b(i12 == 3 ? 0 : i12 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = bv0Var;
                    break;
                case 5:
                    frameLayout = new x6(y6Var.getParentActivity(), y6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(y6Var.getParentActivity(), null);
                    e00Var.setIsSingleCell(true);
                    e00Var.setItemsCount(3);
                    e00Var.setIgnoreHeightCheck(true);
                    e00Var.setViewType(25);
                    frameLayout = e00Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.p8(context);
                    break;
                case 8:
                    v6 v6Var = new v6(this, context, y6Var, i10);
                    y6Var.J = v6Var;
                    v6Var.setDelegate(new g(this, 7));
                    y6Var.J.setCacheModel(y6Var.U);
                    y6Var.R.a0(y6Var.J, AndroidUtilities.dp(40.0f));
                    v6Var.setLayoutParams(new f2.a1(-1, -1));
                    frameLayout = v6Var;
                    break;
                case 9:
                    u6 u6Var = new u6(this, context);
                    y6Var.M = u6Var;
                    u6Var.setTag(-33024);
                    frameLayout2 = u6Var;
                    frameLayout = frameLayout2;
                    break;
                case 10:
                    i6 i6Var = new i6(y6Var, context);
                    y6Var.N = i6Var;
                    i6Var.setTag(-33024);
                    frameLayout2 = i6Var;
                    frameLayout = frameLayout2;
                    break;
                case 11:
                    frameLayout2 = new org.telegram.ui.Cells.z1(4, 21, this.d, y6Var.getResourceProvider(), false);
                    frameLayout = frameLayout2;
                    break;
                case 12:
                    org.telegram.ui.Components.e00 e00Var2 = new org.telegram.ui.Components.e00(y6Var.getParentActivity(), null);
                    e00Var2.setIsSingleCell(true);
                    e00Var2.setItemsCount(1);
                    e00Var2.setIgnoreHeightCheck(true);
                    e00Var2.setViewType(26);
                    frameLayout = e00Var2;
                    break;
                case 13:
                    o6 o6Var = new o6(y6Var, context);
                    y6Var.O = o6Var;
                    frameLayout = o6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.bv0 bv0Var2 = new org.telegram.ui.Components.bv0(context, null);
                    float f10 = ((int) ((y6Var.E / 1024) / 1024)) / 1000.0f;
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
                    for (int i13 = 0; i13 < arrayList.size(); i13++) {
                        if (((Integer) arrayList.get(i13)).intValue() == 1) {
                            strArr[i13] = "300 MB";
                        } else if (((Integer) arrayList.get(i13)).intValue() == Integer.MAX_VALUE) {
                            strArr[i13] = LocaleController.getString(R.string.NoLimit);
                        } else {
                            strArr[i13] = String.format("%d GB", arrayList.get(i13));
                        }
                    }
                    bv0Var2.setCallback(new b1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    bv0Var2.b(indexOf2, null, strArr);
                    frameLayout = bv0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.b9(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.ba(context);
        }
        return new org.telegram.ui.Components.ik0(frameLayout);
    }
}
