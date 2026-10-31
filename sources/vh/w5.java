package vh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.cd;
import org.telegram.messenger.q20;
import org.telegram.messenger.zs;
import org.telegram.ui.Components.gr;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class w5 extends FrameLayout implements y1 {
    public final v5 a;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public float n;
    public float r;
    public int s;
    public ValueAnimator w;
    public q20 x;
    public q20 y;

    public w5(Context context) {
        super(context);
        v5 v5Var = new v5(this, context);
        this.a = v5Var;
        final int i10 = 0;
        v5Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        final int i11 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setTextColor(-1);
        textView.setText(cd.L0(2131744650, null));
        frameLayout.addView(textView, w7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v5Var.addView(frameLayout, w7.b6.s(-2, -1, zs.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: vh.u5
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i10) {
                    case 0:
                        this.b.b(-1);
                        break;
                    case 1:
                        this.b.b(0);
                        break;
                    default:
                        this.b.b(1);
                        break;
                }
            }
        });
        w7.e6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(org.telegram.messenger.i0.o());
        textView2.setTextColor(-1);
        textView2.setText(cd.L0(2131744604, null));
        frameLayout2.addView(textView2, w7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v5Var.addView(frameLayout2, w7.b6.s(-2, -1, zs.x1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: vh.u5
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i11) {
                    case 0:
                        this.b.b(-1);
                        break;
                    case 1:
                        this.b.b(0);
                        break;
                    default:
                        this.b.b(1);
                        break;
                }
            }
        });
        w7.e6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(org.telegram.messenger.i0.o());
        textView3.setTextColor(-1);
        textView3.setText(cd.L0(2131744476, null));
        frameLayout3.addView(textView3, w7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        v5Var.addView(frameLayout3, w7.b6.t(-2, -1, zs.x1, 0, 0, 0, 0));
        final int i12 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: vh.u5
            public final /* synthetic */ w5 b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i12) {
                    case 0:
                        this.b.b(-1);
                        break;
                    case 1:
                        this.b.b(0);
                        break;
                    default:
                        this.b.b(1);
                        break;
                }
            }
        });
        w7.e6.a(frameLayout3);
        addView(v5Var, w7.b6.e(-2, -1, zs.y1));
    }

    public final void a(int i10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i10);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new c4(3, this));
        this.w.setDuration(320L);
        this.w.setInterpolator(gr.h);
        this.w.start();
    }

    public final void b(int i10) {
        if (this.s == i10) {
            return;
        }
        a(i10);
        q20 q20Var = this.x;
        if (q20Var != null) {
            q20Var.a(Integer.valueOf(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((l7) this).D.H()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, vh.y1
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // vh.y1
    public void setInvert(float f7) {
        this.n = f7;
        this.c.setTextColor(i0.b.f(f7, -1, -16777216));
        this.e.setTextColor(i0.b.f(f7, -1, -16777216));
        this.h.setTextColor(i0.b.f(f7, -1, -16777216));
    }

    public void setOnSwitchModeListener(q20 q20Var) {
        this.x = q20Var;
    }

    public void setOnSwitchingModeListener(q20 q20Var) {
        this.y = q20Var;
    }
}
