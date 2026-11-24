// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.widget.TextView;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class rr7 extends TextView {
    public final /* synthetic */ sr7 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr7(sr7 sr7Var, Context context, int i) {
        super(context);
        this.a = sr7Var;
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        sr7 sr7Var = this.a;
        if (sr7Var.e.getAdapter() instanceof n04) {
            ((n04) sr7Var.e.getAdapter()).getClass();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void setSelected(boolean z) {
        super.setSelected(z);
        Drawable background = getBackground();
        sr7 sr7Var = this.a;
        if (background != null) {
            bkb.F1(background, sr7Var.b(z ? 0.1f : 0.05f), true);
        }
        setTextColor(sr7Var.b(z ? 0.8f : 0.6f));
    }
}
