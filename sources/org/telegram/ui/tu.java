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

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class tu extends LinearLayout {
    public final ua1 a;
    public s4.b0 b;
    public final org.telegram.ui.Components.up c;
    public final org.telegram.ui.Components.uj0 d;
    public final org.telegram.ui.Cells.q8 e;
    public final org.telegram.ui.Cells.q8 f;
    public ValueAnimator h;
    public int n;
    public int r;
    public final int s;
    public int v;
    public Boolean w;

    public tu(int i10, Context context, org.telegram.ui.ActionBar.n2 n2Var) {
        super(context);
        s4.b0 b0Var;
        org.telegram.ui.ActionBar.d6 d6Var = null;
        this.b = null;
        this.r = -1;
        this.w = null;
        this.s = i10;
        setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        addView(frameLayout, w7.z5.c(-2.0f, -1));
        org.telegram.ui.Components.up upVar = new org.telegram.ui.Components.up(n2Var.getCurrentAccount(), 0L, null, (i10 == 0 || i10 == -1) ? 0 : 1);
        this.c = upVar;
        ua1 ua1Var = new ua1(getContext(), 8, d6Var);
        this.a = ua1Var;
        ua1Var.setAdapter(upVar);
        ua1Var.setSelectorDrawableColor(0);
        ua1Var.setClipChildren(false);
        ua1Var.setClipToPadding(false);
        ua1Var.setHasFixedSize(true);
        ua1Var.setItemAnimator(null);
        ua1Var.setNestedScrollingEnabled(false);
        c();
        ua1Var.setFocusable(false);
        ua1Var.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
        ua1Var.setOnItemClickListener(new ci.x4(15, this, n2Var));
        org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getContext(), null);
        b10Var.setViewType(14);
        b10Var.setVisibility(0);
        if (i10 == 0 || i10 == -1) {
            frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ua1Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        } else {
            frameLayout.addView(b10Var, w7.z5.d(-1, 104.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
            frameLayout.addView(ua1Var, w7.z5.d(-1, -2.0f, 8388611, 0.0f, 8.0f, 0.0f, 8.0f));
        }
        ua1Var.setEmptyView(b10Var);
        ua1Var.W1 = true;
        ua1Var.X1 = 0;
        if (i10 == 0) {
            org.telegram.ui.Components.uj0 uj0Var = new org.telegram.ui.Components.uj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.d = uj0Var;
            uj0Var.h = true;
            uj0Var.Z = true;
            uj0Var.o();
            org.telegram.ui.Cells.q8 q8Var = new org.telegram.ui.Cells.q8(context);
            this.e = q8Var;
            q8Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), 2, -1));
            q8Var.w = 21;
            addView(q8Var, w7.z5.c(-2.0f, -1));
            org.telegram.ui.Cells.q8 q8Var2 = new org.telegram.ui.Cells.q8(context);
            this.f = q8Var2;
            q8Var2.m(R.drawable.msg_colors, LocaleController.getString(R.string.SettingsBrowseThemes), false);
            addView(q8Var2, w7.z5.c(-2.0f, -1));
            q8Var.setOnClickListener(new ru(this, context, n2Var));
            uj0Var.h = true;
            q8Var2.setOnClickListener(new a(n2Var, 17));
            if (org.telegram.ui.ActionBar.h6.g1()) {
                q8Var.n(LocaleController.getString(R.string.SettingsSwitchToNightMode), uj0Var, true);
            } else {
                uj0Var.M(uj0Var.e[0] - 1);
                q8Var.n(LocaleController.getString(R.string.SettingsSwitchToDayMode), uj0Var, true);
            }
        }
        if (!MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes.isEmpty()) {
            ArrayList arrayList = new ArrayList(MediaDataController.getInstance(n2Var.getCurrentAccount()).defaultEmojiThemes);
            if (i10 == 0) {
                org.telegram.ui.ActionBar.c4 c4Var = new org.telegram.ui.ActionBar.c4(n2Var.getCurrentAccount());
                c4Var.e = "🎨";
                c4Var.c = gg.b.d("🎨");
                c4Var.d = TLRPC.ChatTheme.ofEmoticon(c4Var.e);
                SharedPreferences sharedPreferences = ApplicationLoader.applicationContext.getSharedPreferences("themeconfig", 0);
                String string = sharedPreferences.getString("lastDayCustomTheme", null);
                int i11 = sharedPreferences.getInt("lastDayCustomThemeAccentId", -1);
                int i12 = 99;
                String str = "Blue";
                if (string == null || org.telegram.ui.ActionBar.h6.O0(string) == null) {
                    string = sharedPreferences.getString("lastDayTheme", "Blue");
                    org.telegram.ui.ActionBar.g6 O0 = org.telegram.ui.ActionBar.h6.O0(string);
                    if (O0 == null) {
                        i11 = 99;
                        string = "Blue";
                    } else {
                        i11 = O0.Y;
                    }
                    sharedPreferences.edit().putString("lastDayCustomTheme", string).apply();
                } else if (i11 == -1) {
                    i11 = org.telegram.ui.ActionBar.h6.O0(string).f0;
                }
                if (i11 != -1) {
                    str = string;
                    i12 = i11;
                }
                String string2 = sharedPreferences.getString("lastDarkCustomTheme", null);
                int i13 = sharedPreferences.getInt("lastDarkCustomThemeAccentId", -1);
                String str2 = "Dark Blue";
                if (string2 == null || org.telegram.ui.ActionBar.h6.O0(string2) == null) {
                    string2 = sharedPreferences.getString("lastDarkTheme", "Dark Blue");
                    org.telegram.ui.ActionBar.g6 O02 = org.telegram.ui.ActionBar.h6.O0(string2);
                    if (O02 == null) {
                        i13 = 0;
                        string2 = "Dark Blue";
                    } else {
                        i13 = O02.Y;
                    }
                    sharedPreferences.edit().putString("lastDarkCustomTheme", string2).apply();
                } else if (i13 == -1) {
                    i13 = org.telegram.ui.ActionBar.h6.O0(str).f0;
                }
                if (i13 == -1) {
                    i13 = 0;
                } else {
                    str2 = string2;
                }
                org.telegram.ui.ActionBar.b4 b4Var = new org.telegram.ui.ActionBar.b4();
                b4Var.a = org.telegram.ui.ActionBar.h6.O0(str);
                b4Var.e = i12;
                c4Var.f.add(b4Var);
                c4Var.f.add(null);
                org.telegram.ui.ActionBar.b4 b4Var2 = new org.telegram.ui.ActionBar.b4();
                b4Var2.a = org.telegram.ui.ActionBar.h6.O0(str2);
                b4Var2.e = i13;
                c4Var.f.add(b4Var2);
                c4Var.f.add(null);
                c4Var.m(n2Var.getCurrentAccount());
                org.telegram.ui.Components.vp vpVar = new org.telegram.ui.Components.vp(c4Var);
                vpVar.c = org.telegram.ui.ActionBar.h6.g1() ? 0 : 2;
                arrayList.add(vpVar);
            }
            upVar.d = arrayList;
            upVar.l();
        }
        b();
        d();
        a();
        int i14 = this.r;
        if (i14 < 0 || (b0Var = this.b) == null) {
            return;
        }
        b0Var.h1(i14, AndroidUtilities.dp(16.0f));
    }

    public final void a() {
        int i10 = this.s;
        if (i10 == 0 || i10 == -1) {
            org.telegram.ui.Components.uj0 uj0Var = this.d;
            if (uj0Var != null) {
                uj0Var.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.q6, false), PorterDuff.Mode.SRC_IN));
            }
            org.telegram.ui.Cells.q8 q8Var = this.e;
            if (q8Var != null) {
                org.telegram.ui.ActionBar.h6.C1(q8Var.getBackground(), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false), true);
                q8Var.e(-1, org.telegram.ui.ActionBar.h6.q6);
            }
            org.telegram.ui.Cells.q8 q8Var2 = this.f;
            if (q8Var2 != null) {
                q8Var2.setBackground(org.telegram.ui.ActionBar.h6.h0(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.i6, false)));
                int i11 = org.telegram.ui.ActionBar.h6.q6;
                q8Var2.e(i11, i11);
            }
        }
    }

    public final void b() {
        int i10;
        int i11;
        int i12 = this.s;
        if (i12 == 0 || i12 == -1) {
            this.v = org.telegram.ui.ActionBar.h6.g1() ? 0 : 2;
        } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Blue")) {
            this.v = 0;
        } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Day")) {
            this.v = 1;
        } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Night")) {
            this.v = 2;
        } else if (org.telegram.ui.ActionBar.h6.I.m().equals("Dark Blue")) {
            this.v = 3;
        } else {
            if (org.telegram.ui.ActionBar.h6.g1() && ((i11 = this.v) == 2 || i11 == 3)) {
                this.v = 0;
            }
            if (!org.telegram.ui.ActionBar.h6.g1() && ((i10 = this.v) == 0 || i10 == 1)) {
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
        d();
    }

    public final void c() {
        Point point = AndroidUtilities.displaySize;
        boolean z10 = point.y > point.x;
        Boolean bool = this.w;
        if (bool == null || bool.booleanValue() != z10) {
            ua1 ua1Var = this.a;
            int i10 = this.s;
            if (i10 != 0 && i10 != -1) {
                int i11 = z10 ? 3 : 9;
                s4.b0 b0Var = this.b;
                if (b0Var instanceof s4.s) {
                    ((s4.s) b0Var).y1(i11);
                } else {
                    ua1Var.setHasFixedSize(false);
                    getContext();
                    s4.s sVar = new s4.s(i11);
                    sVar.O = new su(0);
                    this.b = sVar;
                    ua1Var.setLayoutManager(sVar);
                }
            } else if (this.b == null) {
                getContext();
                s4.b0 b0Var2 = new s4.b0(0, false);
                this.b = b0Var2;
                ua1Var.setLayoutManager(b0Var2);
            }
            this.w = Boolean.valueOf(z10);
        }
    }

    public final void d() {
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
            TLRPC.TL_theme tL_theme = ((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.f.get(this.v)).b;
            org.telegram.ui.ActionBar.g6 i11 = ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.i(this.v);
            if (tL_theme != null) {
                if (org.telegram.ui.ActionBar.h6.I.a.equals(org.telegram.ui.ActionBar.h6.r0(tL_theme.settings.get(((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.f.get(this.v)).d)))) {
                    LongSparseArray longSparseArray = org.telegram.ui.ActionBar.h6.I.c0;
                    if (longSparseArray != null) {
                        org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) longSparseArray.get(tL_theme.id);
                        if (f6Var != null && f6Var.a == org.telegram.ui.ActionBar.h6.I.Y) {
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
                    if (org.telegram.ui.ActionBar.h6.I.a.equals(i11.m())) {
                        if (((org.telegram.ui.ActionBar.b4) ((org.telegram.ui.Components.vp) upVar.d.get(i10)).a.f.get(this.v)).e == org.telegram.ui.ActionBar.h6.I.Y) {
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
        c();
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
        super.setBackgroundColor(i10);
        a();
    }
}
