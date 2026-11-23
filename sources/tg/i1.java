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
import bi.h5;
import c8.ma;
import hi.j3;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.f3;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.oh0;
import org.telegram.ui.Components.rh0;
import org.telegram.ui.k71;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class i1 extends LinearLayout {
    public final rh0[] a;
    public h1 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public i1(Context context, boolean z10) {
        super(context);
        List list = sg.h.a;
        this.a = new rh0[list.size() + 2];
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
        this.d = list.size() - (!z10 ? 1 : 0);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            List list2 = sg.h.a;
            if (i11 >= list2.size() + 2) {
                return;
            }
            rh0[] rh0VarArr = this.a;
            Object[] objArr = i11 == 0;
            Object[] objArr2 = i11 == list2.size() + 1;
            rh0 rh0Var = new rh0(getContext());
            rh0Var.setPadding(org.telegram.messenger.g0.L(objArr != false ? 0.0f : 8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(objArr2 != false ? 0.0f : 8.0f), org.telegram.messenger.g0.L(8.0f));
            rh0Var.setLayoutParams(ma.l(1.0f, 0, 40));
            rh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            rh0VarArr[i12] = rh0Var;
            if (i11 == 0) {
                this.a[i12].setOnClickListener(new View.OnClickListener(this) { // from class: tg.g1
                    public final /* synthetic */ i1 b;

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
                if (z10 || !(hVar instanceof sg.b)) {
                    this.a[i12].f(hVar.e(), 28, 28, null);
                    this.a[i12].setOnClickListener(new h5(this, i12, hVar, 25));
                } else {
                    i11++;
                }
            } else if (i11 == list2.size() + 1) {
                this.a[i12].setImageResource(R.drawable.msg_add);
                this.a[i12].setOnClickListener(new View.OnClickListener(this) { // from class: tg.g1
                    public final /* synthetic */ i1 b;

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
            rh0[] rh0VarArr = this.a;
            if (i7 >= rh0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i7) {
                rh0 rh0Var = rh0VarArr[i7];
                if (rh0Var != null) {
                    Drawable drawable = rh0Var.getDrawable();
                    if (drawable instanceof oh0) {
                        oh0 oh0Var = (oh0) drawable;
                        oh0Var.M(0);
                        oh0Var.start();
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
                    org.telegram.messenger.g0.P3(rh0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i7;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(nr.f);
                this.r.addUpdateListener(new j3(this, 27));
                this.r.addListener(new k71(this, 18));
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
        rh0[] rh0VarArr = this.a;
        rh0 rh0Var = rh0VarArr[i7];
        int i10 = this.h;
        rh0 rh0Var2 = i10 != -1 ? rh0VarArr[i10] : null;
        float f10 = 0.0f;
        float f11 = rh0Var2 != null ? this.n : 0.0f;
        float f12 = 1.0f;
        if (f11 > 0.25f && f11 < 0.75f) {
            f12 = (f11 <= 0.25f || f11 >= 0.5f) ? f3.y(0.75f, f11, 0.25f, 1.0f) : (0.5f - f11) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f12) + (Math.min((rh0Var.getWidth() - rh0Var.getPaddingLeft()) - rh0Var.getPaddingRight(), (rh0Var.getHeight() - rh0Var.getPaddingTop()) - rh0Var.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (rh0Var.getWidth() / 2.0f) + rh0Var.getX();
        int i11 = this.f;
        int i12 = this.d;
        float L2 = (i11 == i12 + 1 ? org.telegram.messenger.g0.L(4.0f) : 0.0f) + width;
        float width2 = rh0Var2 != null ? (rh0Var2.getWidth() / 2.0f) + rh0Var2.getX() : 0.0f;
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f10 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(L2, width2 + f10, f11), (rh0Var.getHeight() / 2.0f) + rh0Var.getY(), L, this.c);
    }

    public void setDelegate(h1 h1Var) {
        this.b = h1Var;
    }

    public void setSelectedIndex(int i7) {
        this.f = i7;
        if (this.e) {
            this.e = false;
            org.telegram.messenger.g0.P3(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
