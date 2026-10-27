package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class yu0 extends org.telegram.ui.Components.nm0 {
    public final Drawable f3;
    public final Paint g3;
    public final RectF h3;

    public yu0(Context context) {
        super(context, null);
        Paint paint = new Paint(1);
        this.g3 = paint;
        this.h3 = new RectF();
        setWillNotDraw(false);
        setClipToPadding(false);
        setTranslationY(-AndroidUtilities.dp(10.0f));
        xu0 xu0Var = new xu0(this);
        setItemAnimator(xu0Var);
        xu0Var.C = false;
        xu0Var.m = false;
        setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(6.0f));
        paint.setColor(2130706432);
        this.f3 = context.getResources().getDrawable(R.drawable.photo_tooltip2).mutate();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int childCount = getChildCount();
        if (childCount > 0) {
            int measuredWidth = getMeasuredWidth() - AndroidUtilities.dp(87.0f);
            Drawable drawable = this.f3;
            drawable.setBounds(measuredWidth, 0, drawable.getIntrinsicWidth() + measuredWidth, AndroidUtilities.dp(6.0f));
            drawable.draw(canvas);
            int i10 = Integer.MIN_VALUE;
            int i11 = Integer.MAX_VALUE;
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                i11 = (int) Math.min(i11, Math.floor(childAt.getX()));
                i10 = (int) Math.max(i10, Math.ceil(childAt.getX() + childAt.getMeasuredWidth()));
            }
            if (i11 == Integer.MAX_VALUE || i10 == Integer.MIN_VALUE) {
                return;
            }
            float dp = i11 - AndroidUtilities.dp(6.0f);
            float dp2 = AndroidUtilities.dp(6.0f);
            float dp3 = AndroidUtilities.dp(6.0f) + i10;
            float dp4 = AndroidUtilities.dp(103.0f);
            RectF rectF = this.h3;
            rectF.set(dp, dp2, dp3, dp4);
            canvas.drawRoundRect(rectF, AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.g3);
        }
    }
}
