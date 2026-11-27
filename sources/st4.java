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

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class st4 extends FrameLayout {
    public static int e0;
    public float E;
    public float F;
    public StaticLayout G;
    public float H;
    public float I;
    public final FrameLayout J;
    public final za K;
    public final float L;
    public final boolean M;
    public pt4 N;
    public pt4 O;
    public String P;
    public final rj4 Q;
    public uo3 R;
    public String S;
    public Object T;
    public re4 U;
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
    public static final rt4 g0 = new rt4(45, (byte) 0);

    public st4(Context context, x53 x53Var, float f, boolean z) {
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
        this.Q = new rj4(this, (byte) 9);
        this.a0 = new Path();
        this.b0 = new float[8];
        this.c0 = new Paint(1);
        this.L = f;
        this.M = z;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(hl.o());
        textPaint.setTextSize(hl.N(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(hl.L(11.33f));
        textPaint2.setColor(-1);
        this.w = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        za zaVar = new za(this, context, x53Var);
        this.K = zaVar;
        if (z) {
            zaVar.setDrawBackgroundAsArc(7);
        } else {
            zaVar.setDrawBackgroundAsArc(6);
        }
        zaVar.b(aob.W9, aob.X9, aob.V9);
        CheckBoxBase checkBoxBase = zaVar.getCheckBoxBase();
        int i = aob.G6;
        if (checkBoxBase.u != i) {
            checkBoxBase.u = i;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.J = frameLayout;
        frameLayout.addView(zaVar, tre.e(26, 26, 17));
        addView(frameLayout, tre.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        zaVar.setImportantForAccessibility(2);
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

    public final uo3 a() {
        uo3 uo3Var = this.R;
        if (uo3Var != null) {
            return uo3Var;
        }
        ArrayList arrayList = d0;
        if (arrayList.size() < 4) {
            uo3 uo3Var2 = new uo3("gallery_load_" + arrayList.size(), true);
            this.R = uo3Var2;
            arrayList.add(uo3Var2);
        } else {
            int i = e0 + 1;
            e0 = i;
            if (i >= arrayList.size()) {
                e0 = 0;
            }
            this.R = (uo3) arrayList.get(e0);
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
        boolean z = obj instanceof no6;
        if (z) {
            no6 no6Var = (no6) obj;
            str = no6Var.c;
            if (str == null) {
                str = (!no6Var.b || no6Var.d()) ? no6Var.I : String.valueOf(no6Var.C);
            }
        } else if (obj instanceof c8b) {
            str = "d" + ((c8b) obj).b;
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
            no6 no6Var2 = (no6) obj;
            if (no6Var2.T != 0 && no6Var2.U != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{no6Var2.T, no6Var2.U}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
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
        uo3 a = a();
        re4 re4Var = new re4((Object) this, obj, (Object) str, (byte) 7);
        this.U = re4Var;
        a.postRunnable(re4Var);
    }

    public final Bitmap c(no6 no6Var, BitmapFactory.Options options) {
        if (no6Var == null) {
            return null;
        }
        int i = no6Var.C;
        String str = no6Var.c;
        return str != null ? BitmapFactory.decodeFile(str, options) : (!no6Var.b || no6Var.d()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), i, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), i, 1, options);
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
            RectF rectF = hl.P;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float L = this.V ? hl.L(6.0f) : 0.0f;
            float[] fArr = this.b0;
            fArr[1] = L;
            fArr[0] = L;
            float L2 = this.W ? hl.L(6.0f) : 0.0f;
            fArr[3] = L2;
            fArr[2] = L2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z = true;
        } else {
            z = false;
        }
        float progress = this.K.getProgress() * hl.L(12.66f);
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
            RectF rectF2 = hl.P;
            rectF2.set(hl.L(4.0f), hl.L(4.0f), hl.L(10.0f) + this.H + hl.L(6.0f), hl.L(2.0f) + this.G.getHeight() + hl.L(5.0f));
            canvas2.drawRoundRect(rectF2, hl.L(10.0f), hl.L(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + hl.L(6.0f)) - this.I, rectF2.top + hl.L(1.33f));
            this.G.draw(canvas2);
            canvas2.restore();
        }
        if (this.y != null) {
            RectF rectF3 = hl.P;
            rectF3.set(hl.L(4.0f), ((getHeight() - hl.L(4.0f)) - this.y.getHeight()) - hl.L(2.0f), hl.L(4.0f) + (this.x ? hl.L(16.0f) : hl.L(4.0f)) + this.E + hl.L(5.0f), getHeight() - hl.L(4.0f));
            canvas2.drawRoundRect(rectF3, hl.L(10.0f), hl.L(10.0f), paint2);
            if (this.x) {
                int L3 = (int) (rectF3.left + hl.L(6.0f));
                int centerY = (int) (rectF3.centerY() - (hl.L(8.0f) / 2));
                int L4 = (int) (rectF3.left + hl.L(13.0f));
                int centerY2 = (int) (rectF3.centerY() + (hl.L(8.0f) / 2));
                Drawable drawable = this.w;
                drawable.setBounds(L3, centerY, L4, centerY2);
                drawable.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate((rectF3.left + (this.x ? hl.L(16.0f) : hl.L(5.0f))) - this.F, rectF3.top + hl.L(1.0f));
            this.y.draw(canvas2);
            canvas2.restore();
        }
        if (z2) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i, c8b c8bVar) {
        this.T = c8bVar;
        if (i > 0) {
            this.G = null;
            g(ob6.G(i, "StoryDrafts", new Object[0]));
            this.x = false;
            this.P = ob6.G(i, "StoryDrafts", new Object[0]);
        } else {
            if (c8bVar != null && c8bVar.c) {
                StaticLayout staticLayout = new StaticLayout(ob6.N0("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.G = staticLayout;
                this.H = staticLayout.getLineCount() > 0 ? this.G.getLineWidth(0) : 0.0f;
                this.I = this.G.getLineCount() > 0 ? this.G.getLineLeft(0) : 0.0f;
            } else {
                this.G = null;
            }
            g((c8bVar == null || !c8bVar.K) ? null : hl.g0((int) Math.max(0.0f, ((c8bVar.a0 - c8bVar.Z) * c8bVar.h0) / 1000.0f), false, false));
            if (c8bVar == null || !c8bVar.K) {
                this.P = ob6.M0(2131744336, null);
            } else {
                this.P = ob6.M0(2131744336, null) + ", " + ob6.z((int) Math.max(0.0f, ((c8bVar.a0 - c8bVar.Z) * c8bVar.h0) / 1000.0f));
            }
        }
        b(c8bVar);
    }

    public final void f(int i, boolean z, boolean z2) {
        if (this.M) {
            z = true;
        }
        za zaVar = this.K;
        FrameLayout frameLayout = this.J;
        if (z2) {
            frameLayout.setVisibility(0);
            ik8.t(zaVar.animate().alpha(z ? 1.0f : 0.0f).scaleX(z ? 1.0f : 0.7f).scaleY(z ? 1.0f : 0.7f).withEndAction(new xac((byte) 21, this, z)), k43.h, 320L);
        } else {
            frameLayout.setVisibility(z ? 0 : 8);
        }
        if (i < 0) {
            zaVar.a(false, z2);
        } else {
            zaVar.a(true, z2);
            zaVar.setNum(i);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.y = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : hl.q.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
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
            matrix.postTranslate(c00.c(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), c00.c(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
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
        hl.r(this.Q);
        Object obj = this.T;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        hl.d3(this.Q, 250L);
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
            za zaVar = this.K;
            accessibilityNodeInfo.setChecked(zaVar != null && zaVar.a.q);
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
        pt4 pt4Var;
        pt4 pt4Var2;
        if (i == 16 && (pt4Var2 = this.N) != null) {
            pt4Var2.run();
            return true;
        }
        if (i != 32 || (pt4Var = this.O) == null) {
            return super.performAccessibilityAction(i, bundle);
        }
        pt4Var.run();
        return true;
    }
}
