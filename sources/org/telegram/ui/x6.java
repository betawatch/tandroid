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

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x6 extends xf.b {
    public final Context d;
    public final /* synthetic */ z6 e;

    public x6(z6 z6Var, Context context) {
        this.e = z6Var;
        this.d = context;
    }

    @Override // org.telegram.ui.Components.yk0
    public final boolean D(f2.o1 o1Var) {
        long b10 = o1Var.b();
        z6 z6Var = this.e;
        if (b10 == z6Var.G) {
            return true;
        }
        int i10 = o1Var.f;
        return (i10 == 2 && z6Var.D > 0 && !z6Var.H) || i10 == 5 || i10 == 7 || i10 == 11;
    }

    @Override // f2.q0
    public final int h() {
        return this.e.W.size();
    }

    @Override // f2.q0
    public final int j(int i10) {
        return ((u6) this.e.W.get(i10)).a;
    }

    @Override // f2.q0
    public final void v(f2.o1 o1Var, int i10) {
        int i11;
        z6 z6Var = this.e;
        ArrayList arrayList = z6Var.W;
        u6 u6Var = (u6) arrayList.get(i10);
        int i12 = o1Var.f;
        View view = o1Var.a;
        if (i12 == 0) {
            org.telegram.ui.Cells.x9 x9Var = (org.telegram.ui.Cells.x9) view;
            if (i10 == z6Var.G) {
                x9Var.c(LocaleController.getString(R.string.MigrateOldFolder), null, false, false);
                return;
            }
            return;
        }
        if (i12 == 1) {
            ((org.telegram.ui.Cells.x8) view).setText(AndroidUtilities.replaceTags(u6Var.e));
            return;
        }
        if (i12 != 2) {
            if (i12 == 3) {
                org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) view;
                j4Var.setText(((u6) arrayList.get(i10)).d);
                ((u6) arrayList.get(i10)).getClass();
                j4Var.setTopMargin(15);
                ((u6) arrayList.get(i10)).getClass();
                j4Var.setBottomMargin(0);
                return;
            }
            int i13 = 7;
            if (i12 == 7) {
                org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) view;
                CacheByChatsController cacheByChatsController = z6Var.getMessagesController().getCacheByChatsController();
                int i14 = u6Var.c;
                int size = cacheByChatsController.getKeepMediaExceptions(((u6) arrayList.get(i10)).c).size();
                String formatPluralString = size > 0 ? LocaleController.formatPluralString("ExceptionShort", size, Integer.valueOf(size)) : null;
                String keepMediaString = CacheByChatsController.getKeepMediaString(cacheByChatsController.getKeepMedia(i14));
                if (((u6) arrayList.get(i10)).c == 0) {
                    l8Var.p(LocaleController.getString(R.string.PrivateChats), keepMediaString, true, R.drawable.msg_filled_menu_users, -11565578, -13276952, true);
                } else if (((u6) arrayList.get(i10)).c == 1) {
                    l8Var.p(LocaleController.getString(R.string.GroupChats), keepMediaString, true, R.drawable.msg_filled_menu_groups, -11154873, -14175180, true);
                } else if (((u6) arrayList.get(i10)).c == 2) {
                    l8Var.p(LocaleController.getString(R.string.CacheChannels), keepMediaString, true, R.drawable.msg_filled_menu_channels, -1007845, -1996271, true);
                } else if (((u6) arrayList.get(i10)).c == 3) {
                    l8Var.p(LocaleController.getString(R.string.CacheStories), keepMediaString, false, R.drawable.msg_filled_stories, -765355, -2148011, false);
                }
                l8Var.setSubtitle(formatPluralString);
                return;
            }
            switch (i12) {
                case 9:
                    z6Var.v0();
                    break;
                case 10:
                    k6 k6Var = z6Var.N;
                    if (k6Var != null && !z6Var.H) {
                        long j10 = z6Var.D;
                        boolean z10 = j10 > 0;
                        long j11 = z6Var.E;
                        k6Var.b(j11 <= 0 ? 0.0f : j10 / j11, (z6Var.F <= 0 || j11 <= 0) ? 0.0f : (j11 - r9) / j11, z10);
                        break;
                    }
                    break;
                case 11:
                    org.telegram.ui.Cells.y1 y1Var = (org.telegram.ui.Cells.y1) view;
                    int i15 = u6Var.f;
                    boolean r02 = i15 < 0 ? z6Var.r0() : z6Var.e[i15];
                    CharSequence charSequence = u6Var.d;
                    int[] iArr = z6Var.K;
                    int i16 = u6Var.f;
                    if (i16 < 0) {
                        i16 = 9;
                    }
                    int i17 = iArr[i16];
                    SpannableString spannableString = new SpannableString(i17 <= 0 ? String.format("<%.1f%%", Float.valueOf(1.0f)) : String.format("%d%%", Integer.valueOf(i17)));
                    spannableString.setSpan(new RelativeSizeSpan(0.834f), 0, spannableString.length(), 33);
                    spannableString.setSpan(new org.telegram.ui.Components.k41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
                    spannableStringBuilder.append((CharSequence) "  ");
                    spannableStringBuilder.append((CharSequence) spannableString);
                    y1Var.e(spannableStringBuilder, AndroidUtilities.formatFileSize(u6Var.g), r02, u6Var.f >= 0 ? !u6Var.j : !z6Var.I, false);
                    int i18 = u6Var.h;
                    int i19 = org.telegram.ui.ActionBar.g6.k7;
                    org.telegram.ui.Components.bp bpVar = y1Var.r;
                    if (bpVar != null) {
                        bpVar.b(i18, i18, i19);
                    }
                    y1Var.setCollapsed(u6Var.f < 0 ? Boolean.valueOf(z6Var.I) : null);
                    if (u6Var.f == -1) {
                        y1Var.d(new a(this, i13), new nh.x1(13, this, y1Var));
                    } else {
                        y1Var.d(null, null);
                    }
                    y1Var.setPad(u6Var.i ? 1 : 0);
                    break;
            }
            return;
        }
        final org.telegram.ui.Components.ox0 ox0Var = (org.telegram.ui.Components.ox0) view;
        boolean z11 = z6Var.H;
        long j12 = z6Var.f;
        long j13 = z6Var.D;
        long j14 = z6Var.F;
        long j15 = z6Var.E;
        com.google.firebase.messaging.l lVar = ox0Var.E;
        View view2 = ox0Var.w;
        TextView textView = ox0Var.n;
        TextView textView2 = ox0Var.h;
        TextView textView3 = ox0Var.v;
        org.telegram.ui.Cells.x9 x9Var2 = ox0Var.y;
        ox0Var.e = z11;
        TextView textView4 = ox0Var.r;
        textView4.setText(LocaleController.formatString("TotalDeviceFreeSize", R.string.TotalDeviceFreeSize, AndroidUtilities.formatFileSize(j14)));
        TextView textView5 = ox0Var.s;
        long j16 = j15 - j14;
        textView5.setText(LocaleController.formatString("TotalDeviceSize", R.string.TotalDeviceSize, AndroidUtilities.formatFileSize(j16)));
        if (z11) {
            textView3.setVisibility(0);
            textView2.setVisibility(8);
            textView4.setVisibility(8);
            textView5.setVisibility(8);
            textView.setVisibility(8);
            view2.setVisibility(8);
            x9Var2.setVisibility(8);
            ox0Var.A = 0.0f;
            ox0Var.B = 0.0f;
            if (lVar != null) {
                lVar.c(textView3);
            }
        } else {
            if (lVar != null) {
                lVar.q(textView3);
            }
            textView3.setVisibility(8);
            if (j13 > 0) {
                i11 = 0;
                view2.setVisibility(0);
                x9Var2.setVisibility(0);
                textView2.setVisibility(0);
                textView.setVisibility(8);
                x9Var2.c(LocaleController.getString(R.string.ClearTelegramCache), AndroidUtilities.formatFileSize(j13), false, true);
                textView2.setText(LocaleController.formatString("TelegramCacheSize", R.string.TelegramCacheSize, AndroidUtilities.formatFileSize(j13 + j12)));
            } else {
                i11 = 0;
                textView2.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(LocaleController.formatString("LocalDatabaseSize", R.string.LocalDatabaseSize, AndroidUtilities.formatFileSize(j12)));
                view2.setVisibility(8);
                x9Var2.setVisibility(8);
            }
            textView4.setVisibility(i11);
            textView5.setVisibility(i11);
            float f10 = j15;
            float f11 = (j13 + j12) / f10;
            float f12 = j16 / f10;
            if (ox0Var.A != f11) {
                ValueAnimator valueAnimator = ox0Var.C;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int i20 = 0;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(ox0Var.A, f11);
                ox0Var.C = ofFloat;
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.nx0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        switch (i20) {
                            case 0:
                                ox0 ox0Var2 = ox0Var;
                                ox0Var2.getClass();
                                ox0Var2.A = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                ox0Var2.invalidate();
                                break;
                            default:
                                ox0 ox0Var3 = ox0Var;
                                ox0Var3.getClass();
                                ox0Var3.B = ((Float) valueAnimator2.getAnimatedValue()).floatValue();
                                ox0Var3.invalidate();
                                break;
                        }
                    }
                });
                ox0Var.C.start();
            }
            if (ox0Var.B != f12) {
                ValueAnimator valueAnimator2 = ox0Var.D;
                if (valueAnimator2 != null) {
                    valueAnimator2.cancel();
                }
                final int i21 = 1;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(ox0Var.B, f12);
                ox0Var.D = ofFloat2;
                ofFloat2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: org.telegram.ui.Components.nx0
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator22) {
                        switch (i21) {
                            case 0:
                                ox0 ox0Var2 = ox0Var;
                                ox0Var2.getClass();
                                ox0Var2.A = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                ox0Var2.invalidate();
                                break;
                            default:
                                ox0 ox0Var3 = ox0Var;
                                ox0Var3.getClass();
                                ox0Var3.B = ((Float) valueAnimator22.getAnimatedValue()).floatValue();
                                ox0Var3.invalidate();
                                break;
                        }
                    }
                });
                ox0Var.D.start();
            }
        }
        x9Var2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.G6, false));
        ox0Var.requestLayout();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.q0
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        FrameLayout frameLayout;
        FrameLayout frameLayout2;
        Context context = this.d;
        if (i10 != 0) {
            int i11 = 0;
            z6 z6Var = this.e;
            switch (i10) {
                case 2:
                    org.telegram.ui.Components.ox0 ox0Var = new org.telegram.ui.Components.ox0(context);
                    Paint paint = new Paint(1);
                    ox0Var.a = paint;
                    Paint paint2 = new Paint(1);
                    Paint paint3 = new Paint(1);
                    ox0Var.b = paint3;
                    Paint paint4 = new Paint(1);
                    ox0Var.c = paint4;
                    ox0Var.d = new Paint();
                    org.telegram.ui.Components.voip.h hVar = new org.telegram.ui.Components.voip.h(220, 255);
                    ox0Var.H = hVar;
                    ox0Var.setWillNotDraw(false);
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
                    ag.s0 s0Var = new ag.s0(ox0Var, context, 25);
                    ox0Var.f = s0Var;
                    ox0Var.addView(s0Var, h7.z5.c(-2.0f, -1));
                    LinearLayout linearLayout = new LinearLayout(context);
                    linearLayout.setOrientation(1);
                    ox0Var.addView(linearLayout, h7.z5.c(-2.0f, -1));
                    ag.d dVar = new ag.d(context, 19);
                    linearLayout.addView(dVar, h7.z5.k(21.0f, 40.0f, 21.0f, 16.0f, -1, -2));
                    TextView textView = new TextView(context);
                    ox0Var.v = textView;
                    int i12 = org.telegram.ui.ActionBar.g6.y6;
                    textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    String string = LocaleController.getString("CalculatingSize", R.string.CalculatingSize);
                    int indexOf = string.indexOf("...");
                    if (indexOf >= 0) {
                        SpannableString spannableString = new SpannableString(string);
                        com.google.firebase.messaging.l lVar = new com.google.firebase.messaging.l(textView);
                        ox0Var.E = lVar;
                        lVar.u(spannableString, indexOf);
                        textView.setText(spannableString);
                    } else {
                        textView.setText(string);
                    }
                    TextView textView2 = new TextView(context);
                    ox0Var.h = textView2;
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView3 = new TextView(context);
                    ox0Var.n = textView3;
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView4 = new TextView(context);
                    ox0Var.r = textView4;
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    TextView textView5 = new TextView(context);
                    ox0Var.s = textView5;
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i12, false));
                    ox0Var.x = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.Vi, false);
                    textView2.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), ox0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView2.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView4.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.b.k(ox0Var.x, 64)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView4.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView5.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), i0.b.k(ox0Var.x, 127)), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView5.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    textView3.setCompoundDrawablesWithIntrinsicBounds(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(10.0f), ox0Var.x), (Drawable) null, (Drawable) null, (Drawable) null);
                    textView3.setCompoundDrawablePadding(AndroidUtilities.dp(6.0f));
                    dVar.addView(textView, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView3, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView2, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView5, h7.z5.c(-2.0f, -2));
                    dVar.addView(textView4, h7.z5.c(-2.0f, -2));
                    View view = new View(ox0Var.getContext());
                    ox0Var.w = view;
                    linearLayout.addView(view, h7.z5.t(-1, -2, 0, 21, 0, 0, 0));
                    view.getLayoutParams().height = 1;
                    view.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d7, false));
                    org.telegram.ui.Cells.x9 x9Var = new org.telegram.ui.Cells.x9(ox0Var.getContext());
                    ox0Var.y = x9Var;
                    linearLayout.addView(x9Var, h7.z5.n(-1, -2));
                    frameLayout = ox0Var;
                    break;
                case 3:
                    frameLayout = new org.telegram.ui.Cells.j4(context);
                    break;
                case 4:
                    org.telegram.ui.Components.dv0 dv0Var = new org.telegram.ui.Components.dv0(context, null);
                    dv0Var.setCallback(new ng.a(22));
                    int i13 = SharedConfig.keepMedia;
                    dv0Var.b(i13 == 3 ? 0 : i13 + 1, null, LocaleController.formatPluralString("Days", 3, new Object[0]), LocaleController.formatPluralString("Weeks", 1, new Object[0]), LocaleController.formatPluralString("Months", 1, new Object[0]), LocaleController.getString(R.string.KeepMediaForever));
                    frameLayout = dv0Var;
                    break;
                case 5:
                    frameLayout = new y6(z6Var.getParentActivity(), z6Var.getResourceProvider());
                    break;
                case 6:
                    org.telegram.ui.Components.h00 h00Var = new org.telegram.ui.Components.h00(z6Var.getParentActivity(), null);
                    h00Var.setIsSingleCell(true);
                    h00Var.setItemsCount(3);
                    h00Var.setIgnoreHeightCheck(true);
                    h00Var.setViewType(25);
                    frameLayout = h00Var;
                    break;
                case 7:
                    frameLayout = new org.telegram.ui.Cells.l8(context);
                    break;
                case 8:
                    w6 w6Var = new w6(this, context, z6Var, i11);
                    z6Var.J = w6Var;
                    w6Var.setDelegate(new g(this, 7));
                    z6Var.J.setCacheModel(z6Var.U);
                    z6Var.R.a0(z6Var.J, AndroidUtilities.dp(40.0f));
                    w6Var.setLayoutParams(new f2.y0(-1, -1));
                    frameLayout = w6Var;
                    break;
                case 9:
                    v6 v6Var = new v6(this, context);
                    z6Var.M = v6Var;
                    v6Var.setTag(-33024);
                    frameLayout2 = v6Var;
                    frameLayout = frameLayout2;
                    break;
                case 10:
                    k6 k6Var = new k6(z6Var, context);
                    z6Var.N = k6Var;
                    k6Var.setTag(-33024);
                    frameLayout2 = k6Var;
                    frameLayout = frameLayout2;
                    break;
                case 11:
                    frameLayout2 = new org.telegram.ui.Cells.y1(4, 21, this.d, z6Var.getResourceProvider(), false);
                    frameLayout = frameLayout2;
                    break;
                case 12:
                    org.telegram.ui.Components.h00 h00Var2 = new org.telegram.ui.Components.h00(z6Var.getParentActivity(), null);
                    h00Var2.setIsSingleCell(true);
                    h00Var2.setItemsCount(1);
                    h00Var2.setIgnoreHeightCheck(true);
                    h00Var2.setViewType(26);
                    frameLayout = h00Var2;
                    break;
                case 13:
                    p6 p6Var = new p6(z6Var, context);
                    z6Var.O = p6Var;
                    frameLayout = p6Var;
                    break;
                case 14:
                    org.telegram.ui.Components.dv0 dv0Var2 = new org.telegram.ui.Components.dv0(context, null);
                    float f10 = ((int) ((z6Var.E / 1024) / 1024)) / 1000.0f;
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
                    dv0Var2.setCallback(new c1(arrayList, 9));
                    int indexOf2 = arrayList.indexOf(Integer.valueOf(SharedConfig.getPreferences().getInt("cache_limit", ConnectionsManager.DEFAULT_DATACENTER_ID)));
                    if (indexOf2 < 0) {
                        indexOf2 = arrayList.size() - 1;
                    }
                    dv0Var2.b(indexOf2, null, strArr);
                    frameLayout = dv0Var2;
                    break;
                default:
                    frameLayout = new org.telegram.ui.Cells.x8(context);
                    break;
            }
        } else {
            frameLayout = new org.telegram.ui.Cells.x9(context);
        }
        return new org.telegram.ui.Components.lk0(frameLayout);
    }
}
