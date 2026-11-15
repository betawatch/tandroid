package qh;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import c8.ja;
import org.telegram.messenger.g0;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public abstract class c extends FrameLayout {
    public final LinearLayout a;
    public float b;
    public final Rect c;
    public final Rect d;
    public final Paint e;

    public c(Context context) {
        super(context);
        this.c = new Rect();
        this.d = new Rect();
        this.e = new Paint(1);
        setPadding(g0.L(8.0f), g0.L(8.0f), g0.L(8.0f), g0.L(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, ja.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.b = f10;
        int L = g0.L(f10 * 7.0f);
        Rect rect = this.c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i7 = -L;
        rect2.inset(i7, i7);
    }
}
