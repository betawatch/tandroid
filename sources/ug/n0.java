package ug;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Components.h9;
import org.telegram.ui.Components.w9;
import w7.z5;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout {
    public final w9 a;
    public final o0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final h9 e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new h9((d6) null);
        w9 w9Var = new w9(getContext());
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        o0 o0Var = new o0(context);
        Paint paint2 = new Paint(1);
        o0Var.a = paint2;
        o0Var.b = o0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = h6.h5;
        paint2.setColor(h6.x0(null, i10, false));
        this.b = o0Var;
        o0Var.setAlpha(0.0f);
        addView(w9Var, z5.a(-1.0f, 5.0f, 5.0f, 5.0f, 5.0f, -1, 0));
        addView(o0Var, z5.a(28.0f, 0.0f, 0.0f, 0.0f, 3.0f, 28, 85));
        paint.setColor(h6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
