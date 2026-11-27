// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class xu7 extends TextView {
    public final /* synthetic */ yu7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu7(yu7 yu7Var, Context context, int i) {
        super(context);
        this.a = yu7Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        yu7 yu7Var = this.a;
        if (yu7Var.e.getAdapter() instanceof i14) {
            ((i14) yu7Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        Drawable background = getBackground();
        yu7 yu7Var = this.a;
        if (background != null) {
            aob.F1(background, yu7Var.b(z ? 0.1f : 0.05f), true);
        }
        setTextColor(yu7Var.b(z ? 0.8f : 0.6f));
    }
}
