// default package

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
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class t6b {
    public static o15 b;
    public static o15 c;
    public static o15 d;
    public static Paint e;
    public static RectF f;
    public static Paint g;
    public static Paint h;
    public static pkb i;
    public static int j;
    public static BitmapDrawable m;
    public static final o15[] a = new o15[2];
    public static final Paint[] k = new Paint[2];
    public static final int[] l = new int[2];
    public static final RectF n = new RectF();
    public static final tv o = new tv((byte) 10);
    public static final RectF p = new RectF();
    public static final Path q = new Path();
    public static final Matrix r = new Matrix();
    public static final PathMeasure s = new PathMeasure();
    public static final Path t = new Path();

    public static void a(ema emaVar) {
        String M0 = ob6.M0(2131743455, null);
        if (M0.indexOf("…") <= 0) {
            emaVar.l(M0, false);
            return;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        qac qacVar = new qac();
        valueOf.setSpan(qacVar, valueOf.length() - 1, valueOf.length(), 0);
        qacVar.a = emaVar;
        qacVar.n = true;
        emaVar.l(valueOf, false);
    }

    public static void b(TL_stories.StoryItem storyItem, TLRPC.User user) {
        if (user == null || storyItem.dialogId != yac.h(yac.t0).n || v(storyItem)) {
            return;
        }
        TL_stories.StoryViews storyViews = storyItem.views;
        if (storyViews == null) {
            storyViews = new TL_stories.TL_storyViews();
            storyItem.views = storyViews;
        }
        if (storyViews.views_count == 0) {
            storyViews.views_count = 1;
            storyViews.recent_viewers.add(Long.valueOf(user.id));
        }
    }

    public static void c(vnb vnbVar) {
        if (e == null) {
            Paint paint = new Paint(1);
            e = paint;
            paint.setStyle(Paint.Style.STROKE);
            e.setStrokeWidth(hl.N(1.3f));
            e.setStrokeCap(Paint.Cap.ROUND);
        }
        int v0 = aob.v0(aob.d6, vnbVar);
        if (j != v0) {
            j = v0;
            float B = hl.B(v0);
            if (B >= 0.721f) {
                e.setColor(vm2.f(0.2f, v0, -16777216));
                return;
            }
            Paint paint2 = e;
            if (B < 0.25f) {
                paint2.setColor(vm2.f(0.2f, v0, -1));
            } else {
                paint2.setColor(vm2.f(0.44f, v0, -1));
            }
        }
    }

    public static void d(vnb vnbVar, boolean z) {
        Paint[] paintArr = k;
        if (paintArr[z ? 1 : 0] == null) {
            Paint paint = new Paint(1);
            paintArr[z ? 1 : 0] = paint;
            paint.setStyle(Paint.Style.STROKE);
            paintArr[z ? 1 : 0].setStrokeWidth(hl.N(1.3f));
            paintArr[z ? 1 : 0].setStrokeCap(Paint.Cap.ROUND);
        }
        int v0 = aob.v0(!z ? aob.s8 : aob.M8, vnbVar);
        int[] iArr = l;
        if (iArr[z ? 1 : 0] != v0) {
            iArr[z ? 1 : 0] = v0;
            float B = hl.B(v0);
            if (B >= 0.721f) {
                paintArr[z ? 1 : 0].setColor(vm2.f(0.2f, v0, -16777216));
            } else if (B < 0.25f) {
                paintArr[z ? 1 : 0].setColor(vm2.f(0.2f, v0, -1));
            } else {
                paintArr[z ? 1 : 0].setColor(vm2.f(0.44f, v0, -1));
            }
        }
    }

    public static SpannableStringBuilder e(Object[] objArr, int i2, boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) ob6.a0(null, null, i2, objArr));
        wm2 wm2Var = new wm2(R.drawable.msg_mini_bomb, 0);
        if (z) {
            wm2Var.I = 0.8f;
            wm2Var.J = 0.8f;
        } else {
            wm2Var.n = -1;
        }
        spannableStringBuilder.setSpan(wm2Var, 0, 1, 0);
        return spannableStringBuilder;
    }

    public static SpannableStringBuilder f() {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        spannableStringBuilder.append((CharSequence) "d ").append((CharSequence) ob6.M0(2131744392, null));
        spannableStringBuilder.setSpan(new wm2(R.drawable.msg_mini_replystory2, 0), 0, 1, 0);
        return spannableStringBuilder;
    }

    public static void g(Canvas canvas, RectF rectF, Paint paint, float f2, float f3, float f4, float f5) {
        float f6;
        boolean z;
        float f7 = f3 - f2;
        if (f2 >= f4 || f3 >= f4 + f7) {
            f6 = f2;
            z = false;
        } else {
            f6 = f2;
            canvas.drawArc(rectF, f6, Math.min(f3, f4) - f2, false, paint);
            z = true;
        }
        float max = Math.max(f6, f5);
        float min = Math.min(f3, f4 + 360.0f);
        if (min >= max) {
            canvas.drawArc(rectF, max, min - max, false, paint);
        } else {
            if (z) {
                return;
            }
            if (f6 <= f4 || f3 >= f5) {
                canvas.drawArc(rectF, f6, f7, false, paint);
            }
        }
    }

    public static void h(long j2, Canvas canvas, ImageReceiver imageReceiver, q6b q6bVar) {
        i(j2, canvas, imageReceiver, yac.h(yac.t0).e() != j2 && uc7.s1(yac.t0).O1().J(j2), q6bVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:198:0x044d, code lost:
    
        if (r1 != 1) goto L232;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0263, code lost:
    
        if (r35.B == 1.0f) goto L140;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:151:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x04df  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f9  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0515  */
    /* JADX WARN: Removed duplicated region for block: B:166:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x04da  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x045b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0491  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x04ae A[LOOP:0: B:184:0x04aa->B:186:0x04ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x049a  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x046d  */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4, types: [int] */
    /* JADX WARN: Type inference failed for: r9v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void i(long j2, Canvas canvas, ImageReceiver imageReceiver, boolean z, q6b q6bVar) {
        int r2;
        int i2;
        float U1;
        float f2;
        int i3;
        c6b c6bVar;
        float f3;
        float f4;
        float f5;
        int i4;
        Canvas canvas2;
        RectF rectF;
        int i5;
        float f6;
        ImageReceiver imageReceiver2;
        q6b q6bVar2;
        boolean z2;
        c6b c6bVar2;
        ImageReceiver imageReceiver3;
        q6b q6bVar3;
        RectF rectF2;
        boolean z3;
        boolean z4;
        ln5 ln5Var;
        float f7;
        Paint paint;
        Paint paint2;
        Paint paint3;
        Paint paint4;
        float N;
        float f8;
        float f9;
        float A;
        boolean z5;
        boolean z6;
        ?? r9;
        float f10;
        Paint paint5;
        Paint paint6;
        Paint paint7;
        Paint paint8;
        float N2;
        float f11;
        float A2;
        o15 o15Var;
        float A3;
        c6b O1 = uc7.s1(yac.t0).O1();
        boolean z7 = q6bVar.b;
        boolean z8 = q6bVar.E;
        RectF rectF3 = q6bVar.F;
        if (q6bVar.x != j2) {
            q6bVar.x = j2;
            q6bVar.g();
            z7 = false;
        }
        boolean z9 = O1.j.get(j2, 0) == 1;
        boolean z10 = xc2.b0(yac.t0, j2) && !q6bVar.D;
        boolean z11 = q6bVar.r ? !O1.h.isEmpty() : z;
        if (q6bVar.d != null) {
            O1.D(q6bVar.c, j2);
            z9 = false;
        }
        if (z9) {
            if (O1.J(j2)) {
                i2 = 3;
                z7 = false;
                r2 = 2;
            } else {
                r2 = r(O1, j2);
                i2 = 3;
                z7 = false;
            }
        } else if (z11) {
            if (q6bVar.a) {
                r2 = 2;
            } else {
                r2 = O1.D(q6bVar.c, j2);
                if (r2 != 0) {
                    i2 = 1;
                }
            }
            i2 = 2;
        } else {
            r2 = r(O1, j2);
            i2 = r2;
        }
        int i6 = q6bVar.z;
        if (i6 != 0) {
            r2 = i6;
            i2 = r2;
        }
        int i7 = q6bVar.y;
        if (i7 != i2) {
            if (i7 == 3) {
                z7 = true;
            }
            if (i2 == 3) {
                q6bVar.q = r2;
                q6bVar.t = 0.0f;
            }
            if (z7) {
                q6bVar.A = i7;
                q6bVar.y = i2;
                q6bVar.B = 0.0f;
            } else {
                q6bVar.y = i2;
                q6bVar.B = 1.0f;
            }
        }
        v41 v41Var = q6bVar.H;
        float a2 = v41Var != null ? v41Var.a(0.08f) : 1.0f;
        if (q6bVar.C != z9 && z9) {
            q6bVar.K = 1.0f;
            q6bVar.L = false;
        }
        q6bVar.C = z9;
        if (q6bVar.y == 0 && q6bVar.B == 1.0f) {
            imageReceiver.k0(rectF3);
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
        float f12 = O1.G(q6bVar.x) ? q6bVar.e : 0.0f;
        float f13 = q6bVar.B;
        if (f13 != 1.0f) {
            f13 = k43.f.getInterpolation(f13);
        }
        float f14 = f13;
        if (!z8 || q6bVar.v) {
            int i8 = q6bVar.A;
            int i9 = q6bVar.q;
            if (i8 == 3) {
                i8 = i9;
            }
            int L = i8 == 2 ? hl.L(3.0f) : i8 == 1 ? hl.L(4.0f) : 0;
            int i10 = q6bVar.y;
            int i11 = q6bVar.q;
            if (i10 == 3) {
                i10 = i11;
            }
            U1 = hl.U1(q6bVar.B, L, i10 == 2 ? hl.L(3.0f) : i10 == 1 ? hl.L(4.0f) : 0);
        } else {
            U1 = 0.0f;
        }
        RectF rectF4 = n;
        if (U1 == 0.0f) {
            imageReceiver.k0(rectF3);
        } else {
            rectF4.set(rectF3);
            rectF4.inset(U1, U1);
            imageReceiver.k0(rectF4);
        }
        if (f12 > 0.0f) {
            f4 = 1.0f;
            c6bVar = O1;
            rectF = rectF4;
            f2 = U1;
            i3 = save;
            f3 = f12;
            i4 = r2;
            i5 = 3;
            f5 = 0.08f;
            canvas2 = canvas;
            canvas2.saveLayerAlpha(rectF4.left - hl.L(15.0f), rectF4.top - hl.L(15.0f), rectF4.right + hl.L(15.0f), rectF4.bottom + hl.L(15.0f), jn7.d4, 31);
        } else {
            f2 = U1;
            i3 = save;
            c6bVar = O1;
            f3 = f12;
            f4 = 1.0f;
            f5 = 0.08f;
            i4 = r2;
            canvas2 = canvas;
            rectF = rectF4;
            i5 = 3;
        }
        int i12 = q6bVar.A;
        o15[] o15VarArr = a;
        if ((i12 == 1 && q6bVar.B != f4) || q6bVar.y == 1) {
            if (i4 == 2) {
                o(imageReceiver);
                o15Var = b;
            } else if (i4 == i5) {
                q(imageReceiver);
                o15Var = c;
            } else {
                t(imageReceiver, z8);
                o15Var = o15VarArr[z8 ? 1 : 0];
            }
            boolean z12 = q6bVar.A == 1 && q6bVar.B != f4;
            float f15 = (!z8 || q6bVar.v) ? 0.0f : -hl.L(4.0f);
            if (z12) {
                A3 = (hl.L(5.0f) * f14) + f15;
                o15Var.c.setAlpha((int) ((f4 - f14) * q6bVar.u * 255.0f));
            } else {
                o15Var.c.setAlpha((int) (q6bVar.u * 255.0f * f14));
                A3 = qd4.A(f4, f14, hl.L(5.0f), f15);
            }
            float f16 = A3 + q6bVar.G;
            rectF.set(rectF3);
            rectF.inset(f16, f16);
            View view = imageReceiver.e;
            j(canvas2, q6bVar, o15Var.c, z10);
        }
        int i13 = q6bVar.A;
        Paint[] paintArr = k;
        if (i13 == 2) {
            f6 = 1.0f;
        } else {
            f6 = 1.0f;
        }
        if (q6bVar.y != 2) {
            imageReceiver2 = imageReceiver;
            q6bVar2 = q6bVar;
            z2 = z10;
            c6bVar2 = c6bVar;
            if ((q6bVar2.A == i5 || q6bVar2.B == 1.0f) && q6bVar2.y != i5) {
                imageReceiver3 = imageReceiver2;
                q6bVar3 = q6bVar2;
                rectF2 = rectF;
                z3 = true;
                z4 = false;
            } else {
                if (q6bVar2.q == 1) {
                    t(imageReceiver2, z8);
                    paint = o15VarArr[z8 ? 1 : 0].c;
                } else if (z8) {
                    d(q6bVar2.J, q6bVar2.o);
                    paint = paintArr[q6bVar2.o ? 1 : 0];
                } else {
                    c(q6bVar2.J);
                    paint = e;
                }
                paint.setAlpha((int) (f14 * 255.0f));
                if (q6bVar2.a) {
                    paint2 = t(imageReceiver2, z8);
                    paint2.setAlpha((int) (q6bVar2.u * 255.0f));
                    Paint o2 = o(imageReceiver2);
                    o2.setAlpha((int) (q6bVar2.u * 255.0f));
                    Paint q2 = q(imageReceiver2);
                    q2.setAlpha((int) (q6bVar2.u * 255.0f));
                    c(q6bVar2.J);
                    paint4 = o2;
                    paint3 = q2;
                } else {
                    paint2 = null;
                    paint3 = null;
                    paint4 = null;
                }
                if (q6bVar2.a) {
                    if (z8 && !q6bVar2.v) {
                        N = hl.N(3.5f);
                        f8 = -N;
                    }
                    f8 = 0.0f;
                } else {
                    if (z8 && !q6bVar2.v) {
                        N = hl.N(2.7f);
                        f8 = -N;
                    }
                    f8 = 0.0f;
                }
                if (q6bVar2.A != i5 || q6bVar2.B == 1.0f) {
                    paint.setAlpha((int) (q6bVar2.u * 255.0f * f14));
                    f9 = 1.0f;
                    A = qd4.A(1.0f, f14, hl.L(5.0f), f8);
                } else {
                    A = (hl.L(7.0f) * f14) + f8;
                    paint.setAlpha((int) ((1.0f - f14) * q6bVar2.u * 255.0f));
                    f9 = 1.0f;
                }
                float f17 = A + q6bVar2.G;
                rectF.set(rectF3);
                rectF.inset(f17, f17);
                boolean z13 = q6bVar2.a;
                if (z13 && q6bVar2.y == i5) {
                    float f18 = q6bVar2.t;
                    if (f18 != f9) {
                        float f19 = f18 + f5;
                        q6bVar2.t = f19;
                        if (f19 > f9) {
                            q6bVar2.t = f9;
                            f10 = f9;
                        } else {
                            f10 = f19;
                        }
                        float f20 = q6bVar2.e;
                        q6bVar2.e = f9 - f10;
                        m(canvas2, c6bVar2, imageReceiver2, q6bVar2, paint, paint2, paint3, paint4, z2);
                        imageReceiver3 = imageReceiver2;
                        q6bVar3 = q6bVar2;
                        q6bVar3.e = f20;
                        if (imageReceiver3.e != null) {
                            imageReceiver3.invalidate();
                            imageReceiver3.e.invalidate();
                        }
                        canvas2 = canvas;
                        rectF2 = rectF;
                        ln5Var = null;
                        z3 = true;
                        z4 = false;
                        imageReceiver3.h(canvas2, ln5Var);
                        q6bVar3.w = f3 > 0.5f ? z3 : z4;
                        if (f12 > 0.0f) {
                            float f21 = f2 + q6bVar3.G;
                            rectF2.set(rectF3);
                            rectF2.inset(f21, f21);
                            k(f3, 0.0f, canvas2, rectF2, imageReceiver3.R0);
                        }
                        f7 = q6bVar3.B;
                        if (f7 != 1.0f) {
                            float f22 = (hl.t / 250.0f) + f7;
                            q6bVar3.B = f22;
                            if (f22 > 1.0f) {
                                q6bVar3.B = 1.0f;
                            }
                            if (imageReceiver3.e != null) {
                                imageReceiver3.invalidate();
                                imageReceiver3.e.invalidate();
                            }
                        }
                        if (i3 != 0) {
                            canvas2.restoreToCount(i3);
                            return;
                        }
                        return;
                    }
                }
                q6bVar3 = q6bVar2;
                Paint paint9 = paint3;
                Paint paint10 = paint4;
                imageReceiver3 = imageReceiver2;
                if (z13) {
                    int D = c6bVar2.D(0, q6bVar3.x);
                    if (D == 2) {
                        paint2 = paint10;
                    } else if (D == i5) {
                        paint2 = paint9;
                    }
                    View view2 = imageReceiver3.e;
                    z5 = q6bVar3.L;
                    float f23 = q6bVar3.K;
                    if (z5) {
                        z4 = false;
                        float f24 = f23 - 0.016f;
                        q6bVar3.K = f24;
                        if (f24 < 0.0f) {
                            q6bVar3.K = 0.0f;
                            z3 = true;
                            q6bVar3.L = true;
                            q6bVar3.M += 1.152f;
                            view2.invalidate();
                            z6 = q6bVar3.L;
                            float f25 = q6bVar3.M;
                            float f26 = q6bVar3.K;
                            if (z6) {
                                float f27 = 360.0f * f26;
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, f25, f27, false, paint2);
                            } else {
                                float f28 = f26 * (-360.0f);
                                rectF2 = rectF;
                                canvas.drawArc(rectF2, f25 + 360.0f, f28, false, paint2);
                            }
                            for (r9 = z4; r9 < 16; r9++) {
                                float f29 = (((float) r9) * 22.5f) + 10.0f;
                                canvas.drawArc(rectF2, q6bVar3.M + f29, ((22.5f + f29) - 10.0f) - f29, false, paint2);
                            }
                            canvas2 = canvas;
                        }
                    } else {
                        float f30 = f23 + 0.016f;
                        q6bVar3.K = f30;
                        if (f30 >= 1.0f) {
                            q6bVar3.K = 1.0f;
                            z4 = false;
                            q6bVar3.L = false;
                        } else {
                            z4 = false;
                        }
                    }
                    z3 = true;
                    q6bVar3.M += 1.152f;
                    view2.invalidate();
                    z6 = q6bVar3.L;
                    float f252 = q6bVar3.M;
                    float f262 = q6bVar3.K;
                    if (z6) {
                    }
                    while (r9 < 16) {
                    }
                    canvas2 = canvas;
                }
                paint2 = paint;
                View view22 = imageReceiver3.e;
                z5 = q6bVar3.L;
                float f232 = q6bVar3.K;
                if (z5) {
                }
                z3 = true;
                q6bVar3.M += 1.152f;
                view22.invalidate();
                z6 = q6bVar3.L;
                float f2522 = q6bVar3.M;
                float f2622 = q6bVar3.K;
                if (z6) {
                }
                while (r9 < 16) {
                }
                canvas2 = canvas;
            }
            ln5Var = null;
            imageReceiver3.h(canvas2, ln5Var);
            q6bVar3.w = f3 > 0.5f ? z3 : z4;
            if (f12 > 0.0f) {
            }
            f7 = q6bVar3.B;
            if (f7 != 1.0f) {
            }
            if (i3 != 0) {
            }
        }
        boolean z14 = i13 == 2 && q6bVar.B != f6;
        if (z8) {
            d(q6bVar.J, q6bVar.o);
            paint5 = paintArr[q6bVar.o ? 1 : 0];
        } else {
            c(q6bVar.J);
            paint5 = e;
        }
        Paint paint11 = paint5;
        if (q6bVar.a) {
            paint6 = t(imageReceiver, z8);
            paint6.setAlpha((int) (q6bVar.u * 255.0f));
            Paint o3 = o(imageReceiver);
            o3.setAlpha((int) (q6bVar.u * 255.0f));
            Paint q3 = q(imageReceiver);
            q3.setAlpha((int) (q6bVar.u * 255.0f));
            c(q6bVar.J);
            paint8 = o3;
            paint7 = q3;
        } else {
            paint6 = null;
            paint7 = null;
            paint8 = null;
        }
        if (q6bVar.a) {
            if (z8 && !q6bVar.v) {
                N2 = hl.N(3.5f);
                f11 = -N2;
            }
            f11 = 0.0f;
        } else {
            if (z8 && !q6bVar.v) {
                N2 = hl.N(2.7f);
                f11 = -N2;
            }
            f11 = 0.0f;
        }
        if (z14) {
            A2 = (hl.L(5.0f) * f14) + f11;
            paint11.setAlpha((int) ((1.0f - f14) * q6bVar.u * 255.0f));
        } else {
            paint11.setAlpha((int) (q6bVar.u * 255.0f * f14));
            A2 = qd4.A(1.0f, f14, hl.L(5.0f), f11);
        }
        float f31 = A2 + q6bVar.G;
        rectF.set(rectF3);
        rectF.inset(f31, f31);
        imageReceiver2 = imageReceiver;
        q6bVar2 = q6bVar;
        z2 = z10;
        if (q6bVar.a) {
            c6bVar2 = c6bVar;
            m(canvas2, c6bVar2, imageReceiver2, q6bVar2, paint11, paint6, paint7, paint8, z2);
        } else {
            c6bVar2 = c6bVar;
            View view3 = imageReceiver2.e;
            j(canvas2, q6bVar2, paint11, z2);
        }
        if (q6bVar2.A == i5) {
        }
        imageReceiver3 = imageReceiver2;
        q6bVar3 = q6bVar2;
        rectF2 = rectF;
        z3 = true;
        z4 = false;
        ln5Var = null;
        imageReceiver3.h(canvas2, ln5Var);
        q6bVar3.w = f3 > 0.5f ? z3 : z4;
        if (f12 > 0.0f) {
        }
        f7 = q6bVar3.B;
        if (f7 != 1.0f) {
        }
        if (i3 != 0) {
        }
    }

    public static void j(Canvas canvas, q6b q6bVar, Paint paint, boolean z) {
        RectF rectF = n;
        if (z) {
            RectF rectF2 = p;
            rectF2.set(rectF);
            rectF2.inset(hl.L(0.5f), hl.L(0.5f));
            canvas.drawRoundRect(rectF2, hl.L(18.0f), hl.L(18.0f), paint);
            return;
        }
        float f2 = q6bVar.f;
        if (f2 == 0.0f) {
            canvas.drawCircle(rectF.centerX(), rectF.centerY(), rectF.width() / 2.0f, paint);
        } else {
            canvas.drawArc(rectF, (f2 / 2.0f) + 360.0f, 360.0f - f2, false, paint);
        }
    }

    public static void k(float f2, float f3, Canvas canvas, RectF rectF, boolean z) {
        Canvas canvas2;
        if (i == null) {
            i = new pkb(ob6.M0(2131748579, null), 9.66f, hl.o());
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
        h.setColor(aob.p1(f2, aob.w0(null, aob.fl, false)));
        float U1 = hl.U1(f3, hl.L(4.66f), hl.L(7.0f));
        float j2 = i.j() + U1 + U1;
        float U12 = hl.U1(f3, hl.L(15.0f), hl.L(18.0f));
        float L = hl.L(2.0f);
        canvas.save();
        float f4 = j2 / 2.0f;
        float f5 = 0.8f * U12;
        float f6 = U12 * 0.2f;
        f.set((rectF.centerX() - f4) - L, (rectF.bottom - f5) - L, rectF.centerX() + f4 + L, rectF.bottom + f6 + L);
        float R1 = hl.R1(0.7f, 1.0f, f2);
        canvas.scale(R1, R1, f.centerX(), f.centerY());
        RectF rectF2 = f;
        hl.e3(rectF2, f2, rectF2.centerX(), rectF2.centerY());
        RectF rectF3 = f;
        canvas.drawRoundRect(rectF3, rectF3.height() / 2.0f, f.height() / 2.0f, g);
        if (z) {
            f.set(rectF.centerX() - f4, rectF.bottom - f5, rectF.centerX() + f4, rectF.bottom + f6);
            RectF rectF4 = f;
            canvas.drawRoundRect(rectF4, rectF4.height() / 2.0f, f.height() / 2.0f, h);
            pkb pkbVar = i;
            RectF rectF5 = f;
            canvas2 = canvas;
            pkbVar.c(rectF5.left + U1, rectF5.centerY(), f2, -1, canvas2);
        } else {
            canvas2 = canvas;
        }
        canvas2.restore();
    }

    public static void l(Canvas canvas, RectF rectF, Paint paint, float f2, float f3, q6b q6bVar, boolean z) {
        if (z) {
            float height = rectF.height() * 0.32f;
            float f4 = ((((int) f2) / 90) * 90) + 90;
            float f5 = (-199.0f) + f4;
            Path path = q;
            path.rewind();
            path.addRoundRect(rectF, height, height, Path.Direction.CW);
            Matrix matrix = r;
            matrix.reset();
            matrix.postRotate(f4, rectF.centerX(), rectF.centerY());
            path.transform(matrix);
            PathMeasure pathMeasure = s;
            pathMeasure.setPath(path, false);
            float length = pathMeasure.getLength();
            Path path2 = t;
            path2.reset();
            pathMeasure.getSegment(((f2 - f5) / 360.0f) * length, length * ((f3 - f5) / 360.0f), path2, true);
            path2.rLineTo(0.0f, 0.0f);
            canvas.drawPath(path2, paint);
            return;
        }
        if (!q6bVar.k) {
            if (q6bVar.l) {
                float f6 = q6bVar.f;
                g(canvas, rectF, paint, f2, f3, ((-f6) / 2.0f) + 180.0f, (f6 / 2.0f) + 180.0f);
                return;
            } else if (f2 < 90.0f) {
                g(canvas, rectF, paint, f2, f3, q6bVar.g, q6bVar.h);
                return;
            } else {
                g(canvas, rectF, paint, f2, f3, -q6bVar.i, q6bVar.j);
                return;
            }
        }
        boolean z2 = q6bVar.m;
        if (!z2 && !q6bVar.l) {
            float f7 = q6bVar.f;
            if (f2 < 90.0f) {
                g(canvas, rectF, paint, f2, f3, (-f7) / 2.0f, f7 / 2.0f);
                return;
            } else {
                g(canvas, rectF, paint, f2, f3, ((-f7) / 2.0f) + 180.0f, (f7 / 2.0f) + 180.0f);
                return;
            }
        }
        if (q6bVar.l) {
            float f8 = q6bVar.f;
            g(canvas, rectF, paint, f2, f3, ((-f8) / 2.0f) + 180.0f, (f8 / 2.0f) + 180.0f);
        } else if (!z2) {
            canvas.drawArc(rectF, f2, f3 - f2, false, paint);
        } else {
            float f9 = q6bVar.f;
            g(canvas, rectF, paint, f2, f3, (-f9) / 2.0f, f9 / 2.0f);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01d8, code lost:
    
        if (r13.stories.get(r3).close_friends != false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x019a, code lost:
    
        if (r4 == 1) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void m(Canvas canvas, c6b c6bVar, ImageReceiver imageReceiver, q6b q6bVar, Paint paint, Paint paint2, Paint paint3, Paint paint4, boolean z) {
        Paint paint5;
        RectF rectF;
        int max;
        Paint paint6;
        q6b q6bVar2 = q6bVar;
        vnb vnbVar = q6bVar2.J;
        boolean z2 = q6bVar2.E;
        c(vnbVar);
        d(q6bVar2.J, q6bVar2.o);
        long j2 = q6bVar2.s;
        int i2 = 0;
        int D = j2 != 0 ? c6bVar.D(0, j2) : c6bVar.D(0, q6bVar2.x);
        int i3 = 2;
        q6bVar2.n = D == 0 ? (byte) 2 : (byte) 1;
        TL_stories.PeerStories x = c6bVar.x(q6bVar2.x);
        ArrayList arrayList = c6bVar.h;
        if (x == null) {
            x = c6bVar.y(q6bVar2.x);
        }
        TL_stories.PeerStories peerStories = x;
        int size = q6bVar2.r ? arrayList.size() : (peerStories == null || peerStories.stories.size() == 1) ? 1 : peerStories.stories.size();
        Paint[] paintArr = k;
        if (D == 2) {
            o(imageReceiver);
            paint5 = b.c;
        } else if (D == 3) {
            q(imageReceiver);
            paint5 = c.c;
        } else if (D == 1) {
            t(imageReceiver, z2);
            paint5 = a[z2 ? 1 : 0].c;
        } else {
            paint5 = z2 ? paintArr[q6bVar2.o ? 1 : 0] : e;
        }
        Paint paint7 = paint5;
        RectF rectF2 = n;
        if (size <= 1) {
            long j3 = q6bVar2.x;
            TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) c6bVar.i.f(j3);
            if (peerStories2 == null) {
                peerStories2 = c6bVar.y(j3);
            }
            if (peerStories2 != null) {
                if (j3 != yac.h(c6bVar.a).e() || Utilities.x((Collection) c6bVar.b.f(j3))) {
                    int i4 = 0;
                    while (true) {
                        if (i4 >= peerStories2.stories.size()) {
                            break;
                        }
                        TL_stories.StoryItem storyItem = peerStories2.stories.get(i4);
                        if (storyItem != null) {
                            if (storyItem.media instanceof TLRPC.TL_messageMediaVideoStream) {
                                i2 = 2;
                                break;
                            } else if (storyItem.id > peerStories2.max_read_id) {
                                break;
                            }
                        }
                        i4++;
                    }
                }
                i2 = 1;
            }
            Paint paint8 = i2 == 2 ? paint3 : paint7 == b.c ? paint4 : i2 == 1 ? paint2 : paint;
            l(canvas, rectF2, paint8, -90.0f, 90.0f, q6bVar2, z);
            l(canvas, rectF2, paint8, 90.0f, 270.0f, q6bVar, z);
            float f2 = q6bVar.e;
            if (f2 == 1.0f || paint8 == paint7) {
                return;
            }
            paint7.setAlpha((int) ((1.0f - f2) * 255.0f));
            l(canvas, rectF2, paint7, -90.0f, 90.0f, q6bVar, z);
            l(canvas, rectF2, paint7, 90.0f, 270.0f, q6bVar, z);
            paint7.setAlpha(jn7.d4);
            return;
        }
        Paint paint9 = paint7;
        float f3 = 360.0f / size;
        float f4 = (size > 20 ? 3 : 5) * q6bVar2.e;
        if (f4 > f3) {
            f4 = 0.0f;
        }
        float f5 = f4;
        if (q6bVar2.r) {
            rectF = rectF2;
            max = 0;
        } else {
            rectF = rectF2;
            max = Math.max(peerStories.max_read_id, c6bVar.f.get(q6bVar2.x, 0));
        }
        int i5 = 0;
        while (i5 < size) {
            Paint paint10 = z2 ? paintArr[q6bVar2.o ? 1 : 0] : e;
            if (q6bVar2.r) {
                int D2 = c6bVar.D(i2, wf3.n(((TL_stories.PeerStories) arrayList.get((size - 1) - i5)).peer));
                if (D2 != i3) {
                    if (D2 != 3) {
                    }
                    paint10 = paint3;
                }
                paint10 = paint4;
            } else {
                if (i5 < peerStories.stories.size()) {
                    if (peerStories.stories.get(i5).justUploaded || peerStories.stories.get(i5).id > max) {
                        if (!(peerStories.stories.get(i5).media instanceof TLRPC.TL_messageMediaVideoStream)) {
                        }
                        paint10 = paint3;
                    }
                }
                paint10 = paint2;
            }
            float f6 = (i5 * f3) - 90.0f;
            float f7 = f6 + f3;
            float f8 = f6 + f5;
            float f9 = f7 - f5;
            Paint paint11 = paint9;
            int i6 = max;
            int i7 = i5;
            Paint paint12 = paint10;
            RectF rectF3 = rectF;
            l(canvas, rectF3, paint12, f8, f9, q6bVar, z);
            RectF rectF4 = rectF3;
            if (q6bVar.e == 1.0f || paint12 == paint11) {
                paint6 = paint11;
            } else {
                paint11.getStrokeWidth();
                paint11.setAlpha((int) ((1.0f - q6bVar.e) * 255.0f));
                l(canvas, rectF4, paint11, f8, f9, q6bVar, z);
                rectF4 = rectF4;
                paint6 = paint11;
                paint6.setAlpha(jn7.d4);
            }
            i5 = i7 + 1;
            q6bVar2 = q6bVar;
            rectF = rectF4;
            paint9 = paint6;
            max = i6;
            i2 = 0;
            i3 = 2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x015d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static pv0 n(TL_stories.PeerStories peerStories, Runnable runnable) {
        TL_stories.StoryItem storyItem;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        pv0 pv0Var;
        TLRPC.MessageMedia messageMedia;
        TLRPC.Photo photo2;
        ArrayList<TLRPC.PhotoSize> arrayList2;
        if (peerStories == null || peerStories.stories.isEmpty() || wf3.n(peerStories.peer) == yac.h(yac.t0).n) {
            runnable.run();
            return null;
        }
        c6b c6bVar = uc7.s1(yac.t0).e0;
        int i2 = c6bVar.f.get(wf3.n(peerStories.peer));
        int i3 = 0;
        while (true) {
            if (i3 >= peerStories.stories.size()) {
                storyItem = null;
                break;
            }
            if (peerStories.stories.get(i3).id > i2) {
                storyItem = peerStories.stories.get(i3);
                break;
            }
            i3++;
        }
        if (storyItem == null) {
            storyItem = peerStories.stories.get(0);
        }
        TL_stories.StoryItem storyItem2 = storyItem;
        TLRPC.MessageMedia messageMedia2 = storyItem2.media;
        if (messageMedia2 == null) {
            photo = null;
        } else {
            if (messageMedia2.document != null) {
                xb4.G(yac.t0);
                File J = xb4.J(storyItem2.media.document, "", false, true);
                if (J != null && J.exists()) {
                    runnable.run();
                    return null;
                }
                xb4.G(yac.t0);
                File J2 = xb4.J(storyItem2.media.document, "", true, true);
                if (J2 != null) {
                    try {
                        int lastIndexOf = J2.getName().lastIndexOf(".");
                        if (lastIndexOf > 0) {
                            File file = new File(J2.getParentFile(), J2.getName().substring(0, lastIndexOf) + ".temp");
                            if (file.exists() && file.length() > 0) {
                                runnable.run();
                                return null;
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                long n2 = wf3.n(peerStories.peer);
                pv0Var = new pv0();
                pv0Var.b = false;
                pv0Var.a = n2;
                pv0Var.c = c6bVar;
                pv0Var.d = new z3b(pv0Var, runnable, (byte) 16);
                Runnable[] runnableArr = {r2};
                z3b z3bVar = new z3b(runnableArr, pv0Var, (byte) 17);
                hl.d3(z3bVar, 3000L);
                p6b p6bVar = new p6b(runnableArr, pv0Var);
                pv0Var.e = p6bVar;
                p6bVar.A1 = true;
                p6bVar.I();
                String s2 = s();
                messageMedia = storyItem2.media;
                if (messageMedia == null) {
                    TLRPC.Document document = messageMedia.document;
                    if (document != null) {
                        ((p6b) pv0Var.e).Z(jn5.b(document), s2.concat("_pframe"), null, null, null, 0L, null, storyItem2, 0);
                        return pv0Var;
                    }
                    photo2 = messageMedia.photo;
                } else {
                    photo2 = null;
                }
                if (photo2 != null || (arrayList2 = photo2.sizes) == null) {
                    ((z3b) pv0Var.d).run();
                    return null;
                }
                ((p6b) pv0Var.e).Y(null, null, jn5.i(xb4.w(arrayList2, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo2), s2, null, null, null, 0L, null, storyItem2, 0);
                return pv0Var;
            }
            photo = messageMedia2.photo;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            runnable.run();
            return null;
        }
        TLRPC.PhotoSize w = xb4.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false);
        xb4.G(yac.t0);
        File J3 = xb4.J(w, "", false, true);
        if (J3 != null && J3.exists()) {
            runnable.run();
            return null;
        }
        long n22 = wf3.n(peerStories.peer);
        pv0Var = new pv0();
        pv0Var.b = false;
        pv0Var.a = n22;
        pv0Var.c = c6bVar;
        pv0Var.d = new z3b(pv0Var, runnable, (byte) 16);
        Runnable[] runnableArr2 = {z3bVar};
        z3b z3bVar2 = new z3b(runnableArr2, pv0Var, (byte) 17);
        hl.d3(z3bVar2, 3000L);
        p6b p6bVar2 = new p6b(runnableArr2, pv0Var);
        pv0Var.e = p6bVar2;
        p6bVar2.A1 = true;
        p6bVar2.I();
        String s22 = s();
        messageMedia = storyItem2.media;
        if (messageMedia == null) {
        }
        if (photo2 != null) {
        }
        ((z3b) pv0Var.d).run();
        return null;
    }

    public static Paint o(ImageReceiver imageReceiver) {
        if (b == null) {
            o15 o15Var = new o15();
            b = o15Var;
            o15Var.a = true;
            o15Var.b = true;
            o15Var.d(aob.w0(null, aob.cl, false), aob.w0(null, aob.dl, false), 0, 0);
            b.c.setStrokeWidth(hl.N(2.0f));
            b.c.setStyle(Paint.Style.STROKE);
            b.c.setStrokeCap(Paint.Cap.ROUND);
        }
        b.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return b.c;
    }

    public static Drawable p() {
        BitmapDrawable bitmapDrawable = m;
        if (bitmapDrawable != null) {
            return bitmapDrawable;
        }
        Bitmap createBitmap = Bitmap.createBitmap(360, jn7.J2, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(-7829368);
        Canvas canvas = new Canvas(createBitmap);
        TextPaint textPaint = new TextPaint(1);
        textPaint.setTextSize(15.0f);
        textPaint.setTextAlign(Paint.Align.CENTER);
        textPaint.setColor(vm2.o(-16777216, 100));
        canvas.drawText("expired", 180.0f, 86.0f, textPaint);
        canvas.drawText("story", 180.0f, 106.0f, textPaint);
        BitmapDrawable bitmapDrawable2 = new BitmapDrawable(createBitmap);
        m = bitmapDrawable2;
        return bitmapDrawable2;
    }

    public static Paint q(ImageReceiver imageReceiver) {
        if (c == null) {
            o15 o15Var = new o15();
            c = o15Var;
            o15Var.a = true;
            o15Var.b = true;
            o15Var.d(aob.w0(null, aob.el, false), aob.w0(null, aob.fl, false), 0, 0);
            c.c.setStrokeWidth(hl.N(2.0f));
            c.c.setStyle(Paint.Style.STROKE);
            c.c.setStrokeCap(Paint.Cap.ROUND);
        }
        c.b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return c.c;
    }

    public static int r(c6b c6bVar, long j2) {
        TLRPC.TL_recentStory tL_recentStory;
        TLRPC.TL_recentStory tL_recentStory2;
        if (j2 == 0) {
            return 0;
        }
        int i2 = yac.t0;
        if (j2 <= 0) {
            TLRPC.Chat M0 = uc7.s1(i2).M0(Long.valueOf(-j2));
            if (M0 == null || (tL_recentStory = M0.stories_max_id) == null || tL_recentStory.max_id <= 0 || M0.stories_unavailable) {
                return 0;
            }
            int i3 = c6bVar.f.get(j2, 0);
            TLRPC.TL_recentStory tL_recentStory3 = M0.stories_max_id;
            if (tL_recentStory3.live) {
                return 3;
            }
            return tL_recentStory3.max_id > i3 ? 1 : 2;
        }
        TLRPC.User X1 = uc7.s1(i2).X1(Long.valueOf(j2));
        if (j2 == yac.h(yac.t0).n || X1 == null || (tL_recentStory2 = X1.stories_max_id) == null || tL_recentStory2.max_id <= 0 || X1.stories_unavailable) {
            return 0;
        }
        int i4 = c6bVar.f.get(j2, 0);
        TLRPC.TL_recentStory tL_recentStory4 = X1.stories_max_id;
        if (tL_recentStory4.live) {
            return 3;
        }
        return tL_recentStory4.max_id > i4 ? 1 : 2;
    }

    public static String s() {
        int max = (int) (Math.max(hl.b1().x, hl.b1().y) / hl.p);
        return qd4.m(max, max, "_");
    }

    public static Paint t(ImageReceiver imageReceiver, boolean z) {
        o15[] o15VarArr = a;
        if (o15VarArr[z ? 1 : 0] == null) {
            o15 o15Var = new o15();
            o15VarArr[z ? 1 : 0] = o15Var;
            o15Var.a = true;
            o15Var.b = true;
            if (z) {
                o15Var.d(aob.w0(null, aob.al, false), aob.w0(null, aob.bl, false), 0, 0);
            } else {
                o15Var.d(aob.w0(null, aob.Yk, false), aob.w0(null, aob.Zk, false), 0, 0);
            }
            o15VarArr[z ? 1 : 0].c.setStrokeWidth(hl.N(2.0f));
            o15VarArr[z ? 1 : 0].c.setStyle(Paint.Style.STROKE);
            o15VarArr[z ? 1 : 0].c.setStrokeCap(Paint.Cap.ROUND);
        }
        o15VarArr[z ? 1 : 0].b(imageReceiver.L0, imageReceiver.M0, imageReceiver.w(), imageReceiver.x());
        return o15VarArr[z ? 1 : 0].c;
    }

    public static CharSequence u(TextView textView, boolean z) {
        String M0 = z ? ob6.M0(2131744326, null) : ob6.M0(2131743455, null);
        if (M0.indexOf("…") <= 0) {
            return M0;
        }
        SpannableStringBuilder valueOf = SpannableStringBuilder.valueOf(M0);
        qac qacVar = new qac();
        valueOf.setSpan(qacVar, valueOf.length() - 1, valueOf.length(), 0);
        qacVar.a = textView;
        qacVar.n = false;
        return valueOf;
    }

    public static boolean v(TL_stories.StoryItem storyItem) {
        return storyItem != null && ConnectionsManager.getInstance(yac.t0).getCurrentTime() > storyItem.expire_date + 86400;
    }

    public static boolean w(int i2, TL_stories.StoryItem storyItem) {
        return ConnectionsManager.getInstance(i2).getCurrentTime() > storyItem.expire_date;
    }

    public static void x(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        TL_stories.StoryItem storyItem2;
        TLRPC.Photo photo;
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        if (messageMedia != null) {
            TLRPC.Document document = messageMedia.document;
            if (document != null) {
                imageReceiver.Z(jn5.c(xb4.w(document.thumbs, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), storyItem.media.document), "320_320", null, null, in5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
                imageReceiver.a(new qcb(storyItem));
                return;
            } else {
                storyItem2 = storyItem;
                photo = messageMedia.photo;
            }
        } else {
            storyItem2 = storyItem;
            photo = null;
        }
        if (messageMedia instanceof TLRPC.TL_messageMediaUnsupported) {
            Bitmap createBitmap = Bitmap.createBitmap(10, 10, Bitmap.Config.ARGB_8888);
            createBitmap.eraseColor(vm2.f(0.2f, -16777216, -1));
            imageReceiver.f0(createBitmap);
            imageReceiver.a(new qcb(storyItem2));
            return;
        }
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.f();
            return;
        }
        TL_stories.StoryItem storyItem3 = storyItem2;
        imageReceiver.Y(null, null, jn5.i(xb4.w(arrayList, ConnectionsManager.DEFAULT_DATACENTER_ID, false, null, false), photo), "320_320", null, null, in5.i(photo.sizes), 0L, null, storyItem3, 0);
        imageReceiver.a(new qcb(storyItem3));
    }

    public static void y(ImageReceiver imageReceiver, TL_stories.StoryItem storyItem) {
        ArrayList<TLRPC.PhotoSize> arrayList;
        if (storyItem == null) {
            return;
        }
        TLRPC.MessageMedia messageMedia = storyItem.media;
        TLRPC.Document document = messageMedia.document;
        if (document != null) {
            imageReceiver.Z(jn5.c(xb4.w(document.thumbs, 1000, false, null, false), storyItem.media.document), "100_100", null, null, in5.i(storyItem.media.document.thumbs), 0L, null, storyItem, 0);
            return;
        }
        TLRPC.Photo photo = messageMedia.photo;
        if (photo == null || (arrayList = photo.sizes) == null) {
            imageReceiver.f();
        } else {
            imageReceiver.Y(null, null, jn5.i(xb4.w(arrayList, 1000, false, null, false), photo), "100_100", null, null, in5.i(photo.sizes), 0L, null, storyItem, 0);
        }
    }
}
