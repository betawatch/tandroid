// default package

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
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class pt4 extends FrameLayout {
    public static int e0;
    public float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final FrameLayout J;
    public final ya K;
    public final float L;
    public final boolean M;
    public mt4 N;
    public mt4 O;
    public String P;
    public final qn4 Q;
    public np3 R;
    public String S;
    public Object T;
    public if4 U;
    public boolean V;
    public boolean W;
    public Bitmap a;
    public final Path a0;
    public final Paint b;
    public final float[] b0;
    public final Paint c;
    public final Paint c0;
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
    public static final ArrayList d0 = new ArrayList();
    public static final HashMap f0 = new HashMap();
    public static final ot4 g0 = new ot4(45, (byte) 0);

    public pt4(Context context, r63 r63Var, float f, boolean z) {
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
        this.Q = new qn4(this, (byte) 2);
        this.a0 = new Path();
        this.b0 = new float[8];
        this.c0 = new Paint(1);
        this.L = f;
        this.M = z;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(gm.o());
        textPaint.setTextSize(gm.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(gm.L(11.33f));
        textPaint2.setColor(-1);
        this.w = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        ya yaVar = new ya(this, context, r63Var);
        this.K = yaVar;
        if (z) {
            yaVar.setDrawBackgroundAsArc(7);
        } else {
            yaVar.setDrawBackgroundAsArc(6);
        }
        yaVar.b(cmb.V9, cmb.W9, cmb.U9);
        CheckBoxBase checkBoxBase = yaVar.getCheckBoxBase();
        int i = cmb.F6;
        if (checkBoxBase.u != i) {
            checkBoxBase.u = i;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(yaVar, qoe.e(26, 26, 17));
        addView(frameLayout, qoe.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        yaVar.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str != null) {
            HashMap hashMap = f0;
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
    }

    public final np3 a() {
        np3 np3Var = this.R;
        if (np3Var != null) {
            return np3Var;
        }
        ArrayList arrayList = d0;
        if (arrayList.size() < 4) {
            np3 np3Var2 = new np3("gallery_load_" + arrayList.size(), true);
            this.R = np3Var2;
            arrayList.add(np3Var2);
        } else {
            int i = e0 + 1;
            e0 = i;
            if (i >= arrayList.size()) {
                e0 = 0;
            }
            this.R = (np3) arrayList.get(e0);
        }
        return this.R;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.S);
            this.S = null;
            this.a = null;
            invalidate();
            return;
        }
        boolean z = obj instanceof jo6;
        if (z) {
            jo6 jo6Var = (jo6) obj;
            str = jo6Var.c;
            if (str == null) {
                str = (!jo6Var.b || jo6Var.d()) ? jo6Var.I : String.valueOf(jo6Var.C);
            }
        } else if (obj instanceof g6b) {
            str = "d" + ((g6b) obj).b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.S)) {
            return;
        }
        String str2 = this.S;
        if (str2 != null) {
            this.a = null;
            d(str2);
            invalidate();
        }
        this.S = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z) {
            jo6 jo6Var2 = (jo6) obj;
            if (jo6Var2.T != 0 && jo6Var2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{jo6Var2.T, jo6Var2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) g0.get(str);
            if (bitmap != null) {
                HashMap hashMap = f0;
                Integer num = (Integer) hashMap.get(str);
                hashMap.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
        this.a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.U != null) {
            a().cancelRunnable(this.U);
            this.U = null;
        }
        np3 a = a();
        if4 if4Var = new if4((Object) this, obj, (Object) str, (byte) 5);
        this.U = if4Var;
        a.postRunnable(if4Var);
    }

    public final Bitmap c(jo6 jo6Var, BitmapFactory.Options options) {
        if (jo6Var == null) {
            return null;
        }
        int i = jo6Var.C;
        String str = jo6Var.c;
        return str != null ? BitmapFactory.decodeFile(str, options) : (!jo6Var.b || jo6Var.d()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i, 1, options);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z;
        Canvas canvas2;
        boolean z2 = true;
        if (this.V || this.W) {
            canvas.save();
            Path path = this.a0;
            path.rewind();
            RectF rectF = gm.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float L = this.V ? gm.L(6.0f) : 0.0f;
            float[] fArr = this.b0;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = this.W ? gm.L(6.0f) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z = true;
        } else {
            z = false;
        }
        float progress = this.K.getProgress() * gm.L(12.66f);
        if (progress > 0.0f) {
            if (!z) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.c0;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z2 = z;
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
        StaticLayout staticLayout = this.G;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = gm.P;
            rectF2.set(gm.L(4.0f), gm.L(4.0f), gm.L(10.0f) + this.H + gm.L(6.0f), gm.L(2.0f) + this.G.getHeight() + gm.L(5.0f));
            canvas2.drawRoundRect(rectF2, gm.L(10.0f), gm.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + gm.L(6.0f)) - this.I, rectF2.top + gm.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.y != null) {
            RectF rectF3 = gm.P;
            rectF3.set(gm.L(4.0f), ((getHeight() - gm.L(4.0f)) - this.y.getHeight()) - gm.L(2.0f), gm.L(4.0f) + (this.x ? gm.L(16.0f) : gm.L(4.0f)) + this.E + gm.L(5.0f), getHeight() - gm.L(4.0f));
            canvas2.drawRoundRect(rectF3, gm.L(10.0f), gm.L(10.0f), paint2);
            if (this.x) {
                int L3 = (int) (rectF3.left + gm.L(6.0f));
                int centerY = (int) (rectF3.centerY() - (gm.L(8.0f) / 2));
                int L4 = (int) (rectF3.left + gm.L(13.0f));
                int centerY2 = (int) (rectF3.centerY() + (gm.L(8.0f) / 2));
                Drawable drawable = this.w;
                drawable.setBounds(L3, centerY, L4, centerY2);
                drawable.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate((rectF3.left + (this.x ? gm.L(16.0f) : gm.L(5.0f))) - this.F, rectF3.top + gm.L(1.0f));
            this.y.draw(canvas2);
            canvas2.restore();
        }
        if (z2) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i, g6b g6bVar) {
        this.T = g6bVar;
        if (i > 0) {
            this.G = null;
            g(jb6.G(i, "StoryDrafts", new Object[0]));
            this.x = false;
            this.P = jb6.G(i, "StoryDrafts", new Object[0]);
        } else {
            if (g6bVar != null && g6bVar.c) {
                StaticLayout staticLayout = new StaticLayout(jb6.N0("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.G = staticLayout;
                this.H = staticLayout.getLineCount() > 0 ? this.G.getLineWidth(0) : 0.0f;
                this.I = this.G.getLineCount() > 0 ? this.G.getLineLeft(0) : 0.0f;
            } else {
                this.G = null;
            }
            g((g6bVar == null || !g6bVar.K) ? null : gm.g0((int) Math.max(0.0f, ((g6bVar.a0 - g6bVar.Z) * g6bVar.h0) / 1000.0f), false, false));
            if (g6bVar == null || !g6bVar.K) {
                this.P = jb6.M0(2131744368, null);
            } else {
                this.P = jb6.M0(2131744368, null) + ", " + jb6.z((int) Math.max(0.0f, ((g6bVar.a0 - g6bVar.Z) * g6bVar.h0) / 1000.0f));
            }
        }
        b(g6bVar);
    }

    public final void f(int i, boolean z, boolean z2) {
        if (this.M) {
            z = true;
        }
        ya yaVar = this.K;
        FrameLayout frameLayout = this.J;
        if (z2) {
            frameLayout.setVisibility(0);
            wi8.t(yaVar.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).withEndAction(new y8c((byte) 21, this, z)), d53.h, 320L);
        } else {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (i < 0) {
            yaVar.a(false, z2);
        } else {
            yaVar.a(true, z2);
            yaVar.setNum(i);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.y = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : gm.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.y = staticLayout;
            this.E = staticLayout.getLineCount() > 0 ? this.y.getLineWidth(0) : 0.0f;
            this.F = this.y.getLineCount() > 0 ? this.y.getLineLeft(0) : 0.0f;
        }
        this.x = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            float max = ((float) bitmap.getHeight()) / ((float) this.a.getWidth()) > this.L - 0.1f ? Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight()) : getMeasuredWidth() / this.a.getWidth();
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(b10.b(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), b10.b(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
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
        gm.r(this.Q);
        Object obj = this.T;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        gm.d3(this.Q, 250L);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.J;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        } else {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            ya yaVar = this.K;
            accessibilityNodeInfo.setChecked(yaVar != null && yaVar.a.q);
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.O != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.P;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * this.L), TLObject.FLAG_30));
        h();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        mt4 mt4Var;
        mt4 mt4Var2;
        if (i == 16 && (mt4Var2 = this.N) != null) {
            mt4Var2.run();
            return true;
        }
        if (i != 32 || (mt4Var = this.O) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        mt4Var.run();
        return true;
    }
}
