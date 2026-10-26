package xg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes4.dex */
public final class a extends FrameLayout {
    public final fi.d a;
    public final View b;
    public final u6 c;
    public final Paint d;
    public boolean e;

    public a(Context context, u6 u6Var) {
        super(context);
        this.d = new Paint(1);
        this.c = u6Var;
        View view = new View(context);
        this.b = view;
        addView(view, gb1.r(-1, -1));
        fi.d dVar = new fi.d(context, u6Var, true);
        this.a = dVar;
        addView(dVar, gb1.h(-1, 48.0f, 17, 14.0f, 0.0f, 14.0f, 0.0f));
    }

    public final void a(int i10, boolean z10) {
        this.e = true;
        fi.d dVar = this.a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(true);
        dVar.b(i10, z10);
        dVar.i(LocaleController.getString(R.string.BoostingStartGiveaway), z10, true);
        f7.i(y6.h5, this.b, this.c);
    }

    public final void b(boolean z10) {
        this.a.setLoading(z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
        if (this.e) {
            int w02 = y6.w0(y6.a7, this.c);
            Paint paint = this.d;
            paint.setColor(w02);
            paint.setAlpha(255);
            canvas.drawRect(0.0f, 0.0f, getWidth(), 1.0f, paint);
        }
    }

    public void setCloseStyle(boolean z10) {
        this.e = false;
        fi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(LocaleController.formatString("Close", R.string.Close, new Object[0]), false, true);
        this.e = z10;
    }

    public void setOkStyle(boolean z10) {
        this.e = false;
        fi.d dVar = this.a;
        dVar.setShowZero(false);
        dVar.setEnabled(true);
        dVar.i(z10 ? LocaleController.formatString("BoostingUseLink", R.string.BoostingUseLink, new Object[0]) : LocaleController.formatString("OK", R.string.OK, new Object[0]), false, true);
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.a.setOnClickListener(onClickListener);
    }
}
