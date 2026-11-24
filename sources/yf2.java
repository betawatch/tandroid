// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class yf2 extends hn {
    public final /* synthetic */ byte s;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf2(FrameLayout frameLayout, Context context, byte b) {
        super(context, false, false, false);
        this.s = b;
        this.w = frameLayout;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 4:
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - gl.L(20.0f));
                Drawable drawable = (Drawable) this.w;
                drawable.setBounds(measuredWidth, ug8.D(17.0f, getMeasuredHeight(), 2), gl.L(17.0f) + measuredWidth, (gl.L(17.0f) + getMeasuredHeight()) / 2);
                drawable.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public final void invalidate() {
        switch (this.s) {
            case 3:
                super.invalidate();
                ef8 ef8Var = (ef8) this.w;
                gf8 gf8Var = ef8Var.d;
                if (ef8Var == gf8Var.l1.getPinnedHeader()) {
                    gf8Var.l1.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // hn, android.view.View
    public final void onDraw(Canvas canvas) {
        int p1;
        switch (this.s) {
            case 0:
                super.onDraw(canvas);
                ((ag2) this.w).f();
                break;
            case 1:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (p1 = bkb.p1(0.15f, bkb.w0(null, bkb.K6, false)))) {
                    shapeDrawable.getPaint().setColor(p1);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
            case 5:
                canvas.save();
                canvas.translate(gl.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - gl.L(30.0f), gl.L(11.0f));
                ((k6c) this.w).b.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // hn, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.s) {
            case 2:
                k66 k66Var = (k66) this.w;
                TextView textView = k66Var.f;
                TextView textView2 = k66Var.d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = gl.q.x - gl.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - textView2.getPaint().measureText(textView2.getText().toString())) - textView.getPaint().measureText(textView.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(gl.L(24.0f), TLObject.FLAG_30));
                break;
            default:
                super.onMeasure(i, i2);
                break;
        }
    }

    @Override // android.view.View
    public final boolean post(Runnable runnable) {
        switch (this.s) {
            case 3:
                gf8 gf8Var = ((ef8) this.w).d;
                pm pmVar = gf8.L1;
                return gf8Var.b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j) {
        switch (this.s) {
            case 3:
                gf8 gf8Var = ((ef8) this.w).d;
                pm pmVar = gf8.L1;
                return gf8Var.b.postDelayed(runnable, j);
            default:
                return super.postDelayed(runnable, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yf2(Context context, boolean z, boolean z2, boolean z3) {
        super(context, z, z2, z3);
        this.s = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf2(k6c k6cVar, Context context) {
        super(context, true, true, true);
        this.s = (byte) 5;
        this.w = k6cVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf2(k66 k66Var, Context context) {
        super(context, false, true, true);
        this.s = (byte) 2;
        this.w = k66Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yf2(yua yuaVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.s = (byte) 4;
        this.w = drawable;
    }
}
