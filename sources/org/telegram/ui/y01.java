package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class y01 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public v01 b;
    public v01 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public y01(ProfileActivity profileActivity, v01 v01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = v01Var;
    }

    public final boolean a() {
        v01 v01Var = this.b;
        if (!v01Var.b || this.h < 1.0f) {
            return false;
        }
        if (v01Var.c.getLottieAnimation() != null) {
            this.b.c.getLottieAnimation().L(0, false, false);
            this.b.c.getLottieAnimation().F(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(v01 v01Var) {
        if (this.b == v01Var || v01Var == null) {
            return;
        }
        ArrayList arrayList = v01Var.e;
        if (this.r) {
            this.c = v01Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((x01) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        v01 v01Var2 = this.b;
        ArrayList arrayList2 = v01Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && v01Var2.i) {
            v01Var2.b(true);
            v01Var2.i = false;
        }
        this.b = v01Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((x01) arrayList.get(i11)).setParentView(this);
        }
        this.f = true;
    }

    @Override // android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.b.j.add(this);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((x01) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        v01 v01Var = this.b;
        ArrayList arrayList = v01Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && v01Var.i) {
            v01Var.b(true);
            v01Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((x01) this.b.e.get(i10)).setParentView(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new vy0(this, 4));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.clamp(this.h + (Utilities.clamp(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                my0 my0Var = profileActivity.a;
                int i11 = profileActivity.R2;
                PointF pointF = this.d;
                float f10 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= my0Var.getChildCount()) {
                            break;
                        }
                        View childAt = my0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.y8)) {
                            ih.s sVar = ((org.telegram.ui.Cells.y8) childAt).a;
                            pointF.set(sVar.getX() + childAt.getX() + my0Var.getX() + AndroidUtilities.dp(12.0f), (sVar.getMeasuredHeight() / 2.0f) + sVar.getY() + childAt.getY() + my0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f11 = bz.f();
                this.b.c.setImageCoords((getWidth() - AndroidUtilities.dp(f11)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f11) * 0.5f)), AndroidUtilities.dp(f11), AndroidUtilities.dp(f11));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.b.c.draw(canvas);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    x01 x01Var = (x01) this.b.d.get(size);
                    float f12 = size;
                    float cascade = AndroidUtilities.cascade(this.h, f12, this.b.d.size(), 1.8f);
                    float f13 = dp;
                    float f14 = 0.88f * f13;
                    float d = e2.c.d(f14, this.b.d.size() - 1, getWidth(), f10);
                    float f15 = pointF.x;
                    float f16 = pointF.y;
                    float f17 = ((d - f15) * cascade) + (f14 * f12) + f15;
                    float pow = f16 - ((f16 + f13) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.nr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f18 = (f13 / 2.0f) * interpolation;
                    float f19 = f13 * interpolation;
                    x01Var.setImageCoords(f17 - f18, pow - f18, f19, f19);
                    x01Var.draw(canvas);
                    size--;
                    f10 = 2.0f;
                }
                if (this.h < 1.0f) {
                    invalidate();
                    return;
                }
                this.r = false;
                b(this.c);
                this.c = null;
            }
        }
    }
}
