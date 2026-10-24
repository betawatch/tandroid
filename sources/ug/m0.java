package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.z5;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout implements b6 {
    public final w9 a;
    public final n0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final h9 e;

    public m0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new h9((g6) null);
        w9 w9Var = new w9(getContext());
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        n0 n0Var = new n0(context);
        Paint paint2 = new Paint(1);
        n0Var.a = paint2;
        n0Var.b = n0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = k6.h5;
        paint2.setColor(k6.x0(null, i10, false));
        this.b = n0Var;
        n0Var.setAlpha(0.0f);
        addView(w9Var, z5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(n0Var, z5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final void updateColors() {
        this.c.setColor(k6.x0(null, k6.h5, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.b6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
