// default package

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.os.Build;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pjb implements n37 {
    public final float A;
    public final yv1 B;
    public final LinearGradient C;
    public final float D;
    public final po E;
    public final h47 F;
    public final NinePatchDrawable G;
    public final ms1 H;
    public final cn I;
    public float J;
    public float K;
    public final float L;
    public final int M;
    public final int N;
    public final ylb O;
    public final PointF P;
    public final RectF Q;
    public final RectF R;
    public float[] S;
    public final float T;
    public float a;
    public final Paint b;
    public final boolean c;
    public final ValueAnimator d;
    public final float e;
    public final float f;
    public final float g;
    public final int h;
    public final int i;
    public final float j;
    public final k47 k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final boolean p;
    public final StaticLayout q;
    public final StaticLayout r;
    public final rc2 s;
    public final r59 t;
    public final h22 u;
    public final Matrix v;
    public final Paint w;
    public final int x;
    public final float y;
    public final float z;

    public pjb(rc2 rc2Var, yv1 yv1Var, r59 r59Var, h22 h22Var, ylb ylbVar) {
        int i;
        StaticLayout staticLayout;
        int i2;
        int i3;
        m37 O1;
        Object[] spans;
        Paint paint = new Paint(1);
        this.b = paint;
        this.E = new po(null);
        PointF pointF = new PointF();
        this.P = pointF;
        this.Q = new RectF();
        this.R = new RectF();
        this.O = ylbVar;
        if (rc2Var.getMessageObject().B2 == null || rc2Var.getMessageObject().B2.size() > 1 || rc2Var.getMessageObject().B2.isEmpty() || ((h47) rc2Var.getMessageObject().B2.get(0)).e.getLineCount() > 10) {
            return;
        }
        this.s = rc2Var;
        this.t = r59Var;
        this.u = h22Var;
        this.B = yv1Var;
        ms1 ms1Var = yv1Var.a0;
        this.H = ms1Var;
        if (ms1Var == null || ms1Var.getEditField() == null || ms1Var.getEditField().getLayout() == null) {
            return;
        }
        ms1Var.getRecordCircle();
        paint.setFilterBitmap(true);
        this.k = rc2Var.getMessageObject();
        if (!rc2Var.getTransitionParams().w0) {
            rc2Var.draw(new Canvas());
        }
        rc2Var.setEnterTransitionInProgress(true);
        Editable editText = ms1Var.getEditText();
        CharSequence charSequence = rc2Var.getMessageObject().v;
        this.n = false;
        this.o = ms1Var.s6 != 0 && SystemClock.uptimeMillis() - ms1Var.s6 < 1500;
        ms1Var.getEditField().getLayout().getHeight();
        TextPaint textPaint = cmb.n2;
        Typeface typeface = gm.a;
        if (rc2Var.getMessageObject().P1 != 0) {
            boolean z = rc2Var.getMessageObject().P1 == rc2Var.getMessageObject().Q1;
            switch (Math.max(rc2Var.getMessageObject().P1, rc2Var.getMessageObject().Q1)) {
                case 0:
                case 1:
                case 2:
                    if (z) {
                        textPaint = cmb.x2[0];
                        break;
                    } else {
                        textPaint = cmb.x2[2];
                        break;
                    }
                case 3:
                    if (z) {
                        textPaint = cmb.x2[1];
                        break;
                    } else {
                        textPaint = cmb.x2[3];
                        break;
                    }
                case 4:
                    if (z) {
                        textPaint = cmb.x2[2];
                        break;
                    } else {
                        textPaint = cmb.x2[4];
                        break;
                    }
                case 5:
                    if (z) {
                        textPaint = cmb.x2[3];
                        break;
                    } else {
                        textPaint = cmb.x2[5];
                        break;
                    }
                case 6:
                    if (z) {
                        textPaint = cmb.x2[4];
                        break;
                    } else {
                        textPaint = cmb.x2[5];
                        break;
                    }
                default:
                    textPaint = cmb.x2[5];
                    break;
            }
            if (textPaint != null) {
                textPaint.getTextSize();
            }
        }
        boolean z2 = (charSequence instanceof Spannable) && (spans = ((Spannable) charSequence).getSpans(0, charSequence.length(), Object.class)) != null && spans.length > 0;
        if (editText.length() != charSequence.length() || z2) {
            this.n = true;
            int[] iArr = new int[1];
            CharSequence J3 = gm.J3(editText, iArr);
            if (iArr[0] > 0) {
                i = ms1Var.getEditField().getLayout().getLineTop(ms1Var.getEditField().getLayout().getLineForOffset(iArr[0]));
                ms1Var.getEditField().getLayout().getLineBottom(ms1Var.getEditField().getLayout().getLineForOffset(J3.length() + iArr[0]));
            } else {
                i = 0;
            }
            gn.cloneSpans(charSequence);
            charSequence = gw3.m(editText, textPaint.getFontMetricsInt(), false, null, 0);
        } else {
            i = 0;
        }
        float textSize = ms1Var.getEditField().getTextSize() / textPaint.getTextSize();
        this.D = textSize;
        int lineCount = ms1Var.getEditField().getLayout().getLineCount();
        int width = (int) (ms1Var.getEditField().getLayout().getWidth() / textSize);
        if (Build.VERSION.SDK_INT >= 24) {
            staticLayout = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(Layout.Alignment.ALIGN_NORMAL).build();
            this.q = staticLayout;
        } else {
            StaticLayout staticLayout2 = new StaticLayout(charSequence, textPaint, width, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.q = staticLayout2;
            staticLayout = staticLayout2;
        }
        this.I = gn.update(2, (View) null, this.I, staticLayout);
        zgc.b(ms1Var.getEditField(), yv1Var.m1, pointF);
        float f = pointF.y;
        this.z = pointF.x;
        this.A = ((gm.L(10.0f) + f) - ms1Var.getEditField().getScrollY()) + i;
        this.l = 0.0f;
        float f2 = Float.MAX_VALUE;
        for (int i4 = 0; i4 < this.q.getLineCount(); i4++) {
            float lineLeft = this.q.getLineLeft(i4);
            if (lineLeft < f2) {
                f2 = lineLeft;
            }
        }
        if (f2 != Float.MAX_VALUE) {
            this.l = f2;
        }
        this.q.getHeight();
        float L = gm.L(4.0f) + f;
        this.j = L;
        if (this.H.Y0()) {
            this.j = L - gm.L(12.0f);
        }
        this.y = f + ms1Var.getEditField().getMeasuredHeight();
        h47 h47Var = (h47) rc2Var.getMessageObject().B2.get(0);
        this.F = h47Var;
        StaticLayout staticLayout3 = h47Var.e;
        int i5 = cmb.Vc;
        double h = on2.h(cmb.v0(i5, this.O));
        int i6 = cmb.Ke;
        if (Math.abs(h - on2.h(cmb.v0(i6, this.O))) > 0.20000000298023224d) {
            this.n = true;
            this.p = true;
        }
        this.M = cmb.v0(i6, this.O);
        this.N = cmb.v0(i5, this.O);
        if (staticLayout3.getLineCount() == this.q.getLineCount()) {
            lineCount = staticLayout3.getLineCount();
            int i7 = 0;
            int i8 = 0;
            i2 = 0;
            while (true) {
                if (i7 < lineCount) {
                    StaticLayout staticLayout4 = this.q;
                    int i9 = i8;
                    if (staticLayout4.getLineRight(i7) != staticLayout4.getWidth() || staticLayout4.getLineLeft(i7) == 0.0f) {
                        i8 = i9 + 1;
                    } else {
                        i2++;
                        i8 = i9;
                    }
                    if (staticLayout3.getLineEnd(i7) != this.q.getLineEnd(i7)) {
                        this.n = true;
                    } else {
                        i7++;
                    }
                }
            }
            i3 = i8;
        } else {
            this.n = true;
            i2 = 0;
            i3 = 0;
        }
        if (!this.n && i2 > 0 && i3 > 0) {
            SpannableString spannableString = new SpannableString(charSequence);
            SpannableString spannableString2 = new SpannableString(charSequence);
            float f3 = Float.MAX_VALUE;
            for (int i10 = 0; i10 < lineCount; i10++) {
                StaticLayout staticLayout5 = this.q;
                if (staticLayout5.getLineRight(i10) != staticLayout5.getWidth() || staticLayout5.getLineLeft(i10) == 0.0f) {
                    spannableString2.setSpan(new vy2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
                } else {
                    spannableString.setSpan(new vy2((byte) 1), this.q.getLineStart(i10), this.q.getLineEnd(i10), 0);
                    float lineLeft2 = this.q.getLineLeft(i10);
                    if (lineLeft2 < f3) {
                        f3 = lineLeft2;
                    }
                }
            }
            if (Build.VERSION.SDK_INT >= 24) {
                StaticLayout.Builder hyphenationFrequency = StaticLayout.Builder.obtain(spannableString, 0, spannableString.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_NORMAL;
                this.q = hyphenationFrequency.setAlignment(alignment).build();
                this.r = StaticLayout.Builder.obtain(spannableString2, 0, spannableString2.length(), textPaint, width).setBreakStrategy(1).setHyphenationFrequency(0).setAlignment(alignment).build();
            } else {
                Layout.Alignment alignment2 = Layout.Alignment.ALIGN_NORMAL;
                TextPaint textPaint2 = textPaint;
                this.q = new StaticLayout(spannableString, textPaint2, width, alignment2, 1.0f, 0.0f, false);
                this.r = new StaticLayout(spannableString2, textPaint2, width, alignment2, 1.0f, 0.0f, false);
            }
        }
        this.m = this.q.getWidth() - ((h47) rc2Var.getMessageObject().B2.get(0)).e.getWidth();
        boolean z3 = (rc2Var.getMessageObject().N1() == 0 || rc2Var.Q7 == null) ? false : true;
        this.c = z3;
        if (z3) {
            lka lkaVar = ((ae2[]) yv1Var.c0.b)[0].c;
            zgc.b(lkaVar, yv1Var.m1, this.P);
            PointF pointF2 = this.P;
            this.e = pointF2.x;
            this.g = pointF2.y;
            this.f = ((View) lkaVar.getParent()).getWidth();
            lka lkaVar2 = ((ae2[]) yv1Var.c0.b)[0].d;
            zgc.b(lkaVar2, yv1Var.m1, this.P);
            float f4 = this.P.y;
            this.h = lkaVar.getTextColor();
            this.i = lkaVar2.getTextColor();
            this.j -= gm.L(46.0f);
        }
        this.T = r59Var.getPaddingBottom() - (yv1Var.ld - ms1Var.getRestingFieldHeight());
        this.v = new Matrix();
        Paint paint2 = new Paint(1);
        this.w = paint2;
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, gm.L(12.0f), 0.0f, 0.0f, 0, -16777216, Shader.TileMode.CLAMP);
        this.C = linearGradient;
        paint2.setShader(linearGradient);
        this.x = rc2Var.getMessageObject().m1;
        ms1Var.getEditField().setAlpha(0.0f);
        ms1Var.setTextTransitionIsRunning(true);
        StaticLayout staticLayout6 = rc2Var.Q7;
        if (staticLayout6 != null && staticLayout6.getText().length() > 1 && rc2Var.Q7.getPrimaryHorizontal(0) != 0.0f) {
            this.L = rc2Var.Q7.getWidth() - rc2Var.Q7.getLineWidth(0);
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.d = ofFloat;
        ofFloat.addUpdateListener(new nl(this, ms1Var, h22Var, (byte) 6));
        ofFloat.setInterpolator(new LinearInterpolator());
        ofFloat.setDuration(250L);
        ((ArrayList) h22Var.c).add(this);
        h22Var.a();
        ((ViewGroup) h22Var.d).invalidate();
        this.E.d();
        ofFloat.addListener(new ia5(this, h22Var, rc2Var, ms1Var, yv1Var));
        if (gda.o() != 2 || (O1 = rc2Var.O1(true)) == null) {
            return;
        }
        int v0 = cmb.v0(cmb.Ie, this.O);
        Rect rect = O1.o;
        if (O1.F == null) {
            Bitmap createBitmap = Bitmap.createBitmap(O1.b(50.0f), O1.b(40.0f), Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            rect.set(O1.getBounds());
            Paint paint3 = new Paint(1);
            paint3.setColor(-1);
            O1.setBounds(0, 0, createBitmap.getWidth(), createBitmap.getHeight());
            O1.c(canvas, paint3);
            O1.F = new NinePatchDrawable(createBitmap, ure.c((createBitmap.getWidth() / 2) - 1, (createBitmap.getWidth() / 2) + 1, (createBitmap.getHeight() / 2) - 1, (createBitmap.getHeight() / 2) + 1, 0, 0, 0, 0, -1).array(), new Rect(), null);
            O1.setBounds(rect);
        }
        if (O1.G != v0) {
            O1.G = v0;
            O1.F.setColorFilter(new PorterDuffColorFilter(v0, PorterDuff.Mode.MULTIPLY));
        }
        this.G = O1.F;
    }

    /* JADX WARN: Code restructure failed: missing block: B:218:0x03e3, code lost:
    
        if (android.text.TextUtils.isEmpty(r5.z) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:228:0x03fb, code lost:
    
        if ((k47.n1(r4.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x044c, code lost:
    
        if (android.text.TextUtils.isEmpty(r6.z) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0464, code lost:
    
        if ((k47.n1(r4.C.k) instanceof org.telegram.tgnet.TLRPC.TL_messageMediaInvoice) != false) goto L105;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0246  */
    @Override // n37
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(Canvas canvas) {
        float f;
        float f2;
        Canvas canvas2;
        int i;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        ImageReceiver imageReceiver;
        ArrayList arrayList;
        yc2 yc2Var;
        float f10;
        float f11;
        float f12;
        h22 h22Var;
        float f13;
        k47 k47Var;
        yv1 yv1Var;
        float f14;
        rc2 rc2Var;
        int i2;
        float f15;
        float f16;
        float f17;
        float f18;
        pjb pjbVar;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        yv1 yv1Var2;
        float f26;
        float f27;
        int i3;
        yc2 yc2Var2;
        boolean z;
        int i4;
        boolean z2;
        float f28;
        rc2 rc2Var2;
        float f29;
        float f30;
        float f31;
        float f32;
        h47 h47Var;
        float f33;
        float f34;
        int i5;
        int i6;
        float f35;
        float f36;
        float f37;
        int v0;
        k47 k47Var2;
        int v02;
        float f38;
        float f39;
        float f40;
        RectF rectF;
        float f41;
        int i7;
        StaticLayout staticLayout;
        float f42;
        int i8;
        float f43;
        r59 r59Var = this.t;
        float y = r59Var.getY();
        h22 h22Var2 = this.u;
        float y2 = (y - h22Var2.getY()) + r59Var.getMeasuredHeight();
        float x = this.z - h22Var2.getX();
        float y3 = this.A - h22Var2.getY();
        rc2 rc2Var3 = this.s;
        int textX = rc2Var3.getTextX();
        yc2 yc2Var3 = rc2Var3.ub;
        ImageReceiver imageReceiver2 = rc2Var3.T7;
        ArrayList arrayList2 = rc2Var3.fc;
        this.J = textX;
        this.K = rc2Var3.getTextY();
        if (rc2Var3.getMessageObject().m1 == this.x) {
            float x2 = (r59Var.getX() + rc2Var3.getX()) - h22Var2.getX();
            float top = ((r59Var.getTop() + (rc2Var3.getPaddingTop() + rc2Var3.getTop())) - h22Var2.getY()) - (this.T - r59Var.getPaddingBottom());
            float interpolation = wb2.V.getInterpolation(this.a);
            float f44 = this.a;
            float f45 = f44 > 0.4f ? 1.0f : f44 / 0.4f;
            float f46 = 1.0f - f45;
            float f47 = f45;
            if (this.o) {
                float min = 1.0f - Math.min(1.0f, f44 / 0.14f);
                float max = Math.max(0.0f, Math.min(1.0f, (this.a - 0.08f) / 0.16f));
                f = min;
                f2 = mlb.B(max, 2.0f, 3.0f, max * max);
            } else {
                f = f46;
                f2 = f47;
            }
            float interpolation2 = d53.g.getInterpolation(d53.h.getInterpolation(this.a));
            float f48 = this.J + x2;
            float f49 = this.K + top;
            float f50 = 1.0f - interpolation2;
            int measuredHeight = (int) ((y2 * interpolation2) + (h22Var2.getMeasuredHeight() * f50));
            boolean z3 = rc2Var3.getBottom() - gm.L(4.0f) > r59Var.getMeasuredHeight() && (((float) rc2Var3.getMeasuredHeight()) + top) - ((float) gm.L(8.0f)) > ((float) measuredHeight) && h22Var2.getMeasuredHeight() > 0;
            if (z3) {
                float max2 = Math.max(0.0f, top);
                float measuredWidth = h22Var2.getMeasuredWidth();
                float measuredHeight2 = h22Var2.getMeasuredHeight();
                arrayList = arrayList2;
                f11 = interpolation2;
                f5 = x2;
                i = measuredHeight;
                f3 = x;
                f4 = f48;
                f7 = 3.0f;
                f9 = interpolation;
                yc2Var = yc2Var3;
                f10 = f47;
                h22Var = h22Var2;
                f13 = top;
                canvas2 = canvas;
                f6 = f50;
                imageReceiver = imageReceiver2;
                f12 = f49;
                f8 = 2.0f;
                canvas2.saveLayerAlpha(0.0f, max2, measuredWidth, measuredHeight2, nm7.d4, 31);
            } else {
                canvas2 = canvas;
                i = measuredHeight;
                f3 = x;
                f4 = f48;
                f5 = x2;
                f6 = f50;
                f7 = 3.0f;
                f8 = 2.0f;
                f9 = interpolation;
                imageReceiver = imageReceiver2;
                arrayList = arrayList2;
                yc2Var = yc2Var3;
                f10 = f47;
                f11 = interpolation2;
                f12 = f49;
                h22Var = h22Var2;
                f13 = top;
            }
            canvas2.save();
            float y4 = r59Var.getY();
            yv1 yv1Var3 = this.B;
            canvas2.clipRect(0.0f, ((y4 + yv1Var3.P9) - h22Var.getY()) - gm.L(f7), h22Var.getMeasuredWidth(), h22Var.getMeasuredHeight());
            canvas2.save();
            float f51 = this.l;
            float backgroundDrawableLeft = f5 + rc2Var3.getBackgroundDrawableLeft() + ((f3 - (f4 - f51)) * f6);
            float backgroundDrawableTop = rc2Var3.getBackgroundDrawableTop() + f13;
            float f52 = 1.0f - f9;
            float y5 = (backgroundDrawableTop * f9) + ((this.j - h22Var.getY()) * f52);
            float u = hg9.u(backgroundDrawableTop, rc2Var3.getBackgroundDrawableBottom() - rc2Var3.getBackgroundDrawableTop(), f9, (this.y - h22Var.getY()) * f52);
            int L = (int) ((gm.L(4.0f) * f6) + f5 + rc2Var3.getBackgroundDrawableRight());
            k47 k47Var3 = this.k;
            float f53 = f11;
            m37 O1 = !k47Var3.I2() ? rc2Var3.O1(true) : null;
            if (O1 != null) {
                f14 = f9;
                rc2Var3.setBackgroundTopY(h22Var.getTop() - r59Var.getTop());
                Drawable k = O1.k();
                if (f10 != 1.0f) {
                    k47Var = k47Var3;
                    NinePatchDrawable ninePatchDrawable = this.G;
                    yv1Var = yv1Var3;
                    if (ninePatchDrawable != null) {
                        rc2Var = rc2Var3;
                        ninePatchDrawable.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) u);
                        ninePatchDrawable.draw(canvas2);
                        if (k != null) {
                            k.setAlpha((int) (f53 * 255.0f));
                            k.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) u);
                            k.draw(canvas2);
                            k.setAlpha(nm7.d4);
                        }
                        O1.setAlpha((int) (f10 * 255.0f));
                        O1.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) u);
                        O1.I = true;
                        O1.draw(canvas2);
                        O1.I = false;
                        O1.setAlpha(nm7.d4);
                    }
                } else {
                    k47Var = k47Var3;
                    yv1Var = yv1Var3;
                }
                rc2Var = rc2Var3;
                if (k != null) {
                }
                O1.setAlpha((int) (f10 * 255.0f));
                O1.setBounds((int) backgroundDrawableLeft, (int) y5, L, (int) u);
                O1.I = true;
                O1.draw(canvas2);
                O1.I = false;
                O1.setAlpha(nm7.d4);
            } else {
                k47Var = k47Var3;
                yv1Var = yv1Var3;
                f14 = f9;
                rc2Var = rc2Var3;
            }
            canvas2.restore();
            canvas2.save();
            if (O1 != null) {
                if (k47Var.O3()) {
                    canvas2.clipRect(gm.L(4.0f) + backgroundDrawableLeft, gm.L(4.0f) + y5, L - gm.L(10.0f), u - gm.L(4.0f));
                } else {
                    canvas2.clipRect(gm.L(4.0f) + backgroundDrawableLeft, gm.L(4.0f) + y5, L - gm.L(4.0f), u - gm.L(4.0f));
                }
            }
            float x3 = (r59Var.getX() + rc2Var.getLeft()) - h22Var.getX();
            float A = td4.A(y3, f12, f52, f13);
            canvas2.translate(x3, A);
            rc2 rc2Var4 = rc2Var;
            rc2Var4.A1(f10, canvas2, false);
            rc2Var4.h1(canvas2, f10);
            rc2Var4.U0(canvas2, f10);
            rc2Var4.Q0(f10, canvas2, false);
            rc2Var4.q1(canvas2, f10, null);
            rc2Var4.V0(canvas2, f10);
            rc2Var4.e1(canvas2, f10);
            canvas2.restore();
            if (this.c) {
                yv1 yv1Var4 = yv1Var;
                ((ae2[]) yv1Var4.c0.b)[0].c.setAlpha(0.0f);
                ((ae2[]) yv1Var4.c0.b)[0].d.setAlpha(0.0f);
                int L2 = gm.L(10.0f);
                float x4 = this.e - h22Var.getX();
                float y6 = this.g - h22Var.getY();
                i2 = L;
                float f54 = f5 + rc2Var4.U7;
                f15 = backgroundDrawableLeft;
                float f55 = rc2Var4.V7 + f13;
                p99 p99Var = rc2Var4.p8;
                if (p99Var == null) {
                    p99Var = new p99(rc2Var4);
                    rc2Var4.p8 = p99Var;
                }
                p99Var.a(rc2Var4.getMessageObject(), rc2Var4.getCurrentUser(), rc2Var4.getCurrentChat(), this.O, 0);
                boolean O5 = k47Var.O5();
                f18 = f12;
                ylb ylbVar = this.O;
                if (O5) {
                    v0 = cmb.v0(cmb.Nd, ylbVar);
                    f37 = x4;
                    b(cmb.Ld);
                } else {
                    f37 = x4;
                    p99 p99Var2 = rc2Var4.p8;
                    if (p99Var2 != null) {
                        v0 = p99Var2.I.c;
                    } else if (k47Var.O3()) {
                        v0 = cmb.v0(cmb.Sb, ylbVar);
                        b(cmb.Qb);
                    } else {
                        v0 = cmb.v0(cmb.Md, ylbVar);
                        b(cmb.Kd);
                    }
                }
                if (k47Var.O5()) {
                    f17 = f52;
                    f19 = u;
                    k47Var2 = k47Var;
                    f16 = y5;
                    p99 p99Var3 = rc2Var4.p8;
                    if (p99Var3 != null) {
                        v02 = p99Var3.I.c;
                    } else {
                        if (k47Var2.B2()) {
                            k47 k47Var4 = k47Var2.C;
                            if (k47Var4.D == 0 || !TextUtils.isEmpty(k47Var4.z)) {
                                TLRPC.MessageMedia messageMedia = k47Var2.C.k.media;
                                if (!(messageMedia instanceof TLRPC.TL_messageMediaGame) && !(messageMedia instanceof TLRPC.TL_messageMediaInvoice)) {
                                    v02 = cmb.v0(cmb.Tb, ylbVar);
                                }
                            }
                        }
                        v02 = cmb.v0(cmb.Ub, ylbVar);
                    }
                } else if (!k47Var.O3()) {
                    f17 = f52;
                    f19 = u;
                    k47Var2 = k47Var;
                    f16 = y5;
                    if (!k47Var2.e4()) {
                        int v03 = cmb.v0(cmb.Od, ylbVar);
                        if (!k47Var2.l2) {
                            if (k47Var2.B2()) {
                                k47 k47Var5 = k47Var2.C;
                                if (k47Var5.D != 0) {
                                }
                                if (!(k47.n1(k47Var2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                                }
                            }
                            if (!rc2Var4.N7) {
                                v03 = cmb.v0(cmb.Pd, ylbVar);
                                f42 = 0.6f;
                                v02 = on2.f(f42, v03, cmb.b(v03, v0));
                            }
                        }
                        f42 = 0.0f;
                        v02 = on2.f(f42, v03, cmb.b(v03, v0));
                    }
                    v02 = v0;
                } else if (k47Var.e4()) {
                    f17 = f52;
                    f19 = u;
                    k47Var2 = k47Var;
                    f16 = y5;
                    v02 = v0;
                } else {
                    int v04 = cmb.v0(cmb.Tb, ylbVar);
                    k47Var2 = k47Var;
                    f16 = y5;
                    if (k47Var2.l2) {
                        f17 = f52;
                    } else {
                        if (k47Var2.B2()) {
                            k47 k47Var6 = k47Var2.C;
                            f17 = f52;
                            if (k47Var6.D != 0) {
                            }
                            if (!(k47.n1(k47Var2.C.k) instanceof TLRPC.TL_messageMediaGame)) {
                            }
                        } else {
                            f17 = f52;
                        }
                        if (!rc2Var4.N7) {
                            i8 = cmb.v0(cmb.Ub, ylbVar);
                            f43 = 0.6f;
                            f19 = u;
                            v02 = on2.f(f43, i8, cmb.b(i8, v0));
                        }
                    }
                    i8 = v04;
                    f43 = 0.0f;
                    f19 = u;
                    v02 = on2.f(f43, i8, cmb.b(i8, v0));
                }
                f21 = y3;
                f26 = f14;
                cmb.Y2.setColor(on2.f(f26, this.i, v02));
                cmb.X2.setColor(on2.f(f26, this.h, v0));
                float L3 = rc2Var4.d8 ? f37 - gm.L(44.0f) : f37;
                f25 = f53;
                float R1 = gm.R1(L3, f54, f25);
                float R12 = gm.R1((gm.L(12.0f) * f26) + y6, f55, f26);
                if (this.S == null) {
                    this.S = new float[]{r2, r2, 0.0f, 0.0f, 0.0f, 0.0f, r2, r2};
                    f38 = f54;
                    float L4 = gm.L(4.0f);
                    float[] fArr = this.S;
                    fArr[5] = 0.0f;
                    fArr[4] = 0.0f;
                    fArr[3] = 0.0f;
                    fArr[2] = 0.0f;
                } else {
                    f38 = f54;
                }
                RectF rectF2 = gm.P;
                rectF2.set(L3, y6, this.f + L3, gm.L(35.0f) + y6);
                rectF2.offset(0.0f, gm.L(12.0f) * f26);
                RectF rectF3 = rc2Var4.Ya;
                RectF rectF4 = this.R;
                rectF4.set(rectF3);
                rectF4.offset(f5, A);
                RectF rectF5 = this.Q;
                gm.X1(rectF2, rectF4, f25, rectF5);
                f20 = A;
                f24 = f51;
                k47 k47Var7 = k47Var2;
                float f56 = f10;
                rc2Var4.p8.e(canvas, rectF5, f56, rc2Var4.N7, rc2Var4.getMessageObject().O5());
                canvas2 = canvas;
                rc2Var4.p8.f(canvas2, rectF5, f56);
                if (rc2Var4.d8) {
                    canvas2.save();
                    float R13 = gm.R1(gm.L(35.0f), Math.min(rectF5.height() - gm.L(10.0f), cmb.Y2.getTextSize() + cmb.X2.getTextSize() + gm.L(rc2Var4.N7 ? f7 : 7.0f)), f25);
                    float R14 = gm.R1(R1, rectF5.left + gm.L(8.0f), f25);
                    float f57 = rectF5.top;
                    if (!rc2Var4.N7 || (staticLayout = rc2Var4.R7) == null) {
                        f39 = f56;
                    } else {
                        f39 = f56;
                        if (staticLayout.getLineCount() <= 1) {
                            i7 = 2;
                            float R15 = gm.R1(R12, f57 + gm.L(i7 + 5), f25);
                            ImageReceiver imageReceiver3 = imageReceiver;
                            imageReceiver3.i0(R14, R15, R13, R13);
                            imageReceiver3.h(canvas2, null);
                            canvas2.restore();
                            f40 = R13;
                        }
                    }
                    i7 = 0;
                    float R152 = gm.R1(R12, f57 + gm.L(i7 + 5), f25);
                    ImageReceiver imageReceiver32 = imageReceiver;
                    imageReceiver32.i0(R14, R152, R13, R13);
                    imageReceiver32.h(canvas2, null);
                    canvas2.restore();
                    f40 = R13;
                } else {
                    f39 = f56;
                    f40 = 0.0f;
                }
                canvas2.save();
                float f58 = L2 * f25;
                canvas2.translate(f58, 0.0f);
                float f59 = -(k47Var7.O5() ? gm.L(6.0f) : gm.L(1.0f));
                float L5 = k47Var7.O5() ? gm.L(1.0f) : gm.L(f7);
                float f60 = (f38 - rc2Var4.b8) + f59;
                float R16 = gm.R1(L3, (f38 - this.L) + f59, f25) + (rc2Var4.d8 ? gm.L(f7) + f40 : 0.0f);
                if (rc2Var4.Q7 != null) {
                    canvas2.save();
                    canvas2.translate(R16, (L5 * f25) + R12);
                    int alpha = cmb.X2.getAlpha();
                    cmb.X2.setAlpha((int) (alpha * f25));
                    rc2Var4.Q7.draw(canvas2);
                    cmb.X2.setAlpha(alpha);
                    lka lkaVar = ((ae2[]) yv1Var4.c0.b)[0].c;
                    f22 = f39;
                    yv1Var2 = yv1Var4;
                    rectF = rectF5;
                    f41 = f58;
                    canvas2.saveLayerAlpha(0.0f, 0.0f, lkaVar.getWidth(), lkaVar.getHeight(), (int) (f6 * 255.0f), 31);
                    lkaVar.setAlpha(1.0f);
                    lkaVar.draw(canvas2);
                    lkaVar.setAlpha(0.0f);
                    canvas2.restore();
                    canvas2.restore();
                } else {
                    rectF = rectF5;
                    yv1Var2 = yv1Var4;
                    f22 = f39;
                    f41 = f58;
                }
                if (rc2Var4.N7 && rc2Var4.J7 != null) {
                    if (rc2Var4.p8.h() != rc2Var4.G7) {
                        Drawable drawable = rc2Var4.J7;
                        int h = rc2Var4.p8.h();
                        rc2Var4.G7 = h;
                        drawable.setColorFilter(new PorterDuffColorFilter(h, PorterDuff.Mode.SRC_IN));
                    }
                    rc2Var4.J7.setBounds((int) (((rectF.right - f41) - gm.L((!rc2Var4.J ? 1 : 0) + 2)) - rc2Var4.J7.getIntrinsicWidth()), (int) (rectF.top + gm.L((!rc2Var4.J ? 1 : 0) + 2)), (int) ((rectF.right - f41) - gm.L((!rc2Var4.J ? 1 : 0) + 2)), (int) (rectF.top + gm.L((!rc2Var4.J ? 1 : 0) + 2) + rc2Var4.J7.getIntrinsicHeight()));
                    rc2Var4.J7.setAlpha((int) (f25 * 255.0f));
                    rc2Var4.J7.draw(canvas2);
                }
                if (rc2Var4.R7 != null) {
                    canvas2.save();
                    float R17 = gm.R1(gm.L(19.0f), cmb.X2.getTextSize() + gm.L(4.0f) + L5, f25) + R12;
                    if (rc2Var4.N7 && rc2Var4.d8) {
                        f60 -= gm.L(f8);
                    }
                    if (rc2Var4.d8 && (!rc2Var4.N7 || rc2Var4.c8)) {
                        f60 = f40 + gm.L(f7) + f60;
                    }
                    float f61 = f60;
                    if (rc2Var4.O7 && rc2Var4.P7 != null) {
                        float R18 = gm.R1(L3 - rc2Var4.b8, f61, f25);
                        rc2Var4.P7.e((int) R18, gm.L(f8) + ((int) R17), gm.L(12.0f), gm.L(12.0f));
                        cmb.W1.setColor(cmb.v0(k47Var7.O3() ? cmb.Jb : cmb.qd, ylbVar));
                        canvas2.drawCircle(R18 + gm.L(6.0f), gm.L(8.0f) + R17, gm.L(5.0f), cmb.W1);
                        rc2Var4.P7.h(-1, k47Var7.O3() ? cmb.pc : cmb.ne, cmb.j7);
                        CheckBoxBase checkBoxBase = rc2Var4.P7;
                        if (checkBoxBase.h != f26) {
                            checkBoxBase.h = f26;
                            checkBoxBase.b();
                        }
                        rc2Var4.P7.a(canvas2);
                    }
                    if (rc2Var4.O7) {
                        f61 += gm.L(16.0f);
                    }
                    if (rc2Var4.c8 && rc2Var4.b8 > 0) {
                        f61 = ((rectF.right - gm.L(8.0f)) - rc2Var4.R7.getWidth()) - f41;
                    }
                    canvas2.translate(gm.R1(L3 - rc2Var4.b8, f61, f25), R17);
                    canvas2.save();
                    ArrayList arrayList3 = arrayList;
                    rna.d(canvas2, arrayList3);
                    pjbVar = this;
                    f23 = f4;
                    gn.drawAnimatedEmojis(canvas2, rc2Var4.R7, rc2Var4.Na, 0.0f, arrayList3, 0.0f, 0.0f, 0.0f, 1.0f);
                    rc2Var4.R7.draw(canvas2);
                    canvas2.restore();
                    int size = arrayList3.size();
                    int i9 = 0;
                    while (i9 < size) {
                        Object obj = arrayList3.get(i9);
                        i9++;
                        rna rnaVar = (rna) obj;
                        boolean z4 = rnaVar.p;
                        rnaVar.p = false;
                        if (z4) {
                            rnaVar.h(rc2Var4.R7.getPaint().getColor());
                        }
                        rnaVar.draw(canvas2);
                    }
                    canvas2.restore();
                } else {
                    pjbVar = this;
                    f23 = f4;
                }
                canvas2.restore();
            } else {
                i2 = L;
                f15 = backgroundDrawableLeft;
                f16 = y5;
                f17 = f52;
                f18 = f12;
                pjbVar = this;
                f19 = u;
                f20 = A;
                f21 = y3;
                f22 = f10;
                f23 = f4;
                f24 = f51;
                f25 = f53;
                yv1Var2 = yv1Var;
                f26 = f14;
            }
            canvas2.save();
            if (rc2Var4.getMessageObject() == null || rc2Var4.getMessageObject().D != 19) {
                canvas2.clipRect(f15 + gm.L(4.0f), f16 + gm.L(4.0f), i2 - gm.L(4.0f), f19 - gm.L(4.0f));
            }
            float f62 = (pjbVar.D * f6) + f25;
            canvas2.save();
            float f63 = f3 * f6;
            float A2 = td4.A(f23, f24, f25, f63);
            float f64 = f21 * f17;
            ArrayList arrayList4 = rc2Var4.getMessageObject().B2;
            h47 h47Var2 = pjbVar.F;
            yc2 yc2Var4 = yc2Var;
            canvas2.translate(A2, ((h47Var2.p(arrayList4, yc2Var4) + f18) * f26) + f64);
            float f65 = f62 * 1.0f;
            canvas2.scale(f62, f65, 0.0f, 0.0f);
            int i10 = pjbVar.M;
            boolean z5 = pjbVar.p;
            int i11 = pjbVar.N;
            boolean z6 = pjbVar.n;
            StaticLayout staticLayout2 = pjbVar.q;
            if (!z6) {
                f27 = f65;
                i3 = i10;
                yc2Var2 = yc2Var4;
                z = z5;
                i4 = i11;
                z2 = z6;
                f28 = f26;
                rc2Var2 = rc2Var4;
                f29 = f;
                f30 = f22;
                f31 = f63;
                f32 = f62;
                h47Var = h47Var2;
                staticLayout2.draw(canvas2);
                gn.drawAnimatedEmojis(canvas2, pjbVar.q, pjbVar.I, 0.0f, null, 0.0f, 0.0f, 0.0f, 1.0f);
            } else if (z5) {
                int color = staticLayout2.getPaint().getColor();
                float f66 = f22;
                staticLayout2.getPaint().setColor(on2.f(f66, i10, i11));
                z2 = z6;
                z = z5;
                yc2Var2 = yc2Var4;
                i4 = i11;
                f27 = f65;
                i3 = i10;
                canvas.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f * 255.0f), 31);
                staticLayout2.draw(canvas);
                h47Var = h47Var2;
                float f67 = f;
                f32 = f62;
                f28 = f26;
                rc2Var2 = rc2Var4;
                f31 = f63;
                f30 = f66;
                gn.drawAnimatedEmojis(canvas, pjbVar.q, pjbVar.I, 0.0f, null, 0.0f, 0.0f, 0.0f, f67);
                staticLayout2.getPaint().setColor(color);
                canvas.restore();
                canvas2 = canvas;
                f29 = f67;
            } else {
                h47Var = h47Var2;
                float f68 = f;
                f32 = f62;
                f27 = f65;
                i3 = i10;
                yc2Var2 = yc2Var4;
                z = z5;
                i4 = i11;
                z2 = z6;
                f28 = f26;
                rc2Var2 = rc2Var4;
                f30 = f22;
                f31 = f63;
                canvas2 = canvas;
                canvas2.saveLayerAlpha(0.0f, 0.0f, staticLayout2.getWidth(), staticLayout2.getHeight(), (int) (f68 * 255.0f), 31);
                staticLayout2.draw(canvas2);
                gn.drawAnimatedEmojis(canvas2, pjbVar.q, pjbVar.I, 0.0f, null, 0.0f, 0.0f, 0.0f, f68);
                f29 = f68;
                canvas2.restore();
            }
            canvas2.restore();
            StaticLayout staticLayout3 = pjbVar.r;
            if (staticLayout3 != null) {
                canvas2.save();
                canvas2.translate(td4.A(f23, pjbVar.m, f25, f31), ((h47Var.p(rc2Var2.getMessageObject().B2, yc2Var2) + f18) * f28) + f64);
                f33 = f32;
                f34 = f27;
                canvas2.scale(f33, f34, 0.0f, 0.0f);
                if (!z2) {
                    i5 = i4;
                    staticLayout3.draw(canvas2);
                } else if (z) {
                    int color2 = staticLayout3.getPaint().getColor();
                    i5 = i4;
                    staticLayout3.getPaint().setColor(on2.p(on2.f(f30, i3, i5), (int) (Color.alpha(color2) * f29)));
                    staticLayout3.draw(canvas2);
                    staticLayout3.getPaint().setColor(color2);
                } else {
                    i5 = i4;
                    int alpha2 = staticLayout3.getPaint().getAlpha();
                    staticLayout3.getPaint().setAlpha((int) (alpha2 * f29));
                    staticLayout3.draw(canvas2);
                    staticLayout3.getPaint().setAlpha(alpha2);
                }
                canvas2.restore();
            } else {
                f33 = f32;
                f34 = f27;
                i5 = i4;
            }
            if (z2) {
                canvas2.save();
                canvas2.translate(td4.A(f3, f23, f6, (r59Var.getX() + rc2Var2.getLeft()) - h22Var.getX()), f20);
                canvas2.scale(f33, f34, rc2Var2.getTextX(), rc2Var2.getTextY());
                canvas2.translate(0.0f, -0.0f);
                int color3 = cmb.n2.getColor();
                cmb.n2.setColor(i5);
                ArrayList arrayList5 = rc2Var2.getMessageObject().B2;
                rc2 rc2Var5 = rc2Var2;
                float f69 = rc2Var5.u0;
                yc2 yc2Var5 = rc2Var5.ub;
                if (yc2Var5.m2) {
                    float f70 = yc2Var5.o2;
                    float f71 = yc2Var5.L1;
                    f36 = 1.0f;
                    f69 = (f69 * f71) + ((1.0f - f71) * f70);
                } else {
                    f36 = 1.0f;
                }
                float f72 = f69;
                float f73 = rc2Var5.o0;
                k47 k47Var8 = rc2Var5.Q5;
                f35 = 0.0f;
                float f74 = f2;
                Canvas canvas3 = canvas2;
                i6 = i;
                rc2Var5.f1(f73, f72, canvas3, arrayList5, k47Var8 == null ? 0.0f : k47Var8.x2, true, f74, false, true, false, false);
                canvas2 = canvas3;
                rc2Var5.J0(canvas2, f74);
                if (cmb.n2.getColor() != color3) {
                    cmb.n2.setColor(color3);
                }
                canvas2.restore();
            } else {
                i6 = i;
                f35 = 0.0f;
                f36 = 1.0f;
            }
            canvas2.restore();
            if (z3) {
                float f75 = i6;
                Matrix matrix = pjbVar.v;
                matrix.setTranslate(f35, f75);
                pjbVar.C.setLocalMatrix(matrix);
                canvas2.drawRect(0.0f, f75, h22Var.getMeasuredWidth(), h22Var.getMeasuredHeight(), pjbVar.w);
                canvas2.restore();
            }
            float f76 = pjbVar.a;
            float f77 = f76 > 0.4f ? f36 : f76 / 0.4f;
            ms1 ms1Var = pjbVar.H;
            if (f77 == f36) {
                ms1Var.setTextTransitionIsRunning(false);
            }
            if (ms1Var.getSendButton().getVisibility() != 0 || f77 >= f36) {
                return;
            }
            View sendButton = ms1Var.getSendButton();
            mu1 mu1Var = yv1Var2.m1;
            PointF pointF = pjbVar.P;
            zgc.b(sendButton, mu1Var, pointF);
            canvas2.save();
            canvas2.translate(pointF.x - h22Var.getX(), pointF.y - h22Var.getY());
            View sendButton2 = ms1Var.getSendButton();
            canvas.saveLayerAlpha(0.0f, 0.0f, sendButton2.getWidth(), sendButton2.getHeight(), (int) ((f36 - f77) * 255.0f));
            sendButton2.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.restore();
        }
    }

    public final int b(int i) {
        return cmb.v0(i, this.O);
    }
}
