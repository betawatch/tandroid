package tg;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.view.MotionEvent;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import ih.l;
import of.y;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gr;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class i extends RecyclerView {
    public final f Q0;
    public final Paint R0;
    public RenderNode S0;
    public float T0;
    public View U0;
    public h V0;
    public a W0;
    public int X0;
    public int Y0;
    public int Z0;

    public i(LaunchActivity launchActivity) {
        super(launchActivity);
        Paint paint = new Paint(1);
        this.R0 = paint;
        this.Y0 = TLObject.FLAG_31;
        this.Z0 = TLObject.FLAG_31;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        paint.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, AndroidUtilities.dp(16.0f), 0, -16777216, Shader.TileMode.CLAMP));
        setLayoutManager(new y(1, 1 == true ? 1 : 0, 20));
        i(new l(10));
        f fVar = new f(this);
        this.Q0 = fVar;
        setAdapter(fVar);
        g gVar = new g(this);
        gVar.m = false;
        gVar.C = false;
        gVar.o(gr.h);
        gVar.n(320L);
        setItemAnimator(gVar);
    }

    private float getMinChildY() {
        int childCount = getChildCount();
        float f10 = 2.14748365E9f;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (childAt.getVisibility() == 0) {
                f10 = Math.min(f10, childAt.getY());
            }
        }
        return f10;
    }

    public final void C0(int i9, TLRPC.InputGroupCall inputGroupCall) {
        int i10;
        f fVar = this.Q0;
        if (fVar.d && (i10 = fVar.e) != -1 && fVar.f != null) {
            GroupCallMessagesController.getInstance(i10).unsubscribeFromCallMessages(fVar.f.id, fVar);
        }
        fVar.e = i9;
        fVar.f = inputGroupCall;
        if (fVar.d) {
            fVar.c = GroupCallMessagesController.getInstance(i9).getCallMessages(fVar.f.id);
            fVar.l();
            GroupCallMessagesController.getInstance(i9).subscribeToCallMessages(fVar.f.id, fVar);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        int measuredHeight = getMeasuredHeight() - this.X0;
        int dp = AndroidUtilities.dp(16.0f);
        int i9 = measuredHeight + dp;
        int measuredHeight2 = getMeasuredHeight();
        int measuredWidth = getMeasuredWidth();
        float f10 = i9;
        if (f10 < getMinChildY()) {
            super.dispatchDraw(canvas);
            return;
        }
        float f11 = measuredHeight;
        float f12 = measuredWidth;
        int saveLayer = canvas.saveLayer(0.0f, f11, f12, f10, null);
        canvas.clipRect(0, measuredHeight, measuredWidth, i9);
        this.Y0 = measuredHeight;
        this.Z0 = i9;
        super.dispatchDraw(canvas);
        canvas.translate(0.0f, f11);
        canvas.drawRect(0.0f, 0.0f, f12, dp, this.R0);
        canvas.restoreToCount(saveLayer);
        canvas.save();
        canvas.clipRect(0, i9, measuredWidth, measuredHeight2);
        this.Y0 = i9;
        this.Z0 = getMeasuredHeight();
        super.dispatchDraw(canvas);
        canvas.restore();
        this.Y0 = TLObject.FLAG_31;
        this.Z0 = TLObject.FLAG_31;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        if (motionEvent.getAction() == 0) {
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (y10 < getMeasuredHeight() - this.X0) {
                return false;
            }
            int childCount = getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    z10 = false;
                    break;
                }
                View childAt = getChildAt(i9);
                if (childAt instanceof d) {
                    d dVar = (d) childAt;
                    if (dVar.getVisibility() == 0) {
                        float x11 = x10 - childAt.getX();
                        float y11 = y10 - childAt.getY();
                        b bVar = dVar.w;
                        if (bVar == null ? false : ((RectF) bVar.c).contains(x11, y11)) {
                            z10 = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                i9++;
            }
            if (!z10) {
                return false;
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean drawChild(Canvas canvas, View view, long j10) {
        if (this.Y0 != Integer.MIN_VALUE && view.getY() + view.getHeight() < this.Y0) {
            return true;
        }
        if (this.Z0 == Integer.MIN_VALUE || view.getY() <= this.Z0) {
            return super.drawChild(canvas, view, j10);
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        f fVar = this.Q0;
        fVar.d = true;
        int i9 = fVar.e;
        if (i9 == -1 || fVar.f == null) {
            return;
        }
        fVar.c = GroupCallMessagesController.getInstance(i9).getCallMessages(fVar.f.id);
        fVar.l();
        GroupCallMessagesController.getInstance(fVar.e).subscribeToCallMessages(fVar.f.id, fVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f fVar = this.Q0;
        fVar.d = false;
        int i9 = fVar.e;
        if (i9 == -1 || fVar.f == null) {
            return;
        }
        GroupCallMessagesController.getInstance(i9).unsubscribeFromCallMessages(fVar.f.id, fVar);
    }

    public void setBlurRoot(View view) {
        this.U0 = view;
    }

    public void setClickCellDelegate(a aVar) {
        this.W0 = aVar;
    }

    public void setDelegate(h hVar) {
        this.V0 = hVar;
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        if (getTranslationY() != f10) {
            super.setTranslationY(f10);
            invalidate();
            int childCount = getChildCount();
            for (int i9 = 0; i9 < childCount; i9++) {
                getChildAt(i9).invalidate();
            }
        }
    }

    public void setVisibleHeight(int i9) {
        if (this.X0 != i9) {
            this.X0 = i9;
            invalidate();
        }
    }
}
