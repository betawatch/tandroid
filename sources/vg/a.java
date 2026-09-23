package vg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final ci.d a;
    public final View b;
    public final d6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, d6 d6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = d6Var;
        View view = new View(context);
        this.b = view;
        addView(view, x5.n(-1, -1));
        ci.d dVar = new ci.d(context, d6Var, true);
        this.a = dVar;
        addView(dVar, x5.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        ci.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.g(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        this.b.setBackgroundColor(h6.v0(h6.h5, this.c));
    }

    public final void b(boolean z10) {
        this.a.setLoading(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int v02 = h6.v0(h6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(v02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        ci.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.e = false;
        ci.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.g(z10 ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
