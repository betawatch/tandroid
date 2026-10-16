package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class v60 extends org.telegram.ui.Components.mm0 {
    public final /* synthetic */ int V2;
    public final /* synthetic */ Object W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v60(Object obj, Context context, org.telegram.ui.ActionBar.c6 c6Var, int i10) {
        super(context, c6Var);
        this.V2 = i10;
        this.W2 = obj;
    }

    @Override // org.telegram.ui.Components.mm0
    public boolean H0(View view, float f7, float f10) {
        switch (this.V2) {
            case 3:
                ((zh.r0) this.W2).getClass();
                return true;
            default:
                return super.H0(view, f7, f10);
        }
    }

    @Override // org.telegram.ui.Components.mm0
    public Integer W0(int i10) {
        int i11;
        switch (this.V2) {
            case 2:
                i11 = ((SessionsActivity) this.W2).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.c6 c6Var = this.n2;
                return i10 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.g6.m1(0.1f, org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.p7, c6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.i6, c6Var));
            default:
                return super.W0(i10);
        }
    }

    @Override // org.telegram.ui.Components.mm0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.V2) {
            case 0:
                super.dispatchDraw(canvas);
                x60 x60Var = (x60) this.W2;
                if (x60Var.z0 != null && x60Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = x60Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.m2) x60Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    x60Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 1:
                dq0 dq0Var = (dq0) this.W2;
                Paint paint = dq0Var.w;
                RectF rectF = dq0Var.s;
                RectF rectF2 = dq0Var.r;
                RectF rectF3 = dq0Var.n;
                s4.b0 b0Var = dq0Var.b;
                if (!dq0Var.f.isEmpty()) {
                    float d = dq0Var.e.d(dq0Var.d, false);
                    double d10 = d;
                    int clamp = Utilities.clamp((int) Math.floor(d10), r6.size() - 1, 0);
                    int clamp2 = Utilities.clamp((int) Math.ceil(d10), r6.size() - 1, 0);
                    View m10 = b0Var.m(clamp);
                    View m11 = b0Var.m(clamp2);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF3.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF2.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        AndroidUtilities.lerp(rectF3, rectF2, d - clamp, rectF);
                        paint.setColor(dq0Var.x);
                        float height = rectF.height() / 2.0f;
                        canvas.drawRoundRect(rectF, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.V2) {
            case 1:
                super.invalidate();
                op0 op0Var = ((dq0) this.W2).F;
                if (op0Var != null) {
                    op0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.mm0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.V2) {
            case 3:
                zh.r0 r0Var = (zh.r0) this.W2;
                r0Var.u();
                super.onLayout(z10, i10, i11, i12, i13);
                r0Var.R(2);
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v60(SessionsActivity sessionsActivity, Context context) {
        super(context, null);
        this.V2 = 2;
        this.W2 = sessionsActivity;
    }
}
