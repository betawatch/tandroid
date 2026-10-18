package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class v01 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public s01 b;
    public s01 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public v01(ProfileActivity profileActivity, s01 s01Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = s01Var;
    }

    public final boolean a() {
        s01 s01Var = this.b;
        if (!s01Var.b || this.h < 1.0f) {
            return false;
        }
        if (s01Var.c.getLottieAnimation() != null) {
            this.b.c.getLottieAnimation().N(0, false, false);
            this.b.c.getLottieAnimation().H(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(s01 s01Var) {
        if (this.b == s01Var || s01Var == null) {
            return;
        }
        ArrayList arrayList = s01Var.e;
        if (this.r) {
            this.c = s01Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((u01) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        s01 s01Var2 = this.b;
        ArrayList arrayList2 = s01Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && s01Var2.i) {
            s01Var2.b(true);
            s01Var2.i = false;
        }
        this.b = s01Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((u01) arrayList.get(i11)).setParentView(this);
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
                ((u01) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        s01 s01Var = this.b;
        ArrayList arrayList = s01Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && s01Var.i) {
            s01Var.b(true);
            s01Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            boolean z10 = true;
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((u01) this.b.e.get(i10)).setParentView(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new sy0(this, 4));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.clamp(this.h + (Utilities.clamp(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                jy0 jy0Var = profileActivity.a;
                int i11 = profileActivity.V2;
                PointF pointF = this.d;
                float f7 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= jy0Var.getChildCount()) {
                            break;
                        }
                        View childAt = jy0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.b9)) {
                            wh.n nVar = ((org.telegram.ui.Cells.b9) childAt).a;
                            pointF.set(nVar.getX() + childAt.getX() + jy0Var.getX() + AndroidUtilities.dp(12.0f), (nVar.getMeasuredHeight() / 2.0f) + nVar.getY() + childAt.getY() + jy0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f10 = qy.f();
                this.b.c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.b.c.draw(canvas);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    u01 u01Var = (u01) this.b.d.get(size);
                    float f11 = size;
                    float cascade = AndroidUtilities.cascade(this.h, f11, this.b.d.size(), 1.8f);
                    float f12 = dp;
                    float f13 = 0.88f * f12;
                    boolean z11 = z10;
                    float c10 = com.google.android.gms.internal.play_billing.k3.c(f13, this.b.d.size() - 1, getWidth(), f7);
                    float f14 = pointF.x;
                    float f15 = f7;
                    float f16 = pointF.y;
                    float f17 = ((c10 - f14) * cascade) + (f13 * f11) + f14;
                    float pow = f16 - ((f16 + f12) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.bs.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f18 = (f12 / f15) * interpolation;
                    float f19 = f12 * interpolation;
                    u01Var.setImageCoords(f17 - f18, pow - f18, f19, f19);
                    u01Var.draw(canvas);
                    size--;
                    z10 = z11;
                    f7 = f15;
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
