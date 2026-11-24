// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.PremiumPreviewFragment;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class ub8 extends r59 {
    public final /* synthetic */ byte f3 = 0;
    public final Paint g3;
    public final Object h3;
    public final Object i3;

    public ub8(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.g3 = paint;
        this.i3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-gm.L(10.0f));
        tb8 tb8Var = new tb8(this);
        setItemAnimator(tb8Var);
        tb8Var.C = false;
        tb8Var.m = false;
        setPadding(gm.L(12.0f), gm.L(12.0f), gm.L(12.0f), gm.L(6.0f));
        paint.setColor(2130706432);
        this.h3 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        switch (this.f3) {
            case 1:
                Path path = (Path) this.h3;
                path.rewind();
                RectF rectF = gm.P;
                rectF.set(0.0f, 0.0f, getWidth(), getHeight());
                path.addRoundRect(rectF, gm.L(16.0f), gm.L(16.0f), Path.Direction.CW);
                int w0 = cmb.w0(null, cmb.g5, false);
                Paint paint = this.g3;
                paint.setColor(w0);
                canvas.drawPath(path, paint);
                canvas.save();
                canvas.clipPath(path);
                super.dispatchDraw(canvas);
                canvas.restore();
                break;
            default:
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // r59, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (((gk8) this.i3).n.r0 < 1.0f) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        switch (this.f3) {
            case 0:
                RectF rectF = (RectF) this.i3;
                Drawable drawable = (Drawable) this.h3;
                super.onDraw(canvas);
                int childCount = getChildCount();
                if (childCount > 0) {
                    int measuredWidth = getMeasuredWidth() - gm.L(87.0f);
                    drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, gm.L(6.0f));
                    drawable.draw(canvas);
                    int i = Integer.MIN_VALUE;
                    int i2 = Integer.MAX_VALUE;
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = getChildAt(i3);
                        i2 = (int) Math.min(i2, Math.floor(childAt.getX()));
                        i = (int) Math.max(i, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
                    }
                    if (i2 != Integer.MAX_VALUE && i != Integer.MIN_VALUE) {
                        rectF.set(i2 - gm.L(6.0f), gm.L(6.0f), gm.L(6.0f) + i, gm.L(103.0f));
                        canvas.drawRoundRect(rectF, gm.L(8.0f), gm.L(8.0f), this.g3);
                        break;
                    }
                }
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 1:
                if (((gk8) this.i3).n.r0 < 1.0f) {
                    break;
                }
                break;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // r59, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        switch (this.f3) {
            case 1:
                super.onSizeChanged(i, i2, i3, i4);
                PremiumPreviewFragment premiumPreviewFragment = ((gk8) this.i3).n;
                int i5 = 0;
                int i6 = 0;
                while (true) {
                    ArrayList arrayList = premiumPreviewFragment.d;
                    if (i5 >= arrayList.size()) {
                        premiumPreviewFragment.P = i6;
                        break;
                    } else {
                        premiumPreviewFragment.N.a((ik8) arrayList.get(i5), false);
                        premiumPreviewFragment.N.measure(View.MeasureSpec.makeMeasureSpec(i, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i2, TLObject.FLAG_31));
                        ((ik8) arrayList.get(i5)).h = i6;
                        i6 += premiumPreviewFragment.N.getMeasuredHeight();
                        i5++;
                    }
                }
            default:
                super.onSizeChanged(i, i2, i3, i4);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub8(gk8 gk8Var, Context context) {
        super(context, null);
        this.i3 = gk8Var;
        Paint paint = new Paint(1);
        this.g3 = paint;
        paint.setColor(cmb.w0(null, cmb.g5, false));
        this.h3 = new Path();
    }
}
