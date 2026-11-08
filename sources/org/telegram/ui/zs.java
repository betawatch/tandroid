package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class zs extends org.telegram.ui.Components.pj0 {
    public final /* synthetic */ int e3;
    public final /* synthetic */ Object f3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(int i7, Context context, Object obj) {
        super(context, null);
        this.e3 = i7;
        this.f3 = obj;
    }

    @Override // org.telegram.ui.Components.pj0
    public Integer V0(int i7) {
        int i10;
        int i11;
        switch (this.e3) {
            case 0:
                i10 = ((DataSettingsActivity) this.f3).resetDownloadRow;
                org.telegram.ui.ActionBar.f6 f6Var = this.n2;
                return i7 == i10 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, f6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var));
            case 1:
                ArrayList arrayList = ((gz) this.f3).P;
                yy yyVar = (i7 < 0 || i7 >= arrayList.size()) ? null : (yy) arrayList.get(i7);
                org.telegram.ui.ActionBar.f6 f6Var2 = this.n2;
                return (yyVar == null || !yyVar.l) ? Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, f6Var2)));
            case 7:
                i11 = ((SessionsActivity) this.f3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.f6 f6Var3 = this.n2;
                return i7 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, f6Var3))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, f6Var3));
            default:
                return super.V0(i7);
        }
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.e3) {
            case 2:
                if (getAdapter() == ((yz) this.f3).U) {
                    for (int i7 = 0; i7 < getChildCount(); i7++) {
                        if (T(getChildAt(i7)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i7).getX(), (getChildAt(i7).getY() - getChildAt(i7).getMeasuredHeight()) + org.telegram.messenger.g0.L(2.0f));
                            getChildAt(i7).draw(canvas);
                            canvas.restore();
                            invalidate();
                        }
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 3:
            default:
                super.dispatchDraw(canvas);
                break;
            case 4:
                super.dispatchDraw(canvas);
                j40 j40Var = (j40) this.f3;
                if (j40Var.z0 != null && j40Var.A0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = j40Var.z0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.f2) j40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    j40Var.z0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 5:
                pa0 pa0Var = (pa0) this.f3;
                RectF rectF = pa0Var.Z;
                if (pa0Var.Y != null) {
                    int L = org.telegram.messenger.g0.L(12.0f);
                    pa0Var.Y.setBounds(-L, pa0Var.a0 - L, getWidth() + L, getHeight() + L);
                    pa0Var.Y.draw(canvas);
                    int i10 = pa0Var.H0;
                    if (i10 == 0 || i10 == 1) {
                        int L2 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L2) / 2.0f, org.telegram.messenger.g0.L(10.0f) + pa0Var.a0, (getWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + r4);
                        org.telegram.ui.ActionBar.k6.t0.setColor(pa0Var.getThemedColor(org.telegram.ui.ActionBar.k6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 6:
                gm0 gm0Var = (gm0) this.f3;
                Paint paint = gm0Var.x;
                RectF rectF2 = gm0Var.s;
                RectF rectF3 = gm0Var.r;
                RectF rectF4 = gm0Var.n;
                v4.b0 b0Var = gm0Var.b;
                if (!gm0Var.f.isEmpty()) {
                    float e10 = gm0Var.e.e(false, gm0Var.d);
                    double d = e10;
                    int j3 = Utilities.j((int) Math.floor(d), r6.size() - 1, 0);
                    int j10 = Utilities.j((int) Math.ceil(d), r6.size() - 1, 0);
                    View m10 = b0Var.m(j3);
                    View m11 = b0Var.m(j10);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF3.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        org.telegram.messenger.g0.Z1(rectF4, rectF3, e10 - j3, rectF2);
                        paint.setColor(gm0Var.y);
                        float height = rectF2.height() / 2.0f;
                        canvas.drawRoundRect(rectF2, height, height, paint);
                        super.dispatchDraw(canvas);
                        break;
                    }
                }
                super.dispatchDraw(canvas);
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 5:
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((pa0) this.f3).a0) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j3) {
        switch (this.e3) {
            case 2:
                if (getAdapter() != ((yz) this.f3).U || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j3);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.e3) {
            case 6:
                super.invalidate();
                rl0 rl0Var = ((gm0) this.f3).F;
                if (rl0Var != null) {
                    rl0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.pj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.e3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.i3(new hz(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i7, Rect rect) {
        switch (this.e3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i7, rect);
        }
    }

    @Override // org.telegram.ui.Components.pj0
    public boolean u1(View view) {
        switch (this.e3) {
            case 3:
                return !(view instanceof a00) || ((a00) view).getDraggingProgress() <= 0.0f;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zs(Object obj, Context context, org.telegram.ui.ActionBar.f6 f6Var, int i7) {
        super(context, f6Var);
        this.e3 = i7;
        this.f3 = obj;
    }
}
