package vh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qv0;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class r1 extends qv0 {
    public boolean t0;
    public final Paint u0;
    public final RectF v0;
    public final /* synthetic */ y1 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(y1 y1Var, Context context) {
        super(context, null);
        this.w0 = y1Var;
        this.u0 = new Paint(1);
        new Path();
        this.v0 = new RectF();
    }

    @Override // org.telegram.ui.Components.qv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        y1 y1Var = this.w0;
        Rect rect = y1Var.w;
        int l1 = j6.l1(y1Var.F, y1Var.getThemedColor(j6.d6));
        Paint paint = this.u0;
        paint.setColor(l1);
        if (!y1Var.B || y1Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.v0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, y1Var.F);
        AndroidUtilities.lerp(y1Var.y, rectF, y1Var.F, rectF);
        rect.set(y1Var.x.getBounds());
        y1Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        y1Var.x.p(lerp);
        y1Var.x.setAlpha((int) ((1.0f - y1Var.F) * 255.0f));
        y1Var.x.draw(canvas);
        y1Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (y1Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(y1Var.D[0], y1Var.E[0], y1Var.F), AndroidUtilities.lerp(y1Var.D[1], y1Var.E[1], y1Var.F));
            canvas.saveLayerAlpha(0.0f, 0.0f, y1Var.v.getWidth(), y1Var.v.getHeight(), (int) ((1.0f - y1Var.F) * 255.0f), 31);
            y1Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (y1Var.v0.getX() + (y1Var.X.getX() + (y1Var.W.getX() + y1Var.V.getX()))) + y1Var.v0.getWidth(), y1Var.F) - y1Var.v.w1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (y1Var.v0.getY() + (y1Var.X.getY() + (y1Var.W.getY() + y1Var.V.getY()))) + y1Var.v0.getHeight(), y1Var.F) - y1Var.v.w1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), y1Var.v.w1.getWidth(), y1Var.v.w1.getHeight(), (int) ((1.0f - y1Var.F) * 255.0f), 31);
            y1Var.v.w1.draw(canvas);
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
        y1 y1Var = this.w0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (y1Var.q0()) {
                kh.a2.v(R.string.RichEditorDraftSaved, new qc(y1Var.U, y1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!y1Var.M.h3(keyEvent)) {
            return super.dispatchKeyEvent(keyEvent);
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r8.getY() < r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008c  */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        kz kzVar;
        y1 y1Var = this.w0;
        if (!y1Var.M.k3.y() || !y1Var.M.l3.onTouchEvent(motionEvent)) {
            int height = (!y1Var.z0 || (kzVar = y1Var.x0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(y1Var.A0, y1Var.Q0), y1Var.R0) : (int) kzVar.getY();
            if (motionEvent.getAction() == 0 && y1Var.y0 && motionEvent.getY() < height) {
                y1Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.t0 = y1Var.X.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(y1Var.A0, y1Var.Q0), y1Var.R0)));
                }
                if (!this.t0 || !y1Var.M.i3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (y1Var.M.l3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.t0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
