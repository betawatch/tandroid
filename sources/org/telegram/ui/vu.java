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

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class vu extends LinearLayout implements org.telegram.ui.ActionBar.k6 {
    public boolean D;
    public org.telegram.ui.Cells.y E;
    public int F;
    public final w71 a;
    public s4.a0 b;
    public final org.telegram.ui.Components.bp c;
    public final org.telegram.ui.Components.bi0 d;
    public final org.telegram.ui.Cells.p8 e;
    public final org.telegram.ui.Cells.p8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int w;
    public Boolean x;
    public org.telegram.ui.ActionBar.s6 y;

    public vu(int i10, Context context, org.telegram.ui.ActionBar.k2 k2Var) {
        super(context);
        s4.a0 a0Var;
        org.telegram.ui.ActionBar.p6 p6Var = null;
        this.b = null;
        this.r = -1;
        this.x = null;
        this.s = i10;
        int i11 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.b6.c(-2.0f, -1));
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(k2Var.getCurrentAccount(), 0L, null, (i10 == 0 || i10 == -1) ? 0 : 1);
        this.c = bpVar;
        w71 w71Var = new w71(6, getContext(), p6Var);
        this.a = w71Var;
        w71Var.setAdapter(bpVar);
        w71Var.setSelectorDrawableColor(0);
        w71Var.setClipChildren(false);
        w71Var.setClipToPadding(false);
        w71Var.setHasFixedSize(true);
        w71Var.setItemAnimator(null);
        w71Var.setNestedScrollingEnabled(false);
        b();
        w71Var.setFocusable(false);
        w71Var.setPadding(org.telegram.messenger.i0.L(12.0f), 0, org.telegram.messenger.i0.L(12.0f), 0);
        w71Var.setOnItemClickListener(new mg.q0(15, this, k2Var));
        org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(getContext(), null);
        zzVar.setViewType(14);
        zzVar.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(w71Var, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(zzVar, w7.b6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(w71Var, w7.b6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        w71Var.setEmptyView(zzVar);
        w71Var.W1 = true;
        w71Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.bi0 bi0Var = new org.telegram.ui.Components.bi0(R.raw.sun_outline, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(28.0f), true, null);
            this.d = bi0Var;
            bi0Var.h = true;
            bi0Var.Z = true;
            bi0Var.o();
            org.telegram.ui.Cells.p8 p8Var = new org.telegram.ui.Cells.p8(context);
            this.e = p8Var;
            int i12 = org.telegram.ui.ActionBar.t6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(org.telegram.ui.ActionBar.t6.x0(null, i12, false), 2, -1);
            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i12);
            p8Var.setBackground(h02);
            org.telegram.ui.ActionBar.a7.k(p8Var, h02, null, N, null);
            addView(p8Var, w7.b6.c(-2.0f, -1));
            org.telegram.ui.Cells.p8 p8Var2 = new org.telegram.ui.Cells.p8(context);
            this.f = p8Var2;
            p8Var2.o(R.drawable.msg_colors, org.telegram.messenger.cd.L0(2131745508, null), false);
            addView(p8Var2, w7.b6.c(-2.0f, -1));
            p8Var.setOnClickListener(new org.telegram.ui.Components.sd(i11, this, context, k2Var));
            bi0Var.h = true;
            p8Var2.setOnClickListener(new a(k2Var, 18));
            if (org.telegram.ui.ActionBar.t6.k1()) {
                p8Var.p(org.telegram.messenger.cd.L0(2131745484, null), bi0Var, true);
                p8Var.x += 2;
            } else {
                bi0Var.M(bi0Var.e[0] - 1);
                p8Var.p(org.telegram.messenger.cd.L0(2131745485, null), bi0Var, true);
                p8Var.x += 2;
            }
        }
        if (!org.telegram.messenger.ui.b0(k2Var.getCurrentAccount()).A0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(k2Var.getCurrentAccount()).A0);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.y3 y3Var = new org.telegram.ui.ActionBar.y3(k2Var.getCurrentAccount());
                y3Var.e = "🎨";
                y3Var.c = yf.b.d("🎨");
                y3Var.d = TLRPC.ChatTheme.ofEmoticon(y3Var.e);
                SharedPreferences sharedPreferences = org.telegram.messenger.w0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i14 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.t6.Q0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.s6 Q0 = org.telegram.ui.ActionBar.t6.Q0(string);
                    if (Q0 == null) {
                        i13 = 99;
                        string = "Blue";
                    } else {
                        i13 = Q0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.t6.Q0(string).f0;
                }
                if (i13 != -1) {
                    str = string;
                    i14 = i13;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i15 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.t6.Q0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.s6 Q02 = org.telegram.ui.ActionBar.t6.Q0(string2);
                    if (Q02 == null) {
                        i15 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i15 = Q02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i15 == -1) {
                    i15 = org.telegram.ui.ActionBar.t6.Q0(str).f0;
                }
                if (i15 == -1) {
                    i15 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.x3 x3Var = new org.telegram.ui.ActionBar.x3();
                x3Var.a = org.telegram.ui.ActionBar.t6.Q0(str);
                x3Var.e = i14;
                y3Var.f.add(x3Var);
                y3Var.f.add(null);
                org.telegram.ui.ActionBar.x3 x3Var2 = new org.telegram.ui.ActionBar.x3();
                x3Var2.a = org.telegram.ui.ActionBar.t6.Q0(str2);
                x3Var2.e = i15;
                y3Var.f.add(x3Var2);
                y3Var.f.add(null);
                y3Var.m(k2Var.getCurrentAccount());
                org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(y3Var);
                cpVar.c = org.telegram.ui.ActionBar.t6.k1() ? 0 : 2;
                arrayList.add(cpVar);
            }
            bpVar.d = arrayList;
            bpVar.f();
        }
        a();
        c();
        updateColors();
        int i16 = this.r;
        if (i16 < 0 || (a0Var = this.b) == null) {
            return;
        }
        a0Var.h1(i16, org.telegram.messenger.i0.L(16.0f));
    }

    public final void a() {
        int i10;
        int i11;
        this.y = org.telegram.ui.ActionBar.t6.I;
        this.D = org.telegram.ui.ActionBar.t6.k1();
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.w = org.telegram.ui.ActionBar.t6.k1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Blue")) {
            this.w = 0;
        } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Day")) {
            this.w = 1;
        } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Night")) {
            this.w = 2;
        } else if (org.telegram.ui.ActionBar.t6.I.m().equals("Dark Blue")) {
            this.w = 3;
        } else {
            if (org.telegram.ui.ActionBar.t6.k1() && ((i11 = this.w) == 2 || i11 == 3)) {
                this.w = 0;
            }
            if (!org.telegram.ui.ActionBar.t6.k1() && ((i10 = this.w) == 0 || i10 == 1)) {
                this.w = 2;
            }
        }
        org.telegram.ui.Components.bp bpVar = this.c;
        if (bpVar.d != null) {
            for (int i13 = 0; i13 < bpVar.d.size(); i13++) {
                ((org.telegram.ui.Components.cp) bpVar.d.get(i13)).c = this.w;
            }
            bpVar.k(0, bpVar.d.size());
        }
        c();
    }

    public final void b() {
        Point point = org.telegram.messenger.i0.q;
        boolean z10 = point.y > point.x;
        Boolean bool = this.x;
        if (bool == null || bool.booleanValue() != z10) {
            w71 w71Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                s4.a0 a0Var = this.b;
                if (a0Var instanceof s4.r) {
                    ((s4.r) a0Var).y1(i11);
                } else {
                    w71Var.setHasFixedSize(false);
                    getContext();
                    s4.r rVar = new s4.r(i11);
                    rVar.O = new uu(0);
                    this.b = rVar;
                    w71Var.setLayoutManager(rVar);
                }
            } else if (this.b == null) {
                getContext();
                s4.a0 a0Var2 = new s4.a0(0, false);
                this.b = a0Var2;
                w71Var.setLayoutManager(a0Var2);
            }
            this.x = Boolean.valueOf(z10);
        }
    }

    public final void c() {
        org.telegram.ui.Components.bp bpVar = this.c;
        if (bpVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= bpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).a.f.get(this.w)).b;
            org.telegram.ui.ActionBar.s6 i11 = ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).a.i(this.w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.t6.I.a.equals(org.telegram.ui.ActionBar.t6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).a.f.get(this.w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.t6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.r6 r6Var = (org.telegram.ui.ActionBar.r6) longSparseArray.get(tL_theme.id);
                        if (r6Var != null && r6Var.a == org.telegram.ui.ActionBar.t6.I.Y) {
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
                    if (org.telegram.ui.ActionBar.t6.I.a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.x3) ((org.telegram.ui.Components.cp) bpVar.d.get(i10)).a.f.get(this.w)).e == org.telegram.ui.ActionBar.t6.I.Y) {
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
            this.r = bpVar.d.size() - 1;
        }
        int i12 = 0;
        while (i12 < bpVar.d.size()) {
            ((org.telegram.ui.Components.cp) bpVar.d.get(i12)).d = i12 == this.r;
            i12++;
        }
        bpVar.E(this.r);
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

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        org.telegram.ui.ActionBar.s6 s6Var;
        org.telegram.ui.Components.bi0 bi0Var;
        if (this.c != null && (s6Var = this.y) != null && (s6Var != org.telegram.ui.ActionBar.t6.I || this.D != org.telegram.ui.ActionBar.t6.k1())) {
            a();
            if (this.e != null && (bi0Var = this.d) != null) {
                if (!bi0Var.k0) {
                    this.d.M(org.telegram.ui.ActionBar.t6.k1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(org.telegram.messenger.cd.L0(org.telegram.ui.ActionBar.t6.k1() ? 2131745484 : 2131745485, null), this.d, true);
                this.e.x += 2;
            }
        }
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.bi0 bi0Var2 = this.d;
            if (bi0Var2 != null) {
                bi0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.p8 p8Var = this.e;
            if (p8Var != null) {
                org.telegram.ui.ActionBar.t6.H1(p8Var.getBackground(), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.t6.q6);
            }
            if (this.f != null) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.d6, false);
                int x03 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (c3.i0.t(yVar) && this.f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.p8 p8Var2 = this.f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.t6.i0(x02, x03);
                    this.E = i02;
                    p8Var2.setBackground(i02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.p8 p8Var3 = this.f;
                int i11 = org.telegram.ui.ActionBar.t6.q6;
                p8Var3.g(i11, i11);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
