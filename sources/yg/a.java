package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import c8.ha;
import org.telegram.messenger.id;
import org.telegram.messenger.qs;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t6;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class a extends FrameLayout {
    public final fi.d a;
    public final View b;
    public final h6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, h6 h6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = h6Var;
        View view = new View(context);
        this.b = view;
        addView(view, ha.o(-1, -1));
        fi.d dVar = new fi.d(context, h6Var, true);
        this.a = dVar;
        addView(dVar, ha.d(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i7, boolean z9) {
        this.e = true;
        fi.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.c(i7, z9);
        dVar.i(id.M0(2131753193, null), z9, true);
        t6.h(m6.h5, this.b, this.c);
    }

    public final void b(boolean z9) {
        this.a.setLoading(z9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = m6.w0(m6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(qs.e4);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z9) {
        this.e = false;
        fi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(id.a0("Close", null, 2131752041, new Object[0]), false, true);
        this.e = z9;
    }

    public void setOkStyle(boolean z9) {
        this.e = false;
        fi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(z9 ? id.a0("BoostingUseLink", null, 2131753174, new Object[0]) : id.a0("OK", null, 2131747831, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
