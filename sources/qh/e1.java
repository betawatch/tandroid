package qh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.qt;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class e1 extends tl0 {
    public final /* synthetic */ int U2;
    public final /* synthetic */ FrameLayout V2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e1(FrameLayout frameLayout, Context context, int i10) {
        super(context, null);
        this.U2 = i10;
        this.V2 = frameLayout;
    }

    @Override // org.telegram.ui.Components.tl0
    public boolean E0(float f10) {
        switch (this.U2) {
            case 2:
                mi miVar = ((vf.c0) this.V2).b;
                return f10 >= ((float) ((AndroidUtilities.dp(30.0f) + miVar.Y1[0]) + (!miVar.d0 ? AndroidUtilities.statusBarHeight : 0)));
            default:
                return super.E0(f10);
        }
    }

    @Override // org.telegram.ui.Components.tl0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.U2) {
            case 1:
                df dfVar = (df) this.V2;
                e1 e1Var = dfVar.c;
                if (e1Var.getLayoutManager() != null && e1Var.getAdapter() != null && e1Var.getAdapter().h() != 0) {
                    float dp = dfVar.h - AndroidUtilities.dp(8.0f);
                    dfVar.e = dp - AndroidUtilities.dp(16.0f);
                    qg.b bVar = dfVar.r;
                    if (bVar != null) {
                        bVar.draw(canvas);
                    }
                    RectF rectF = AndroidUtilities.rectTmp;
                    rectF.set((getMeasuredWidth() / 2.0f) - AndroidUtilities.dp(12.0f), dp - AndroidUtilities.dp(4.0f), (getMeasuredWidth() / 2.0f) + AndroidUtilities.dp(12.0f), dp);
                    canvas.drawRoundRect(rectF, AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), dfVar.d);
                    super.dispatchDraw(canvas);
                    break;
                } else {
                    super.dispatchDraw(canvas);
                    break;
                }
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void k0(int i10, int i11) {
        int i12 = this.U2;
    }

    @Override // org.telegram.ui.Components.tl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.U2) {
            case 0:
                qt q10 = qt.q();
                i1 i1Var = (i1) this.V2;
                return super.onInterceptTouchEvent(motionEvent) || q10.r(motionEvent, i1Var.b, i1Var.f, this.m2);
            default:
                return super.onInterceptTouchEvent(motionEvent);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(vf.c0 c0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.U2 = 2;
        this.V2 = c0Var;
    }

    private final void w1(int i10, int i11) {
    }
}
