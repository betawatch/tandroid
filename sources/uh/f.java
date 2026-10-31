package uh;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Components.zz;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f extends zz {
    public final Paint U;
    public final /* synthetic */ i V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, Context context) {
        super(context, null);
        this.V = iVar;
        this.U = new Paint();
    }

    @Override // org.telegram.ui.Components.zz
    public final int getColumnsCount() {
        return this.V.d;
    }

    @Override // org.telegram.ui.Components.zz
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.zz, android.view.View
    public final void onDraw(Canvas canvas) {
        int w02 = t6.w0(t6.d6, this.V.W.c);
        Paint paint = this.U;
        paint.setColor(w02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
