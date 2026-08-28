package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import ff.c0;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ll;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import yf.k0;
import zf.x0;
import zf.z0;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class c extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public final Object b;
    public final Object c;

    public c(Context context, b6 b6Var) {
        super(context);
        this.c = new c0(8);
        this.b = b6Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                c0 c0Var = (c0) this.c;
                c0Var.b(f6.l1(0.65f, f6.v0(f6.d6, (b6) this.b)));
                c0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            case 1:
            default:
                super.dispatchDraw(canvas);
                break;
            case 2:
                ((z0) this.b).d(0, 0.0f, 0, getMeasuredWidth(), 0.0f, getMeasuredHeight());
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, AndroidUtilities.dp(2.0f), getMeasuredWidth(), AndroidUtilities.dp(18.0f) + getMeasuredHeight());
                canvas.save();
                canvas.clipRect(0, 0, getMeasuredWidth(), getMeasuredHeight());
                z0 z0Var = (z0) this.b;
                z0Var.f.setAlpha(((x0) this.c).G);
                canvas.drawRoundRect(rectF, AndroidUtilities.dp(24.0f) - 1, AndroidUtilities.dp(24.0f) - 1, z0Var.f);
                canvas.restore();
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z10;
        switch (this.a) {
            case 1:
                Path path = (Path) this.b;
                k0 k0Var = (k0) this.c;
                if (k0Var.h == null || (!((z10 = k0Var.f) && view == k0Var.d) && (z10 || view != k0Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z10 ? k0Var.e : 1.0f - k0Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i9, int i10) {
        switch (this.a) {
            case 2:
                super.onMeasure(i9, ll.C(2.0f, ((x0) this.c).s, TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i9, i10);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i9, int i10, int i11, int i12) {
        switch (this.a) {
            case 0:
                super.onSizeChanged(i9, i10, i11, i12);
                c0 c0Var = (c0) this.c;
                c0Var.setBounds(0, 0, i9, i10);
                c0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            default:
                super.onSizeChanged(i9, i10, i11, i12);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(x0 x0Var, Context context, z0 z0Var) {
        super(context);
        this.c = x0Var;
        this.b = z0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(k0 k0Var, Context context) {
        super(context);
        this.c = k0Var;
        this.b = new Path();
    }
}
