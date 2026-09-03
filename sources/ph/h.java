package ph;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.u00;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes4.dex */
public final class h extends u00 {
    public final Paint R;
    public final /* synthetic */ l S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(l lVar, Context context) {
        super(context, null);
        this.S = lVar;
        this.R = new Paint();
    }

    @Override // org.telegram.ui.Components.u00
    public final int getColumnsCount() {
        return this.S.d;
    }

    @Override // org.telegram.ui.Components.u00
    public final int getViewType() {
        setIsSingleCell(false);
        return 27;
    }

    @Override // org.telegram.ui.Components.u00, android.view.View
    public final void onDraw(Canvas canvas) {
        int v02 = k6.v0(k6.d6, this.S.T.c);
        Paint paint = this.R;
        paint.setColor(v02);
        canvas.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
        super.onDraw(canvas);
    }
}
