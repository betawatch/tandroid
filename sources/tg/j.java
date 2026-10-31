package tg;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import g.y;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m50;
import org.telegram.ui.nb1;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class j implements ug.a {
    public final ViewGroup c;
    public final m50 d;
    public final ViewGroup e;
    public boolean h;
    public final RectF a = new RectF();
    public final PointF b = new PointF();
    public final RectF f = new RectF();

    public j(ViewGroup viewGroup, ViewGroup viewGroup2, m50 m50Var) {
        this.c = viewGroup;
        this.d = m50Var;
        this.e = viewGroup2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ug.a
    public final void d(Canvas canvas, RectF rectF) {
        long uptimeMillis = SystemClock.uptimeMillis();
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (zg.h.b(viewGroup, viewGroup2, pointF)) {
            canvas.save();
            canvas.clipRect(rectF);
            canvas.translate(pointF.x, pointF.y);
            if (!(viewGroup instanceof ug.a) || this.h) {
                for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                    View childAt = viewGroup.getChildAt(i10);
                    RectF rectF2 = this.a;
                    if (zg.h.c(childAt, viewGroup2, rectF2) && rectF2.intersect(rectF)) {
                        m50 m50Var = this.d;
                        int i11 = m50Var.a;
                        Object obj = m50Var.b;
                        switch (i11) {
                            case 0:
                                ((tk0) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                            case 1:
                                ProfileActivity profileActivity = (ProfileActivity) obj;
                                if (childAt == profileActivity.N) {
                                    break;
                                } else {
                                    profileActivity.a.drawChild(canvas, childAt, uptimeMillis);
                                    break;
                                }
                            default:
                                ((nb1) obj).drawChild(canvas, childAt, uptimeMillis);
                                break;
                        }
                    }
                }
            } else {
                RectF rectF3 = this.f;
                rectF3.set(rectF);
                rectF.offset(-pointF.x, -pointF.y);
                ((ug.a) viewGroup).d(canvas, rectF);
                rectF.set(rectF3);
            }
            canvas.restore();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ug.a
    public final void g(y yVar, RectF rectF) {
        ViewGroup viewGroup = this.c;
        ViewGroup viewGroup2 = this.e;
        PointF pointF = this.b;
        if (!zg.h.b(viewGroup, viewGroup2, pointF)) {
            yVar.b = true;
            return;
        }
        if (!(viewGroup instanceof ug.a) || this.h) {
            yVar.b = true;
            return;
        }
        yVar.c(pointF.x);
        yVar.c(pointF.y);
        RectF rectF2 = this.f;
        rectF2.set(rectF);
        rectF.offset(-pointF.x, -pointF.y);
        ((ug.a) viewGroup).g(yVar, rectF);
        rectF.set(rectF2);
    }
}
