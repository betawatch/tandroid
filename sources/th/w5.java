package th;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.view.View;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.b8;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.hc;
import org.telegram.messenger.ic;
import org.telegram.messenger.jc;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.dq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.u10;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class w5 {
    public static u10 b;
    public static u10 c;
    public static u10 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static qz0 i;
    public static int j;
    public static BitmapDrawable m;
    public static final u10[] a = new u10[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final androidx.emoji2.text.n o = new androidx.emoji2.text.n(8);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(org.telegram.ui.ActionBar.u5 u5Var) {
        String L0 = cd.L0(2131743826, null);
        if (L0.indexOf("…") <= 0) {
            u5Var.l(L0, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0);
        u7 u7Var = new u7();
        valueOf.setSpan(u7Var, valueOf.length() - 1, valueOf.length(), 0);
        u7Var.a = u5Var;
        u7Var.n = true;
        u5Var.l(valueOf, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != d20.i(d20.s0).n || v(storyItem)) {
            return;
        }
        if (storyItem.views == null) {
            storyItem.views = new TL_stories.TL_storyViews();
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
    }

    public static void c(org.telegram.ui.ActionBar.p6 p6Var) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(org.telegram.messenger.i0.N(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(org.telegram.ui.ActionBar.t6.d6, p6Var);
        if (j != w02) {
            j = w02;
            float B = org.telegram.messenger.i0.B(w02);
            if (B >= 0.721f) {
                e.setColor(i0.b.f(0.2f, w02, -16777216));
            } else if (B < 0.25f) {
                e.setColor(i0.b.f(0.2f, w02, -1));
            } else {
                e.setColor(i0.b.f(0.44f, w02, -1));
            }
        }
    }

    public static void d(org.telegram.ui.ActionBar.p6 p6Var, boolean z10) {
        Paint[] paintArr = k;
        if (paintArr[z10 ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z10 ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z10 ? 1 : 0].setStrokeWidth(org.telegram.messenger.i0.N(1.3f));
            paintArr[z10 ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int w02 = org.telegram.ui.ActionBar.t6.w0(!z10 ? org.telegram.ui.ActionBar.t6.s8 : org.telegram.ui.ActionBar.t6.M8, p6Var);
        int[] iArr = l;
        if (iArr[z10 ? 1 : 0] != w02) {
            iArr[z10 ? 1 : 0] = w02;
            float B = org.telegram.messenger.i0.B(w02);
            if (B >= 0.721f) {
                paintArr[z10 ? 1 : 0].setColor(i0.b.f(0.2f, w02, -16777216));
            } else if (B < 0.25f) {
                paintArr[z10 ? 1 : 0].setColor(i0.b.f(0.2f, w02, -1));
            } else {
                paintArr[z10 ? 1 : 0].setColor(i0.b.f(0.44f, w02, -1));
            }
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i10, boolean z10) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) cd.a0(null, null, i10, objArr));
        dq dqVar = new dq(R.drawable.msg_mini_bomb, 0);
        if (z10) {
            dqVar.H = 0.8f;
            dqVar.I = 0.8f;
        } else {
            dqVar.n = -1;
        }
        spannableStringBuilder.setSpan(dqVar, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) cd.L0(2131744753, null));
        spannableStringBuilder.setSpan(new dq(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, float f11, float f12) {
        float f13;
        boolean z10;
        float f14 = f10 - f7;
        if (f7 >= f11 || f10 >= f11 + f14) {
            f13 = f7;
            z10 = false;
        } else {
            f13 = f7;
            canvas.drawArc(rectF, f13, Math.min(f10, f11) - f7, false, paint);
            z10 = true;
        }
        float max = Math.max(f13, f12);
        float min = Math.min(f10, f11 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z10) {
                return;
            }
            if (f13 <= f11 || f10 >= f12) {
                canvas.drawArc(rectF, f13, f14, false, paint);
            }
        }
    }

    public static void h(long j10, Canvas canvas, ImageReceiver imageReceiver, t5 t5Var) {
        i(j10, canvas, imageReceiver, d20.i(d20.s0).e() != j10 && vp.r1(d20.s0).O1().K(j10), t5Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x0454, code lost:
    
        if (r1 == 1) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0269, code lost:
    
        if (r35.B == 1.0f) goto L143;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x04e8  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0509  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0525  */
    /* JADX WARN: Removed duplicated region for block: B:167:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x04ea  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0497  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04be A[LOOP:0: B:184:0x04ba->B:186:0x04be, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x04a5  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0475  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(long j10, Canvas canvas, ImageReceiver imageReceiver, boolean z10, t5 t5Var) {
        int r10;
        int i10;
        float W1;
        float f7;
        Canvas canvas2;
        int i11;
        e5 e5Var;
        float f10;
        float f11;
        float f12;
        int i12;
        RectF rectF;
        int i13;
        float f13;
        ImageReceiver imageReceiver2;
        t5 t5Var2;
        boolean z11;
        e5 e5Var2;
        ImageReceiver imageReceiver3;
        t5 t5Var3;
        RectF rectF2;
        boolean z12;
        boolean z13;
        jc jcVar;
        float f14;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float N;
        float f15;
        float f16;
        float z14;
        ?? r92;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float N2;
        float f17;
        float z15;
        u10 u10Var;
        float z16;
        e5 O1 = vp.r1(d20.s0).O1();
        boolean z17 = t5Var.b;
        RectF rectF3 = t5Var.F;
        boolean z18 = t5Var.E;
        if (t5Var.x != j10) {
            t5Var.x = j10;
            t5Var.g();
            z17 = false;
        }
        boolean z19 = O1.j.get(j10, 0) == 1;
        boolean z20 = org.telegram.messenger.w3.b0(d20.s0, j10) && !t5Var.D;
        boolean z21 = t5Var.r ? !O1.h.isEmpty() : z10;
        if (t5Var.d != null) {
            O1.E(t5Var.c, j10);
            z19 = false;
        }
        if (z19) {
            if (O1.K(j10)) {
                r10 = 3;
                z17 = false;
                i10 = 2;
            } else {
                i10 = r(O1, j10);
                r10 = 3;
                z17 = false;
            }
        } else if (!z21) {
            r10 = r(O1, j10);
            i10 = r10;
        } else if (t5Var.a) {
            r10 = 2;
            i10 = 2;
        } else {
            int E = O1.E(t5Var.c, j10);
            i10 = E;
            r10 = E == 0 ? 2 : 1;
        }
        int i14 = t5Var.z;
        if (i14 != 0) {
            r10 = i14;
            i10 = r10;
        }
        int i15 = t5Var.y;
        if (i15 != r10) {
            if (i15 == 3) {
                z17 = true;
            }
            if (r10 == 3) {
                t5Var.q = i10;
                t5Var.t = 0.0f;
            }
            if (z17) {
                t5Var.A = i15;
                t5Var.y = r10;
                t5Var.B = 0.0f;
            } else {
                t5Var.y = r10;
                t5Var.B = 1.0f;
            }
        }
        dc dcVar = t5Var.H;
        float a2 = dcVar != null ? dcVar.a(0.08f) : 1.0f;
        if (t5Var.C != z19 && z19) {
            t5Var.K = 1.0f;
            t5Var.L = false;
        }
        t5Var.C = z19;
        if (t5Var.y == 0 && t5Var.B == 1.0f) {
            imageReceiver.A0(rectF3);
            canvas.save();
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
            imageReceiver.h(canvas, null);
            canvas.restore();
            return;
        }
        int save = canvas.save();
        if (a2 != 1.0f) {
            canvas.scale(a2, a2, rectF3.centerX(), rectF3.centerY());
        }
        float f18 = O1.H(t5Var.x) ? t5Var.e : 0.0f;
        float f19 = t5Var.B;
        if (f19 != 1.0f) {
            f19 = gr.f.getInterpolation(f19);
        }
        float f20 = f19;
        if (!z18 || t5Var.v) {
            int i16 = t5Var.A;
            int i17 = t5Var.q;
            if (i16 == 3) {
                i16 = i17;
            }
            int L = i16 == 2 ? org.telegram.messenger.i0.L(3.0f) : i16 == 1 ? org.telegram.messenger.i0.L(4.0f) : 0;
            int i18 = t5Var.y;
            int i19 = t5Var.q;
            if (i18 == 3) {
                i18 = i19;
            }
            W1 = org.telegram.messenger.i0.W1(t5Var.B, L, i18 == 2 ? org.telegram.messenger.i0.L(3.0f) : i18 == 1 ? org.telegram.messenger.i0.L(4.0f) : 0);
        } else {
            W1 = 0.0f;
        }
        RectF rectF4 = n;
        if (W1 == 0.0f) {
            imageReceiver.A0(rectF3);
        } else {
            rectF4.set(rectF3);
            rectF4.inset(W1, W1);
            imageReceiver.A0(rectF4);
        }
        if (f18 > 0.0f) {
            f11 = 1.0f;
            f7 = W1;
            i12 = i10;
            e5Var = O1;
            rectF = rectF4;
            i11 = save;
            f10 = f18;
            i13 = 3;
            f12 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - org.telegram.messenger.i0.L(15.0f), rectF4.top - org.telegram.messenger.i0.L(15.0f), rectF4.right + org.telegram.messenger.i0.L(15.0f), rectF4.bottom + org.telegram.messenger.i0.L(15.0f), zs.e4, 31);
        } else {
            f7 = W1;
            canvas2 = canvas;
            i11 = save;
            e5Var = O1;
            f10 = f18;
            f11 = 1.0f;
            f12 = 0.08f;
            i12 = i10;
            rectF = rectF4;
            i13 = 3;
        }
        int i20 = t5Var.A;
        u10[] u10VarArr = a;
        if ((i20 == 1 && t5Var.B != f11) || t5Var.y == 1) {
            if (i12 == 2) {
                o(imageReceiver);
                u10Var = b;
            } else if (i12 == i13) {
                q(imageReceiver);
                u10Var = c;
            } else {
                t(imageReceiver, z18);
                u10Var = u10VarArr[z18 ? 1 : 0];
            }
            boolean z22 = t5Var.A == 1 && t5Var.B != f11;
            float f21 = (!z18 || t5Var.v) ? 0.0f : -org.telegram.messenger.i0.L(4.0f);
            if (z22) {
                z16 = (org.telegram.messenger.i0.L(5.0f) * f20) + f21;
                u10Var.c.setAlpha((int) ((f11 - f20) * t5Var.u * 255.0f));
            } else {
                u10Var.c.setAlpha((int) (t5Var.u * 255.0f * f20));
                z16 = c3.i0.z(f11, f20, org.telegram.messenger.i0.L(5.0f), f21);
            }
            float f22 = z16 + t5Var.G;
            rectF.set(rectF3);
            rectF.inset(f22, f22);
            View view = imageReceiver.e;
            j(canvas2, t5Var, u10Var.c, z20);
        }
        int i21 = t5Var.A;
        Paint[] paintArr = k;
        if (i21 == 2) {
            f13 = 1.0f;
        } else {
            f13 = 1.0f;
        }
        if (t5Var.y != 2) {
            imageReceiver2 = imageReceiver;
            t5Var2 = t5Var;
            z11 = z20;
            e5Var2 = e5Var;
            if ((t5Var2.A == i13 || t5Var2.B == 1.0f) && t5Var2.y != i13) {
                imageReceiver3 = imageReceiver2;
                t5Var3 = t5Var2;
                rectF2 = rectF;
                z12 = true;
                z13 = false;
            } else {
                if (t5Var2.q == 1) {
                    t(imageReceiver2, z18);
                    paint = u10VarArr[z18 ? 1 : 0].c;
                } else if (z18) {
                    d(t5Var2.J, t5Var2.o);
                    paint = paintArr[t5Var2.o ? 1 : 0];
                } else {
                    c(t5Var2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f20 * 255.0f));
                if (t5Var2.a) {
                    paint2 = t(imageReceiver2, z18);
                    paint2.setAlpha((int) (t5Var2.u * 255.0f));
                    Paint o10 = o(imageReceiver2);
                    o10.setAlpha((int) (t5Var2.u * 255.0f));
                    Paint q6 = q(imageReceiver2);
                    q6.setAlpha((int) (t5Var2.u * 255.0f));
                    c(t5Var2.J);
                    paint4 = o10;
                    paint3 = q6;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (t5Var2.a) {
                    if (z18 && !t5Var2.v) {
                        N = org.telegram.messenger.i0.N(3.5f);
                        f15 = -N;
                    }
                    f15 = 0.0f;
                } else {
                    if (z18 && !t5Var2.v) {
                        N = org.telegram.messenger.i0.N(2.7f);
                        f15 = -N;
                    }
                    f15 = 0.0f;
                }
                if (t5Var2.A != i13 || t5Var2.B == 1.0f) {
                    paint.setAlpha((int) (t5Var2.u * 255.0f * f20));
                    f16 = 1.0f;
                    z14 = c3.i0.z(1.0f, f20, org.telegram.messenger.i0.L(5.0f), f15);
                } else {
                    z14 = (org.telegram.messenger.i0.L(7.0f) * f20) + f15;
                    paint.setAlpha((int) ((1.0f - f20) * t5Var2.u * 255.0f));
                    f16 = 1.0f;
                }
                float f23 = z14 + t5Var2.G;
                rectF.set(rectF3);
                rectF.inset(f23, f23);
                boolean z23 = t5Var2.a;
                if (z23 && t5Var2.y == i13) {
                    float f24 = t5Var2.t;
                    if (f24 != f16) {
                        float f25 = f24 + f12;
                        t5Var2.t = f25;
                        if (f25 > f16) {
                            t5Var2.t = f16;
                        }
                        float f26 = t5Var2.e;
                        t5Var2.e = f16 - t5Var2.t;
                        m(canvas2, e5Var2, imageReceiver2, t5Var2, paint, paint2, paint3, paint4, z11);
                        imageReceiver3 = imageReceiver2;
                        t5Var3 = t5Var2;
                        t5Var3.e = f26;
                        if (imageReceiver3.e != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.e.invalidate();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        jcVar = null;
                        z12 = true;
                        z13 = false;
                        imageReceiver3.h(canvas2, jcVar);
                        t5Var3.w = f10 > 0.5f ? z12 : z13;
                        if (f18 > 0.0f) {
                            float f27 = f7 + t5Var3.G;
                            rectF2.set(rectF3);
                            rectF2.inset(f27, f27);
                            k(f10, 0.0f, canvas2, rectF2, imageReceiver3.Q0);
                        }
                        f14 = t5Var3.B;
                        if (f14 != 1.0f) {
                            float f28 = (org.telegram.messenger.i0.t / 250.0f) + f14;
                            t5Var3.B = f28;
                            if (f28 > 1.0f) {
                                t5Var3.B = 1.0f;
                            }
                            if (imageReceiver3.e != null) {
                                imageReceiver3.invalidate();
                                imageReceiver3.e.invalidate();
                            }
                        }
                        if (i11 != 0) {
                            canvas2.restoreToCount(i11);
                            return;
                        }
                        return;
                    }
                }
                t5Var3 = t5Var2;
                Paint paint9 = paint3;
                Paint paint10 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z23) {
                    int E2 = e5Var2.E(0, t5Var3.x);
                    if (E2 == 2) {
                        paint2 = paint10;
                    } else if (E2 == i13) {
                        paint2 = paint9;
                    }
                    View view2 = imageReceiver3.e;
                    if (t5Var3.L) {
                        z13 = false;
                        float f29 = t5Var3.K - 0.016f;
                        t5Var3.K = f29;
                        if (f29 < 0.0f) {
                            t5Var3.K = 0.0f;
                            z12 = true;
                            t5Var3.L = true;
                            t5Var3.M += 1.152f;
                            view2.invalidate();
                            if (t5Var3.L) {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, t5Var3.M, t5Var3.K * 360.0f, false, paint2);
                            } else {
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, t5Var3.M + 360.0f, t5Var3.K * (-360.0f), false, paint2);
                            }
                            for (r92 = z13; r92 < 16; r92++) {
                                float f30 = (((float) r92) * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, t5Var3.M + f30, ((22.5f + f30) - 10.0f) - f30, false, paint2);
                            }
                            canvas2 = canvas;
                        }
                    } else {
                        float f31 = t5Var3.K + 0.016f;
                        t5Var3.K = f31;
                        if (f31 >= 1.0f) {
                            t5Var3.K = 1.0f;
                            z13 = false;
                            t5Var3.L = false;
                        } else {
                            z13 = false;
                        }
                    }
                    z12 = true;
                    t5Var3.M += 1.152f;
                    view2.invalidate();
                    if (t5Var3.L) {
                    }
                    while (r92 < 16) {
                    }
                    canvas2 = canvas;
                }
                paint2 = paint;
                View view22 = imageReceiver3.e;
                if (t5Var3.L) {
                }
                z12 = true;
                t5Var3.M += 1.152f;
                view22.invalidate();
                if (t5Var3.L) {
                }
                while (r92 < 16) {
                }
                canvas2 = canvas;
            }
            jcVar = null;
            imageReceiver3.h(canvas2, jcVar);
            t5Var3.w = f10 > 0.5f ? z12 : z13;
            if (f18 > 0.0f) {
            }
            f14 = t5Var3.B;
            if (f14 != 1.0f) {
            }
            if (i11 != 0) {
            }
        }
        boolean z24 = i21 == 2 && t5Var.B != f13;
        if (z18) {
            d(t5Var.J, t5Var.o);
            paint5 = paintArr[t5Var.o ? 1 : 0];
        } else {
            c(t5Var.J);
            paint5 = e;
        }
        Paint paint11 = paint5;
        if (t5Var.a) {
            paint6 = t(imageReceiver, z18);
            paint6.setAlpha((int) (t5Var.u * 255.0f));
            Paint o11 = o(imageReceiver);
            o11.setAlpha((int) (t5Var.u * 255.0f));
            Paint q10 = q(imageReceiver);
            q10.setAlpha((int) (t5Var.u * 255.0f));
            c(t5Var.J);
            paint8 = o11;
            paint7 = q10;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (t5Var.a) {
            if (z18 && !t5Var.v) {
                N2 = org.telegram.messenger.i0.N(3.5f);
                f17 = -N2;
            }
            f17 = 0.0f;
        } else {
            if (z18 && !t5Var.v) {
                N2 = org.telegram.messenger.i0.N(2.7f);
                f17 = -N2;
            }
            f17 = 0.0f;
        }
        if (z24) {
            z15 = (org.telegram.messenger.i0.L(5.0f) * f20) + f17;
            paint11.setAlpha((int) ((1.0f - f20) * t5Var.u * 255.0f));
        } else {
            paint11.setAlpha((int) (t5Var.u * 255.0f * f20));
            z15 = c3.i0.z(1.0f, f20, org.telegram.messenger.i0.L(5.0f), f17);
        }
        float f32 = z15 + t5Var.G;
        rectF.set(rectF3);
        rectF.inset(f32, f32);
        if (t5Var.a) {
            imageReceiver2 = imageReceiver;
            t5Var2 = t5Var;
            z11 = z20;
            e5Var2 = e5Var;
            m(canvas2, e5Var2, imageReceiver2, t5Var2, paint11, paint6, paint7, paint8, z11);
        } else {
            imageReceiver2 = imageReceiver;
            t5Var2 = t5Var;
            z11 = z20;
            e5Var2 = e5Var;
            View view3 = imageReceiver2.e;
            j(canvas2, t5Var2, paint11, z11);
        }
        if (t5Var2.A == i13) {
        }
        imageReceiver3 = imageReceiver2;
        t5Var3 = t5Var2;
        rectF2 = rectF;
        z12 = true;
        z13 = false;
        jcVar = null;
        imageReceiver3.h(canvas2, jcVar);
        t5Var3.w = f10 > 0.5f ? z12 : z13;
        if (f18 > 0.0f) {
        }
        f14 = t5Var3.B;
        if (f14 != 1.0f) {
        }
        if (i11 != 0) {
        }
    }

    public static void j(Canvas canvas, t5 t5Var, Paint paint, boolean z10) {
        RectF rectF = n;
        if (z10) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(org.telegram.messenger.i0.L(0.5f), org.telegram.messenger.i0.L(0.5f));
            canvas.drawRoundRect(rectF2, org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f), paint);
            return;
        }
        float f7 = t5Var.f;
        if (f7 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f7 / 2.0f) + 360.0f, 360.0f - f7, false, paint);
        }
    }

    public static void k(float f7, float f10, Canvas canvas, RectF rectF, boolean z10) {
        Canvas canvas2;
        if (i == null) {
            i = new qz0(cd.L0(2131748835, null), 9.66f, org.telegram.messenger.i0.o());
        }
        if (g == null) {
            Paint paint = new Paint(1);
            g = paint;
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        }
        if (h == null) {
            h = new Paint(1);
        }
        if (f == null) {
            f = new RectF();
        }
        h.setColor(org.telegram.ui.ActionBar.t6.r1(f7, org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.cl, false)));
        float W1 = org.telegram.messenger.i0.W1(f10, org.telegram.messenger.i0.L(4.66f), org.telegram.messenger.i0.L(7.0f));
        float k10 = i.k() + W1 + W1;
        float W12 = org.telegram.messenger.i0.W1(f10, org.telegram.messenger.i0.L(15.0f), org.telegram.messenger.i0.L(18.0f));
        float L = org.telegram.messenger.i0.L(2.0f);
        canvas.save();
        float f11 = k10 / 2.0f;
        float f12 = 0.8f * W12;
        float f13 = W12 * 0.2f;
        f.set((rectF.centerX() - f11) - L, (rectF.bottom - f12) - L, rectF.centerX() + f11 + L, rectF.bottom + f13 + L);
        float T1 = org.telegram.messenger.i0.T1(0.7f, 1.0f, f7);
        canvas.scale(T1, T1, f.centerX(), f.centerY());
        RectF rectF2 = f;
        org.telegram.messenger.i0.i3(rectF2, f7, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, g);
        if (z10) {
            f.set(rectF.centerX() - f11, rectF.bottom - f12, rectF.centerX() + f11, rectF.bottom + f13);
            RectF rectF4 = f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f.height() / 2.0f, h);
            qz0 qz0Var = i;
            RectF rectF5 = f;
            canvas2 = canvas;
            qz0Var.c(rectF5.left + W1, rectF5.centerY(), f7, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f7, float f10, t5 t5Var, boolean z10) {
        if (z10) {
            float height = rectF.height() * 0.32f;
            float f11 = ((((int) f7) / 90) * 90) + 90;
            float f12 = (-199.0f) + f11;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f11, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f7 - f12) / 360.0f) * length, length * ((f10 - f12) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!t5Var.k) {
            if (t5Var.l) {
                float f13 = t5Var.f;
                g(canvas, rectF, paint, f7, f10, ((-f13) / 2.0f) + 180.0f, (f13 / 2.0f) + 180.0f);
                return;
            } else if (f7 < 90.0f) {
                g(canvas, rectF, paint, f7, f10, t5Var.g, t5Var.h);
                return;
            } else {
                g(canvas, rectF, paint, f7, f10, -t5Var.i, t5Var.j);
                return;
            }
        }
        boolean z11 = t5Var.m;
        if (!z11 && !t5Var.l) {
            if (f7 < 90.0f) {
                float f14 = t5Var.f;
                g(canvas, rectF, paint, f7, f10, (-f14) / 2.0f, f14 / 2.0f);
                return;
            } else {
                float f15 = t5Var.f;
                g(canvas, rectF, paint, f7, f10, ((-f15) / 2.0f) + 180.0f, (f15 / 2.0f) + 180.0f);
                return;
            }
        }
        if (t5Var.l) {
            float f16 = t5Var.f;
            g(canvas, rectF, paint, f7, f10, ((-f16) / 2.0f) + 180.0f, (f16 / 2.0f) + 180.0f);
        } else if (!z11) {
            canvas.drawArc(rectF, f7, f10 - f7, false, paint);
        } else {
            float f17 = t5Var.f;
            g(canvas, rectF, paint, f7, f10, (-f17) / 2.0f, f17 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:90:0x01a4, code lost:
    
        if (r4 == 1) goto L112;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, e5 e5Var, ImageReceiver imageReceiver, t5 t5Var, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z10) {
        Paint paint5;
        RectF rectF;
        int max;
        char c10;
        Paint paint6;
        t5 t5Var2 = t5Var;
        org.telegram.ui.ActionBar.p6 p6Var = t5Var2.J;
        boolean z11 = t5Var2.E;
        c(p6Var);
        d(t5Var2.J, t5Var2.o);
        long j10 = t5Var2.s;
        int i10 = 0;
        int E = j10 != 0 ? e5Var.E(0, j10) : e5Var.E(0, t5Var2.x);
        int i11 = 2;
        t5Var2.n = E == 0 ? 2 : 1;
        TL_stories.PeerStories y3 = e5Var.y(t5Var2.x);
        ArrayList arrayList = e5Var.h;
        if (y3 == null) {
            y3 = e5Var.z(t5Var2.x);
        }
        TL_stories.PeerStories peerStories = y3;
        int size = t5Var2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = k;
        if (E == 2) {
            o(imageReceiver);
            paint5 = b.c;
        } else if (E == 3) {
            q(imageReceiver);
            paint5 = c.c;
        } else if (E == 1) {
            t(imageReceiver, z11);
            paint5 = a[z11 ? 1 : 0].c;
        } else {
            paint5 = z11 ? paintArr[t5Var2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j11 = t5Var2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) e5Var.i.f(j11);
            if (peerStories2 == null) {
                peerStories2 = e5Var.z(j11);
            }
            if (peerStories2 != null) {
                if (j11 != d20.i(e5Var.a).e() || Utilities.x((Collection) e5Var.b.f(j11))) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= peerStories2.stories.size()) {
                            break;
                        }
                        TL_stories.StoryItem storyItem = peerStories2.stories.get(i12);
                        if (storyItem != null) {
                            if (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                i10 = 2;
                                break;
                            } else if (storyItem.id > peerStories2.max_read_id) {
                                break;
                            }
                        }
                        i12++;
                    }
                }
                i10 = 1;
            }
            Paint paint8 = i10 == 2 ? paint3 : paint7 == b.c ? paint4 : i10 == 1 ? paint2 : paint;
            l(canvas, rectF2, paint8, -90.0f, 90.0f, t5Var2, z10);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, t5Var, z10);
            float f7 = t5Var.e;
            if (f7 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f7) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, t5Var, z10);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, t5Var, z10);
            paint7.setAlpha(zs.e4);
            return;
        }
        Paint paint9 = paint7;
        float f10 = 360.0f / size;
        float f11 = (size > 20 ? 3 : 5) * t5Var2.e;
        if (f11 > f10) {
            f11 = 0.0f;
        }
        float f12 = f11;
        if (t5Var2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, e5Var.f.get(t5Var2.x, 0));
        }
        int i13 = 0;
        while (i13 < size) {
            Paint paint10 = z11 ? paintArr[t5Var2.o ? 1 : 0] : e;
            if (t5Var2.r) {
                int E2 = e5Var.E(i10, org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get((size - 1) - i13)).peer));
                if (E2 == i11) {
                    paint10 = paint4;
                    c10 = 3;
                } else {
                    c10 = 3;
                    if (E2 != 3) {
                    }
                    paint10 = paint3;
                }
            } else {
                c10 = 3;
                if (i13 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i13).justUploaded || peerStories.stories.get(i13).id > max) {
                        if (!(peerStories.stories.get(i13).media instanceof TLRPC.TL_messageMediaVideoStream)) {
                            if (peerStories.stories.get(i13).close_friends) {
                                paint10 = paint4;
                            }
                        }
                        paint10 = paint3;
                    }
                }
                paint10 = paint2;
            }
            float f13 = (i13 * f10) - 90.0f;
            float f14 = f13 + f10;
            float f15 = f13 + f12;
            float f16 = f14 - f12;
            Paint paint11 = paint9;
            int i14 = max;
            int i15 = i13;
            Paint paint12 = paint10;
            RectF rectF3 = rectF;
            l(canvas, rectF3, paint12, f15, f16, t5Var, z10);
            RectF rectF4 = rectF3;
            if (t5Var.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - t5Var.e) * 255.0f));
                l(canvas, rectF4, paint11, f15, f16, t5Var, z10);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(zs.e4);
            }
            i13 = i15 + 1;
            t5Var2 = t5Var;
            rectF = rectF4;
            paint9 = paint6;
            max = i14;
            i10 = 0;
            i11 = 2;
        }
    }

    public static org.telegram.ui.web.x0 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        ArrayList<TLRPC.PhotoSize> arrayList;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        TLRPC.Document document;
        if (peerStories == null || peerStories.stories.isEmpty() || org.telegram.messenger.o5.o(peerStories.peer) == d20.i(d20.s0).n) {
            runnable.run();
            return null;
        }
        e5 e5Var = vp.r1(d20.s0).h0;
        int i10 = e5Var.f.get(org.telegram.messenger.o5.o(peerStories.peer));
        int i11 = 0;
        while (true) {
            if (i11 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i11).id > i10) {
                storyItem = peerStories.stories.get(i11);
                break;
            }
            i11++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia = storyItem2.media;
        if (messageMedia == null || messageMedia.document == null) {
            TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
            if (photo == null || (arrayList = photo.sizes) == null) {
                runnable.run();
                return null;
            }
            TLRPC.PhotoSize w9 = b8.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
            b8.G(d20.s0);
            File K = b8.K(w9, "", false, true);
            if (K != null && K.exists()) {
                runnable.run();
                return null;
            }
        } else {
            b8.G(d20.s0);
            File K2 = b8.K(storyItem2.media.document, "", false, true);
            if (K2 != null && K2.exists()) {
                runnable.run();
                return null;
            }
            b8.G(d20.s0);
            File K3 = b8.K(storyItem2.media.document, "", true, true);
            if (K3 != null) {
                try {
                    int lastIndexOf = K3.getName().lastIndexOf(".");
                    if (lastIndexOf > 0) {
                        File file = new File(K3.getParentFile(), K3.getName().substring(0, lastIndexOf) + ".temp");
                        if (file.exists() && file.length() > 0) {
                            runnable.run();
                            return null;
                        }
                    }
                } catch (Exception unused) {
                }
            }
        }
        long o10 = org.telegram.messenger.o5.o(peerStories.peer);
        org.telegram.ui.web.x0 x0Var = new org.telegram.ui.web.x0();
        x0Var.b = false;
        x0Var.a = o10;
        x0Var.c = e5Var;
        x0Var.d = new o0(19, x0Var, runnable);
        Runnable[] runnableArr = {r2};
        o0 o0Var = new o0(20, runnableArr, x0Var);
        org.telegram.messenger.i0.h3(o0Var, 3000L);
        s5 s5Var = new s5(runnableArr, x0Var);
        x0Var.e = s5Var;
        s5Var.z1 = true;
        s5Var.P();
        String s10 = s();
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null || (document = messageMedia2.document) == null) {
            TLRPC.Photo photo2 = messageMedia2 != null ? messageMedia2.photo : null;
            if (photo2 == null || (arrayList2 = photo2.sizes) == null) {
                ((o0) x0Var.d).run();
                return null;
            }
            ((s5) x0Var.e).u0(null, null, ic.i(b8.w(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo2), s10, null, null, null, 0L, null, storyItem2, 0);
        } else {
            ((s5) x0Var.e).r0(ic.b(document), sc.e.A(s10, "_pframe"), null, null, null, 0L, null, storyItem2, 0);
        }
        return x0Var;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            u10 u10Var = new u10();
            b = u10Var;
            u10Var.a = true;
            u10Var.b = true;
            u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Zk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.al, false), 0, 0);
            b.c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
            b.c.setStyle(Paint.Style.STROKE);
            b.c.setStrokeCap(Paint.Cap.ROUND);
        }
        b.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return b.c;
    }

    public static Drawable p() {
        if (m == null) {
            Bitmap createBitmap = Bitmap.createBitmap(360, zs.K2, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(-7829368);
            Canvas canvas = new Canvas(createBitmap);
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(15.0f);
            textPaint.setTextAlign(Paint.Align.CENTER);
            textPaint.setColor(i0.b.o(-16777216, 100));
            canvas.drawText("expired", 180.0f, 86.0f, textPaint);
            canvas.drawText("story", 180.0f, 106.0f, textPaint);
            m = new BitmapDrawable(createBitmap);
        }
        return m;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            u10 u10Var = new u10();
            c = u10Var;
            u10Var.a = true;
            u10Var.b = true;
            u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.bl, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.cl, false), 0, 0);
            c.c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return c.c;
    }

    public static int r(e5 e5Var, long j10) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j10 == 0) {
            return 0;
        }
        if (j10 <= 0) {
            TLRPC.Chat L0 = vp.r1(d20.s0).L0(Long.valueOf(-j10));
            if (L0 == null || (tL_recentStory = L0.stories_max_id) == null || tL_recentStory.max_id <= 0 || L0.stories_unavailable) {
                return 0;
            }
            int i10 = e5Var.f.get(j10, 0);
            TLRPC.TL_recentStory tL_recentStory3 = L0.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i10 ? 1 : 2;
        }
        TLRPC.User Z1 = vp.r1(d20.s0).Z1(Long.valueOf(j10));
        if (j10 == d20.i(d20.s0).n || Z1 == null || (tL_recentStory2 = Z1.stories_max_id) == null || tL_recentStory2.max_id <= 0 || Z1.stories_unavailable) {
            return 0;
        }
        int i11 = e5Var.f.get(j10, 0);
        TLRPC.TL_recentStory tL_recentStory4 = Z1.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i11 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(org.telegram.messenger.i0.c1().x, org.telegram.messenger.i0.c1().y) / org.telegram.messenger.i0.p);
        return a1.g.i(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z10) {
        u10[] u10VarArr = a;
        if (u10VarArr[z10 ? 1 : 0] == null) {
            u10 u10Var = new u10();
            u10VarArr[z10 ? 1 : 0] = u10Var;
            u10Var.a = true;
            u10Var.b = true;
            if (z10) {
                u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Xk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Yk, false), 0, 0);
            } else {
                u10Var.d(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Vk, false), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.Wk, false), 0, 0);
            }
            u10VarArr[z10 ? 1 : 0].c.setStrokeWidth(org.telegram.messenger.i0.N(2.0f));
            u10VarArr[z10 ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            u10VarArr[z10 ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        u10VarArr[z10 ? 1 : 0].b(imageReceiver.K0, imageReceiver.L0, imageReceiver.y(), imageReceiver.A());
        return u10VarArr[z10 ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z10) {
        String L0 = z10 ? cd.L0(2131744691, null) : cd.L0(2131743826, null);
        if (L0.indexOf("…") <= 0) {
            return L0;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(L0);
        u7 u7Var = new u7();
        valueOf.setSpan(u7Var, valueOf.length() - 1, valueOf.length(), 0);
        u7Var.a = textView;
        u7Var.n = false;
        return valueOf;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(d20.s0).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static boolean w(int i10, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i10).getCurrentTime() > storyItem.expire_date;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        TLRPC.Document document;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null && (document = messageMedia.document) != null) {
            imageReceiver.r0(ic.c(b8.w(document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), storyItem.media.document), "320_320", null, null, hc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            imageReceiver.a(new t7(storyItem));
            return;
        }
        TLRPC.Photo photo = messageMedia != null ? messageMedia.photo : null;
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(i0.b.f(0.2f, -16777216, -1));
            imageReceiver.v0(createBitmap);
            imageReceiver.a(new t7(storyItem));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.f();
        } else {
            imageReceiver.u0(null, null, ic.i(b8.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo), "320_320", null, null, hc.m(photo.sizes), 0L, null, storyItem, 0);
            imageReceiver.a(new t7(storyItem));
        }
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.r0(ic.c(b8.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, hc.m(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.f();
        } else {
            imageReceiver.u0(null, null, ic.i(b8.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, hc.m(photo.sizes), 0L, null, storyItem, 0);
        }
    }
}
