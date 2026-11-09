package tg;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import bi.la;
import c8.ha;
import fi.v3;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.ah0;
import org.telegram.ui.Components.dh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.t81;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h1 extends LinearLayout {
    public final dh0[] a;
    public g1 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public h1(Context context, boolean z9) {
        super(context);
        List list = sg.h.a;
        this.a = new dh0[list.size() + 2];
        final int i7 = 1;
        Paint paint = new Paint(1);
        this.c = paint;
        this.f = 1;
        this.h = -1;
        this.n = 0.0f;
        final int i10 = 0;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z9 ? 1 : 0);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            List list2 = sg.h.a;
            if (i11 >= list2.size() + 2) {
                return;
            }
            dh0[] dh0VarArr = this.a;
            Object[] objArr = i11 == 0;
            Object[] objArr2 = i11 == list2.size() + 1;
            dh0 dh0Var = new dh0(getContext());
            dh0Var.setPadding(org.telegram.messenger.g0.L(objArr != false ? 0.0f : 8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(objArr2 != false ? 0.0f : 8.0f), org.telegram.messenger.g0.L(8.0f));
            dh0Var.setLayoutParams(ha.l(1.0f, 0, 40));
            dh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            dh0VarArr[i12] = dh0Var;
            if (i11 == 0) {
                this.a[i12].setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
                    public final /* synthetic */ h1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i10) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.A();
                                break;
                        }
                    }
                });
            } else if (i11 > 0 && i11 <= list2.size()) {
                sg.h hVar = (sg.h) list2.get(i11 - 1);
                if (z9 || !(hVar instanceof sg.b)) {
                    this.a[i12].f(hVar.e(), 28, 28, null);
                    this.a[i12].setOnClickListener(new la(this, i12, hVar, 22));
                } else {
                    i11++;
                }
            } else if (i11 == list2.size() + 1) {
                this.a[i12].setImageResource(R.drawable.msg_add);
                this.a[i12].setOnClickListener(new View.OnClickListener(this) { // from class: tg.f1
                    public final /* synthetic */ h1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i7) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.A();
                                break;
                        }
                    }
                });
            }
            addView(this.a[i12]);
            i12++;
            i11++;
        }
    }

    public final void a(int i7) {
        if (i7 >= 0) {
            dh0[] dh0VarArr = this.a;
            if (i7 >= dh0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i7) {
                dh0 dh0Var = dh0VarArr[i7];
                if (dh0Var != null) {
                    Drawable drawable = dh0Var.getDrawable();
                    if (drawable instanceof ah0) {
                        ah0 ah0Var = (ah0) drawable;
                        ah0Var.M(0);
                        ah0Var.start();
                    }
                }
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f == i7) {
                    return;
                }
                if (this.e) {
                    this.e = false;
                    org.telegram.messenger.g0.R3(dh0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i7;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(xq.f);
                this.r.addUpdateListener(new v3(this, 25));
                this.r.addListener(new t81(this, 16));
                this.r.start();
            }
        }
    }

    public final void b(int i7) {
        a(i7);
        this.b.x().i(i7 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i7 = 1; i7 < getChildCount() - 1; i7++) {
                View childAt = getChildAt(i7);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i7) {
                            a(i7);
                            post(new org.telegram.ui.ActionBar.j1(1, childAt));
                            return true;
                        }
                    } else if (this.f != i7) {
                        a(i7);
                        post(new org.telegram.ui.ActionBar.j1(1, childAt));
                        return true;
                    }
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i7 = this.f;
        dh0[] dh0VarArr = this.a;
        dh0 dh0Var = dh0VarArr[i7];
        int i10 = this.h;
        dh0 dh0Var2 = i10 != -1 ? dh0VarArr[i10] : null;
        float f10 = 0.0f;
        float f11 = dh0Var2 != null ? this.n : 0.0f;
        float f12 = 1.0f;
        if (f11 > 0.25f && f11 < 0.75f) {
            f12 = (f11 <= 0.25f || f11 >= 0.5f) ? k5.y(0.75f, f11, 0.25f, 1.0f) : (0.5f - f11) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f12) + (Math.min((dh0Var.getWidth() - dh0Var.getPaddingLeft()) - dh0Var.getPaddingRight(), (dh0Var.getHeight() - dh0Var.getPaddingTop()) - dh0Var.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (dh0Var.getWidth() / 2.0f) + dh0Var.getX();
        int i11 = this.f;
        int i12 = this.d;
        float L2 = (i11 == i12 + 1 ? org.telegram.messenger.g0.L(4.0f) : 0.0f) + width;
        float width2 = dh0Var2 != null ? (dh0Var2.getWidth() / 2.0f) + dh0Var2.getX() : 0.0f;
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f10 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(L2, width2 + f10, f11), (dh0Var.getHeight() / 2.0f) + dh0Var.getY(), L, this.c);
    }

    public void setDelegate(g1 g1Var) {
        this.b = g1Var;
    }

    public void setSelectedIndex(int i7) {
        this.f = i7;
        if (this.e) {
            this.e = false;
            org.telegram.messenger.g0.R3(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
