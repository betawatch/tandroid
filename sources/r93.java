// default package

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class r93 extends View implements vlb {
    public Path a;
    public Paint b;
    public boolean c;

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.a, this.b);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(13.0f), TLObject.FLAG_30));
        setTop(this.c);
    }

    public void setTop(boolean z) {
        Path path = this.a;
        path.rewind();
        this.c = z;
        if (z) {
            float L = gm.L(14.0f);
            RectF rectF = gm.P;
            rectF.set(0.0f, gm.L(4.0f), getMeasuredWidth(), gm.L(4.0f) + (getMeasuredHeight() << 1));
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        float L2 = gm.L(8.0f);
        RectF rectF2 = gm.P;
        rectF2.set(0.0f, ((-getMeasuredHeight()) << 1) - gm.L(4.0f), getMeasuredWidth(), getMeasuredHeight() - gm.L(4.0f));
        path.addRoundRect(rectF2, L2, L2, Path.Direction.CW);
    }

    @Override // vlb
    public final void updateColors() {
        try {
            this.b.setColor(cmb.w0(null, cmb.c6, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
