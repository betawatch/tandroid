package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.na;
import org.telegram.messenger.gd;
import org.telegram.messenger.ks;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.u6;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final hi.e a;
    public final View b;
    public final i6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, i6 i6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = i6Var;
        View view = new View(context);
        this.b = view;
        addView(view, na.o(-1, -1));
        hi.e eVar = new hi.e(context, i6Var, true);
        this.a = eVar;
        addView(eVar, na.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z10) {
        this.e = true;
        hi.e eVar = this.a;
        eVar.k();
        eVar.setShowZero(true);
        eVar.setEnabled(true);
        eVar.c(i7, z10);
        eVar.i(gd.N0(2131753190, null), z10, true);
        u6.h(n6.h5, this.b, this.c);
    }

    public final void b(boolean z10) {
        this.a.setLoading(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = n6.w0(n6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(ks.e4);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        hi.e eVar = this.a;
        eVar.setShowZero(false);
        eVar.setEnabled(true);
        eVar.i(gd.a0("Close", null, 2131752029, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.e = false;
        hi.e eVar = this.a;
        eVar.setShowZero(false);
        eVar.setEnabled(true);
        eVar.i(z10 ? gd.a0("BoostingUseLink", null, 2131753171, new Object[0]) : gd.a0("OK", null, 2131747637, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
