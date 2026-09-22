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
import org.telegram.ui.Components.g9;
import org.telegram.ui.Components.v9;
import w7.y5;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class o0 extends FrameLayout {
    public final v9 a;
    public final p0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final g9 e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new g9((f6) null);
        v9 v9Var = new v9(getContext());
        this.a = v9Var;
        v9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        p0 p0Var = new p0(context);
        Paint paint2 = new Paint(1);
        p0Var.a = paint2;
        p0Var.b = p0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.b = p0Var;
        p0Var.setAlpha(0.0f);
        addView(v9Var, y5.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(p0Var, y5.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
