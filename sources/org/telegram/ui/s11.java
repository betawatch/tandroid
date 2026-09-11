package org.telegram.ui;

import android.graphics.Canvas;
import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class s11 extends View {
    public static final String[] s = {"🎉", "🎆", "🎈"};
    public final ProfileActivity a;
    public p11 b;
    public p11 c;
    public final PointF d;
    public boolean e;
    public boolean f;
    public float h;
    public long n;
    public boolean r;

    public s11(ProfileActivity profileActivity, p11 p11Var) {
        super(profileActivity.getParentActivity());
        this.d = new PointF();
        this.h = 1.0f;
        this.r = false;
        this.a = profileActivity;
        this.b = p11Var;
    }

    public final boolean a() {
        p11 p11Var = this.b;
        if (!p11Var.b || this.h < 1.0f) {
            return false;
        }
        if (p11Var.c.getLottieAnimation() != null) {
            this.b.c.getLottieAnimation().L(0, false, false);
            this.b.c.getLottieAnimation().F(true);
        }
        this.r = true;
        this.h = 0.0f;
        invalidate();
        return true;
    }

    public final void b(p11 p11Var) {
        if (this.b == p11Var || p11Var == null) {
            return;
        }
        ArrayList arrayList = p11Var.e;
        if (this.r) {
            this.c = p11Var;
            return;
        }
        if (this.f) {
            for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                ((r11) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        p11 p11Var2 = this.b;
        ArrayList arrayList2 = p11Var2.j;
        arrayList2.remove(this);
        if (arrayList2.isEmpty() && p11Var2.i) {
            p11Var2.b(true);
            p11Var2.i = false;
        }
        this.b = p11Var;
        if (this.f) {
            return;
        }
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            ((r11) arrayList.get(i11)).setParentView(this);
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
                ((r11) this.b.e.get(i10)).setParentView(null);
            }
            this.f = false;
        }
        p11 p11Var = this.b;
        ArrayList arrayList = p11Var.j;
        arrayList.remove(this);
        if (arrayList.isEmpty() && p11Var.i) {
            p11Var.b(true);
            p11Var.i = false;
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.b.b) {
            if (!this.f) {
                for (int i10 = 0; i10 < this.b.e.size(); i10++) {
                    ((r11) this.b.e.get(i10)).setParentView(this);
                }
                this.f = true;
                if (!this.e) {
                    this.e = true;
                    post(new f01(this, 3));
                }
            }
            if (this.r) {
                long currentTimeMillis = System.currentTimeMillis();
                this.h = Utilities.clamp(this.h + (Utilities.clamp(currentTimeMillis - this.n, 20L, 0L) / 4200.0f), 1.0f, 0.0f);
                this.n = currentTimeMillis;
                ProfileActivity profileActivity = this.a;
                gz0 gz0Var = profileActivity.a;
                int i11 = profileActivity.U2;
                PointF pointF = this.d;
                float f7 = 2.0f;
                if (i11 >= 0) {
                    int i12 = 0;
                    while (true) {
                        if (i12 >= gz0Var.getChildCount()) {
                            break;
                        }
                        View childAt = gz0Var.getChildAt(i12);
                        if (i11 == RecyclerView.R(childAt) && (childAt instanceof org.telegram.ui.Cells.c9)) {
                            wh.p pVar = ((org.telegram.ui.Cells.c9) childAt).a;
                            pointF.set(pVar.getX() + childAt.getX() + gz0Var.getX() + AndroidUtilities.dp(12.0f), (pVar.getMeasuredHeight() / 2.0f) + pVar.getY() + childAt.getY() + gz0Var.getY());
                            break;
                        }
                        i12++;
                    }
                }
                float f10 = gz.f();
                this.b.c.setImageCoords((getWidth() - AndroidUtilities.dp(f10)) / 2.0f, Math.max(0.0f, pointF.y - (AndroidUtilities.dp(f10) * 0.5f)), AndroidUtilities.dp(f10), AndroidUtilities.dp(f10));
                canvas.save();
                canvas.scale(-1.0f, 1.0f, getWidth() / 2.0f, 0.0f);
                this.b.c.draw(canvas);
                this.b.c.setAlpha(1.0f - ((this.h - 0.9f) / 0.1f));
                canvas.restore();
                int dp = AndroidUtilities.dp(110.0f);
                int size = this.b.d.size() - 1;
                while (size >= 0) {
                    r11 r11Var = (r11) this.b.d.get(size);
                    float f11 = size;
                    float cascade = AndroidUtilities.cascade(this.h, f11, this.b.d.size(), 1.8f);
                    float f12 = dp;
                    float f13 = 0.88f * f12;
                    float v = com.google.android.gms.internal.vision.e2.v(f13, this.b.d.size() - 1, getWidth(), f7);
                    float f14 = pointF.x;
                    float f15 = pointF.y;
                    float f16 = ((v - f14) * cascade) + (f13 * f11) + f14;
                    float pow = f15 - ((f15 + f12) * ((float) Math.pow(this.h, 2.0d)));
                    float interpolation = org.telegram.ui.Components.pr.h.getInterpolation(Utilities.clamp(cascade / 0.4f, 1.0f, 0.0f));
                    float f17 = (f12 / 2.0f) * interpolation;
                    float f18 = f12 * interpolation;
                    r11Var.setImageCoords(f16 - f17, pow - f17, f18, f18);
                    r11Var.draw(canvas);
                    size--;
                    f7 = 2.0f;
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
