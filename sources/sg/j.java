package sg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import org.telegram.ui.ActionBar.j6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class j extends ScrollView {
    public final /* synthetic */ LinearLayout a;
    public final /* synthetic */ q b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(q qVar, Context context, LinearLayout linearLayout) {
        super(context);
        this.b = qVar;
        this.a = linearLayout;
        setWillNotDraw(false);
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float y10 = this.a.getY() + org.telegram.messenger.g0.L(1.0f);
        int L = org.telegram.messenger.g0.L(36.0f);
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set((getMeasuredWidth() - L) / 2.0f, y10, (getMeasuredWidth() + L) / 2.0f, org.telegram.messenger.g0.L(4.0f) + y10);
        j6.t0.setColor(-10790053);
        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), j6.t0);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i7, int i10) {
        super.onMeasure(i7, i10);
        ((LinearLayout.LayoutParams) this.b.m1.getLayoutParams()).height = (int) (((View.MeasureSpec.getSize(i7) - org.telegram.messenger.g0.L(24.0f)) * 0.8333333f) + org.telegram.messenger.g0.L(88.0f));
    }
}
