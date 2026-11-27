// default package

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
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final class rv7 extends LinearLayout {
    public final e29[] a;
    public qv7 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public rv7(Context context, boolean z) {
        super(context);
        List list = v01.a;
        this.a = new e29[list.size() + 2];
        final byte b = 1;
        Paint paint = new Paint(1);
        this.c = paint;
        this.f = 1;
        this.h = -1;
        this.n = 0.0f;
        final byte b2 = 0;
        setOrientation(0);
        setGravity(16);
        setWillNotDraw(false);
        setClipToPadding(false);
        paint.setColor(822083583);
        this.d = list.size() - (!z ? 1 : 0);
        int i = 0;
        int i2 = 0;
        while (true) {
            List list2 = v01.a;
            if (i >= list2.size() + 2) {
                return;
            }
            e29[] e29VarArr = this.a;
            Object[] objArr = i == 0;
            Object[] objArr2 = i == list2.size() + 1;
            e29 e29Var = new e29(getContext());
            e29Var.setPadding(hl.L(objArr != false ? 0.0f : 8.0f), hl.L(8.0f), hl.L(objArr2 != false ? 0.0f : 8.0f), hl.L(8.0f));
            e29Var.setLayoutParams(tre.l(1.0f, 0, 40));
            e29Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            e29VarArr[i2] = e29Var;
            if (i == 0) {
                this.a[i2].setOnClickListener(new View.OnClickListener(this) { // from class: ov7
                    public final /* synthetic */ rv7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b2;
                        rv7 rv7Var = this.b;
                        switch (b3) {
                            case 0:
                                rv7Var.b.a();
                                break;
                            default:
                                rv7Var.b.z();
                                break;
                        }
                    }
                });
            } else if (i > 0 && i <= list2.size()) {
                v01 v01Var = (v01) list2.get(i - 1);
                if (z || !(v01Var instanceof p01)) {
                    this.a[i2].f(v01Var.d(), 28, 28, null);
                    this.a[i2].setOnClickListener(new ae((Object) this, i2, (Object) v01Var, (byte) 11));
                } else {
                    i++;
                }
            } else if (i == list2.size() + 1) {
                this.a[i2].setImageResource(R.drawable.msg_add);
                this.a[i2].setOnClickListener(new View.OnClickListener(this) { // from class: ov7
                    public final /* synthetic */ rv7 b;

                    {
                        this.b = this;
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        byte b3 = b;
                        rv7 rv7Var = this.b;
                        switch (b3) {
                            case 0:
                                rv7Var.b.a();
                                break;
                            default:
                                rv7Var.b.z();
                                break;
                        }
                    }
                });
            }
            addView(this.a[i2]);
            i2++;
            i++;
        }
    }

    public final void a(int i) {
        if (i >= 0) {
            e29[] e29VarArr = this.a;
            if (i < e29VarArr.length) {
                if (this.r == null || this.h != i) {
                    e29 e29Var = e29VarArr[i];
                    byte b = 0;
                    if (e29Var != null) {
                        Drawable drawable = e29Var.getDrawable();
                        if (drawable instanceof b29) {
                            b29 b29Var = (b29) drawable;
                            b29Var.H(0);
                            b29Var.start();
                        }
                    }
                    ValueAnimator valueAnimator = this.r;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    if (this.f != i) {
                        if (this.e) {
                            this.e = false;
                            hl.L3(e29VarArr[this.d + 1], R.drawable.msg_add);
                        }
                        this.h = i;
                        this.n = 0.0f;
                        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                        this.r = duration;
                        duration.setInterpolator(k43.f);
                        this.r.addUpdateListener(new pv7(this, b));
                        this.r.addListener(new ad5(this, (byte) 21));
                        this.r.start();
                    }
                }
            }
        }
    }

    public final void b(int i) {
        a(i);
        this.b.w().i(i - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x = motionEvent.getX();
            motionEvent.getY();
            for (int i = 1; i < getChildCount() - 1; i++) {
                View childAt = getChildAt(i);
                if (x >= childAt.getLeft() && x <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i) {
                            a(i);
                            post(new vc(childAt, (byte) 3));
                            return true;
                        }
                    } else if (this.f != i) {
                        a(i);
                        post(new vc(childAt, (byte) 3));
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
        int i = this.f;
        e29[] e29VarArr = this.a;
        e29 e29Var = e29VarArr[i];
        int i2 = this.h;
        e29 e29Var2 = i2 != -1 ? e29VarArr[i2] : null;
        float f = 0.0f;
        float f2 = e29Var2 != null ? this.n : 0.0f;
        float f3 = 1.0f;
        if (f2 > 0.25f && f2 < 0.75f) {
            f3 = (f2 <= 0.25f || f2 >= 0.5f) ? qd4.x(0.75f, f2, 0.25f, 1.0f) : (0.5f - f2) / 0.25f;
        }
        float L = (hl.L(3.0f) * f3) + (Math.min((e29Var.getWidth() - e29Var.getPaddingLeft()) - e29Var.getPaddingRight(), (e29Var.getHeight() - e29Var.getPaddingTop()) - e29Var.getPaddingBottom()) / 2.0f) + hl.L(3.0f);
        float width = (e29Var.getWidth() / 2.0f) + e29Var.getX();
        int i3 = this.f;
        int i4 = this.d;
        float L2 = (i3 == i4 + 1 ? hl.L(4.0f) : 0.0f) + width;
        float width2 = e29Var2 != null ? (e29Var2.getWidth() / 2.0f) + e29Var2.getX() : 0.0f;
        int i5 = this.h;
        if (i5 != -1 && i5 == i4 + 1) {
            f = hl.L(4.0f);
        }
        canvas.drawCircle(hl.R1(L2, width2 + f, f2), (e29Var.getHeight() / 2.0f) + e29Var.getY(), L, this.c);
    }

    public void setDelegate(qv7 qv7Var) {
        this.b = qv7Var;
    }

    public void setSelectedIndex(int i) {
        this.f = i;
        if (this.e) {
            this.e = false;
            hl.L3(this.a[this.d + 1], R.drawable.msg_add);
        }
        invalidate();
    }
}
