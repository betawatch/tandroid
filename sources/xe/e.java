package xe;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLObject;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.LaunchActivity;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class e extends ViewGroup {
    public final ze.e a;

    public e(LaunchActivity launchActivity, ze.e eVar) {
        super(launchActivity);
        this.a = eVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        ze.e eVar = this.a;
        Path path = eVar.m;
        float f10 = (1.0f - eVar.o) * eVar.j.e;
        boolean z10 = f10 > 1.0f;
        canvas.drawColor(i0.a.k(f6.w0(null, f6.d6, false), (int) Math.min(eVar.o * 420.0f, 255.0f)));
        eVar.d.a(canvas, 1.0f);
        if (z10) {
            RectF rectF = eVar.l;
            if (eVar.k != f10) {
                eVar.k = f10;
                rectF.set(eVar.c);
                path.reset();
                path.addRoundRect(rectF, f10, f10, Path.Direction.CW);
                path.close();
            }
            canvas.save();
            canvas.clipPath(path);
        }
        super.dispatchDraw(canvas);
        eVar.e.a(canvas, 1.0f - eVar.o);
        if (z10) {
            canvas.restore();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        for (int i13 = 0; i13 < getChildCount(); i13++) {
            View childAt = getChildAt(i13);
            Rect rect = this.a.c;
            childAt.layout(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i9, int i10) {
        int size = View.MeasureSpec.getSize(i9);
        int size2 = View.MeasureSpec.getSize(i10);
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(size, TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(size2, TLObject.FLAG_30));
        boolean z10 = ((a) getParent()).d;
        ze.e eVar = this.a;
        Rect rect = eVar.c;
        if (z10) {
            rect.set(0, 0, size, size2);
        } else {
            rect.set(eVar.b);
        }
        for (int i11 = 0; i11 < getChildCount(); i11++) {
            getChildAt(i11).measure(View.MeasureSpec.makeMeasureSpec(eVar.c.width(), TLObject.FLAG_30), View.MeasureSpec.makeMeasureSpec(eVar.c.height(), TLObject.FLAG_30));
        }
    }
}
