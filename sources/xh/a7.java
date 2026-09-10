package xh;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.em;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class a7 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(int i10, Context context, org.telegram.ui.ActionBar.p2 p2Var) {
        super(context);
        this.a = i10;
        this.b = p2Var;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.a) {
            case 0:
                if (((z7) this.b).f0) {
                    return false;
                }
                return super.dispatchTouchEvent(motionEvent);
            case 3:
                int action = motionEvent.getAction();
                zh.x0 x0Var = zh.x0.Z;
                if (x0Var.G != null) {
                    MotionEvent obtain = MotionEvent.obtain(motionEvent);
                    obtain.offsetLocation(x0Var.G.getX(), x0Var.G.getY());
                    boolean dispatchTouchEvent = x0Var.G.dispatchTouchEvent(motionEvent);
                    obtain.recycle();
                    if (action == 1 || action == 3) {
                        x0Var.G = null;
                    }
                    if (dispatchTouchEvent) {
                        return true;
                    }
                }
                MotionEvent obtain2 = MotionEvent.obtain(motionEvent);
                obtain2.offsetLocation(motionEvent.getRawX() - motionEvent.getX(), motionEvent.getRawY() - motionEvent.getY());
                boolean onTouchEvent = x0Var.x.onTouchEvent(obtain2);
                obtain2.recycle();
                boolean z10 = !x0Var.x.isInProgress() && ((GestureDetector) x0Var.y.b).onTouchEvent(motionEvent);
                if (action == 1 || action == 3) {
                    x0Var.E = false;
                    x0Var.F = false;
                    o1.k kVar = x0Var.P;
                    if (!kVar.f) {
                        float f7 = x0Var.N;
                        kVar.b = f7;
                        kVar.c = true;
                        kVar.u.i = (x0Var.J / 2.0f) + f7 >= ((float) AndroidUtilities.displaySize.x) / 2.0f ? (r2 - r7) - AndroidUtilities.dp(16.0f) : AndroidUtilities.dp(16.0f);
                        x0Var.P.f();
                    }
                    o1.k kVar2 = x0Var.Q;
                    if (!kVar2.f) {
                        kVar2.b = x0Var.O;
                        kVar2.c = true;
                        kVar2.u.i = w7.q.a(r2, AndroidUtilities.dp(16.0f), (AndroidUtilities.displaySize.y - x0Var.K) - AndroidUtilities.dp(16.0f));
                        x0Var.Q.f();
                    }
                }
                return onTouchEvent || z10;
            default:
                return super.dispatchTouchEvent(motionEvent);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        switch (this.a) {
            case 3:
                AndroidUtilities.checkDisplaySize(getContext(), configuration);
                zh.x0 x0Var = zh.x0.Z;
                AndroidUtilities.setPreferredMaxRefreshRate(x0Var.b, x0Var.d, x0Var.c);
                x0Var.i();
                break;
            default:
                super.onConfigurationChanged(configuration);
                break;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 1:
                super.onLayout(z10, i10, i11, i12, i13);
                yg.s sVar = (yg.s) this.b;
                if (sVar.K && z10) {
                    sVar.w.setTranslationY(-sVar.c.getMeasuredHeight());
                    int measuredHeight = sVar.c.getMeasuredHeight();
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sVar.y.getLayoutParams();
                    marginLayoutParams.bottomMargin = measuredHeight;
                    sVar.y.setLayoutParams(marginLayoutParams);
                    break;
                }
                break;
            default:
                super.onLayout(z10, i10, i11, i12, i13);
                break;
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        switch (this.a) {
            case 3:
                super.onSizeChanged(i10, i11, i12, i13);
                Path path = (Path) this.b;
                path.rewind();
                RectF rectF = AndroidUtilities.rectTmp;
                rectF.set(0.0f, 0.0f, i10, i11);
                path.addRoundRect(rectF, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(10.0f), Path.Direction.CW);
                break;
            default:
                super.onSizeChanged(i10, i11, i12, i13);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a7(Context context) {
        super(context);
        this.a = 3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a7(Context context, String str, zh.b bVar) {
        super(context);
        this.a = 2;
        int dp = AndroidUtilities.dp(12.0f);
        int i10 = org.telegram.ui.ActionBar.j6.j5;
        setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(0.06f, bVar.F0(i10))));
        LinearLayout f7 = em.f(context, 1);
        addView(f7, w7.a6.d(-1, -2.0f, 17, 6.0f, 0.0f, 6.0f, 0.0f));
        org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(context, false, true, true);
        this.b = o6Var;
        o6Var.b(0.6f, 450L, wr.h);
        o6Var.setTextSize(AndroidUtilities.dp(17.0f));
        o6Var.setTextColor(bVar.F0(i10));
        o6Var.setScaleProperty(0.7f);
        o6Var.setGravity(17);
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setAllowCancel(true);
        f7.addView(o6Var, w7.a6.k(0.0f, 0.0f, 0.0f, 1.66f, -1, 20));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(bVar.F0(i10));
        textView.setGravity(17);
        f7.addView(textView, w7.a6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        textView.setText(str);
    }
}
