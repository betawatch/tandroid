// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class qg2 extends in {
    public final /* synthetic */ byte s;
    public Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg2(FrameLayout frameLayout, Context context, byte b) {
        super(context, false, false, false);
        this.s = b;
        this.w = frameLayout;
    }

    @Override // android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.s) {
            case 4:
                int measuredWidth = (int) ((getMeasuredWidth() - getDrawable().c()) - hl.L(20.0f));
                Drawable drawable = (Drawable) this.w;
                drawable.setBounds(measuredWidth, ik8.D(17.0f, getMeasuredHeight(), 2), hl.L(17.0f) + measuredWidth, (hl.L(17.0f) + getMeasuredHeight()) / 2);
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
                si8 si8Var = (si8) this.w;
                ui8 ui8Var = si8Var.d;
                if (si8Var == ui8Var.l1.getPinnedHeader()) {
                    ui8Var.l1.invalidate();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // in, android.view.View
    public final void onDraw(Canvas canvas) {
        int p1;
        switch (this.s) {
            case 0:
                super.onDraw(canvas);
                ((sg2) this.w).f();
                break;
            case 1:
                ShapeDrawable shapeDrawable = (ShapeDrawable) this.w;
                if (shapeDrawable != null && shapeDrawable.getPaint().getColor() != (p1 = aob.p1(0.15f, aob.w0(null, aob.L6, false)))) {
                    shapeDrawable.getPaint().setColor(p1);
                }
                shapeDrawable.setBounds(0, 0, (int) (getDrawable().c() + getPaddingLeft() + getPaddingRight()), getMeasuredHeight());
                shapeDrawable.draw(canvas);
                super.onDraw(canvas);
                break;
            case 5:
                canvas.save();
                canvas.translate(hl.L(15.0f), 0.0f);
                super.onDraw(canvas);
                canvas.translate(((getMeasuredWidth() - d()) / 2.0f) - hl.L(30.0f), hl.L(11.0f));
                ((kac) this.w).b.draw(canvas);
                canvas.restore();
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // in, android.view.View
    public final void onMeasure(int i, int i2) {
        switch (this.s) {
            case 2:
                o86 o86Var = (o86) this.w;
                TextView textView = o86Var.f;
                TextView textView2 = o86Var.d;
                int size = View.MeasureSpec.getSize(i);
                if (size <= 0) {
                    size = hl.q.x - hl.L(20.0f);
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec((int) ((size - textView2.getPaint().measureText(textView2.getText().toString())) - textView.getPaint().measureText(textView.getText().toString())), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(hl.L(24.0f), TLObject.FLAG_30));
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
                ui8 ui8Var = ((si8) this.w).d;
                qm qmVar = ui8.L1;
                return ui8Var.b.post(runnable);
            default:
                return super.post(runnable);
        }
    }

    @Override // android.view.View
    public final boolean postDelayed(Runnable runnable, long j) {
        switch (this.s) {
            case 3:
                ui8 ui8Var = ((si8) this.w).d;
                qm qmVar = ui8.L1;
                return ui8Var.b.postDelayed(runnable, j);
            default:
                return super.postDelayed(runnable, j);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qg2(Context context, boolean z, boolean z2, boolean z3) {
        super(context, z, z2, z3);
        this.s = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(kac kacVar, Context context) {
        super(context, true, true, true);
        this.s = (byte) 5;
        this.w = kacVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(o86 o86Var, Context context) {
        super(context, false, true, true);
        this.s = (byte) 2;
        this.w = o86Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg2(cza czaVar, Context context, Drawable drawable) {
        super(context, false, false, false);
        this.s = (byte) 4;
        this.w = drawable;
    }
}
