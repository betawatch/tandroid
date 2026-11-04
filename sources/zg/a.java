package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import b8.mf;
import org.telegram.messenger.bd;
import org.telegram.messenger.hs;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final gi.d a;
    public final View b;
    public final e6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, e6 e6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = e6Var;
        View view = new View(context);
        this.b = view;
        addView(view, mf.o(-1, -1));
        gi.d dVar = new gi.d(context, e6Var, true);
        this.a = dVar;
        addView(dVar, mf.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i3, boolean z10) {
        this.e = true;
        gi.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i3, z10);
        dVar.i(bd.M0(2131753193, null), z10, true);
        r6.i(k6.h5, this.b, this.c);
    }

    public final void b(boolean z10) {
        this.a.setLoading(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = k6.w0(k6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(hs.e4);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        gi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(bd.a0("Close", null, 2131752041, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.e = false;
        gi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(z10 ? bd.a0("BoostingUseLink", null, 2131753174, new Object[0]) : bd.a0("OK", null, 2131747839, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
