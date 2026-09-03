package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class sw0 extends org.telegram.ui.Components.sl0 {
    public final Paint U2;
    public final Path V2;
    public final /* synthetic */ vw0 W2;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw0(vw0 vw0Var, Context context) {
        super(context, null);
        this.W2 = vw0Var;
        Paint paint = new Paint(1);
        this.U2 = paint;
        paint.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.h5, false));
        this.V2 = new Path();
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Path path = this.V2;
        path.rewind();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        path.addRoundRect(rectF, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), Path.Direction.CW);
        canvas.drawPath(path, this.U2);
        canvas.save();
        canvas.clipPath(path);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // org.telegram.ui.Components.sl0, android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.W2.n.n0 >= 1.0f) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.W2.n.n0 >= 1.0f) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.sl0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        PremiumPreviewFragment premiumPreviewFragment = this.W2.n;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            ArrayList arrayList = premiumPreviewFragment.d;
            if (i14 >= arrayList.size()) {
                premiumPreviewFragment.L = i15;
                return;
            }
            premiumPreviewFragment.J.a((xw0) arrayList.get(i14), false);
            premiumPreviewFragment.J.measure(View.MeasureSpec.makeMeasureSpec(i10, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(i11, TLObject.FLAG_31));
            ((xw0) arrayList.get(i14)).h = i15;
            i15 += premiumPreviewFragment.J.getMeasuredHeight();
            i14++;
        }
    }
}
