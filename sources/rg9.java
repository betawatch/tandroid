// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public final class rg9 extends wma {
    public boolean g0;
    public final Paint h0;
    public final RectF i0;
    public final /* synthetic */ yg9 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rg9(yg9 yg9Var, Context context) {
        super(context, null);
        this.j0 = yg9Var;
        this.h0 = new Paint(1);
        this.i0 = new RectF();
    }

    @Override // wma, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yg9 yg9Var = this.j0;
        Rect rect = yg9Var.x;
        int p1 = aob.p1(yg9Var.J, yg9Var.getThemedColor(aob.d6));
        Paint paint = this.h0;
        paint.setColor(p1);
        if (!yg9Var.F || yg9Var.y == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.i0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-hl.L(7.0f), -hl.L(7.0f));
        float R1 = hl.R1(hl.N(22.0f), 0.0f, yg9Var.J);
        hl.X1(yg9Var.E, rectF, yg9Var.J, rectF);
        rect.set(yg9Var.y.getBounds());
        yg9Var.y.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        yg9Var.y.r(R1);
        yg9Var.y.setAlpha((int) ((1.0f - yg9Var.J) * 255.0f));
        yg9Var.y.draw(canvas);
        yg9Var.y.setBounds(rect);
        rectF.inset(hl.L(7.0f), hl.L(7.0f));
        canvas.drawRoundRect(rectF, R1, R1, paint);
        if (yg9Var.w != null) {
            canvas.save();
            canvas.translate(hl.U1(yg9Var.J, yg9Var.H[0], yg9Var.I[0]), hl.U1(yg9Var.J, yg9Var.H[1], yg9Var.I[1]));
            canvas.saveLayerAlpha(0.0f, 0.0f, yg9Var.w.getWidth(), yg9Var.w.getHeight(), (int) ((1.0f - yg9Var.J) * 255.0f), 31);
            yg9Var.w.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(hl.R1(rectF.right, (yg9Var.z0.getX() + (yg9Var.b0.getX() + (yg9Var.a0.getX() + yg9Var.Z.getX()))) + yg9Var.z0.getWidth(), yg9Var.J) - yg9Var.w.p2.getWidth(), hl.R1(rectF.bottom, (yg9Var.z0.getY() + (yg9Var.b0.getY() + (yg9Var.a0.getY() + yg9Var.Z.getY()))) + yg9Var.z0.getHeight(), yg9Var.J) - yg9Var.w.p2.getHeight());
            canvas.saveLayerAlpha(-hl.L(6.0f), -hl.L(6.0f), yg9Var.w.p2.getWidth(), yg9Var.w.p2.getHeight(), (int) ((1.0f - yg9Var.J) * 255.0f), 31);
            yg9Var.w.p2.draw(canvas);
            canvas.restore();
            canvas.restore();
        }
        canvas.save();
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int action = keyEvent.getAction();
        yg9 yg9Var = this.j0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (yg9Var.r0()) {
                bs2.v(null, 2131745730, new d31(yg9Var.Y, yg9Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!yg9Var.Q.e3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
    
        if (r8.getY() < r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008a  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        o24 o24Var;
        yg9 yg9Var = this.j0;
        if (!yg9Var.Q.v3.w() || !yg9Var.Q.w3.onTouchEvent(motionEvent)) {
            int height = (!yg9Var.D0 || (o24Var = yg9Var.B0) == null) ? (getHeight() - hl.L(60.0f)) - Math.max(Math.max(yg9Var.E0, yg9Var.U0), yg9Var.V0) : (int) o24Var.getY();
            if (motionEvent.getAction() == 0 && yg9Var.C0 && motionEvent.getY() < height) {
                yg9Var.g0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > hl.L(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.g0 = yg9Var.b0.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - hl.L(60.0f)) - Math.max(Math.max(yg9Var.E0, yg9Var.U0), yg9Var.V0)));
                }
                if (!this.g0 || !yg9Var.Q.f3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (yg9Var.Q.w3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.g0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
