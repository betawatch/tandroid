// default package

import android.content.Context;
import android.graphics.Canvas;
import android.view.View;
import android.widget.Button;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class rj extends io {
    public final /* synthetic */ byte s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj(Context context, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(context, z, z2, z3, z4, z5);
        this.s = (byte) 5;
    }

    @Override // android.view.View
    public final CharSequence getAccessibilityClassName() {
        switch (this.s) {
            case 0:
                return Button.class.getName();
            case 1:
            default:
                return super.getAccessibilityClassName();
            case 2:
                return Button.class.getName();
        }
    }

    @Override // android.view.View
    public final int getBaseline() {
        switch (this.s) {
            case 5:
                return Math.round((getHeight() - getDrawable().e) / 2.0f) - getPaint().getFontMetricsInt().ascent;
            default:
                return super.getBaseline();
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.s) {
            case 3:
                if (!oi5.b(this)) {
                    super.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // io, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.s) {
            case 4:
                canvas.save();
                canvas.translate(gm.L(17.0f), 0.0f);
                super.onDraw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // io, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.s) {
            case 1:
                super.onMeasure(i, i2);
                setPivotX(getMeasuredWidth());
                break;
            case 5:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(gm.q.x, TLObject.FLAG_31), i2);
                setMeasuredDimension(View.resolveSize((int) Math.ceil(getDrawable().c()), i), getMeasuredHeight());
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rj(Context context, boolean z, boolean z2, boolean z3, byte b) {
        super(context, z, z2, z3);
        this.s = b;
    }

    @Override // android.view.View
    public final void invalidate(int i, int i2, int i3, int i4) {
        switch (this.s) {
            case 3:
                if (!oi5.b(this)) {
                    super.invalidate(i, i2, i3, i4);
                    break;
                }
                break;
            default:
                super.invalidate(i, i2, i3, i4);
                break;
        }
    }
}
