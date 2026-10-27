package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.j9;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.y9;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class o0 extends FrameLayout implements p6 {
    public final y9 a;
    public final p0 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final j9 e;

    public o0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new j9((u6) null);
        y9 y9Var = new y9(getContext());
        this.a = y9Var;
        y9Var.setRoundRadius(AndroidUtilities.dp(30.0f));
        p0 p0Var = new p0(context);
        Paint paint2 = new Paint(1);
        p0Var.a = paint2;
        p0Var.b = p0Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i10 = y6.h5;
        paint2.setColor(y6.x0(null, i10, false));
        this.b = p0Var;
        p0Var.setAlpha(0.0f);
        addView(y9Var, kb1.h(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(p0Var, kb1.h(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(y6.x0(null, i10, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - AndroidUtilities.dp(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final void updateColors() {
        this.c.setColor(y6.x0(null, y6.h5, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.p6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
