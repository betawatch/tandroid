package yf;

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
import fh.a3;
import g7.e6;
import java.util.List;
import kh.g4;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.mi0;
import org.telegram.ui.Components.pi0;
import org.telegram.ui.te1;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class r1 extends LinearLayout {
    public final pi0[] a;
    public q1 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    public r1(Context context, boolean z10) {
        super(context);
        List list = xf.m.a;
        this.a = new pi0[list.size() + 2];
        Paint paint = new Paint(1);
        this.c = paint;
        this.f = 1;
        this.h = -1;
        this.n = 0.0f;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z10 ? 1 : 0);
        int i9 = 0;
        int i10 = 0;
        while (true) {
            List list2 = xf.m.a;
            if (i9 >= list2.size() + 2) {
                return;
            }
            pi0[] pi0VarArr = this.a;
            boolean z11 = i9 == 0;
            boolean z12 = i9 == list2.size() + 1;
            pi0 pi0Var = new pi0(getContext());
            pi0Var.setPadding(AndroidUtilities.dp(z11 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z12 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            pi0Var.setLayoutParams(e6.l(1.0f, 0, 40));
            pi0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            pi0VarArr[i10] = pi0Var;
            if (i9 == 0) {
                final int i11 = 0;
                this.a[i10].setOnClickListener(new View.OnClickListener(this) { // from class: yf.p1
                    public final /* synthetic */ r1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i11) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.A();
                                break;
                        }
                    }
                });
            } else if (i9 > 0 && i9 <= list2.size()) {
                xf.m mVar = (xf.m) list2.get(i9 - 1);
                if (z10 || !(mVar instanceof xf.b)) {
                    this.a[i10].f(mVar.e(), 28, 28, null);
                    this.a[i10].setOnClickListener(new a3(this, i10, mVar, 21));
                } else {
                    i9++;
                }
            } else if (i9 == list2.size() + 1) {
                this.a[i10].setImageResource(R.drawable.msg_add);
                final int i12 = 1;
                this.a[i10].setOnClickListener(new View.OnClickListener(this) { // from class: yf.p1
                    public final /* synthetic */ r1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i12) {
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
            addView(this.a[i10]);
            i10++;
            i9++;
        }
    }

    public final void a(int i9) {
        if (i9 >= 0) {
            pi0[] pi0VarArr = this.a;
            if (i9 >= pi0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i9) {
                pi0 pi0Var = pi0VarArr[i9];
                if (pi0Var != null) {
                    Drawable drawable = pi0Var.getDrawable();
                    if (drawable instanceof mi0) {
                        mi0 mi0Var = (mi0) drawable;
                        mi0Var.K(0);
                        mi0Var.start();
                    }
                }
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f == i9) {
                    return;
                }
                if (this.e) {
                    this.e = false;
                    AndroidUtilities.updateImageViewImageAnimated(pi0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i9;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(gr.f);
                this.r.addUpdateListener(new g4(this, 20));
                this.r.addListener(new te1(this, 11));
                this.r.start();
            }
        }
    }

    public final void b(int i9) {
        a(i9);
        this.b.x().i(i9 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i9 = 1; i9 < getChildCount() - 1; i9++) {
                View childAt = getChildAt(i9);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i9) {
                            a(i9);
                            post(new pf.o1(childAt, 18));
                            return true;
                        }
                    } else if (this.f != i9) {
                        a(i9);
                        post(new pf.o1(childAt, 18));
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
        int i9 = this.f;
        pi0[] pi0VarArr = this.a;
        pi0 pi0Var = pi0VarArr[i9];
        int i10 = this.h;
        pi0 pi0Var2 = i10 != -1 ? pi0VarArr[i10] : null;
        float f10 = 0.0f;
        float f11 = pi0Var2 != null ? this.n : 0.0f;
        float f12 = 1.0f;
        if (f11 > 0.25f && f11 < 0.75f) {
            f12 = (f11 <= 0.25f || f11 >= 0.5f) ? org.telegram.messenger.l0.a(0.75f, f11, 0.25f, 1.0f) : (0.5f - f11) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f12) + (Math.min((pi0Var.getWidth() - pi0Var.getPaddingLeft()) - pi0Var.getPaddingRight(), (pi0Var.getHeight() - pi0Var.getPaddingTop()) - pi0Var.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (pi0Var.getWidth() / 2.0f) + pi0Var.getX();
        int i11 = this.f;
        int i12 = this.d;
        float dp2 = (i11 == i12 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width;
        float width2 = pi0Var2 != null ? (pi0Var2.getWidth() / 2.0f) + pi0Var2.getX() : 0.0f;
        int i13 = this.h;
        if (i13 != -1 && i13 == i12 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(dp2, width2 + f10, f11), (pi0Var.getHeight() / 2.0f) + pi0Var.getY(), dp, this.c);
    }

    public void setDelegate(q1 q1Var) {
        this.b = q1Var;
    }

    public void setSelectedIndex(int i9) {
        this.f = i9;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
