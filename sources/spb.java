// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-82e92c8d6e9f76ce11a67e998f2cb2e6668f272649ee2c368e632fe79babc943 */
/* loaded from: classes2.dex */
public final class spb extends FrameLayout {
    public final /* synthetic */ int a;
    public final /* synthetic */ Rect b;
    public final /* synthetic */ pqb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spb(pqb pqbVar, Context context, int i, Rect rect) {
        super(context);
        this.c = pqbVar;
        this.a = i;
        this.b = rect;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        pqb pqbVar = this.c;
        Drawable drawable = pqbVar.r;
        Rect rect = this.b;
        if (this.a == 0) {
            drawable.setBounds(pqbVar.X.getLeft() - rect.left, 0, pqbVar.X.getRight() + rect.right, getMeasuredHeight());
        } else {
            drawable.setBounds(-rect.left, 0, getMeasuredWidth() + rect.right, getMeasuredHeight());
        }
        pqbVar.r.draw(canvas);
    }
}
