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

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class tt extends LinearLayout implements org.telegram.ui.ActionBar.a6 {
    public boolean D;
    public org.telegram.ui.Cells.y E;
    public int F;
    public final e61 a;
    public v4.b0 b;
    public final org.telegram.ui.Components.to c;
    public final org.telegram.ui.Components.zg0 d;
    public final org.telegram.ui.Cells.m8 e;
    public final org.telegram.ui.Cells.m8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int w;
    public Boolean x;
    public org.telegram.ui.ActionBar.j6 y;

    public tt(int i7, Context context, org.telegram.ui.ActionBar.f2 f2Var) {
        super(context);
        v4.b0 b0Var;
        org.telegram.ui.ActionBar.f6 f6Var = null;
        this.b = null;
        this.r = -1;
        this.x = null;
        this.s = i7;
        int i10 = 1;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, c8.ha.c(-2.0f, -1));
        org.telegram.ui.Components.to toVar = new org.telegram.ui.Components.to(f2Var.getCurrentAccount(), 0L, null, (i7 == 0 || i7 == -1) ? 0 : 1);
        this.c = toVar;
        e61 e61Var = new e61(9, getContext(), f6Var);
        this.a = e61Var;
        e61Var.setAdapter(toVar);
        e61Var.setSelectorDrawableColor(0);
        e61Var.setClipChildren(false);
        e61Var.setClipToPadding(false);
        e61Var.setHasFixedSize(true);
        e61Var.setItemAnimator(null);
        e61Var.setNestedScrollingEnabled(false);
        b();
        e61Var.setFocusable(false);
        e61Var.setPadding(org.telegram.messenger.g0.L(12.0f), 0, org.telegram.messenger.g0.L(12.0f), 0);
        e61Var.setOnItemClickListener(new di.p4(16, this, f2Var));
        org.telegram.ui.Components.lz lzVar = new org.telegram.ui.Components.lz(getContext(), null);
        lzVar.setViewType(14);
        lzVar.setVisibility(0);
        if (i7 == 0 || i7 == -1) {
            frameLayout.addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(e61Var, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(lzVar, c8.ha.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(e61Var, c8.ha.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        e61Var.setEmptyView(lzVar);
        e61Var.W1 = true;
        e61Var.X1 = 0;
        if (i7 == 0) {
            org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(R.raw.sun_outline, org.telegram.messenger.g0.L(28.0f), org.telegram.messenger.g0.L(28.0f), true, null);
            this.d = zg0Var;
            zg0Var.h = true;
            zg0Var.Z = true;
            zg0Var.o();
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            this.e = m8Var;
            int i11 = org.telegram.ui.ActionBar.k6.i6;
            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.k6.h0(org.telegram.ui.ActionBar.k6.x0(null, i11, false), 2, -1);
            org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i11);
            m8Var.setBackground(h02);
            org.telegram.ui.ActionBar.r6.k(m8Var, h02, null, N, null);
            addView(m8Var, c8.ha.c(-2.0f, -1));
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            this.f = m8Var2;
            m8Var2.o(R.drawable.msg_colors, org.telegram.messenger.hd.M0(2131745492, null), false);
            addView(m8Var2, c8.ha.c(-2.0f, -1));
            m8Var.setOnClickListener(new org.telegram.ui.Components.xd(i10, this, context, f2Var));
            zg0Var.h = true;
            m8Var2.setOnClickListener(new a(f2Var, 18));
            if (org.telegram.ui.ActionBar.k6.k1()) {
                m8Var.p(org.telegram.messenger.hd.M0(2131745467, null), zg0Var, true);
                m8Var.x += 2;
            } else {
                zg0Var.M(zg0Var.e[0] - 1);
                m8Var.p(org.telegram.messenger.hd.M0(2131745468, null), zg0Var, true);
                m8Var.x += 2;
            }
        }
        if (!org.telegram.messenger.ui.b0(f2Var.getCurrentAccount()).A0.isEmpty()) {
            ArrayList arrayList = new ArrayList(org.telegram.messenger.ui.b0(f2Var.getCurrentAccount()).A0);
            if (i7 == 0) {
                org.telegram.ui.ActionBar.r3 r3Var = new org.telegram.ui.ActionBar.r3(f2Var.getCurrentAccount());
                r3Var.e = "🎨";
                r3Var.c = ig.b.d("🎨");
                r3Var.d = TLRPC.ChatTheme.ofEmoticon(r3Var.e);
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
                        i12 = Q0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i12 == -1) {
                    i12 = org.telegram.ui.ActionBar.k6.Q0(string).f0;
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
                        i14 = Q02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i14 == -1) {
                    i14 = org.telegram.ui.ActionBar.k6.Q0(str).f0;
                }
                if (i14 == -1) {
                    i14 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.q3 q3Var = new org.telegram.ui.ActionBar.q3();
                q3Var.a = org.telegram.ui.ActionBar.k6.Q0(str);
                q3Var.e = i13;
                r3Var.f.add(q3Var);
                r3Var.f.add(null);
                org.telegram.ui.ActionBar.q3 q3Var2 = new org.telegram.ui.ActionBar.q3();
                q3Var2.a = org.telegram.ui.ActionBar.k6.Q0(str2);
                q3Var2.e = i14;
                r3Var.f.add(q3Var2);
                r3Var.f.add(null);
                r3Var.m(f2Var.getCurrentAccount());
                org.telegram.ui.Components.uo uoVar = new org.telegram.ui.Components.uo(r3Var);
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
        int i7;
        int i10;
        this.y = org.telegram.ui.ActionBar.k6.I;
        this.D = org.telegram.ui.ActionBar.k6.k1();
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
            if (!org.telegram.ui.ActionBar.k6.k1() && ((i7 = this.w) == 0 || i7 == 1)) {
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
        boolean z9 = point.y > point.x;
        Boolean bool = this.x;
        if (bool == null || bool.booleanValue() != z9) {
            e61 e61Var = this.a;
            int i7 = this.s;
            if (i7 != 0 && i7 != -1) {
                int i10 = z9 ? 3 : 9;
                v4.b0 b0Var = this.b;
                if (b0Var instanceof v4.s) {
                    ((v4.s) b0Var).y1(i10);
                } else {
                    e61Var.setHasFixedSize(false);
                    getContext();
                    v4.s sVar = new v4.s(i10);
                    sVar.O = new st(0);
                    this.b = sVar;
                    e61Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                v4.b0 b0Var2 = new v4.b0(0, false);
                this.b = b0Var2;
                e61Var.setLayoutManager(b0Var2);
            }
            this.x = Boolean.valueOf(z9);
        }
    }

    public final void c() {
        org.telegram.ui.Components.to toVar = this.c;
        if (toVar.d == null) {
            return;
        }
        this.r = -1;
        int i7 = 0;
        while (true) {
            if (i7 >= toVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.q3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).a.f.get(this.w)).b;
            org.telegram.ui.ActionBar.j6 i10 = ((org.telegram.ui.Components.uo) toVar.d.get(i7)).a.i(this.w);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.k6.I.a.equals(org.telegram.ui.ActionBar.k6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.q3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).a.f.get(this.w)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.k6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) longSparseArray.get(tL_theme.id);
                        if (h6Var != null && h6Var.a == org.telegram.ui.ActionBar.k6.I.Y) {
                            this.r = i7;
                            break;
                        }
                    } else {
                        this.r = i7;
                        break;
                    }
                } else {
                    continue;
                }
                i7++;
            } else {
                if (i10 != null) {
                    if (org.telegram.ui.ActionBar.k6.I.a.equals(i10.m())) {
                        if (((org.telegram.ui.ActionBar.q3) ((org.telegram.ui.Components.uo) toVar.d.get(i7)).a.f.get(this.w)).e == org.telegram.ui.ActionBar.k6.I.Y) {
                            this.r = i7;
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
    public final void onMeasure(int i7, int i10) {
        b();
        super.onMeasure(i7, i10);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i7) {
        super.setBackgroundColor(i7);
        updateColors();
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final void updateColors() {
        org.telegram.ui.ActionBar.j6 j6Var;
        org.telegram.ui.Components.zg0 zg0Var;
        if (this.c != null && (j6Var = this.y) != null && (j6Var != org.telegram.ui.ActionBar.k6.I || this.D != org.telegram.ui.ActionBar.k6.k1())) {
            a();
            if (this.e != null && (zg0Var = this.d) != null) {
                if (!zg0Var.k0) {
                    this.d.M(org.telegram.ui.ActionBar.k6.k1() ? 0 : this.d.e[0] - 1);
                }
                this.e.p(org.telegram.messenger.hd.M0(org.telegram.ui.ActionBar.k6.k1() ? 2131745467 : 2131745468, null), this.d, true);
                this.e.x += 2;
            }
        }
        int i7 = this.s;
        if (i7 == 0 || i7 == -1) {
            org.telegram.ui.Components.zg0 zg0Var2 = this.d;
            if (zg0Var2 != null) {
                zg0Var2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.m8 m8Var = this.e;
            if (m8Var != null) {
                org.telegram.ui.ActionBar.k6.H1(m8Var.getBackground(), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false), true);
                this.e.g(-1, org.telegram.ui.ActionBar.k6.q6);
            }
            if (this.f != null) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.d6, false);
                int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.i6, false);
                org.telegram.ui.Cells.y yVar = this.E;
                if (com.google.android.recaptcha.internal.a.u(yVar) && this.f.getBackground() == yVar && yVar.getNumberOfLayers() > 0 && (yVar.getDrawable(0) instanceof ColorDrawable)) {
                    ((ColorDrawable) yVar.getDrawable(0)).setColor(x02);
                    if (x03 != this.F) {
                        this.F = x03;
                        yVar.setColor(ColorStateList.valueOf(x03));
                    }
                } else {
                    org.telegram.ui.Cells.m8 m8Var2 = this.f;
                    org.telegram.ui.Cells.y i02 = org.telegram.ui.ActionBar.k6.i0(x02, x03);
                    this.E = i02;
                    m8Var2.setBackground(i02);
                    this.F = x03;
                }
                org.telegram.ui.Cells.m8 m8Var3 = this.f;
                int i10 = org.telegram.ui.ActionBar.k6.q6;
                m8Var3.g(i10, i10);
            }
        }
    }

    @Override // org.telegram.ui.ActionBar.a6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
