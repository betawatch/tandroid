package zf;

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
import h7.z5;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.zb1;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class r1 extends LinearLayout {
    public final ri0[] a;
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
        List list = yf.m.a;
        this.a = new ri0[list.size() + 2];
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
            List list2 = yf.m.a;
            if (i10 >= list2.size() + 2) {
                return;
            }
            ri0[] ri0VarArr = this.a;
            boolean z11 = i10 == 0;
            boolean z12 = i10 == list2.size() + 1;
            ri0 ri0Var = new ri0(getContext());
            ri0Var.setPadding(AndroidUtilities.dp(z11 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(z12 ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            ri0Var.setLayoutParams(z5.l(1.0f, 0, 40));
            ri0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ri0VarArr[i11] = ri0Var;
            if (i10 == 0) {
                final int i12 = 0;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: zf.p1
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
            } else if (i10 > 0 && i10 <= list2.size()) {
                yf.m mVar = (yf.m) list2.get(i10 - 1);
                if (z10 || !(mVar instanceof yf.b)) {
                    this.a[i11].f(mVar.e(), 28, 28, null);
                    this.a[i11].setOnClickListener(new gh.v2(this, i11, mVar, 21));
                } else {
                    i10++;
                }
            } else if (i10 == list2.size() + 1) {
                this.a[i11].setImageResource(R.drawable.msg_add);
                final int i13 = 1;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: zf.p1
                    public final /* synthetic */ r1 b;

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
                                this.b.b.A();
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
            ri0[] ri0VarArr = this.a;
            if (i10 >= ri0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i10) {
                ri0 ri0Var = ri0VarArr[i10];
                if (ri0Var != null) {
                    Drawable drawable = ri0Var.getDrawable();
                    if (drawable instanceof oi0) {
                        oi0 oi0Var = (oi0) drawable;
                        oi0Var.K(0);
                        oi0Var.start();
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
                    AndroidUtilities.updateImageViewImageAnimated(ri0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i10;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(er.f);
                this.r.addUpdateListener(new lh.m2(this, 23));
                this.r.addListener(new zb1(this, 13));
                this.r.start();
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.b.x().i(i10 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x8 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x8 >= childAt.getLeft() && x8 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new qf.b(childAt, 25));
                            return true;
                        }
                    } else if (this.f != i10) {
                        a(i10);
                        post(new qf.b(childAt, 25));
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
        ri0[] ri0VarArr = this.a;
        ri0 ri0Var = ri0VarArr[i10];
        int i11 = this.h;
        ri0 ri0Var2 = i11 != -1 ? ri0VarArr[i11] : null;
        float f10 = 0.0f;
        float f11 = ri0Var2 != null ? this.n : 0.0f;
        float f12 = 1.0f;
        if (f11 > 0.25f && f11 < 0.75f) {
            f12 = (f11 <= 0.25f || f11 >= 0.5f) ? org.telegram.messenger.y1.a(0.75f, f11, 0.25f, 1.0f) : (0.5f - f11) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f12) + (Math.min((ri0Var.getWidth() - ri0Var.getPaddingLeft()) - ri0Var.getPaddingRight(), (ri0Var.getHeight() - ri0Var.getPaddingTop()) - ri0Var.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (ri0Var.getWidth() / 2.0f) + ri0Var.getX();
        int i12 = this.f;
        int i13 = this.d;
        float dp2 = (i12 == i13 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width;
        float width2 = ri0Var2 != null ? (ri0Var2.getWidth() / 2.0f) + ri0Var2.getX() : 0.0f;
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f10 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(dp2, width2 + f10, f11), (ri0Var.getHeight() / 2.0f) + ri0Var.getY(), dp, this.c);
    }

    public void setDelegate(q1 q1Var) {
        this.b = q1Var;
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
