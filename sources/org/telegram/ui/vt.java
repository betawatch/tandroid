package org.telegram.ui;

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

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vt extends LinearLayout implements org.telegram.ui.ActionBar.z5 {
    public int E;
    public final b61 a;
    public v4.b0 b;
    public final org.telegram.ui.Components.cp c;
    public final org.telegram.ui.Components.ch0 d;
    public final org.telegram.ui.Cells.l8 e;
    public final org.telegram.ui.Cells.l8 f;
    public int h;
    public final int n;
    public int r;
    public Boolean s;
    public org.telegram.ui.ActionBar.i6 w;
    public boolean x;
    public org.telegram.ui.Cells.y y;

    public vt(int i7, Context context, org.telegram.ui.ActionBar.e2 e2Var) {
        super(context);
        v4.b0 b0Var;
        org.telegram.ui.ActionBar.e6 e6Var = null;
        this.b = null;
        this.h = -1;
        this.s = null;
        this.n = i7;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ja.c(-2.0f, -1));
        org.telegram.ui.Components.cp cpVar = new org.telegram.ui.Components.cp(e2Var.getCurrentAccount(), 0L, null, (i7 == 0 || i7 == -1) ? 0 : 1);
        this.c = cpVar;
        b61 b61Var = new b61(9, getContext(), e6Var);
        this.a = b61Var;
        b61Var.setAdapter(cpVar);
        b61Var.setSelectorDrawableColor(0);
        b61Var.setClipChildren(false);
        b61Var.setClipToPadding(false);
        b61Var.setHasFixedSize(true);
        b61Var.setItemAnimator(null);
        b61Var.setNestedScrollingEnabled(false);
        b();
        b61Var.setFocusable(false);
        b61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        b61Var.setOnItemClickListener(new fi.i4(16, this, e2Var));
        org.telegram.ui.Components.pz pzVar = new org.telegram.ui.Components.pz(getContext(), null);
        pzVar.setViewType(14);
        pzVar.setVisibility(0);
        if (i7 == 0 || i7 == -1) {
            frameLayout.addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(b61Var, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(pzVar, c8.ja.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(b61Var, c8.ja.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        b61Var.setEmptyView(pzVar);
        b61Var.X1 = true;
        b61Var.Y1 = 0;
        int i10 = 2;
        if (i7 == 0) {
            org.telegram.ui.Components.ch0 ch0Var = new org.telegram.ui.Components.ch0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = ch0Var;
            ch0Var.h = true;
            ch0Var.a0 = true;
            ch0Var.o();
            org.telegram.ui.Cells.l8 l8Var = new org.telegram.ui.Cells.l8(context);
            this.e = l8Var;
            int i11 = org.telegram.ui.ActionBar.j6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.j6.h0(org.telegram.ui.ActionBar.j6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.m6 M = org.telegram.ui.ActionBar.q6.M(i11);
            l8Var.setBackground(h02);
            org.telegram.ui.ActionBar.q6.j(l8Var, h02, null, M, null);
            addView(l8Var, c8.ja.c(-2.0f, -1));
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context);
            this.f = l8Var2;
            l8Var2.o(R.drawable.msg_colors, org.telegram.messenger.hd.M0(2131745491, null), false);
            addView(l8Var2, c8.ja.c(-2.0f, -1));
            l8Var.setOnClickListener(new a7.d(i10, this, e2Var));
            ch0Var.h = true;
            l8Var2.setOnClickListener(new a(e2Var, 18));
            if (org.telegram.ui.ActionBar.j6.k1()) {
                l8Var.p(org.telegram.messenger.hd.M0(2131745466, null), ch0Var, true);
                l8Var.x += 2;
            } else {
                ch0Var.M(ch0Var.e[0] - 1);
                l8Var.p(org.telegram.messenger.hd.M0(2131745467, null), ch0Var, true);
                l8Var.x += 2;
            }
        }
        if (!org.telegram.messenger.si.b0(e2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.si.b0(e2Var.getCurrentAccount()).B0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.p3 p3Var = new org.telegram.ui.ActionBar.p3(e2Var.getCurrentAccount());
                p3Var.e = "🎨";
                p3Var.c = ig.b.d("🎨");
                p3Var.d = TLRPC.ChatTheme.ofEmoticon(p3Var.e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.j6.Q0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.i6 Q0 = org.telegram.ui.ActionBar.j6.Q0(string);
                    if (Q0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = Q0.Z;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i12 == -1) {
                    i12 = org.telegram.ui.ActionBar.j6.Q0(string).g0;
                }
                if (i12 != -1) {
                    str = string;
                    i13 = i12;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i14 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.j6.Q0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.i6 Q02 = org.telegram.ui.ActionBar.j6.Q0(string2);
                    if (Q02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = Q02.Z;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i14 == -1) {
                    i14 = org.telegram.ui.ActionBar.j6.Q0(str).g0;
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.o3 o3Var = new org.telegram.ui.ActionBar.o3();
                o3Var.a = org.telegram.ui.ActionBar.j6.Q0(str);
                o3Var.e = i13;
                p3Var.f.add(o3Var);
                p3Var.f.add(null);
                org.telegram.ui.ActionBar.o3 o3Var2 = new org.telegram.ui.ActionBar.o3();
                o3Var2.a = org.telegram.ui.ActionBar.j6.Q0(str2);
                o3Var2.e = i14;
                p3Var.f.add(o3Var2);
                p3Var.f.add(null);
                p3Var.m(e2Var.getCurrentAccount());
                org.telegram.ui.Components.dp dpVar = new org.telegram.ui.Components.dp(p3Var);
                dpVar.c = org.telegram.ui.ActionBar.j6.k1() ? 0 : 2;
                arrayList.add(dpVar);
            }
            cpVar.d = arrayList;
            cpVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.h;
        if (i15 < 0 || (b0Var = this.b) == null) {
            return;
        }
        b0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
    }

    public final void a() {
        int i7;
        int i10;
        this.w = org.telegram.ui.ActionBar.j6.I;
        this.x = org.telegram.ui.ActionBar.j6.k1();
        int i11 = this.n;
        if (i11 == 0 || i11 == -1) {
            this.r = org.telegram.ui.ActionBar.j6.k1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Blue")) {
            this.r = 0;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Day")) {
            this.r = 1;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Night")) {
            this.r = 2;
        } else if (org.telegram.ui.ActionBar.j6.I.m().equals("Dark Blue")) {
            this.r = 3;
        } else {
            if (org.telegram.ui.ActionBar.j6.k1() && ((i10 = this.r) == 2 || i10 == 3)) {
                this.r = 0;
            }
            if (!org.telegram.ui.ActionBar.j6.k1() && ((i7 = this.r) == 0 || i7 == 1)) {
                this.r = 2;
            }
        }
        org.telegram.ui.Components.cp cpVar = this.c;
        if (cpVar.d != null) {
            for (int i12 = 0; i12 < cpVar.d.size(); i12++) {
                ((org.telegram.ui.Components.dp) cpVar.d.get(i12)).c = this.r;
            }
            cpVar.k(0, cpVar.d.size());
        }
        c();
    }

    public final void b() {
        Point point = org.telegram.messenger.g0.q;
        boolean z10 = point.y > point.x;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z10) {
            b61 b61Var = this.a;
            int i7 = this.n;
            if (i7 != 0 && i7 != -1) {
                int i10 = z10 ? 3 : 9;
                v4.b0 b0Var = this.b;
                if (b0Var instanceof v4.s) {
                    ((v4.s) b0Var).y1(i10);
                } else {
                    b61Var.setHasFixedSize(false);
                    getContext();
                    v4.s sVar = new v4.s(i10);
                    sVar.O = new ut(0);
                    this.b = sVar;
                    b61Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                v4.b0 b0Var2 = new v4.b0(0, false);
                this.b = b0Var2;
                b61Var.setLayoutManager(b0Var2);
            }
            this.s = Boolean.valueOf(z10);
        }
    }

    public final void c() {
        org.telegram.ui.Components.cp cpVar = this.c;
        if (cpVar.d == null) {
            return;
        }
        this.h = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= cpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).a.f.get(this.r)).b;
            org.telegram.ui.ActionBar.i6 i10 = ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).a.i(this.r);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.j6.I.a.equals(org.telegram.ui.ActionBar.j6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).a.f.get(this.r)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.j6.I.d0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) longSparseArray.get(tL_theme.id);
                        if (g6Var != null && g6Var.a == org.telegram.ui.ActionBar.j6.I.Z) {
                            this.h = i7;
                            break;
                        }
                    } else {
                        this.h = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.j6.I.a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.o3) ((org.telegram.ui.Components.dp) cpVar.d.get(i7)).a.f.get(this.r)).e == org.telegram.ui.ActionBar.j6.I.Z) {
                            this.h = i7;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
                i7++;
            }
        }
        if (this.h == -1 && this.n != 3) {
            this.h = cpVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < cpVar.d.size()) {
            ((org.telegram.ui.Components.dp) cpVar.d.get(i11)).d = i11 == this.h;
            i11++;
        }
        cpVar.E(this.h);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        b();
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        org.telegram.ui.ActionBar.i6 i6Var;
        org.telegram.ui.Components.ch0 ch0Var;
        if (this.c != null && (i6Var = this.w) != null && (i6Var != org.telegram.ui.ActionBar.j6.I || this.x != org.telegram.ui.ActionBar.j6.k1())) {
            a();
            if (this.e != null && (ch0Var = this.d) != null) {
                if (!ch0Var.l0) {
                    this.d.M(org.telegram.ui.ActionBar.j6.k1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(org.telegram.messenger.hd.M0(org.telegram.ui.ActionBar.j6.k1() ? 2131745466 : 2131745467, null), this.d, true);
                this.e.x += 2;
            }
        }
        int i7 = this.n;
        if (i7 == 0 || i7 == -1) {
            org.telegram.ui.Components.ch0 ch0Var2 = this.d;
            if (ch0Var2 != null) {
                ch0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.l8 l8Var = this.e;
            if (l8Var != null) {
                org.telegram.ui.ActionBar.j6.H1(l8Var.getBackground(), org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.j6.q6);
            }
            if (this.f != null) {
                int x02 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.d6, false);
                int x03 = org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.i6, false);
                org.telegram.ui.Cells.y yVar = this.y;
                if (com.google.android.gms.internal.vision.e2.s(yVar) && this.f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.E) {
                        this.E = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.l8 l8Var2 = this.f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.j6.i0(x02, x03);
                    this.y = i02;
                    l8Var2.setBackground(i02);
                    this.E = x03;
                }
                org.telegram.ui.Cells.l8 l8Var3 = this.f;
                int i10 = org.telegram.ui.ActionBar.j6.q6;
                l8Var3.g(i10, i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
