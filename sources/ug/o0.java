package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.z9;
import w7.a6;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class o0 extends FrameLayout {
    public final z9 a;
    public final p0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final k9 e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new k9((c6) null);
        z9 z9Var = new z9(getContext());
        this.a = z9Var;
        z9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        p0 p0Var = new p0(context);
        Paint paint2 = new Paint(1);
        p0Var.a = paint2;
        p0Var.b = p0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = g6.h5;
        paint2.setColor(g6.x0(null, i10, false));
        this.b = p0Var;
        p0Var.setAlpha(0.0f);
        addView(z9Var, a6.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView(p0Var, a6.a(28.0f, 0.0f, 0.0f, 0.0f, 3.0f, 28, 85));
        paint.setColor(g6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
