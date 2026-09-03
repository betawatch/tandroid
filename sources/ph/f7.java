package ph;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.mr;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes4.dex */
public abstract class f7 extends FrameLayout implements c2 {
    public final e7 a;
    public final FrameLayout b;
    public final TextView c;
    public final FrameLayout d;
    public final TextView e;
    public final FrameLayout f;
    public final TextView h;
    public float n;
    public float r;
    public int s;
    public ValueAnimator v;
    public Utilities.Callback w;
    public Utilities.Callback x;

    public f7(Context context) {
        super(context);
        e7 e7Var = new e7(this, context);
        this.a = e7Var;
        e7Var.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(-1);
        textView.setText(LocaleController.getString(R.string.StoryLive));
        frameLayout.addView(textView, k7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        e7Var.addView(frameLayout, k7.b6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i10 = 0;
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: ph.d7
            public final /* synthetic */ f7 b;

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
        k7.d6.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(AndroidUtilities.bold());
        textView2.setTextColor(-1);
        textView2.setText(LocaleController.getString(R.string.StoryPhoto));
        frameLayout2.addView(textView2, k7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        e7Var.addView(frameLayout2, k7.b6.r(-2, -1, 112, 0.0f, 0.0f, 6.66f, 0.0f));
        final int i11 = 1;
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: ph.d7
            public final /* synthetic */ f7 b;

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
        k7.d6.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(AndroidUtilities.bold());
        textView3.setTextColor(-1);
        textView3.setText(LocaleController.getString(R.string.StoryVideo));
        frameLayout3.addView(textView3, k7.b6.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        e7Var.addView(frameLayout3, k7.b6.t(-2, -1, 112, 0, 0, 0, 0));
        final int i12 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: ph.d7
            public final /* synthetic */ f7 b;

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
        k7.d6.a(frameLayout3);
        addView(e7Var, k7.b6.e(-2, -1, 113));
    }

    public final void a(int i10) {
        if (this.s == i10) {
            return;
        }
        this.s = i10;
        ValueAnimator valueAnimator = this.v;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i10);
        this.v = ofFloat;
        ofFloat.addUpdateListener(new nh.e5(this, 21));
        this.v.setDuration(320L);
        this.v.setInterpolator(mr.h);
        this.v.start();
    }

    public final void b(int i10) {
        if (this.s == i10) {
            return;
        }
        a(i10);
        Utilities.Callback callback = this.w;
        if (callback != null) {
            callback.run(Integer.valueOf(i10));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((w8) this).y.I()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, ph.c2
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // ph.c2
    public void setInvert(float f10) {
        this.n = f10;
        this.c.setTextColor(i0.a.d(f10, -1, -16777216));
        this.e.setTextColor(i0.a.d(f10, -1, -16777216));
        this.h.setTextColor(i0.a.d(f10, -1, -16777216));
    }

    public void setOnSwitchModeListener(Utilities.Callback<Integer> callback) {
        this.w = callback;
    }

    public void setOnSwitchingModeListener(Utilities.Callback<Float> callback) {
        this.x = callback;
    }
}
