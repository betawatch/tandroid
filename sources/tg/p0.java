package tg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f9;
import org.telegram.ui.Components.u9;
import w7.x5;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p0 extends FrameLayout {
    public final u9 a;
    public final q0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final f9 e;

    public p0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new f9((f6) null);
        u9 u9Var = new u9(getContext());
        this.a = u9Var;
        u9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        q0 q0Var = new q0(context);
        Paint paint2 = new Paint(1);
        q0Var.a = paint2;
        q0Var.b = q0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.b = q0Var;
        q0Var.setAlpha(0.0f);
        addView(u9Var, x5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(q0Var, x5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
