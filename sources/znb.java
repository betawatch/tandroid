// default package

import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.util.SparseArray;
import java.io.File;
import java.util.ArrayList;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class znb implements fn7 {
    public int E;
    public int F;
    public TLRPC.TL_theme G;
    public boolean H;
    public String I;
    public String J;
    public TLRPC.InputFile K;
    public TLRPC.InputFile L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public boolean T;
    public boolean U;
    public boolean V;
    public byte W;
    public int X;
    public int Y;
    public int Z;
    public String a;
    public int a0;
    public String b;
    public SparseArray b0;
    public String c;
    public ArrayList c0;
    public String d;
    public LongSparseArray d0;
    public String e;
    public final LongSparseArray e0;
    public boolean f;
    public int f0;
    public int g0;
    public boolean h;
    public String h0;
    public String i0;
    public unb j0;
    public int k0;
    public boolean n;
    public int r;
    public int s;
    public int w;
    public int x;
    public int y;

    public znb(znb znbVar) {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
        this.a = znbVar.a;
        this.b = znbVar.b;
        this.c = znbVar.c;
        this.d = znbVar.d;
        this.e = znbVar.e;
        this.f = znbVar.f;
        this.h = znbVar.h;
        this.n = znbVar.n;
        this.r = znbVar.r;
        this.s = znbVar.s;
        this.w = znbVar.w;
        this.x = znbVar.x;
        this.y = znbVar.y;
        this.E = znbVar.E;
        this.F = znbVar.F;
        this.G = znbVar.G;
        this.H = znbVar.H;
        this.I = znbVar.I;
        this.J = znbVar.J;
        this.K = znbVar.K;
        this.L = znbVar.L;
        this.M = znbVar.M;
        this.N = znbVar.N;
        this.O = znbVar.O;
        this.P = znbVar.P;
        this.Q = znbVar.Q;
        this.R = znbVar.R;
        this.S = znbVar.S;
        this.T = znbVar.T;
        this.U = znbVar.U;
        this.V = znbVar.V;
        this.W = znbVar.W;
        this.X = znbVar.X;
        this.Y = znbVar.Y;
        this.Z = znbVar.Z;
        this.a0 = znbVar.a0;
        this.b0 = znbVar.b0;
        this.c0 = znbVar.c0;
        this.d0 = znbVar.d0;
        this.g0 = znbVar.g0;
        this.h0 = znbVar.h0;
        this.i0 = znbVar.i0;
        this.j0 = znbVar.j0;
    }

    public static boolean a(ynb ynbVar, TLRPC.ThemeSettings themeSettings) {
        boolean z;
        boolean z2;
        long j;
        long j2;
        long j3;
        int i;
        int i2;
        String str;
        float f;
        TLRPC.WallPaperSettings wallPaperSettings;
        int intValue = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue2 = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        if (intValue == intValue2) {
            intValue2 = 0;
        }
        int intValue3 = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        int intValue4 = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            z = false;
            z2 = true;
            j = 0;
            j2 = 0;
            j3 = 0;
            i = 0;
            i2 = 0;
        } else {
            i = aob.Y0(wallPaperSettings.background_color);
            j = themeSettings.wallpaper.settings.second_background_color == 0 ? 4294967296L : aob.Y0(r11);
            j2 = themeSettings.wallpaper.settings.third_background_color == 0 ? 4294967296L : aob.Y0(r11);
            j3 = themeSettings.wallpaper.settings.fourth_background_color != 0 ? aob.Y0(r11) : 4294967296L;
            i2 = hl.q1(themeSettings.wallpaper.settings.rotation, false);
            z = false;
            TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
            z2 = true;
            if (!(wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) && wallPaper2.pattern) {
                str = wallPaper2.slug;
                f = wallPaper2.settings.intensity / 100.0f;
                return (themeSettings.accent_color != ynbVar.c && themeSettings.outbox_accent_color == ynbVar.d && intValue == ynbVar.e && intValue2 == ynbVar.f && intValue3 == ynbVar.g && intValue4 == ynbVar.h && themeSettings.message_colors_animated == ynbVar.i && ((long) i) == ynbVar.j && j == ynbVar.k && j2 == ynbVar.l && j3 == ynbVar.m && i2 == ynbVar.n && TextUtils.equals(str, ynbVar.o) && ((double) Math.abs(f - ynbVar.p)) < 0.001d) ? z2 : z;
            }
        }
        str = null;
        f = 0.0f;
        if (themeSettings.accent_color != ynbVar.c) {
        }
    }

    public static znb e(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            znb znbVar = new znb();
            znbVar.a = jSONObject.getString("name");
            znbVar.b = jSONObject.getString("path");
            if (jSONObject.has("account")) {
                znbVar.F = jSONObject.getInt("account");
            }
            if (jSONObject.has("info")) {
                try {
                    SerializedData serializedData = new SerializedData(Utilities.v(jSONObject.getString("info")));
                    znbVar.G = TLRPC.Theme.TLdeserialize(serializedData, serializedData.readInt32(true), true);
                } catch (Throwable th) {
                    cc4.g(th, true);
                }
            }
            if (jSONObject.has("loaded")) {
                znbVar.H = jSONObject.getBoolean("loaded");
            }
            return znbVar;
        } catch (Exception e) {
            cc4.g(e, true);
            return null;
        }
    }

    public static znb f(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("\\|");
        if (split.length != 2) {
            return null;
        }
        znb znbVar = new znb();
        znbVar.a = split[0];
        znbVar.b = split[1];
        return znbVar;
    }

    public static void g(ynb ynbVar, TLRPC.ThemeSettings themeSettings) {
        TLRPC.WallPaperSettings wallPaperSettings;
        ynbVar.c = themeSettings.accent_color;
        ynbVar.d = themeSettings.outbox_accent_color;
        ynbVar.e = themeSettings.message_colors.size() > 0 ? themeSettings.message_colors.get(0).intValue() | (-16777216) : 0;
        int intValue = themeSettings.message_colors.size() > 1 ? themeSettings.message_colors.get(1).intValue() | (-16777216) : 0;
        ynbVar.f = intValue;
        if (ynbVar.e == intValue) {
            ynbVar.f = 0;
        }
        ynbVar.g = themeSettings.message_colors.size() > 2 ? themeSettings.message_colors.get(2).intValue() | (-16777216) : 0;
        ynbVar.h = themeSettings.message_colors.size() > 3 ? themeSettings.message_colors.get(3).intValue() | (-16777216) : 0;
        ynbVar.i = themeSettings.message_colors_animated;
        TLRPC.WallPaper wallPaper = themeSettings.wallpaper;
        if (wallPaper == null || (wallPaperSettings = wallPaper.settings) == null) {
            return;
        }
        if (wallPaperSettings.background_color == 0) {
            ynbVar.j = 4294967296L;
        } else {
            ynbVar.j = aob.Y0(r0);
        }
        TLRPC.WallPaperSettings wallPaperSettings2 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings2.flags & 16) == 0 || wallPaperSettings2.second_background_color != 0) {
            ynbVar.k = aob.Y0(wallPaperSettings2.second_background_color);
        } else {
            ynbVar.k = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings3 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings3.flags & 32) == 0 || wallPaperSettings3.third_background_color != 0) {
            ynbVar.l = aob.Y0(wallPaperSettings3.third_background_color);
        } else {
            ynbVar.l = 4294967296L;
        }
        TLRPC.WallPaperSettings wallPaperSettings4 = themeSettings.wallpaper.settings;
        if ((wallPaperSettings4.flags & 64) == 0 || wallPaperSettings4.fourth_background_color != 0) {
            ynbVar.m = aob.Y0(wallPaperSettings4.fourth_background_color);
        } else {
            ynbVar.m = 4294967296L;
        }
        ynbVar.n = hl.q1(themeSettings.wallpaper.settings.rotation, false);
        TLRPC.WallPaper wallPaper2 = themeSettings.wallpaper;
        if ((wallPaper2 instanceof TLRPC.TL_wallPaperNoFile) || !wallPaper2.pattern) {
            return;
        }
        ynbVar.o = wallPaper2.slug;
        TLRPC.WallPaperSettings wallPaperSettings5 = wallPaper2.settings;
        ynbVar.p = wallPaperSettings5.intensity / 100.0f;
        ynbVar.q = wallPaperSettings5.motion;
    }

    public final boolean b(File file, String str) {
        int U0;
        try {
            Bitmap d1 = hl.d1(hl.L(640.0f), hl.L(360.0f), file.getAbsolutePath(), null, 0);
            if (d1 != null && this.r != 0) {
                Bitmap createBitmap = Bitmap.createBitmap(d1.getWidth(), d1.getHeight(), d1.getConfig());
                Canvas canvas = new Canvas(createBitmap);
                int i = this.w;
                if (i != 0) {
                    U0 = hh7.g(this.r, this.s, i, this.x);
                } else {
                    int i2 = this.s;
                    int i3 = this.r;
                    if (i2 != 0) {
                        U0 = hl.w0(i3, i2);
                        GradientDrawable gradientDrawable = new GradientDrawable(yd0.c(this.y), new int[]{this.r, this.s});
                        gradientDrawable.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
                        gradientDrawable.draw(canvas);
                    } else {
                        U0 = hl.U0(i3, false);
                        canvas.drawColor(this.r);
                    }
                }
                Paint paint = new Paint(2);
                paint.setColorFilter(new PorterDuffColorFilter(U0, PorterDuff.Mode.SRC_IN));
                paint.setAlpha((int) ((this.E / 100.0f) * 255.0f));
                canvas.drawBitmap(d1, 0.0f, 0.0f, paint);
                canvas.setBitmap(null);
                d1 = createBitmap;
            }
            if (this.h) {
                d1 = Utilities.e(d1);
            }
            return gvc.c(d1, this.w != 0 ? Bitmap.CompressFormat.PNG : Bitmap.CompressFormat.JPEG, new File(str));
        } catch (Throwable th) {
            cc4.g(th, true);
            return false;
        }
    }

    public final ynb c(long j, TLRPC.ThemeSettings themeSettings, TLRPC.TL_theme tL_theme, int i, boolean z) {
        if (z) {
            LongSparseArray longSparseArray = this.e0;
            ynb ynbVar = (ynb) longSparseArray.get(j);
            if (ynbVar != null) {
                return ynbVar;
            }
            int i2 = this.f0 + 1;
            this.f0 = i2;
            ynb ynbVar2 = new ynb();
            g(ynbVar2, themeSettings);
            ynbVar2.b = this;
            ynbVar2.a = i2;
            ynbVar2.r = tL_theme;
            ynbVar2.t = i;
            longSparseArray.put(i2, ynbVar2);
            return ynbVar2;
        }
        ynb ynbVar3 = (ynb) this.d0.get(j);
        if (ynbVar3 != null) {
            return ynbVar3;
        }
        int i3 = this.g0 + 1;
        this.g0 = i3;
        ynb ynbVar4 = new ynb();
        g(ynbVar4, themeSettings);
        ynbVar4.b = this;
        ynbVar4.a = i3;
        ynbVar4.r = tL_theme;
        ynbVar4.t = i;
        this.b0.put(i3, ynbVar4);
        this.c0.add(0, ynbVar4);
        aob.H1(this);
        this.d0.put(j, ynbVar4);
        return ynbVar4;
    }

    public final ynb d(TLRPC.TL_theme tL_theme, int i, int i2) {
        if (tL_theme == null) {
            return null;
        }
        return c(tL_theme.id, i2 < tL_theme.settings.size() ? tL_theme.settings.get(i2) : null, tL_theme, i, false);
    }

    @Override // fn7
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        int i3 = jn7.Y1;
        if (i == i3 || i == jn7.Z1) {
            String str = (String) objArr[0];
            TLRPC.TL_theme tL_theme = this.G;
            if (tL_theme == null || tL_theme.document == null) {
                return;
            }
            if (str.equals(this.h0)) {
                this.h0 = null;
                Utilities.e.c(new bcb((Object) this, objArr[1], (byte) 3));
                return;
            }
            if (str.equals(xb4.r(null, this.G.document))) {
                s();
                if (i == i3) {
                    File file = new File(this.b);
                    TLRPC.TL_theme tL_theme2 = this.G;
                    znb k0 = aob.k0(file, tL_theme2.title, tL_theme2);
                    if (k0 == null || k0.c == null || new File(k0.c).exists()) {
                        r();
                        return;
                    }
                    this.r = k0.r;
                    this.s = k0.s;
                    this.w = k0.w;
                    this.x = k0.x;
                    this.y = k0.y;
                    this.h = k0.h;
                    this.E = k0.E;
                    this.i0 = k0.c;
                    TL_account.getWallPaper getwallpaper = new TL_account.getWallPaper();
                    TLRPC.TL_inputWallPaperSlug tL_inputWallPaperSlug = new TLRPC.TL_inputWallPaperSlug();
                    tL_inputWallPaperSlug.slug = k0.e;
                    getwallpaper.wallpaper = tL_inputWallPaperSlug;
                    ConnectionsManager.getInstance(k0.F).sendRequest(getwallpaper, new isa(this, k0, (byte) 13));
                }
            }
        }
    }

    public final String h(ynb ynbVar, boolean z) {
        String l;
        if (ynbVar == null) {
            ynbVar = i(false);
        }
        if (ynbVar == null) {
            String str = this.a;
            return (z ? qd4.o(str, "_wp_o") : qd4.o(str, "_wp")) + Utilities.b.nextInt() + ".jpg";
        }
        String str2 = this.a;
        if (z) {
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append("_");
            l = uh9.l(sb, ynbVar.a, "_wp_o");
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append("_");
            l = uh9.l(sb2, ynbVar.a, "_wp");
        }
        return l + Utilities.b.nextInt() + ".jpg";
    }

    public final ynb i(boolean z) {
        ynb ynbVar;
        if (this.c0 == null || (ynbVar = (ynb) this.b0.get(this.Z)) == null) {
            return null;
        }
        if (!z) {
            return ynbVar;
        }
        int i = this.g0 + 1;
        this.g0 = i;
        ynb ynbVar2 = new ynb();
        ynbVar2.c = ynbVar.c;
        ynbVar2.d = ynbVar.d;
        ynbVar2.e = ynbVar.e;
        ynbVar2.f = ynbVar.f;
        ynbVar2.g = ynbVar.g;
        ynbVar2.h = ynbVar.h;
        ynbVar2.i = ynbVar.i;
        ynbVar2.j = ynbVar.j;
        ynbVar2.k = ynbVar.k;
        ynbVar2.l = ynbVar.l;
        ynbVar2.m = ynbVar.m;
        ynbVar2.n = ynbVar.n;
        ynbVar2.o = ynbVar.o;
        ynbVar2.p = ynbVar.p;
        ynbVar2.q = ynbVar.q;
        ynbVar2.b = this;
        unb unbVar = this.j0;
        if (unbVar != null) {
            unb unbVar2 = new unb();
            unbVar2.a = "";
            unbVar2.b = "";
            unbVar2.c = "";
            unbVar2.c = unbVar.c;
            unbVar2.d = unbVar.d;
            unbVar2.e = unbVar.e;
            unbVar2.f = unbVar.f;
            unbVar2.g = unbVar.g;
            unbVar2.h = unbVar.h;
            unbVar2.i = unbVar.i;
            unbVar2.j = unbVar.j;
            unbVar2.k = unbVar.k;
            unbVar2.p = this;
            unbVar2.q = ynbVar2;
            if (TextUtils.isEmpty(unbVar.a)) {
                unbVar2.a = "";
            } else {
                try {
                    File e = gvc.e(unbVar.a);
                    String h = unbVar2.p.h(unbVar2.q, false);
                    unbVar2.a = h;
                    gvc.a(e, gvc.e(h));
                } catch (Exception e2) {
                    unbVar2.a = "";
                    cc4.g(e2, true);
                }
            }
            if (TextUtils.isEmpty(unbVar.b)) {
                unbVar2.b = "";
            } else if (unbVar.b.equals(unbVar.a)) {
                unbVar2.b = unbVar2.a;
            } else {
                try {
                    File e3 = gvc.e(unbVar.b);
                    String h2 = unbVar2.p.h(unbVar2.q, true);
                    unbVar2.b = h2;
                    gvc.a(e3, gvc.e(h2));
                } catch (Exception e4) {
                    unbVar2.b = "";
                    cc4.g(e4, true);
                }
            }
            ynbVar2.y = unbVar2;
        }
        this.a0 = this.Z;
        ynbVar2.a = i;
        this.Z = i;
        this.j0 = ynbVar2.y;
        this.b0.put(i, ynbVar2);
        this.c0.add(0, ynbVar2);
        aob.H1(this);
        return ynbVar2;
    }

    public final int j(int i) {
        ynb ynbVar = (ynb) this.b0.get(i);
        if (ynbVar != null) {
            return ynbVar.c;
        }
        return 0;
    }

    public final String k() {
        if (this.G == null) {
            return this.a;
        }
        return "remote" + this.G.id;
    }

    public final String l() {
        if ("Blue".equals(this.a)) {
            return ob6.M0(2131743839, null);
        }
        if ("Dark Blue".equals(this.a)) {
            return ob6.M0(2131743836, null);
        }
        if ("Arctic Blue".equals(this.a)) {
            return ob6.M0(2131743840, null);
        }
        if ("Day".equals(this.a)) {
            return ob6.M0(2131743835, null);
        }
        if ("Night".equals(this.a)) {
            return ob6.M0(2131743828, null);
        }
        TLRPC.TL_theme tL_theme = this.G;
        return tL_theme != null ? tL_theme.title : this.a;
    }

    public final int m() {
        if (this.T && this.Z == aob.n) {
            return -3155485;
        }
        return this.M;
    }

    public final int n() {
        if (this.T && this.Z == aob.n) {
            return -983328;
        }
        return this.S;
    }

    public final boolean o() {
        int i = this.k0;
        if (i != -1) {
            return i == 1;
        }
        if ("Dark Blue".equals(this.a) || "Night".equals(this.a)) {
            this.k0 = 1;
        } else if ("Blue".equals(this.a) || "Arctic Blue".equals(this.a) || "Day".equals(this.a)) {
            this.k0 = 0;
        }
        if (this.k0 == -1) {
            aob.G(aob.R0(new File(this.b), null, new String[1]), this);
        }
        return this.k0 == 1;
    }

    public final void p(SharedPreferences sharedPreferences, ynb ynbVar, String str) {
        try {
            String string = sharedPreferences.getString(str, null);
            if (TextUtils.isEmpty(string)) {
                return;
            }
            JSONObject jSONObject = new JSONObject(string);
            unb unbVar = new unb();
            unbVar.a = jSONObject.getString("wall");
            unbVar.b = jSONObject.getString("owall");
            unbVar.d = jSONObject.getInt("pColor");
            unbVar.e = jSONObject.getInt("pGrColor");
            unbVar.f = jSONObject.optInt("pGrColor2");
            unbVar.g = jSONObject.optInt("pGrColor3");
            unbVar.h = jSONObject.getInt("pGrAngle");
            unbVar.c = jSONObject.getString("wallSlug");
            unbVar.i = jSONObject.getBoolean("wBlur");
            unbVar.j = jSONObject.getBoolean("wMotion");
            unbVar.k = (float) jSONObject.getDouble("pIntensity");
            unbVar.p = this;
            unbVar.q = ynbVar;
            if (ynbVar != null) {
                ynbVar.y = unbVar;
            } else {
                this.j0 = unbVar;
            }
            if (jSONObject.has("wallId") && jSONObject.getLong("wallId") == 1000001) {
                unbVar.c = "d";
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    public final void q(SharedPreferences sharedPreferences) {
        ArrayList arrayList = this.c0;
        if (arrayList == null || arrayList.isEmpty()) {
            p(sharedPreferences, null, c00.k(new StringBuilder(), this.a, "_owp"));
            return;
        }
        int size = this.c0.size();
        for (int i = 0; i < size; i++) {
            ynb ynbVar = (ynb) this.c0.get(i);
            StringBuilder sb = new StringBuilder();
            sb.append(this.a);
            sb.append("_");
            p(sharedPreferences, ynbVar, uh9.l(sb, ynbVar.a, "_owp"));
        }
    }

    public final void r() {
        this.H = true;
        this.U = false;
        aob.w1(true, false);
        if (this == aob.I && aob.M == null) {
            aob.I1(this, this == aob.J, -1, null);
        }
    }

    public final void s() {
        jn7.f(this.F).n(this, jn7.Y1);
        jn7.f(this.F).n(this, jn7.Z1);
    }

    public final void t(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, int[] iArr5, int[] iArr6, int[] iArr7, int[] iArr8, String[] strArr, int[] iArr9, int[] iArr10) {
        this.X = iArr.length;
        this.c0 = new ArrayList();
        this.b0 = new SparseArray();
        this.d0 = new LongSparseArray();
        for (int i = 0; i < iArr.length; i++) {
            ynb ynbVar = new ynb();
            ynbVar.a = iArr8[i];
            if (aob.j1(ynbVar)) {
                ynbVar.z = true;
            }
            ynbVar.c = iArr[i];
            ynbVar.b = this;
            ynbVar.e = iArr2[i];
            ynbVar.f = iArr3[i];
            long j = iArr4[i];
            ynbVar.j = j;
            boolean z = this.T;
            if (z && ynbVar.a == aob.n) {
                ynbVar.j = 4294967296L;
            } else {
                ynbVar.j = j;
            }
            if (z && ynbVar.a == aob.n) {
                ynbVar.k = 4294967296L;
            } else {
                ynbVar.k = iArr5[i];
            }
            if (iArr6 != null) {
                if (z && ynbVar.a == aob.n) {
                    ynbVar.l = 4294967296L;
                } else {
                    ynbVar.l = iArr6[i];
                }
            }
            if (iArr7 != null) {
                if (z && ynbVar.a == aob.n) {
                    ynbVar.m = 4294967296L;
                } else {
                    ynbVar.m = iArr7[i];
                }
            }
            ynbVar.p = iArr10[i] / 100.0f;
            ynbVar.n = iArr9[i];
            ynbVar.o = strArr[i];
            if ((aob.j1(ynbVar) && this.a.equals("Dark Blue")) || this.a.equals("Night")) {
                ynbVar.e = -14316059;
                ynbVar.f = -12422433;
                ynbVar.g = -8304937;
                ynbVar.h = -6340950;
                if (this.a.equals("Night")) {
                    ynbVar.p = -0.57f;
                    ynbVar.j = -9666650L;
                    ynbVar.k = -13749173L;
                    ynbVar.l = -8883033L;
                    ynbVar.m = -13421992L;
                }
            }
            this.b0.put(ynbVar.a, ynbVar);
            this.c0.add(ynbVar);
        }
        this.Y = ((ynb) this.b0.get(0)).c;
    }

    public final void u(int i) {
        this.Z = i;
        ynb i2 = i(false);
        if (i2 != null) {
            this.j0 = i2.y;
        }
    }

    public final void v(unb unbVar) {
        if (this.j0 != unbVar) {
            ynb i = i(false);
            unb unbVar2 = this.j0;
            if (unbVar2 != null) {
                unbVar2.a();
            }
            if (unbVar != null) {
                unbVar.q = i;
                unbVar.p = this;
                unbVar.c();
            }
            this.j0 = unbVar;
            if (i != null) {
                i.y = unbVar;
            }
        }
    }

    public znb() {
        this.y = 45;
        this.H = true;
        this.V = true;
        this.a0 = -1;
        this.e0 = new LongSparseArray();
        this.f0 = 0;
        this.g0 = 100;
        this.k0 = -1;
    }
}
