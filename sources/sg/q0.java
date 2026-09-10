package sg;

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
import org.telegram.ui.Components.w9;
import w7.a6;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class q0 extends FrameLayout {
    public final w9 a;
    public final r0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final g9 e;

    public q0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new g9((f6) null);
        w9 w9Var = new w9(getContext());
        this.a = w9Var;
        w9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        r0 r0Var = new r0(context);
        Paint paint2 = new Paint(1);
        r0Var.a = paint2;
        r0Var.b = r0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = j6.h5;
        paint2.setColor(j6.w0(null, i10, false));
        this.b = r0Var;
        r0Var.setAlpha(0.0f);
        addView(w9Var, a6.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(r0Var, a6.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(j6.w0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }
}
