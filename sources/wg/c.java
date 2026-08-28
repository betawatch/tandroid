package wg;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Rect;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import g7.e6;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
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
        setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        this.a = linearLayout;
        linearLayout.setOrientation(0);
        addView(linearLayout, e6.c(-1.0f, -1));
    }

    public void setLensVisibility(float f10) {
        this.b = f10;
        int dp = AndroidUtilities.dp(f10 * 7.0f);
        Rect rect = this.c;
        Rect rect2 = this.d;
        rect2.set(rect);
        int i9 = -dp;
        rect2.inset(i9, i9);
    }
}
