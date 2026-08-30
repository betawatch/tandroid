package ph;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.CheckBoxBase;
import org.telegram.ui.Components.kv0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.nr;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class x2 extends FrameLayout {
    public static int a0;
    public float B;
    public StaticLayout C;
    public float D;
    public float E;
    public final FrameLayout F;
    public final org.telegram.ui.Cells.k2 G;
    public final float H;
    public final boolean I;
    public u2 J;
    public u2 K;
    public String L;
    public final org.telegram.ui.web.o0 M;
    public DispatchQueue N;
    public String O;
    public Object P;
    public m71 Q;
    public boolean R;
    public boolean S;
    public final Path T;
    public final float[] U;
    public final Paint V;
    public Bitmap a;
    public final Paint b;
    public final Paint c;
    public final Paint d;
    public LinearGradient e;
    public final Matrix f;
    public final Matrix h;
    public final Paint n;
    public final TextPaint r;
    public final TextPaint s;
    public final Drawable v;
    public boolean w;
    public StaticLayout x;
    public float y;
    public static final ArrayList W = new ArrayList();
    public static final HashMap b0 = new HashMap();
    public static final w2 c0 = new w2(45);

    public x2(Context context, org.telegram.ui.ActionBar.f6 f6Var, float f10, boolean z4) {
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
        this.M = new org.telegram.ui.web.o0(this, 18);
        this.T = new Path();
        this.U = new float[8];
        this.V = new Paint(1);
        this.H = f10;
        this.I = z4;
        paint.setColor(285212671);
        paint2.setColor(1275068416);
        textPaint.setTypeface(AndroidUtilities.bold());
        textPaint.setTextSize(AndroidUtilities.dpf2(12.66f));
        textPaint.setColor(-1);
        textPaint2.setTextSize(AndroidUtilities.dp(11.33f));
        textPaint2.setColor(-1);
        this.v = context.getResources().getDrawable(R.drawable.play_mini_video).mutate();
        org.telegram.ui.Cells.k2 k2Var = new org.telegram.ui.Cells.k2(this, context, f6Var);
        this.G = k2Var;
        if (z4) {
            k2Var.setDrawBackgroundAsArc(7);
        } else {
            k2Var.setDrawBackgroundAsArc(6);
        }
        k2Var.b(org.telegram.ui.ActionBar.j6.W9, org.telegram.ui.ActionBar.j6.X9, org.telegram.ui.ActionBar.j6.V9);
        CheckBoxBase checkBoxBase = k2Var.getCheckBoxBase();
        int i10 = org.telegram.ui.ActionBar.j6.G6;
        if (checkBoxBase.u != i10) {
            checkBoxBase.u = i10;
            checkBoxBase.b();
        }
        FrameLayout frameLayout = new FrameLayout(context);
        this.F = frameLayout;
        frameLayout.addView(k2Var, k7.b6.e(26, 26, 17));
        addView(frameLayout, k7.b6.d(36, 36.0f, 53, 0.0f, 0.0f, 0.0f, 0.0f));
        frameLayout.setVisibility(0);
        frameLayout.setImportantForAccessibility(2);
        k2Var.setImportantForAccessibility(2);
        setWillNotDraw(false);
    }

    public static void d(String str) {
        if (str == null) {
            return;
        }
        HashMap hashMap = b0;
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

    public final DispatchQueue a() {
        DispatchQueue dispatchQueue = this.N;
        if (dispatchQueue != null) {
            return dispatchQueue;
        }
        ArrayList arrayList = W;
        if (arrayList.size() < 4) {
            DispatchQueue dispatchQueue2 = new DispatchQueue("gallery_load_" + arrayList.size());
            this.N = dispatchQueue2;
            arrayList.add(dispatchQueue2);
        } else {
            int i10 = a0 + 1;
            a0 = i10;
            if (i10 >= arrayList.size()) {
                a0 = 0;
            }
            this.N = (DispatchQueue) arrayList.get(a0);
        }
        return this.N;
    }

    public final void b(Object obj) {
        String str;
        Bitmap bitmap;
        if (obj == null) {
            d(this.O);
            this.O = null;
            this.a = null;
            invalidate();
            return;
        }
        boolean z4 = obj instanceof MediaController.PhotoEntry;
        if (z4) {
            MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
            str = photoEntry.thumbPath;
            if (str == null) {
                if (!photoEntry.isVideo || photoEntry.isLivePhoto()) {
                    str = photoEntry.path;
                } else {
                    str = "" + photoEntry.imageId;
                }
            }
        } else if (obj instanceof u6) {
            str = "d" + ((u6) obj).b;
        } else {
            str = null;
        }
        if (TextUtils.equals(str, this.O)) {
            return;
        }
        String str2 = this.O;
        if (str2 != null) {
            this.a = null;
            d(str2);
            invalidate();
        }
        this.O = str;
        Paint paint = this.d;
        paint.setShader(null);
        this.e = null;
        if (z4) {
            MediaController.PhotoEntry photoEntry2 = (MediaController.PhotoEntry) obj;
            if (photoEntry2.gradientTopColor != 0 && photoEntry2.gradientBottomColor != 0) {
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, 1.0f, new int[]{photoEntry2.gradientTopColor, photoEntry2.gradientBottomColor}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
                this.e = linearGradient;
                paint.setShader(linearGradient);
                h();
            }
        }
        if (str == null) {
            bitmap = null;
        } else {
            bitmap = (Bitmap) c0.get(str);
            if (bitmap != null) {
                HashMap hashMap = b0;
                Integer num = (Integer) hashMap.get(str);
                hashMap.put(str, Integer.valueOf(num != null ? 1 + num.intValue() : 1));
            }
        }
        this.a = bitmap;
        if (bitmap != null) {
            invalidate();
            return;
        }
        if (this.Q != null) {
            a().cancelRunnable(this.Q);
            this.Q = null;
        }
        DispatchQueue a2 = a();
        m71 m71Var = new m71(this, obj, str, 13);
        this.Q = m71Var;
        a2.postRunnable(m71Var);
    }

    public final Bitmap c(MediaController.PhotoEntry photoEntry, BitmapFactory.Options options) {
        if (photoEntry == null) {
            return null;
        }
        String str = photoEntry.thumbPath;
        return str != null ? BitmapFactory.decodeFile(str, options) : (!photoEntry.isVideo || photoEntry.isLivePhoto()) ? MediaStore.Images.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options) : MediaStore.Video.Thumbnails.getThumbnail(getContext().getContentResolver(), photoEntry.imageId, 1, options);
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        boolean z4;
        Canvas canvas2;
        boolean z10 = true;
        if (this.R || this.S) {
            canvas.save();
            Path path = this.T;
            path.rewind();
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(0.0f, 0.0f, getWidth(), getHeight());
            float dp = this.R ? AndroidUtilities.dp(6.0f) : 0.0f;
            float[] fArr = this.U;
            fArr[1] = dp;
            fArr[0] = dp;
            float dp2 = this.S ? AndroidUtilities.dp(6.0f) : 0.0f;
            fArr[3] = dp2;
            fArr[2] = dp2;
            path.addRoundRect(rectF, fArr, Path.Direction.CW);
            canvas.clipPath(path);
            z4 = true;
        } else {
            z4 = false;
        }
        float progress = this.G.getProgress() * AndroidUtilities.dp(12.66f);
        if (progress > 0.0f) {
            if (!z4) {
                canvas.save();
            }
            float width = (getWidth() - (progress * 2.0f)) / getWidth();
            Paint paint = this.V;
            paint.setColor(218103807);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            canvas.scale(width, width, getWidth() / 2.0f, getHeight() / 2.0f);
            canvas.clipRect(0, 0, getWidth(), getHeight());
        } else {
            z10 = z4;
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
        StaticLayout staticLayout = this.C;
        Paint paint2 = this.n;
        if (staticLayout != null) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(10.0f) + this.D + AndroidUtilities.dp(6.0f), AndroidUtilities.dp(2.0f) + this.C.getHeight() + AndroidUtilities.dp(5.0f));
            canvas2.drawRoundRect(rectF2, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            canvas2.save();
            canvas2.translate((rectF2.left + AndroidUtilities.dp(6.0f)) - this.E, rectF2.top + AndroidUtilities.dp(1.33f));
            this.C.draw(canvas2);
            canvas2.restore();
        }
        if (this.x != null) {
            RectF rectF3 = AndroidUtilities.rectTmp;
            rectF3.set(AndroidUtilities.dp(4.0f), ((getHeight() - AndroidUtilities.dp(4.0f)) - this.x.getHeight()) - AndroidUtilities.dp(2.0f), AndroidUtilities.dp(4.0f) + (this.w ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(4.0f)) + this.y + AndroidUtilities.dp(5.0f), getHeight() - AndroidUtilities.dp(4.0f));
            canvas2.drawRoundRect(rectF3, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), paint2);
            if (this.w) {
                int dp3 = (int) (rectF3.left + AndroidUtilities.dp(6.0f));
                int centerY = (int) (rectF3.centerY() - (AndroidUtilities.dp(8.0f) / 2));
                int dp4 = (int) (rectF3.left + AndroidUtilities.dp(13.0f));
                int centerY2 = (int) (rectF3.centerY() + (AndroidUtilities.dp(8.0f) / 2));
                Drawable drawable = this.v;
                drawable.setBounds(dp3, centerY, dp4, centerY2);
                drawable.draw(canvas2);
            }
            canvas2.save();
            canvas2.translate((rectF3.left + (this.w ? AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(5.0f))) - this.B, rectF3.top + AndroidUtilities.dp(1.0f));
            this.x.draw(canvas2);
            canvas2.restore();
        }
        if (z10) {
            canvas2.restore();
        }
        super.draw(canvas);
    }

    public final void e(int i10, u6 u6Var) {
        this.P = u6Var;
        String str = null;
        if (i10 > 0) {
            this.C = null;
            g(LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]));
            this.w = false;
            this.L = LocaleController.formatPluralString("StoryDrafts", i10, new Object[0]);
        } else {
            if (u6Var != null && u6Var.c) {
                StaticLayout staticLayout = new StaticLayout(LocaleController.getString("StoryDraft"), this.s, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
                this.C = staticLayout;
                this.D = staticLayout.getLineCount() > 0 ? this.C.getLineWidth(0) : 0.0f;
                this.E = this.C.getLineCount() > 0 ? this.C.getLineLeft(0) : 0.0f;
            } else {
                this.C = null;
            }
            if (u6Var != null && u6Var.K) {
                str = AndroidUtilities.formatShortDuration((int) Math.max(0.0f, ((u6Var.a0 - u6Var.Z) * u6Var.h0) / 1000.0f));
            }
            g(str);
            if (u6Var == null || !u6Var.K) {
                this.L = LocaleController.getString(R.string.StoryDraft);
            } else {
                this.L = LocaleController.getString(R.string.StoryDraft) + ", " + LocaleController.formatDuration((int) Math.max(0.0f, ((u6Var.a0 - u6Var.Z) * u6Var.h0) / 1000.0f));
            }
        }
        b(u6Var);
    }

    public final void f(int i10, boolean z4, boolean z10) {
        if (this.I) {
            z4 = true;
        }
        FrameLayout frameLayout = this.F;
        org.telegram.ui.Cells.k2 k2Var = this.G;
        if (z10) {
            frameLayout.setVisibility(0);
            org.telegram.ui.b.p(k2Var.animate().alpha(z4 ? 1.0f : 0.0f).scaleX(z4 ? 1.0f : 0.7f).scaleY(z4 ? 1.0f : 0.7f).withEndAction(new kv0(11, this, z4)), nr.h, 320L);
        } else {
            frameLayout.setVisibility(z4 ? 0 : 8);
        }
        if (i10 < 0) {
            k2Var.a(false, z10);
        } else {
            k2Var.a(true, z10);
            k2Var.setNum(i10);
        }
    }

    public final void g(String str) {
        if (TextUtils.isEmpty(str)) {
            this.x = null;
        } else {
            StaticLayout staticLayout = new StaticLayout(str, this.r, getMeasuredWidth() > 0 ? getMeasuredWidth() : AndroidUtilities.displaySize.x, Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
            this.x = staticLayout;
            this.y = staticLayout.getLineCount() > 0 ? this.x.getLineWidth(0) : 0.0f;
            this.B = this.x.getLineCount() > 0 ? this.x.getLineLeft(0) : 0.0f;
        }
        this.w = true;
    }

    public final void h() {
        Bitmap bitmap;
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0 && (bitmap = this.a) != null) {
            float max = ((float) bitmap.getHeight()) / ((float) this.a.getWidth()) > this.H - 0.1f ? Math.max(getMeasuredWidth() / this.a.getWidth(), getMeasuredHeight() / this.a.getHeight()) : getMeasuredWidth() / this.a.getWidth();
            Matrix matrix = this.f;
            matrix.reset();
            matrix.postScale(max, max);
            matrix.postTranslate(e2.c.d(max, this.a.getWidth(), getMeasuredWidth(), 2.0f), e2.c.d(max, this.a.getHeight(), getMeasuredHeight(), 2.0f));
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
        AndroidUtilities.cancelRunOnUIThread(this.M);
        Object obj = this.P;
        if (obj != null) {
            b(obj);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        AndroidUtilities.runOnUIThread(this.M, 250L);
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        FrameLayout frameLayout = this.F;
        if (frameLayout == null || frameLayout.getVisibility() != 0) {
            accessibilityNodeInfo.setClassName("android.widget.ImageView");
        } else {
            accessibilityNodeInfo.setClassName("android.widget.CheckBox");
            accessibilityNodeInfo.setCheckable(true);
            org.telegram.ui.Cells.k2 k2Var = this.G;
            accessibilityNodeInfo.setChecked(k2Var != null && k2Var.a.q);
        }
        accessibilityNodeInfo.setClickable(true);
        accessibilityNodeInfo.setEnabled(true);
        accessibilityNodeInfo.addAction(16);
        if (this.K != null) {
            accessibilityNodeInfo.setLongClickable(true);
            accessibilityNodeInfo.addAction(32);
        }
        String str = this.L;
        if (str != null) {
            accessibilityNodeInfo.setContentDescription(str);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i10);
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec((int) (size * this.H), TLObject.FLAG_30));
        h();
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i10, Bundle bundle) {
        u2 u2Var;
        u2 u2Var2;
        if (i10 == 16 && (u2Var2 = this.J) != null) {
            u2Var2.run();
            return true;
        }
        if (i10 != 32 || (u2Var = this.K) == null) {
            return super.performAccessibilityAction(i10, bundle);
        }
        u2Var.run();
        return true;
    }
}
