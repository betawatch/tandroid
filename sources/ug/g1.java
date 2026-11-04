package ug;

import ai.h3;
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
import b8.mf;
import gi.j3;
import java.util.List;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.k5;
import org.telegram.ui.Components.ch0;
import org.telegram.ui.Components.fh0;
import org.telegram.ui.Components.xq;
import org.telegram.ui.i81;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g1 extends LinearLayout {
    public final fh0[] a;
    public f1 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public g1(Context context, boolean z10) {
        super(context);
        List list = tg.h.a;
        this.a = new fh0[list.size() + 2];
        final int i3 = 1;
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
            List list2 = tg.h.a;
            if (i11 >= list2.size() + 2) {
                return;
            }
            fh0[] fh0VarArr = this.a;
            Object[] objArr = i11 == 0;
            Object[] objArr2 = i11 == list2.size() + 1;
            fh0 fh0Var = new fh0(getContext());
            fh0Var.setPadding(org.telegram.messenger.g0.L(objArr != false ? 0.0f : 8.0f), org.telegram.messenger.g0.L(8.0f), org.telegram.messenger.g0.L(objArr2 != false ? 0.0f : 8.0f), org.telegram.messenger.g0.L(8.0f));
            fh0Var.setLayoutParams(mf.l(1.0f, 0, 40));
            fh0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            fh0VarArr[i12] = fh0Var;
            if (i11 == 0) {
                this.a[i12].setOnClickListener(new View.OnClickListener(this) { // from class: ug.e1
                    public final /* synthetic */ g1 b;

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
                                this.b.b.z();
                                break;
                        }
                    }
                });
            } else if (i11 > 0 && i11 <= list2.size()) {
                tg.h hVar = (tg.h) list2.get(i11 - 1);
                if (z10 || !(hVar instanceof tg.b)) {
                    this.a[i12].f(hVar.e(), 28, 28, null);
                    this.a[i12].setOnClickListener(new h3(this, i12, hVar, 24));
                } else {
                    i11++;
                }
            } else if (i11 == list2.size() + 1) {
                this.a[i12].setImageResource(R.drawable.msg_add);
                this.a[i12].setOnClickListener(new View.OnClickListener(this) { // from class: ug.e1
                    public final /* synthetic */ g1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i3) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.z();
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

    public final void a(int i3) {
        if (i3 >= 0) {
            fh0[] fh0VarArr = this.a;
            if (i3 >= fh0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i3) {
                fh0 fh0Var = fh0VarArr[i3];
                if (fh0Var != null) {
                    Drawable drawable = fh0Var.getDrawable();
                    if (drawable instanceof ch0) {
                        ch0 ch0Var = (ch0) drawable;
                        ch0Var.M(0);
                        ch0Var.start();
                    }
                }
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f == i3) {
                    return;
                }
                if (this.e) {
                    this.e = false;
                    org.telegram.messenger.g0.R3(fh0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i3;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(xq.f);
                this.r.addUpdateListener(new j3(this, 26));
                this.r.addListener(new i81(this, 17));
                this.r.start();
            }
        }
    }

    public final void b(int i3) {
        a(i3);
        this.b.w().i(i3 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i3 = 1; i3 < getChildCount() - 1; i3++) {
                View childAt = getChildAt(i3);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i3) {
                            a(i3);
                            post(new org.telegram.ui.ActionBar.i1(1, childAt));
                            return true;
                        }
                    } else if (this.f != i3) {
                        a(i3);
                        post(new org.telegram.ui.ActionBar.i1(1, childAt));
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
        int i3 = this.f;
        fh0[] fh0VarArr = this.a;
        fh0 fh0Var = fh0VarArr[i3];
        int i10 = this.h;
        fh0 fh0Var2 = i10 != -1 ? fh0VarArr[i10] : null;
        float f10 = 0.0f;
        float f11 = fh0Var2 != null ? this.n : 0.0f;
        float f12 = 1.0f;
        if (f11 > 0.25f && f11 < 0.75f) {
            f12 = (f11 <= 0.25f || f11 >= 0.5f) ? k5.y(0.75f, f11, 0.25f, 1.0f) : (0.5f - f11) / 0.25f;
        }
        float L = (org.telegram.messenger.g0.L(3.0f) * f12) + (Math.min((fh0Var.getWidth() - fh0Var.getPaddingLeft()) - fh0Var.getPaddingRight(), (fh0Var.getHeight() - fh0Var.getPaddingTop()) - fh0Var.getPaddingBottom()) / 2.0f) + org.telegram.messenger.g0.L(3.0f);
        float width = (fh0Var.getWidth() / 2.0f) + fh0Var.getX();
        int i11 = this.f;
        int i12 = this.d;
        float L2 = (i11 == i12 + 1 ? org.telegram.messenger.g0.L(4.0f) : 0.0f) + width;
        float width2 = fh0Var2 != null ? (fh0Var2.getWidth() / 2.0f) + fh0Var2.getX() : 0.0f;
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f10 = org.telegram.messenger.g0.L(4.0f);
        }
        canvas.drawCircle(org.telegram.messenger.g0.T1(L2, width2 + f10, f11), (fh0Var.getHeight() / 2.0f) + fh0Var.getY(), L, this.c);
    }

    public void setDelegate(f1 f1Var) {
        this.b = f1Var;
    }

    public void setSelectedIndex(int i3) {
        this.f = i3;
        if (this.e) {
            this.e = false;
            org.telegram.messenger.g0.R3(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
