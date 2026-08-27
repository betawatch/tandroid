package rh;

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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.yy;
import org.telegram.ui.Components.zu0;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes4.dex */
public final class q1 extends zu0 {
    public boolean s0;
    public final Paint t0;
    public final RectF u0;
    public final /* synthetic */ x1 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(x1 x1Var, Context context) {
        super(context, null);
        this.v0 = x1Var;
        this.t0 = new Paint(1);
        new Path();
        this.u0 = new RectF();
    }

    @Override // org.telegram.ui.Components.zu0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        x1 x1Var = this.v0;
        Rect rect = x1Var.w;
        int l1 = g6.l1(x1Var.E, x1Var.getThemedColor(g6.d6));
        Paint paint = this.t0;
        paint.setColor(l1);
        if (!x1Var.A || x1Var.x == null) {
            canvas.drawRect(0.0f, 0.0f, getWidth(), getHeight(), paint);
            super.dispatchDraw(canvas);
            return;
        }
        float width = getWidth();
        float height = getHeight();
        RectF rectF = this.u0;
        rectF.set(0.0f, 0.0f, width, height);
        rectF.inset(-AndroidUtilities.dp(7.0f), -AndroidUtilities.dp(7.0f));
        float lerp = AndroidUtilities.lerp(AndroidUtilities.dpf2(22.0f), 0.0f, x1Var.E);
        AndroidUtilities.lerp(x1Var.y, rectF, x1Var.E, rectF);
        rect.set(x1Var.x.getBounds());
        x1Var.x.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        x1Var.x.p(lerp);
        x1Var.x.setAlpha((int) ((1.0f - x1Var.E) * 255.0f));
        x1Var.x.draw(canvas);
        x1Var.x.setBounds(rect);
        rectF.inset(AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        canvas.drawRoundRect(rectF, lerp, lerp, paint);
        if (x1Var.v != null) {
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(x1Var.C[0], x1Var.D[0], x1Var.E), AndroidUtilities.lerp(x1Var.C[1], x1Var.D[1], x1Var.E));
            canvas.saveLayerAlpha(0.0f, 0.0f, x1Var.v.getWidth(), x1Var.v.getHeight(), (int) ((1.0f - x1Var.E) * 255.0f), 31);
            x1Var.v.draw(canvas);
            canvas.restore();
            canvas.restore();
            canvas.save();
            canvas.translate(AndroidUtilities.lerp(rectF.right, (x1Var.u0.getX() + (x1Var.W.getX() + (x1Var.V.getX() + x1Var.U.getX()))) + x1Var.u0.getWidth(), x1Var.E) - x1Var.v.v1.getWidth(), AndroidUtilities.lerp(rectF.bottom, (x1Var.u0.getY() + (x1Var.W.getY() + (x1Var.V.getY() + x1Var.U.getY()))) + x1Var.u0.getHeight(), x1Var.E) - x1Var.v.v1.getHeight());
            canvas.saveLayerAlpha(-AndroidUtilities.dp(6.0f), -AndroidUtilities.dp(6.0f), x1Var.v.v1.getWidth(), x1Var.v.v1.getHeight(), (int) ((1.0f - x1Var.E) * 255.0f), 31);
            x1Var.v.v1.draw(canvas);
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
        x1 x1Var = this.v0;
        if (action == 0 && keyEvent.getKeyCode() == 47 && keyEvent.isCtrlPressed()) {
            if (x1Var.q0()) {
                org.telegram.messenger.y1.q(R.string.RichEditorDraftSaved, new mc(x1Var.T, x1Var.getResourceProvider()), R.raw.contact_check, 36);
                return true;
            }
        } else if (!x1Var.L.h3(keyEvent)) {
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
        yy yyVar;
        x1 x1Var = this.v0;
        if (!x1Var.L.j3.y() || !x1Var.L.k3.onTouchEvent(motionEvent)) {
            int height = (!x1Var.y0 || (yyVar = x1Var.w0) == null) ? (getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(x1Var.z0, x1Var.P0), x1Var.Q0) : (int) yyVar.getY();
            if (motionEvent.getAction() == 0 && x1Var.x0 && motionEvent.getY() < height) {
                x1Var.k0(true);
            }
            if (motionEvent.getAction() == 0) {
                if (motionEvent.getY() > AndroidUtilities.dp(60.0f) + getPaddingTop()) {
                }
                if (motionEvent.getAction() == 0) {
                    this.s0 = x1Var.W.getVisibility() == 0 && motionEvent.getY() >= ((float) ((getHeight() - AndroidUtilities.dp(60.0f)) - Math.max(Math.max(x1Var.z0, x1Var.P0), x1Var.Q0)));
                }
                if (!this.s0 || !x1Var.L.i3(motionEvent)) {
                    return super.dispatchTouchEvent(motionEvent);
                }
            }
            if (x1Var.L.k3.b(motionEvent)) {
                motionEvent.setAction(3);
            }
            if (motionEvent.getAction() == 0) {
            }
            if (!this.s0) {
            }
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }
}
