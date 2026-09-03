package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public final class z4 extends FrameLayout {
    public final /* synthetic */ int a;
    public final Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z4(Object obj, Context context, Object obj2, int i10) {
        super(context);
        this.a = i10;
        this.c = obj;
        this.b = obj2;
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        boolean z4;
        switch (this.a) {
            case 0:
                Path path = (Path) this.b;
                a5 a5Var = (a5) this.c;
                if (a5Var.h == null || (!((z4 = a5Var.f) && view == a5Var.d) && (z4 || view != a5Var.c))) {
                    return super.drawChild(canvas, view, j10);
                }
                float measuredWidth = ((z4 ? a5Var.e : 1.0f - a5Var.e) * getMeasuredWidth()) / 2.0f;
                canvas.save();
                path.rewind();
                path.addCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, measuredWidth, Path.Direction.CW);
                canvas.clipPath(path);
                boolean drawChild = super.drawChild(canvas, view, j10);
                canvas.restore();
                return drawChild;
            default:
                return super.drawChild(canvas, view, j10);
        }
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.a) {
            case 2:
                super.invalidate();
                ((zf.h) this.c).invalidate();
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        switch (this.a) {
            case 1:
                ViewGroup viewGroup = (ViewGroup) this.b;
                tf.d dVar = (tf.d) this.c;
                if (!dVar.H || !dVar.G) {
                    int size = View.MeasureSpec.getSize(i11);
                    if (size == 0) {
                        size = viewGroup.getMeasuredHeight();
                    }
                    if (size == 0) {
                        size = (AndroidUtilities.displaySize.y - org.telegram.ui.ActionBar.k.getCurrentActionBarHeight()) - AndroidUtilities.statusBarHeight;
                    }
                    int dp = AndroidUtilities.dp(50.0f);
                    int dp2 = dVar.v != 0 ? 0 : AndroidUtilities.dp(30.0f) + dp;
                    if (!dVar.B && !dVar.w) {
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
    public boolean onTouchEvent(MotionEvent motionEvent) {
        DisplayMetrics displayMetrics;
        float f10;
        switch (this.a) {
            case 2:
                zf.h hVar = (zf.h) this.c;
                zf.c cVar = hVar.r;
                boolean onTouchEvent = ((GestureDetector) ((zz) this.b).b).onTouchEvent(motionEvent);
                if (motionEvent.getAction() == 0) {
                    AndroidUtilities.runOnUIThread(cVar, 200L);
                } else if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    AndroidUtilities.cancelRunOnUIThread(cVar);
                    if (!hVar.h) {
                        o1.k kVar = hVar.c.u;
                        if (((float) kVar.i) >= getWidth() / 2.0f) {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = 2.14748365E9f;
                        } else {
                            displayMetrics = getResources().getDisplayMetrics();
                            f10 = -2.14748365E9f;
                        }
                        kVar.i = zf.h.a(displayMetrics, f10);
                        hVar.d.u.i = zf.h.b(getResources().getDisplayMetrics(), (float) hVar.d.u.i);
                        hVar.c.f();
                        hVar.d.f();
                    }
                    hVar.n = false;
                    hVar.f = false;
                    hVar.h = false;
                }
                return onTouchEvent;
            default:
                return super.onTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationX(f10);
                ((zf.h) this.c).invalidate();
                break;
            default:
                super.setTranslationX(f10);
                break;
        }
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        switch (this.a) {
            case 2:
                super.setTranslationY(f10);
                ((zf.h) this.c).invalidate();
                break;
            default:
                super.setTranslationY(f10);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z4(a5 a5Var, Context context) {
        super(context);
        this.a = 0;
        this.c = a5Var;
        this.b = new Path();
    }
}
