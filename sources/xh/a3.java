package xh;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.f8;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final class a3 extends FrameLayout implements k6 {
    public Path a;
    public float b;
    public int c;
    public boolean d;
    public int e;
    public int f;
    public View h;
    public w n;

    @Override // org.telegram.ui.ActionBar.k6
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(t6.Rf));
        hashSet.add(Integer.valueOf(t6.Ci));
    }

    @Override // android.view.View
    public final void draw(Canvas canvas) {
        canvas.save();
        float height = (getHeight() - org.telegram.messenger.i0.L(32.0f)) / 2.0f;
        float max = Math.max((getWidth() - this.f) - org.telegram.messenger.i0.L(4.0f), getHeight()) * this.b;
        float L = org.telegram.messenger.i0.L(16.0f) + max;
        RectF rectF = org.telegram.messenger.i0.P;
        rectF.set(org.telegram.messenger.i0.L(14.0f) - max, (org.telegram.messenger.i0.L(4.0f) + height) - max, org.telegram.messenger.i0.L(6.0f) + this.f + max, (getHeight() - org.telegram.messenger.i0.L(12.0f)) + max);
        Path path = this.a;
        path.rewind();
        path.addRoundRect(rectF, L, L, Path.Direction.CW);
        canvas.clipPath(path);
        canvas.drawColor(this.e);
        canvas.saveLayerAlpha(rectF, (int) ((1.0f - (Math.min(0.5f, this.b) / 0.5f)) * 255.0f), 31);
        canvas.translate(org.telegram.messenger.i0.L(10.0f), height);
        w wVar = this.n;
        if (wVar != null) {
            wVar.setDrawBackgroundDrawable(false);
            this.n.draw(canvas);
            this.n.setDrawBackgroundDrawable(true);
        }
        canvas.restore();
        canvas.translate((1.0f - this.b) * (-org.telegram.messenger.i0.L(8.0f)), 0.0f);
        super.draw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        int size = View.MeasureSpec.getSize(i11);
        int height = getParent() instanceof View ? ((View) getParent()).getHeight() : 0;
        if (height > 0) {
            size = Math.min(size, height);
        }
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(size, View.MeasureSpec.getMode(i11)));
    }

    public void setBotMenuButton(w wVar) {
        this.n = wVar;
        invalidate();
    }

    public void setMeasuredButtonWidth(int i10) {
        this.f = i10;
        invalidate();
    }

    public void setProgress(float f7) {
        this.b = f7;
        this.e = i0.b.f(f7, t6.x0(null, t6.Rf, false), this.c);
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            getChildAt(i10).setAlpha(f7);
        }
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.k6
    public final void updateColors() {
        try {
            if (this.d) {
                this.c = t6.x0(null, t6.Ci, false);
            }
            if (this.e != 0) {
                this.e = i0.b.f(this.b, t6.x0(null, t6.Rf, false), this.c);
                invalidate();
            }
        } catch (Exception e) {
            f8.g(e, true);
        }
    }
}
