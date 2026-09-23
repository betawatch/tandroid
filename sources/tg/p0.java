package tg;

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
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public final w9 a;
    public final q0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final h9 e;

    public p0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new h9((d6) null);
        w9 w9Var = new w9(getContext());
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        q0 q0Var = new q0(context);
        Paint paint2 = new Paint(1);
        q0Var.a = paint2;
        q0Var.b = q0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = h6.h5;
        paint2.setColor(h6.w0(null, i10, false));
        this.b = q0Var;
        q0Var.setAlpha(0.0f);
        addView(w9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(q0Var, x5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(h6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
