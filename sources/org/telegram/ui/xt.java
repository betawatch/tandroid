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

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class xt extends LinearLayout implements org.telegram.ui.ActionBar.b6 {
    public int E;
    public final f61 a;
    public v4.c0 b;
    public final org.telegram.ui.Components.lp c;
    public final org.telegram.ui.Components.oh0 d;
    public final org.telegram.ui.Cells.n8 e;
    public final org.telegram.ui.Cells.n8 f;
    public int h;
    public final int n;
    public int r;
    public Boolean s;
    public org.telegram.ui.ActionBar.l6 w;
    public boolean x;
    public org.telegram.ui.Cells.y y;

    public xt(int i7, Context context, org.telegram.ui.ActionBar.g2 g2Var) {
        super(context);
        v4.c0 c0Var;
        org.telegram.ui.ActionBar.h6 h6Var = null;
        this.b = null;
        this.h = -1;
        this.s = null;
        this.n = i7;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ma.c(-2.0f, -1));
        org.telegram.ui.Components.lp lpVar = new org.telegram.ui.Components.lp(g2Var.getCurrentAccount(), 0L, null, (i7 == 0 || i7 == -1) ? 0 : 1);
        this.c = lpVar;
        f61 f61Var = new f61(9, getContext(), h6Var);
        this.a = f61Var;
        f61Var.setAdapter(lpVar);
        f61Var.setSelectorDrawableColor(0);
        f61Var.setClipChildren(false);
        f61Var.setClipToPadding(false);
        f61Var.setHasFixedSize(true);
        f61Var.setItemAnimator(null);
        f61Var.setNestedScrollingEnabled(false);
        b();
        f61Var.setFocusable(false);
        f61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        f61Var.setOnItemClickListener(new fi.g4(16, this, g2Var));
        org.telegram.ui.Components.yz yzVar = new org.telegram.ui.Components.yz(getContext(), null);
        yzVar.setViewType(14);
        yzVar.setVisibility(0);
        if (i7 == 0 || i7 == -1) {
            frameLayout.addView(yzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(yzVar, c8.ma.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(f61Var, c8.ma.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        f61Var.setEmptyView(yzVar);
        f61Var.X1 = true;
        f61Var.Y1 = 0;
        int i10 = 2;
        if (i7 == 0) {
            org.telegram.ui.Components.oh0 oh0Var = new org.telegram.ui.Components.oh0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = oh0Var;
            oh0Var.h = true;
            oh0Var.a0 = true;
            oh0Var.o();
            org.telegram.ui.Cells.n8 n8Var = new org.telegram.ui.Cells.n8(context);
            this.e = n8Var;
            int i11 = org.telegram.ui.ActionBar.m6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.p6 M = org.telegram.ui.ActionBar.t6.M(i11);
            n8Var.setBackground(h02);
            org.telegram.ui.ActionBar.t6.j(n8Var, h02, null, M, null);
            addView(n8Var, c8.ma.c(-2.0f, -1));
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context);
            this.f = n8Var2;
            n8Var2.o(R.drawable.msg_colors, org.telegram.messenger.hd.N0(2131745295, null), false);
            addView(n8Var2, c8.ma.c(-2.0f, -1));
            n8Var.setOnClickListener(new a7.d(i10, this, g2Var));
            oh0Var.h = true;
            n8Var2.setOnClickListener(new a(g2Var, 18));
            if (org.telegram.ui.ActionBar.m6.k1()) {
                n8Var.p(org.telegram.messenger.hd.N0(2131745270, null), oh0Var, true);
                n8Var.x += 2;
            } else {
                oh0Var.M(oh0Var.e[0] - 1);
                n8Var.p(org.telegram.messenger.hd.N0(2131745271, null), oh0Var, true);
                n8Var.x += 2;
            }
        }
        if (!org.telegram.messenger.si.d0(g2Var.getCurrentAccount()).B0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.si.d0(g2Var.getCurrentAccount()).B0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.s3 s3Var = new org.telegram.ui.ActionBar.s3(g2Var.getCurrentAccount());
                s3Var.e = "🎨";
                s3Var.c = ig.b.d("🎨");
                s3Var.d = TLRPC.ChatTheme.ofEmoticon(s3Var.e);
                SharedPreferences sharedPreferences = org.telegram.messenger.t0.b.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i12 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i13 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.m6.Q0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.l6 Q0 = org.telegram.ui.ActionBar.m6.Q0(string);
                    if (Q0 == null) {
                        i12 = 99;
                        string = "Blue";
                    } else {
                        i12 = Q0.Z;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i12 == -1) {
                    i12 = org.telegram.ui.ActionBar.m6.Q0(string).g0;
                }
                if (i12 != -1) {
                    str = string;
                    i13 = i12;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i14 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.m6.Q0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.l6 Q02 = org.telegram.ui.ActionBar.m6.Q0(string2);
                    if (Q02 == null) {
                        i14 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i14 = Q02.Z;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i14 == -1) {
                    i14 = org.telegram.ui.ActionBar.m6.Q0(str).g0;
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3();
                r3Var.a = org.telegram.ui.ActionBar.m6.Q0(str);
                r3Var.e = i13;
                s3Var.f.add(r3Var);
                s3Var.f.add(null);
                org.telegram.ui.ActionBar.r3 r3Var2 = new org.telegram.ui.ActionBar.r3();
                r3Var2.a = org.telegram.ui.ActionBar.m6.Q0(str2);
                r3Var2.e = i14;
                s3Var.f.add(r3Var2);
                s3Var.f.add(null);
                s3Var.m(g2Var.getCurrentAccount());
                org.telegram.ui.Components.mp mpVar = new org.telegram.ui.Components.mp(s3Var);
                mpVar.c = org.telegram.ui.ActionBar.m6.k1() ? 0 : 2;
                arrayList.add(mpVar);
            }
            lpVar.d = arrayList;
            lpVar.f();
        }
        a();
        c();
        updateColors();
        int i15 = this.h;
        if (i15 < 0 || (c0Var = this.b) == null) {
            return;
        }
        c0Var.h1(i15, org.telegram.messenger.g0.L(16.0f));
    }

    public final void a() {
        int i7;
        int i10;
        this.w = org.telegram.ui.ActionBar.m6.I;
        this.x = org.telegram.ui.ActionBar.m6.k1();
        int i11 = this.n;
        if (i11 == 0 || i11 == -1) {
            this.r = org.telegram.ui.ActionBar.m6.k1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Blue")) {
            this.r = 0;
        } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Day")) {
            this.r = 1;
        } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Night")) {
            this.r = 2;
        } else if (org.telegram.ui.ActionBar.m6.I.m().equals("Dark Blue")) {
            this.r = 3;
        } else {
            if (org.telegram.ui.ActionBar.m6.k1() && ((i10 = this.r) == 2 || i10 == 3)) {
                this.r = 0;
            }
            if (!org.telegram.ui.ActionBar.m6.k1() && ((i7 = this.r) == 0 || i7 == 1)) {
                this.r = 2;
            }
        }
        org.telegram.ui.Components.lp lpVar = this.c;
        if (lpVar.d != null) {
            for (int i12 = 0; i12 < lpVar.d.size(); i12++) {
                ((org.telegram.ui.Components.mp) lpVar.d.get(i12)).c = this.r;
            }
            lpVar.k(0, lpVar.d.size());
        }
        c();
    }

    public final void b() {
        Point point = org.telegram.messenger.g0.q;
        boolean z10 = point.y > point.x;
        Boolean bool = this.s;
        if (bool == null || bool.booleanValue() != z10) {
            f61 f61Var = this.a;
            int i7 = this.n;
            if (i7 != 0 && i7 != -1) {
                int i10 = z10 ? 3 : 9;
                v4.c0 c0Var = this.b;
                if (c0Var instanceof v4.t) {
                    ((v4.t) c0Var).y1(i10);
                } else {
                    f61Var.setHasFixedSize(false);
                    getContext();
                    v4.t tVar = new v4.t(i10);
                    tVar.O = new wt(0);
                    this.b = tVar;
                    f61Var.setLayoutManager(tVar);
                }
            } else if (this.b == null) {
                getContext();
                v4.c0 c0Var2 = new v4.c0(0, false);
                this.b = c0Var2;
                f61Var.setLayoutManager(c0Var2);
            }
            this.s = Boolean.valueOf(z10);
        }
    }

    public final void c() {
        org.telegram.ui.Components.lp lpVar = this.c;
        if (lpVar.d == null) {
            return;
        }
        this.h = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= lpVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).a.f.get(this.r)).b;
            org.telegram.ui.ActionBar.l6 i10 = ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).a.i(this.r);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.m6.I.a.equals(org.telegram.ui.ActionBar.m6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).a.f.get(this.r)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.m6.I.d0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.j6 j6Var = (org.telegram.ui.ActionBar.j6) longSparseArray.get(tL_theme.id);
                        if (j6Var != null && j6Var.a == org.telegram.ui.ActionBar.m6.I.Z) {
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
                    if (org.telegram.ui.ActionBar.m6.I.a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.r3) ((org.telegram.ui.Components.mp) lpVar.d.get(i7)).a.f.get(this.r)).e == org.telegram.ui.ActionBar.m6.I.Z) {
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
            this.h = lpVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < lpVar.d.size()) {
            ((org.telegram.ui.Components.mp) lpVar.d.get(i11)).d = i11 == this.h;
            i11++;
        }
        lpVar.E(this.h);
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

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        org.telegram.ui.ActionBar.l6 l6Var;
        org.telegram.ui.Components.oh0 oh0Var;
        if (this.c != null && (l6Var = this.w) != null && (l6Var != org.telegram.ui.ActionBar.m6.I || this.x != org.telegram.ui.ActionBar.m6.k1())) {
            a();
            if (this.e != null && (oh0Var = this.d) != null) {
                if (!oh0Var.l0) {
                    this.d.M(org.telegram.ui.ActionBar.m6.k1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(org.telegram.messenger.hd.N0(org.telegram.ui.ActionBar.m6.k1() ? 2131745270 : 2131745271, null), this.d, true);
                this.e.x += 2;
            }
        }
        int i7 = this.n;
        if (i7 == 0 || i7 == -1) {
            org.telegram.ui.Components.oh0 oh0Var2 = this.d;
            if (oh0Var2 != null) {
                oh0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.n8 n8Var = this.e;
            if (n8Var != null) {
                org.telegram.ui.ActionBar.m6.H1(n8Var.getBackground(), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.m6.q6);
            }
            if (this.f != null) {
                int x02 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.d6, false);
                int x03 = org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.i6, false);
                org.telegram.ui.Cells.y yVar = this.y;
                if (com.google.android.gms.internal.vision.e2.s(yVar) && this.f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.E) {
                        this.E = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.n8 n8Var2 = this.f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.m6.i0(x02, x03);
                    this.y = i02;
                    n8Var2.setBackground(i02);
                    this.E = x03;
                }
                org.telegram.ui.Cells.n8 n8Var3 = this.f;
                int i10 = org.telegram.ui.ActionBar.m6.q6;
                n8Var3.g(i10, i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
