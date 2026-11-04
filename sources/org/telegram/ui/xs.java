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

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class xs extends org.telegram.ui.Components.tj0 {
    public final /* synthetic */ int f3;
    public final /* synthetic */ Object g3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs(int i3, Context context, Object obj) {
        super(context, null);
        this.f3 = i3;
        this.g3 = obj;
    }

    @Override // org.telegram.ui.Components.tj0
    public Integer V0(int i3) {
        int i10;
        int i11;
        switch (this.f3) {
            case 0:
                i10 = ((DataSettingsActivity) this.g3).resetDownloadRow;
                org.telegram.ui.ActionBar.e6 e6Var = this.o2;
                return i3 == i10 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, e6Var))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var));
            case 1:
                ArrayList arrayList = ((ez) this.g3).Q;
                vy vyVar = (i3 < 0 || i3 >= arrayList.size()) ? null : (vy) arrayList.get(i3);
                org.telegram.ui.ActionBar.e6 e6Var2 = this.o2;
                return (vyVar == null || !vyVar.l) ? Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var2)) : Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.12f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, e6Var2)));
            case 7:
                i11 = ((SessionsActivity) this.g3).terminateAllSessionsRow;
                org.telegram.ui.ActionBar.e6 e6Var3 = this.o2;
                return i3 == i11 ? Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.1f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.p7, e6Var3))) : Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.i6, e6Var3));
            default:
                return super.V0(i3);
        }
    }

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        org.telegram.ui.ActionBar.k kVar;
        switch (this.f3) {
            case 2:
                if (getAdapter() == ((wz) this.g3).V) {
                    for (int i3 = 0; i3 < getChildCount(); i3++) {
                        if (T(getChildAt(i3)).f == 1) {
                            canvas.save();
                            canvas.translate(getChildAt(i3).getX(), (getChildAt(i3).getY() - getChildAt(i3).getMeasuredHeight()) + org.telegram.messenger.g0.L(2.0f));
                            getChildAt(i3).draw(canvas);
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
                e40 e40Var = (e40) this.g3;
                if (e40Var.A0 != null && e40Var.B0 >= 1.0f) {
                    canvas.save();
                    int measuredHeight = e40Var.A0.getMeasuredHeight();
                    kVar = ((org.telegram.ui.ActionBar.d2) e40Var).actionBar;
                    canvas.translate(0.0f, -(measuredHeight - kVar.getMeasuredHeight()));
                    e40Var.A0.draw(canvas);
                    canvas.restore();
                    break;
                }
                break;
            case 5:
                la0 la0Var = (la0) this.g3;
                RectF rectF = la0Var.a0;
                if (la0Var.Z != null) {
                    int L = org.telegram.messenger.g0.L(12.0f);
                    la0Var.Z.setBounds(-L, la0Var.b0 - L, getWidth() + L, getHeight() + L);
                    la0Var.Z.draw(canvas);
                    int i10 = la0Var.I0;
                    if (i10 == 0 || i10 == 1) {
                        int L2 = org.telegram.messenger.g0.L(36.0f);
                        rectF.set((getWidth() - L2) / 2.0f, org.telegram.messenger.g0.L(10.0f) + la0Var.b0, (getWidth() + L2) / 2.0f, org.telegram.messenger.g0.L(4.0f) + r4);
                        org.telegram.ui.ActionBar.k6.t0.setColor(la0Var.getThemedColor(org.telegram.ui.ActionBar.k6.wj));
                        canvas.drawRoundRect(rectF, org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.ui.ActionBar.k6.t0);
                    }
                }
                super.dispatchDraw(canvas);
                break;
            case 6:
                bm0 bm0Var = (bm0) this.g3;
                Paint paint = bm0Var.x;
                RectF rectF2 = bm0Var.s;
                RectF rectF3 = bm0Var.r;
                RectF rectF4 = bm0Var.n;
                u4.b0 b0Var = bm0Var.b;
                if (!bm0Var.f.isEmpty()) {
                    float e10 = bm0Var.e.e(false, bm0Var.d);
                    double d = e10;
                    int j10 = Utilities.j((int) Math.floor(d), r6.size() - 1, 0);
                    int j11 = Utilities.j((int) Math.ceil(d), r6.size() - 1, 0);
                    View m10 = b0Var.m(j10);
                    View m11 = b0Var.m(j11);
                    if (m10 != null || m11 != null) {
                        View view = m10 != null ? m10 : m11;
                        rectF4.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                        if (m11 != null) {
                            m10 = m11;
                        }
                        rectF3.set(m10.getLeft(), m10.getTop(), m10.getRight(), m10.getBottom());
                        org.telegram.messenger.g0.Z1(rectF4, rectF3, e10 - j10, rectF2);
                        paint.setColor(bm0Var.y);
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

    @Override // org.telegram.ui.Components.tj0, android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 5:
                if (motionEvent.getActionMasked() != 0 || motionEvent.getY() >= ((la0) this.g3).b0) {
                    break;
                }
                break;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View view, long j10) {
        switch (this.f3) {
            case 2:
                if (getAdapter() != ((wz) this.g3).V || T(view).f != 1) {
                    break;
                }
                break;
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.View
    public void invalidate() {
        switch (this.f3) {
            case 6:
                super.invalidate();
                ml0 ml0Var = ((bm0) this.g3).G;
                if (ml0Var != null) {
                    ml0Var.run();
                    break;
                }
                break;
            default:
                super.invalidate();
                break;
        }
    }

    @Override // org.telegram.ui.Components.tj0, androidx.recyclerview.widget.RecyclerView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (this.f3) {
            case 3:
                if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
                    org.telegram.messenger.g0.i3(new fz(this, 2), 250L);
                }
                break;
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean requestFocus(int i3, Rect rect) {
        switch (this.f3) {
            case 1:
                return false;
            default:
                return super.requestFocus(i3, rect);
        }
    }

    @Override // org.telegram.ui.Components.tj0
    public boolean u1(View view) {
        switch (this.f3) {
            case 3:
                return !(view instanceof yz) || ((yz) view).getDraggingProgress() <= 0.0f;
            default:
                return super.u1(view);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xs(Object obj, Context context, org.telegram.ui.ActionBar.e6 e6Var, int i3) {
        super(context, e6Var);
        this.f3 = i3;
        this.g3 = obj;
    }
}
