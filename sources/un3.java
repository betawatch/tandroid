// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.Log;
import android.view.ViewParent;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.InputMethodManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.a;
import org.telegram.ui.Components.d;
import org.telegram.ui.Dictation.DictationAsr;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class un3 implements uo3 {
    public static final d53 I0 = new d53(0.3d, 0.0d, 0.2d, 1.0d);
    public ValueAnimator A0;
    public qu1 E0;
    public ap3 F;
    public float F0;
    public vo3 G;
    public ValueAnimator G0;
    public wm3 H;
    public int I;
    public String J;
    public boolean L;
    public int N;
    public boolean O;
    public float P;
    public float Q;
    public long R;
    public float T;
    public long U;
    public long V;
    public long W;
    public boolean X;
    public ln Y;
    public lo3 a;
    public va2 a0;
    public long b;
    public float b0;
    public float c;
    public ValueAnimator c0;
    public boolean d;
    public ln e;
    public final d f;
    public boolean f0;
    public final Context h;
    public float[] h0;
    public float[] i0;
    public int j0;
    public String l0;
    public final ylb n;
    public int n0;
    public boolean o0;
    public long p0;
    public long q0;
    public long r0;
    public xn3 s;
    public ko3 w;
    public LinearGradient w0;
    public boolean x0;
    public float y0;
    public byte r = 0;
    public final zn3 x = new zn3();
    public final RectF y = new RectF();
    public final int[] E = new int[2];
    public vm3 K = wm3.c;
    public String M = "";
    public long S = -100000;
    public final RectF Z = new RectF();
    public int d0 = -6440822;
    public final wa3 e0 = new wa3((byte) 14);
    public final b7 g0 = new b7(this, 18);
    public final nn3 k0 = new nn3(this, 8);
    public final nn3 m0 = new nn3(this, 9);
    public final o1 s0 = new o1(this, 21);
    public final nn3 t0 = new nn3(this, 10);
    public final nn3 u0 = new nn3(this, 11);
    public final nn3 v0 = new nn3(this, 0);
    public final Matrix z0 = new Matrix();
    public final int[] B0 = new int[2];
    public final int[] C0 = new int[2];
    public final float[] D0 = new float[2];
    public final ks H0 = new ks(this, 2);

    public un3(Context context, d dVar) {
        this.h = context;
        this.f = dVar;
        this.n = dVar.a.L4;
    }

    public static void G(TLRPC.TL_error tL_error) {
        c41 Y = c41.Y();
        if (Y == null) {
            return;
        }
        if (tL_error == null) {
            Log.d("Dictation", "style request failed (no error from the server)");
        } else if ("AICOMPOSE_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text) || "SUMMARY_FLOOD_PREMIUM".equalsIgnoreCase(tL_error.text)) {
            Y.I(R.raw.star_premium_2, jb6.M0(2131754989, null), gm.S2(jb6.M0(2131754990, null))).j();
        } else {
            Y.g0(tL_error, false);
        }
    }

    public static String H(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        gn3 L = DictationAsr.L(language);
        return (L == null || L.d(language).length < 2) ? r(str) : N(DictationAsr.g0(L, language));
    }

    public static String N(String str) {
        String O = O(str);
        if (O == null) {
            return r(str);
        }
        return r(str) + " (" + O + ")";
    }

    public static String O(String str) {
        String str2;
        String[] split = str.split("-");
        if (split.length < 2) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Language");
        for (String str3 : split) {
            sb.append(h(str3));
        }
        String K0 = jb6.K0(sb.toString());
        if (!TextUtils.isEmpty(K0)) {
            return K0;
        }
        Locale locale = jb6.D0().y;
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        boolean z = true;
        for (int i = 1; i < split.length; i++) {
            if (split[i].matches("[A-Za-z]{4}")) {
                str2 = new Locale.Builder().setScript(split[i]).build().getDisplayScript(locale);
            } else {
                if (split[i].matches("[A-Za-z]{2}|[0-9]{3}")) {
                    str2 = new Locale.Builder().setRegion(split[i]).build().getDisplayCountry(locale);
                }
                str2 = null;
            }
            if (TextUtils.isEmpty(str2) || str2.equalsIgnoreCase(split[i])) {
                z = false;
            }
            if (i > 1) {
                sb2.append(", ");
                sb3.append(", ");
            }
            if (str2 != null && !str2.isEmpty()) {
                sb2.append(str2.substring(0, 1).toUpperCase(locale));
                sb2.append(str2.substring(1));
            }
            sb3.append(h(split[i]));
        }
        return z ? sb2.toString() : sb3.toString();
    }

    public static String h(String str) {
        if (str.isEmpty()) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        String substring = str.substring(0, 1);
        Locale locale = Locale.ROOT;
        sb.append(substring.toUpperCase(locale));
        sb.append(str.substring(1).toLowerCase(locale));
        return sb.toString();
    }

    public static String r(String str) {
        String language = Locale.forLanguageTag(str.replace('_', '-')).getLanguage();
        Locale locale = jb6.D0().y;
        String displayLanguage = locale != null ? new Locale(language).getDisplayLanguage(locale) : null;
        if (displayLanguage == null || displayLanguage.isEmpty() || displayLanguage.equalsIgnoreCase(language)) {
            String K0 = s1c.K0(language);
            return K0 != null ? K0 : language;
        }
        return displayLanguage.substring(0, 1).toUpperCase(locale) + displayLanguage.substring(1);
    }

    public static int v(int i, int i2, boolean z) {
        int i3 = i | (-16777216);
        int i4 = i2 | (-16777216);
        int i5 = i3;
        for (int i6 = 1; i6 <= 20 && on2.g(i5, i4) < 4.5d; i6++) {
            i5 = on2.f(i6 * 0.04f, i3, z ? -1 : -16777216);
        }
        return i5;
    }

    public final void A(String str) {
        vo3 vo3Var;
        DictationAsr.Z(str);
        DictationAsr.s(DictationAsr.L(str));
        this.w.setLanguage(H(str));
        if (this.r != 1 || (vo3Var = this.G) == null) {
            return;
        }
        vo3Var.j(str);
    }

    public final void B() {
        Log.d("Dictation", "send from listening (" + x() + " chars)");
        vo3 vo3Var = this.G;
        if (vo3Var != null) {
            vo3Var.c();
        }
        this.G = null;
        gm.r(this.s0);
        this.F.a();
        this.s.setStopIsland(false);
        d dVar = this.f;
        dVar.a.O1(null, true);
        D(false);
        this.P = 0.0f;
        this.w.setIsland(false);
        this.w.setSettings(false);
        this.w.setStopMode(false);
        E();
        C(false);
        this.r = (byte) 0;
        this.b0 = 0.0f;
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        dVar.d(0.0f);
        this.s.e();
        dVar.b();
        dVar.a.w1();
    }

    public final void C(boolean z) {
        ChatActivityEnterView chatActivityEnterView = this.f.a;
        sy1 sy1Var = chatActivityEnterView.F0;
        if (sy1Var == null || !z) {
            return;
        }
        chatActivityEnterView.F1 = false;
        if (sy1Var != null) {
            sy1Var.invalidate();
        }
    }

    public final void D(boolean z) {
        if (z) {
            this.b = 0L;
        }
        this.X = z;
        va2 va2Var = this.a0;
        if (va2Var != null) {
            va2Var.invalidate();
        }
    }

    public final void E() {
        qu1 qu1Var;
        yv1 yv1Var = this.f.a.F3;
        vr1 vr1Var = yv1Var != null ? yv1Var.A0 : null;
        if (vr1Var == null || (qu1Var = this.E0) == null) {
            return;
        }
        if (qu1Var != vr1Var) {
            ks ksVar = this.H0;
            if (qu1Var != null) {
                qu1Var.r0(ksVar);
            }
            this.E0 = vr1Var;
            vr1Var.i(ksVar);
        }
        ValueAnimator valueAnimator = this.G0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F0, 0.0f);
        this.G0 = ofFloat;
        ofFloat.addUpdateListener(new on3(this, (byte) 2));
        this.G0.addListener(new kh2(this, (byte) 15));
        this.G0.setDuration(300L);
        this.G0.setInterpolator(d53.h);
        this.G0.start();
    }

    public final void F(float f, float f2) {
        xn3 xn3Var = this.s;
        if (xn3Var != null && (xn3Var.a1 != f || xn3Var.Z0 != f2)) {
            xn3Var.a1 = f;
            xn3Var.Z0 = f2;
            xn3Var.invalidate();
        }
        ko3 ko3Var = this.w;
        if (ko3Var != null) {
            if (ko3Var.m0 == f && ko3Var.l0 == f2) {
                return;
            }
            ko3Var.m0 = f;
            ko3Var.l0 = f2;
            ko3Var.invalidate();
        }
    }

    public final void I(boolean z) {
        String str;
        wm3 wm3Var;
        byte b = this.r;
        if (b == 1 || b == 2) {
            return;
        }
        this.o0 = z;
        if (b == 4 && (wm3Var = this.H) != null) {
            wm3Var.b();
        }
        l();
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A0 = null;
        d dVar = this.f;
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        chatActivityEnterView.A1 = 0.0f;
        chatActivityEnterView.q2();
        Editable text = dVar.a.F0.getText();
        byte b2 = this.r;
        if (b2 == 3 || b2 == 4) {
            this.w.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
            E();
            ap3 ap3Var = this.F;
            if (ap3Var != null) {
                ap3Var.f(false);
            }
        }
        this.J = null;
        this.K = wm3.c;
        int length = text == null ? 0 : text.length();
        if (length > 0 && !Character.isWhitespace(text.charAt(length - 1))) {
            this.L = true;
            text.append(' ');
            this.L = false;
            length++;
        }
        this.I = length;
        this.M = "";
        this.N = 0;
        this.O = false;
        this.r = (byte) 1;
        dVar.b();
        this.U = SystemClock.uptimeMillis();
        gm.r(this.k0);
        nn3 nn3Var = this.m0;
        DictationAsr.T(nn3Var);
        DictationAsr.i(nn3Var);
        M(true);
        if (!z) {
            b(1.0f, 220L, d53.h);
        }
        gm.r(this.t0);
        xn3 xn3Var = this.s;
        float[] fArr = this.h0;
        int i = this.n0;
        xn3Var.getClass();
        boolean z2 = fArr != null;
        xn3Var.R = z2;
        if (z2) {
            xn3Var.S = fArr[0] - xn3Var.getLeft();
            xn3Var.T = fArr[1] - xn3Var.getTop();
            xn3Var.U.setColor(i);
        }
        xn3 xn3Var2 = this.s;
        float[] fArr2 = this.i0;
        int i2 = this.j0;
        int[] iArr = xn3Var2.o0;
        boolean z3 = fArr2 != null;
        xn3Var2.A0 = z3;
        if (z3) {
            xn3Var2.getLocationInWindow(iArr);
            xn3Var2.B0 = fArr2[0] - iArr[0];
            xn3Var2.C0 = fArr2[1] - iArr[1];
            xn3Var2.D0 = fArr2[2];
            xn3Var2.E0 = i2;
            xn3Var2.F0 = 0L;
            Drawable drawable = xn3Var2.J0;
            if (drawable == null) {
                drawable = xn3Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
                xn3Var2.J0 = drawable;
            }
            drawable.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        if (this.i0 == null) {
            str = "null";
        } else {
            str = ((int) this.i0[0]) + "," + ((int) this.i0[1]) + " r" + ((int) this.i0[2]);
        }
        Log.d("Dictation", "commit morph from circle ".concat(str));
        this.i0 = null;
        this.h0 = null;
        if (!z) {
            this.s.setShown(true);
            this.s.setRightMode(0);
        }
        this.x.f();
        D(true);
        C(true);
        if (!z) {
            this.s.setStopIsland(true);
        }
        String c0 = DictationAsr.c0();
        this.w.setLanguage(c0 != null ? H(c0) : null);
        this.w.setSettings(true);
        long uptimeMillis = SystemClock.uptimeMillis();
        this.r0 = uptimeMillis;
        this.q0 = uptimeMillis;
        this.U = uptimeMillis;
        this.p0 = 0L;
        if (!z) {
            gm.d3(this.s0, 300L);
        }
        boolean z4 = oc7.d1().getInt("design_dictation_mode", 1) == 2;
        ChatActivityEnterView chatActivityEnterView2 = dVar.a;
        this.G = new vo3(this.h, chatActivityEnterView2.R, chatActivityEnterView2.G3, z4, this);
        sy1 sy1Var = dVar.a.F0;
        if (sy1Var != null) {
            sy1Var.n1 = true;
        }
        Log.d("Dictation", "start simulated=" + z4);
        vo3 vo3Var = this.G;
        vo3Var.h();
        gm.d3(new rd3(this, vo3Var, (byte) 21), (z4 || z) ? 120L : 420L);
    }

    public final ArrayList J() {
        l();
        ArrayList arrayList = new ArrayList();
        arrayList.add(wm3.c);
        arrayList.addAll(this.H.c());
        return arrayList;
    }

    public final void K() {
        Editable text = this.f.a.F0.getText();
        if (text == null || text.length() <= 0 || text.length() != this.I || !Character.isWhitespace(text.charAt(text.length() - 1))) {
            return;
        }
        this.L = true;
        text.delete(text.length() - 1, text.length());
        this.L = false;
    }

    public final void L() {
        Drawable backgroundImage;
        if (!this.f0) {
            this.f0 = true;
            ArrayList arrayList = ao3.g;
            wa3 wa3Var = this.e0;
            if (!arrayList.contains(wa3Var)) {
                arrayList.add(wa3Var);
            }
        }
        try {
            ela elaVar = this.f.a.c2;
            if ((elaVar != null) && (backgroundImage = elaVar.getBackgroundImage()) != null) {
                Bitmap createBitmap = Bitmap.createBitmap(8, 8, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(createBitmap);
                Rect rect = new Rect(backgroundImage.getBounds());
                backgroundImage.setBounds(0, 0, 8, 8);
                backgroundImage.draw(canvas);
                backgroundImage.setBounds(rect);
                long j = 0;
                long j2 = 0;
                long j3 = 0;
                for (int i = 0; i < 8; i++) {
                    for (int i2 = 0; i2 < 8; i2++) {
                        int pixel = createBitmap.getPixel(i2, i);
                        j += Color.red(pixel);
                        j2 += Color.green(pixel);
                        j3 += Color.blue(pixel);
                    }
                }
                createBitmap.recycle();
                this.d0 = Color.rgb((int) (j / 64), (int) (j2 / 64), (int) (j3 / 64));
            }
        } catch (Throwable unused) {
        }
        int i3 = cmb.c6;
        ylb ylbVar = this.n;
        int v0 = cmb.v0(i3, ylbVar);
        boolean c = zn3.c(v0);
        zn3 zn3Var = this.x;
        if (zn3Var.h != c) {
            zn3Var.h = c;
        }
        int i4 = cmb.Oe;
        zn3.h(cmb.v0(i4, ylbVar));
        zn3Var.g(this.d0, cmb.v0(i4, ylbVar));
        int[] iArr = zn3Var.B;
        int i5 = iArr[0];
        int i6 = iArr[1];
        if (az4.e != i5 || az4.f != i6) {
            az4.e = i5;
            az4.f = i6;
            Arrays.fill(az4.g[0], (Object) null);
        }
        if (this.s != null) {
            int v02 = cmb.v0(i4, ylbVar) | (-16777216);
            xn3 xn3Var = this.s;
            int f = on2.f(0.1f, v02, iArr[6]);
            int i7 = iArr[4];
            xn3Var.e1 = v02;
            xn3Var.f1 = f;
            xn3Var.g1 = i7;
            if (!xn3Var.p0) {
                xn3Var.q0 = v02;
                xn3Var.r0 = f;
                xn3Var.s0 = null;
                xn3Var.invalidate();
            }
            this.s.setDayIconBase(cmb.v0(cmb.Ml, ylbVar));
        }
        this.w0 = null;
        va2 va2Var = this.a0;
        if (va2Var != null) {
            va2Var.invalidate();
        }
        xn3 xn3Var2 = this.s;
        if (xn3Var2 != null) {
            int i8 = cmb.Ml;
            int v03 = cmb.v0(i8, ylbVar);
            int v04 = cmb.v0(i4, ylbVar);
            xn3Var2.d.setColor(v03);
            xn3Var2.e.setColor(v04);
            xn3Var2.f.setColor(v04);
            xn3Var2.invalidate();
            xn3 xn3Var3 = this.s;
            int v05 = cmb.v0(i8, ylbVar);
            Paint paint = xn3Var3.d0;
            Paint paint2 = xn3Var3.c0;
            xn3Var3.p0 = c;
            xn3Var3.q0 = c ? zn3.e(-13665281) : xn3Var3.e1;
            xn3Var3.r0 = c ? zn3.e(-7447553) : xn3Var3.f1;
            xn3Var3.s0 = null;
            xn3Var3.b0.setColor(c ? 1714435648 : -1493172225);
            paint2.setStyle(Paint.Style.STROKE);
            paint2.setStrokeWidth(gm.N(0.66f));
            paint2.setColor(c ? 654311423 : 436207616);
            paint.setColor(16777216);
            paint.setShadowLayer(gm.N(1.0f), 0.0f, gm.N(0.33333334f), c ? 1711276032 : 855638016);
            xn3Var3.e0.setColor(v05);
            xn3Var3.invalidate();
            this.s.setSendIconColor(cmb.v0(cmb.Sf, ylbVar));
        }
        ap3 ap3Var = this.F;
        if (ap3Var != null) {
            ap3Var.c(v(cmb.v0(i4, ylbVar), v0, c), cmb.v0(cmb.Ke, ylbVar), c);
        }
        ko3 ko3Var = this.w;
        if (ko3Var != null) {
            ko3Var.e();
        }
    }

    public final void M(boolean z) {
        String concat = !DictationAsr.J(new long[2]) ? null : " ".concat(jb6.a0(null, null, 2131744993, Long.valueOf(Math.round(r1[0] / 1048576.0d)), Long.valueOf(Math.max(1L, Math.round(r1[1] / 1048576.0d)))));
        if (z || !TextUtils.equals(concat, this.l0)) {
            this.l0 = concat;
            d dVar = this.f;
            if (concat == null) {
                dVar.a.O1(jb6.M0(2131744986, null), true);
                return;
            }
            String M0 = jb6.M0(2131744992, null);
            ChatActivityEnterView chatActivityEnterView = dVar.a;
            CharSequence charSequence = chatActivityEnterView.e;
            chatActivityEnterView.O1(TextUtils.concat(M0, concat), !(charSequence != null && charSequence.toString().startsWith(M0.toString())));
        }
    }

    @Override // uo3
    public final void a(String str, String str2) {
        if (q()) {
            if (!TextUtils.isEmpty(str)) {
                String y = y(str);
                if (this.N <= 0 || !y.isEmpty()) {
                    this.L = true;
                    this.F.e(this.I, -1, y);
                    this.L = false;
                }
            }
            ap3 ap3Var = this.F;
            Editable editableText = ap3Var.a.getEditableText();
            if (editableText != null) {
                ap3Var.d(editableText, editableText.length());
            }
            d dVar = this.f;
            sy1 sy1Var = dVar.a.F0;
            InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
            if (inputMethodManager != null && sy1Var != null) {
                inputMethodManager.restartInput(sy1Var);
            }
            this.G = null;
            if (str2 != null) {
                Log.d("Dictation", "stopped with error: ".concat(str2));
            }
            if (x() <= 0 && (this.N <= 0 || dVar.a.F0.getText().toString().trim().length() <= 0)) {
                k();
                K();
                this.w.setIsland(false);
                this.w.setSettings(false);
                this.w.setStopMode(false);
                E();
                this.r = (byte) 0;
                dVar.b();
                return;
            }
            this.r = (byte) 3;
            dVar.b();
            this.I = 0;
            this.s.setCancelShown(false);
            if (!this.o0) {
                i();
            }
            this.s.setHandOff(true);
            this.s.setRightMode(2);
            dVar.a.O1(null, true);
            D(false);
            this.P = 0.0f;
            gm.d3(this.t0, 460L);
            this.w.setStopMode(false);
            this.w.d(jb6.M0(2131744990, null), false);
            sy1 sy1Var2 = dVar.a.F0;
            sy1Var2.setSelection(sy1Var2.length());
            if (!this.o0) {
                sy1Var2.requestFocus();
                gm.d3(new bi3(sy1Var2, (byte) 15), 120L);
            }
            gm.d3(new nn3(this, (byte) 7), 90L);
        }
    }

    public final void b(float f, long j, d53 d53Var) {
        ValueAnimator valueAnimator = this.c0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.b0, f);
        this.c0 = ofFloat;
        ofFloat.addUpdateListener(new on3(this, (byte) 1));
        this.c0.setDuration(j);
        this.c0.setInterpolator(d53Var);
        this.c0.start();
    }

    public final void c(vm3 vm3Var) {
        boolean z;
        if (this.r == 3) {
            if (this.I > this.f.a.F0.length()) {
                this.I = 0;
            }
            String str = this.J;
            if (str != null) {
                z = true;
            } else {
                str = z();
                this.J = str;
                z = false;
            }
            if (TextUtils.isEmpty(str.trim())) {
                if (z) {
                    return;
                }
                this.J = null;
                return;
            }
            this.r = (byte) 4;
            this.b = 0L;
            this.V = SystemClock.uptimeMillis();
            this.w.d(vm3Var.d ? jb6.M0(2131744989, null) : jb6.a0(null, null, 2131744999, vm3Var.a()), true);
            this.F.a();
            this.F.f(true);
            this.x.f();
            xn3 xn3Var = this.s;
            if (xn3Var != null) {
                xn3Var.R0 = SystemClock.uptimeMillis();
                xn3Var.setVisibility(0);
                xn3Var.y = true;
                xn3Var.E = false;
                xn3Var.R = false;
                xn3Var.A0 = false;
                xn3Var.L0 = false;
                xn3Var.l0 = false;
                xn3Var.l1 = false;
                xn3Var.F.e(true, 1.0f);
                xn3Var.G.e(true, 0.0f);
                xn3Var.H.e(true, 0.0f);
                xn3Var.I.e(true, 0.0f);
                xn3Var.J.e(true, 1.0f);
                xn3Var.O0.e(true, 0.0f);
                xn3Var.b1 = 0L;
                xn3Var.N0.e(true, 1.0f);
                xn3Var.L = 3;
                xn3Var.invalidate();
            }
            va2 va2Var = this.a0;
            if (va2Var != null) {
                va2Var.invalidate();
            }
            vm3 vm3Var2 = this.K;
            this.K = vm3Var;
            this.H.a(vm3Var, str, new wg((Object) this, (Object) vm3Var2, z, (Object) vm3Var, (byte) 4));
        }
    }

    @Override // uo3
    public final void d(float f) {
        ChatActivityEnterView chatActivityEnterView;
        ChatActivityEnterView.RecordCircle recordCircle;
        this.P = f;
        long uptimeMillis = SystemClock.uptimeMillis();
        if (f > 0.38f) {
            long j = this.p0;
            if (j == 0) {
                this.p0 = uptimeMillis;
                j = uptimeMillis;
            }
            if (uptimeMillis - j >= 150) {
                this.U = uptimeMillis;
            }
        } else {
            this.p0 = 0L;
        }
        xn3 xn3Var = this.s;
        if (xn3Var != null) {
            xn3Var.setLevel(f);
        }
        if (this.o0 && (recordCircle = (chatActivityEnterView = this.f.a).D2) != null && chatActivityEnterView.v3) {
            recordCircle.setAmplitude(f * 1800.0f);
        }
    }

    @Override // uo3
    public final void e(String str) {
        f(-1, str);
    }

    @Override // uo3
    public final void f(int i, String str) {
        if (q()) {
            this.q0 = SystemClock.uptimeMillis();
            if (str == null) {
                str = "";
            }
            String y = y(str);
            int max = i < 0 ? -1 : Math.max(0, Math.min(y.length(), i - (str.length() - y.length())));
            this.L = true;
            this.F.e(this.I, max, y);
            this.L = false;
        }
    }

    @Override // uo3
    public final void g(String str) {
        ko3 ko3Var = this.w;
        if (ko3Var != null) {
            ko3Var.setLanguage(str == null ? null : H(str));
        }
    }

    public final void i() {
        ValueAnimator valueAnimator = this.A0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.A0 = ofFloat;
        ofFloat.addUpdateListener(new on3(this, (byte) 0));
        this.A0.setDuration(220L);
        this.A0.setInterpolator(d53.g);
        this.A0.start();
    }

    public final void j(long j, long j2) {
        xn3 xn3Var = this.s;
        if (xn3Var == null) {
            return;
        }
        if (xn3Var.L == 3) {
            xn3Var.b1 = SystemClock.uptimeMillis() + j;
            xn3Var.c1 = Math.max(1L, j2);
            xn3Var.invalidate();
        }
        gm.d3(new nn3(this, (byte) 6), j + j2 + 60);
    }

    public final void k() {
        gm.r(this.s0);
        xn3 xn3Var = this.s;
        if (xn3Var != null) {
            xn3Var.setStopIsland(false);
        }
        gm.r(this.t0);
        gm.r(this.k0);
        nn3 nn3Var = this.u0;
        gm.r(nn3Var);
        nn3 nn3Var2 = this.v0;
        gm.r(nn3Var2);
        xn3 xn3Var2 = this.s;
        xn3Var2.L0 = true;
        xn3Var2.R = false;
        SystemClock.uptimeMillis();
        if (xn3Var2.J0 == null) {
            Drawable mutate = xn3Var2.getResources().getDrawable(R.drawable.input_mic_pressed).mutate();
            xn3Var2.J0 = mutate;
            mutate.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        }
        xn3Var2.invalidate();
        if (!this.o0) {
            i();
        }
        D(false);
        this.P = 0.0f;
        gm.d3(nn3Var, 30L);
        gm.d3(nn3Var2, 310L);
    }

    public final void l() {
        im0 im0Var;
        am0 am0Var;
        d dVar = this.f;
        ela elaVar = dVar.a.c2;
        xn3 xn3Var = this.s;
        Context context = this.h;
        byte b = 0;
        if (xn3Var == null) {
            xn3 xn3Var2 = new xn3(context, this);
            this.s = xn3Var2;
            xn3Var2.setBorderColorSource(new mn3(this, b));
            this.s.setVisibility(8);
        }
        ViewParent parent = this.s.getParent();
        xn3 xn3Var3 = this.s;
        if (parent != elaVar) {
            gm.B2(xn3Var3);
            elaVar.addView(this.s, qoe.e(-1, -1, 80));
        } else {
            xn3Var3.bringToFront();
        }
        xn3 xn3Var4 = this.s;
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        rx1 rx1Var = chatActivityEnterView.R0;
        a aVar = chatActivityEnterView.a1;
        xn3Var4.b = rx1Var;
        xn3Var4.c = aVar;
        xn3Var4.setBubbleProvider(new sz4(this));
        ko3 ko3Var = this.w;
        if (ko3Var == null) {
            ko3Var = new ko3(context, this.n, this);
            this.w = ko3Var;
        }
        ViewParent parent2 = ko3Var.getParent();
        ko3 ko3Var2 = this.w;
        if (parent2 != elaVar) {
            gm.B2(ko3Var2);
            elaVar.addView(this.w, qoe.e(-1, -1, 80));
        } else {
            ko3Var2.bringToFront();
        }
        ChatActivityEnterView chatActivityEnterView2 = dVar.a;
        int i = ChatActivityEnterView.z7;
        va2 C0 = chatActivityEnterView2.C0();
        va2 va2Var = this.a0;
        if (C0 != va2Var) {
            if (va2Var != null) {
                va2Var.f = null;
            }
            this.a0 = C0;
            this.Y = C0 != null ? new ln(C0, 0L, 380L, new d53(0.22d, 0.61d, 0.36d, 1.0d)) : null;
            this.e = C0 != null ? new ln(C0, 1L, 300L, d53.g) : null;
        }
        va2 va2Var2 = this.a0;
        if (va2Var2 != null) {
            va2Var2.f = new mn3(this, (byte) 2);
            km0 km0Var = dVar.a.L1;
            if (km0Var != null && (im0Var = va2Var2.n) != null && (am0Var = im0Var.w) != null) {
                im0 c = km0Var.c(this.w, am0Var, false);
                im0 c2 = km0Var.c(this.w, this.a0.n.w, false);
                ko3 ko3Var3 = this.w;
                im0 c3 = km0Var.c(ko3Var3, this.a0.n.w, false);
                ko3Var3.I = c;
                ko3Var3.J = c2;
                ko3Var3.K = c3;
                c.r(gm.L(18.0f));
                c2.r(gm.L(18.0f));
                c3.r(gm.L(18.0f));
                ko3 ko3Var4 = this.w;
                ko3Var4.setGearGlass(km0Var.c(ko3Var4, this.a0.n.w, false));
                xn3 xn3Var5 = this.s;
                if (xn3Var5 != null) {
                    xn3Var5.setStopGlass(km0Var.c(xn3Var5, new f8e(), false));
                }
            }
        }
        sy1 sy1Var = dVar.a.F0;
        if (this.F == null) {
            ap3 ap3Var = new ap3(sy1Var);
            this.F = ap3Var;
            ap3Var.h = new mn3(this, (byte) 4);
            this.a = new lo3(sy1Var);
            sy1Var.addTextChangedListener(this.g0);
        }
        if (this.H == null) {
            this.H = new wm3(dVar.a.R);
        }
        L();
    }

    public final void m() {
        d dVar = this.f;
        sy1 sy1Var = dVar.a.F0;
        if (sy1Var != null) {
            sy1Var.n1 = false;
        }
        vo3 vo3Var = this.G;
        if (vo3Var != null) {
            vo3Var.c();
        }
        this.G = null;
        wm3 wm3Var = this.H;
        if (wm3Var != null) {
            wm3Var.b();
        }
        if (q()) {
            k();
        }
        ko3 ko3Var = this.w;
        if (ko3Var != null) {
            ko3Var.a();
            this.w.setIsland(false);
            this.w.setRevert(false);
            this.w.setSettings(false);
        }
        this.J = null;
        this.r = (byte) 0;
        D(false);
        lo3 lo3Var = this.a;
        if (lo3Var != null) {
            lo3Var.c();
        }
        ChatActivityEnterView chatActivityEnterView = dVar.a;
        chatActivityEnterView.G1 = 0L;
        chatActivityEnterView.H1 = null;
        xn3 xn3Var = this.s;
        if (xn3Var != null && xn3Var.getRightMode() == 3) {
            this.s.e();
        }
        ap3 ap3Var = this.F;
        if (ap3Var != null) {
            ap3Var.f(false);
        }
        C(false);
        E();
        dVar.b();
    }

    public final boolean n(RectF rectF) {
        im0 im0Var;
        va2 va2Var = this.a0;
        if (va2Var == null || (im0Var = va2Var.n) == null) {
            return false;
        }
        Rect rect = im0Var.S.m;
        if (rect.isEmpty()) {
            return false;
        }
        this.a0.getLocationInWindow(this.E);
        rectF.set(rect);
        rectF.offset(r3[0], r3[1]);
        return true;
    }

    public final boolean o() {
        return this.r != 0;
    }

    public final boolean p() {
        return this.o0 && this.r != 0;
    }

    public final boolean q() {
        byte b = this.r;
        return b == 1 || b == 2;
    }

    public final boolean s(float[] fArr) {
        sy1 sy1Var = this.f.a.F0;
        if (this.a0 == null || sy1Var == null || sy1Var.getLayout() == null) {
            return false;
        }
        this.a0.getLocationInWindow(this.B0);
        sy1Var.getLocationInWindow(this.C0);
        fArr[0] = (sy1Var.getTotalPaddingLeft() + (r5[0] - r3[0])) - sy1Var.getScrollX();
        fArr[1] = (sy1Var.getTotalPaddingTop() + (r5[1] - r3[1])) - sy1Var.getScrollY();
        return true;
    }

    public final void t() {
        if (q()) {
            vo3 vo3Var = this.G;
            if (vo3Var != null) {
                vo3Var.c();
            }
            this.G = null;
            d dVar = this.f;
            Editable text = dVar.a.F0.getText();
            if (text != null && this.I <= text.length()) {
                this.L = true;
                this.F.a();
                text.delete(this.I, text.length());
                this.L = false;
            }
            K();
            k();
            C(false);
            this.w.setIsland(false);
            this.w.setSettings(false);
            this.w.setStopMode(false);
            E();
            this.r = (byte) 0;
            dVar.b();
        }
    }

    public final void u() {
        if (this.r == 1) {
            gm.r(this.s0);
            this.r = (byte) 2;
            this.s.setStopIsland(false);
            this.s.setRightMode(1);
            this.s.setCancelShown(false);
            vo3 vo3Var = this.G;
            if (vo3Var != null) {
                vo3Var.m();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void w(String str) {
        boolean z;
        Editable editable;
        long j;
        im0 im0Var;
        boolean c = zn3.c(cmb.v0(cmb.c6, this.n));
        boolean z2 = true;
        if (this.a != null && this.a0 != null) {
            float[] fArr = this.D0;
            if (s(fArr) && (im0Var = this.a0.n) != null) {
                if (!im0Var.S.m.isEmpty()) {
                    float centerY = (r7.centerY() - fArr[1]) * 0.9f;
                    z = this.a.b((((r7.width() * (-0.35f)) + r7.left) - fArr[0]) + centerY, (((r7.width() * 1.35f) + r7.left) - fArr[0]) + centerY, zn3.e(c ? -7358721 : -15363160), c);
                    this.F.f(false);
                    d dVar = this.f;
                    if (!z) {
                        sy1 sy1Var = dVar.a.F0;
                        Editable text = sy1Var.getText();
                        if (text == null) {
                            return;
                        }
                        Layout layout = sy1Var.getLayout();
                        int lineCount = layout != null ? layout.getLineCount() : 1;
                        int width = (sy1Var.getWidth() - sy1Var.getTotalPaddingLeft()) - sy1Var.getTotalPaddingRight();
                        int lineCount2 = width <= 0 ? 1 : StaticLayout.Builder.obtain(str, 0, str.length(), sy1Var.getPaint(), width).setLineSpacing(sy1Var.getLineSpacingExtra(), sy1Var.getLineSpacingMultiplier()).setIncludePad(sy1Var.getIncludeFontPadding()).build().getLineCount();
                        d53 d53Var = lo3.J;
                        long max = Math.max(800L, Math.min(1200L, (Math.max(lineCount, lineCount2) * 70) + 700));
                        long uptimeMillis = SystemClock.uptimeMillis();
                        d53 d53Var2 = lo3.J;
                        ChatActivityEnterView chatActivityEnterView = dVar.a;
                        chatActivityEnterView.G1 = uptimeMillis + max;
                        chatActivityEnterView.H1 = d53Var2;
                        int min = Math.min(this.I, text.length());
                        this.L = true;
                        this.F.a();
                        BaseInputConnection.removeComposingSpans(text);
                        text.replace(min, text.length(), str);
                        sy1Var.setSelection(text.length());
                        this.L = false;
                        InputMethodManager inputMethodManager = (InputMethodManager) this.h.getSystemService("input_method");
                        if (inputMethodManager != null) {
                            inputMethodManager.restartInput(sy1Var);
                        }
                        this.a.a(max);
                        this.b = uptimeMillis + ((long) (max * 0.87f));
                        long min2 = Math.min(this.a.h(r0.w * 0.9f), max);
                        lo3 lo3Var = this.a;
                        this.a.H = new w30(this, min2, Math.min(lo3Var.h(((lo3Var.w + lo3Var.x) * 0.9f) + (lo3Var.b.getLayout() != null ? r5.getWidth() : 0.0f)) + ((long) (lo3Var.F * 1000.0f)), max), (byte) 3);
                        va2 va2Var = this.a0;
                        if (va2Var != null) {
                            va2Var.invalidate();
                        }
                        gm.d3(new nn3(this, (byte) 3), max + 32);
                        return;
                    }
                    j(0L, 240L);
                    sy1 sy1Var2 = dVar.a.F0;
                    Editable text2 = sy1Var2.getText();
                    if (text2 != null) {
                        int min3 = Math.min(this.I, text2.length());
                        this.L = true;
                        this.F.a();
                        text2.replace(min3, text2.length(), str);
                        ap3 ap3Var = this.F;
                        int length = str.length() + min3;
                        Editable editableText = ap3Var.a.getEditableText();
                        if (editableText == null) {
                            editable = text2;
                            j = 45;
                        } else {
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            int i = 0;
                            loop0: while (min3 < length) {
                                while (min3 < length) {
                                    if (Character.isWhitespace(editableText.charAt(min3))) {
                                        min3++;
                                    } else {
                                        int i2 = min3;
                                        while (i2 < length && !Character.isWhitespace(editableText.charAt(i2))) {
                                            i2++;
                                        }
                                        boolean z3 = z2;
                                        long j2 = (i * 45) + uptimeMillis2;
                                        xo3 xo3Var = new xo3(j2 + 260, ap3Var.b, ap3Var.c);
                                        xo3Var.b = j2;
                                        editableText.setSpan(xo3Var, min3, i2, 33);
                                        i++;
                                        min3 = i2;
                                        z2 = z3;
                                        text2 = text2;
                                        uptimeMillis2 = uptimeMillis2;
                                    }
                                }
                                break loop0;
                            }
                            editable = text2;
                            j = 45;
                            ap3Var.g();
                        }
                        this.W = (j * str.split("\\s+").length) + SystemClock.uptimeMillis() + 375;
                        va2 va2Var2 = this.a0;
                        if (va2Var2 != null) {
                            va2Var2.invalidate();
                        }
                        sy1Var2.setSelection(editable.length());
                        this.L = false;
                        return;
                    }
                    return;
                }
            }
        }
        z = false;
        this.F.f(false);
        d dVar2 = this.f;
        if (!z) {
        }
    }

    public final int x() {
        Editable text = this.f.a.F0.getText();
        if (text == null) {
            return 0;
        }
        return Math.max(0, text.length() - Math.min(this.I, text.length()));
    }

    public final String y(String str) {
        if (str == null) {
            str = "";
        }
        this.M = str;
        if (this.N <= 0) {
            return str;
        }
        int length = str.length();
        int i = this.N;
        String substring = length > i ? str.substring(i) : "";
        int i2 = 0;
        while (i2 < substring.length() && Character.isWhitespace(substring.charAt(i2))) {
            i2++;
        }
        String substring2 = substring.substring(i2);
        if (substring2.isEmpty()) {
            return "";
        }
        return (this.O ? " " : "").concat(substring2);
    }

    public final String z() {
        Editable text = this.f.a.F0.getText();
        return text == null ? "" : text.subSequence(Math.min(this.I, text.length()), text.length()).toString();
    }
}
