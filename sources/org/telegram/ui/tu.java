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

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class tu extends LinearLayout implements org.telegram.ui.ActionBar.p6 {
    public org.telegram.ui.Cells.y E;
    public int F;
    public final bb1 a;
    public s4.c0 b;
    public final org.telegram.ui.Components.xp c;
    public final org.telegram.ui.Components.yj0 d;
    public final org.telegram.ui.Cells.v8 e;
    public final org.telegram.ui.Cells.v8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;
    public org.telegram.ui.ActionBar.x6 x;
    public boolean y;

    public tu(int i10, Context context, org.telegram.ui.ActionBar.r2 r2Var) {
        super(context);
        s4.c0 c0Var;
        org.telegram.ui.ActionBar.u6 u6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, org.telegram.ui.Components.kb1.g(-2.0f, -1));
        org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(r2Var.getCurrentAccount(), 0L, null, (i10 == 0 || i10 == -1) ? 0 : 1);
        this.c = xpVar;
        bb1 bb1Var = new bb1(getContext(), 8, u6Var);
        this.a = bb1Var;
        bb1Var.setAdapter(xpVar);
        bb1Var.setSelectorDrawableColor(0);
        bb1Var.setClipChildren(false);
        bb1Var.setClipToPadding(false);
        bb1Var.setHasFixedSize(true);
        bb1Var.setItemAnimator(null);
        bb1Var.setNestedScrollingEnabled(false);
        b();
        bb1Var.setFocusable(false);
        bb1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        bb1Var.setOnItemClickListener(new di.x4(15, this, r2Var));
        org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(getContext(), null);
        c10Var.setViewType(14);
        c10Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(c10Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(bb1Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(c10Var, org.telegram.ui.Components.kb1.h(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(bb1Var, org.telegram.ui.Components.kb1.h(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        bb1Var.setEmptyView(c10Var);
        bb1Var.W1 = true;
        bb1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.yj0 yj0Var = new org.telegram.ui.Components.yj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = yj0Var;
            yj0Var.h = true;
            yj0Var.Z = true;
            yj0Var.o();
            org.telegram.ui.Cells.v8 v8Var = new org.telegram.ui.Cells.v8(context);
            this.e = v8Var;
            int i11 = org.telegram.ui.ActionBar.y6.i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
            v8Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(v8Var, g02, null, N, null);
            addView(v8Var, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            org.telegram.ui.Cells.v8 v8Var2 = new org.telegram.ui.Cells.v8(context);
            this.f = v8Var2;
            v8Var2.o(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(v8Var2, org.telegram.ui.Components.kb1.g(-2.0f, -1));
            v8Var.setOnClickListener(new ru(this, context, r2Var));
            yj0Var.h = true;
            v8Var2.setOnClickListener(new a(r2Var, 18));
            if (org.telegram.ui.ActionBar.y6.i1()) {
                v8Var.p(LocaleController.getString(R.string.SettingsSwitchToNightMode), yj0Var, true);
                v8Var.w += 2;
            } else {
                yj0Var.M(yj0Var.e[0] - 1);
                v8Var.p(LocaleController.getString(R.string.SettingsSwitchToDayMode), yj0Var, true);
                v8Var.w += 2;
            }
        }
        if (!MediaDataController.getInstance(r2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(r2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.h4 h4Var = new org.telegram.ui.ActionBar.h4(r2Var.getCurrentAccount());
                h4Var.e = "🎨";
                h4Var.c = hg.b.d("🎨");
                h4Var.d = TLRPC.ChatTheme.ofEmoticon(h4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.y6.P0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.x6 P0 = org.telegram.ui.ActionBar.y6.P0(string);
                    if (P0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = P0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i12 == -1) {
                    i12 = org.telegram.ui.ActionBar.y6.P0(string).f0;
                }
                if (i12 != -1) {
                    str = string;
                    i13 = i12;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i14 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.y6.P0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.x6 P02 = org.telegram.ui.ActionBar.y6.P0(string2);
                    if (P02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = P02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i14 == -1) {
                    i14 = org.telegram.ui.ActionBar.y6.P0(str).f0;
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.g4 g4Var = new org.telegram.ui.ActionBar.g4();
                g4Var.a = org.telegram.ui.ActionBar.y6.P0(str);
                g4Var.e = i13;
                h4Var.f.add(g4Var);
                h4Var.f.add(null);
                org.telegram.ui.ActionBar.g4 g4Var2 = new org.telegram.ui.ActionBar.g4();
                g4Var2.a = org.telegram.ui.ActionBar.y6.P0(str2);
                g4Var2.e = i14;
                h4Var.f.add(g4Var2);
                h4Var.f.add(null);
                h4Var.m(r2Var.getCurrentAccount());
                org.telegram.ui.Components.yp ypVar = new org.telegram.ui.Components.yp(h4Var);
                ypVar.c = org.telegram.ui.ActionBar.y6.i1() ? 0 : 2;
                arrayList.add(ypVar);
            }
            xpVar.d = arrayList;
            xpVar.l();
        }
        a();
        c();
        updateColors();
        int i15 = this.r;
        if (i15 < 0 || (c0Var = this.b) == null) {
            return;
        }
        c0Var.h1(i15, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10;
        int i11;
        this.x = org.telegram.ui.ActionBar.y6.I;
        this.y = org.telegram.ui.ActionBar.y6.i1();
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.y6.i1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.y6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.y6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.y6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.y6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.y6.i1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.y6.i1() && ((i10 = this.v) == 0 || i10 == 1)) {
                this.v = 2;
            }
        }
        org.telegram.ui.Components.xp xpVar = this.c;
        if (xpVar.d != null) {
            for (int i13 = 0; i13 < xpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.yp) xpVar.d.get(i13)).c = this.v;
            }
            xpVar.q(0, xpVar.d.size());
        }
        c();
    }

    public final void b() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z10) {
            bb1 bb1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                s4.c0 c0Var = this.b;
                if (c0Var instanceof s4.t) {
                    ((s4.t) c0Var).z1(i11);
                } else {
                    bb1Var.setHasFixedSize(false);
                    getContext();
                    s4.t tVar = new s4.t(i11);
                    tVar.O = new su(0);
                    this.b = tVar;
                    bb1Var.setLayoutManager(tVar);
                }
            } else if (this.b == null) {
                getContext();
                s4.c0 c0Var2 = new s4.c0(0, false);
                this.b = c0Var2;
                bb1Var.setLayoutManager(c0Var2);
            }
            this.w = Boolean.valueOf(z10);
        }
    }

    public final void c() {
        org.telegram.ui.Components.xp xpVar = this.c;
        if (xpVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= xpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.g4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.x6 i11 = ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.i(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.y6.I.a.equals(org.telegram.ui.ActionBar.y6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.g4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.y6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.w6 w6Var = (org.telegram.ui.ActionBar.w6) longSparseArray.get(tL_theme.id);
                        if (w6Var != null && w6Var.a == org.telegram.ui.ActionBar.y6.I.Y) {
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
                    if (org.telegram.ui.ActionBar.y6.I.a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.g4) ((org.telegram.ui.Components.yp) xpVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.y6.I.Y) {
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
            this.r = xpVar.d.size() - 1;
        }
        int i12 = 0;
        while (i12 < xpVar.d.size()) {
            ((org.telegram.ui.Components.yp) xpVar.d.get(i12)).d = i12 == this.r;
            i12++;
        }
        xpVar.E(this.r);
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

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        org.telegram.ui.ActionBar.x6 x6Var;
        org.telegram.ui.Components.yj0 yj0Var;
        if (this.c != null && (x6Var = this.x) != null && (x6Var != org.telegram.ui.ActionBar.y6.I || this.y != org.telegram.ui.ActionBar.y6.i1())) {
            a();
            if (this.e != null && (yj0Var = this.d) != null) {
                if (!yj0Var.k0) {
                    this.d.M(org.telegram.ui.ActionBar.y6.i1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(LocaleController.getString(org.telegram.ui.ActionBar.y6.i1() ? R.string.SettingsSwitchToNightMode : R.string.SettingsSwitchToDayMode), this.d, true);
                this.e.w += 2;
            }
        }
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.yj0 yj0Var2 = this.d;
            if (yj0Var2 != null) {
                yj0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.v8 v8Var = this.e;
            if (v8Var != null) {
                org.telegram.ui.ActionBar.y6.E1(v8Var.getBackground(), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.y6.q6);
            }
            if (this.f != null) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.d6, false);
                int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (c3.h0.t(yVar) && this.f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.v8 v8Var2 = this.f;
                    org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.y6.h0(x02, x03);
                    this.E = h02;
                    v8Var2.setBackground(h02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.v8 v8Var3 = this.f;
                int i11 = org.telegram.ui.ActionBar.y6.q6;
                v8Var3.g(i11, i11);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
