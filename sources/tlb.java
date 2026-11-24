// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class tlb extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ qmb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tlb(qmb qmbVar, Context context, int i, Rect rect) {
        super(context);
        this.c = qmbVar;
        this.a = i;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        qmb qmbVar = this.c;
        Drawable drawable = qmbVar.r;
        Rect rect = this.b;
        if (this.a == 0) {
            drawable.setBounds(qmbVar.X.getLeft() - rect.left, 0, qmbVar.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        qmbVar.r.draw(canvas);
    }
}
