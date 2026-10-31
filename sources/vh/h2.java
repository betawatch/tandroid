package vh;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.provider.MediaStore;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.ef;
import org.telegram.messenger.z20;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.gr;
import org.telegram.ui.yv0;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class h2 extends FrameLayout {
    public static int d0;
    public float D;
    public float E;
    public StaticLayout F;
    public float G;
    public float H;
    public final FrameLayout I;
    public final org.telegram.ui.Cells.n2 J;
    public final float K;
    public final boolean L;
    public f2 M;
    public f2 N;
    public String O;
    public final d0 P;
    public org.telegram.messenger.s5 Q;
    public String R;
    public Object S;
    public rh.l5 T;
    public boolean U;
    public boolean V;
    public final Path W;
    public Bitmap a;
    public final float[] a0;
    public final Paint b;
    public final Paint b0;
    public final Paint c;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f;
    public final Matrix h;
    public final Paint n;
    public final TextPaint r;
    public final TextPaint s;
    public final Drawable w;
    public boolean x;
    public StaticLayout y;
    public static final ArrayList c0 = new ArrayList();
    public static final HashMap e0 = new HashMap();
    public static final vg.h f0 = new vg.h(45, 1);

    public h2(Context context, org.telegram.ui.ActionBar.p6 p6Var, float f7, boolean z10) {
        super(context);
        this.b = new Paint(3);
        Paint paint = new Paint(1);
        this.c = paint;
        this.d = new Paint(1);
        this.f = new Matrix();
        this.h = new Matrix();
        Paint paint2 = new Paint(1);
        this.n = paint2;
        TextPaint textPaint = new TextPaint(1);
        this.r = textPaint;
        TextPaint textPaint2 = new TextPaint(1);
        this.s = textPaint2;
        this.P = new d0(this, 8);
        this.W = new Path();
        this.a0 = new float[8];
        this.b0 = new Paint(1);
        this.K = f7;
        this.L = z10;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(org.telegram.messenger.i0.o());
        textPaint.setTextSize(org.telegram.messenger.i0.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(org.telegram.messenger.i0.L(11.33f));
        textPaint2.setColor(-1);
        this.w = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        org.telegram.ui.Cells.n2 n2Var = new org.telegram.ui.Cells.n2(this, context, p6Var);
        this.J = n2Var;
        if (z10) {
            n2Var.setDrawBackgroundAsArc(7);
        } else {
            n2Var.setDrawBackgroundAsArc(6);
        }
        n2Var.b(org.telegram.ui.ActionBar.t6.W9, org.telegram.ui.ActionBar.t6.X9, org.telegram.ui.ActionBar.t6.V9);
        CheckBoxBase checkBoxBase = n2Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.t6.G6;
        if (checkBoxBase.u != i10) {
            checkBoxBase.u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.I = frameLayout;
        frameLayout.addView(n2Var, w7.b6.e(26, 26, 17));
        addView(frameLayout, w7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        n2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = e0;
        Integer num = (Integer) hashMap.get(str);
        if (num != null) {
            int intValue = num.intValue() - 1;
            Integer valueOf = Integer.valueOf(intValue);
            if (intValue <= 0) {
                hashMap.remove(str);
            } else {
                hashMap.put(str, valueOf);
            }
        }
    }

    public final org.telegram.messenger.s5 a() {
        org.telegram.messenger.s5 s5Var = this.Q;
        if (s5Var != null) {
            return s5Var;
        }
        ArrayList arrayList = c0;
        if (arrayList.size() < 4) {
            org.telegram.messenger.s5 s5Var2 = new org.telegram.messenger.s5("gallery_load_" + arrayList.size(), true);
            this.Q = s5Var2;
            arrayList.add(s5Var2);
        } else {
            int i10 = d0 + 1;
            d0 = i10;
            if (i10 >= arrayList.size()) {
                d0 = 0;
            }
            this.Q = (org.telegram.messenger.s5) arrayList.get(d0);
        }
        return this.Q;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.R);
            this.R = null;
            this.a = null;
            invalidate();
            return;
        }
        boolean z10 = obj instanceof ef;
        if (z10) {
            ef efVar = (ef) obj;
            str = efVar.c;
            if (str == null) {
                if (!efVar.b || efVar.d()) {
                    str = efVar.I;
                } else {
                    str = "" + efVar.C;
                }
            }
        } else if (obj instanceof n5) {
            str = "d" + ((n5) obj).b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.R)) {
            return;
        }
        String str2 = this.R;
        if (str2 != null) {
            this.a = null;
            d(str2);
            invalidate();
        }
        this.R = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z10) {
            ef efVar2 = (ef) obj;
            if (efVar2.T != 0 && efVar2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{efVar2.T, efVar2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) f0.get(str);
            if (bitmap != null) {
                HashMap hashMap = e0;
                Integer num = (Integer) hashMap.get(str);
                hashMap.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
        this.a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.T != null) {
            a().cancelRunnable(this.T);
            this.T = null;
        }
        org.telegram.messenger.s5 a2 = a();
        rh.l5 l5Var = new rh.l5(this, obj, str, 12);
        this.T = l5Var;
        a2.postRunnable(l5Var);
    }

    public final Bitmap c(ef efVar, BitmapFactory.Options options) {
        if (efVar == null) {
            return null;
        }
        int i10 = efVar.C;
        String str = efVar.c;
        return str != null ? BitmapFactory.decodeFile(str, options) : (!efVar.b || efVar.d()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i10, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i10, 1, options);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z10;
        Canvas canvas2;
        boolean z11 = true;
        if (this.U || this.V) {
            canvas.save();
            Path path = this.W;
            path.rewind();
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float L = this.U ? org.telegram.messenger.i0.L(6.0f) : 0.0f;
            float[] fArr = this.a0;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = this.V ? org.telegram.messenger.i0.L(6.0f) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z10 = true;
        } else {
            z10 = false;
        }
        float progress = this.J.getProgress() * org.telegram.messenger.i0.L(12.66f);
        if (progress > 0.0f) {
            if (!z10) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.b0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z11 = z10;
        }
        canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.c);
        if (this.e != null) {
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getWidth(), getHeight(), this.d);
        } else {
            canvas2 = canvas;
        }
        Bitmap bitmap = this.a;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas2.drawBitmap(this.a, this.f, this.b);
        }
        StaticLayout staticLayout = this.F;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(10.0f) + this.G + org.telegram.messenger.i0.L(6.0f), org.telegram.messenger.i0.L(2.0f) + this.F.getHeight() + org.telegram.messenger.i0.L(5.0f));
            canvas2.drawRoundRect(rectF2, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + org.telegram.messenger.i0.L(6.0f)) - this.H, rectF2.top + org.telegram.messenger.i0.L(1.33f));
            this.F.draw(canvas2);
            canvas2.restore();
        }
        if (this.y != null) {
            RectF rectF3 = org.telegram.messenger.i0.P;
            rectF3.set(org.telegram.messenger.i0.L(4.0f), ((getHeight() - org.telegram.messenger.i0.L(4.0f)) - this.y.getHeight()) - org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(4.0f) + (this.x ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(4.0f)) + this.D + org.telegram.messenger.i0.L(5.0f), getHeight() - org.telegram.messenger.i0.L(4.0f));
            canvas2.drawRoundRect(rectF3, org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(10.0f), paint2);
            if (this.x) {
                int L3 = (int) (rectF3.left + org.telegram.messenger.i0.L(6.0f));
                int centerY = (int) (rectF3.centerY() - (org.telegram.messenger.i0.L(8.0f) / 2));
                int L4 = (int) (rectF3.left + org.telegram.messenger.i0.L(13.0f));
                int centerY2 = (int) (rectF3.centerY() + (org.telegram.messenger.i0.L(8.0f) / 2));
                Drawable drawable = this.w;
                drawable.setBounds(L3, centerY, L4, centerY2);
                drawable.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate((rectF3.left + (this.x ? org.telegram.messenger.i0.L(16.0f) : org.telegram.messenger.i0.L(5.0f))) - this.E, rectF3.top + org.telegram.messenger.i0.L(1.0f));
            this.y.draw(canvas2);
            canvas2.restore();
        }
        if (z11) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, n5 n5Var) {
        this.S = n5Var;
        if (i10 > 0) {
            this.F = null;
            g(cd.G(i10, "StoryDrafts", new Object[0]));
            this.x = false;
            this.O = cd.G(i10, "StoryDrafts", new Object[0]);
        } else {
            if (n5Var != null && n5Var.c) {
                StaticLayout staticLayout = new StaticLayout(cd.M0("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.i0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.F = staticLayout;
                this.G = staticLayout.getLineCount() > 0 ? this.F.getLineWidth(0) : 0.0f;
                this.H = this.F.getLineCount() > 0 ? this.F.getLineLeft(0) : 0.0f;
            } else {
                this.F = null;
            }
            g((n5Var == null || !n5Var.K) ? null : org.telegram.messenger.i0.g0((int) Math.max(0.0f, ((n5Var.a0 - n5Var.Z) * n5Var.h0) / 1000.0f), false, false));
            if (n5Var == null || !n5Var.K) {
                this.O = cd.L0(2131744700, null);
            } else {
                this.O = cd.L0(2131744700, null) + ", " + cd.z((int) Math.max(0.0f, ((n5Var.a0 - n5Var.Z) * n5Var.h0) / 1000.0f));
            }
        }
        b(n5Var);
    }

    public final void f(int i10, boolean z10, boolean z11) {
        if (this.L) {
            z10 = true;
        }
        FrameLayout frameLayout = this.I;
        org.telegram.ui.Cells.n2 n2Var = this.J;
        if (z11) {
            frameLayout.setVisibility(0);
            z20.m(n2Var.animate().alpha(z10 ? 1.0f : 0.0f).scaleX(z10 ? 1.0f : 0.7f).scaleY(z10 ? 1.0f : 0.7f).withEndAction(new yv0(10, this, z10)), gr.h, 320L);
        } else {
            frameLayout.setVisibility(z10 ? 0 : 8);
        }
        if (i10 < 0) {
            n2Var.a(false, z11);
        } else {
            n2Var.a(true, z11);
            n2Var.setNum(i10);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.y = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : org.telegram.messenger.i0.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.y = staticLayout;
            this.D = staticLayout.getLineCount() > 0 ? this.y.getLineWidth(0) : 0.0f;
            this.E = this.y.getLineCount() > 0 ? this.y.getLineLeft(0) : 0.0f;
        }
        this.x = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            float max = ((float) bitmap.getHeight()) / ((float) this.a.getWidth()) > this.K - 0.1f ? Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight()) : getMeasuredWidth() / this.a.getWidth();
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(c3.i0.g(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), c3.i0.g(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
        }
        if (getMeasuredHeight() > 0) {
            Matrix matrix2 = this.h;
            matrix2.reset();
            matrix2.postScale(1.0f, getMeasuredHeight());
            LinearGradient linearGradient = this.e;
            if (linearGradient != null) {
                linearGradient.setLocalMatrix(matrix2);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        org.telegram.messenger.i0.r(this.P);
        Object obj = this.S;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.i0.h3(this.P, 250L);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.I;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        } else {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            org.telegram.ui.Cells.n2 n2Var = this.J;
            accessibilityNodeInfo.setChecked(n2Var != null && n2Var.a.q);
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.N != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.O;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * this.K), TLObject.FLAG_30));
        h();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        f2 f2Var;
        f2 f2Var2;
        if (i10 == 16 && (f2Var2 = this.M) != null) {
            f2Var2.run();
            return true;
        }
        if (i10 != 32 || (f2Var = this.N) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        f2Var.run();
        return true;
    }
}
