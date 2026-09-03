package wh;

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
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.mz;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class r1 extends pv0 {
    public boolean t0;
    public final Paint u0;
    public final RectF v0;
    public final /* synthetic */ z1 w0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(z1 z1Var, Context context) {
        super(context, null);
        this.w0 = z1Var;
        this.u0 = new Paint(1);
        new Path();
        this.v0 = new RectF();
    }

    @Override // org.telegram.ui.Components.pv0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        z1 z1Var = this.w0;
        Rect rect = z1Var.w;
        int l1 = k6.l1(z1Var.F, z1Var.getThemedColor(k6.d6));
        Paint paint = this.u0;
        paint.setColor(l1);
        if (!z1Var.B || z1Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.v0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, z1Var.F);
        AndroidUtilities.lerp(z1Var.y, rectF, z1Var.F, rectF);
        rect.set(z1Var.x.getBounds());
        z1Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        z1Var.x.p(lerp);
        z1Var.x.setAlpha((int) ((1.0f - z1Var.F) * 255.0f));
        z1Var.x.draw(canvas);
        z1Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (z1Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(z1Var.D[0], z1Var.E[0], z1Var.F), AndroidUtilities.lerp(z1Var.D[1], z1Var.E[1], z1Var.F));
            canvas.saveLayerAlpha(0.0f, 0.0f, z1Var.v.getWidth(), z1Var.v.getHeight(), (int) ((1.0f - z1Var.F) * 255.0f), 31);
            z1Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (z1Var.v0.getX() + (z1Var.X.getX() + (z1Var.W.getX() + z1Var.V.getX()))) + z1Var.v0.getWidth(), z1Var.F) - z1Var.v.w1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (z1Var.v0.getY() + (z1Var.X.getY() + (z1Var.W.getY() + z1Var.V.getY()))) + z1Var.v0.getHeight(), z1Var.F) - z1Var.v.w1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), z1Var.v.w1.getWidth(), z1Var.v.w1.getHeight(), (int) ((1.0f - z1Var.F) * 255.0f), 31);
            z1Var.v.w1.draw(canvas);
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
        z1 z1Var = this.w0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (z1Var.q0()) {
                l.d.v(R.string.RichEditorDraftSaved, new qc(z1Var.U, z1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!z1Var.M.g3(keyEvent)) {
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
        mz mzVar;
        z1 z1Var = this.w0;
        if (!z1Var.M.k3.y() || !z1Var.M.l3.onTouchEvent(motionEvent)) {
            int height = (!z1Var.z0 || (mzVar = z1Var.x0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(z1Var.A0, z1Var.Q0), z1Var.R0) : (int) mzVar.getY();
            if (motionEvent.getAction() == 0 && z1Var.y0 && motionEvent.getY() < height) {
                z1Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.t0 = z1Var.X.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(z1Var.A0, z1Var.Q0), z1Var.R0)));
                }
                if (!this.t0 || !z1Var.M.h3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (z1Var.M.l3.b(motionEvent)) {
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
