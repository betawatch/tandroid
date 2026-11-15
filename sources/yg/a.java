package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ja;
import org.telegram.messenger.hd;
import org.telegram.messenger.ns;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.q6;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final hi.d a;
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
        addView(view, ja.o(-1, -1));
        hi.d dVar = new hi.d(context, e6Var, true);
        this.a = dVar;
        addView(dVar, ja.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z10) {
        this.e = true;
        hi.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i7, z10);
        dVar.i(hd.M0(2131753193, null), z10, true);
        q6.h(j6.h5, this.b, this.c);
    }

    public final void b(boolean z10) {
        this.a.setLoading(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = j6.w0(j6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(ns.e4);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        hi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(hd.a0("Close", null, 2131752041, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.e = false;
        hi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(z10 ? hd.a0("BoostingUseLink", null, 2131753174, new Object[0]) : hd.a0("OK", null, 2131747831, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
