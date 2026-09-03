package qh;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.vm0;
import org.telegram.ui.du;
import org.telegram.ui.y61;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class la extends View {
    public final Paint A0;
    public boolean B;
    public final TextPaint B0;
    public String C;
    public final RectF C0;
    public boolean D;
    public final Path D0;
    public long E;
    public final Paint E0;
    public long F;
    public final ka F0;
    public float G;
    public final Paint G0;
    public float H;
    public final Drawable H0;
    public float I;
    public final TextPaint I0;
    public ja J;
    public StaticLayout J0;
    public boolean K;
    public float K0;
    public String L;
    public float L0;
    public boolean M;
    public final TextPaint M0;
    public long N;
    public StaticLayout N0;
    public long O;
    public float O0;
    public float P;
    public float P0;
    public float Q;
    public final LinearGradient Q0;
    public boolean R;
    public final Matrix R0;
    public float S;
    public final Paint S0;
    public boolean T;
    public final vm0 T0;
    public ea U;
    public boolean U0;
    public int V;
    public final y61 V0;
    public final org.telegram.ui.Components.z5 W;
    public long W0;
    public long X0;
    public final org.telegram.ui.Components.z5 Y0;
    public long Z0;
    public fa a;
    public final org.telegram.ui.Components.z5 a0;
    public hg.y1 a1;
    public Runnable b;
    public final org.telegram.ui.Components.z5 b0;
    public long b1;
    public int c;
    public final org.telegram.ui.Components.z5 c0;
    public long c1;
    public Runnable d;
    public final org.telegram.ui.Components.z5 d0;
    public float d1;
    public long e;
    public final org.telegram.ui.Components.z5 e0;
    public int e1;
    public long f;
    public final org.telegram.ui.Components.z5 f0;
    public int f1;
    public boolean g0;
    public int g1;
    public ga h;
    public final org.telegram.ui.Components.ba h0;
    public int h1;
    public final org.telegram.ui.Components.fa i0;
    public boolean i1;
    public final org.telegram.ui.Components.fa j0;
    public boolean j1;
    public final org.telegram.ui.Components.fa k0;
    public float k1;
    public final RectF l0;
    public boolean l1;
    public final Path m0;
    public VelocityTracker m1;
    public int n;
    public final k01 n0;
    public boolean n1;
    public final Drawable o0;
    public boolean o1;
    public final ka p0;
    public int p1;
    public final RectF q0;
    public final float[] q1;
    public final ArrayList r;
    public final Paint r0;
    public int r1;
    public final ArrayList s;
    public final Path s0;
    public int s1;
    public final Path t0;
    public int t1;
    public final RectF u0;
    public int u1;
    public ga v;
    public final Path v0;
    public int v1;
    public final Paint w;
    public final Paint w0;
    public int w1;
    public final Path x;
    public final Paint x0;
    public final Path y;
    public final Paint y0;
    public final Paint z0;

    public la(Context context, ViewGroup viewGroup, m9 m9Var, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar) {
        super(context);
        this.n = 0;
        this.r = new ArrayList();
        this.s = new ArrayList();
        this.w = new Paint(3);
        this.x = new Path();
        this.y = new Path();
        this.V = 1;
        pr prVar = pr.h;
        this.W = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.a0 = new org.telegram.ui.Components.z5(this, 360L, prVar);
        this.b0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.c0 = new org.telegram.ui.Components.z5(this, 360L, prVar);
        this.d0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.e0 = new org.telegram.ui.Components.z5(this, 0L, 360L, prVar);
        this.f0 = new org.telegram.ui.Components.z5(this, 0L, 320L, prVar);
        this.g0 = true;
        this.l0 = new RectF();
        this.m0 = new Path();
        this.p0 = new ka();
        this.q0 = new RectF();
        this.r0 = new Paint(3);
        this.s0 = new Path();
        this.t0 = new Path();
        this.u0 = new RectF();
        this.v0 = new Path();
        Paint paint = new Paint(1);
        this.w0 = paint;
        Paint paint2 = new Paint(1);
        this.x0 = paint2;
        Paint paint3 = new Paint(1);
        this.y0 = paint3;
        Paint paint4 = new Paint(1);
        this.z0 = paint4;
        Paint paint5 = new Paint(1);
        this.A0 = paint5;
        TextPaint textPaint = new TextPaint(1);
        this.B0 = textPaint;
        this.C0 = new RectF();
        this.D0 = new Path();
        Paint paint6 = new Paint(1);
        this.E0 = paint6;
        this.F0 = new ka();
        Paint paint7 = new Paint(1);
        this.G0 = paint7;
        TextPaint textPaint2 = new TextPaint(1);
        this.I0 = textPaint2;
        TextPaint textPaint3 = new TextPaint(1);
        this.M0 = textPaint3;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 16.0f, 0.0f, new int[]{16777215, -1}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        this.Q0 = linearGradient;
        this.R0 = new Matrix();
        Paint paint8 = new Paint(1);
        this.S0 = paint8;
        this.T0 = new vm0(getContext(), null);
        this.W0 = -1L;
        this.X0 = -1L;
        this.Y0 = new org.telegram.ui.Components.z5(0.0f, this, 0L, 340L, prVar);
        this.Z0 = -1L;
        this.e1 = -1;
        this.f1 = -1;
        this.g1 = -1;
        this.h1 = -1;
        this.k1 = 1.0f;
        this.n1 = true;
        this.o1 = false;
        this.q1 = new float[8];
        paint7.setColor(ConnectionsManager.DEFAULT_DATACENTER_ID);
        textPaint2.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint2.setTypeface(AndroidUtilities.bold());
        textPaint2.setColor(-1);
        textPaint3.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint3.setColor(-1);
        paint6.setColor(1090519039);
        paint8.setShader(linearGradient);
        paint8.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
        paint.setColor(-1);
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, AndroidUtilities.dp(1.0f), 436207616);
        textPaint.setTextSize(AndroidUtilities.dp(12.0f));
        textPaint.setColor(-1);
        textPaint.setShadowLayer(AndroidUtilities.dp(2.0f), 0.0f, AndroidUtilities.dp(2.0f), TLObject.FLAG_30);
        textPaint.setTypeface(AndroidUtilities.bold());
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        paint3.setColor(-16777216);
        paint5.setColor(-1);
        paint4.setColor(637534208);
        this.n0 = new k01(LocaleController.getString(R.string.StoryTimeline), 12.0f, AndroidUtilities.bold());
        Drawable mutate = getContext().getResources().getDrawable(R.drawable.timeline).mutate();
        this.o0 = mutate;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        mutate.setColorFilter(new PorterDuffColorFilter(-1, mode));
        Drawable mutate2 = getContext().getResources().getDrawable(R.drawable.filled_widget_music).mutate();
        this.H0 = mutate2;
        mutate2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.h0 = baVar;
        this.i0 = new org.telegram.ui.Components.fa(baVar, this, 0, false);
        this.j0 = new org.telegram.ui.Components.fa(baVar, this, 3, false);
        this.k0 = new org.telegram.ui.Components.fa(baVar, this, 4, false);
        this.V0 = new y61(this, viewGroup, g6Var, baVar, m9Var, 2);
    }

    public static void a(final la laVar, ViewGroup viewGroup, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.ba baVar, View view) {
        int i10;
        ArrayList arrayList = laVar.s;
        int i11 = laVar.g1;
        try {
            if (i11 == 2 && laVar.K) {
                k6 k6Var = new k6(laVar.getContext(), 0);
                k6Var.b = 0.0f;
                k6Var.c = 1.5f;
                k6Var.d(laVar.S);
                final int i12 = 0;
                k6Var.h = new Utilities.Callback(laVar) { // from class: qh.da
                    public final /* synthetic */ la b;

                    {
                        this.b = laVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i12) {
                            case 0:
                                float floatValue = f10.floatValue();
                                la laVar2 = this.b;
                                laVar2.S = floatValue;
                                fa faVar = laVar2.a;
                                if (faVar != null) {
                                    faVar.A(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                la laVar3 = this.b;
                                laVar3.I = floatValue2;
                                fa faVar2 = laVar3.a;
                                if (faVar2 != null) {
                                    faVar2.u(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                la laVar4 = this.b;
                                laVar4.h.i = f10.floatValue();
                                fa faVar3 = laVar4.a;
                                if (faVar3 != null) {
                                    faVar3.X(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min = Math.min(laVar.getBaseDuration(), laVar.getMaxScrollDuration());
                int i13 = laVar.s1;
                int i14 = laVar.v1;
                int i15 = laVar.u1;
                float min2 = Math.min((i13 - i14) - i15, ((((AndroidUtilities.lerp(laVar.Q, 1.0f, laVar.c0.c) * laVar.O) + (laVar.N - laVar.f)) / min) * laVar.r1) + i14 + i15);
                q70 F = q70.F(viewGroup, g6Var, laVar);
                F.q(k6Var);
                F.o();
                F.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryAudioRemove), new ca(laVar, 1), false);
                F.V(5);
                F.U = true;
                F.a0((-(laVar.s1 - min2)) + AndroidUtilities.dp(18.0f), laVar.C0.top);
                F.Z();
                F.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            } else if (i11 == 1 && laVar.B) {
                k6 k6Var2 = new k6(laVar.getContext(), 0);
                k6Var2.b = 0.0f;
                k6Var2.c = 1.5f;
                k6Var2.d(laVar.I);
                final int i16 = 1;
                k6Var2.h = new Utilities.Callback(laVar) { // from class: qh.da
                    public final /* synthetic */ la b;

                    {
                        this.b = laVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i16) {
                            case 0:
                                float floatValue = f10.floatValue();
                                la laVar2 = this.b;
                                laVar2.S = floatValue;
                                fa faVar = laVar2.a;
                                if (faVar != null) {
                                    faVar.A(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                la laVar3 = this.b;
                                laVar3.I = floatValue2;
                                fa faVar2 = laVar3.a;
                                if (faVar2 != null) {
                                    faVar2.u(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                la laVar4 = this.b;
                                laVar4.h.i = f10.floatValue();
                                fa faVar3 = laVar4.a;
                                if (faVar3 != null) {
                                    faVar3.X(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                long min3 = Math.min(laVar.getBaseDuration(), laVar.getMaxScrollDuration());
                int i17 = laVar.s1;
                int i18 = laVar.v1;
                int i19 = laVar.u1;
                float min4 = Math.min((i17 - i18) - i19, ((((AndroidUtilities.lerp(laVar.H, 1.0f, laVar.a0.c) * laVar.E) + (laVar.F - laVar.f)) / min3) * laVar.r1) + i18 + i19);
                q70 F2 = q70.F(viewGroup, g6Var, laVar);
                F2.q(k6Var2);
                F2.o();
                F2.c(R.drawable.msg_delete, LocaleController.getString(R.string.StoryRoundRemove), new ca(laVar, 2), false);
                F2.V(5);
                F2.U = true;
                F2.a0((-(laVar.s1 - min4)) + AndroidUtilities.dp(18.0f), laVar.u0.top);
                F2.Z();
                F2.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            } else if (i11 == 0 && laVar.h != null) {
                k6 k6Var3 = new k6(laVar.getContext(), 0);
                k6Var3.b = 0.0f;
                k6Var3.c = 1.5f;
                k6Var3.d(laVar.h.i);
                final int i20 = 2;
                k6Var3.h = new Utilities.Callback(laVar) { // from class: qh.da
                    public final /* synthetic */ la b;

                    {
                        this.b = laVar;
                    }

                    @Override // org.telegram.messenger.Utilities.Callback
                    public final void run(Object obj) {
                        Float f10 = (Float) obj;
                        switch (i20) {
                            case 0:
                                float floatValue = f10.floatValue();
                                la laVar2 = this.b;
                                laVar2.S = floatValue;
                                fa faVar = laVar2.a;
                                if (faVar != null) {
                                    faVar.A(f10.floatValue());
                                    break;
                                }
                                break;
                            case 1:
                                float floatValue2 = f10.floatValue();
                                la laVar3 = this.b;
                                laVar3.I = floatValue2;
                                fa faVar2 = laVar3.a;
                                if (faVar2 != null) {
                                    faVar2.u(f10.floatValue());
                                    break;
                                }
                                break;
                            default:
                                la laVar4 = this.b;
                                laVar4.h.i = f10.floatValue();
                                fa faVar3 = laVar4.a;
                                if (faVar3 != null) {
                                    faVar3.X(f10.floatValue());
                                    break;
                                }
                                break;
                        }
                    }
                };
                q70 F3 = q70.F(viewGroup, g6Var, laVar);
                F3.q(k6Var3);
                F3.V(5);
                F3.U = true;
                F3.a0(AndroidUtilities.dp(18.0f), laVar.q0.top);
                F3.Z();
                F3.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            } else {
                if (i11 != 3 || (i10 = laVar.h1) < 0 || i10 >= arrayList.size()) {
                    return;
                }
                ga gaVar = (ga) arrayList.get(laVar.h1);
                k6 k6Var4 = new k6(laVar.getContext(), 0);
                k6Var4.b = 0.0f;
                k6Var4.c = 1.5f;
                k6Var4.d(gaVar.i);
                k6Var4.h = new org.telegram.ui.web.a2(8, laVar, gaVar);
                q70 F4 = q70.F(viewGroup, g6Var, laVar);
                F4.q(k6Var4);
                F4.V(5);
                F4.U = true;
                F4.a0(AndroidUtilities.dp(18.0f), gaVar.j.top);
                F4.Z();
                F4.R(baVar, -view.getX(), -view.getY());
                laVar.performHapticFeedback(0, 1);
            }
        } catch (Exception unused) {
        }
    }

    private float getAudioHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.c0.e(this.M));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long getBaseDuration() {
        ga gaVar = this.h;
        if (gaVar != null) {
            return Math.max(1L, gaVar.e);
        }
        ga gaVar2 = this.v;
        return gaVar2 != null ? Math.max(1L, gaVar2.e) : this.B ? Math.max(1L, this.E) : Math.max(1L, this.O);
    }

    private float getCollageHeight() {
        ArrayList arrayList = this.s;
        if (arrayList.isEmpty()) {
            return 0.0f;
        }
        float f10 = 0.0f;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (f10 > 0.0f) {
                f10 += AndroidUtilities.dp(4.0f);
            }
            f10 += AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((ga) arrayList.get(i10)).k.c);
        }
        return f10;
    }

    private float getRoundHeight() {
        if (!this.B) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), this.a0.e(this.D));
    }

    private float getVideoHeight() {
        if (this.h == null) {
            return 0.0f;
        }
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), r0.k.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x013f A[LOOP:0: B:38:0x013f->B:42:0x01f3, LOOP_START, PHI: r5
      0x013f: PHI (r5v34 int) = (r5v7 int), (r5v35 int) binds: [B:37:0x013d, B:42:0x01f3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x03e4 A[PHI: r21
      0x03e4: PHI (r21v2 int) = (r21v1 int), (r21v1 int), (r21v3 int) binds: [B:89:0x024e, B:91:0x0258, B:77:0x03e2] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0205  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int c(MotionEvent motionEvent) {
        boolean z4;
        int i10;
        ga gaVar;
        float x10 = motionEvent.getX();
        float y10 = motionEvent.getY();
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(this.e, getBaseDuration(), 0L);
        ga gaVar2 = this.v;
        float f10 = min;
        float f11 = (this.r1 * (((clamp + (gaVar2 != null ? (gaVar2.g * gaVar2.e) + gaVar2.f : this.h == null ? this.N : 0L)) - this.f) / f10)) + this.v1 + this.u1;
        if (!this.U0 && x10 >= f11 - AndroidUtilities.dp(12.0f) && x10 <= f11 + AndroidUtilities.dp(12.0f)) {
            return 0;
        }
        boolean z10 = this.h != null && y10 > (((float) (this.t1 - this.w1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        ArrayList arrayList = this.s;
        boolean z11 = !arrayList.isEmpty() && y10 > ((((((float) (this.t1 - this.w1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(4.0f))) - getCollageHeight()) - ((float) AndroidUtilities.dp(4.0f))) - ((float) AndroidUtilities.dp(2.0f)) && y10 < (((float) (this.t1 - this.w1)) - getVideoHeight()) - ((float) AndroidUtilities.dp(2.0f));
        if (this.B) {
            if (y10 > (((((((this.t1 - this.w1) - getVideoHeight()) - AndroidUtilities.dp(4.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) - getRoundHeight()) - AndroidUtilities.dp(4.0f)) - AndroidUtilities.dp(2.0f)) {
                if (y10 < ((((this.t1 - this.w1) - getVideoHeight()) - AndroidUtilities.dp(2.0f)) - getCollageHeight()) - AndroidUtilities.dp(arrayList.isEmpty() ? 0.0f : 4.0f)) {
                    z4 = true;
                    if (z11) {
                        i10 = 1;
                        if (z10) {
                            float f12 = this.v1 + this.u1;
                            ga gaVar3 = this.h;
                            float f13 = gaVar3.g;
                            float f14 = gaVar3.e;
                            float f15 = this.f;
                            float f16 = this.r1;
                            float f17 = ((((f13 * f14) - f15) / f10) * f16) + f12;
                            float f18 = ((((gaVar3.h * f14) - f15) / f10) * f16) + f12;
                            if (this.U0) {
                                if (getBaseDuration() < getMaxScrollDuration()) {
                                    return 4;
                                }
                                if (x10 < f17 - AndroidUtilities.dp(15.0f) || x10 > f18 + AndroidUtilities.dp(15.0f)) {
                                    return i10;
                                }
                                return 4;
                            }
                            if (x10 >= f17 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f17) {
                                return 2;
                            }
                            if (x10 >= f18 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f18) {
                                return 3;
                            }
                            if (x10 >= f17 && x10 <= f18) {
                                ga gaVar4 = this.h;
                                if (gaVar4.g > 0.01f || gaVar4.h < 0.99f) {
                                    return 4;
                                }
                            }
                        } else if (z4) {
                            float f19 = this.v1 + this.u1;
                            float f20 = this.F;
                            float f21 = this.G;
                            float f22 = this.E;
                            float f23 = this.f;
                            float f24 = this.r1;
                            float f25 = (((((f21 * f22) + f20) - f23) / f10) * f24) + f19;
                            float f26 = (((((this.H * f22) + f20) - f23) / f10) * f24) + f19;
                            if (this.D || this.h == null) {
                                if (x10 >= f25 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f25) {
                                    return 10;
                                }
                                if (x10 >= f26 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f26) {
                                    return 11;
                                }
                                if (x10 >= f25 && x10 <= f26) {
                                    return this.h == null ? 12 : 9;
                                }
                                float f27 = this.v1 + this.u1;
                                long j10 = this.F;
                                long j11 = this.f;
                                float f28 = this.r1;
                                float f29 = (((j10 - j11) / f10) * f28) + f27;
                                f26 = w.c.c((j10 + this.E) - j11, f10, f28, f27);
                                f25 = f29;
                            }
                            if (x10 >= f25 && x10 <= f26) {
                                return 9;
                            }
                        } else if (this.K) {
                            float f30 = this.v1 + this.u1;
                            float f31 = this.N;
                            float f32 = this.P;
                            float f33 = this.O;
                            float f34 = this.f;
                            float f35 = this.r1;
                            float f36 = (((((f32 * f33) + f31) - f34) / f10) * f35) + f30;
                            float f37 = (((((this.Q * f33) + f31) - f34) / f10) * f35) + f30;
                            if (this.M || (this.h == null && !this.B)) {
                                if (x10 >= f36 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f36) {
                                    return 6;
                                }
                                if (x10 >= f37 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f37) {
                                    return 7;
                                }
                                if (x10 >= f36 && x10 <= f37) {
                                    return this.h == null ? 8 : 5;
                                }
                                float f38 = this.v1 + this.u1;
                                long j12 = this.N;
                                long j13 = this.f;
                                float f39 = this.r1;
                                float f40 = (((j12 - j13) / f10) * f39) + f38;
                                f37 = w.c.c((j12 + this.O) - j13, f10, f39, f38);
                                f36 = f40;
                            }
                            if (x10 >= f36 && x10 <= f37) {
                                return 5;
                            }
                        }
                    } else {
                        for (int i11 = 0; i11 < arrayList.size(); i11++) {
                            ga gaVar5 = (ga) arrayList.get(i11);
                            RectF rectF = AndroidUtilities.rectTmp;
                            rectF.set(gaVar5.j);
                            rectF.inset(-AndroidUtilities.dp(2.0f), -AndroidUtilities.dp(2.0f));
                            if (rectF.contains(x10, y10)) {
                                float f41 = this.v1 + this.u1;
                                float f42 = gaVar5.f;
                                float f43 = this.r1;
                                float f44 = ((f42 / f10) * f43) + f41;
                                float f45 = gaVar5.g;
                                float f46 = gaVar5.e;
                                float f47 = ((((f45 * f46) + f42) / f10) * f43) + f41;
                                float f48 = ((((gaVar5.h * f46) + f42) / f10) * f43) + f41;
                                float c3 = w.c.c(r6 + r11, f10, f43, f41);
                                this.f1 = i11;
                                if (x10 >= f47 - AndroidUtilities.dp(15.0f) && x10 <= AndroidUtilities.dp(5.0f) + f47) {
                                    return 13;
                                }
                                if (x10 >= f48 - AndroidUtilities.dp(5.0f) && x10 <= AndroidUtilities.dp(15.0f) + f48) {
                                    return 14;
                                }
                                if (x10 < f47 || x10 > f48 || (gaVar5.g <= 0.01f && gaVar5.h >= 0.99f)) {
                                    return (x10 < f44 || x10 > c3) ? -1 : 16;
                                }
                                return 15;
                            }
                        }
                        i10 = 1;
                    }
                    gaVar = this.h;
                    if (gaVar != null || gaVar.e <= getMaxScrollDuration() || !z10) {
                        return -1;
                    }
                }
            }
        }
        z4 = false;
        if (z11) {
        }
        gaVar = this.h;
        return gaVar != null ? -1 : -1;
    }

    @Override // android.view.View
    public final void computeScroll() {
        vm0 vm0Var = this.T0;
        if (!vm0Var.b()) {
            if (this.o1) {
                this.o1 = false;
                fa faVar = this.a;
                if (faVar != null) {
                    faVar.U(false);
                    return;
                }
                return;
            }
            return;
        }
        int i10 = vm0Var.j;
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        if (this.n1) {
            this.f = (long) Math.max(0.0f, (((i10 - this.v1) - this.u1) / this.r1) * min);
        } else {
            if (!this.M) {
                vm0Var.a();
                return;
            }
            int i11 = this.v1;
            int i12 = this.u1;
            float f10 = this.r1;
            float f11 = min;
            h(((((i10 - i11) - i12) / f10) * f11) - ((((this.p1 - i11) - i12) / f10) * f11));
        }
        invalidate();
        this.p1 = i10;
    }

    public final void d(Canvas canvas, float f10, float f11, long j10, float f12) {
        float f13;
        if (this.U0) {
            return;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float clamp = Utilities.clamp(j10, getBaseDuration(), 0L);
        ga gaVar = this.v;
        if (gaVar != null) {
            f13 = (gaVar.g * gaVar.e) + gaVar.f;
        } else {
            f13 = this.h == null ? this.N : 0L;
        }
        float f14 = (this.r1 * (((clamp + f13) - this.f) / min)) + this.v1 + this.u1;
        float f15 = (1.0f - f12) * (((f11 - f10) / 2.0f) / 2.0f);
        float f16 = f10 + f15;
        float f17 = f11 - f15;
        Paint paint = this.z0;
        paint.setAlpha((int) (38.0f * f12));
        int i10 = (int) (f12 * 255.0f);
        Paint paint2 = this.A0;
        paint2.setAlpha(i10);
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        rectF.inset(-AndroidUtilities.dpf2(0.66f), -AndroidUtilities.dpf2(0.66f));
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint);
        rectF.set(f14 - AndroidUtilities.dpf2(1.5f), f16, AndroidUtilities.dpf2(1.5f) + f14, f17);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
    }

    /* JADX WARN: Incorrect condition in loop: B:120:0x06b0 */
    /* JADX WARN: Incorrect condition in loop: B:137:0x06fb */
    /* JADX WARN: Incorrect condition in loop: B:208:0x09cd */
    /* JADX WARN: Incorrect condition in loop: B:225:0x0a1a */
    /* JADX WARN: Incorrect condition in loop: B:67:0x03e0 */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0d1b  */
    /* JADX WARN: Removed duplicated region for block: B:423:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x11a2  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0f00  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void dispatchDraw(Canvas canvas) {
        RectF rectF;
        long j10;
        Paint paint;
        ArrayList arrayList;
        float f10;
        org.telegram.ui.Components.fa faVar;
        RectF rectF2;
        long j11;
        int i10;
        ga gaVar;
        ga gaVar2;
        int i11;
        float f11;
        float max;
        Canvas canvas2;
        long j12;
        float f12;
        boolean z4;
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
        float d10;
        float f34;
        float f35;
        ga gaVar3;
        float f36;
        float f37;
        float lerp;
        float v;
        float f38;
        RectF rectF4;
        float f39;
        float f40;
        float f41;
        float dpf2;
        float f42;
        float f43;
        float c3;
        float f44;
        float f45;
        long j14;
        float f46;
        float f47;
        float f48;
        ArrayList arrayList4;
        int i12;
        boolean z10;
        ArrayList arrayList5;
        ArrayList arrayList6;
        int i13;
        int i14;
        float f49;
        ArrayList arrayList7;
        ArrayList arrayList8;
        int i15;
        RectF rectF5;
        ArrayList arrayList9;
        float f50;
        float f51;
        Path path;
        float c10;
        float f52;
        float f53;
        float f54;
        int i16;
        long j15;
        float f55;
        float f56;
        float f57;
        ArrayList arrayList10;
        boolean z11;
        ArrayList arrayList11;
        ArrayList arrayList12;
        boolean z12;
        int i17;
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
        int i18;
        boolean z13;
        ArrayList arrayList18;
        ArrayList arrayList19;
        Paint paint3;
        Paint paint4;
        org.telegram.ui.Components.fa faVar2;
        la laVar = this;
        RectF rectF6 = laVar.q0;
        RectF rectF7 = laVar.u0;
        Path path2 = laVar.t0;
        ArrayList arrayList20 = laVar.r;
        Drawable drawable = laVar.o0;
        org.telegram.ui.Components.ba baVar = laVar.h0;
        RectF rectF8 = laVar.C0;
        ArrayList arrayList21 = laVar.s;
        RectF rectF9 = laVar.l0;
        org.telegram.ui.Components.fa faVar3 = laVar.i0;
        Paint c11 = faVar3.c(1.0f);
        float e6 = laVar.f0.e(laVar.g0);
        long min = Math.min(laVar.getBaseDuration(), laVar.getMaxScrollDuration());
        if (e6 < 1.0f) {
            rectF9.set(laVar.v1, (laVar.t1 - laVar.w1) - AndroidUtilities.dp(28.0f), laVar.s1 - laVar.v1, laVar.t1 - laVar.w1);
            laVar.m0.rewind();
            laVar.m0.addRoundRect(rectF9, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
            canvas.saveLayerAlpha(rectF9, (int) ((1.0f - e6) * 255.0f), 31);
            canvas.clipPath(laVar.m0);
            if (baVar.c()) {
                faVar3.a(canvas);
                canvas.drawColor(855638016);
                paint3 = c11;
            } else if (c11 == null) {
                canvas.drawColor(TLObject.FLAG_30);
                paint3 = c11;
            } else {
                paint3 = c11;
                canvas.drawRect(rectF9, paint3);
                canvas.drawColor(855638016);
            }
            if (arrayList20.isEmpty() || !baVar.c()) {
                paint4 = paint3;
                rectF = rectF6;
                faVar2 = faVar3;
                j10 = min;
                if (!arrayList20.isEmpty()) {
                    Paint c12 = laVar.k0.c(0.4f);
                    if (c12 == null) {
                        c12 = laVar.E0;
                        c12.setAlpha(64);
                    }
                    laVar.p0.a((((laVar.N - laVar.f) / j10) * laVar.r1) + laVar.v1 + laVar.u1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), laVar.e0.d(ka.c(arrayList20), false), rectF9.bottom, arrayList20);
                    canvas.drawPath(laVar.p0, c12);
                    float h = ((laVar.n0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
                    int centerX = (int) (rectF9.centerX() - h);
                    int centerY = (int) rectF9.centerY();
                    drawable.setBounds(centerX, org.telegram.ui.b.f(2, centerY, drawable), drawable.getIntrinsicWidth() + centerX, org.telegram.ui.b.y(2, centerY, drawable));
                    drawable.setAlpha(191);
                    drawable.draw(canvas);
                    k01 k01Var = laVar.n0;
                    float centerX2 = (rectF9.centerX() - h) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
                    float f64 = centerY;
                    paint = paint4;
                    rectF2 = rectF8;
                    arrayList = arrayList21;
                    faVar = faVar2;
                    f10 = 0.4f;
                    k01Var.c(centerX2, f64, 0.75f, -1, canvas);
                    canvas.restore();
                }
            } else {
                float d11 = laVar.e0.d(ka.c(arrayList20), false);
                rectF9 = rectF9;
                paint4 = paint3;
                rectF = rectF6;
                j10 = min;
                faVar2 = faVar3;
                laVar.p0.a((((laVar.N - laVar.f) / min) * laVar.r1) + laVar.v1 + laVar.u1, rectF9.left, rectF9.right, AndroidUtilities.dp(28.0f), d11, rectF9.bottom, arrayList20);
                canvas.saveLayerAlpha(rectF9, 102, 31);
                canvas.clipPath(laVar.p0);
                laVar.k0.a(canvas);
                canvas.restore();
            }
            float h9 = ((laVar.n0.h() + AndroidUtilities.dp(3.66f)) + drawable.getIntrinsicWidth()) / 2.0f;
            int centerX3 = (int) (rectF9.centerX() - h9);
            int centerY2 = (int) rectF9.centerY();
            drawable.setBounds(centerX3, org.telegram.ui.b.f(2, centerY2, drawable), drawable.getIntrinsicWidth() + centerX3, org.telegram.ui.b.y(2, centerY2, drawable));
            drawable.setAlpha(191);
            drawable.draw(canvas);
            k01 k01Var2 = laVar.n0;
            float centerX22 = (rectF9.centerX() - h9) + drawable.getIntrinsicWidth() + AndroidUtilities.dp(3.66f);
            float f642 = centerY2;
            paint = paint4;
            rectF2 = rectF8;
            arrayList = arrayList21;
            faVar = faVar2;
            f10 = 0.4f;
            k01Var2.c(centerX22, f642, 0.75f, -1, canvas);
            canvas.restore();
        } else {
            rectF = rectF6;
            j10 = min;
            paint = c11;
            arrayList = arrayList21;
            f10 = 0.4f;
            faVar = faVar3;
            rectF2 = rectF8;
        }
        if (e6 > 0.0f) {
            if (e6 < 1.0f) {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                canvas2.saveLayerAlpha(0.0f, 0.0f, laVar.getWidth(), laVar.getHeight(), (int) (e6 * 255.0f), 31);
                z4 = true;
            } else {
                canvas2 = canvas;
                j12 = j10;
                f12 = 0.0f;
                z4 = false;
            }
            ga gaVar4 = laVar.h;
            float f65 = gaVar4 != null ? 1.0f : 0.0f;
            float e10 = gaVar4 != null ? gaVar4.k.e((laVar.M || laVar.D) ? false : true) : 0.0f;
            float f66 = laVar.t1 - laVar.w1;
            float dp = AndroidUtilities.dp(4.0f);
            if (laVar.h != null) {
                canvas2.save();
                float videoHeight = laVar.getVideoHeight();
                ga gaVar5 = laVar.h;
                float f67 = gaVar5.g;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                long j16 = gaVar5.e;
                float f68 = j16;
                float u10 = e2.c.u(f67, f68, e10, f12);
                float u11 = e2.c.u(gaVar5.h, f68, e10, f12);
                if (j16 <= 0) {
                    f13 = e10;
                    f60 = f65;
                    j13 = j12;
                    f61 = 0.0f;
                    f59 = 0.0f;
                    f15 = dp;
                } else {
                    f59 = 0.0f;
                    f13 = e10;
                    f60 = f65;
                    j13 = j12;
                    f15 = dp;
                    f61 = (laVar.v1 + laVar.u1) - (laVar.r1 * (laVar.f / j13));
                }
                f19 = u10;
                float f69 = laVar.u1;
                float f70 = f61 - f69;
                if (j16 <= 0) {
                    f62 = f69;
                    f18 = u11;
                    f63 = 0.0f;
                } else {
                    f62 = f69;
                    f18 = u11;
                    f63 = (((j16 - laVar.f) / j13) * laVar.r1) + laVar.v1 + r5;
                }
                RectF rectF10 = rectF;
                rectF10.set(f70, f66 - videoHeight, f63 + f62, f66);
                float f71 = f66 - ((f15 * f60) + videoHeight);
                float f72 = (rectF10.top * f13) + f59;
                f17 = (rectF10.bottom * f13) + f59;
                laVar.s0.rewind();
                laVar.s0.addRoundRect(rectF10, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(laVar.s0);
                ja jaVar = laVar.h.c;
                if (jaVar != null) {
                    int i19 = jaVar.f;
                    float f73 = i19;
                    f20 = f72;
                    int max2 = (int) Math.max(0.0d, Math.floor((f70 - laVar.v1) / f73));
                    f14 = f60;
                    int min2 = (int) Math.min(laVar.h.c.c, Math.ceil(((r6 - f70) - laVar.v1) / f73) + 1.0d);
                    int i20 = (int) rectF10.top;
                    arrayList15 = laVar.h.c.d;
                    boolean z14 = arrayList15.size() >= min2;
                    boolean z15 = (i19 == 0 || !z14 || laVar.h.b) ? false : true;
                    if (z15) {
                        int i21 = max2;
                        while (true) {
                            arrayList18 = laVar.h.c.d;
                            if (i21 >= Math.min(arrayList18.size(), min2)) {
                                break;
                            }
                            arrayList19 = laVar.h.c.d;
                            if (((ia) arrayList19.get(i21)).a == null) {
                                z15 = false;
                                break;
                            }
                            i21++;
                        }
                    }
                    if (!z15) {
                        if (baVar.c()) {
                            faVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF10, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i19 != 0) {
                        float f74 = f70;
                        int i22 = max2;
                        while (i22 < Math.min(arrayList16.size(), min2)) {
                            arrayList17 = laVar.h.c.d;
                            ia iaVar = (ia) arrayList17.get(i22);
                            if (iaVar.a != null) {
                                i18 = min2;
                                z13 = z14;
                                laVar.r0.setAlpha((int) (iaVar.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(iaVar.a, f74, i20 - ((int) ((r4.getHeight() - videoHeight) / 2.0f)), laVar.r0);
                            } else {
                                i18 = min2;
                                z13 = z14;
                            }
                            f74 += f73;
                            i22++;
                            z14 = z13;
                            min2 = i18;
                        }
                    }
                    if (!z14) {
                        laVar.h.c.c();
                    }
                } else {
                    f20 = f72;
                    f14 = f60;
                }
                path2.rewind();
                if (!laVar.U0) {
                    RectF rectF11 = AndroidUtilities.rectTmp;
                    int i23 = laVar.v1;
                    int i24 = laVar.u1;
                    float f75 = i23 + i24;
                    ga gaVar6 = laVar.h;
                    float f76 = gaVar6.g;
                    int i25 = i24;
                    float f77 = gaVar6.e;
                    float f78 = laVar.f;
                    float f79 = (f76 * f77) - f78;
                    float f80 = j13;
                    float f81 = laVar.r1;
                    float f82 = (((f79 / f80) * f81) + f75) - (f76 <= f59 ? i25 : 0);
                    float f83 = laVar.t1 - laVar.w1;
                    float f84 = f83 - videoHeight;
                    float f85 = gaVar6.h;
                    float f86 = ((((f77 * f85) - f78) / f80) * f81) + f75;
                    if (f85 < 1.0f) {
                        i25 = 0;
                    }
                    rectF11.set(f82, f84, f86 + i25, f83);
                    path2.addRoundRect(rectF11, laVar.q1, Path.Direction.CW);
                    canvas2.clipPath(path2, Region.Op.DIFFERENCE);
                    canvas2.drawColor(1342177280);
                }
                canvas2.restore();
                f66 = f71;
                f16 = videoHeight;
            } else {
                f13 = e10;
                f14 = f65;
                rectF3 = rectF2;
                arrayList2 = arrayList;
                j13 = j12;
                f15 = dp;
                f16 = 0.0f;
                f17 = 0.0f;
                f18 = 0.0f;
                f19 = 0.0f;
                f20 = 0.0f;
            }
            if (arrayList2.isEmpty()) {
                arrayList3 = arrayList2;
                f21 = f16;
                f22 = 0.0f;
            } else {
                laVar.getCollageHeight();
                float f87 = f66;
                int i26 = 0;
                while (i26 < arrayList2.size()) {
                    ArrayList arrayList22 = arrayList2;
                    ga gaVar7 = (ga) arrayList22.get(i26);
                    org.telegram.ui.Components.z5 z5Var = gaVar7.k;
                    RectF rectF12 = gaVar7.j;
                    float f88 = f16;
                    float e11 = z5Var.e((laVar.M || laVar.D || laVar.n != i26) ? false : true);
                    if (gaVar7 != laVar.v) {
                        i15 = i26;
                        arrayList9 = arrayList22;
                        float f89 = j13;
                        f50 = f17;
                        f51 = ((((AndroidUtilities.lerp(gaVar7.g, 0.0f, e11) * gaVar7.e) + (gaVar7.f - laVar.f)) / f89) * laVar.r1) + laVar.v1 + laVar.u1;
                        rectF5 = rectF7;
                        c10 = (e2.c.v(AndroidUtilities.lerp(gaVar7.h, 1.0f, e11), gaVar7.e, gaVar7.f - laVar.f, f89) * laVar.r1) + laVar.v1 + laVar.u1;
                        path = path2;
                    } else {
                        i15 = i26;
                        rectF5 = rectF7;
                        arrayList9 = arrayList22;
                        f50 = f17;
                        float f90 = laVar.v1 + laVar.u1;
                        float f91 = j13;
                        float f92 = (gaVar7.f - laVar.f) / f91;
                        float f93 = laVar.r1;
                        f51 = (f92 * f93) + f90;
                        path = path2;
                        c10 = w.c.c(r8 + gaVar7.e, f91, f93, f90);
                    }
                    float f94 = f51;
                    canvas2.save();
                    float lerp2 = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), e11);
                    float f95 = laVar.u1;
                    rectF12.set(f94 - f95, f87 - lerp2, c10 + f95, f87);
                    f20 = (rectF12.top * e11) + f20;
                    f17 = (rectF12.bottom * e11) + f50;
                    float f96 = gaVar7.f;
                    float f97 = gaVar7.g;
                    float f98 = f87;
                    float f99 = gaVar7.e;
                    f19 = (((f97 * f99) + f96) * e11) + f19;
                    f18 = (((gaVar7.h * f99) + f96) * e11) + f18;
                    laVar.x.rewind();
                    laVar.x.addRoundRect(rectF12, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                    canvas2.clipPath(laVar.x);
                    ja jaVar2 = gaVar7.c;
                    if (jaVar2 != null) {
                        long j17 = gaVar7.e;
                        f52 = lerp2;
                        if (j17 <= 0) {
                            j15 = j17;
                            f55 = 0.0f;
                        } else {
                            j15 = j17;
                            f55 = laVar.v1 + laVar.u1 + (((gaVar7.f - laVar.f) / j13) * laVar.r1);
                        }
                        float f100 = laVar.u1;
                        float f101 = f55 - f100;
                        if (j17 <= 0) {
                            f56 = f100;
                            f57 = 0.0f;
                        } else {
                            f56 = f100;
                            f57 = ((((gaVar7.f + j15) - laVar.f) / j13) * laVar.r1) + laVar.v1 + r7;
                        }
                        float f102 = f57 + f56;
                        int i27 = jaVar2.f;
                        float f103 = i27;
                        int max3 = (int) Math.max(0.0d, Math.floor((f101 - ((((gaVar7.f - laVar.f) / j13) * laVar.r1) + (laVar.v1 + laVar.u1))) / f103));
                        int min3 = (int) Math.min(gaVar7.c.c, Math.ceil((f102 - f101) / f103) + 1.0d);
                        int i28 = (int) rectF12.top;
                        arrayList10 = gaVar7.c.d;
                        boolean z16 = arrayList10.size() >= min3;
                        if (z16) {
                            for (int i29 = max3; i29 < Math.min(arrayList13.size(), min3); i29++) {
                                arrayList14 = gaVar7.c.d;
                                if (((ia) arrayList14.get(i29)).a == null) {
                                    z11 = false;
                                    break;
                                }
                            }
                        }
                        z11 = z16;
                        if (!z11) {
                            if (baVar.c()) {
                                faVar.a(canvas2);
                                canvas2.drawColor(855638016);
                            } else if (paint == null) {
                                canvas2.drawColor(TLObject.FLAG_30);
                            } else {
                                canvas2.drawRect(rectF12, paint);
                                canvas2.drawColor(855638016);
                            }
                        }
                        if (i27 != 0) {
                            float f104 = f101;
                            while (max3 < Math.min(arrayList11.size(), min3)) {
                                arrayList12 = gaVar7.c.d;
                                ia iaVar2 = (ia) arrayList12.get(max3);
                                int i30 = min3;
                                if (iaVar2.a != null) {
                                    z12 = z16;
                                    i17 = max3;
                                    f58 = f98;
                                    laVar.w.setAlpha((int) (iaVar2.b.d(1.0f, false) * 255.0f));
                                    canvas2.drawBitmap(iaVar2.a, f104, i28 - ((int) ((r4.getHeight() - f52) / 2.0f)), laVar.w);
                                } else {
                                    z12 = z16;
                                    i17 = max3;
                                    f58 = f98;
                                }
                                f104 += f103;
                                max3 = i17 + 1;
                                min3 = i30;
                                z16 = z12;
                                f98 = f58;
                            }
                        }
                        f53 = f98;
                        if (!z16) {
                            gaVar7.c.c();
                        }
                    } else {
                        f52 = lerp2;
                        f53 = f98;
                    }
                    laVar.y.rewind();
                    if (!laVar.U0) {
                        RectF rectF13 = AndroidUtilities.rectTmp;
                        int i31 = laVar.v1;
                        int i32 = laVar.u1;
                        float f105 = i31 + i32;
                        float f106 = gaVar7.g;
                        float f107 = gaVar7.e;
                        float f108 = laVar.f;
                        float f109 = (f106 * f107) - f108;
                        float f110 = gaVar7.f;
                        float f111 = j13;
                        float f112 = laVar.r1;
                        float f113 = (((f109 + f110) / f111) * f112) + f105;
                        if (f106 <= 0.0f) {
                            f54 = f112;
                            i16 = i32;
                        } else {
                            f54 = f112;
                            i16 = 0;
                        }
                        float f114 = f113 - i16;
                        float f115 = rectF12.top;
                        float f116 = gaVar7.h;
                        rectF13.set(f114, f115, (((((f107 * f116) - f108) + f110) / f111) * f54) + f105 + (f116 >= 1.0f ? i32 : 0), rectF12.bottom);
                        laVar.y.addRoundRect(rectF13, laVar.q1, Path.Direction.CW);
                        canvas2.clipPath(laVar.y, Region.Op.DIFFERENCE);
                        canvas2.drawColor(1342177280);
                    }
                    canvas2.restore();
                    f87 = f53 - ((f15 * 1.0f) + f52);
                    i26 = i15 + 1;
                    path2 = path;
                    f16 = f88;
                    arrayList2 = arrayList9;
                    rectF7 = rectF5;
                }
                arrayList3 = arrayList2;
                f21 = f16;
                f66 = f87;
                f22 = 1.0f;
            }
            RectF rectF14 = rectF7;
            Path path3 = path2;
            float e12 = laVar.W.e(laVar.B);
            float e13 = laVar.a0.e(laVar.B && laVar.D);
            float roundHeight = laVar.getRoundHeight() * e12;
            float f117 = ((laVar.h == null && !laVar.K && arrayList3.isEmpty()) ? 1.0f : e13) * e12;
            if (e12 > 0.0f) {
                long j18 = laVar.F;
                float f118 = j18;
                float f119 = laVar.G;
                float f120 = laVar.E;
                f19 = (((f119 * f120) + f118) * f117) + f19;
                f18 = (((laVar.H * f120) + f118) * f117) + f18;
                if (laVar.h != null) {
                    float f121 = j13;
                    float lerp3 = ((((laVar.E * AndroidUtilities.lerp(f119, 0.0f, e13)) + (j18 - laVar.f)) / f121) * laVar.r1) + laVar.v1 + laVar.u1;
                    f43 = f17;
                    f23 = f22;
                    c3 = (e2.c.v(AndroidUtilities.lerp(laVar.H, 1.0f, e13), laVar.E, laVar.F - laVar.f, f121) * laVar.r1) + laVar.v1 + laVar.u1;
                    f44 = lerp3;
                } else {
                    f23 = f22;
                    f43 = f17;
                    float f122 = laVar.v1 + laVar.u1;
                    long j19 = j18 - laVar.f;
                    float f123 = j13;
                    float f124 = laVar.r1;
                    float f125 = ((j19 / f123) * f124) + f122;
                    c3 = w.c.c(j19 + r6, f123, f124, f122);
                    f44 = f125;
                }
                float f126 = laVar.u1;
                rectF14.set(f44 - f126, f66 - roundHeight, c3 + f126, f66);
                float f127 = f66 - ((f15 * e12) + roundHeight);
                f20 = (rectF14.top * f117) + f20;
                f17 = (rectF14.bottom * f117) + f43;
                laVar.v0.rewind();
                laVar.v0.addRoundRect(rectF14, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.save();
                canvas2.clipPath(laVar.v0);
                ja jaVar3 = laVar.J;
                if (jaVar3 != null) {
                    float f128 = e13;
                    long j20 = laVar.E;
                    if (j20 <= 0) {
                        f45 = f127;
                        j14 = j20;
                        f46 = 0.0f;
                    } else {
                        f45 = f127;
                        j14 = j20;
                        f46 = laVar.v1 + laVar.u1 + (((laVar.F - laVar.f) / j13) * laVar.r1);
                    }
                    float f129 = laVar.u1;
                    float f130 = f46 - f129;
                    if (j20 <= 0) {
                        f47 = f129;
                        f48 = 0.0f;
                    } else {
                        f47 = f129;
                        f48 = laVar.v1 + r10 + ((((laVar.F + j14) - laVar.f) / j13) * laVar.r1);
                    }
                    float f131 = f48 + f47;
                    int i33 = jaVar3.f;
                    float f132 = i33;
                    float f133 = f130;
                    int max4 = (int) Math.max(0.0d, Math.floor((f130 - (laVar.h != null ? (((laVar.F - laVar.f) / j13) * laVar.r1) + (laVar.v1 + laVar.u1) : laVar.v1)) / f132));
                    int min4 = (int) Math.min(laVar.J.c, Math.ceil((f131 - f133) / f132) + 1.0d);
                    int i34 = (int) rectF14.top;
                    arrayList4 = laVar.J.d;
                    boolean z17 = arrayList4.size() >= min4;
                    if (z17) {
                        int i35 = max4;
                        i12 = i35;
                        while (i35 < Math.min(arrayList7.size(), min4)) {
                            arrayList8 = laVar.J.d;
                            if (((ia) arrayList8.get(i35)).a == null) {
                                z10 = false;
                                break;
                            }
                            i35++;
                        }
                    } else {
                        i12 = max4;
                    }
                    z10 = z17;
                    if (!z10) {
                        if (baVar.c()) {
                            faVar.a(canvas2);
                            canvas2.drawColor(855638016);
                        } else if (paint == null) {
                            canvas2.drawColor(TLObject.FLAG_30);
                        } else {
                            canvas2.drawRect(rectF14, paint);
                            canvas2.drawColor(855638016);
                        }
                    }
                    if (i33 != 0) {
                        int i36 = i12;
                        while (i36 < Math.min(arrayList5.size(), min4)) {
                            arrayList6 = laVar.J.d;
                            ia iaVar3 = (ia) arrayList6.get(i36);
                            int i37 = i36;
                            if (iaVar3.a != null) {
                                i13 = min4;
                                i14 = i34;
                                f49 = f128;
                                laVar.r0.setAlpha((int) (iaVar3.b.d(1.0f, false) * 255.0f));
                                canvas2.drawBitmap(iaVar3.a, f133, i14 - ((int) ((r4.getHeight() - roundHeight) / 2.0f)), laVar.r0);
                            } else {
                                i13 = min4;
                                i14 = i34;
                                f49 = f128;
                            }
                            f133 += f132;
                            i36 = i37 + 1;
                            min4 = i13;
                            i34 = i14;
                            f128 = f49;
                        }
                    }
                    f24 = f128;
                    if (!z17) {
                        laVar.J.c();
                    }
                } else {
                    f45 = f127;
                    f24 = e13;
                }
                path3.rewind();
                RectF rectF15 = AndroidUtilities.rectTmp;
                int i38 = laVar.v1;
                int i39 = laVar.u1;
                float f134 = i38 + i39;
                float f135 = laVar.G;
                float f136 = laVar.E;
                float f137 = f135 * f136;
                float f138 = laVar.f;
                float f139 = f137 - f138;
                float f140 = laVar.F;
                float f141 = j13;
                float f142 = (f139 + f140) / f141;
                float f143 = laVar.r1;
                float f144 = (1.0f - f24) * i39;
                float f145 = (((f142 * f143) + f134) - (f135 <= 0.0f ? i39 : 0)) - f144;
                float f146 = rectF14.top;
                float f147 = laVar.H;
                float f148 = (((((f136 * f147) - f138) + f140) / f141) * f143) + f134;
                if (f147 < 1.0f) {
                    i39 = 0;
                }
                rectF15.set(f145, f146, f148 + i39 + f144, rectF14.bottom);
                path3.addRoundRect(rectF15, laVar.q1, Path.Direction.CW);
                canvas2.clipPath(path3, Region.Op.DIFFERENCE);
                canvas2.drawColor(1342177280);
                canvas2.restore();
                f66 = f45;
            } else {
                f23 = f22;
                f24 = e13;
            }
            float e14 = laVar.b0.e(laVar.K);
            float e15 = laVar.c0.e(laVar.K && laVar.M);
            float audioHeight = laVar.getAudioHeight() * e14;
            float f149 = ((laVar.h == null && !laVar.B && arrayList3.isEmpty()) ? 1.0f : e15) * e14;
            if (e14 > 0.0f) {
                float f150 = laVar.N;
                float f151 = laVar.P;
                float f152 = laVar.O;
                f19 = (((f151 * f152) + f150) * f149) + f19;
                f18 = (((laVar.Q * f152) + f150) * f149) + f18;
                Paint c13 = laVar.j0.c(e14);
                canvas2.save();
                if (laVar.h == null && !laVar.B && arrayList3.isEmpty()) {
                    float f153 = laVar.v1 + laVar.u1;
                    f37 = f17;
                    float f154 = laVar.N - laVar.f;
                    float f155 = j13;
                    float f156 = laVar.r1;
                    float f157 = ((f154 / f155) * f156) + f153;
                    paint2 = paint;
                    f36 = f149;
                    v = w.c.c(r10 + laVar.O, f155, f156, f153);
                    lerp = f157;
                } else {
                    f36 = f149;
                    f37 = f17;
                    paint2 = paint;
                    float f158 = j13;
                    lerp = ((((AndroidUtilities.lerp(laVar.P, 0.0f, e15) * laVar.O) + (laVar.N - laVar.f)) / f158) * laVar.r1) + laVar.v1 + laVar.u1;
                    v = laVar.v1 + laVar.u1 + (e2.c.v(AndroidUtilities.lerp(laVar.Q, 1.0f, e15), laVar.O, laVar.N - laVar.f, f158) * laVar.r1);
                }
                float f159 = v;
                float f160 = laVar.u1;
                RectF rectF16 = rectF3;
                rectF16.set(lerp - f160, f66 - audioHeight, f159 + f160, f66);
                f20 = (rectF16.top * f36) + f20;
                float f161 = (rectF16.bottom * f36) + f37;
                laVar.D0.rewind();
                laVar.D0.addRoundRect(rectF16, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), Path.Direction.CW);
                canvas2.clipPath(laVar.D0);
                if (baVar != null && baVar.c()) {
                    faVar.a(canvas2);
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(e14, 855638016));
                } else if (c13 == null) {
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(e14, TLObject.FLAG_30));
                } else {
                    canvas2.drawRect(rectF16, c13);
                    canvas2.drawColor(org.telegram.ui.ActionBar.k6.l1(e14, 855638016));
                }
                if (laVar.U == null || baVar == null || !baVar.c()) {
                    f38 = e15;
                    rectF4 = rectF16;
                    if (laVar.U != null && c13 != null) {
                        Paint c14 = laVar.k0.c(e14 * f10);
                        if (c14 == null) {
                            c14 = laVar.E0;
                            c14.setAlpha((int) (64.0f * e14));
                        }
                        float d12 = laVar.d0.d(laVar.U.e, !laVar.R);
                        ea eaVar = laVar.U;
                        laVar.R = eaVar.c > 0;
                        long j21 = j13;
                        laVar.F0.b((((laVar.N - laVar.f) / j13) * laVar.r1) + laVar.v1 + laVar.u1, lerp, f159, f38, j21, audioHeight, d12, rectF4.bottom, eaVar);
                        f39 = f38;
                        j11 = j21;
                        canvas2.drawPath(laVar.F0, c14);
                        if (f39 >= 1.0f) {
                            int i40 = laVar.v1;
                            float f162 = laVar.u1 + i40;
                            float f163 = laVar.N - laVar.f;
                            float f164 = laVar.P;
                            float f165 = laVar.O;
                            float f166 = j11;
                            float f167 = laVar.r1;
                            float f168 = ((((f164 * f165) + f163) / f166) * f167) + f162;
                            float f169 = ((((laVar.Q * f165) + f163) / f166) * f167) + f162;
                            float min5 = (Math.min(laVar.s1 - laVar.v1, f169) + Math.max(i40, f168)) / 2.0f;
                            float centerY3 = rectF4.centerY();
                            float max5 = Math.max(0.0f, (Math.min(laVar.s1 - laVar.v1, f169) - Math.max(laVar.v1, f168)) - AndroidUtilities.dp(24.0f));
                            float dpf22 = AndroidUtilities.dpf2(13.0f);
                            if (laVar.J0 == null && laVar.N0 == null) {
                                dpf2 = 0.0f;
                                f41 = 13.0f;
                            } else {
                                f41 = 13.0f;
                                dpf2 = AndroidUtilities.dpf2(9.66f) + AndroidUtilities.dpf2(3.11f) + laVar.K0 + laVar.O0;
                            }
                            float f170 = dpf22 + dpf2;
                            boolean z18 = f170 < max5;
                            float min6 = min5 - (Math.min(f170, max5) / 2.0f);
                            laVar.H0.setBounds((int) min6, (int) (centerY3 - (AndroidUtilities.dp(f41) / 2.0f)), (int) (AndroidUtilities.dp(f41) + min6), (int) ((AndroidUtilities.dp(f41) / 2.0f) + centerY3));
                            float f171 = 1.0f - f39;
                            float f172 = f171 * 255.0f;
                            laVar.H0.setAlpha((int) f172);
                            laVar.H0.draw(canvas2);
                            float dpf23 = AndroidUtilities.dpf2(16.11f) + min6;
                            f26 = e14;
                            f40 = f161;
                            f27 = f13;
                            d = 0.0d;
                            f25 = f39;
                            f28 = f14;
                            canvas2.saveLayerAlpha(0.0f, 0.0f, laVar.s1, laVar.t1, 255, 31);
                            float min7 = Math.min(f169, laVar.s1) - AndroidUtilities.dp(12.0f);
                            canvas2.clipRect(dpf23, 0.0f, min7, laVar.t1);
                            if (laVar.J0 != null) {
                                canvas2.save();
                                canvas2.translate(dpf23 - laVar.L0, centerY3 - (laVar.J0.getHeight() / 2.0f));
                                laVar.I0.setAlpha((int) (f172 * f26));
                                laVar.J0.draw(canvas2);
                                canvas2.restore();
                                f42 = laVar.K0 + dpf23;
                            } else {
                                f42 = dpf23;
                            }
                            if (laVar.J0 != null && laVar.N0 != null) {
                                float dpf24 = AndroidUtilities.dpf2(3.66f) + f42;
                                int alpha = laVar.G0.getAlpha();
                                laVar.G0.setAlpha((int) (alpha * f171));
                                canvas2.drawCircle(AndroidUtilities.dp(1.0f) + dpf24, centerY3, AndroidUtilities.dp(1.0f), laVar.G0);
                                laVar.G0.setAlpha(alpha);
                                f42 = AndroidUtilities.dpf2(2.0f) + dpf24 + AndroidUtilities.dpf2(4.0f);
                            }
                            if (laVar.N0 != null) {
                                canvas2.save();
                                canvas2.translate(f42 - laVar.P0, centerY3 - (laVar.N0.getHeight() / 2.0f));
                                laVar.M0.setAlpha((int) (f172 * f26));
                                laVar.N0.draw(canvas2);
                                canvas2.restore();
                            }
                            if (!z18) {
                                laVar.R0.reset();
                                laVar.R0.postScale(AndroidUtilities.dpf2(8.0f) / 16.0f, 1.0f);
                                laVar.R0.postTranslate(min7 - AndroidUtilities.dp(8.0f), 0.0f);
                                laVar.Q0.setLocalMatrix(laVar.R0);
                                canvas2.drawRect(min7 - AndroidUtilities.dp(8.0f), rectF4.top, min7, rectF4.bottom, laVar.S0);
                            }
                            canvas.restore();
                        } else {
                            f26 = e14;
                            f40 = f161;
                            f25 = f39;
                            f27 = f13;
                            f28 = f14;
                            d = 0.0d;
                        }
                        canvas.restore();
                        f29 = f40;
                    }
                } else {
                    float d13 = laVar.d0.d(laVar.U.e, !laVar.R);
                    ea eaVar2 = laVar.U;
                    laVar.R = eaVar2.c > 0;
                    rectF4 = rectF16;
                    f38 = e15;
                    laVar.F0.b((((laVar.N - laVar.f) / j13) * laVar.r1) + laVar.v1 + laVar.u1, lerp, f159, f38, j13, audioHeight, d13, rectF4.bottom, eaVar2);
                    canvas2.saveLayerAlpha(rectF4, 102, 31);
                    canvas2.clipPath(laVar.F0);
                    laVar.k0.a(canvas2);
                    canvas2.restore();
                }
                j11 = j13;
                f39 = f38;
                if (f39 >= 1.0f) {
                }
                canvas.restore();
                f29 = f40;
            } else {
                f25 = e15;
                f26 = e14;
                float f173 = f17;
                paint2 = paint;
                f27 = f13;
                f28 = f14;
                d = 0.0d;
                j11 = j13;
                f29 = f173;
            }
            float f174 = f20;
            float f175 = laVar.v1 + laVar.u1;
            float f176 = laVar.f;
            float f177 = j11;
            float f178 = laVar.r1;
            float f179 = (((f19 - f176) / f177) * f178) + f175;
            float f180 = (((f18 - f176) / f177) * f178) + f175;
            if (!arrayList3.isEmpty()) {
                f31 = e12;
                f30 = f26;
                f26 = f23;
            } else if (laVar.K && laVar.h == null) {
                f31 = e12;
                f30 = f26;
            } else {
                float f181 = f26;
                f26 = Math.max(f28, e12);
                f30 = f181;
                f31 = e12;
            }
            if (f30 > d || f31 > d || f28 > d || f23 > d) {
                if (laVar.h == null && !laVar.B && arrayList3.isEmpty()) {
                    f32 = f25;
                    f33 = f30 * AndroidUtilities.lerp(0.6f, 1.0f, f32);
                } else {
                    f32 = f25;
                    f33 = 1.0f;
                }
                Paint paint5 = paint2;
                laVar.e(canvas, paint5, f174, f29, f179, f180, f33 * f26);
                ga gaVar8 = laVar.h;
                if (gaVar8 != null && ((laVar.K || laVar.B) && (f32 > 0.0f || f24 > 0.0f))) {
                    float f182 = laVar.t1 - laVar.w1;
                    float f183 = laVar.u1 + laVar.v1;
                    float f184 = gaVar8.g;
                    float f185 = gaVar8.e;
                    float f186 = laVar.f;
                    float f187 = laVar.r1;
                    float f188 = ((((gaVar8.h * f185) - f186) / f177) * f187) + f183;
                    canvas3 = canvas;
                    laVar.e(canvas3, paint5, f182 - f21, f182, ((((f184 * f185) - f186) / f177) * f187) + f183, f188, 0.8f);
                } else if (laVar.v == null || arrayList3.size() <= 1) {
                    canvas3 = canvas;
                } else {
                    ga gaVar9 = laVar.v;
                    RectF rectF17 = gaVar9.j;
                    float f189 = rectF17.top;
                    float f190 = rectF17.bottom;
                    float f191 = laVar.u1 + laVar.v1;
                    float f192 = gaVar9.f;
                    float f193 = gaVar9.g;
                    float f194 = gaVar9.e;
                    float f195 = laVar.f;
                    float f196 = laVar.r1;
                    float f197 = (((((f193 * f194) + f192) - f195) / f177) * f196) + f191;
                    float f198 = (((((gaVar9.h * f194) + f192) - f195) / f177) * f196) + f191;
                    canvas3 = canvas;
                    laVar.e(canvas3, paint5, f189, f190, f197, f198, 0.8f);
                }
                if (laVar.V > 1 && (gaVar3 = laVar.h) != null) {
                    float f199 = gaVar3.e;
                    float f200 = gaVar3.h;
                    float f201 = gaVar3.g;
                    long j22 = (long) ((f200 - f201) * f199);
                    if (j22 > 68999) {
                        float f202 = laVar.v1 + laVar.u1;
                        float f203 = laVar.f;
                        float f204 = laVar.r1;
                        float f205 = ((((f201 * f199) - f203) / f177) * f204) + f202;
                        float f206 = ((((f200 * f199) - f203) / f177) * f204) + f202;
                        canvas3.save();
                        float f207 = laVar.t1 - laVar.w1;
                        canvas3.clipRect(f205, f207 - f21, f206, f207);
                        laVar.w0.setAlpha((int) (AndroidUtilities.lerp(0.8f, 1.0f, f27) * 255.0f));
                        long j23 = 59000;
                        int min8 = (int) Math.min(laVar.V - 1, j22 / 59000);
                        int i41 = 1;
                        while (i41 <= min8) {
                            if (Math.min(j23, j22 - (i41 * j23)) < 1000) {
                                break;
                            }
                            float f208 = laVar.v1 + laVar.u1;
                            ga gaVar10 = laVar.h;
                            float f209 = ((((((long) (gaVar10.e * gaVar10.g)) + r2) - laVar.f) / f177) * laVar.r1) + f208;
                            float f210 = laVar.t1 - laVar.w1;
                            Paint paint6 = laVar.w0;
                            Canvas canvas4 = canvas3;
                            canvas4.drawRect(f209, (laVar.t1 - laVar.w1) - f21, AndroidUtilities.dp(1.0f) + f209, f210, paint6);
                            canvas3 = canvas4;
                            StringBuilder sb = new StringBuilder("#");
                            i41++;
                            sb.append(i41);
                            canvas3.drawText(sb.toString(), f209 + AndroidUtilities.dp(2.0f), ((laVar.t1 - laVar.w1) - f21) + AndroidUtilities.dp(14.0f), laVar.B0);
                            j23 = 59000;
                        }
                        canvas3.restore();
                        d10 = laVar.Y0.d(0.0f, false);
                        float contentHeight = ((laVar.t1 - laVar.getContentHeight()) + laVar.w1) - AndroidUtilities.dpf2(2.3f);
                        float dpf25 = AndroidUtilities.dpf2(4.3f) + (laVar.t1 - laVar.w1);
                        if (d10 <= 0.0f) {
                            long j24 = laVar.Z0;
                            if (j24 == -1) {
                                ga gaVar11 = laVar.h;
                                if (gaVar11 != null) {
                                    j24 = (long) (gaVar11.e * gaVar11.h);
                                } else {
                                    ga gaVar12 = laVar.v;
                                    if (gaVar12 != null) {
                                        j24 = (long) ((gaVar12.h - gaVar12.g) * gaVar12.e);
                                    } else {
                                        if (laVar.B) {
                                            f34 = laVar.E;
                                            f35 = laVar.H;
                                        } else {
                                            f34 = laVar.O;
                                            f35 = laVar.Q;
                                        }
                                        j24 = (long) (f34 * f35);
                                    }
                                }
                            }
                            laVar = this;
                            laVar.d(canvas3, contentHeight, dpf25, j24, d10 * f26);
                        } else {
                            laVar = laVar;
                        }
                        laVar.d(canvas, contentHeight, dpf25, laVar.e, (1.0f - d10) * f26);
                    }
                }
                d10 = laVar.Y0.d(0.0f, false);
                float contentHeight2 = ((laVar.t1 - laVar.getContentHeight()) + laVar.w1) - AndroidUtilities.dpf2(2.3f);
                float dpf252 = AndroidUtilities.dpf2(4.3f) + (laVar.t1 - laVar.w1);
                if (d10 <= 0.0f) {
                }
                laVar.d(canvas, contentHeight2, dpf252, laVar.e, (1.0f - d10) * f26);
            }
            if (z4) {
                canvas.restore();
            }
        } else {
            j11 = j10;
        }
        if (laVar.j1) {
            float f211 = 1.0f / (1000.0f / AndroidUtilities.screenRefreshRate);
            float f212 = laVar.k1;
            long dp2 = (long) ((AndroidUtilities.dp(32.0f) / laVar.r1) * j11 * f211 * f212);
            if (laVar.U0) {
                laVar.k1 = (f211 * 0.25f) + f212;
            }
            int i42 = laVar.e1;
            if (i42 == 4 && (gaVar2 = laVar.h) != null) {
                float f213 = gaVar2.g;
                long j25 = laVar.f;
                long j26 = gaVar2.e;
                float f214 = j26;
                if (f213 < j25 / f214) {
                    i11 = -1;
                } else if (gaVar2.h > (j25 + j11) / f214) {
                    i11 = 1;
                } else {
                    laVar.k1 = 1.0f;
                    i11 = 0;
                }
                long j27 = i11 * dp2;
                laVar.f = Utilities.clamp(j25 + j27, j26 - j11, 0L);
                laVar.e += j27;
                ga gaVar13 = laVar.h;
                float f215 = (r3 - j25) / gaVar13.e;
                if (f215 > 0.0f) {
                    f11 = 1.0f;
                    max = Math.min(1.0f - gaVar13.h, f215);
                } else {
                    f11 = 1.0f;
                    max = Math.max(0.0f - gaVar13.g, f215);
                }
                ga gaVar14 = laVar.h;
                gaVar14.g = Utilities.clamp(gaVar14.g + max, f11, 0.0f);
                ga gaVar15 = laVar.h;
                gaVar15.h = Utilities.clamp(gaVar15.h + max, f11, 0.0f);
                fa faVar4 = laVar.a;
                if (faVar4 != null) {
                    faVar4.d0(laVar.h.g, false);
                    laVar.a.v0(laVar.h.h);
                }
                laVar.invalidate();
            } else if (i42 == 8) {
                float f216 = laVar.P;
                long j28 = laVar.N;
                float f217 = (-j28) + 100;
                long j29 = laVar.O;
                float f218 = j29;
                if (f216 < f217 / f218) {
                    i10 = -1;
                } else if (laVar.Q >= ((r8 + j11) - 100) / f218) {
                    i10 = 1;
                } else {
                    laVar.k1 = 1.0f;
                    i10 = 0;
                }
                if (i10 != 0) {
                    if (laVar.M && (gaVar = laVar.h) != null) {
                        long j30 = j28 - (i10 * dp2);
                        float f219 = gaVar.h;
                        float f220 = gaVar.e;
                        laVar.N = Utilities.clamp(j30, (long) ((f219 * f220) - (f216 * f218)), (long) ((gaVar.g * f220) - (laVar.Q * f218)));
                    } else if (laVar.D && laVar.B) {
                        long j31 = j28 - (i10 * dp2);
                        float f221 = laVar.H;
                        float f222 = laVar.E;
                        laVar.N = Utilities.clamp(j31, (long) ((f221 * f222) - (f216 * f218)), (long) ((laVar.G * f222) - (laVar.Q * f218)));
                    } else {
                        laVar.N = Utilities.clamp(j28 - (i10 * dp2), 0L, -(j29 - Math.min(laVar.getBaseDuration(), laVar.getMaxScrollDuration())));
                    }
                    float f223 = (-(laVar.N - j28)) / laVar.O;
                    float min9 = f223 > 0.0f ? Math.min(1.0f - laVar.Q, f223) : Math.max(0.0f - laVar.P, f223);
                    if (laVar.h == null) {
                        float f224 = laVar.e;
                        float f225 = laVar.O;
                        laVar.e = (long) Utilities.clamp((min9 * f225) + f224, f225, 0.0f);
                    }
                    laVar.P = Utilities.clamp(laVar.P + min9, 1.0f, 0.0f);
                    laVar.Q = Utilities.clamp(laVar.Q + min9, 1.0f, 0.0f);
                    fa faVar5 = laVar.a;
                    if (faVar5 != null) {
                        faVar5.t0(laVar.P);
                        laVar.a.r0(laVar.Q);
                        laVar.a.B(laVar.e, false);
                    }
                    laVar.invalidate();
                } else {
                    laVar.k1 = 1.0f;
                }
            } else {
                laVar.k1 = 1.0f;
            }
        } else {
            laVar.k1 = 1.0f;
        }
        int contentHeight3 = laVar.getContentHeight();
        if (laVar.c != contentHeight3) {
            laVar.c = contentHeight3;
            Runnable runnable = laVar.d;
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public final void e(Canvas canvas, Paint paint, float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= 0.0f) {
            return;
        }
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(f12 - AndroidUtilities.dp(10.0f), f10, AndroidUtilities.dp(10.0f) + f13, f11);
        canvas.saveLayerAlpha(0.0f, 0.0f, this.s1, this.t1, 255, 31);
        int i10 = (int) (255.0f * f14);
        Paint paint2 = this.w0;
        paint2.setAlpha(i10);
        canvas.drawRoundRect(rectF, AndroidUtilities.dp(6.0f), AndroidUtilities.dp(6.0f), paint2);
        rectF.inset(AndroidUtilities.dp(this.U0 ? 2.5f : 10.0f), AndroidUtilities.dp(2.0f));
        boolean z4 = this.U0;
        Paint paint3 = this.x0;
        if (z4) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(3.0f), AndroidUtilities.dp(3.0f), paint3);
        } else {
            canvas.drawRect(rectF, paint3);
        }
        float dp = AndroidUtilities.dp(2.0f);
        float dp2 = AndroidUtilities.dp(10.0f);
        Paint paint4 = this.y0;
        Paint paint5 = paint != null ? paint : paint4;
        paint4.setAlpha(255);
        paint5.setAlpha(i10);
        float f15 = f10 + f11;
        float f16 = (f15 - dp2) / 2.0f;
        float f17 = (f15 + dp2) / 2.0f;
        rectF.set(org.telegram.messenger.y3.a(AndroidUtilities.dp(this.U0 ? 2.0f : 10.0f), dp, 2.0f, f12), f16, f12 - ((AndroidUtilities.dp(this.U0 ? 2.0f : 10.0f) + dp) / 2.0f), f17);
        if (!this.U0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null && !this.U0) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        rectF.set(e2.c.x(AndroidUtilities.dp(this.U0 ? 2.5f : 10.0f), dp, 2.0f, f13), f16, l.d.b(AndroidUtilities.dp(this.U0 ? 2.5f : 10.0f), dp, 2.0f, f13), f17);
        if (!this.U0) {
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint5);
            if (paint != null) {
                paint4.setAlpha((int) (f14 * 48.0f));
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(1.0f), AndroidUtilities.dp(1.0f), paint4);
            }
        }
        canvas.restore();
    }

    public final long f() {
        return this.V * 59000;
    }

    public final long g() {
        return (long) Math.max(1000.0f, Math.min(getBaseDuration(), 59000L) * 0.15f);
    }

    public int getContentHeight() {
        return (int) (this.w1 + (this.h != null ? getVideoHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.s.isEmpty() ? 0.0f : getCollageHeight() + AndroidUtilities.dp(4.0f)) + (this.B ? getRoundHeight() + AndroidUtilities.dp(4.0f) : 0.0f) + (this.K ? AndroidUtilities.dp(4.0f) + getAudioHeight() : 0.0f) + this.w1);
    }

    public int getMaxCount() {
        return this.V;
    }

    public long getMaxScrollDuration() {
        if (this.s.isEmpty()) {
            return Math.max(120000L, (long) (f() * 1.5f));
        }
        return 70000L;
    }

    public int getTimelineHeight() {
        return AndroidUtilities.lerp(AndroidUtilities.dp(28.0f) + this.w1 + this.w1, getContentHeight(), this.f0.c);
    }

    public final void h(float f10) {
        float f11;
        long j10;
        float f12;
        long j11;
        long j12;
        long j13;
        long j14;
        long j15;
        fa faVar;
        long clamp;
        ga gaVar = this.h;
        if (gaVar == null && !this.B) {
            long j16 = this.N;
            long clamp2 = Utilities.clamp(j16 + ((long) f10), 0L, -(this.O - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.N = clamp2;
            float f13 = clamp2 - j16;
            this.P = Utilities.clamp(this.P - (f13 / this.O), 1.0f, 0.0f);
            this.Q = Utilities.clamp(this.Q - (f13 / this.O), 1.0f, 0.0f);
            fa faVar2 = this.a;
            if (faVar2 != null) {
                faVar2.t0(this.P);
                this.a.r0(this.Q);
            }
        } else if (this.M) {
            if (gaVar != null) {
                f11 = gaVar.g;
                j10 = gaVar.e;
            } else {
                f11 = this.G;
                j10 = this.E;
            }
            float f14 = f11 * j10;
            if (gaVar != null) {
                f12 = gaVar.h;
                j11 = gaVar.e;
            } else {
                f12 = this.H;
                j11 = this.E;
            }
            float f15 = f12 * j11;
            float f16 = gaVar != null ? (gaVar.h - gaVar.g) * gaVar.e : this.E * (this.H - this.G);
            float f17 = this.Q;
            float f18 = this.O;
            long j17 = (long) (f15 - (f17 * f18));
            float f19 = this.P;
            long j18 = (long) (f14 - (f19 * f18));
            float min = Math.min(f17 - f19, f16 / f18);
            long j19 = this.N;
            long j20 = (long) f10;
            long j21 = j19 + j20;
            if (j21 > j17) {
                float clamp3 = Utilities.clamp(((f15 - j19) - j20) / this.O, 1.0f, min);
                this.Q = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.P = clamp4;
                float f20 = this.Q;
                float f21 = this.O;
                long j22 = (long) (f15 - (f20 * f21));
                long j23 = (long) (f14 - (clamp4 * f21));
                if (j22 < j23) {
                    j15 = j23;
                    j14 = j22;
                } else {
                    j14 = j23;
                    j15 = j22;
                }
                this.N = Utilities.clamp(this.N + j20, j15, j14);
                fa faVar3 = this.a;
                if (faVar3 != null) {
                    faVar3.t0(this.P);
                    this.a.r0(this.Q);
                }
            } else if (j21 < j18) {
                float clamp5 = Utilities.clamp(((f14 - j19) - j20) / this.O, 1.0f - min, 0.0f);
                this.P = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.Q = clamp6;
                float f22 = this.O;
                long j24 = (long) (f15 - (clamp6 * f22));
                long j25 = (long) (f14 - (this.P * f22));
                if (j24 < j25) {
                    j13 = j25;
                    j12 = j24;
                } else {
                    j12 = j25;
                    j13 = j24;
                }
                this.N = Utilities.clamp(this.N + j20, j13, j12);
                fa faVar4 = this.a;
                if (faVar4 != null) {
                    faVar4.t0(this.P);
                    this.a.r0(this.Q);
                }
            } else {
                this.N = j21;
            }
        } else {
            long j26 = this.N + ((long) f10);
            float baseDuration = getBaseDuration();
            float f23 = this.O;
            this.N = Utilities.clamp(j26, (long) (baseDuration - (this.Q * f23)), (long) ((-this.P) * f23));
        }
        invalidate();
        fa faVar5 = this.a;
        if (faVar5 != null) {
            faVar5.H0(this.N + ((long) (this.P * this.O)));
        }
        boolean z4 = this.j1;
        if (z4 || (faVar = this.a) == null) {
            if (z4 || this.o1) {
                ga gaVar2 = this.h;
                if (gaVar2 != null) {
                    long j27 = this.N + ((long) (this.P * this.O));
                    float f24 = gaVar2.h;
                    float f25 = gaVar2.e;
                    this.e = Utilities.clamp(j27, (long) (f24 * f25), (long) (gaVar2.g * f25));
                } else if (!this.B || gaVar2 == null) {
                    float f26 = this.P;
                    long j28 = this.O;
                    this.e = Utilities.clamp((long) (f26 * j28), j28, 0L);
                } else {
                    long j29 = this.N + ((long) (this.P * this.O));
                    float f27 = this.H;
                    float f28 = gaVar2.e;
                    this.e = Utilities.clamp(j29, (long) (f27 * f28), (long) (this.G * f28));
                }
                fa faVar6 = this.a;
                if (faVar6 != null) {
                    faVar6.B(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        faVar.U(true);
        ga gaVar3 = this.h;
        if (gaVar3 != null) {
            long j30 = this.N + ((long) (this.P * this.O));
            float f29 = gaVar3.h;
            float f30 = gaVar3.e;
            clamp = Utilities.clamp(j30, (long) (f29 * f30), (long) (gaVar3.g * f30));
        } else if (this.B) {
            long j31 = this.N + ((long) (this.P * this.O));
            float f31 = this.H;
            float f32 = this.E;
            clamp = Utilities.clamp(j31, (long) (f31 * f32), (long) (this.G * f32));
        } else {
            float f33 = this.P;
            long j32 = this.O;
            clamp = Utilities.clamp((long) (f33 * j32), j32, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.Z0 = this.e;
            this.Y0.d(1.0f, true);
        }
        fa faVar7 = this.a;
        this.e = clamp;
        faVar7.B(clamp, false);
    }

    public final void i(ga gaVar, float f10) {
        fa faVar;
        long clamp;
        long j10;
        long j11;
        long j12;
        long j13;
        if (gaVar == null) {
            return;
        }
        ga gaVar2 = this.v;
        if (gaVar2 != gaVar && gaVar2 != null) {
            if (this.n == this.s.indexOf(gaVar)) {
                ga gaVar3 = this.v;
                float f11 = gaVar3.e;
                float f12 = gaVar.h;
                float f13 = gaVar.e;
                long j14 = (long) ((f11 * 1.0f) - (f12 * f13));
                float f14 = gaVar.g;
                long j15 = (long) ((f11 * 0.0f) - (f14 * f13));
                float min = Math.min(f12 - f14, ((gaVar3.h - gaVar3.g) * f11) / f13);
                long j16 = gaVar.f;
                long j17 = (long) f10;
                long j18 = j16 + j17;
                if (j18 > j14) {
                    float clamp2 = Utilities.clamp((((this.v.h * r2.e) - j16) - j17) / gaVar.e, 1.0f, min);
                    gaVar.h = clamp2;
                    float clamp3 = Utilities.clamp(clamp2 - min, 1.0f, 0.0f);
                    gaVar.g = clamp3;
                    ga gaVar4 = this.v;
                    float f15 = gaVar4.h;
                    float f16 = gaVar4.e;
                    float f17 = gaVar.h;
                    float f18 = gaVar.e;
                    long j19 = (long) ((f15 * f16) - (f17 * f18));
                    long j20 = (long) ((gaVar4.g * f16) - (clamp3 * f18));
                    if (j19 < j20) {
                        j13 = j20;
                        j12 = j19;
                    } else {
                        j12 = j20;
                        j13 = j19;
                    }
                    gaVar.f = Utilities.clamp(gaVar.f + j17, j13, j12);
                    fa faVar2 = this.a;
                    if (faVar2 != null) {
                        faVar2.m0(gaVar.g, gaVar.a);
                        this.a.u0(gaVar.h, gaVar.a);
                    }
                } else if (j18 < j15) {
                    float clamp4 = Utilities.clamp((((this.v.g * r2.e) - j16) - j17) / gaVar.e, 1.0f - min, 0.0f);
                    gaVar.g = clamp4;
                    float clamp5 = Utilities.clamp(clamp4 + min, 1.0f, 0.0f);
                    gaVar.h = clamp5;
                    ga gaVar5 = this.v;
                    float f19 = gaVar5.h;
                    float f20 = gaVar5.e;
                    float f21 = gaVar.e;
                    long j21 = (long) ((f19 * f20) - (clamp5 * f21));
                    long j22 = (long) ((gaVar5.g * f20) - (gaVar.g * f21));
                    if (j21 < j22) {
                        j11 = j22;
                        j10 = j21;
                    } else {
                        j10 = j22;
                        j11 = j21;
                    }
                    gaVar.f = Utilities.clamp(gaVar.f + j17, j11, j10);
                    fa faVar3 = this.a;
                    if (faVar3 != null) {
                        faVar3.m0(gaVar.g, gaVar.a);
                        this.a.u0(gaVar.h, gaVar.a);
                    }
                } else {
                    gaVar.f = j18;
                }
            } else {
                long j23 = gaVar.f + ((long) f10);
                float baseDuration = getBaseDuration();
                float f22 = gaVar.e;
                gaVar.f = Utilities.clamp(j23, (long) (baseDuration - (gaVar.h * f22)), (long) ((-gaVar.g) * f22));
            }
        }
        invalidate();
        fa faVar4 = this.a;
        if (faVar4 != null) {
            faVar4.E0(gaVar.a, gaVar.f);
        }
        boolean z4 = this.j1;
        if (z4 || (faVar = this.a) == null) {
            if (z4 || this.o1) {
                ga gaVar6 = this.v;
                if (gaVar6 == gaVar || gaVar6 == null) {
                    float f23 = gaVar.g;
                    long j24 = gaVar.e;
                    this.e = Utilities.clamp((long) (f23 * j24), j24, 0L);
                } else {
                    long j25 = gaVar.f + ((long) (gaVar.g * gaVar.e));
                    float f24 = gaVar6.h;
                    float f25 = gaVar6.e;
                    this.e = Utilities.clamp(j25, (long) (f24 * f25), (long) (gaVar6.g * f25));
                }
                fa faVar5 = this.a;
                if (faVar5 != null) {
                    faVar5.B(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        faVar.U(true);
        ga gaVar7 = this.v;
        if (gaVar7 == gaVar || gaVar7 == null) {
            float f26 = gaVar.g;
            long j26 = gaVar.e;
            clamp = Utilities.clamp((long) (f26 * j26), j26, 0L);
        } else {
            long j27 = gaVar.f + ((long) (gaVar.g * gaVar.e));
            float f27 = gaVar7.h;
            float f28 = gaVar7.e;
            clamp = Utilities.clamp(j27, (long) (f27 * f28), (long) (gaVar7.g * f28));
        }
        ga gaVar8 = this.v;
        if (gaVar8 != gaVar && gaVar8 != null && Math.abs(this.e - clamp) > 400) {
            this.Z0 = this.e;
            this.Y0.d(1.0f, true);
        }
        fa faVar6 = this.a;
        this.e = clamp;
        faVar6.B(clamp, false);
    }

    public final void j(float f10) {
        long j10;
        long j11;
        long j12;
        long j13;
        fa faVar;
        long clamp;
        ga gaVar = this.h;
        if (gaVar == null) {
            long j14 = this.F;
            long clamp2 = Utilities.clamp(j14 + ((long) f10), 0L, -(this.E - Math.min(getBaseDuration(), getMaxScrollDuration())));
            this.F = clamp2;
            float f11 = clamp2 - j14;
            this.G = Utilities.clamp(this.G - (f11 / this.E), 1.0f, 0.0f);
            this.H = Utilities.clamp(this.H - (f11 / this.E), 1.0f, 0.0f);
            fa faVar2 = this.a;
            if (faVar2 != null) {
                faVar2.J(this.G);
                this.a.y0(this.H);
            }
        } else if (this.D) {
            float f12 = gaVar.h;
            float f13 = gaVar.e;
            float f14 = this.H;
            float f15 = this.E;
            long j15 = (long) ((f12 * f13) - (f14 * f15));
            float f16 = gaVar.g;
            float f17 = this.G;
            long j16 = (long) ((f16 * f13) - (f17 * f15));
            float min = Math.min(f14 - f17, ((f12 - f16) * f13) / f15);
            long j17 = this.F;
            long j18 = (long) f10;
            long j19 = j17 + j18;
            if (j19 > j15) {
                float clamp3 = Utilities.clamp((((this.h.h * r1.e) - j17) - j18) / this.E, 1.0f, min);
                this.H = clamp3;
                float clamp4 = Utilities.clamp(clamp3 - min, 1.0f, 0.0f);
                this.G = clamp4;
                ga gaVar2 = this.h;
                float f18 = gaVar2.h;
                float f19 = gaVar2.e;
                float f20 = this.H;
                float f21 = this.E;
                long j20 = (long) ((f18 * f19) - (f20 * f21));
                long j21 = (long) ((gaVar2.g * f19) - (clamp4 * f21));
                if (j20 < j21) {
                    j13 = j21;
                    j12 = j20;
                } else {
                    j12 = j21;
                    j13 = j20;
                }
                this.F = Utilities.clamp(this.F + j18, j13, j12);
                fa faVar3 = this.a;
                if (faVar3 != null) {
                    faVar3.J(this.G);
                    this.a.y0(this.H);
                }
            } else if (j19 < j16) {
                float clamp5 = Utilities.clamp((((this.h.g * r1.e) - j17) - j18) / this.E, 1.0f - min, 0.0f);
                this.G = clamp5;
                float clamp6 = Utilities.clamp(clamp5 + min, 1.0f, 0.0f);
                this.H = clamp6;
                ga gaVar3 = this.h;
                float f22 = gaVar3.h;
                float f23 = gaVar3.e;
                float f24 = this.E;
                long j22 = (long) ((f22 * f23) - (clamp6 * f24));
                long j23 = (long) ((gaVar3.g * f23) - (this.G * f24));
                if (j22 < j23) {
                    j11 = j23;
                    j10 = j22;
                } else {
                    j10 = j23;
                    j11 = j22;
                }
                this.F = Utilities.clamp(this.F + j18, j11, j10);
                fa faVar4 = this.a;
                if (faVar4 != null) {
                    faVar4.J(this.G);
                    this.a.y0(this.H);
                }
            } else {
                this.F = j19;
            }
        } else {
            long j24 = this.F + ((long) f10);
            float baseDuration = getBaseDuration();
            float f25 = this.E;
            this.F = Utilities.clamp(j24, (long) (baseDuration - (this.H * f25)), (long) ((-this.G) * f25));
        }
        invalidate();
        fa faVar5 = this.a;
        if (faVar5 != null) {
            faVar5.h0(this.F + ((long) (this.G * this.E)));
        }
        boolean z4 = this.j1;
        if (z4 || (faVar = this.a) == null) {
            if (z4 || this.o1) {
                ga gaVar4 = this.h;
                if (gaVar4 != null) {
                    long j25 = this.F + ((long) (this.G * this.E));
                    float f26 = gaVar4.h;
                    float f27 = gaVar4.e;
                    this.e = Utilities.clamp(j25, (long) (f26 * f27), (long) (gaVar4.g * f27));
                } else {
                    float f28 = this.G;
                    long j26 = this.E;
                    this.e = Utilities.clamp((long) (f28 * j26), j26, 0L);
                }
                fa faVar6 = this.a;
                if (faVar6 != null) {
                    faVar6.B(this.e, false);
                    return;
                }
                return;
            }
            return;
        }
        faVar.U(true);
        ga gaVar5 = this.h;
        if (gaVar5 != null) {
            long j27 = this.F + ((long) (this.G * this.E));
            float f29 = gaVar5.h;
            float f30 = gaVar5.e;
            clamp = Utilities.clamp(j27, (long) (f29 * f30), (long) (gaVar5.g * f30));
        } else {
            float f31 = this.G;
            long j28 = this.E;
            clamp = Utilities.clamp((long) (f31 * j28), j28, 0L);
        }
        if (this.h != null && Math.abs(this.e - clamp) > 400) {
            this.Z0 = this.e;
            this.Y0.d(1.0f, true);
        }
        fa faVar7 = this.a;
        this.e = clamp;
        faVar7.B(clamp, false);
    }

    public final void k() {
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        ga gaVar = this.h;
        float f10 = (gaVar.h + gaVar.g) / 2.0f;
        long j10 = gaVar.e;
        this.f = Utilities.clamp((long) ((f10 * j10) - (min / 2.0f)), j10 - min, 0L);
        invalidate();
    }

    public final void l(boolean z4) {
        if (z4 && this.B) {
            this.D = true;
            this.M = false;
        } else {
            this.D = false;
            this.M = this.K && this.h == null;
        }
        invalidate();
    }

    public final boolean m(float f10, boolean z4) {
        ga gaVar = this.h;
        ArrayList arrayList = this.s;
        if (gaVar == null && !this.K && arrayList.isEmpty()) {
            return false;
        }
        long min = Math.min(getBaseDuration(), getMaxScrollDuration());
        float f11 = ((f10 - this.v1) - this.u1) / this.r1;
        ga gaVar2 = this.v;
        long j10 = gaVar2 != null ? (long) ((gaVar2.g * gaVar2.e) + gaVar2.f) : 0L;
        float f12 = f11 * min;
        if (gaVar2 == null) {
            j10 = this.h == null ? this.N : 0L;
        }
        long clamp = (long) Utilities.clamp((f12 - j10) + this.f, getBaseDuration(), 0.0f);
        ga gaVar3 = this.h;
        if (gaVar3 != null) {
            float f13 = clamp / gaVar3.e;
            if (f13 < gaVar3.g || f13 > gaVar3.h) {
                return false;
            }
        }
        ga gaVar4 = this.v;
        if (gaVar4 != null && (clamp < 0 || clamp >= ((long) ((gaVar4.h - gaVar4.g) * gaVar4.e)))) {
            return false;
        }
        if (this.K && gaVar3 == null && arrayList.isEmpty()) {
            float f14 = clamp / this.O;
            if (f14 < this.P || f14 > this.Q) {
                return false;
            }
        }
        this.e = clamp;
        invalidate();
        fa faVar = this.a;
        if (faVar != null) {
            faVar.B(clamp, z4);
        }
        hg.y1 y1Var = this.a1;
        if (y1Var != null) {
            AndroidUtilities.cancelRunOnUIThread(y1Var);
            this.a1 = null;
        }
        if (!z4) {
            return true;
        }
        hg.y1 y1Var2 = new hg.y1(this, clamp, 27);
        this.a1 = y1Var2;
        AndroidUtilities.runOnUIThread(y1Var2, 150L);
        return true;
    }

    public final void n(String str, long j10, long j11, float f10, float f11, float f12, boolean z4) {
        long j12;
        boolean z10;
        boolean z11;
        ga gaVar;
        if (TextUtils.equals(this.C, str)) {
            return;
        }
        ja jaVar = this.J;
        if (jaVar != null) {
            jaVar.b();
            this.J = null;
        }
        long j13 = this.E;
        if (str != null) {
            this.C = str;
            this.E = j10;
            this.F = j11 - ((long) (j10 * f10));
            this.G = f10;
            this.H = f11;
            this.I = f12;
            if (getMeasuredWidth() <= 0 || this.J != null || ((gaVar = this.h) != null && gaVar.e < 1)) {
                j12 = j13;
                z11 = false;
                z10 = true;
            } else {
                String str2 = this.C;
                int i10 = this.s1;
                int i11 = this.v1;
                int i12 = (i10 - i11) - i11;
                int dp = AndroidUtilities.dp(38.0f);
                long j14 = this.E;
                Long valueOf = j14 > 2 ? Long.valueOf(j14) : null;
                ga gaVar2 = this.h;
                j12 = j13;
                z11 = false;
                z10 = true;
                this.J = new ja(this, false, str2, i12, dp, valueOf, gaVar2 != null ? gaVar2.e : getMaxScrollDuration(), -1L, -1L, new ca(this, 0));
            }
            if (this.h == null) {
                this.M = z11;
                this.D = z10;
            }
        } else {
            j12 = j13;
            z10 = true;
            this.C = null;
            this.E = 1L;
            this.D = false;
        }
        this.B = this.C != null;
        if (j12 != j10 && this.h == null && this.U != null) {
            this.T = z10;
            p();
        }
        if (this.K && this.B && this.h == null) {
            this.P = 0.0f;
            this.Q = Utilities.clamp(j10 / this.O, 1.0f, 0.0f);
        }
        if (!z4) {
            this.a0.f(this.D, z10);
            this.c0.f(this.M, z10);
            this.W.f(this.B, z10);
        }
        invalidate();
    }

    public final void o(boolean z4, String str, long j10, float f10) {
        ga gaVar = this.h;
        if (TextUtils.equals(gaVar == null ? null : gaVar.d, str)) {
            return;
        }
        ga gaVar2 = this.h;
        if (gaVar2 != null) {
            ja jaVar = gaVar2.c;
            if (jaVar != null) {
                jaVar.b();
                this.h.c = null;
            }
            this.h = null;
        }
        if (str != null) {
            this.f = 0L;
            ga gaVar3 = new ga(this);
            this.h = gaVar3;
            gaVar3.b = z4;
            gaVar3.d = str;
            gaVar3.e = j10;
            gaVar3.i = f10;
            ga.a(gaVar3, false);
        } else {
            this.h = null;
            this.f = 0L;
        }
        if (!this.B) {
            this.D = false;
        }
        this.e = 0L;
        invalidate();
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        this.I0.setTextSize(AndroidUtilities.dp(12.0f));
        this.M0.setTextSize(AndroidUtilities.dp(12.0f));
        int dp = AndroidUtilities.dp(12.0f);
        this.v1 = dp;
        int dp2 = AndroidUtilities.dp(5.0f);
        this.w1 = dp2;
        setPadding(dp, dp2, AndroidUtilities.dp(12.0f), AndroidUtilities.dp(5.0f));
        int size = View.MeasureSpec.getSize(i10);
        this.s1 = size;
        int dp3 = AndroidUtilities.dp(388);
        this.t1 = dp3;
        setMeasuredDimension(size, dp3);
        int dp4 = AndroidUtilities.dp(10.0f);
        this.u1 = dp4;
        this.r1 = (this.s1 - (dp4 * 2)) - (this.v1 * 2);
        ga gaVar = this.h;
        if (gaVar != null && gaVar.d != null && gaVar.c == null) {
            ga.a(gaVar, false);
        }
        ArrayList arrayList = this.s;
        if (!arrayList.isEmpty()) {
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj = arrayList.get(i12);
                i12++;
                ga gaVar2 = (ga) obj;
                if (gaVar2.d != null && gaVar2.c == null) {
                    ga.a(gaVar2, false);
                    ga.b(gaVar2);
                }
            }
        }
        if (this.L == null || this.U != null) {
            return;
        }
        p();
    }

    /* JADX WARN: Removed duplicated region for block: B:188:0x03f9  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x04ff  */
    /* JADX WARN: Removed duplicated region for block: B:303:0x07a3  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x0da4  */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0dce  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        hg.y1 y1Var;
        boolean z10;
        VelocityTracker velocityTracker;
        fa faVar;
        VelocityTracker velocityTracker2;
        long j10;
        boolean z11;
        long j11;
        long j12;
        long j13;
        float f10;
        VelocityTracker velocityTracker3;
        long j14;
        long j15;
        VelocityTracker velocityTracker4;
        VelocityTracker velocityTracker5;
        Runnable runnable;
        VelocityTracker velocityTracker6;
        float min;
        float max;
        float min2;
        boolean z12;
        float max2;
        boolean z13;
        fa faVar2;
        int i10;
        float f11;
        float f12;
        boolean z14;
        float f13;
        float clamp;
        fa faVar3;
        fa faVar4;
        int i11;
        float f14;
        float f15;
        ga gaVar = this.h;
        ArrayList arrayList = this.s;
        if (gaVar != null || !arrayList.isEmpty() || this.K || this.B) {
            float timelineHeight = this.t1 - getTimelineHeight();
            if (motionEvent.getAction() != 0 || motionEvent.getY() >= timelineHeight) {
                long currentTimeMillis = System.currentTimeMillis();
                int action = motionEvent.getAction();
                vm0 vm0Var = this.T0;
                y61 y61Var = this.V0;
                if (action == 0) {
                    hg.y1 y1Var2 = this.a1;
                    if (y1Var2 != null) {
                        AndroidUtilities.cancelRunOnUIThread(y1Var2);
                        this.a1 = null;
                    }
                    vm0Var.a();
                    this.f1 = -1;
                    this.e1 = c(motionEvent);
                    this.g1 = -1;
                    this.h1 = -1;
                    int i12 = this.t1 - this.w1;
                    if (!this.g0) {
                        if (this.l0.contains(motionEvent.getX(), motionEvent.getY())) {
                            this.g1 = 10;
                            this.e1 = -1;
                        }
                    }
                    if (this.g1 != -1 || this.h == null) {
                        f14 = 4.0f;
                    } else {
                        float f16 = i12;
                        if (motionEvent.getY() < f16) {
                            f14 = 4.0f;
                            if (motionEvent.getY() > (f16 - getVideoHeight()) - AndroidUtilities.dp(2.0f)) {
                                this.g1 = 0;
                            }
                        } else {
                            f14 = 4.0f;
                        }
                        i12 = (int) (f16 - (getVideoHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.g1 == -1 && !arrayList.isEmpty()) {
                        for (int i13 = 0; i13 < arrayList.size(); i13++) {
                            f15 = 2.0f;
                            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(28.0f), AndroidUtilities.dp(38.0f), ((ga) arrayList.get(i13)).k.c);
                            float f17 = i12;
                            if (motionEvent.getY() < f17 && motionEvent.getY() > (f17 - lerp) - AndroidUtilities.dp(2.0f)) {
                                this.g1 = 3;
                                this.h1 = i13;
                                break;
                            }
                            i12 = (int) (f17 - (lerp + AndroidUtilities.dp(f14)));
                        }
                    }
                    f15 = 2.0f;
                    if (this.g1 == -1 && this.B) {
                        float f18 = i12;
                        if (motionEvent.getY() < f18 && motionEvent.getY() > (f18 - getRoundHeight()) - AndroidUtilities.dp(f15)) {
                            this.g1 = 1;
                        }
                        i12 = (int) (f18 - (getRoundHeight() + AndroidUtilities.dp(f14)));
                    }
                    if (this.g1 == -1 && this.K) {
                        float f19 = i12;
                        if (motionEvent.getY() < f19 && motionEvent.getY() > (f19 - getAudioHeight()) - AndroidUtilities.dp(f15)) {
                            this.g1 = 2;
                        }
                        getAudioHeight();
                        AndroidUtilities.dp(f14);
                    }
                    this.c1 = System.currentTimeMillis();
                    int i14 = this.e1;
                    this.i1 = i14 == 0 || i14 == -1 || i14 == 1;
                    this.l1 = false;
                    if (i14 == 1 || i14 == 5 || i14 == 8) {
                        this.m1 = VelocityTracker.obtain();
                    } else {
                        VelocityTracker velocityTracker7 = this.m1;
                        if (velocityTracker7 != null) {
                            velocityTracker7.recycle();
                            this.m1 = null;
                        }
                    }
                    this.k1 = 1.0f;
                    this.j1 = false;
                    this.d1 = motionEvent.getX();
                    if (!this.U0) {
                        AndroidUtilities.cancelRunOnUIThread(y61Var);
                        AndroidUtilities.runOnUIThread(y61Var, ViewConfiguration.getLongPressTimeout());
                    }
                } else if (motionEvent.getAction() == 2) {
                    float x10 = motionEvent.getX() - this.d1;
                    if (this.g0 && (this.j1 || Math.abs(x10) > AndroidUtilities.touchSlop)) {
                        long min3 = Math.min(getBaseDuration(), getMaxScrollDuration());
                        ga gaVar2 = this.h;
                        if (gaVar2 != null && this.e1 == 1) {
                            this.f = (long) Utilities.clamp(this.f - ((x10 / this.r1) * min3), gaVar2.e - min3, 0.0f);
                            invalidate();
                            if (!this.j1) {
                                this.k1 = 1.0f;
                            }
                            this.j1 = true;
                            this.i1 = false;
                        } else if (gaVar2 == null || !((i11 = this.e1) == 2 || i11 == 3 || i11 == 4)) {
                            int i15 = this.e1;
                            if (i15 == 6 || i15 == 7 || i15 == 8) {
                                float f20 = (min3 / this.O) * (x10 / this.r1);
                                if (i15 == 6) {
                                    float g10 = this.Q - (g() / this.O);
                                    float max3 = Math.max(0L, this.f - this.N);
                                    float f21 = this.O;
                                    float f22 = max3 / f21;
                                    ga gaVar3 = this.h;
                                    if (gaVar3 != null) {
                                        max = Math.max(f22, (((gaVar3.g * gaVar3.e) + this.f) - this.N) / f21);
                                    } else {
                                        ga gaVar4 = this.v;
                                        if (gaVar4 != null) {
                                            max = Math.max(f22, (((gaVar4.g * gaVar4.e) + this.f) - this.N) / f21);
                                        } else if (this.B) {
                                            max = Math.max(f22, (((this.G * this.E) + this.f) - this.N) / f21);
                                        } else {
                                            max = Math.max(f22, this.Q - (f() / this.O));
                                            if (!this.l1 && f20 < 0.0f && this.P <= this.Q - (f() / this.O)) {
                                                this.e1 = 8;
                                            }
                                        }
                                    }
                                    float f23 = this.P;
                                    float clamp2 = Utilities.clamp(f23 + f20, g10, max);
                                    this.P = clamp2;
                                    if (Math.abs(f23 - clamp2) > 0.01f) {
                                        this.l1 = true;
                                    }
                                    fa faVar5 = this.a;
                                    if (faVar5 != null) {
                                        faVar5.H0(this.N + ((long) (this.P * this.O)));
                                    }
                                    fa faVar6 = this.a;
                                    if (faVar6 != null) {
                                        faVar6.t0(this.P);
                                    }
                                } else if (i15 == 7) {
                                    float min4 = Math.min(1.0f, Math.max(0L, (this.f - this.N) + min3) / this.O);
                                    float f24 = this.P;
                                    float g11 = g();
                                    float f25 = this.O;
                                    float f26 = (g11 / f25) + f24;
                                    ga gaVar5 = this.h;
                                    if (gaVar5 != null) {
                                        min = Math.min(min4, (((gaVar5.h * gaVar5.e) + this.f) - this.N) / f25);
                                    } else {
                                        ga gaVar6 = this.v;
                                        if (gaVar6 != null) {
                                            min = Math.min(min4, (((gaVar6.h * gaVar6.e) + this.f) - this.N) / f25);
                                        } else if (this.B) {
                                            min = Math.min(min4, (((this.H * this.E) + this.f) - this.N) / f25);
                                        } else {
                                            min = Math.min(min4, (f() / this.O) + this.P);
                                            if (!this.l1 && f20 > 0.0f) {
                                                if (this.Q >= (f() / this.O) + this.P) {
                                                    this.e1 = 8;
                                                }
                                            }
                                        }
                                    }
                                    float f27 = this.Q;
                                    float clamp3 = Utilities.clamp(f27 + f20, min, f26);
                                    this.Q = clamp3;
                                    if (Math.abs(f27 - clamp3) > 0.01f) {
                                        this.l1 = true;
                                    }
                                    fa faVar7 = this.a;
                                    if (faVar7 != null) {
                                        faVar7.r0(this.Q);
                                    }
                                }
                                if (this.e1 == 8) {
                                    float min5 = f20 > 0.0f ? Math.min(Math.max(0.0f, Math.min(1.0f, Math.max(0L, (this.f - this.N) + min3) / this.O) - this.Q), f20) : Math.max(Math.min(0.0f, (Math.max(0L, this.f - this.N) / this.O) - this.P), f20);
                                    float f28 = this.P + min5;
                                    this.P = f28;
                                    this.Q += min5;
                                    fa faVar8 = this.a;
                                    if (faVar8 != null) {
                                        faVar8.t0(f28);
                                        this.a.H0(this.N + ((long) (this.P * this.O)));
                                        this.a.r0(this.Q);
                                    }
                                    fa faVar9 = this.a;
                                    if (faVar9 != null) {
                                        faVar9.U(true);
                                    }
                                }
                                if (this.h == null && !this.B) {
                                    this.e = (long) (this.P * this.O);
                                    fa faVar10 = this.a;
                                    if (faVar10 != null) {
                                        faVar10.U(true);
                                        this.a.B(this.e, false);
                                    }
                                }
                                invalidate();
                                if (!this.j1) {
                                    this.k1 = 1.0f;
                                }
                                this.j1 = true;
                                this.i1 = false;
                            } else if (i15 == 10 || i15 == 11 || i15 == 12) {
                                float f29 = (min3 / this.E) * (x10 / this.r1);
                                if (i15 == 10) {
                                    float g12 = this.H - (g() / this.E);
                                    float max4 = Math.max(0L, this.f - this.F);
                                    float f30 = this.E;
                                    float f31 = max4 / f30;
                                    ga gaVar7 = this.h;
                                    if (gaVar7 != null) {
                                        max2 = Math.max(f31, (((gaVar7.g * gaVar7.e) + this.f) - this.F) / f30);
                                    } else {
                                        ga gaVar8 = this.v;
                                        if (gaVar8 != null) {
                                            max2 = Math.max(f31, (((gaVar8.g * gaVar8.e) + this.f) - this.F) / f30);
                                        } else {
                                            max2 = Math.max(f31, this.H - (f() / this.E));
                                            if (!this.l1 && f29 < 0.0f && this.G <= this.H - (f() / this.E)) {
                                                this.e1 = 8;
                                            }
                                        }
                                    }
                                    float f32 = this.G;
                                    float clamp4 = Utilities.clamp(f32 + f29, g12, max2);
                                    this.G = clamp4;
                                    if (Math.abs(f32 - clamp4) > 0.01f) {
                                        this.l1 = true;
                                    }
                                    fa faVar11 = this.a;
                                    if (faVar11 != null) {
                                        faVar11.h0(this.F + ((long) (this.G * this.E)));
                                    }
                                    fa faVar12 = this.a;
                                    if (faVar12 != null) {
                                        faVar12.J(this.G);
                                    }
                                } else if (i15 == 11) {
                                    float min6 = Math.min(1.0f, Math.max(0L, (this.f - this.F) + min3) / this.E);
                                    float f33 = this.G;
                                    float g13 = g();
                                    float f34 = this.E;
                                    float f35 = (g13 / f34) + f33;
                                    ga gaVar9 = this.h;
                                    if (gaVar9 != null) {
                                        min6 = Math.min(min6, (((gaVar9.h * gaVar9.e) + this.f) - this.F) / f34);
                                    }
                                    ga gaVar10 = this.v;
                                    if (gaVar10 != null) {
                                        min2 = Math.min(min6, (((gaVar10.h * gaVar10.e) + this.f) - this.F) / this.E);
                                    } else {
                                        min2 = Math.min(min6, (f() / this.E) + this.G);
                                        if (!this.l1 && f29 > 0.0f) {
                                            if (this.H >= (f() / this.E) + this.G) {
                                                this.e1 = 8;
                                            }
                                        }
                                    }
                                    float f36 = this.H;
                                    float clamp5 = Utilities.clamp(f36 + f29, min2, f35);
                                    this.H = clamp5;
                                    if (Math.abs(f36 - clamp5) > 0.01f) {
                                        this.l1 = true;
                                    }
                                    fa faVar13 = this.a;
                                    if (faVar13 != null) {
                                        faVar13.y0(this.H);
                                    }
                                }
                                if (this.e1 == 12) {
                                    float min7 = f29 > 0.0f ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - this.F) + min3) / this.E) - this.H, f29) : Math.max((Math.max(0L, this.f - this.F) / this.E) - this.G, f29);
                                    float f37 = this.G + min7;
                                    this.G = f37;
                                    this.H += min7;
                                    fa faVar14 = this.a;
                                    if (faVar14 != null) {
                                        faVar14.J(f37);
                                        this.a.h0(this.F + ((long) (this.G * this.E)));
                                        this.a.y0(this.H);
                                    }
                                    fa faVar15 = this.a;
                                    if (faVar15 != null) {
                                        faVar15.U(true);
                                    }
                                }
                                if (this.h == null) {
                                    this.e = (long) (this.G * this.E);
                                    fa faVar16 = this.a;
                                    if (faVar16 != null) {
                                        faVar16.U(true);
                                        z12 = false;
                                        this.a.B(this.e, false);
                                        invalidate();
                                        if (!this.j1) {
                                            this.k1 = 1.0f;
                                        }
                                        this.j1 = true;
                                        this.i1 = z12;
                                    }
                                }
                                z12 = false;
                                invalidate();
                                if (!this.j1) {
                                }
                                this.j1 = true;
                                this.i1 = z12;
                            } else {
                                int i16 = this.f1;
                                if (i16 < 0 || i16 >= arrayList.size() || !((i10 = this.e1) == 13 || i10 == 14 || i10 == 15)) {
                                    int i17 = this.e1;
                                    if (i17 == 5) {
                                        h((x10 / this.r1) * min3);
                                        if (!this.j1) {
                                            this.k1 = 1.0f;
                                        }
                                        this.j1 = true;
                                        this.i1 = false;
                                    } else if (i17 == 9) {
                                        j((x10 / this.r1) * min3);
                                        if (!this.j1) {
                                            this.k1 = 1.0f;
                                        }
                                        this.j1 = true;
                                        this.i1 = false;
                                    } else {
                                        int i18 = this.f1;
                                        if (i18 >= 0 && i18 < arrayList.size() && this.e1 == 16) {
                                            i((ga) arrayList.get(this.f1), (x10 / this.r1) * min3);
                                            if (!this.j1) {
                                                this.k1 = 1.0f;
                                            }
                                            this.j1 = true;
                                            this.i1 = false;
                                        } else if (this.i1) {
                                            m(motionEvent.getX(), currentTimeMillis - this.b1 < 350);
                                            if (this.j1 || (faVar2 = this.a) == null) {
                                                z13 = true;
                                            } else {
                                                z13 = true;
                                                faVar2.U(true);
                                            }
                                            if (!this.j1) {
                                                this.k1 = 1.0f;
                                            }
                                            this.j1 = z13;
                                        }
                                    }
                                } else {
                                    ga gaVar11 = (ga) arrayList.get(this.f1);
                                    float f38 = (min3 / gaVar11.e) * (x10 / this.r1);
                                    int i19 = this.e1;
                                    if (i19 == 13) {
                                        float g14 = gaVar11.h - (g() / gaVar11.e);
                                        float max5 = Math.max(0L, this.f - gaVar11.f) / gaVar11.e;
                                        if (gaVar11 == this.v) {
                                            f11 = f38;
                                            max5 = Math.max(max5, gaVar11.h - (f() / gaVar11.e));
                                            if (!this.l1 && f11 < 0.0f) {
                                                f12 = 0.0f;
                                                if (gaVar11.g <= gaVar11.h - (f() / gaVar11.e)) {
                                                    this.e1 = 15;
                                                }
                                                f13 = gaVar11.g;
                                                clamp = Utilities.clamp(f13 + f11, g14, max5);
                                                gaVar11.g = clamp;
                                                if (Math.abs(f13 - clamp) > 0.01f) {
                                                    this.l1 = true;
                                                }
                                                faVar3 = this.a;
                                                if (faVar3 != null) {
                                                    faVar3.E0(gaVar11.a, gaVar11.f);
                                                }
                                                faVar4 = this.a;
                                                if (faVar4 != null) {
                                                    faVar4.m0(gaVar11.g, gaVar11.a);
                                                }
                                            }
                                        } else {
                                            f11 = f38;
                                        }
                                        f12 = 0.0f;
                                        f13 = gaVar11.g;
                                        clamp = Utilities.clamp(f13 + f11, g14, max5);
                                        gaVar11.g = clamp;
                                        if (Math.abs(f13 - clamp) > 0.01f) {
                                        }
                                        faVar3 = this.a;
                                        if (faVar3 != null) {
                                        }
                                        faVar4 = this.a;
                                        if (faVar4 != null) {
                                        }
                                    } else {
                                        f11 = f38;
                                        f12 = 0.0f;
                                        if (i19 == 14) {
                                            float min8 = Math.min(1.0f, Math.max(0L, (this.f - gaVar11.f) + min3) / gaVar11.e);
                                            float g15 = (g() / gaVar11.e) + gaVar11.g;
                                            if (gaVar11 == this.v) {
                                                min8 = Math.min(min8, (f() / gaVar11.e) + gaVar11.g);
                                                if (!this.l1 && f11 > 0.0f) {
                                                    if (gaVar11.h >= (f() / gaVar11.e) + gaVar11.g) {
                                                        this.e1 = 15;
                                                    }
                                                }
                                            }
                                            float f39 = gaVar11.h;
                                            float clamp6 = Utilities.clamp(f39 + f11, min8, g15);
                                            gaVar11.h = clamp6;
                                            if (Math.abs(f39 - clamp6) > 0.01f) {
                                                this.l1 = true;
                                            }
                                            fa faVar17 = this.a;
                                            if (faVar17 != null) {
                                                faVar17.u0(gaVar11.h, gaVar11.a);
                                            }
                                        }
                                    }
                                    if (this.e1 == 15) {
                                        float min9 = f11 > f12 ? Math.min(Math.min(1.0f, Math.max(0L, (this.f - gaVar11.f) + min3) / gaVar11.e) - gaVar11.h, f11) : Math.max((Math.max(0L, this.f - gaVar11.f) / gaVar11.e) - gaVar11.g, f11);
                                        float f40 = gaVar11.g + min9;
                                        gaVar11.g = f40;
                                        gaVar11.h += min9;
                                        fa faVar18 = this.a;
                                        if (faVar18 != null) {
                                            faVar18.m0(f40, gaVar11.a);
                                            this.a.E0(gaVar11.a, gaVar11.f);
                                            this.a.u0(gaVar11.h, gaVar11.a);
                                        }
                                        fa faVar19 = this.a;
                                        if (faVar19 != null) {
                                            z14 = true;
                                            faVar19.U(true);
                                            invalidate();
                                            if (!this.j1) {
                                                this.k1 = 1.0f;
                                            }
                                            this.j1 = z14;
                                            this.i1 = false;
                                        }
                                    }
                                    z14 = true;
                                    invalidate();
                                    if (!this.j1) {
                                    }
                                    this.j1 = z14;
                                    this.i1 = false;
                                }
                            }
                        } else {
                            float f41 = gaVar2.e;
                            float f42 = (min3 / f41) * (x10 / this.r1);
                            if (i11 == 2) {
                                gaVar2.g = Utilities.clamp(gaVar2.g + f42, gaVar2.h - (1000.0f / f41), 0.0f);
                                fa faVar20 = this.a;
                                if (faVar20 != null) {
                                    faVar20.d0(this.h.g, false);
                                }
                                ga gaVar12 = this.h;
                                float f43 = gaVar12.h - gaVar12.g;
                                float f44 = f();
                                ga gaVar13 = this.h;
                                if (f43 > f44 / gaVar13.e) {
                                    gaVar13.h = Math.min(1.0f, (f() / this.h.e) + gaVar13.g);
                                    fa faVar21 = this.a;
                                    if (faVar21 != null) {
                                        faVar21.v0(this.h.h);
                                    }
                                }
                            } else if (i11 == 3) {
                                gaVar2.h = Utilities.clamp(gaVar2.h + f42, 1.0f, (1000.0f / f41) + gaVar2.g);
                                fa faVar22 = this.a;
                                if (faVar22 != null) {
                                    faVar22.v0(this.h.h);
                                }
                                ga gaVar14 = this.h;
                                float f45 = gaVar14.h - gaVar14.g;
                                float f46 = f();
                                ga gaVar15 = this.h;
                                if (f45 > f46 / gaVar15.e) {
                                    gaVar15.g = Math.max(0.0f, gaVar15.h - (f() / this.h.e));
                                    fa faVar23 = this.a;
                                    if (faVar23 != null) {
                                        faVar23.d0(this.h.g, false);
                                    }
                                }
                            } else if (i11 == 4) {
                                float min10 = f42 > 0.0f ? Math.min(1.0f - gaVar2.h, f42) : Math.max(-gaVar2.g, f42);
                                ga gaVar16 = this.h;
                                float f47 = gaVar16.g + min10;
                                gaVar16.g = f47;
                                gaVar16.h += min10;
                                fa faVar24 = this.a;
                                if (faVar24 != null) {
                                    faVar24.d0(f47, false);
                                    this.a.v0(this.h.h);
                                }
                            }
                            float f48 = this.e;
                            ga gaVar17 = this.h;
                            float f49 = gaVar17.e;
                            float f50 = f48 / f49;
                            float f51 = gaVar17.g;
                            if (f50 < f51 || f50 > gaVar17.h) {
                                long j16 = (long) (f51 * f49);
                                this.e = j16;
                                fa faVar25 = this.a;
                                if (faVar25 != null) {
                                    faVar25.B(j16, false);
                                }
                            }
                            invalidate();
                            if (!this.j1) {
                                this.k1 = 1.0f;
                            }
                            this.j1 = true;
                            this.i1 = false;
                        }
                        this.d1 = motionEvent.getX();
                    }
                    if (this.j1) {
                        AndroidUtilities.cancelRunOnUIThread(y61Var);
                    }
                    int i20 = this.e1;
                    if ((i20 == 1 || i20 == 5 || i20 == 8) && (velocityTracker6 = this.m1) != null) {
                        velocityTracker6.addMovement(motionEvent);
                    }
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(y61Var);
                    vm0Var.a();
                    if (motionEvent.getAction() == 1) {
                        if ((System.currentTimeMillis() - this.c1 > ViewConfiguration.getTapTimeout() || this.j1) && this.g0) {
                            int i21 = this.e1;
                            int i22 = MediaDataController.MAX_STYLE_RUNS_COUNT;
                            if (i21 == 16 && (velocityTracker5 = this.m1) != null) {
                                velocityTracker5.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity = (int) this.m1.getXVelocity();
                                this.n1 = true;
                                if (this.h != null && Math.abs(xVelocity) > AndroidUtilities.dp(100.0f)) {
                                    long min11 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i23 = this.v1;
                                    float f52 = i23;
                                    float f53 = min11;
                                    float f54 = this.r1;
                                    int i24 = (int) (((this.f / f53) * f54) + f52);
                                    int c3 = (int) w.c.c(this.h.e - min11, f53, f54, f52);
                                    this.o1 = true;
                                    this.p1 = i24;
                                    this.T0.c(i24, 0, -xVelocity, 0, i23, c3, 0, 0);
                                    z4 = false;
                                }
                            } else if (i21 == 1 && (velocityTracker4 = this.m1) != null) {
                                velocityTracker4.computeCurrentVelocity(MediaDataController.MAX_STYLE_RUNS_COUNT);
                                int xVelocity2 = (int) this.m1.getXVelocity();
                                this.n1 = true;
                                if (this.h != null && Math.abs(xVelocity2) > AndroidUtilities.dp(100.0f)) {
                                    long min12 = Math.min(this.h.e, getMaxScrollDuration());
                                    int i25 = this.v1;
                                    float f55 = i25;
                                    float f56 = min12;
                                    float f57 = this.r1;
                                    int i26 = (int) (((this.f / f56) * f57) + f55);
                                    int c10 = (int) w.c.c(this.h.e - min12, f56, f57, f55);
                                    this.o1 = true;
                                    this.p1 = i26;
                                    this.T0.c(i26, 0, -xVelocity2, 0, i25, c10, 0, 0);
                                    z4 = false;
                                }
                            } else if ((i21 == 5 || (i21 == 8 && !this.j1)) && this.M && (velocityTracker2 = this.m1) != null) {
                                if (this.h == null) {
                                    i22 = 1500;
                                }
                                velocityTracker2.computeCurrentVelocity(i22);
                                int xVelocity3 = (int) this.m1.getXVelocity();
                                this.n1 = false;
                                if (Math.abs(xVelocity3) > AndroidUtilities.dp(100.0f)) {
                                    float min13 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i27 = (int) (((this.N / min13) * this.r1) + this.v1 + this.u1);
                                    ga gaVar18 = this.h;
                                    if (gaVar18 != null) {
                                        float f58 = gaVar18.h;
                                        float f59 = gaVar18.e;
                                        j12 = this.O;
                                        j13 = (long) ((f58 * f59) - 0);
                                        f10 = gaVar18.g * f59;
                                    } else if (this.B) {
                                        float f60 = this.H;
                                        float f61 = this.E;
                                        j12 = this.O;
                                        j13 = (long) ((f60 * f61) - 0);
                                        f10 = this.G * f61;
                                    } else {
                                        j10 = -(this.O - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        z11 = true;
                                        j11 = 0;
                                        this.o1 = z11;
                                        this.p1 = i27;
                                        float f62 = this.v1 + this.u1;
                                        float f63 = this.r1;
                                        this.T0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f63) + f62), (int) w.c.c(j11, min13, f63, f62), 0, 0);
                                        z4 = false;
                                    }
                                    j10 = (long) (f10 - j12);
                                    j11 = j13;
                                    z11 = true;
                                    this.o1 = z11;
                                    this.p1 = i27;
                                    float f622 = this.v1 + this.u1;
                                    float f632 = this.r1;
                                    this.T0.c(i27, 0, xVelocity3, 0, (int) (((j10 / min13) * f632) + f622), (int) w.c.c(j11, min13, f632, f622), 0, 0);
                                    z4 = false;
                                }
                            } else if ((i21 == 9 || (i21 == 12 && !this.j1)) && this.D && (velocityTracker3 = this.m1) != null) {
                                if (this.h == null) {
                                    i22 = 1500;
                                }
                                velocityTracker3.computeCurrentVelocity(i22);
                                int xVelocity4 = (int) this.m1.getXVelocity();
                                this.n1 = false;
                                if (Math.abs(xVelocity4) > AndroidUtilities.dp(100.0f)) {
                                    float min14 = Math.min(getBaseDuration(), getMaxScrollDuration());
                                    int i28 = (int) (((this.F / min14) * this.r1) + this.v1 + this.u1);
                                    ga gaVar19 = this.h;
                                    if (gaVar19 != null) {
                                        float f64 = gaVar19.h;
                                        float f65 = gaVar19.e;
                                        j14 = (long) ((gaVar19.g * f65) - this.E);
                                        j15 = (long) ((f64 * f65) - 0);
                                    } else {
                                        j14 = -(this.E - Math.min(getBaseDuration(), getMaxScrollDuration()));
                                        j15 = 0;
                                    }
                                    this.o1 = true;
                                    this.p1 = i28;
                                    float f66 = this.v1 + this.u1;
                                    float f67 = this.r1;
                                    this.T0.c(i28, 0, xVelocity4, 0, (int) (((j14 / min14) * f67) + f66), (int) w.c.c(j15, min14, f67, f66), 0, 0);
                                    z4 = false;
                                }
                            }
                            y1Var = this.a1;
                            if (y1Var != null) {
                                AndroidUtilities.cancelRunOnUIThread(y1Var);
                                this.a1 = null;
                            }
                            if (this.j1 || !z4 || (faVar = this.a) == null) {
                                z10 = false;
                            } else {
                                z10 = false;
                                faVar.U(false);
                            }
                            this.k1 = 1.0f;
                            this.j1 = z10;
                            this.i1 = z10;
                            this.c1 = -1L;
                            this.e1 = -1;
                            velocityTracker = this.m1;
                            if (velocityTracker != null) {
                                velocityTracker.recycle();
                                this.m1 = null;
                            }
                        } else if (this.g0) {
                            if (!this.U0 || this.h == null) {
                                int i29 = this.g1;
                                if (i29 == 3) {
                                    int i30 = (this.M || this.D) ? -1 : this.n;
                                    int i31 = this.h1;
                                    if (i30 != i31) {
                                        this.M = false;
                                        this.D = false;
                                        this.n = i31;
                                        if (this.a != null && i31 >= 0 && i31 < arrayList.size()) {
                                            this.a.f(((ga) arrayList.get(this.h1)).a);
                                        }
                                        invalidate();
                                    }
                                }
                                if (i29 == 2 && !this.M) {
                                    this.M = true;
                                    this.D = false;
                                    fa faVar26 = this.a;
                                    if (faVar26 != null) {
                                        faVar26.j0(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 && !this.D) {
                                    this.M = false;
                                    this.D = true;
                                    fa faVar27 = this.a;
                                    if (faVar27 != null) {
                                        faVar27.j0(true);
                                    }
                                    invalidate();
                                } else if (i29 != 2 && this.M) {
                                    this.M = false;
                                    this.D = false;
                                    fa faVar28 = this.a;
                                    if (faVar28 != null) {
                                        faVar28.j0(false);
                                    }
                                    invalidate();
                                } else if (i29 == 1 || !this.D) {
                                    long j17 = this.e;
                                    if (m(motionEvent.getX(), false) && Math.abs(this.e - j17) > 400) {
                                        this.Z0 = j17;
                                        this.Y0.d(1.0f, true);
                                        invalidate();
                                    }
                                } else {
                                    this.M = false;
                                    this.D = false;
                                    fa faVar29 = this.a;
                                    if (faVar29 != null) {
                                        faVar29.j0(false);
                                    }
                                    invalidate();
                                }
                            } else {
                                long clamp7 = (long) Utilities.clamp(((((motionEvent.getX() - this.v1) - this.u1) / this.r1) * Math.min(getBaseDuration(), getMaxScrollDuration())) + this.f, getBaseDuration(), 0.0f);
                                ga gaVar20 = this.h;
                                float f68 = gaVar20.h - gaVar20.g;
                                gaVar20.g = (1.0f - f68) * (clamp7 / getBaseDuration());
                                ga gaVar21 = this.h;
                                float f69 = gaVar21.g;
                                gaVar21.h = f68 + f69;
                                fa faVar30 = this.a;
                                if (faVar30 != null) {
                                    faVar30.d0(f69, true);
                                    this.a.v0(this.h.h);
                                }
                                invalidate();
                            }
                        } else if (this.g1 == 10 && (runnable = this.b) != null) {
                            runnable.run();
                        }
                    }
                    z4 = true;
                    y1Var = this.a1;
                    if (y1Var != null) {
                    }
                    if (this.j1) {
                    }
                    z10 = false;
                    this.k1 = 1.0f;
                    this.j1 = z10;
                    this.i1 = z10;
                    this.c1 = -1L;
                    this.e1 = -1;
                    velocityTracker = this.m1;
                    if (velocityTracker != null) {
                    }
                }
                this.b1 = System.currentTimeMillis();
                return true;
            }
        }
        return false;
    }

    public final void p() {
        if (getMeasuredWidth() > 0) {
            if (this.U == null || this.T) {
                this.U = new ea(this, this.L, (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
                this.R = false;
                this.d0.d(1.0f, true);
            }
        }
    }

    public final void q() {
        du duVar = new du(17);
        ArrayList arrayList = this.s;
        Collections.sort(arrayList, duVar);
        ga gaVar = arrayList.isEmpty() ? null : (ga) arrayList.get(0);
        this.v = gaVar;
        if (gaVar != null) {
            long j10 = gaVar.f;
        }
    }

    public void setCollage(ArrayList<r6> arrayList) {
        ArrayList arrayList2;
        ArrayList arrayList3;
        ja jaVar;
        int i10 = 0;
        while (true) {
            arrayList2 = this.s;
            if (i10 >= arrayList2.size()) {
                break;
            }
            ga gaVar = (ga) arrayList2.get(i10);
            if (gaVar != null && (jaVar = gaVar.c) != null) {
                jaVar.b();
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
            ea eaVar = (ea) arrayList3.get(i11);
            if (eaVar != null) {
                eaVar.a();
            }
            i11++;
        }
        arrayList3.clear();
        this.e0.d(1.0f, true);
        if (arrayList != null) {
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                arrayList3.add(null);
                r6 r6Var = arrayList.get(i12);
                if (r6Var.K) {
                    ga gaVar2 = new ga(this);
                    gaVar2.a = i12;
                    gaVar2.b = false;
                    gaVar2.d = r6Var.L.getAbsolutePath();
                    gaVar2.e = r6Var.h0;
                    gaVar2.f = r6Var.X;
                    gaVar2.i = r6Var.P;
                    gaVar2.g = r6Var.V;
                    gaVar2.h = r6Var.W;
                    ga.a(gaVar2, false);
                    ga.b(gaVar2);
                    arrayList2.add(gaVar2);
                }
            }
        }
        q();
        this.n = 0;
    }

    public void setDelegate(fa faVar) {
        this.a = faVar;
    }

    public void setMaxCount(int i10) {
        this.V = i10;
    }

    public void setOnHeightChange(Runnable runnable) {
        this.d = runnable;
    }

    public void setOnTimelineClick(Runnable runnable) {
        this.b = runnable;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if ((r4 + 240) >= (r7 * r11.Q)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0070, code lost:
    
        if ((r4 + 240) >= (r6 * r11.Q)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0024, code lost:
    
        if ((r4 + 240) >= (r7 * r0.h)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0072, code lost:
    
        r11.Z0 = -1;
        r11.Y0.d(1.0f, true);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setProgress(long j10) {
        ga gaVar = this.h;
        if (gaVar != null) {
            if (j10 < this.e) {
                float f10 = j10;
                long j11 = gaVar.e;
                if (f10 <= (j11 * gaVar.g) + 240.0f) {
                }
            }
        }
        if (this.K && !this.B && gaVar == null) {
            if (j10 < this.e) {
                float f11 = j10;
                long j12 = this.O;
                if (f11 <= (j12 * this.P) + 240.0f) {
                }
            }
        }
        if (this.B && gaVar == null) {
            if (j10 < this.e) {
                float f12 = j10;
                long j13 = this.E;
                if (f12 <= (j13 * this.P) + 240.0f) {
                }
            }
        }
        this.e = j10;
        invalidate();
    }

    public void setRoundNull(boolean z4) {
        n(null, 0L, 0L, 0.0f, 0.0f, 0.0f, z4);
    }

    public void setVideoLeft(float f10) {
        ga gaVar = this.h;
        if (gaVar == null) {
            return;
        }
        gaVar.g = f10;
        invalidate();
    }

    public void setVideoRight(float f10) {
        ga gaVar = this.h;
        if (gaVar == null) {
            return;
        }
        gaVar.h = f10;
        invalidate();
    }
}
