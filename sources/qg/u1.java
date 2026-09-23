package qg;

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
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.bj0;
import org.telegram.ui.Components.rr;
import org.telegram.ui.Components.yi0;
import w7.x5;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class u1 extends LinearLayout {
    public final bj0[] a;
    public t1 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    public u1(Context context, boolean z10) {
        super(context);
        List list = pg.m.a;
        this.a = new bj0[list.size() + 2];
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
        int i10 = 0;
        int i11 = 0;
        while (true) {
            List list2 = pg.m.a;
            if (i10 >= list2.size() + 2) {
                return;
            }
            bj0[] bj0VarArr = this.a;
            boolean z11 = i10 == 0;
            boolean z12 = i10 == list2.size() + 1;
            bj0 bj0Var = new bj0(getContext());
            bj0Var.setPadding(AndroidUtilities.dp(z11 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z12 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            bj0Var.setLayoutParams(x5.l(1.0f, 0, 40));
            bj0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            bj0VarArr[i11] = bj0Var;
            if (i10 == 0) {
                final int i12 = 0;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: qg.s1
                    public final /* synthetic */ u1 b;

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
                                this.b.b.y();
                                break;
                        }
                    }
                });
            } else if (i10 > 0 && i10 <= list2.size()) {
                pg.m mVar = (pg.m) list2.get(i10 - 1);
                if (z10 || !(mVar instanceof pg.b)) {
                    this.a[i11].f(mVar.e(), 28, 28, null);
                    this.a[i11].setOnClickListener(new wa(this, i11, mVar, 18));
                } else {
                    i10++;
                }
            } else if (i10 == list2.size() + 1) {
                this.a[i11].setImageResource(R.drawable.msg_add);
                final int i13 = 1;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: qg.s1
                    public final /* synthetic */ u1 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        switch (i13) {
                            case 0:
                                this.b.b.a();
                                break;
                            default:
                                this.b.b.y();
                                break;
                        }
                    }
                });
            }
            addView(this.a[i11]);
            i11++;
            i10++;
        }
    }

    public final void a(int i10) {
        if (i10 >= 0) {
            bj0[] bj0VarArr = this.a;
            if (i10 >= bj0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i10) {
                bj0 bj0Var = bj0VarArr[i10];
                if (bj0Var != null) {
                    Drawable drawable = bj0Var.getDrawable();
                    if (drawable instanceof yi0) {
                        yi0 yi0Var = (yi0) drawable;
                        yi0Var.M(0);
                        yi0Var.start();
                    }
                }
                ValueAnimator valueAnimator = this.r;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                if (this.f == i10) {
                    return;
                }
                if (this.e) {
                    this.e = false;
                    AndroidUtilities.updateImageViewImageAnimated(bj0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i10;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(rr.f);
                this.r.addUpdateListener(new org.telegram.ui.Components.voip.r0(this, 9));
                this.r.addListener(new n0(this, 1));
                this.r.start();
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.b.v().i(i10 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x10 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x10 >= childAt.getLeft() && x10 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.t0(childAt, 15));
                            return true;
                        }
                    } else if (this.f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.t0(childAt, 15));
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
        int i10 = this.f;
        bj0[] bj0VarArr = this.a;
        bj0 bj0Var = bj0VarArr[i10];
        int i11 = this.h;
        bj0 bj0Var2 = i11 != -1 ? bj0VarArr[i11] : null;
        float f7 = 0.0f;
        float f10 = bj0Var2 != null ? this.n : 0.0f;
        float f11 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f11 = (f10 <= 0.25f || f10 >= 0.5f) ? org.telegram.messenger.z0.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f11) + (Math.min((bj0Var.getWidth() - bj0Var.getPaddingLeft()) - bj0Var.getPaddingRight(), (bj0Var.getHeight() - bj0Var.getPaddingTop()) - bj0Var.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (bj0Var.getWidth() / 2.0f) + bj0Var.getX();
        int i12 = this.f;
        int i13 = this.d;
        float dp2 = (i12 == i13 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width;
        float width2 = bj0Var2 != null ? (bj0Var2.getWidth() / 2.0f) + bj0Var2.getX() : 0.0f;
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f7 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(dp2, width2 + f7, f10), (bj0Var.getHeight() / 2.0f) + bj0Var.getY(), dp, this.c);
    }

    public void setDelegate(t1 t1Var) {
        this.b = t1Var;
    }

    public void setSelectedIndex(int i10) {
        this.f = i10;
        if (this.e) {
            this.e = false;
            AndroidUtilities.updateImageViewImageAnimated(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
