package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class uu extends LinearLayout {
    public final wa1 a;
    public f2.j0 b;
    public final org.telegram.ui.Components.ep c;
    public final org.telegram.ui.Components.xi0 d;
    public final org.telegram.ui.Cells.m8 e;
    public final org.telegram.ui.Cells.m8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;

    public uu(int i10, Context context, org.telegram.ui.ActionBar.o2 o2Var) {
        super(context);
        f2.j0 j0Var;
        org.telegram.ui.ActionBar.c6 c6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, i7.f6.c(-2.0f, -1));
        org.telegram.ui.Components.ep epVar = new org.telegram.ui.Components.ep(o2Var.getCurrentAccount(), (i10 == 0 || i10 == -1) ? 0 : 1, null);
        this.c = epVar;
        wa1 wa1Var = new wa1(getContext(), 7, c6Var);
        this.a = wa1Var;
        wa1Var.setAdapter(epVar);
        wa1Var.setSelectorDrawableColor(0);
        wa1Var.setClipChildren(false);
        wa1Var.setClipToPadding(false);
        wa1Var.setHasFixedSize(true);
        wa1Var.setItemAnimator(null);
        wa1Var.setNestedScrollingEnabled(false);
        c();
        wa1Var.setFocusable(false);
        wa1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        wa1Var.setOnItemClickListener(new eg.w0(16, this, o2Var));
        org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(getContext(), null);
        p00Var.setViewType(14);
        p00Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(p00Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wa1Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(p00Var, i7.f6.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(wa1Var, i7.f6.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        wa1Var.setEmptyView(p00Var);
        wa1Var.U1 = true;
        wa1Var.V1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.xi0 xi0Var = new org.telegram.ui.Components.xi0(R.raw.sun_outline, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = xi0Var;
            xi0Var.h = true;
            xi0Var.W = true;
            xi0Var.m();
            org.telegram.ui.Cells.m8 m8Var = new org.telegram.ui.Cells.m8(context);
            this.e = m8Var;
            m8Var.setBackground(org.telegram.ui.ActionBar.g6.f0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), 2, -1));
            m8Var.w = 21;
            addView(m8Var, i7.f6.c(-2.0f, -1));
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context);
            this.f = m8Var2;
            m8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(m8Var2, i7.f6.c(-2.0f, -1));
            m8Var.setOnClickListener(new tu(this, context, o2Var));
            xi0Var.h = true;
            m8Var2.setOnClickListener(new a(o2Var, 18));
            if (org.telegram.ui.ActionBar.g6.f1()) {
                m8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), xi0Var, true);
            } else {
                xi0Var.K(xi0Var.e[0] - 1);
                m8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), xi0Var, true);
            }
        }
        if (!MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(o2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4(o2Var.getCurrentAccount());
                b4Var.e = "🎨";
                b4Var.c = qf.b.d("🎨");
                b4Var.d = TLRPC.ChatTheme.ofEmoticon(b4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i11 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i12 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.g6.N0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.f6 N0 = org.telegram.ui.ActionBar.g6.N0(string);
                    if (N0 == null) {
                        string = "Blue";
                        i11 = 99;
                    } else {
                        i11 = N0.U;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.g6.N0(string).b0;
                }
                if (i11 != -1) {
                    str = string;
                    i12 = i11;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.g6.N0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.f6 N02 = org.telegram.ui.ActionBar.g6.N0(string2);
                    if (N02 == null) {
                        string2 = "Dark Blue";
                        i13 = 0;
                    } else {
                        i13 = N02.U;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.g6.N0(str).b0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.a4 a4Var = new org.telegram.ui.ActionBar.a4();
                a4Var.a = org.telegram.ui.ActionBar.g6.N0(str);
                a4Var.e = i12;
                b4Var.f.add(a4Var);
                b4Var.f.add(null);
                org.telegram.ui.ActionBar.a4 a4Var2 = new org.telegram.ui.ActionBar.a4();
                a4Var2.a = org.telegram.ui.ActionBar.g6.N0(str2);
                a4Var2.e = i13;
                b4Var.f.add(a4Var2);
                b4Var.f.add(null);
                b4Var.n(o2Var.getCurrentAccount());
                org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(b4Var);
                fpVar.c = org.telegram.ui.ActionBar.g6.f1() ? 0 : 2;
                arrayList.add(fpVar);
            }
            epVar.d = arrayList;
            epVar.l();
        }
        b();
        d();
        a();
        int i14 = this.r;
        if (i14 < 0 || (j0Var = this.b) == null) {
            return;
        }
        j0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.xi0 xi0Var = this.d;
            if (xi0Var != null) {
                xi0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.m8 m8Var = this.e;
            if (m8Var != null) {
                org.telegram.ui.ActionBar.g6.B1(m8Var.getBackground(), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false), true);
                m8Var.e(-1, org.telegram.ui.ActionBar.g6.q6);
            }
            org.telegram.ui.Cells.m8 m8Var2 = this.f;
            if (m8Var2 != null) {
                m8Var2.setBackground(org.telegram.ui.ActionBar.g6.g0(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.d6, false), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.i6, false)));
                int i11 = org.telegram.ui.ActionBar.g6.q6;
                m8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.g6.f1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.g6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.g6.f1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.g6.f1() && ((i10 = this.v) == 0 || i10 == 1)) {
                this.v = 2;
            }
        }
        org.telegram.ui.Components.ep epVar = this.c;
        if (epVar.d != null) {
            for (int i13 = 0; i13 < epVar.d.size(); i13++) {
                ((org.telegram.ui.Components.fp) epVar.d.get(i13)).c = this.v;
            }
            epVar.q(0, epVar.d.size());
        }
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z10) {
            wa1 wa1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                f2.j0 j0Var = this.b;
                if (j0Var instanceof f2.w) {
                    ((f2.w) j0Var).y1(i11);
                } else {
                    wa1Var.setHasFixedSize(false);
                    getContext();
                    f2.w wVar = new f2.w(i11);
                    wVar.O = new f2.t(1);
                    this.b = wVar;
                    wa1Var.setLayoutManager(wVar);
                }
            } else if (this.b == null) {
                getContext();
                f2.j0 j0Var2 = new f2.j0(0, false);
                this.b = j0Var2;
                wa1Var.setLayoutManager(j0Var2);
            }
            this.w = Boolean.valueOf(z10);
        }
    }

    public final void d() {
        org.telegram.ui.Components.ep epVar = this.c;
        if (epVar.d == null) {
            return;
        }
        this.r = -1;
        int i10 = 0;
        while (true) {
            if (i10 >= epVar.d.size()) {
                break;
            }
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.fp) epVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.f6 j10 = ((org.telegram.ui.Components.fp) epVar.d.get(i10)).a.j(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.g6.I.a.equals(org.telegram.ui.ActionBar.g6.q0(tL_theme.settings.get(((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.fp) epVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.g6.I.Y;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) longSparseArray.get(tL_theme.id);
                        if (e6Var != null && e6Var.a == org.telegram.ui.ActionBar.g6.I.U) {
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
                if (j10 != null) {
                    if (org.telegram.ui.ActionBar.g6.I.a.equals(j10.m())) {
                        if (((org.telegram.ui.ActionBar.a4) ((org.telegram.ui.Components.fp) epVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.g6.I.U) {
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
            this.r = epVar.d.size() - 1;
        }
        int i11 = 0;
        while (i11 < epVar.d.size()) {
            ((org.telegram.ui.Components.fp) epVar.d.get(i11)).d = i11 == this.r;
            i11++;
        }
        epVar.E(this.r);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        a();
    }
}
