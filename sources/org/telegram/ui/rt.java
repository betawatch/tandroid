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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class rt extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public boolean E;
    public org.telegram.ui.Cells.y F;
    public int G;
    public final u51 a;
    public u4.b0 b;
    public final org.telegram.ui.Components.to c;
    public final org.telegram.ui.Components.ch0 d;
    public final org.telegram.ui.Cells.l8 e;
    public final org.telegram.ui.Cells.l8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int w;
    public Boolean x;
    public org.telegram.ui.ActionBar.j6 y;

    public rt(int i3, Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        super(context);
        u4.b0 b0Var;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        this.b = null;
        this.r = -1;
        this.x = null;
        this.s = i3;
        int i10 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, b8.mf.c(-2.0f, -1));
        org.telegram.ui.Components.to toVar = new org.telegram.ui.Components.to(d2Var.getCurrentAccount(), 0L, null, (i3 == 0 || i3 == -1) ? 0 : 1);
        this.c = toVar;
        u51 u51Var = new u51(8, getContext(), e6Var);
        this.a = u51Var;
        u51Var.setAdapter(toVar);
        u51Var.setSelectorDrawableColor(0);
        u51Var.setClipChildren(false);
        u51Var.setClipToPadding(false);
        u51Var.setHasFixedSize(true);
        u51Var.setItemAnimator(null);
        u51Var.setNestedScrollingEnabled(false);
        b();
        u51Var.setFocusable(false);
        u51Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        u51Var.setOnItemClickListener(new ei.q4(16, this, d2Var));
        org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(getContext(), null);
        izVar.setViewType(14);
        izVar.setVisibility(0);
        if (i3 == 0 || i3 == -1) {
            frameLayout.addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(u51Var, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(izVar, b8.mf.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(u51Var, b8.mf.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        u51Var.setEmptyView(izVar);
        u51Var.X1 = true;
        u51Var.Y1 = 0;
        if (i3 == 0) {
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = ch0Var;
            ch0Var.h = true;
            ch0Var.a0 = true;
            ch0Var.o();
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            this.e = l8Var;
            int i11 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            l8Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(l8Var, h02, null, N, null);
            addView(l8Var, b8.mf.c(-2.0f, -1));
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
            this.f = l8Var2;
            l8Var2.o(R.drawable.msg_colors, org.telegram.messenger.bd.M0(2131745501, null), false);
            addView(l8Var2, b8.mf.c(-2.0f, -1));
            l8Var.setOnClickListener(new org.telegram.ui.Components.vd(i10, this, context, d2Var));
            ch0Var.h = true;
            l8Var2.setOnClickListener(new a(d2Var, 18));
            if (org.telegram.ui.ActionBar.k6.k1()) {
                l8Var.p(org.telegram.messenger.bd.M0(2131745476, null), ch0Var, true);
                l8Var.x += 2;
            } else {
                ch0Var.M(ch0Var.e[0] - 1);
                l8Var.p(org.telegram.messenger.bd.M0(2131745477, null), ch0Var, true);
                l8Var.x += 2;
            }
        }
        if (!org.telegram.messenger.li.b0(d2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.li.b0(d2Var.getCurrentAccount()).B0);
            if (i3 == 0) {
                org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(d2Var.getCurrentAccount());
                p3Var.e = "🎨";
                p3Var.c = jg.b.d("🎨");
                p3Var.d = TLRPC.ChatTheme.ofEmoticon(p3Var.e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.k6.Q0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.j6 Q0 = org.telegram.ui.ActionBar.k6.Q0(string);
                    if (Q0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = Q0.Z;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i12 == -1) {
                    i12 = org.telegram.ui.ActionBar.k6.Q0(string).g0;
                }
                if (i12 != -1) {
                    str = string;
                    i13 = i12;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i14 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.k6.Q0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.j6 Q02 = org.telegram.ui.ActionBar.k6.Q0(string2);
                    if (Q02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = Q02.Z;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i14 == -1) {
                    i14 = org.telegram.ui.ActionBar.k6.Q0(str).g0;
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3();
                o3Var.a = org.telegram.ui.ActionBar.k6.Q0(str);
                o3Var.e = i13;
                p3Var.f.add(o3Var);
                p3Var.f.add(null);
                org.telegram.ui.ActionBar.o3 o3Var2 = new org.telegram.ui.ActionBar.o3();
                o3Var2.a = org.telegram.ui.ActionBar.k6.Q0(str2);
                o3Var2.e = i14;
                p3Var.f.add(o3Var2);
                p3Var.f.add(null);
                p3Var.m(d2Var.getCurrentAccount());
                org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(p3Var);
                uoVar.c = org.telegram.ui.ActionBar.k6.k1() ? 0 : 2;
                arrayList.add(uoVar);
            }
            toVar.d = arrayList;
            toVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.r;
        if (i15 < 0 || (b0Var = this.b) == null) {
            return;
        }
        b0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
    }

    public final void a() {
        int i3;
        int i10;
        this.y = org.telegram.ui.ActionBar.k6.I;
        this.E = org.telegram.ui.ActionBar.k6.k1();
        int i11 = this.s;
        if (i11 == 0 || i11 == -1) {
            this.w = org.telegram.ui.ActionBar.k6.k1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Blue")) {
            this.w = 0;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Day")) {
            this.w = 1;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Night")) {
            this.w = 2;
        } else if (org.telegram.ui.ActionBar.k6.I.m().equals("Dark Blue")) {
            this.w = 3;
        } else {
            if (org.telegram.ui.ActionBar.k6.k1() && ((i10 = this.w) == 2 || i10 == 3)) {
                this.w = 0;
            }
            if (!org.telegram.ui.ActionBar.k6.k1() && ((i3 = this.w) == 0 || i3 == 1)) {
                this.w = 2;
            }
        }
        org.telegram.ui.Components.to toVar = this.c;
        if (toVar.d != null) {
            for (int i12 = 0; i12 < toVar.d.size(); i12++) {
                ((org.telegram.ui.Components.uo) toVar.d.get(i12)).c = this.w;
            }
            toVar.k(0, toVar.d.size());
        }
        c();
    }

    public final void b() {
        Point point = org.telegram.messenger.g0.q;
        boolean z10 = point.y > point.x;
        Boolean bool = this.x;
        if (bool == null || bool.booleanValue() != z10) {
            u51 u51Var = this.a;
            int i3 = this.s;
            if (i3 != 0 && i3 != -1) {
                int i10 = z10 ? 3 : 9;
                u4.b0 b0Var = this.b;
                if (b0Var instanceof u4.s) {
                    ((u4.s) b0Var).y1(i10);
                } else {
                    u51Var.setHasFixedSize(false);
                    getContext();
                    u4.s sVar = new u4.s(i10);
                    sVar.O = new qt(0);
                    this.b = sVar;
                    u51Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                u4.b0 b0Var2 = new u4.b0(0, false);
                this.b = b0Var2;
                u51Var.setLayoutManager(b0Var2);
            }
            this.x = Boolean.valueOf(z10);
        }
    }

    public final void c() {
        org.telegram.ui.Components.to toVar = this.c;
        if (toVar.d == null) {
            return;
        }
        this.r = -1;
        int i3 = 0;
        while (true) {
            if (i3 >= toVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.uo) toVar.d.get(i3)).a.f.get(this.w)).b;
            org.telegram.ui.ActionBar.j6 i10 = ((org.telegram.ui.Components.uo) toVar.d.get(i3)).a.i(this.w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.k6.I.a.equals(org.telegram.ui.ActionBar.k6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.uo) toVar.d.get(i3)).a.f.get(this.w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.k6.I.d0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) longSparseArray.get(tL_theme.id);
                        if (g6Var != null && g6Var.a == org.telegram.ui.ActionBar.k6.I.Z) {
                            this.r = i3;
                            break;
                        }
                    } else {
                        this.r = i3;
                        break;
                    }
                } else {
                    continue;
                }
                i3++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.k6.I.a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.uo) toVar.d.get(i3)).a.f.get(this.w)).e == org.telegram.ui.ActionBar.k6.I.Z) {
                            this.r = i3;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i3++;
            }
        }
        if (this.r == -1 && this.s != 3) {
            this.r = toVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < toVar.d.size()) {
            ((org.telegram.ui.Components.uo) toVar.d.get(i11)).d = i11 == this.r;
            i11++;
        }
        toVar.E(this.r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i3, int i10) {
        b();
        super.onMeasure(i3, i10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i3) {
        super.setBackgroundColor(i3);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.j6 j6Var;
        org.telegram.ui.Components.ch0 ch0Var;
        if (this.c != null && (j6Var = this.y) != null && (j6Var != org.telegram.ui.ActionBar.k6.I || this.E != org.telegram.ui.ActionBar.k6.k1())) {
            a();
            if (this.e != null && (ch0Var = this.d) != null) {
                if (!ch0Var.l0) {
                    this.d.M(org.telegram.ui.ActionBar.k6.k1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(org.telegram.messenger.bd.M0(org.telegram.ui.ActionBar.k6.k1() ? 2131745476 : 2131745477, null), this.d, true);
                this.e.x += 2;
            }
        }
        int i3 = this.s;
        if (i3 == 0 || i3 == -1) {
            org.telegram.ui.Components.ch0 ch0Var2 = this.d;
            if (ch0Var2 != null) {
                ch0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.l8 l8Var = this.e;
            if (l8Var != null) {
                org.telegram.ui.ActionBar.k6.H1(l8Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.k6.q6);
            }
            if (this.f != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                org.telegram.ui.Cells.y yVar = this.F;
                if (com.google.android.recaptcha.internal.a.u(yVar) && this.f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.G) {
                        this.G = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.l8 l8Var2 = this.f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(x02, x03);
                    this.F = i02;
                    l8Var2.setBackground(i02);
                    this.G = x03;
                }
                org.telegram.ui.Cells.l8 l8Var3 = this.f;
                int i10 = org.telegram.ui.ActionBar.k6.q6;
                l8Var3.g(i10, i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
