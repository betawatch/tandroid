package th;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.z20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.dc;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class t6 extends View {
    public int a;
    public int b;
    public final Matrix c;
    public final Paint[] d;
    public final org.telegram.ui.Components.t5 e;
    public boolean f;
    public int h;
    public final Drawable[] n;
    public final float[] r;
    public boolean s;
    public final Paint w;
    public final Path x;
    public final dc y;

    public t6(Context context) {
        super(context);
        this.c = new Matrix();
        this.d = new Paint[]{new Paint(1), new Paint(1)};
        this.e = new org.telegram.ui.Components.t5(this, 0L, 260L, gr.h);
        this.n = new Drawable[2];
        this.r = new float[2];
        Paint paint = new Paint(1);
        this.w = paint;
        this.x = new Path();
        this.y = new dc(this, 0.6f, 5.0f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setColor(-1);
    }

    public final void a(boolean z10, TL_stories.StoryItem storyItem, boolean z11) {
        ArrayList<TLRPC.PrivacyRule> arrayList;
        this.s = z10;
        this.f = true;
        if (storyItem == null) {
            this.f = false;
        } else {
            boolean z12 = storyItem.close_friends;
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (z12) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                t5Var.f(z11, true);
            } else if (storyItem.contacts) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                t5Var.f(z11, true);
            } else if (storyItem.selected_contacts || (z10 && ((arrayList = storyItem.privacy) == null || arrayList.isEmpty()))) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                t5Var.f(z11, true);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                t5Var.f(z11, true);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void b(boolean z10, d5 d5Var, boolean z11) {
        vh.u6 u6Var;
        this.s = z10;
        this.f = true;
        if (d5Var == null || (u6Var = d5Var.c.E0) == null) {
            this.f = false;
        } else {
            int i10 = u6Var.a;
            org.telegram.ui.Components.t5 t5Var = this.e;
            if (i10 == 1) {
                c(15.0f, R.drawable.msg_stories_closefriends);
                d(-7808710, -13781445);
                t5Var.f(z11, !z11);
            } else if (i10 == 2) {
                c(17.33f, R.drawable.msg_folders_private);
                d(-3905294, -6923014);
                t5Var.f(z11, !z11);
            } else if (i10 == 3) {
                c(17.33f, R.drawable.msg_folders_groups);
                d(-18621, -618956);
                t5Var.f(z11, !z11);
            } else if (z10) {
                c(17.33f, R.drawable.msg_folders_channels);
                d(-15292942, -15630089);
                t5Var.f(z11, !z11);
            } else {
                this.f = false;
            }
        }
        setVisibility(this.f ? 0 : 8);
        invalidate();
    }

    public final void c(float f7, int i10) {
        if (i10 == R.drawable.msg_stories_closefriends) {
            setContentDescription(cd.L0(2131744558, null));
        } else if (i10 == R.drawable.msg_folders_private) {
            setContentDescription(cd.L0(2131744556, null));
        } else if (i10 == R.drawable.msg_folders_groups) {
            setContentDescription(cd.L0(2131744546, null));
        } else if (i10 == R.drawable.msg_folders_channels) {
            setContentDescription(cd.L0(2131744554, null));
        }
        Drawable[] drawableArr = this.n;
        Drawable drawable = drawableArr[0];
        drawableArr[1] = drawable;
        float[] fArr = this.r;
        fArr[1] = fArr[0];
        if (drawable == null || i10 != this.h) {
            Resources resources = getContext().getResources();
            this.h = i10;
            drawableArr[0] = resources.getDrawable(i10).mutate();
            drawableArr[0].setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fArr[0] = org.telegram.messenger.i0.N(f7);
            invalidate();
        }
    }

    public final void d(int i10, int i11) {
        Paint[] paintArr = this.d;
        paintArr[1].setShader(paintArr[0].getShader());
        if (this.a == i10 && this.b == i11) {
            return;
        }
        float L = org.telegram.messenger.i0.L(23.0f);
        this.a = i10;
        this.b = i11;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 0.0f, L, new int[]{i10, i11}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP);
        Matrix matrix = this.c;
        matrix.reset();
        matrix.postTranslate(0.0f, org.telegram.messenger.i0.L(8.0f));
        linearGradient.setLocalMatrix(matrix);
        paintArr[0].setShader(linearGradient);
        invalidate();
    }

    public float getCenterX() {
        return (getWidth() / 2.0f) + getX() + (this.s ? 0 : org.telegram.messenger.i0.L(14.0f));
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f7;
        char c10;
        float f10;
        if (this.f) {
            float N = this.s ? 0.0f : org.telegram.messenger.i0.N(7.0f);
            float N2 = this.s ? org.telegram.messenger.i0.N(43.0f) : org.telegram.messenger.i0.N(23.66f);
            float N3 = org.telegram.messenger.i0.N(23.66f);
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(c3.i0.B(getWidth(), N2, 2.0f, N), (getHeight() - N3) / 2.0f, org.telegram.messenger.m5.a(getWidth(), N2, 2.0f, N), (getHeight() + N3) / 2.0f);
            float a2 = this.y.a(0.075f);
            canvas.save();
            canvas.scale(a2, a2, rectF.centerX(), rectF.centerY());
            float e = this.e.e(false, 0.0f);
            Paint[] paintArr = this.d;
            if (e > 0.0f) {
                paintArr[1].setAlpha(zs.e4);
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paintArr[1]);
            }
            if (e < 1.0f) {
                paintArr[0].setAlpha((int) ((1.0f - e) * 255.0f));
                canvas.drawRoundRect(rectF, org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), paintArr[0]);
            }
            float abs = Math.abs(e - 0.5f) + 0.5f;
            Drawable[] drawableArr = this.n;
            Drawable drawable = drawableArr[1];
            float[] fArr = this.r;
            if (drawable == null || e <= 0.5f) {
                f7 = 0.5f;
                c10 = 0;
                f10 = 12.0f;
            } else {
                float N4 = this.s ? org.telegram.messenger.i0.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable2 = drawableArr[1];
                int v = (int) z20.v(fArr[1], 2.0f, abs, N4);
                float centerY = rectF.centerY();
                float f11 = (fArr[1] / 2.0f) * abs;
                f7 = 0.5f;
                c10 = 0;
                f10 = 12.0f;
                drawable2.setBounds(v, (int) (centerY - f11), (int) (f11 + N4), (int) a1.g.c(fArr[1], 2.0f, abs, rectF.centerY()));
                drawableArr[1].draw(canvas);
            }
            if (drawableArr[c10] != null && e <= f7) {
                float N5 = this.s ? org.telegram.messenger.i0.N(14.66f) + rectF.left : rectF.centerX();
                Drawable drawable3 = drawableArr[c10];
                int v10 = (int) z20.v(fArr[c10], 2.0f, abs, N5);
                float centerY2 = rectF.centerY();
                float f12 = (fArr[c10] / 2.0f) * abs;
                drawable3.setBounds(v10, (int) (centerY2 - f12), (int) (f12 + N5), (int) a1.g.c(fArr[c10], 2.0f, abs, rectF.centerY()));
                drawableArr[c10].draw(canvas);
            }
            if (this.s) {
                Path path = this.x;
                path.rewind();
                path.moveTo(rectF.right - org.telegram.messenger.i0.N(15.66f), rectF.centerY() - org.telegram.messenger.i0.N(1.33f));
                path.lineTo(rectF.right - org.telegram.messenger.i0.N(f10), org.telegram.messenger.i0.N(2.33f) + rectF.centerY());
                path.lineTo(rectF.right - org.telegram.messenger.i0.N(8.16f), rectF.centerY() - org.telegram.messenger.i0.N(1.33f));
                float N6 = org.telegram.messenger.i0.N(1.33f);
                Paint paint = this.w;
                paint.setStrokeWidth(N6);
                canvas.drawPath(path, paint);
            }
            canvas.restore();
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(60.0f), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.L(40.0f), TLObject.FLAG_30));
    }

    @Override // android.view.View
    public void setPressed(boolean z10) {
        super.setPressed(z10);
        this.y.c(z10);
    }
}
