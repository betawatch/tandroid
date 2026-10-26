package sg;

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
import bi.pa;
import fi.e4;
import java.util.List;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.R;
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.fc1;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class t1 extends LinearLayout {
    public final ak0[] a;
    public s1 b;
    public final Paint c;
    public final int d;
    public boolean e;
    public int f;
    public int h;
    public float n;
    public ValueAnimator r;

    /* JADX WARN: Multi-variable type inference failed */
    public t1(Context context, boolean z10) {
        super(context);
        List list = rg.m.a;
        this.a = new ak0[list.size() + 2];
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
            List list2 = rg.m.a;
            if (i10 >= list2.size() + 2) {
                return;
            }
            ak0[] ak0VarArr = this.a;
            Object[] objArr = i10 == 0;
            Object[] objArr2 = i10 == list2.size() + 1;
            ak0 ak0Var = new ak0(getContext());
            ak0Var.setPadding(AndroidUtilities.dp(objArr != false ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(objArr2 != false ? 0.0f : 8.0f), AndroidUtilities.dp(8.0f));
            ak0Var.setLayoutParams(gb1.p(1.0f, 0, 40));
            ak0Var.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
            ak0VarArr[i11] = ak0Var;
            if (i10 == 0) {
                final int i12 = 0;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: sg.r1
                    public final /* synthetic */ t1 b;

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
                                this.b.b.z();
                                break;
                        }
                    }
                });
            } else if (i10 > 0 && i10 <= list2.size()) {
                rg.m mVar = (rg.m) list2.get(i10 - 1);
                if (z10 || !(mVar instanceof rg.b)) {
                    this.a[i11].f(mVar.e(), 28, 28, null);
                    this.a[i11].setOnClickListener(new pa(this, i11, mVar, 22));
                } else {
                    i10++;
                }
            } else if (i10 == list2.size() + 1) {
                this.a[i11].setImageResource(R.drawable.msg_add);
                final int i13 = 1;
                this.a[i11].setOnClickListener(new View.OnClickListener(this) { // from class: sg.r1
                    public final /* synthetic */ t1 b;

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
                                this.b.b.z();
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
            ak0[] ak0VarArr = this.a;
            if (i10 >= ak0VarArr.length) {
                return;
            }
            if (this.r == null || this.h != i10) {
                ak0 ak0Var = ak0VarArr[i10];
                if (ak0Var != null) {
                    Drawable drawable = ak0Var.getDrawable();
                    if (drawable instanceof xj0) {
                        xj0 xj0Var = (xj0) drawable;
                        xj0Var.M(0);
                        xj0Var.start();
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
                    AndroidUtilities.updateImageViewImageAnimated(ak0VarArr[this.d + 1], R.drawable.msg_add);
                }
                this.h = i10;
                this.n = 0.0f;
                ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(250L);
                this.r = duration;
                duration.setInterpolator(ds.f);
                this.r.addUpdateListener(new e4(this, 20));
                this.r.addListener(new fc1(this, 17));
                this.r.start();
            }
        }
    }

    public final void b(int i10) {
        a(i10);
        this.b.w().i(i10 - 1, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0 || motionEvent.getAction() == 2 || motionEvent.getAction() == 1) {
            float x9 = motionEvent.getX();
            motionEvent.getY();
            for (int i10 = 1; i10 < getChildCount() - 1; i10++) {
                View childAt = getChildAt(i10);
                if (x9 >= childAt.getLeft() && x9 <= childAt.getRight()) {
                    if (this.r != null) {
                        if (this.h != i10) {
                            a(i10);
                            post(new org.telegram.ui.web.h1(childAt, 17));
                            return true;
                        }
                    } else if (this.f != i10) {
                        a(i10);
                        post(new org.telegram.ui.web.h1(childAt, 17));
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
        ak0[] ak0VarArr = this.a;
        ak0 ak0Var = ak0VarArr[i10];
        int i11 = this.h;
        ak0 ak0Var2 = i11 != -1 ? ak0VarArr[i11] : null;
        float f7 = 0.0f;
        float f10 = ak0Var2 != null ? this.n : 0.0f;
        float f11 = 1.0f;
        if (f10 > 0.25f && f10 < 0.75f) {
            f11 = (f10 <= 0.25f || f10 >= 0.5f) ? org.telegram.messenger.t.y(0.75f, f10, 0.25f, 1.0f) : (0.5f - f10) / 0.25f;
        }
        float dp = (AndroidUtilities.dp(3.0f) * f11) + (Math.min((ak0Var.getWidth() - ak0Var.getPaddingLeft()) - ak0Var.getPaddingRight(), (ak0Var.getHeight() - ak0Var.getPaddingTop()) - ak0Var.getPaddingBottom()) / 2.0f) + AndroidUtilities.dp(3.0f);
        float width = (ak0Var.getWidth() / 2.0f) + ak0Var.getX();
        int i12 = this.f;
        int i13 = this.d;
        float dp2 = (i12 == i13 + 1 ? AndroidUtilities.dp(4.0f) : 0.0f) + width;
        float width2 = ak0Var2 != null ? (ak0Var2.getWidth() / 2.0f) + ak0Var2.getX() : 0.0f;
        int i14 = this.h;
        if (i14 != -1 && i14 == i13 + 1) {
            f7 = AndroidUtilities.dp(4.0f);
        }
        canvas.drawCircle(AndroidUtilities.lerp(dp2, width2 + f7, f10), (ak0Var.getHeight() / 2.0f) + ak0Var.getY(), dp, this.c);
    }

    public void setDelegate(s1 s1Var) {
        this.b = s1Var;
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
