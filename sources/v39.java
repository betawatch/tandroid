// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class v39 extends FrameLayout implements vlb {
    public final bf0 a;
    public final kw b;
    public final Paint c;
    public TLRPC.Chat d;
    public final pc0 e;

    public v39(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.c = paint;
        this.e = new pc0((ylb) null);
        bf0 bf0Var = new bf0(getContext());
        this.a = bf0Var;
        bf0Var.setRoundRadius(gm.L(30.0f));
        kw kwVar = new kw(context);
        Paint paint2 = new Paint(1);
        kwVar.b = paint2;
        kwVar.c = kwVar.getContext().getDrawable(R.drawable.mini_boost_remove);
        int i = cmb.g5;
        paint2.setColor(cmb.w0(null, i, false));
        this.b = kwVar;
        kwVar.setAlpha(0.0f);
        addView(bf0Var, qoe.d(-1, -1.0f, 0, 5.0f, 5.0f, 5.0f, 5.0f));
        addView(kwVar, qoe.d(28, 28.0f, 85, 0.0f, 0.0f, 0.0f, 3.0f));
        paint.setColor(cmb.w0(null, i, false));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawCircle(getMeasuredWidth() / 2.0f, getMeasuredHeight() / 2.0f, (getMeasuredHeight() / 2.0f) - gm.L(2.0f), this.c);
        super.dispatchDraw(canvas);
    }

    @Override // vlb
    public final void updateColors() {
        this.c.setColor(cmb.w0(null, cmb.g5, false));
        invalidate();
    }

    @Override // vlb
    public final void addColorKeys(HashSet hashSet) {
    }
}
