package rf;

import android.content.Context;
import android.graphics.Canvas;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class d extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        switch (this.a) {
            case 2:
                jf.b0 b0Var = (jf.b0) this.c;
                b0Var.b(g6.l1(0.65f, g6.v0(g6.d6, (c6) this.b)));
                b0Var.draw(canvas);
                super.dispatchDraw(canvas);
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 2:
                super.dispatchTouchEvent(motionEvent);
                return true;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 1:
                super.invalidate();
                ((xf.j) this.c).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 0:
                ViewGroup viewGroup = (ViewGroup) this.b;
                e eVar = (e) this.c;
                if (!eVar.G || !eVar.F) {
                    int size = View.MeasureSpec.getSize(i11);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.l.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int dp = AndroidUtilities.dp(50.0f);
                    int dp2 = eVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + dp;
                    if (!eVar.A && !eVar.w) {
                        dp2 += dp;
                    }
                    int paddingTop = (size - viewGroup.getPaddingTop()) - viewGroup.getPaddingBottom();
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(dp2 < paddingTop ? paddingTop - dp2 : 0, TLObject.FLAG_30));
                    break;
                } else {
                    super.onMeasure(i10, i11);
                    break;
                }
                break;
            default:
                super.onMeasure(i10, i11);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 2:
                super.onSizeChanged(i10, i11, i12, i13);
                jf.b0 b0Var = (jf.b0) this.c;
                b0Var.setBounds(0, 0, i10, i11);
                b0Var.c(0, AndroidUtilities.dp(24.0f) + getPaddingBottom());
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f9;
        switch (this.a) {
            case 1:
                xf.j jVar = (xf.j) this.c;
                xf.d dVar = jVar.r;
                boolean onTouchEvent = ((GestureDetector) ((o4.g) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(dVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(dVar);
                    if (!jVar.h) {
                        o1.l lVar = jVar.c.u;
                        if (((float) lVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f9 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f9 = -2.14748365E9f;
                        }
                        lVar.i = xf.j.a(displayMetrics, f9);
                        jVar.d.u.i = xf.j.b(getResources().getDisplayMetrics(), (float) jVar.d.u.i);
                        jVar.c.f();
                        jVar.d.f();
                    }
                    jVar.n = false;
                    jVar.f = false;
                    jVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f9) {
        switch (this.a) {
            case 1:
                super.setTranslationX(f9);
                ((xf.j) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f9);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f9) {
        switch (this.a) {
            case 1:
                super.setTranslationY(f9);
                ((xf.j) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f9);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Context context, c6 c6Var) {
        super(context);
        this.a = 2;
        this.c = new jf.b0(8);
        this.b = c6Var;
    }
}
