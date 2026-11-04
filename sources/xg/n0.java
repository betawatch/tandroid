package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import b8.mf;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.z5;
import org.telegram.ui.Components.k9;
import org.telegram.ui.Components.u8;
import org.telegram.ui.j2;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n0 extends FrameLayout implements z5 {
    public final k9 a;
    public final j2 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final u8 e;

    public n0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new u8((e6) null);
        k9 k9Var = new k9(getContext());
        this.a = k9Var;
        k9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        j2 j2Var = new j2(context);
        Paint paint2 = new Paint(1);
        j2Var.b = paint2;
        j2Var.c = j2Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i3 = k6.h5;
        paint2.setColor(k6.x0(null, i3, false));
        this.b = j2Var;
        j2Var.setAlpha(0.0f);
        addView(k9Var, mf.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(j2Var, mf.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(k6.x0(null, i3, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final void updateColors() {
        this.c.setColor(k6.x0(null, k6.h5, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.z5
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
