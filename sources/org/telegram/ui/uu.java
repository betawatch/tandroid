package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.ColorStateList;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class uu extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.ui.Cells.y E;
    public int F;
    public final xa1 a;
    public s4.b0 b;
    public final org.telegram.ui.Components.up c;
    public final org.telegram.ui.Components.yj0 d;
    public final org.telegram.ui.Cells.r8 e;
    public final org.telegram.ui.Cells.r8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;
    public org.telegram.ui.ActionBar.j6 x;
    public boolean y;

    public uu(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        s4.b0 b0Var;
        org.telegram.ui.ActionBar.g6 g6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.up upVar = new org.telegram.ui.Components.up(o2Var.getCurrentAccount(), 0L, null, (i10 == 0 || i10 == -1) ? 0 : 1);
        this.c = upVar;
        xa1 xa1Var = new xa1(getContext(), 8, g6Var);
        this.a = xa1Var;
        xa1Var.setAdapter(upVar);
        xa1Var.setSelectorDrawableColor(0);
        xa1Var.setClipChildren(false);
        xa1Var.setClipToPadding(false);
        xa1Var.setHasFixedSize(true);
        xa1Var.setItemAnimator(null);
        xa1Var.setNestedScrollingEnabled(false);
        b();
        xa1Var.setFocusable(false);
        xa1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        xa1Var.setOnItemClickListener(new ci.x4(15, this, o2Var));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getContext(), null);
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(xa1Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(xa1Var, w7.z5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        xa1Var.setEmptyView(b10Var);
        xa1Var.W1 = true;
        xa1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = yj0Var;
            yj0Var.h = true;
            yj0Var.Z = true;
            yj0Var.o();
            org.telegram.ui.Cells.r8 r8Var = new org.telegram.ui.Cells.r8(context);
            this.e = r8Var;
            int i11 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i11);
            r8Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(r8Var, g02, null, O, null);
            addView(r8Var, w7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.r8 r8Var2 = new org.telegram.ui.Cells.r8(context);
            this.f = r8Var2;
            r8Var2.o(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(r8Var2, w7.z5.c(-2.0f, -1));
            r8Var.setOnClickListener(new su(this, context, o2Var));
            yj0Var.h = true;
            r8Var2.setOnClickListener(new a(o2Var, 18));
            if (org.telegram.ui.ActionBar.k6.i1()) {
                r8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
                r8Var.w += 2;
            } else {
                yj0Var.M(yj0Var.e[0] - 1);
                r8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
                r8Var.w += 2;
            }
        }
        if (!MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.f4 f4Var = new org.telegram.ui.ActionBar.f4(o2Var.getCurrentAccount());
                f4Var.e = "🎨";
                f4Var.c = gg.b.d("🎨");
                f4Var.d = TLRPC.ChatTheme.ofEmoticon(f4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.k6.P0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.j6 P0 = org.telegram.ui.ActionBar.k6.P0(string);
                    if (P0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = P0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i12 == -1) {
                    i12 = org.telegram.ui.ActionBar.k6.P0(string).f0;
                }
                if (i12 != -1) {
                    str = string;
                    i13 = i12;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i14 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.k6.P0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.j6 P02 = org.telegram.ui.ActionBar.k6.P0(string2);
                    if (P02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = P02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i14 == -1) {
                    i14 = org.telegram.ui.ActionBar.k6.P0(str).f0;
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.e4 e4Var = new org.telegram.ui.ActionBar.e4();
                e4Var.a = org.telegram.ui.ActionBar.k6.P0(str);
                e4Var.e = i13;
                f4Var.f.add(e4Var);
                f4Var.f.add(null);
                org.telegram.ui.ActionBar.e4 e4Var2 = new org.telegram.ui.ActionBar.e4();
                e4Var2.a = org.telegram.ui.ActionBar.k6.P0(str2);
                e4Var2.e = i14;
                f4Var.f.add(e4Var2);
                f4Var.f.add(null);
                f4Var.m(o2Var.getCurrentAccount());
                org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(f4Var);
                vpVar.c = org.telegram.ui.ActionBar.k6.i1() ? 0 : 2;
                arrayList.add(vpVar);
            }
            upVar.d = arrayList;
            upVar.l();
        }
        a();
        c();
        updateColors();
        int i15 = this.r;
        if (i15 < 0 || (b0Var = this.b) == null) {
            return;
        }
        b0Var.h1(i15, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10;
        int i11;
        this.x = org.telegram.ui.ActionBar.k6.I;
        this.y = org.telegram.ui.ActionBar.k6.i1();
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.k6.i1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.k6.i1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.k6.i1() && ((i10 = this.v) == 0 || i10 == 1)) {
                this.v = 2;
            }
        }
        org.telegram.ui.Components.up upVar = this.c;
        if (upVar.d != null) {
            for (int i13 = 0; i13 < upVar.d.size(); i13++) {
                ((org.telegram.ui.Components.vp) upVar.d.get(i13)).c = this.v;
            }
            upVar.q(0, upVar.d.size());
        }
        c();
    }

    public final void b() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z10) {
            xa1 xa1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                s4.b0 b0Var = this.b;
                if (b0Var instanceof s4.s) {
                    ((s4.s) b0Var).y1(i11);
                } else {
                    xa1Var.setHasFixedSize(false);
                    getContext();
                    s4.s sVar = new s4.s(i11);
                    sVar.O = new tu(0);
                    this.b = sVar;
                    xa1Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                s4.b0 b0Var2 = new s4.b0(0, false);
                this.b = b0Var2;
                xa1Var.setLayoutManager(b0Var2);
            }
            this.w = Boolean.valueOf(z10);
        }
    }

    public final void c() {
        org.telegram.ui.Components.up upVar = this.c;
        if (upVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= upVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.j6 i11 = ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.i(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.k6.I.a.equals(org.telegram.ui.ActionBar.k6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.k6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) longSparseArray.get(tL_theme.id);
                        if (i6Var != null && i6Var.a == org.telegram.ui.ActionBar.k6.I.Y) {
                            this.r = i10;
                            break;
                        }
                    } else {
                        this.r = i10;
                        break;
                    }
                } else {
                    continue;
                }
                i10++;
            } else {
                if (i11 != null) {
                    if (org.telegram.ui.ActionBar.k6.I.a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.e4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.k6.I.Y) {
                            this.r = i10;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i10++;
            }
        }
        if (this.r == -1 && this.s != 3) {
            this.r = upVar.d.size() - 1;
        }
        int i12 = 0;
        while (i12 < upVar.d.size()) {
            ((org.telegram.ui.Components.vp) upVar.d.get(i12)).d = i12 == this.r;
            i12++;
        }
        upVar.E(this.r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        b();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.j6 j6Var;
        org.telegram.ui.Components.yj0 yj0Var;
        if (this.c != null && (j6Var = this.x) != null && (j6Var != org.telegram.ui.ActionBar.k6.I || this.y != org.telegram.ui.ActionBar.k6.i1())) {
            a();
            if (this.e != null && (yj0Var = this.d) != null) {
                if (!yj0Var.k0) {
                    this.d.M(org.telegram.ui.ActionBar.k6.i1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(LocaleController.getString(org.telegram.ui.ActionBar.k6.i1() ? R.string.SettingsSwitchToNightMode : R.string.SettingsSwitchToDayMode), this.d, true);
                this.e.w += 2;
            }
        }
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.yj0 yj0Var2 = this.d;
            if (yj0Var2 != null) {
                yj0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.r8 r8Var = this.e;
            if (r8Var != null) {
                org.telegram.ui.ActionBar.k6.E1(r8Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.k6.q6);
            }
            if (this.f != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (com.google.android.gms.internal.play_billing.k3.s(yVar) && this.f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.r8 r8Var2 = this.f;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(x02, x03);
                    this.E = h02;
                    r8Var2.setBackground(h02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.r8 r8Var3 = this.f;
                int i11 = org.telegram.ui.ActionBar.k6.q6;
                r8Var3.g(i11, i11);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
