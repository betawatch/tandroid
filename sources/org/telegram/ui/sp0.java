package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class sp0 extends FrameLayout {
    public int E;
    public dp0 F;
    public ch.d G;
    public ch.d H;
    public boolean I;
    public final Path J;
    public int K;
    public final /* synthetic */ tp0 L;
    public final l60 a;
    public final s4.c0 b;
    public final w7 c;
    public int d;
    public final org.telegram.ui.Components.e6 e;
    public final ArrayList f;
    public fp0 h;
    public final RectF n;
    public final RectF r;
    public final RectF s;
    public final Paint v;
    public final Paint w;
    public int x;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sp0(tp0 tp0Var, Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context);
        this.L = tp0Var;
        this.f = new ArrayList();
        this.n = new RectF();
        this.r = new RectF();
        this.s = new RectF();
        this.v = new Paint(1);
        this.w = new Paint(1);
        this.J = new Path();
        this.K = TLObject.FLAG_31;
        l60 l60Var = new l60(this, context, d6Var, 1);
        this.a = l60Var;
        l60Var.setClipToPadding(false);
        l60Var.setClipChildren(false);
        l60Var.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(4.0f));
        l60Var.setOverScrollMode(2);
        l60Var.setHorizontalScrollBarEnabled(false);
        l60Var.setItemAnimator(null);
        s4.c0 c0Var = new s4.c0(0, false);
        this.b = c0Var;
        l60Var.setLayoutManager(c0Var);
        w7 w7Var = new w7(this, 5);
        this.c = w7Var;
        l60Var.setAdapter(w7Var);
        l60Var.setOnItemClickListener(new i(this, 20));
        addView(l60Var, w7.y5.e(-1, -1, 119));
        setHorizontalScrollBarEnabled(false);
        setClipToPadding(false);
        setClipChildren(false);
        this.e = new org.telegram.ui.Components.e6(l60Var, 0L, 320L, org.telegram.ui.Components.rr.h);
    }

    public final void a(int i10, boolean z10) {
        int i11 = this.d;
        this.d = i10;
        if (!z10) {
            this.e.d(i10, true);
        }
        b(i11);
        if (i10 != i11) {
            b(i10);
        }
        ArrayList arrayList = this.f;
        boolean isEmpty = arrayList.isEmpty();
        l60 l60Var = this.a;
        if (!isEmpty) {
            int clamp = Utilities.clamp(i10, arrayList.size() - 1, 0);
            if (z10) {
                l60Var.x0(clamp);
            } else {
                l60Var.u0(clamp);
            }
        }
        l60Var.invalidate();
    }

    public final void b(int i10) {
        View m10 = this.b.m(i10);
        if (m10 instanceof TextView) {
            ((TextView) m10).setTextColor(i10 == this.d ? this.E : this.y);
            m10.invalidate();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        yf.p.g(this.G, 0, 0, getWidth(), getHeight());
        yf.p.g(this.H, 0, 0, getWidth(), getHeight());
        (this.I ? this.H : this.G).draw(canvas);
        canvas.save();
        canvas.clipPath(this.J);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), TLObject.FLAG_30), i11);
    }

    @Override // android.view.View
    public final void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        int dp = AndroidUtilities.dp(3.0f);
        Path path = this.J;
        path.rewind();
        float f7 = dp;
        path.addRoundRect(f7, f7, i10 - dp, i11 - dp, AndroidUtilities.dp(18.0f) - dp, AndroidUtilities.dp(18.0f) - dp, Path.Direction.CW);
    }
}
