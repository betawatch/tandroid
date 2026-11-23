package wg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import c8.na;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.Components.a9;
import org.telegram.ui.Components.p9;
import org.telegram.ui.i2;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class m0 extends FrameLayout implements c6 {
    public final p9 a;
    public final i2 b;
    public final Paint c;
    public TLRPC.Chat d;
    public final a9 e;

    public m0(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new a9((i6) null);
        p9 p9Var = new p9(getContext());
        this.a = p9Var;
        p9Var.setRoundRadius(org.telegram.messenger.g0.L(30.0f));
        i2 i2Var = new i2(context);
        Paint paint2 = new Paint(1);
        i2Var.b = paint2;
        i2Var.c = i2Var.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i7 = n6.h5;
        paint2.setColor(n6.x0(null, i7, false));
        this.b = i2Var;
        i2Var.setAlpha(0.0f);
        addView(p9Var, na.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(i2Var, na.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(n6.x0(null, i7, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - org.telegram.messenger.g0.L(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final void updateColors() {
        this.c.setColor(n6.x0(null, n6.h5, false));
        invalidate();
    }

    @Override // org.telegram.ui.ActionBar.c6
    public final /* synthetic */ void addColorKeys(HashSet hashSet) {
    }
}
