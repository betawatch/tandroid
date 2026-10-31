package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.s9;
import org.telegram.ui.Components.w9;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.ex0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class z8 extends View {
    public final Paint A0;
    public final Paint B0;
    public final Paint C0;
    public final Path D;
    public final Paint D0;
    public boolean E;
    public final TextPaint E0;
    public String F;
    public final RectF F0;
    public boolean G;
    public final Path G0;
    public long H;
    public final Paint H0;
    public long I;
    public final y8 I0;
    public float J;
    public final Paint J0;
    public float K;
    public final Drawable K0;
    public float L;
    public final TextPaint L0;
    public x8 M;
    public StaticLayout M0;
    public boolean N;
    public float N0;
    public String O;
    public float O0;
    public boolean P;
    public final TextPaint P0;
    public long Q;
    public StaticLayout Q0;
    public long R;
    public float R0;
    public float S;
    public float S0;
    public float T;
    public final LinearGradient T0;
    public boolean U;
    public final Matrix U0;
    public float V;
    public final Paint V0;
    public boolean W;
    public final zl0 W0;
    public boolean X0;
    public final rh.r4 Y0;
    public long Z0;
    public t8 a;
    public s8 a0;
    public long a1;
    public Runnable b;
    public int b0;
    public final org.telegram.ui.Components.t5 b1;
    public int c;
    public final org.telegram.ui.Components.t5 c0;
    public long c1;
    public Runnable d;
    public final org.telegram.ui.Components.t5 d0;
    public q8 d1;
    public long e;
    public final org.telegram.ui.Components.t5 e0;
    public long e1;
    public long f;
    public final org.telegram.ui.Components.t5 f0;
    public long f1;
    public final org.telegram.ui.Components.t5 g0;
    public float g1;
    public u8 h;
    public final org.telegram.ui.Components.t5 h0;
    public int h1;
    public final org.telegram.ui.Components.t5 i0;
    public int i1;
    public boolean j0;
    public int j1;
    public final s9 k0;
    public int k1;
    public final w9 l0;
    public boolean l1;
    public final w9 m0;
    public boolean m1;
    public int n;
    public final w9 n0;
    public float n1;
    public final RectF o0;
    public boolean o1;
    public final Path p0;
    public VelocityTracker p1;
    public final qz0 q0;
    public boolean q1;
    public final ArrayList r;
    public final Drawable r0;
    public boolean r1;
    public final ArrayList s;
    public final y8 s0;
    public int s1;
    public final RectF t0;
    public final float[] t1;
    public final Paint u0;
    public int u1;
    public final Path v0;
    public int v1;
    public u8 w;
    public final Path w0;
    public int w1;
    public final Paint x;
    public final RectF x0;
    public int x1;
    public final Path y;
    public final Path y0;
    public int y1;
    public final Paint z0;
    public int z1;

    public z8(Context context, ViewGroup viewGroup, b8 b8Var, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.x = new Paint(3);
        this.y = new Path();
        this.D = new Path();
        this.b0 = 1;
        gr grVar = gr.h;
        this.c0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.d0 = new org.telegram.ui.Components.t5(this, 360L, grVar);
        this.e0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.f0 = new org.telegram.ui.Components.t5(this, 360L, grVar);
        this.g0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.h0 = new org.telegram.ui.Components.t5(this, 0L, 360L, grVar);
        this.i0 = new org.telegram.ui.Components.t5(this, 0L, 320L, grVar);
        this.j0 = true;
        this.o0 = new RectF();
        this.p0 = new Path();
        this.s0 = new y8();
        this.t0 = new RectF();
        this.u0 = new Paint(3);
        this.v0 = new Path();
        this.w0 = new Path();
        this.x0 = new RectF();
        this.y0 = new Path();
        Paint paint = new Paint(1);
        this.z0 = paint;
        Paint paint2 = new Paint(1);
        this.A0 = paint2;
        Paint paint3 = new Paint(1);
        this.B0 = paint3;
        Paint paint4 = new Paint(1);
        this.C0 = paint4;
        Paint paint5 = new Paint(1);
        this.D0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.E0 = textPaint;
        this.F0 = new RectF();
        this.G0 = new Path();
        Paint paint6 = new Paint(1);
        this.H0 = paint6;
        this.I0 = new y8();
        Paint paint7 = new Paint(1);
        this.J0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.L0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.P0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.T0 = linearGradient;
        this.U0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.V0 = paint8;
        this.W0 = new zl0(getContext(), null);
        this.Z0 = -1L;
        this.a1 = -1L;
        this.b1 = new org.telegram.ui.Components.t5(0.0f, this, 0L, 340L, grVar);
        this.c1 = -1L;
        this.h1 = -1;
        this.i1 = -1;
        this.j1 = -1;
        this.k1 = -1;
        this.n1 = 1.0f;
        this.q1 = true;
        this.r1 = false;
        this.t1 = new float[8];
        paint7.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint2.setTypeface(org.telegram.messenger.i0.o());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(org.telegram.messenger.i0.L(1.0f), 0.0f, org.telegram.messenger.i0.L(1.0f), 436207616);
        textPaint.setTextSize(org.telegram.messenger.i0.L(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(org.telegram.messenger.i0.L(2.0f), 0.0f, org.telegram.messenger.i0.L(2.0f), TLObject.FLAG_30);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.q0 = new qz0(cd.L0(2131744482, null), 12.0f, org.telegram.messenger.i0.o());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.r0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.K0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.k0 = s9Var;
        this.l0 = new w9(s9Var, this, 0, false);
        this.m0 = new w9(s9Var, this, 3, false);
        this.n0 = new w9(s9Var, this, 4, false);
        this.Y0 = new rh.r4(this, viewGroup, p6Var, s9Var, b8Var, 12);
    }

    public static void a(final z8 z8Var, ViewGroup viewGroup, org.telegram.ui.ActionBar.p6 p6Var, s9 s9Var, View view) {
        int i10;
        ArrayList arrayList = z8Var.s;
        int i11 = z8Var.j1;
        final int i12 = 0;
        final int i13 = 2;
        try {
            if (i11 == 2 && z8Var.N) {
                h5 h5Var = new h5(z8Var.getContext(), 0);
                h5Var.b = 0.0f;
                h5Var.c = 1.5f;
                h5Var.d(z8Var.V);
                h5Var.h = new q20(z8Var) { // from class: vh.r8
                    public final /* synthetic */ z8 b;

                    {
                        this.b = z8Var;
                    }

                    @Override // org.telegram.messenger.q20
                    public final void a(Object obj) {
                        Float f7 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f7.floatValue();
                                z8 z8Var2 = this.b;
                                z8Var2.V = floatValue;
                                t8 t8Var = z8Var2.a;
                                if (t8Var != null) {
                                    t8Var.h(f7.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f7.floatValue();
                                z8 z8Var3 = this.b;
                                z8Var3.L = floatValue2;
                                t8 t8Var2 = z8Var3.a;
                                if (t8Var2 != null) {
                                    t8Var2.f(f7.floatValue());
                                    break;
                                }
                                break;
                            default:
                                z8 z8Var4 = this.b;
                                z8Var4.h.i = f7.floatValue();
                                t8 t8Var3 = z8Var4.a;
                                if (t8Var3 != null) {
                                    t8Var3.w(f7.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(z8Var.getBaseDuration(), z8Var.getMaxScrollDuration());
                int i14 = z8Var.v1;
                int i15 = z8Var.y1;
                int i16 = z8Var.x1;
                float min2 = Math.min((i14 - i15) - i16, ((((org.telegram.messenger.i0.T1(z8Var.T, 1.0f, z8Var.f0.c) * z8Var.R) + (z8Var.Q - z8Var.f)) / min) * z8Var.u1) + i15 + i16);
                z60 F = z60.F(viewGroup, p6Var, z8Var);
                F.q(h5Var);
                F.o();
                F.c(R.drawable.msg_delete, cd.L0(2131744738, null), new p8(z8Var, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(z8Var.v1 - min2)) + org.telegram.messenger.i0.L(18.0f), z8Var.F0.top);
                F.Z();
                F.Q(s9Var, -view.getX(), -view.getY());
                z8Var.performHapticFeedback(0, 1);
            } else {
                final int i17 = 1;
                if (i11 == 1 && z8Var.E) {
                    h5 h5Var2 = new h5(z8Var.getContext(), 0);
                    h5Var2.b = 0.0f;
                    h5Var2.c = 1.5f;
                    h5Var2.d(z8Var.L);
                    h5Var2.h = new q20(z8Var) { // from class: vh.r8
                        public final /* synthetic */ z8 b;

                        {
                            this.b = z8Var;
                        }

                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj) {
                            Float f7 = (Float) obj;
                            switch (i17) {
                                case 0:
                                    float floatValue = f7.floatValue();
                                    z8 z8Var2 = this.b;
                                    z8Var2.V = floatValue;
                                    t8 t8Var = z8Var2.a;
                                    if (t8Var != null) {
                                        t8Var.h(f7.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f7.floatValue();
                                    z8 z8Var3 = this.b;
                                    z8Var3.L = floatValue2;
                                    t8 t8Var2 = z8Var3.a;
                                    if (t8Var2 != null) {
                                        t8Var2.f(f7.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    z8 z8Var4 = this.b;
                                    z8Var4.h.i = f7.floatValue();
                                    t8 t8Var3 = z8Var4.a;
                                    if (t8Var3 != null) {
                                        t8Var3.w(f7.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    long min3 = Math.min(z8Var.getBaseDuration(), z8Var.getMaxScrollDuration());
                    int i18 = z8Var.v1;
                    int i19 = z8Var.y1;
                    int i20 = z8Var.x1;
                    float min4 = Math.min((i18 - i19) - i20, ((((org.telegram.messenger.i0.T1(z8Var.K, 1.0f, z8Var.d0.c) * z8Var.H) + (z8Var.I - z8Var.f)) / min3) * z8Var.u1) + i19 + i20);
                    z60 F2 = z60.F(viewGroup, p6Var, z8Var);
                    F2.q(h5Var2);
                    F2.o();
                    F2.c(R.drawable.msg_delete, cd.L0(2131744513, null), new p8(z8Var, 2), false);
                    F2.V(5);
                    F2.U = true;
                    F2.a0((-(z8Var.v1 - min4)) + org.telegram.messenger.i0.L(18.0f), z8Var.x0.top);
                    F2.Z();
                    F2.Q(s9Var, -view.getX(), -view.getY());
                    z8Var.performHapticFeedback(0, 1);
                } else if (i11 == 0 && z8Var.h != null) {
                    h5 h5Var3 = new h5(z8Var.getContext(), 0);
                    h5Var3.b = 0.0f;
                    h5Var3.c = 1.5f;
                    h5Var3.d(z8Var.h.i);
                    h5Var3.h = new q20(z8Var) { // from class: vh.r8
                        public final /* synthetic */ z8 b;

                        {
                            this.b = z8Var;
                        }

                        @Override // org.telegram.messenger.q20
                        public final void a(Object obj) {
                            Float f7 = (Float) obj;
                            switch (i13) {
                                case 0:
                                    float floatValue = f7.floatValue();
                                    z8 z8Var2 = this.b;
                                    z8Var2.V = floatValue;
                                    t8 t8Var = z8Var2.a;
                                    if (t8Var != null) {
                                        t8Var.h(f7.floatValue());
                                        break;
                                    }
                                    break;
                                case 1:
                                    float floatValue2 = f7.floatValue();
                                    z8 z8Var3 = this.b;
                                    z8Var3.L = floatValue2;
                                    t8 t8Var2 = z8Var3.a;
                                    if (t8Var2 != null) {
                                        t8Var2.f(f7.floatValue());
                                        break;
                                    }
                                    break;
                                default:
                                    z8 z8Var4 = this.b;
                                    z8Var4.h.i = f7.floatValue();
                                    t8 t8Var3 = z8Var4.a;
                                    if (t8Var3 != null) {
                                        t8Var3.w(f7.floatValue());
                                        break;
                                    }
                                    break;
                            }
                        }
                    };
                    z60 F3 = z60.F(viewGroup, p6Var, z8Var);
                    F3.q(h5Var3);
                    F3.V(5);
                    F3.U = true;
                    F3.a0(org.telegram.messenger.i0.L(18.0f), z8Var.t0.top);
                    F3.Z();
                    F3.Q(s9Var, -view.getX(), -view.getY());
                    z8Var.performHapticFeedback(0, 1);
                } else {
                    if (i11 != 3 || (i10 = z8Var.k1) < 0 || i10 >= arrayList.size()) {
                        return;
                    }
                    u8 u8Var = (u8) arrayList.get(z8Var.k1);
                    h5 h5Var4 = new h5(z8Var.getContext(), 0);
                    h5Var4.b = 0.0f;
                    h5Var4.c = 1.5f;
                    h5Var4.d(u8Var.i);
                    h5Var4.h = new rh.e3(10, z8Var, u8Var);
                    z60 F4 = z60.F(viewGroup, p6Var, z8Var);
                    F4.q(h5Var4);
                    F4.V(5);
                    F4.U = true;
                    F4.a0(org.telegram.messenger.i0.L(18.0f), u8Var.j.top);
                    F4.Z();
                    F4.Q(s9Var, -view.getX(), -view.getY());
                    z8Var.performHapticFeedback(0, 1);
                }
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return org.telegram.messenger.i0.W1(this.f0.d(this.P), org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        u8 u8Var = this.h;
        if (u8Var != null) {
            return Math.max(1L, u8Var.e);
        }
        u8 u8Var2 = this.w;
        return u8Var2 != null ? Math.max(1L, u8Var2.e) : this.E ? Math.max(1L, this.H) : Math.max(1L, this.R);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f7 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f7 > 0.0f) {
                f7 += org.telegram.messenger.i0.L(4.0f);
            }
            f7 += org.telegram.messenger.i0.W1(((u8) arrayList.get(i10)).k.c, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
        }
        return f7;
    }

    private float getRoundHeight() {
        if (this.E) {
            return org.telegram.messenger.i0.W1(this.d0.d(this.G), org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
        }
        return 0.0f;
    }

    private float getVideoHeight() {
        if (this.h == null) {
            return 0.0f;
        }
        return org.telegram.messenger.i0.W1(r0.k.c, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013c A[LOOP:0: B:38:0x013c->B:42:0x01eb, LOOP_START, PHI: r5
      0x013c: PHI (r5v34 int) = (r5v7 int), (r5v35 int) binds: [B:37:0x013a, B:42:0x01eb] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03ce A[PHI: r21
      0x03ce: PHI (r21v2 int) = (r21v1 int), (r21v1 int), (r21v3 int) binds: [B:89:0x0242, B:91:0x024c, B:77:0x03cc] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(MotionEvent motionEvent) {
        boolean z10;
        int i10;
        u8 u8Var;
        float x10 = motionEvent.getX();
        float y3 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(this.e, getBaseDuration(), 0L);
        u8 u8Var2 = this.w;
        float f7 = min;
        float f10 = (this.u1 * (((k10 + (u8Var2 != null ? (u8Var2.g * u8Var2.e) + u8Var2.f : this.h == null ? this.Q : 0L)) - this.f) / f7)) + this.y1 + this.x1;
        if (!this.X0 && x10 >= f10 - org.telegram.messenger.i0.L(12.0f) && x10 <= f10 + org.telegram.messenger.i0.L(12.0f)) {
            return 0;
        }
        boolean z11 = this.h != null && y3 > (((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) org.telegram.messenger.i0.L(2.0f));
        ArrayList arrayList = this.s;
        boolean z12 = !arrayList.isEmpty() && y3 > ((((((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) org.telegram.messenger.i0.L(4.0f))) - getCollageHeight()) - ((float) org.telegram.messenger.i0.L(4.0f))) - ((float) org.telegram.messenger.i0.L(2.0f)) && y3 < (((float) (this.w1 - this.z1)) - getVideoHeight()) - ((float) org.telegram.messenger.i0.L(2.0f));
        if (this.E) {
            if (y3 > (((((((this.w1 - this.z1) - getVideoHeight()) - org.telegram.messenger.i0.L(4.0f)) - getCollageHeight()) - org.telegram.messenger.i0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - org.telegram.messenger.i0.L(4.0f)) - org.telegram.messenger.i0.L(2.0f)) {
                if (y3 < ((((this.w1 - this.z1) - getVideoHeight()) - org.telegram.messenger.i0.L(2.0f)) - getCollageHeight()) - org.telegram.messenger.i0.L(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z10 = true;
                    if (z12) {
                        i10 = 1;
                        if (z11) {
                            float f11 = this.y1 + this.x1;
                            u8 u8Var3 = this.h;
                            float f12 = u8Var3.g;
                            float f13 = u8Var3.e;
                            float f14 = this.f;
                            float f15 = this.u1;
                            float f16 = ((((f12 * f13) - f14) / f7) * f15) + f11;
                            float f17 = ((((u8Var3.h * f13) - f14) / f7) * f15) + f11;
                            if (this.X0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x10 < f16 - org.telegram.messenger.i0.L(15.0f) || x10 > f17 + org.telegram.messenger.i0.L(15.0f)) {
                                    return i10;
                                }
                                return 4;
                            }
                            if (x10 >= f16 - org.telegram.messenger.i0.L(15.0f) && x10 <= org.telegram.messenger.i0.L(5.0f) + f16) {
                                return 2;
                            }
                            if (x10 >= f17 - org.telegram.messenger.i0.L(5.0f) && x10 <= org.telegram.messenger.i0.L(15.0f) + f17) {
                                return 3;
                            }
                            if (x10 >= f16 && x10 <= f17) {
                                u8 u8Var4 = this.h;
                                if (u8Var4.g > 0.01f || u8Var4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z10) {
                            float f18 = this.y1 + this.x1;
                            float f19 = this.I;
                            float f20 = this.J;
                            float f21 = this.H;
                            float f22 = this.f;
                            float f23 = this.u1;
                            float f24 = (((((f20 * f21) + f19) - f22) / f7) * f23) + f18;
                            float f25 = (((((this.K * f21) + f19) - f22) / f7) * f23) + f18;
                            if (this.G || this.h == null) {
                                if (x10 >= f24 - org.telegram.messenger.i0.L(15.0f) && x10 <= org.telegram.messenger.i0.L(5.0f) + f24) {
                                    return 10;
                                }
                                if (x10 >= f25 - org.telegram.messenger.i0.L(5.0f) && x10 <= org.telegram.messenger.i0.L(15.0f) + f25) {
                                    return 11;
                                }
                                if (x10 >= f24 && x10 <= f25) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f26 = this.y1 + this.x1;
                                long j10 = this.I;
                                long j11 = this.f;
                                float f27 = this.u1;
                                float f28 = (((j10 - j11) / f7) * f27) + f26;
                                f25 = a1.g.c((j10 + this.H) - j11, f7, f27, f26);
                                f24 = f28;
                            }
                            if (x10 >= f24 && x10 <= f25) {
                                return 9;
                            }
                        } else if (this.N) {
                            float f29 = this.y1 + this.x1;
                            float f30 = this.Q;
                            float f31 = this.S;
                            float f32 = this.R;
                            float f33 = this.f;
                            float f34 = this.u1;
                            float f35 = (((((f31 * f32) + f30) - f33) / f7) * f34) + f29;
                            float f36 = (((((this.T * f32) + f30) - f33) / f7) * f34) + f29;
                            if (this.P || (this.h == null && !this.E)) {
                                if (x10 >= f35 - org.telegram.messenger.i0.L(15.0f) && x10 <= org.telegram.messenger.i0.L(5.0f) + f35) {
                                    return 6;
                                }
                                if (x10 >= f36 - org.telegram.messenger.i0.L(5.0f) && x10 <= org.telegram.messenger.i0.L(15.0f) + f36) {
                                    return 7;
                                }
                                if (x10 >= f35 && x10 <= f36) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f37 = this.y1 + this.x1;
                                long j12 = this.Q;
                                long j13 = this.f;
                                float f38 = this.u1;
                                float f39 = (((j12 - j13) / f7) * f38) + f37;
                                f36 = a1.g.c((j12 + this.R) - j13, f7, f38, f37);
                                f35 = f39;
                            }
                            if (x10 >= f35 && x10 <= f36) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            u8 u8Var5 = (u8) arrayList.get(i11);
                            RectF rectF = org.telegram.messenger.i0.P;
                            rectF.set(u8Var5.j);
                            rectF.inset(-org.telegram.messenger.i0.L(2.0f), -org.telegram.messenger.i0.L(2.0f));
                            if (rectF.contains(x10, y3)) {
                                float f40 = this.y1 + this.x1;
                                float f41 = u8Var5.f;
                                float f42 = this.u1;
                                float f43 = ((f41 / f7) * f42) + f40;
                                float f44 = u8Var5.g;
                                float f45 = u8Var5.e;
                                float f46 = ((((f44 * f45) + f41) / f7) * f42) + f40;
                                float f47 = ((((u8Var5.h * f45) + f41) / f7) * f42) + f40;
                                float c10 = a1.g.c(r6 + r11, f7, f42, f40);
                                this.i1 = i11;
                                if (x10 >= f46 - org.telegram.messenger.i0.L(15.0f) && x10 <= org.telegram.messenger.i0.L(5.0f) + f46) {
                                    return 13;
                                }
                                if (x10 >= f47 - org.telegram.messenger.i0.L(5.0f) && x10 <= org.telegram.messenger.i0.L(15.0f) + f47) {
                                    return 14;
                                }
                                if (x10 < f46 || x10 > f47 || (u8Var5.g <= 0.01f && u8Var5.h >= 0.99f)) {
                                    return (x10 < f43 || x10 > c10) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i10 = 1;
                    }
                    u8Var = this.h;
                    if (u8Var != null || u8Var.e <= getMaxScrollDuration() || !z11) {
                        return -1;
                    }
                }
            }
        }
        z10 = false;
        if (z12) {
        }
        u8Var = this.h;
        return u8Var != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        zl0 zl0Var = this.W0;
        if (!zl0Var.b()) {
            if (this.r1) {
                this.r1 = false;
                t8 t8Var = this.a;
                if (t8Var != null) {
                    t8Var.t(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = zl0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.q1) {
            this.f = (long) Math.max(0.0f, (((i10 - this.y1) - this.x1) / this.u1) * min);
        } else {
            if (!this.P) {
                zl0Var.a();
                return;
            }
            int i11 = this.y1;
            int i12 = this.x1;
            float f7 = this.u1;
            float f10 = min;
            h(((((i10 - i11) - i12) / f7) * f10) - ((((this.s1 - i11) - i12) / f7) * f10));
        }
        invalidate();
        this.s1 = i10;
    }

    public final void d(Canvas canvas, float f7, float f10, long j10, float f11) {
        float f12;
        if (this.X0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float k10 = Utilities.k(j10, getBaseDuration(), 0L);
        u8 u8Var = this.w;
        if (u8Var != null) {
            f12 = (u8Var.g * u8Var.e) + u8Var.f;
        } else {
            f12 = this.h == null ? this.Q : 0L;
        }
        float f13 = (this.u1 * (((k10 + f12) - this.f) / min)) + this.y1 + this.x1;
        float f14 = (1.0f - f11) * (((f10 - f7) / 2.0f) / 2.0f);
        float f15 = f7 + f14;
        float f16 = f10 - f14;
        Paint paint = this.C0;
        paint.setAlpha((int) (38.0f * f11));
        int i10 = (int) (f11 * 255.0f);
        Paint paint2 = this.D0;
        paint2.setAlpha(i10);
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f13 - org.telegram.messenger.i0.N(1.5f), f15, org.telegram.messenger.i0.N(1.5f) + f13, f16);
        rectF.inset(-org.telegram.messenger.i0.N(0.66f), -org.telegram.messenger.i0.N(0.66f));
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint);
        rectF.set(f13 - org.telegram.messenger.i0.N(1.5f), f15, org.telegram.messenger.i0.N(1.5f) + f13, f16);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint2);
    }

    /* JADX WARN: Incorrect condition in loop: B:120:0x06a4 */
    /* JADX WARN: Incorrect condition in loop: B:137:0x06ef */
    /* JADX WARN: Incorrect condition in loop: B:208:0x09b3 */
    /* JADX WARN: Incorrect condition in loop: B:225:0x0a00 */
    /* JADX WARN: Incorrect condition in loop: B:67:0x03e1 */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0cf4  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x0ed1  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        long j10;
        Paint paint;
        ArrayList arrayList;
        float f7;
        w9 w9Var;
        RectF rectF2;
        int i10;
        long j11;
        int i11;
        u8 u8Var;
        u8 u8Var2;
        int i12;
        float f10;
        float max;
        long j12;
        float f11;
        Canvas canvas2;
        boolean z10;
        float f12;
        float f13;
        float f14;
        RectF rectF3;
        ArrayList arrayList2;
        long j13;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        float f20;
        ArrayList arrayList3;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        Paint paint2;
        float f27;
        float f28;
        double d;
        float f29;
        float f30;
        float f31;
        float f32;
        float f33;
        Canvas canvas3;
        float f34;
        float f35;
        float f36;
        float f37;
        float T1;
        float x10;
        float f38;
        RectF rectF4;
        float f39;
        float f40;
        float f41;
        float N;
        float f42;
        float f43;
        float c10;
        float f44;
        float f45;
        long j14;
        float f46;
        float f47;
        float f48;
        ArrayList arrayList4;
        int i13;
        boolean z11;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i14;
        int i15;
        float f49;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i16;
        RectF rectF5;
        ArrayList arrayList9;
        float f50;
        float f51;
        Path path;
        float c11;
        float f52;
        float f53;
        float f54;
        int i17;
        long j15;
        float f55;
        float f56;
        float f57;
        ArrayList arrayList10;
        boolean z12;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z13;
        int i18;
        float f58;
        ArrayList arrayList13;
        ArrayList arrayList14;
        float f59;
        float f60;
        float f61;
        float f62;
        float f63;
        ArrayList arrayList15;
        ArrayList arrayList16;
        ArrayList arrayList17;
        int i19;
        boolean z14;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        w9 w9Var2;
        char c12;
        boolean z15;
        z8 z8Var = this;
        RectF rectF6 = z8Var.t0;
        RectF rectF7 = z8Var.x0;
        Path path2 = z8Var.w0;
        ArrayList arrayList20 = z8Var.r;
        Drawable drawable = z8Var.r0;
        s9 s9Var = z8Var.k0;
        RectF rectF8 = z8Var.F0;
        ArrayList arrayList21 = z8Var.s;
        RectF rectF9 = z8Var.o0;
        w9 w9Var3 = z8Var.l0;
        Paint c13 = w9Var3.c(1.0f);
        float d10 = z8Var.i0.d(z8Var.j0);
        long min = Math.min(z8Var.getBaseDuration(), z8Var.getMaxScrollDuration());
        if (d10 < 1.0f) {
            rectF9.set(z8Var.y1, (z8Var.w1 - z8Var.z1) - org.telegram.messenger.i0.L(28.0f), z8Var.v1 - z8Var.y1, z8Var.w1 - z8Var.z1);
            z8Var.p0.rewind();
            z8Var.p0.addRoundRect(rectF9, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - d10) * 255.0f), 31);
            canvas.clipPath(z8Var.p0);
            if (s9Var.c()) {
                w9Var3.a(canvas);
                canvas.drawColor(855638016);
                paint3 = c13;
            } else if (c13 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint3 = c13;
            } else {
                paint3 = c13;
                canvas.drawRect(rectF9, paint3);
                canvas.drawColor(855638016);
            }
            if (arrayList20.isEmpty() || !s9Var.c()) {
                paint4 = paint3;
                rectF = rectF6;
                w9Var2 = w9Var3;
                j10 = min;
                c12 = 31;
                if (!arrayList20.isEmpty()) {
                    Paint c14 = z8Var.n0.c(0.4f);
                    if (c14 == null) {
                        c14 = z8Var.H0;
                        c14.setAlpha(64);
                    }
                    z15 = false;
                    z8Var.s0.a((((z8Var.Q - z8Var.f) / j10) * z8Var.u1) + z8Var.y1 + z8Var.x1, rectF9.left, rectF9.right, org.telegram.messenger.i0.L(28.0f), z8Var.h0.e(false, y8.c(arrayList20)), rectF9.bottom, arrayList20);
                    canvas.drawPath(z8Var.s0, c14);
                    float g10 = ((z8Var.q0.g() + org.telegram.messenger.i0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - g10);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.Cells.f1.y(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.Cells.f1.f(2, centerY, drawable));
                    drawable.setAlpha(zs.V2);
                    drawable.draw(canvas);
                    qz0 qz0Var = z8Var.q0;
                    float centerX2 = (rectF9.centerX() - g10) + drawable.getIntrinsicWidth() + org.telegram.messenger.i0.L(3.66f);
                    float f64 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    w9Var = w9Var2;
                    f7 = 0.4f;
                    qz0Var.c(centerX2, f64, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float e = z8Var.h0.e(false, y8.c(arrayList20));
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j10 = min;
                w9Var2 = w9Var3;
                z8Var.s0.a((((z8Var.Q - z8Var.f) / min) * z8Var.u1) + z8Var.y1 + z8Var.x1, rectF9.left, rectF9.right, org.telegram.messenger.i0.L(28.0f), e, rectF9.bottom, arrayList20);
                c12 = 31;
                canvas.saveLayerAlpha(rectF9, zs.n1, 31);
                canvas.clipPath(z8Var.s0);
                z8Var.n0.a(canvas);
                canvas.restore();
            }
            z15 = false;
            float g102 = ((z8Var.q0.g() + org.telegram.messenger.i0.L(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - g102);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.Cells.f1.y(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.Cells.f1.f(2, centerY2, drawable));
            drawable.setAlpha(zs.V2);
            drawable.draw(canvas);
            qz0 qz0Var2 = z8Var.q0;
            float centerX22 = (rectF9.centerX() - g102) + drawable.getIntrinsicWidth() + org.telegram.messenger.i0.L(3.66f);
            float f642 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            w9Var = w9Var2;
            f7 = 0.4f;
            qz0Var2.c(centerX22, f642, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c13;
            arrayList = arrayList21;
            f7 = 0.4f;
            w9Var = w9Var3;
            rectF2 = rectF8;
        }
        if (d10 > 0.0f) {
            if (d10 < 1.0f) {
                f11 = 0.0f;
                j12 = j10;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, z8Var.getWidth(), z8Var.getHeight(), (int) (d10 * 255.0f), 31);
                z10 = true;
            } else {
                j12 = j10;
                f11 = 0.0f;
                canvas2 = canvas;
                z10 = false;
            }
            u8 u8Var3 = z8Var.h;
            float f65 = u8Var3 != null ? 1.0f : f11;
            float d11 = u8Var3 != null ? u8Var3.k.d((z8Var.P || z8Var.G) ? false : true) : f11;
            float f66 = z8Var.w1 - z8Var.z1;
            float L = org.telegram.messenger.i0.L(4.0f);
            if (z8Var.h != null) {
                canvas2.save();
                float videoHeight = z8Var.getVideoHeight();
                u8 u8Var4 = z8Var.h;
                float f67 = u8Var4.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j16 = u8Var4.e;
                float f68 = j16;
                float u10 = c3.i0.u(f67, f68, d11, f11);
                float u11 = c3.i0.u(u8Var4.h, f68, d11, f11);
                if (j16 <= 0) {
                    f12 = d11;
                    f14 = f11;
                    f59 = f65;
                    j13 = j12;
                    f16 = L;
                    f60 = f14;
                } else {
                    f14 = f11;
                    f12 = d11;
                    f59 = f65;
                    j13 = j12;
                    f16 = L;
                    f60 = (z8Var.y1 + z8Var.x1) - (z8Var.u1 * (z8Var.f / j13));
                }
                f19 = u10;
                float f69 = z8Var.x1;
                float f70 = f60 - f69;
                if (j16 <= 0) {
                    f61 = f69;
                    f18 = u11;
                    f62 = f14;
                } else {
                    f61 = f69;
                    f18 = u11;
                    f62 = (((j16 - z8Var.f) / j13) * z8Var.u1) + z8Var.y1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f70, f66 - videoHeight, f62 + f61, f66);
                float f71 = f66 - ((f16 * f59) + videoHeight);
                float f72 = (rectF10.top * f12) + f14;
                f17 = (rectF10.bottom * f12) + f14;
                z8Var.v0.rewind();
                z8Var.v0.addRoundRect(rectF10, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(z8Var.v0);
                x8 x8Var = z8Var.h.c;
                if (x8Var != null) {
                    int i20 = x8Var.f;
                    float f73 = i20;
                    f20 = f72;
                    int max2 = (int) Math.max(0.0d, Math.floor((f70 - z8Var.y1) / f73));
                    f13 = f59;
                    int min2 = (int) Math.min(z8Var.h.c.c, Math.ceil(((r6 - f70) - z8Var.y1) / f73) + 1.0d);
                    int i21 = (int) rectF10.top;
                    arrayList15 = z8Var.h.c.d;
                    boolean z16 = arrayList15.size() >= min2;
                    boolean z17 = (i20 == 0 || !z16 || z8Var.h.b) ? false : true;
                    if (z17) {
                        int i22 = max2;
                        while (true) {
                            arrayList18 = z8Var.h.c.d;
                            if (i22 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = z8Var.h.c.d;
                            if (((w8) arrayList19.get(i22)).a == null) {
                                z17 = false;
                                break;
                            }
                            i22++;
                        }
                    }
                    if (!z17) {
                        if (s9Var.c()) {
                            w9Var.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF10, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i20 != 0) {
                        float f74 = f70;
                        int i23 = max2;
                        while (i23 < Math.min(arrayList16.size(), min2)) {
                            arrayList17 = z8Var.h.c.d;
                            w8 w8Var = (w8) arrayList17.get(i23);
                            if (w8Var.a != null) {
                                i19 = min2;
                                z14 = z16;
                                z8Var.u0.setAlpha((int) (w8Var.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(w8Var.a, f74, i21 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), z8Var.u0);
                            } else {
                                i19 = min2;
                                z14 = z16;
                            }
                            f74 += f73;
                            i23++;
                            z16 = z14;
                            min2 = i19;
                        }
                    }
                    boolean z18 = z16;
                    f63 = 1.0f;
                    if (!z18) {
                        z8Var.h.c.c();
                    }
                } else {
                    f20 = f72;
                    f13 = f59;
                    f63 = 1.0f;
                }
                path2.rewind();
                if (z8Var.X0) {
                    f15 = f63;
                } else {
                    RectF rectF11 = org.telegram.messenger.i0.P;
                    int i24 = z8Var.y1;
                    int i25 = z8Var.x1;
                    float f75 = i24 + i25;
                    u8 u8Var5 = z8Var.h;
                    float f76 = u8Var5.g;
                    f15 = f63;
                    int i26 = i25;
                    float f77 = u8Var5.e;
                    float f78 = z8Var.f;
                    float f79 = (f76 * f77) - f78;
                    float f80 = j13;
                    float f81 = z8Var.u1;
                    float f82 = (((f79 / f80) * f81) + f75) - (f76 <= f14 ? i26 : 0);
                    float f83 = z8Var.w1 - z8Var.z1;
                    float f84 = f83 - videoHeight;
                    float f85 = u8Var5.h;
                    float f86 = ((((f77 * f85) - f78) / f80) * f81) + f75;
                    if (f85 < f15) {
                        i26 = 0;
                    }
                    rectF11.set(f82, f84, f86 + i26, f83);
                    path2.addRoundRect(rectF11, z8Var.t1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f11 = videoHeight;
                f66 = f71;
            } else {
                f12 = d11;
                f13 = f65;
                f14 = f11;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j13 = j12;
                f15 = 1.0f;
                f16 = L;
                f17 = f11;
                f18 = f17;
                f19 = f18;
                f20 = f19;
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                f21 = f11;
                f22 = 0.0f;
            } else {
                z8Var.getCollageHeight();
                float f87 = f66;
                int i27 = 0;
                while (i27 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    u8 u8Var6 = (u8) arrayList22.get(i27);
                    org.telegram.ui.Components.t5 t5Var = u8Var6.k;
                    RectF rectF12 = u8Var6.j;
                    float f88 = f11;
                    float d12 = t5Var.d((z8Var.P || z8Var.G || z8Var.n != i27) ? false : true);
                    if (u8Var6 != z8Var.w) {
                        i16 = i27;
                        arrayList9 = arrayList22;
                        float f89 = j13;
                        f50 = f17;
                        f51 = ((((org.telegram.messenger.i0.T1(u8Var6.g, f14, d12) * u8Var6.e) + (u8Var6.f - z8Var.f)) / f89) * z8Var.u1) + z8Var.y1 + z8Var.x1;
                        rectF5 = rectF7;
                        c11 = (c3.i0.x(org.telegram.messenger.i0.T1(u8Var6.h, f15, d12), u8Var6.e, u8Var6.f - z8Var.f, f89) * z8Var.u1) + z8Var.y1 + z8Var.x1;
                        path = path2;
                    } else {
                        i16 = i27;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f50 = f17;
                        float f90 = z8Var.y1 + z8Var.x1;
                        float f91 = j13;
                        float f92 = (u8Var6.f - z8Var.f) / f91;
                        float f93 = z8Var.u1;
                        f51 = (f92 * f93) + f90;
                        path = path2;
                        c11 = a1.g.c(r8 + u8Var6.e, f91, f93, f90);
                    }
                    float f94 = f51;
                    canvas2.save();
                    float W1 = org.telegram.messenger.i0.W1(d12, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
                    float f95 = z8Var.x1;
                    rectF12.set(f94 - f95, f87 - W1, c11 + f95, f87);
                    f20 = (rectF12.top * d12) + f20;
                    f17 = (rectF12.bottom * d12) + f50;
                    float f96 = u8Var6.f;
                    float f97 = u8Var6.g;
                    float f98 = f87;
                    float f99 = u8Var6.e;
                    f19 = (((f97 * f99) + f96) * d12) + f19;
                    f18 = (((u8Var6.h * f99) + f96) * d12) + f18;
                    z8Var.y.rewind();
                    z8Var.y.addRoundRect(rectF12, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
                    canvas2.clipPath(z8Var.y);
                    x8 x8Var2 = u8Var6.c;
                    if (x8Var2 != null) {
                        long j17 = u8Var6.e;
                        f52 = W1;
                        if (j17 <= 0) {
                            j15 = j17;
                            f55 = 0.0f;
                        } else {
                            j15 = j17;
                            f55 = z8Var.y1 + z8Var.x1 + (((u8Var6.f - z8Var.f) / j13) * z8Var.u1);
                        }
                        float f100 = z8Var.x1;
                        float f101 = f55 - f100;
                        if (j17 <= 0) {
                            f56 = f100;
                            f57 = 0.0f;
                        } else {
                            f56 = f100;
                            f57 = ((((u8Var6.f + j15) - z8Var.f) / j13) * z8Var.u1) + z8Var.y1 + r7;
                        }
                        float f102 = f57 + f56;
                        int i28 = x8Var2.f;
                        float f103 = i28;
                        int max3 = (int) Math.max(0.0d, Math.floor((f101 - ((((u8Var6.f - z8Var.f) / j13) * z8Var.u1) + (z8Var.y1 + z8Var.x1))) / f103));
                        int min3 = (int) Math.min(u8Var6.c.c, Math.ceil((f102 - f101) / f103) + 1.0d);
                        int i29 = (int) rectF12.top;
                        arrayList10 = u8Var6.c.d;
                        boolean z19 = arrayList10.size() >= min3;
                        if (z19) {
                            for (int i30 = max3; i30 < Math.min(arrayList13.size(), min3); i30++) {
                                arrayList14 = u8Var6.c.d;
                                if (((w8) arrayList14.get(i30)).a == null) {
                                    z12 = false;
                                    break;
                                }
                            }
                        }
                        z12 = z19;
                        if (!z12) {
                            if (s9Var.c()) {
                                w9Var.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i28 != 0) {
                            float f104 = f101;
                            while (max3 < Math.min(arrayList11.size(), min3)) {
                                arrayList12 = u8Var6.c.d;
                                w8 w8Var2 = (w8) arrayList12.get(max3);
                                int i31 = min3;
                                if (w8Var2.a != null) {
                                    z13 = z19;
                                    i18 = max3;
                                    f58 = f98;
                                    z8Var.x.setAlpha((int) (w8Var2.b.e(false, 1.0f) * 255.0f));
                                    canvas2.drawBitmap(w8Var2.a, f104, i29 - ((int) ((r4.getHeight() - f52) / 2.0f)), z8Var.x);
                                } else {
                                    z13 = z19;
                                    i18 = max3;
                                    f58 = f98;
                                }
                                f104 += f103;
                                max3 = i18 + 1;
                                min3 = i31;
                                z19 = z13;
                                f98 = f58;
                            }
                        }
                        f53 = f98;
                        if (!z19) {
                            u8Var6.c.c();
                        }
                    } else {
                        f52 = W1;
                        f53 = f98;
                    }
                    z8Var.D.rewind();
                    if (!z8Var.X0) {
                        RectF rectF13 = org.telegram.messenger.i0.P;
                        int i32 = z8Var.y1;
                        int i33 = z8Var.x1;
                        float f105 = i32 + i33;
                        float f106 = u8Var6.g;
                        float f107 = u8Var6.e;
                        float f108 = z8Var.f;
                        float f109 = (f106 * f107) - f108;
                        float f110 = u8Var6.f;
                        float f111 = j13;
                        float f112 = z8Var.u1;
                        float f113 = (((f109 + f110) / f111) * f112) + f105;
                        if (f106 <= 0.0f) {
                            f54 = f112;
                            i17 = i33;
                        } else {
                            f54 = f112;
                            i17 = 0;
                        }
                        float f114 = f113 - i17;
                        float f115 = rectF12.top;
                        float f116 = u8Var6.h;
                        rectF13.set(f114, f115, (((((f107 * f116) - f108) + f110) / f111) * f54) + f105 + (f116 >= 1.0f ? i33 : 0), rectF12.bottom);
                        z8Var.D.addRoundRect(rectF13, z8Var.t1, Path.Direction.CW);
                        canvas2.clipPath(z8Var.D, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f87 = f53 - ((f16 * 1.0f) + f52);
                    i27 = i16 + 1;
                    path2 = path;
                    f11 = f88;
                    arrayList2 = arrayList9;
                    rectF7 = rectF5;
                    f15 = 1.0f;
                    f14 = 0.0f;
                }
                arrayList3 = arrayList2;
                f21 = f11;
                f66 = f87;
                f22 = 1.0f;
            }
            RectF rectF14 = rectF7;
            Path path3 = path2;
            float d13 = z8Var.c0.d(z8Var.E);
            float d14 = z8Var.d0.d(z8Var.E && z8Var.G);
            float roundHeight = z8Var.getRoundHeight() * d13;
            float f117 = ((z8Var.h == null && !z8Var.N && arrayList3.isEmpty()) ? 1.0f : d14) * d13;
            if (d13 > 0.0f) {
                long j18 = z8Var.I;
                float f118 = j18;
                float f119 = z8Var.J;
                float f120 = z8Var.H;
                f19 = (((f119 * f120) + f118) * f117) + f19;
                f18 = (((z8Var.K * f120) + f118) * f117) + f18;
                if (z8Var.h != null) {
                    float f121 = j13;
                    float T12 = ((((z8Var.H * org.telegram.messenger.i0.T1(f119, 0.0f, d14)) + (j18 - z8Var.f)) / f121) * z8Var.u1) + z8Var.y1 + z8Var.x1;
                    f43 = f17;
                    f23 = f22;
                    c10 = (c3.i0.x(org.telegram.messenger.i0.T1(z8Var.K, 1.0f, d14), z8Var.H, z8Var.I - z8Var.f, f121) * z8Var.u1) + z8Var.y1 + z8Var.x1;
                    f44 = T12;
                } else {
                    f23 = f22;
                    f43 = f17;
                    float f122 = z8Var.y1 + z8Var.x1;
                    long j19 = j18 - z8Var.f;
                    float f123 = j13;
                    float f124 = z8Var.u1;
                    float f125 = ((j19 / f123) * f124) + f122;
                    c10 = a1.g.c(j19 + r6, f123, f124, f122);
                    f44 = f125;
                }
                float f126 = z8Var.x1;
                rectF14.set(f44 - f126, f66 - roundHeight, c10 + f126, f66);
                float f127 = f66 - ((f16 * d13) + roundHeight);
                f20 = (rectF14.top * f117) + f20;
                f17 = (rectF14.bottom * f117) + f43;
                z8Var.y0.rewind();
                z8Var.y0.addRoundRect(rectF14, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(z8Var.y0);
                x8 x8Var3 = z8Var.M;
                if (x8Var3 != null) {
                    float f128 = d14;
                    long j20 = z8Var.H;
                    if (j20 <= 0) {
                        f45 = f127;
                        j14 = j20;
                        f46 = 0.0f;
                    } else {
                        f45 = f127;
                        j14 = j20;
                        f46 = z8Var.y1 + z8Var.x1 + (((z8Var.I - z8Var.f) / j13) * z8Var.u1);
                    }
                    float f129 = z8Var.x1;
                    float f130 = f46 - f129;
                    if (j20 <= 0) {
                        f47 = f129;
                        f48 = 0.0f;
                    } else {
                        f47 = f129;
                        f48 = z8Var.y1 + r10 + ((((z8Var.I + j14) - z8Var.f) / j13) * z8Var.u1);
                    }
                    float f131 = f48 + f47;
                    int i34 = x8Var3.f;
                    float f132 = i34;
                    float f133 = f130;
                    int max4 = (int) Math.max(0.0d, Math.floor((f130 - (z8Var.h != null ? (((z8Var.I - z8Var.f) / j13) * z8Var.u1) + (z8Var.y1 + z8Var.x1) : z8Var.y1)) / f132));
                    int min4 = (int) Math.min(z8Var.M.c, Math.ceil((f131 - f133) / f132) + 1.0d);
                    int i35 = (int) rectF14.top;
                    arrayList4 = z8Var.M.d;
                    boolean z20 = arrayList4.size() >= min4;
                    if (z20) {
                        int i36 = max4;
                        i13 = i36;
                        while (i36 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = z8Var.M.d;
                            if (((w8) arrayList8.get(i36)).a == null) {
                                z11 = false;
                                break;
                            }
                            i36++;
                        }
                    } else {
                        i13 = max4;
                    }
                    z11 = z20;
                    if (!z11) {
                        if (s9Var.c()) {
                            w9Var.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF14, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i34 != 0) {
                        int i37 = i13;
                        while (i37 < Math.min(arrayList5.size(), min4)) {
                            arrayList6 = z8Var.M.d;
                            w8 w8Var3 = (w8) arrayList6.get(i37);
                            int i38 = i37;
                            if (w8Var3.a != null) {
                                i14 = min4;
                                i15 = i35;
                                f49 = f128;
                                z8Var.u0.setAlpha((int) (w8Var3.b.e(false, 1.0f) * 255.0f));
                                canvas2.drawBitmap(w8Var3.a, f133, i15 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), z8Var.u0);
                            } else {
                                i14 = min4;
                                i15 = i35;
                                f49 = f128;
                            }
                            f133 += f132;
                            i37 = i38 + 1;
                            min4 = i14;
                            i35 = i15;
                            f128 = f49;
                        }
                    }
                    f24 = f128;
                    if (!z20) {
                        z8Var.M.c();
                    }
                } else {
                    f45 = f127;
                    f24 = d14;
                }
                path3.rewind();
                RectF rectF15 = org.telegram.messenger.i0.P;
                int i39 = z8Var.y1;
                int i40 = z8Var.x1;
                float f134 = i39 + i40;
                float f135 = z8Var.J;
                float f136 = z8Var.H;
                float f137 = f135 * f136;
                float f138 = z8Var.f;
                float f139 = f137 - f138;
                float f140 = z8Var.I;
                float f141 = j13;
                float f142 = (f139 + f140) / f141;
                float f143 = z8Var.u1;
                float f144 = (1.0f - f24) * i40;
                float f145 = (((f142 * f143) + f134) - (f135 <= 0.0f ? i40 : 0)) - f144;
                float f146 = rectF14.top;
                float f147 = z8Var.K;
                float f148 = (((((f136 * f147) - f138) + f140) / f141) * f143) + f134;
                if (f147 < 1.0f) {
                    i40 = 0;
                }
                rectF15.set(f145, f146, f148 + i40 + f144, rectF14.bottom);
                path3.addRoundRect(rectF15, z8Var.t1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f66 = f45;
            } else {
                f23 = f22;
                f24 = d14;
            }
            float d15 = z8Var.e0.d(z8Var.N);
            float d16 = z8Var.f0.d(z8Var.N && z8Var.P);
            float audioHeight = z8Var.getAudioHeight() * d15;
            float f149 = ((z8Var.h == null && !z8Var.E && arrayList3.isEmpty()) ? 1.0f : d16) * d15;
            if (d15 > 0.0f) {
                float f150 = z8Var.Q;
                float f151 = z8Var.S;
                float f152 = z8Var.R;
                f19 = (((f151 * f152) + f150) * f149) + f19;
                f18 = (((z8Var.T * f152) + f150) * f149) + f18;
                Paint c15 = z8Var.m0.c(d15);
                canvas2.save();
                if (z8Var.h == null && !z8Var.E && arrayList3.isEmpty()) {
                    float f153 = z8Var.y1 + z8Var.x1;
                    f37 = f17;
                    float f154 = z8Var.Q - z8Var.f;
                    float f155 = j13;
                    float f156 = z8Var.u1;
                    float f157 = ((f154 / f155) * f156) + f153;
                    paint2 = paint;
                    f36 = f149;
                    x10 = a1.g.c(r10 + z8Var.R, f155, f156, f153);
                    T1 = f157;
                } else {
                    f36 = f149;
                    f37 = f17;
                    paint2 = paint;
                    float f158 = j13;
                    T1 = ((((org.telegram.messenger.i0.T1(z8Var.S, 0.0f, d16) * z8Var.R) + (z8Var.Q - z8Var.f)) / f158) * z8Var.u1) + z8Var.y1 + z8Var.x1;
                    x10 = z8Var.y1 + z8Var.x1 + (c3.i0.x(org.telegram.messenger.i0.T1(z8Var.T, 1.0f, d16), z8Var.R, z8Var.Q - z8Var.f, f158) * z8Var.u1);
                }
                float f159 = x10;
                float f160 = z8Var.x1;
                RectF rectF16 = rectF3;
                rectF16.set(T1 - f160, f66 - audioHeight, f159 + f160, f66);
                f20 = (rectF16.top * f36) + f20;
                float f161 = (rectF16.bottom * f36) + f37;
                z8Var.G0.rewind();
                z8Var.G0.addRoundRect(rectF16, org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), Path.Direction.CW);
                canvas2.clipPath(z8Var.G0);
                if (s9Var != null && s9Var.c()) {
                    w9Var.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d15, 855638016));
                } else if (c15 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d15, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c15);
                    canvas2.drawColor(org.telegram.ui.ActionBar.t6.r1(d15, 855638016));
                }
                if (z8Var.a0 == null || s9Var == null || !s9Var.c()) {
                    f38 = d16;
                    rectF4 = rectF16;
                    i10 = 1;
                    if (z8Var.a0 != null && c15 != null) {
                        Paint c16 = z8Var.n0.c(d15 * f7);
                        if (c16 == null) {
                            c16 = z8Var.H0;
                            c16.setAlpha((int) (64.0f * d15));
                        }
                        float e7 = z8Var.g0.e(!z8Var.U, z8Var.a0.e);
                        s8 s8Var = z8Var.a0;
                        z8Var.U = s8Var.c > 0;
                        long j21 = j13;
                        z8Var.I0.b((((z8Var.Q - z8Var.f) / j13) * z8Var.u1) + z8Var.y1 + z8Var.x1, T1, f159, f38, j21, audioHeight, e7, rectF4.bottom, s8Var);
                        f39 = f38;
                        j11 = j21;
                        canvas2.drawPath(z8Var.I0, c16);
                        if (f39 >= 1.0f) {
                            int i41 = z8Var.y1;
                            float f162 = z8Var.x1 + i41;
                            float f163 = z8Var.Q - z8Var.f;
                            float f164 = z8Var.S;
                            float f165 = z8Var.R;
                            float f166 = j11;
                            float f167 = z8Var.u1;
                            float f168 = ((((f164 * f165) + f163) / f166) * f167) + f162;
                            float f169 = ((((z8Var.T * f165) + f163) / f166) * f167) + f162;
                            float min5 = (Math.min(z8Var.v1 - z8Var.y1, f169) + Math.max(i41, f168)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(z8Var.v1 - z8Var.y1, f169) - Math.max(z8Var.y1, f168)) - org.telegram.messenger.i0.L(24.0f));
                            float N2 = org.telegram.messenger.i0.N(13.0f);
                            if (z8Var.M0 == null && z8Var.Q0 == null) {
                                f41 = 13.0f;
                                N = 0.0f;
                            } else {
                                f41 = 13.0f;
                                N = org.telegram.messenger.i0.N(9.66f) + org.telegram.messenger.i0.N(3.11f) + z8Var.N0 + z8Var.R0;
                            }
                            float f170 = N2 + N;
                            int i42 = f170 < max5 ? i10 : 0;
                            float min6 = min5 - (Math.min(f170, max5) / 2.0f);
                            z8Var.K0.setBounds((int) min6, (int) (centerY3 - (org.telegram.messenger.i0.L(f41) / 2.0f)), (int) (org.telegram.messenger.i0.L(f41) + min6), (int) ((org.telegram.messenger.i0.L(f41) / 2.0f) + centerY3));
                            float f171 = 1.0f - f39;
                            float f172 = f171 * 255.0f;
                            z8Var.K0.setAlpha((int) f172);
                            z8Var.K0.draw(canvas2);
                            float N3 = org.telegram.messenger.i0.N(16.11f) + min6;
                            f40 = f161;
                            f27 = f12;
                            d = 0.0d;
                            f26 = d15;
                            f25 = f39;
                            f28 = f13;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, z8Var.v1, z8Var.w1, zs.e4, 31);
                            float min7 = Math.min(f169, z8Var.v1) - org.telegram.messenger.i0.L(12.0f);
                            canvas2.clipRect(N3, 0.0f, min7, z8Var.w1);
                            if (z8Var.M0 != null) {
                                canvas2.save();
                                canvas2.translate(N3 - z8Var.O0, centerY3 - (z8Var.M0.getHeight() / 2.0f));
                                z8Var.L0.setAlpha((int) (f172 * f26));
                                z8Var.M0.draw(canvas2);
                                canvas2.restore();
                                f42 = z8Var.N0 + N3;
                            } else {
                                f42 = N3;
                            }
                            if (z8Var.M0 != null && z8Var.Q0 != null) {
                                float N4 = org.telegram.messenger.i0.N(3.66f) + f42;
                                int alpha = z8Var.J0.getAlpha();
                                z8Var.J0.setAlpha((int) (alpha * f171));
                                canvas2.drawCircle(org.telegram.messenger.i0.L(1.0f) + N4, centerY3, org.telegram.messenger.i0.L(1.0f), z8Var.J0);
                                z8Var.J0.setAlpha(alpha);
                                f42 = org.telegram.messenger.i0.N(2.0f) + N4 + org.telegram.messenger.i0.N(4.0f);
                            }
                            if (z8Var.Q0 != null) {
                                canvas2.save();
                                canvas2.translate(f42 - z8Var.S0, centerY3 - (z8Var.Q0.getHeight() / 2.0f));
                                z8Var.P0.setAlpha((int) (f172 * f26));
                                z8Var.Q0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (i42 == 0) {
                                z8Var.U0.reset();
                                z8Var.U0.postScale(org.telegram.messenger.i0.N(8.0f) / 16.0f, 1.0f);
                                z8Var.U0.postTranslate(min7 - org.telegram.messenger.i0.L(8.0f), 0.0f);
                                z8Var.T0.setLocalMatrix(z8Var.U0);
                                canvas2.drawRect(min7 - org.telegram.messenger.i0.L(8.0f), rectF4.top, min7, rectF4.bottom, z8Var.V0);
                            }
                            canvas.restore();
                        } else {
                            f26 = d15;
                            f40 = f161;
                            f25 = f39;
                            f27 = f12;
                            f28 = f13;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f29 = f40;
                    }
                } else {
                    float e10 = z8Var.g0.e(!z8Var.U, z8Var.a0.e);
                    s8 s8Var2 = z8Var.a0;
                    z8Var.U = s8Var2.c > 0;
                    i10 = 1;
                    rectF4 = rectF16;
                    f38 = d16;
                    z8Var.I0.b((((z8Var.Q - z8Var.f) / j13) * z8Var.u1) + z8Var.y1 + z8Var.x1, T1, f159, f38, j13, audioHeight, e10, rectF4.bottom, s8Var2);
                    canvas2.saveLayerAlpha(rectF4, zs.n1, 31);
                    canvas2.clipPath(z8Var.I0);
                    z8Var.n0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                f39 = f38;
                if (f39 >= 1.0f) {
                }
                canvas.restore();
                f29 = f40;
            } else {
                f25 = d16;
                f26 = d15;
                float f173 = f17;
                paint2 = paint;
                f27 = f12;
                f28 = f13;
                d = 0.0d;
                i10 = 1;
                j11 = j13;
                f29 = f173;
            }
            float f174 = f20;
            float f175 = z8Var.y1 + z8Var.x1;
            float f176 = z8Var.f;
            float f177 = j11;
            float f178 = z8Var.u1;
            float f179 = (((f19 - f176) / f177) * f178) + f175;
            float f180 = (((f18 - f176) / f177) * f178) + f175;
            if (!arrayList3.isEmpty()) {
                f31 = d13;
                f30 = f26;
                f26 = f23;
            } else if (z8Var.N && z8Var.h == null) {
                f31 = d13;
                f30 = f26;
            } else {
                float f181 = f26;
                f26 = Math.max(f28, d13);
                f30 = f181;
                f31 = d13;
            }
            if (f30 > d || f31 > d || f28 > d || f23 > d) {
                if (z8Var.h == null && !z8Var.E && arrayList3.isEmpty()) {
                    f32 = f25;
                    f33 = f30 * org.telegram.messenger.i0.T1(0.6f, 1.0f, f32);
                } else {
                    f32 = f25;
                    f33 = 1.0f;
                }
                Paint paint5 = paint2;
                z8Var.e(canvas, paint5, f174, f29, f179, f180, f33 * f26);
                u8 u8Var7 = z8Var.h;
                if (u8Var7 != null && ((z8Var.N || z8Var.E) && (f32 > 0.0f || f24 > 0.0f))) {
                    float f182 = z8Var.w1 - z8Var.z1;
                    float f183 = z8Var.x1 + z8Var.y1;
                    float f184 = u8Var7.g;
                    float f185 = u8Var7.e;
                    float f186 = z8Var.f;
                    float f187 = z8Var.u1;
                    float f188 = ((((u8Var7.h * f185) - f186) / f177) * f187) + f183;
                    canvas3 = canvas;
                    z8Var.e(canvas3, paint5, f182 - f21, f182, ((((f184 * f185) - f186) / f177) * f187) + f183, f188, 0.8f);
                } else if (z8Var.w == null || arrayList3.size() <= i10) {
                    canvas3 = canvas;
                } else {
                    u8 u8Var8 = z8Var.w;
                    RectF rectF17 = u8Var8.j;
                    float f189 = rectF17.top;
                    float f190 = rectF17.bottom;
                    float f191 = z8Var.x1 + z8Var.y1;
                    float f192 = u8Var8.f;
                    float f193 = u8Var8.g;
                    float f194 = u8Var8.e;
                    float f195 = z8Var.f;
                    float f196 = z8Var.u1;
                    float f197 = (((((f193 * f194) + f192) - f195) / f177) * f196) + f191;
                    float f198 = (((((u8Var8.h * f194) + f192) - f195) / f177) * f196) + f191;
                    canvas3 = canvas;
                    z8Var.e(canvas3, paint5, f189, f190, f197, f198, 0.8f);
                }
                if (z8Var.b0 > 1) {
                    u8 u8Var9 = z8Var.h;
                    if (u8Var9 != null) {
                        float f199 = u8Var9.e;
                        float f200 = u8Var9.h;
                        float f201 = u8Var9.g;
                        long j22 = (long) ((f200 - f201) * f199);
                        if (j22 > 68999) {
                            float f202 = z8Var.y1 + z8Var.x1;
                            float f203 = z8Var.f;
                            float f204 = z8Var.u1;
                            float f205 = ((((f201 * f199) - f203) / f177) * f204) + f202;
                            float f206 = ((((f200 * f199) - f203) / f177) * f204) + f202;
                            canvas3.save();
                            float f207 = z8Var.w1 - z8Var.z1;
                            canvas3.clipRect(f205, f207 - f21, f206, f207);
                            z8Var.z0.setAlpha((int) (org.telegram.messenger.i0.T1(0.8f, 1.0f, f27) * 255.0f));
                            i10 = 1;
                            long j23 = 59000;
                            int min8 = (int) Math.min(z8Var.b0 - 1, j22 / 59000);
                            int i43 = 1;
                            while (i43 <= min8) {
                                if (Math.min(j23, j22 - (i43 * j23)) < 1000) {
                                    break;
                                }
                                float f208 = z8Var.y1 + z8Var.x1;
                                u8 u8Var10 = z8Var.h;
                                float f209 = ((((((long) (u8Var10.e * u8Var10.g)) + r2) - z8Var.f) / f177) * z8Var.u1) + f208;
                                float f210 = z8Var.w1 - z8Var.z1;
                                Paint paint6 = z8Var.z0;
                                Canvas canvas4 = canvas3;
                                canvas4.drawRect(f209, (z8Var.w1 - z8Var.z1) - f21, org.telegram.messenger.i0.L(1.0f) + f209, f210, paint6);
                                canvas3 = canvas4;
                                StringBuilder sb2 = new StringBuilder("#");
                                i43++;
                                sb2.append(i43);
                                canvas3.drawText(sb2.toString(), f209 + org.telegram.messenger.i0.L(2.0f), ((z8Var.w1 - z8Var.z1) - f21) + org.telegram.messenger.i0.L(14.0f), z8Var.E0);
                                j23 = 59000;
                            }
                            canvas3.restore();
                        }
                    }
                    i10 = 1;
                } else {
                    i10 = 1;
                }
                float e11 = z8Var.b1.e(false, 0.0f);
                float contentHeight = ((z8Var.w1 - z8Var.getContentHeight()) + z8Var.z1) - org.telegram.messenger.i0.N(2.3f);
                float N5 = org.telegram.messenger.i0.N(4.3f) + (z8Var.w1 - z8Var.z1);
                if (e11 > 0.0f) {
                    long j24 = z8Var.c1;
                    if (j24 == -1) {
                        u8 u8Var11 = z8Var.h;
                        if (u8Var11 != null) {
                            j24 = (long) (u8Var11.e * u8Var11.h);
                        } else {
                            u8 u8Var12 = z8Var.w;
                            if (u8Var12 != null) {
                                j24 = (long) ((u8Var12.h - u8Var12.g) * u8Var12.e);
                            } else {
                                if (z8Var.E) {
                                    f34 = z8Var.H;
                                    f35 = z8Var.K;
                                } else {
                                    f34 = z8Var.R;
                                    f35 = z8Var.T;
                                }
                                j24 = (long) (f34 * f35);
                            }
                        }
                    }
                    z8Var = this;
                    z8Var.d(canvas3, contentHeight, N5, j24, e11 * f26);
                } else {
                    z8Var = z8Var;
                }
                z8Var.d(canvas, contentHeight, N5, z8Var.e, (1.0f - e11) * f26);
            }
            if (z10) {
                canvas.restore();
            }
        } else {
            i10 = 1;
            j11 = j10;
        }
        if (z8Var.m1) {
            float f211 = 1.0f / (1000.0f / org.telegram.messenger.i0.r);
            float f212 = z8Var.n1;
            long L2 = (long) ((org.telegram.messenger.i0.L(32.0f) / z8Var.u1) * j11 * f211 * f212);
            if (z8Var.X0) {
                z8Var.n1 = (f211 * 0.25f) + f212;
            }
            int i44 = z8Var.h1;
            if (i44 == 4 && (u8Var2 = z8Var.h) != null) {
                float f213 = u8Var2.g;
                long j25 = z8Var.f;
                long j26 = u8Var2.e;
                float f214 = j26;
                if (f213 < j25 / f214) {
                    i12 = -1;
                } else if (u8Var2.h > (j25 + j11) / f214) {
                    i12 = i10;
                } else {
                    z8Var.n1 = 1.0f;
                    i12 = 0;
                }
                long j27 = i12 * L2;
                z8Var.f = Utilities.k(j25 + j27, j26 - j11, 0L);
                z8Var.e += j27;
                u8 u8Var13 = z8Var.h;
                float f215 = (r3 - j25) / u8Var13.e;
                if (f215 > 0.0f) {
                    f10 = 1.0f;
                    max = Math.min(1.0f - u8Var13.h, f215);
                } else {
                    f10 = 1.0f;
                    max = Math.max(0.0f - u8Var13.g, f215);
                }
                u8 u8Var14 = z8Var.h;
                u8Var14.g = Utilities.i(u8Var14.g + max, f10, 0.0f);
                u8 u8Var15 = z8Var.h;
                u8Var15.h = Utilities.i(u8Var15.h + max, f10, 0.0f);
                t8 t8Var = z8Var.a;
                if (t8Var != null) {
                    t8Var.q(false, z8Var.h.g);
                    z8Var.a.J(z8Var.h.h);
                }
                z8Var.invalidate();
            } else if (i44 == 8) {
                float f216 = z8Var.S;
                long j28 = z8Var.Q;
                float f217 = (-j28) + 100;
                long j29 = z8Var.R;
                float f218 = j29;
                if (f216 < f217 / f218) {
                    i11 = -1;
                } else if (z8Var.T >= ((r8 + j11) - 100) / f218) {
                    i11 = i10;
                } else {
                    z8Var.n1 = 1.0f;
                    i11 = 0;
                }
                if (i11 != 0) {
                    if (z8Var.P && (u8Var = z8Var.h) != null) {
                        long j30 = j28 - (i11 * L2);
                        float f219 = u8Var.h;
                        float f220 = u8Var.e;
                        z8Var.Q = Utilities.k(j30, (long) ((f219 * f220) - (f216 * f218)), (long) ((u8Var.g * f220) - (z8Var.T * f218)));
                    } else if (z8Var.G && z8Var.E) {
                        long j31 = j28 - (i11 * L2);
                        float f221 = z8Var.K;
                        float f222 = z8Var.H;
                        z8Var.Q = Utilities.k(j31, (long) ((f221 * f222) - (f216 * f218)), (long) ((z8Var.J * f222) - (z8Var.T * f218)));
                    } else {
                        z8Var.Q = Utilities.k(j28 - (i11 * L2), 0L, -(j29 - Math.min(z8Var.getBaseDuration(), z8Var.getMaxScrollDuration())));
                    }
                    float f223 = (-(z8Var.Q - j28)) / z8Var.R;
                    float min9 = f223 > 0.0f ? Math.min(1.0f - z8Var.T, f223) : Math.max(0.0f - z8Var.S, f223);
                    if (z8Var.h == null) {
                        float f224 = z8Var.e;
                        float f225 = z8Var.R;
                        z8Var.e = (long) Utilities.i((min9 * f225) + f224, f225, 0.0f);
                    }
                    z8Var.S = Utilities.i(z8Var.S + min9, 1.0f, 0.0f);
                    z8Var.T = Utilities.i(z8Var.T + min9, 1.0f, 0.0f);
                    t8 t8Var2 = z8Var.a;
                    if (t8Var2 != null) {
                        t8Var2.F(z8Var.S);
                        z8Var.a.D(z8Var.T);
                        z8Var.a.j(z8Var.e, false);
                    }
                    z8Var.invalidate();
                } else {
                    z8Var.n1 = 1.0f;
                }
            } else {
                z8Var.n1 = 1.0f;
            }
        } else {
            z8Var.n1 = 1.0f;
        }
        int contentHeight2 = z8Var.getContentHeight();
        if (z8Var.c != contentHeight2) {
            z8Var.c = contentHeight2;
            Runnable runnable = z8Var.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(Canvas canvas, Paint paint, float f7, float f10, float f11, float f12, float f13) {
        if (f13 <= 0.0f) {
            return;
        }
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(f11 - org.telegram.messenger.i0.L(10.0f), f7, org.telegram.messenger.i0.L(10.0f) + f12, f10);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.v1, this.w1, zs.e4, 31);
        int i10 = (int) (255.0f * f13);
        Paint paint2 = this.z0;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(6.0f), paint2);
        rectF.inset(org.telegram.messenger.i0.L(this.X0 ? 2.5f : 10.0f), org.telegram.messenger.i0.L(2.0f));
        boolean z10 = this.X0;
        Paint paint3 = this.A0;
        if (z10) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(3.0f), org.telegram.messenger.i0.L(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float L = org.telegram.messenger.i0.L(2.0f);
        float L2 = org.telegram.messenger.i0.L(10.0f);
        Paint paint4 = this.B0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(zs.e4);
        paint5.setAlpha(i10);
        float f14 = f7 + f10;
        float f15 = (f14 - L2) / 2.0f;
        float f16 = (f14 + L2) / 2.0f;
        rectF.set(org.telegram.messenger.m5.y(org.telegram.messenger.i0.L(this.X0 ? 2.0f : 10.0f), L, 2.0f, f11), f15, f11 - ((org.telegram.messenger.i0.L(this.X0 ? 2.0f : 10.0f) + L) / 2.0f), f16);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint5);
            if (paint != null && !this.X0) {
                paint4.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint4);
            }
        }
        rectF.set(c3.i0.B(org.telegram.messenger.i0.L(this.X0 ? 2.5f : 10.0f), L, 2.0f, f12), f15, org.telegram.messenger.m5.a(org.telegram.messenger.i0.L(this.X0 ? 2.5f : 10.0f), L, 2.0f, f12), f16);
        if (!this.X0) {
            canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f13 * 48.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(1.0f), org.telegram.messenger.i0.L(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.b0 * 59000;
    }

    public final long g() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public int getContentHeight() {
        return (int) (this.z1 + (this.h != null ? getVideoHeight() + org.telegram.messenger.i0.L(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + org.telegram.messenger.i0.L(4.0f)) + (this.E ? getRoundHeight() + org.telegram.messenger.i0.L(4.0f) : 0.0f) + (this.N ? org.telegram.messenger.i0.L(4.0f) + getAudioHeight() : 0.0f) + this.z1);
    }

    public int getMaxCount() {
        return this.b0;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, (long) (f() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return org.telegram.messenger.i0.W1(this.i0.c, org.telegram.messenger.i0.L(28.0f) + this.z1 + this.z1, getContentHeight());
    }

    public final void h(float f7) {
        float f10;
        long j10;
        float f11;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        t8 t8Var;
        long k10;
        u8 u8Var = this.h;
        if (u8Var == null && !this.E) {
            long j16 = this.Q;
            long k11 = Utilities.k(j16 + ((long) f7), 0L, -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.Q = k11;
            float f12 = k11 - j16;
            this.S = Utilities.i(this.S - (f12 / this.R), 1.0f, 0.0f);
            this.T = Utilities.i(this.T - (f12 / this.R), 1.0f, 0.0f);
            t8 t8Var2 = this.a;
            if (t8Var2 != null) {
                t8Var2.F(this.S);
                this.a.D(this.T);
            }
        } else if (this.P) {
            if (u8Var != null) {
                f10 = u8Var.g;
                j10 = u8Var.e;
            } else {
                f10 = this.J;
                j10 = this.H;
            }
            float f13 = f10 * j10;
            if (u8Var != null) {
                f11 = u8Var.h;
                j11 = u8Var.e;
            } else {
                f11 = this.K;
                j11 = this.H;
            }
            float f14 = f11 * j11;
            float f15 = u8Var != null ? (u8Var.h - u8Var.g) * u8Var.e : this.H * (this.K - this.J);
            float f16 = this.T;
            float f17 = this.R;
            long j17 = (long) (f14 - (f16 * f17));
            float f18 = this.S;
            long j18 = (long) (f13 - (f18 * f17));
            float min = Math.min(f16 - f18, f15 / f17);
            long j19 = this.Q;
            long j20 = (long) f7;
            long j21 = j19 + j20;
            if (j21 > j17) {
                float i10 = Utilities.i(((f14 - j19) - j20) / this.R, 1.0f, min);
                this.T = i10;
                float i11 = Utilities.i(i10 - min, 1.0f, 0.0f);
                this.S = i11;
                float f19 = this.T;
                float f20 = this.R;
                long j22 = (long) (f14 - (f19 * f20));
                long j23 = (long) (f13 - (i11 * f20));
                if (j22 < j23) {
                    j15 = j23;
                    j14 = j22;
                } else {
                    j14 = j23;
                    j15 = j22;
                }
                this.Q = Utilities.k(this.Q + j20, j15, j14);
                t8 t8Var3 = this.a;
                if (t8Var3 != null) {
                    t8Var3.F(this.S);
                    this.a.D(this.T);
                }
            } else if (j21 < j18) {
                float i12 = Utilities.i(((f13 - j19) - j20) / this.R, 1.0f - min, 0.0f);
                this.S = i12;
                float i13 = Utilities.i(i12 + min, 1.0f, 0.0f);
                this.T = i13;
                float f21 = this.R;
                long j24 = (long) (f14 - (i13 * f21));
                long j25 = (long) (f13 - (this.S * f21));
                if (j24 < j25) {
                    j13 = j25;
                    j12 = j24;
                } else {
                    j12 = j25;
                    j13 = j24;
                }
                this.Q = Utilities.k(this.Q + j20, j13, j12);
                t8 t8Var4 = this.a;
                if (t8Var4 != null) {
                    t8Var4.F(this.S);
                    this.a.D(this.T);
                }
            } else {
                this.Q = j21;
            }
        } else {
            long j26 = this.Q + ((long) f7);
            float baseDuration = getBaseDuration();
            float f22 = this.R;
            this.Q = Utilities.k(j26, (long) (baseDuration - (this.T * f22)), (long) ((-this.S) * f22));
        }
        invalidate();
        t8 t8Var5 = this.a;
        if (t8Var5 != null) {
            t8Var5.O(this.Q + ((long) (this.S * this.R)));
        }
        boolean z10 = this.m1;
        if (z10 || (t8Var = this.a) == null) {
            if (z10 || this.r1) {
                u8 u8Var2 = this.h;
                if (u8Var2 != null) {
                    long j27 = this.Q + ((long) (this.S * this.R));
                    float f23 = u8Var2.h;
                    float f24 = u8Var2.e;
                    this.e = Utilities.k(j27, (long) (f23 * f24), (long) (u8Var2.g * f24));
                } else if (!this.E || u8Var2 == null) {
                    float f25 = this.S;
                    long j28 = this.R;
                    this.e = Utilities.k((long) (f25 * j28), j28, 0L);
                } else {
                    long j29 = this.Q + ((long) (this.S * this.R));
                    float f26 = this.K;
                    float f27 = u8Var2.e;
                    this.e = Utilities.k(j29, (long) (f26 * f27), (long) (this.J * f27));
                }
                t8 t8Var6 = this.a;
                if (t8Var6 != null) {
                    t8Var6.j(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        t8Var.t(true);
        u8 u8Var3 = this.h;
        if (u8Var3 != null) {
            long j30 = this.Q + ((long) (this.S * this.R));
            float f28 = u8Var3.h;
            float f29 = u8Var3.e;
            k10 = Utilities.k(j30, (long) (f28 * f29), (long) (u8Var3.g * f29));
        } else if (this.E) {
            long j31 = this.Q + ((long) (this.S * this.R));
            float f30 = this.K;
            float f31 = this.H;
            k10 = Utilities.k(j31, (long) (f30 * f31), (long) (this.J * f31));
        } else {
            float f32 = this.S;
            long j32 = this.R;
            k10 = Utilities.k((long) (f32 * j32), j32, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.c1 = this.e;
            this.b1.e(true, 1.0f);
        }
        t8 t8Var7 = this.a;
        this.e = k10;
        t8Var7.j(k10, false);
    }

    public final void i(u8 u8Var, float f7) {
        t8 t8Var;
        long k10;
        long j10;
        long j11;
        long j12;
        long j13;
        if (u8Var == null) {
            return;
        }
        u8 u8Var2 = this.w;
        if (u8Var2 != u8Var && u8Var2 != null) {
            if (this.n == this.s.indexOf(u8Var)) {
                u8 u8Var3 = this.w;
                float f10 = u8Var3.e;
                float f11 = u8Var.h;
                float f12 = u8Var.e;
                long j14 = (long) ((f10 * 1.0f) - (f11 * f12));
                float f13 = u8Var.g;
                long j15 = (long) ((f10 * 0.0f) - (f13 * f12));
                float min = Math.min(f11 - f13, ((u8Var3.h - u8Var3.g) * f10) / f12);
                long j16 = u8Var.f;
                long j17 = (long) f7;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float i10 = Utilities.i((((this.w.h * r2.e) - j16) - j17) / u8Var.e, 1.0f, min);
                    u8Var.h = i10;
                    float i11 = Utilities.i(i10 - min, 1.0f, 0.0f);
                    u8Var.g = i11;
                    u8 u8Var4 = this.w;
                    float f14 = u8Var4.h;
                    float f15 = u8Var4.e;
                    float f16 = u8Var.h;
                    float f17 = u8Var.e;
                    long j19 = (long) ((f14 * f15) - (f16 * f17));
                    long j20 = (long) ((u8Var4.g * f15) - (i11 * f17));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    u8Var.f = Utilities.k(u8Var.f + j17, j13, j12);
                    t8 t8Var2 = this.a;
                    if (t8Var2 != null) {
                        t8Var2.B(u8Var.g, u8Var.a);
                        this.a.H(u8Var.h, u8Var.a);
                    }
                } else if (j18 < j15) {
                    float i12 = Utilities.i((((this.w.g * r2.e) - j16) - j17) / u8Var.e, 1.0f - min, 0.0f);
                    u8Var.g = i12;
                    float i13 = Utilities.i(i12 + min, 1.0f, 0.0f);
                    u8Var.h = i13;
                    u8 u8Var5 = this.w;
                    float f18 = u8Var5.h;
                    float f19 = u8Var5.e;
                    float f20 = u8Var.e;
                    long j21 = (long) ((f18 * f19) - (i13 * f20));
                    long j22 = (long) ((u8Var5.g * f19) - (u8Var.g * f20));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    u8Var.f = Utilities.k(u8Var.f + j17, j11, j10);
                    t8 t8Var3 = this.a;
                    if (t8Var3 != null) {
                        t8Var3.B(u8Var.g, u8Var.a);
                        this.a.H(u8Var.h, u8Var.a);
                    }
                } else {
                    u8Var.f = j18;
                }
            } else {
                long j23 = u8Var.f + ((long) f7);
                float baseDuration = getBaseDuration();
                float f21 = u8Var.e;
                u8Var.f = Utilities.k(j23, (long) (baseDuration - (u8Var.h * f21)), (long) ((-u8Var.g) * f21));
            }
        }
        invalidate();
        t8 t8Var4 = this.a;
        if (t8Var4 != null) {
            t8Var4.N(u8Var.a, u8Var.f);
        }
        boolean z10 = this.m1;
        if (z10 || (t8Var = this.a) == null) {
            if (z10 || this.r1) {
                u8 u8Var6 = this.w;
                if (u8Var6 == u8Var || u8Var6 == null) {
                    float f22 = u8Var.g;
                    long j24 = u8Var.e;
                    this.e = Utilities.k((long) (f22 * j24), j24, 0L);
                } else {
                    long j25 = u8Var.f + ((long) (u8Var.g * u8Var.e));
                    float f23 = u8Var6.h;
                    float f24 = u8Var6.e;
                    this.e = Utilities.k(j25, (long) (f23 * f24), (long) (u8Var6.g * f24));
                }
                t8 t8Var5 = this.a;
                if (t8Var5 != null) {
                    t8Var5.j(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        t8Var.t(true);
        u8 u8Var7 = this.w;
        if (u8Var7 == u8Var || u8Var7 == null) {
            float f25 = u8Var.g;
            long j26 = u8Var.e;
            k10 = Utilities.k((long) (f25 * j26), j26, 0L);
        } else {
            long j27 = u8Var.f + ((long) (u8Var.g * u8Var.e));
            float f26 = u8Var7.h;
            float f27 = u8Var7.e;
            k10 = Utilities.k(j27, (long) (f26 * f27), (long) (u8Var7.g * f27));
        }
        u8 u8Var8 = this.w;
        if (u8Var8 != u8Var && u8Var8 != null && Math.abs(this.e - k10) > 400) {
            this.c1 = this.e;
            this.b1.e(true, 1.0f);
        }
        t8 t8Var6 = this.a;
        this.e = k10;
        t8Var6.j(k10, false);
    }

    public final void j(float f7) {
        long j10;
        long j11;
        long j12;
        long j13;
        t8 t8Var;
        long k10;
        u8 u8Var = this.h;
        if (u8Var == null) {
            long j14 = this.I;
            long k11 = Utilities.k(j14 + ((long) f7), 0L, -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.I = k11;
            float f10 = k11 - j14;
            this.J = Utilities.i(this.J - (f10 / this.H), 1.0f, 0.0f);
            this.K = Utilities.i(this.K - (f10 / this.H), 1.0f, 0.0f);
            t8 t8Var2 = this.a;
            if (t8Var2 != null) {
                t8Var2.r(this.J);
                this.a.L(this.K);
            }
        } else if (this.G) {
            float f11 = u8Var.h;
            float f12 = u8Var.e;
            float f13 = this.K;
            float f14 = this.H;
            long j15 = (long) ((f11 * f12) - (f13 * f14));
            float f15 = u8Var.g;
            float f16 = this.J;
            long j16 = (long) ((f15 * f12) - (f16 * f14));
            float min = Math.min(f13 - f16, ((f11 - f15) * f12) / f14);
            long j17 = this.I;
            long j18 = (long) f7;
            long j19 = j17 + j18;
            if (j19 > j15) {
                float i10 = Utilities.i((((this.h.h * r1.e) - j17) - j18) / this.H, 1.0f, min);
                this.K = i10;
                float i11 = Utilities.i(i10 - min, 1.0f, 0.0f);
                this.J = i11;
                u8 u8Var2 = this.h;
                float f17 = u8Var2.h;
                float f18 = u8Var2.e;
                float f19 = this.K;
                float f20 = this.H;
                long j20 = (long) ((f17 * f18) - (f19 * f20));
                long j21 = (long) ((u8Var2.g * f18) - (i11 * f20));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.I = Utilities.k(this.I + j18, j13, j12);
                t8 t8Var3 = this.a;
                if (t8Var3 != null) {
                    t8Var3.r(this.J);
                    this.a.L(this.K);
                }
            } else if (j19 < j16) {
                float i12 = Utilities.i((((this.h.g * r1.e) - j17) - j18) / this.H, 1.0f - min, 0.0f);
                this.J = i12;
                float i13 = Utilities.i(i12 + min, 1.0f, 0.0f);
                this.K = i13;
                u8 u8Var3 = this.h;
                float f21 = u8Var3.h;
                float f22 = u8Var3.e;
                float f23 = this.H;
                long j22 = (long) ((f21 * f22) - (i13 * f23));
                long j23 = (long) ((u8Var3.g * f22) - (this.J * f23));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.I = Utilities.k(this.I + j18, j11, j10);
                t8 t8Var4 = this.a;
                if (t8Var4 != null) {
                    t8Var4.r(this.J);
                    this.a.L(this.K);
                }
            } else {
                this.I = j19;
            }
        } else {
            long j24 = this.I + ((long) f7);
            float baseDuration = getBaseDuration();
            float f24 = this.H;
            this.I = Utilities.k(j24, (long) (baseDuration - (this.K * f24)), (long) ((-this.J) * f24));
        }
        invalidate();
        t8 t8Var5 = this.a;
        if (t8Var5 != null) {
            t8Var5.z(this.I + ((long) (this.J * this.H)));
        }
        boolean z10 = this.m1;
        if (z10 || (t8Var = this.a) == null) {
            if (z10 || this.r1) {
                u8 u8Var4 = this.h;
                if (u8Var4 != null) {
                    long j25 = this.I + ((long) (this.J * this.H));
                    float f25 = u8Var4.h;
                    float f26 = u8Var4.e;
                    this.e = Utilities.k(j25, (long) (f25 * f26), (long) (u8Var4.g * f26));
                } else {
                    float f27 = this.J;
                    long j26 = this.H;
                    this.e = Utilities.k((long) (f27 * j26), j26, 0L);
                }
                t8 t8Var6 = this.a;
                if (t8Var6 != null) {
                    t8Var6.j(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        t8Var.t(true);
        u8 u8Var5 = this.h;
        if (u8Var5 != null) {
            long j27 = this.I + ((long) (this.J * this.H));
            float f28 = u8Var5.h;
            float f29 = u8Var5.e;
            k10 = Utilities.k(j27, (long) (f28 * f29), (long) (u8Var5.g * f29));
        } else {
            float f30 = this.J;
            long j28 = this.H;
            k10 = Utilities.k((long) (f30 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - k10) > 400) {
            this.c1 = this.e;
            this.b1.e(true, 1.0f);
        }
        t8 t8Var7 = this.a;
        this.e = k10;
        t8Var7.j(k10, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        u8 u8Var = this.h;
        float f7 = (u8Var.h + u8Var.g) / 2.0f;
        long j10 = u8Var.e;
        this.f = Utilities.k((long) ((f7 * j10) - (min / 2.0f)), j10 - min, 0L);
        invalidate();
    }

    public final void l(boolean z10) {
        if (z10 && this.E) {
            this.G = true;
            this.P = false;
        } else {
            this.G = false;
            this.P = this.N && this.h == null;
        }
        invalidate();
    }

    public final boolean m(boolean z10, float f7) {
        u8 u8Var = this.h;
        ArrayList arrayList = this.s;
        if (u8Var == null && !this.N && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f10 = ((f7 - this.y1) - this.x1) / this.u1;
        u8 u8Var2 = this.w;
        long j10 = u8Var2 != null ? (long) ((u8Var2.g * u8Var2.e) + u8Var2.f) : 0L;
        float f11 = f10 * min;
        if (u8Var2 == null) {
            j10 = this.h == null ? this.Q : 0L;
        }
        long i10 = (long) Utilities.i((f11 - j10) + this.f, getBaseDuration(), 0.0f);
        u8 u8Var3 = this.h;
        if (u8Var3 != null) {
            float f12 = i10 / u8Var3.e;
            if (f12 < u8Var3.g || f12 > u8Var3.h) {
                return false;
            }
        }
        u8 u8Var4 = this.w;
        if (u8Var4 != null && (i10 < 0 || i10 >= ((long) ((u8Var4.h - u8Var4.g) * u8Var4.e)))) {
            return false;
        }
        if (this.N && u8Var3 == null && arrayList.isEmpty()) {
            float f13 = i10 / this.R;
            if (f13 < this.S || f13 > this.T) {
                return false;
            }
        }
        this.e = i10;
        invalidate();
        t8 t8Var = this.a;
        if (t8Var != null) {
            t8Var.j(i10, z10);
        }
        q8 q8Var = this.d1;
        if (q8Var != null) {
            org.telegram.messenger.i0.r(q8Var);
            this.d1 = null;
        }
        if (!z10) {
            return true;
        }
        q8 q8Var2 = new q8(this, i10, 0);
        this.d1 = q8Var2;
        org.telegram.messenger.i0.h3(q8Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f7, float f10, float f11, boolean z10) {
        boolean z11;
        long j12;
        boolean z12;
        u8 u8Var;
        if (TextUtils.equals(this.F, str)) {
            return;
        }
        x8 x8Var = this.M;
        if (x8Var != null) {
            x8Var.b();
            this.M = null;
        }
        long j13 = this.H;
        if (str != null) {
            this.F = str;
            this.H = j10;
            this.I = j11 - ((long) (j10 * f7));
            this.J = f7;
            this.K = f10;
            this.L = f11;
            if (getMeasuredWidth() <= 0 || this.M != null || ((u8Var = this.h) != null && u8Var.e < 1)) {
                z11 = false;
                j12 = j13;
                z12 = true;
            } else {
                String str2 = this.F;
                int i10 = this.v1;
                int i11 = this.y1;
                int i12 = (i10 - i11) - i11;
                int L = org.telegram.messenger.i0.L(38.0f);
                long j14 = this.H;
                Long valueOf = j14 > 2 ? Long.valueOf(j14) : null;
                u8 u8Var2 = this.h;
                j12 = j13;
                z11 = false;
                z12 = true;
                this.M = new x8(this, false, str2, i12, L, valueOf, u8Var2 != null ? u8Var2.e : getMaxScrollDuration(), -1L, -1L, new p8(this, 0));
            }
            if (this.h == null) {
                this.P = z11;
                this.G = z12;
            }
        } else {
            z11 = false;
            j12 = j13;
            z12 = true;
            this.F = null;
            this.H = 1L;
            this.G = false;
        }
        this.E = this.F != null ? z12 : z11;
        if (j12 != j10 && this.h == null && this.a0 != null) {
            this.W = z12;
            p();
        }
        if (this.N && this.E && this.h == null) {
            this.S = 0.0f;
            this.T = Utilities.i(j10 / this.R, 1.0f, 0.0f);
        }
        if (!z10) {
            this.d0.f(this.G, z12);
            this.f0.f(this.P, z12);
            this.c0.f(this.E, z12);
        }
        invalidate();
    }

    public final void o(boolean z10, String str, long j10, float f7) {
        u8 u8Var = this.h;
        if (TextUtils.equals(u8Var == null ? null : u8Var.d, str)) {
            return;
        }
        u8 u8Var2 = this.h;
        if (u8Var2 != null) {
            x8 x8Var = u8Var2.c;
            if (x8Var != null) {
                x8Var.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            u8 u8Var3 = new u8(this);
            this.h = u8Var3;
            u8Var3.b = z10;
            u8Var3.d = str;
            u8Var3.e = j10;
            u8Var3.i = f7;
            u8.a(u8Var3, false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.E) {
            this.G = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.L0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        this.P0.setTextSize(org.telegram.messenger.i0.L(12.0f));
        int L = org.telegram.messenger.i0.L(12.0f);
        this.y1 = L;
        int L2 = org.telegram.messenger.i0.L(5.0f);
        this.z1 = L2;
        setPadding(L, L2, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.v1 = size;
        int L3 = org.telegram.messenger.i0.L(388);
        this.w1 = L3;
        setMeasuredDimension(size, L3);
        int L4 = org.telegram.messenger.i0.L(10.0f);
        this.x1 = L4;
        this.u1 = (this.v1 - (L4 * 2)) - (this.y1 * 2);
        u8 u8Var = this.h;
        if (u8Var != null && u8Var.d != null && u8Var.c == null) {
            u8.a(u8Var, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                u8 u8Var2 = (u8) obj;
                if (u8Var2.d != null && u8Var2.c == null) {
                    u8.a(u8Var2, false);
                    u8.b(u8Var2);
                }
            }
        }
        if (this.O == null || this.a0 != null) {
            return;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03ef  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03f6  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0d6d  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0d97  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        q8 q8Var;
        boolean z11;
        VelocityTracker velocityTracker;
        t8 t8Var;
        VelocityTracker velocityTracker2;
        long j10;
        boolean z12;
        long j11;
        long j12;
        long j13;
        float f7;
        VelocityTracker velocityTracker3;
        long j14;
        long j15;
        VelocityTracker velocityTracker4;
        VelocityTracker velocityTracker5;
        Runnable runnable;
        VelocityTracker velocityTracker6;
        float e;
        float v;
        float e7;
        boolean z13;
        float v10;
        boolean z14;
        t8 t8Var2;
        int i10;
        float f10;
        float f11;
        boolean z15;
        float f12;
        float i11;
        t8 t8Var3;
        t8 t8Var4;
        int i12;
        float f13;
        float f14;
        u8 u8Var = this.h;
        ArrayList arrayList = this.s;
        if (u8Var != null || !arrayList.isEmpty() || this.N || this.E) {
            float timelineHeight = this.w1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                zl0 zl0Var = this.W0;
                rh.r4 r4Var = this.Y0;
                if (action == 0) {
                    q8 q8Var2 = this.d1;
                    if (q8Var2 != null) {
                        org.telegram.messenger.i0.r(q8Var2);
                        this.d1 = null;
                    }
                    zl0Var.a();
                    this.i1 = -1;
                    this.h1 = c(motionEvent);
                    this.j1 = -1;
                    this.k1 = -1;
                    int i13 = this.w1 - this.z1;
                    if (!this.j0) {
                        if (this.o0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.j1 = 10;
                            this.h1 = -1;
                        }
                    }
                    float f15 = 2.0f;
                    if (this.j1 != -1 || this.h == null) {
                        f13 = 4.0f;
                    } else {
                        float f16 = i13;
                        if (motionEvent.getY() < f16) {
                            f13 = 4.0f;
                            if (motionEvent.getY() > (f16 - getVideoHeight()) - org.telegram.messenger.i0.L(2.0f)) {
                                this.j1 = 0;
                            }
                        } else {
                            f13 = 4.0f;
                        }
                        i13 = (int) (f16 - (getVideoHeight() + org.telegram.messenger.i0.L(f13)));
                    }
                    if (this.j1 == -1 && !arrayList.isEmpty()) {
                        int i14 = 0;
                        while (i14 < arrayList.size()) {
                            f14 = f15;
                            float W1 = org.telegram.messenger.i0.W1(((u8) arrayList.get(i14)).k.c, org.telegram.messenger.i0.L(28.0f), org.telegram.messenger.i0.L(38.0f));
                            float f17 = i13;
                            if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - W1) - org.telegram.messenger.i0.L(f14)) {
                                this.j1 = 3;
                                this.k1 = i14;
                                break;
                            }
                            i13 = (int) (f17 - (W1 + org.telegram.messenger.i0.L(f13)));
                            i14++;
                            f15 = f14;
                        }
                    }
                    f14 = f15;
                    if (this.j1 == -1 && this.E) {
                        float f18 = i13;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getRoundHeight()) - org.telegram.messenger.i0.L(f14)) {
                            this.j1 = 1;
                        }
                        i13 = (int) (f18 - (getRoundHeight() + org.telegram.messenger.i0.L(f13)));
                    }
                    if (this.j1 == -1 && this.N) {
                        float f19 = i13;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getAudioHeight()) - org.telegram.messenger.i0.L(f14)) {
                            this.j1 = 2;
                        }
                        getAudioHeight();
                        org.telegram.messenger.i0.L(f13);
                    }
                    this.f1 = System.currentTimeMillis();
                    int i15 = this.h1;
                    this.l1 = i15 == 0 || i15 == -1 || i15 == 1;
                    this.o1 = false;
                    if (i15 == 1 || i15 == 5 || i15 == 8) {
                        this.p1 = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker7 = this.p1;
                        if (velocityTracker7 != null) {
                            velocityTracker7.recycle();
                            this.p1 = null;
                        }
                    }
                    this.n1 = 1.0f;
                    this.m1 = false;
                    this.g1 = motionEvent.getX();
                    if (!this.X0) {
                        org.telegram.messenger.i0.r(r4Var);
                        org.telegram.messenger.i0.h3(r4Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.g1;
                    if (this.j0 && (this.m1 || Math.abs(x10) > org.telegram.messenger.i0.e)) {
                        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
                        u8 u8Var2 = this.h;
                        if (u8Var2 != null && this.h1 == 1) {
                            this.f = (long) Utilities.i(this.f - ((x10 / this.u1) * min), u8Var2.e - min, 0.0f);
                            invalidate();
                            if (!this.m1) {
                                this.n1 = 1.0f;
                            }
                            this.m1 = true;
                            this.l1 = false;
                        } else if (u8Var2 == null || !((i12 = this.h1) == 2 || i12 == 3 || i12 == 4)) {
                            int i16 = this.h1;
                            if (i16 == 6 || i16 == 7 || i16 == 8) {
                                float f20 = (min / this.R) * (x10 / this.u1);
                                if (i16 == 6) {
                                    float g10 = this.T - (g() / this.R);
                                    float max = Math.max(0L, this.f - this.Q);
                                    float f21 = this.R;
                                    float f22 = max / f21;
                                    u8 u8Var3 = this.h;
                                    if (u8Var3 != null) {
                                        v = Math.max(f22, (((u8Var3.g * u8Var3.e) + this.f) - this.Q) / f21);
                                    } else {
                                        u8 u8Var4 = this.w;
                                        if (u8Var4 != null) {
                                            v = Math.max(f22, (((u8Var4.g * u8Var4.e) + this.f) - this.Q) / f21);
                                        } else if (this.E) {
                                            v = Math.max(f22, (((this.J * this.H) + this.f) - this.Q) / f21);
                                        } else {
                                            v = org.telegram.ui.Cells.f1.v(f(), this.R, this.T, f22);
                                            if (!this.o1 && f20 < 0.0f && this.S <= this.T - (f() / this.R)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f23 = this.S;
                                    float i17 = Utilities.i(f23 + f20, g10, v);
                                    this.S = i17;
                                    if (Math.abs(f23 - i17) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    t8 t8Var5 = this.a;
                                    if (t8Var5 != null) {
                                        t8Var5.O(this.Q + ((long) (this.S * this.R)));
                                    }
                                    t8 t8Var6 = this.a;
                                    if (t8Var6 != null) {
                                        t8Var6.F(this.S);
                                    }
                                } else if (i16 == 7) {
                                    float min2 = Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min) / this.R);
                                    float f24 = this.S;
                                    float g11 = g();
                                    float f25 = this.R;
                                    float f26 = (g11 / f25) + f24;
                                    u8 u8Var5 = this.h;
                                    if (u8Var5 != null) {
                                        e = Math.min(min2, (((u8Var5.h * u8Var5.e) + this.f) - this.Q) / f25);
                                    } else {
                                        u8 u8Var6 = this.w;
                                        if (u8Var6 != null) {
                                            e = Math.min(min2, (((u8Var6.h * u8Var6.e) + this.f) - this.Q) / f25);
                                        } else if (this.E) {
                                            e = Math.min(min2, (((this.K * this.H) + this.f) - this.Q) / f25);
                                        } else {
                                            e = org.telegram.ui.Cells.f1.e(f(), this.R, this.S, min2);
                                            if (!this.o1 && f20 > 0.0f) {
                                                if (this.T >= (f() / this.R) + this.S) {
                                                    this.h1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f27 = this.T;
                                    float i18 = Utilities.i(f27 + f20, e, f26);
                                    this.T = i18;
                                    if (Math.abs(f27 - i18) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    t8 t8Var7 = this.a;
                                    if (t8Var7 != null) {
                                        t8Var7.D(this.T);
                                    }
                                }
                                if (this.h1 == 8) {
                                    float min3 = f20 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.Q) + min) / this.R) - this.T), f20) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.Q) / this.R) - this.S), f20);
                                    float f28 = this.S + min3;
                                    this.S = f28;
                                    this.T += min3;
                                    t8 t8Var8 = this.a;
                                    if (t8Var8 != null) {
                                        t8Var8.F(f28);
                                        this.a.O(this.Q + ((long) (this.S * this.R)));
                                        this.a.D(this.T);
                                    }
                                    t8 t8Var9 = this.a;
                                    if (t8Var9 != null) {
                                        t8Var9.t(true);
                                    }
                                }
                                if (this.h == null && !this.E) {
                                    this.e = (long) (this.S * this.R);
                                    t8 t8Var10 = this.a;
                                    if (t8Var10 != null) {
                                        t8Var10.t(true);
                                        this.a.j(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.m1) {
                                    this.n1 = 1.0f;
                                }
                                this.m1 = true;
                                this.l1 = false;
                            } else if (i16 == 10 || i16 == 11 || i16 == 12) {
                                float f29 = (min / this.H) * (x10 / this.u1);
                                if (i16 == 10) {
                                    float g12 = this.K - (g() / this.H);
                                    float max2 = Math.max(0L, this.f - this.I);
                                    float f30 = this.H;
                                    float f31 = max2 / f30;
                                    u8 u8Var7 = this.h;
                                    if (u8Var7 != null) {
                                        v10 = Math.max(f31, (((u8Var7.g * u8Var7.e) + this.f) - this.I) / f30);
                                    } else {
                                        u8 u8Var8 = this.w;
                                        if (u8Var8 != null) {
                                            v10 = Math.max(f31, (((u8Var8.g * u8Var8.e) + this.f) - this.I) / f30);
                                        } else {
                                            v10 = org.telegram.ui.Cells.f1.v(f(), this.H, this.K, f31);
                                            if (!this.o1 && f29 < 0.0f && this.J <= this.K - (f() / this.H)) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f32 = this.J;
                                    float i19 = Utilities.i(f32 + f29, g12, v10);
                                    this.J = i19;
                                    if (Math.abs(f32 - i19) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    t8 t8Var11 = this.a;
                                    if (t8Var11 != null) {
                                        t8Var11.z(this.I + ((long) (this.J * this.H)));
                                    }
                                    t8 t8Var12 = this.a;
                                    if (t8Var12 != null) {
                                        t8Var12.r(this.J);
                                    }
                                } else if (i16 == 11) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.I) + min) / this.H);
                                    float f33 = this.J;
                                    float g13 = g();
                                    float f34 = this.H;
                                    float f35 = (g13 / f34) + f33;
                                    u8 u8Var9 = this.h;
                                    if (u8Var9 != null) {
                                        min4 = Math.min(min4, (((u8Var9.h * u8Var9.e) + this.f) - this.I) / f34);
                                    }
                                    u8 u8Var10 = this.w;
                                    if (u8Var10 != null) {
                                        e7 = Math.min(min4, (((u8Var10.h * u8Var10.e) + this.f) - this.I) / this.H);
                                    } else {
                                        e7 = org.telegram.ui.Cells.f1.e(f(), this.H, this.J, min4);
                                        if (!this.o1 && f29 > 0.0f) {
                                            if (this.K >= (f() / this.H) + this.J) {
                                                this.h1 = 8;
                                            }
                                        }
                                    }
                                    float f36 = this.K;
                                    float i20 = Utilities.i(f36 + f29, e7, f35);
                                    this.K = i20;
                                    if (Math.abs(f36 - i20) > 0.01f) {
                                        this.o1 = true;
                                    }
                                    t8 t8Var13 = this.a;
                                    if (t8Var13 != null) {
                                        t8Var13.L(this.K);
                                    }
                                }
                                if (this.h1 == 12) {
                                    float min5 = f29 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.I) + min) / this.H) - this.K, f29) : Math.max((Math.max(0L, this.f - this.I) / this.H) - this.J, f29);
                                    float f37 = this.J + min5;
                                    this.J = f37;
                                    this.K += min5;
                                    t8 t8Var14 = this.a;
                                    if (t8Var14 != null) {
                                        t8Var14.r(f37);
                                        this.a.z(this.I + ((long) (this.J * this.H)));
                                        this.a.L(this.K);
                                    }
                                    t8 t8Var15 = this.a;
                                    if (t8Var15 != null) {
                                        t8Var15.t(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.J * this.H);
                                    t8 t8Var16 = this.a;
                                    if (t8Var16 != null) {
                                        t8Var16.t(true);
                                        z13 = false;
                                        this.a.j(this.e, false);
                                        invalidate();
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = z13;
                                    }
                                }
                                z13 = false;
                                invalidate();
                                if (!this.m1) {
                                }
                                this.m1 = true;
                                this.l1 = z13;
                            } else {
                                int i21 = this.i1;
                                if (i21 < 0 || i21 >= arrayList.size() || !((i10 = this.h1) == 13 || i10 == 14 || i10 == 15)) {
                                    int i22 = this.h1;
                                    if (i22 == 5) {
                                        h((x10 / this.u1) * min);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else if (i22 == 9) {
                                        j((x10 / this.u1) * min);
                                        if (!this.m1) {
                                            this.n1 = 1.0f;
                                        }
                                        this.m1 = true;
                                        this.l1 = false;
                                    } else {
                                        int i23 = this.i1;
                                        if (i23 >= 0 && i23 < arrayList.size() && this.h1 == 16) {
                                            i((u8) arrayList.get(this.i1), (x10 / this.u1) * min);
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = true;
                                            this.l1 = false;
                                        } else if (this.l1) {
                                            m(currentTimeMillis - this.e1 < 350, motionEvent.getX());
                                            if (this.m1 || (t8Var2 = this.a) == null) {
                                                z14 = true;
                                            } else {
                                                z14 = true;
                                                t8Var2.t(true);
                                            }
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z14;
                                        }
                                    }
                                } else {
                                    u8 u8Var11 = (u8) arrayList.get(this.i1);
                                    float f38 = (min / u8Var11.e) * (x10 / this.u1);
                                    int i24 = this.h1;
                                    if (i24 == 13) {
                                        float g14 = u8Var11.h - (g() / u8Var11.e);
                                        float max3 = Math.max(0L, this.f - u8Var11.f) / u8Var11.e;
                                        if (u8Var11 == this.w) {
                                            f10 = f38;
                                            max3 = org.telegram.ui.Cells.f1.v(f(), u8Var11.e, u8Var11.h, max3);
                                            if (!this.o1 && f10 < 0.0f) {
                                                f11 = 0.0f;
                                                if (u8Var11.g <= u8Var11.h - (f() / u8Var11.e)) {
                                                    this.h1 = 15;
                                                }
                                                f12 = u8Var11.g;
                                                i11 = Utilities.i(f12 + f10, g14, max3);
                                                u8Var11.g = i11;
                                                if (Math.abs(f12 - i11) > 0.01f) {
                                                    this.o1 = true;
                                                }
                                                t8Var3 = this.a;
                                                if (t8Var3 != null) {
                                                    t8Var3.N(u8Var11.a, u8Var11.f);
                                                }
                                                t8Var4 = this.a;
                                                if (t8Var4 != null) {
                                                    t8Var4.B(u8Var11.g, u8Var11.a);
                                                }
                                            }
                                        } else {
                                            f10 = f38;
                                        }
                                        f11 = 0.0f;
                                        f12 = u8Var11.g;
                                        i11 = Utilities.i(f12 + f10, g14, max3);
                                        u8Var11.g = i11;
                                        if (Math.abs(f12 - i11) > 0.01f) {
                                        }
                                        t8Var3 = this.a;
                                        if (t8Var3 != null) {
                                        }
                                        t8Var4 = this.a;
                                        if (t8Var4 != null) {
                                        }
                                    } else {
                                        f10 = f38;
                                        f11 = 0.0f;
                                        if (i24 == 14) {
                                            float min6 = Math.min(1.0f, Math.max(0L, (this.f - u8Var11.f) + min) / u8Var11.e);
                                            float g15 = (g() / u8Var11.e) + u8Var11.g;
                                            if (u8Var11 == this.w) {
                                                min6 = org.telegram.ui.Cells.f1.e(f(), u8Var11.e, u8Var11.g, min6);
                                                if (!this.o1 && f10 > 0.0f) {
                                                    if (u8Var11.h >= (f() / u8Var11.e) + u8Var11.g) {
                                                        this.h1 = 15;
                                                    }
                                                }
                                            }
                                            float f39 = u8Var11.h;
                                            float i25 = Utilities.i(f39 + f10, min6, g15);
                                            u8Var11.h = i25;
                                            if (Math.abs(f39 - i25) > 0.01f) {
                                                this.o1 = true;
                                            }
                                            t8 t8Var17 = this.a;
                                            if (t8Var17 != null) {
                                                t8Var17.H(u8Var11.h, u8Var11.a);
                                            }
                                        }
                                    }
                                    if (this.h1 == 15) {
                                        float min7 = f10 > f11 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - u8Var11.f) + min) / u8Var11.e) - u8Var11.h, f10) : Math.max((Math.max(0L, this.f - u8Var11.f) / u8Var11.e) - u8Var11.g, f10);
                                        float f40 = u8Var11.g + min7;
                                        u8Var11.g = f40;
                                        u8Var11.h += min7;
                                        t8 t8Var18 = this.a;
                                        if (t8Var18 != null) {
                                            t8Var18.B(f40, u8Var11.a);
                                            this.a.N(u8Var11.a, u8Var11.f);
                                            this.a.H(u8Var11.h, u8Var11.a);
                                        }
                                        t8 t8Var19 = this.a;
                                        if (t8Var19 != null) {
                                            z15 = true;
                                            t8Var19.t(true);
                                            invalidate();
                                            if (!this.m1) {
                                                this.n1 = 1.0f;
                                            }
                                            this.m1 = z15;
                                            this.l1 = false;
                                        }
                                    }
                                    z15 = true;
                                    invalidate();
                                    if (!this.m1) {
                                    }
                                    this.m1 = z15;
                                    this.l1 = false;
                                }
                            }
                        } else {
                            float f41 = u8Var2.e;
                            float f42 = (min / f41) * (x10 / this.u1);
                            if (i12 == 2) {
                                u8Var2.g = Utilities.i(u8Var2.g + f42, u8Var2.h - (1000.0f / f41), 0.0f);
                                t8 t8Var20 = this.a;
                                if (t8Var20 != null) {
                                    t8Var20.q(false, this.h.g);
                                }
                                u8 u8Var12 = this.h;
                                float f43 = u8Var12.h - u8Var12.g;
                                float f44 = f();
                                u8 u8Var13 = this.h;
                                if (f43 > f44 / u8Var13.e) {
                                    u8Var13.h = org.telegram.ui.Cells.f1.e(f(), this.h.e, u8Var13.g, 1.0f);
                                    t8 t8Var21 = this.a;
                                    if (t8Var21 != null) {
                                        t8Var21.J(this.h.h);
                                    }
                                }
                            } else if (i12 == 3) {
                                u8Var2.h = Utilities.i(u8Var2.h + f42, 1.0f, (1000.0f / f41) + u8Var2.g);
                                t8 t8Var22 = this.a;
                                if (t8Var22 != null) {
                                    t8Var22.J(this.h.h);
                                }
                                u8 u8Var14 = this.h;
                                float f45 = u8Var14.h - u8Var14.g;
                                float f46 = f();
                                u8 u8Var15 = this.h;
                                if (f45 > f46 / u8Var15.e) {
                                    u8Var15.g = org.telegram.ui.Cells.f1.v(f(), this.h.e, u8Var15.h, 0.0f);
                                    t8 t8Var23 = this.a;
                                    if (t8Var23 != null) {
                                        t8Var23.q(false, this.h.g);
                                    }
                                }
                            } else if (i12 == 4) {
                                float min8 = f42 > 0.0f ? Math.min(1.0f - u8Var2.h, f42) : Math.max(-u8Var2.g, f42);
                                u8 u8Var16 = this.h;
                                float f47 = u8Var16.g + min8;
                                u8Var16.g = f47;
                                u8Var16.h += min8;
                                t8 t8Var24 = this.a;
                                if (t8Var24 != null) {
                                    t8Var24.q(false, f47);
                                    this.a.J(this.h.h);
                                }
                            }
                            float f48 = this.e;
                            u8 u8Var17 = this.h;
                            float f49 = u8Var17.e;
                            float f50 = f48 / f49;
                            float f51 = u8Var17.g;
                            if (f50 < f51 || f50 > u8Var17.h) {
                                long j16 = (long) (f51 * f49);
                                this.e = j16;
                                t8 t8Var25 = this.a;
                                if (t8Var25 != null) {
                                    t8Var25.j(j16, false);
                                }
                            }
                            invalidate();
                            if (!this.m1) {
                                this.n1 = 1.0f;
                            }
                            this.m1 = true;
                            this.l1 = false;
                        }
                        this.g1 = motionEvent.getX();
                    }
                    if (this.m1) {
                        org.telegram.messenger.i0.r(r4Var);
                    }
                    int i26 = this.h1;
                    if ((i26 == 1 || i26 == 5 || i26 == 8) && (velocityTracker6 = this.p1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.i0.r(r4Var);
                    zl0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.f1 > ViewConfiguration.getTapTimeout() || this.m1) && this.j0) {
                            int i27 = this.h1;
                            if (i27 == 16 && (velocityTracker5 = this.p1) != null) {
                                velocityTracker5.computeCurrentVelocity(1000);
                                int xVelocity = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity) > org.telegram.messenger.i0.L(100.0f)) {
                                    long min9 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i28 = this.y1;
                                    float f52 = i28;
                                    float f53 = min9;
                                    float f54 = this.u1;
                                    int i29 = (int) (((this.f / f53) * f54) + f52);
                                    int c10 = (int) a1.g.c(this.h.e - min9, f53, f54, f52);
                                    this.r1 = true;
                                    this.s1 = i29;
                                    this.W0.c(i29, 0, -xVelocity, 0, i28, c10, 0, 0);
                                    z10 = false;
                                }
                            } else if (i27 == 1 && (velocityTracker4 = this.p1) != null) {
                                velocityTracker4.computeCurrentVelocity(1000);
                                int xVelocity2 = (int) this.p1.getXVelocity();
                                this.q1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > org.telegram.messenger.i0.L(100.0f)) {
                                    long min10 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i30 = this.y1;
                                    float f55 = i30;
                                    float f56 = min10;
                                    float f57 = this.u1;
                                    int i31 = (int) (((this.f / f56) * f57) + f55);
                                    int c11 = (int) a1.g.c(this.h.e - min10, f56, f57, f55);
                                    this.r1 = true;
                                    this.s1 = i31;
                                    this.W0.c(i31, 0, -xVelocity2, 0, i30, c11, 0, 0);
                                    z10 = false;
                                }
                            } else if ((i27 == 5 || (i27 == 8 && !this.m1)) && this.P && (velocityTracker2 = this.p1) != null) {
                                velocityTracker2.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity3 = (int) this.p1.getXVelocity();
                                this.q1 = false;
                                if (Math.abs(xVelocity3) > org.telegram.messenger.i0.L(100.0f)) {
                                    float min11 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i32 = (int) (((this.Q / min11) * this.u1) + this.y1 + this.x1);
                                    u8 u8Var18 = this.h;
                                    if (u8Var18 != null) {
                                        float f58 = u8Var18.h;
                                        float f59 = u8Var18.e;
                                        j12 = this.R;
                                        j13 = (long) ((f58 * f59) - 0);
                                        f7 = u8Var18.g * f59;
                                    } else if (this.E) {
                                        float f60 = this.K;
                                        float f61 = this.H;
                                        j12 = this.R;
                                        j13 = (long) ((f60 * f61) - 0);
                                        f7 = this.J * f61;
                                    } else {
                                        j10 = -(this.R - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z12 = true;
                                        j11 = 0;
                                        this.r1 = z12;
                                        this.s1 = i32;
                                        float f62 = this.y1 + this.x1;
                                        float f63 = this.u1;
                                        this.W0.c(i32, 0, xVelocity3, 0, (int) (((j10 / min11) * f63) + f62), (int) a1.g.c(j11, min11, f63, f62), 0, 0);
                                        z10 = false;
                                    }
                                    j10 = (long) (f7 - j12);
                                    j11 = j13;
                                    z12 = true;
                                    this.r1 = z12;
                                    this.s1 = i32;
                                    float f622 = this.y1 + this.x1;
                                    float f632 = this.u1;
                                    this.W0.c(i32, 0, xVelocity3, 0, (int) (((j10 / min11) * f632) + f622), (int) a1.g.c(j11, min11, f632, f622), 0, 0);
                                    z10 = false;
                                }
                            } else if ((i27 == 9 || (i27 == 12 && !this.m1)) && this.G && (velocityTracker3 = this.p1) != null) {
                                velocityTracker3.computeCurrentVelocity(this.h == null ? 1500 : 1000);
                                int xVelocity4 = (int) this.p1.getXVelocity();
                                this.q1 = false;
                                if (Math.abs(xVelocity4) > org.telegram.messenger.i0.L(100.0f)) {
                                    float min12 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i33 = (int) (((this.I / min12) * this.u1) + this.y1 + this.x1);
                                    u8 u8Var19 = this.h;
                                    if (u8Var19 != null) {
                                        float f64 = u8Var19.h;
                                        float f65 = u8Var19.e;
                                        j14 = (long) ((u8Var19.g * f65) - this.H);
                                        j15 = (long) ((f64 * f65) - 0);
                                    } else {
                                        j14 = -(this.H - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.r1 = true;
                                    this.s1 = i33;
                                    float f66 = this.y1 + this.x1;
                                    float f67 = this.u1;
                                    this.W0.c(i33, 0, xVelocity4, 0, (int) (((j14 / min12) * f67) + f66), (int) a1.g.c(j15, min12, f67, f66), 0, 0);
                                    z10 = false;
                                }
                            }
                            q8Var = this.d1;
                            if (q8Var != null) {
                                org.telegram.messenger.i0.r(q8Var);
                                this.d1 = null;
                            }
                            if (this.m1 || !z10 || (t8Var = this.a) == null) {
                                z11 = false;
                            } else {
                                z11 = false;
                                t8Var.t(false);
                            }
                            this.n1 = 1.0f;
                            this.m1 = z11;
                            this.l1 = z11;
                            this.f1 = -1L;
                            this.h1 = -1;
                            velocityTracker = this.p1;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.p1 = null;
                            }
                        } else if (this.j0) {
                            if (!this.X0 || this.h == null) {
                                int i34 = this.j1;
                                if (i34 == 3) {
                                    int i35 = (this.P || this.G) ? -1 : this.n;
                                    int i36 = this.k1;
                                    if (i35 != i36) {
                                        this.P = false;
                                        this.G = false;
                                        this.n = i36;
                                        if (this.a != null && i36 >= 0 && i36 < arrayList.size()) {
                                            this.a.e(((u8) arrayList.get(this.k1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i34 == 2 && !this.P) {
                                    this.P = true;
                                    this.G = false;
                                    t8 t8Var26 = this.a;
                                    if (t8Var26 != null) {
                                        t8Var26.A(false);
                                    }
                                    invalidate();
                                } else if (i34 == 1 && !this.G) {
                                    this.P = false;
                                    this.G = true;
                                    t8 t8Var27 = this.a;
                                    if (t8Var27 != null) {
                                        t8Var27.A(true);
                                    }
                                    invalidate();
                                } else if (i34 != 2 && this.P) {
                                    this.P = false;
                                    this.G = false;
                                    t8 t8Var28 = this.a;
                                    if (t8Var28 != null) {
                                        t8Var28.A(false);
                                    }
                                    invalidate();
                                } else if (i34 == 1 || !this.G) {
                                    long j17 = this.e;
                                    if (m(false, motionEvent.getX()) && Math.abs(this.e - j17) > 400) {
                                        this.c1 = j17;
                                        this.b1.e(true, 1.0f);
                                        invalidate();
                                    }
                                } else {
                                    this.P = false;
                                    this.G = false;
                                    t8 t8Var29 = this.a;
                                    if (t8Var29 != null) {
                                        t8Var29.A(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long i37 = (long) Utilities.i(((((motionEvent.getX() - this.y1) - this.x1) / this.u1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                u8 u8Var20 = this.h;
                                float f68 = u8Var20.h - u8Var20.g;
                                u8Var20.g = (1.0f - f68) * (i37 / getBaseDuration());
                                u8 u8Var21 = this.h;
                                float f69 = u8Var21.g;
                                u8Var21.h = f68 + f69;
                                t8 t8Var30 = this.a;
                                if (t8Var30 != null) {
                                    t8Var30.q(true, f69);
                                    this.a.J(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.j1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z10 = true;
                    q8Var = this.d1;
                    if (q8Var != null) {
                    }
                    if (this.m1) {
                    }
                    z11 = false;
                    this.n1 = 1.0f;
                    this.m1 = z11;
                    this.l1 = z11;
                    this.f1 = -1L;
                    this.h1 = -1;
                    velocityTracker = this.p1;
                    if (velocityTracker != null) {
                    }
                }
                this.e1 = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.a0 == null || this.W) {
                this.a0 = new s8(this, this.O, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.U = false;
                this.g0.e(true, 1.0f);
            }
        }
    }

    public final void q() {
        ex0 ex0Var = new ex0(26);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, ex0Var);
        u8 u8Var = arrayList.isEmpty() ? null : (u8) arrayList.get(0);
        this.w = u8Var;
        if (u8Var != null) {
            long j10 = u8Var.f;
        }
    }

    public void setCollage(ArrayList<n5> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        x8 x8Var;
        int i10 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            u8 u8Var = (u8) arrayList2.get(i10);
            if (u8Var != null && (x8Var = u8Var.c) != null) {
                x8Var.b();
            }
            i10++;
        }
        arrayList2.clear();
        int i11 = 0;
        while (true) {
            arrayList3 = this.r;
            if (i11 >= arrayList3.size()) {
                break;
            }
            s8 s8Var = (s8) arrayList3.get(i11);
            if (s8Var != null) {
                s8Var.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.h0.e(true, 1.0f);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                n5 n5Var = arrayList.get(i12);
                if (n5Var.K) {
                    u8 u8Var2 = new u8(this);
                    u8Var2.a = i12;
                    u8Var2.b = false;
                    u8Var2.d = n5Var.L.getAbsolutePath();
                    u8Var2.e = n5Var.h0;
                    u8Var2.f = n5Var.X;
                    u8Var2.i = n5Var.P;
                    u8Var2.g = n5Var.V;
                    u8Var2.h = n5Var.W;
                    u8.a(u8Var2, false);
                    u8.b(u8Var2);
                    arrayList2.add(u8Var2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(t8 t8Var) {
        this.a = t8Var;
    }

    public void setMaxCount(int i10) {
        this.b0 = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0048, code lost:
    
        if ((r4 + 240) >= (r7 * r11.T)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x006a, code lost:
    
        if ((r4 + 240) >= (r6 * r11.T)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0022, code lost:
    
        if ((r4 + 240) >= (r7 * r0.h)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x006c, code lost:
    
        r11.c1 = -1;
        r11.b1.e(true, 1.0f);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j10) {
        u8 u8Var = this.h;
        if (u8Var != null) {
            if (j10 < this.e) {
                float f7 = j10;
                long j11 = u8Var.e;
                if (f7 <= (j11 * u8Var.g) + 240.0f) {
                }
            }
        }
        if (this.N && !this.E && u8Var == null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j12 = this.R;
                if (f10 <= (j12 * this.S) + 240.0f) {
                }
            }
        }
        if (this.E && u8Var == null) {
            if (j10 < this.e) {
                float f11 = j10;
                long j13 = this.H;
                if (f11 <= (j13 * this.S) + 240.0f) {
                }
            }
        }
        this.e = j10;
        invalidate();
    }

    public void setRoundNull(boolean z10) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z10);
    }

    public void setVideoLeft(float f7) {
        u8 u8Var = this.h;
        if (u8Var == null) {
            return;
        }
        u8Var.g = f7;
        invalidate();
    }

    public void setVideoRight(float f7) {
        u8 u8Var = this.h;
        if (u8Var == null) {
            return;
        }
        u8Var.h = f7;
        invalidate();
    }
}
