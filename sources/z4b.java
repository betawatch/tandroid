// default package

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public abstract class z4b extends FrameLayout implements li4 {
    public final y4b a;
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
    public p8c x;
    public p8c y;

    public z4b(Context context) {
        super(context);
        y4b y4bVar = new y4b(this, context);
        this.a = y4bVar;
        final byte b = 0;
        y4bVar.setOrientation(0);
        FrameLayout frameLayout = new FrameLayout(context);
        this.b = frameLayout;
        TextView textView = new TextView(context);
        this.c = textView;
        final byte b2 = 1;
        textView.setTextSize(1, 14.0f);
        textView.setTypeface(gl.o());
        textView.setTextColor(-1);
        textView.setText(k96.M0(2131744391, null));
        frameLayout.addView(textView, nme.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        y4bVar.addView(frameLayout, nme.s(-2, -1, kk7.w1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout.setOnClickListener(new View.OnClickListener(this) { // from class: x4b
            public final /* synthetic */ z4b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b;
                z4b z4bVar = this.b;
                switch (b3) {
                    case 0:
                        z4bVar.b(-1);
                        break;
                    case 1:
                        z4bVar.b(0);
                        break;
                    default:
                        z4bVar.b(1);
                        break;
                }
            }
        });
        ote.a(frameLayout);
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.d = frameLayout2;
        TextView textView2 = new TextView(context);
        this.e = textView2;
        textView2.setTextSize(1, 14.0f);
        textView2.setTypeface(gl.o());
        textView2.setTextColor(-1);
        textView2.setText(k96.M0(2131744345, null));
        frameLayout2.addView(textView2, nme.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        y4bVar.addView(frameLayout2, nme.s(-2, -1, kk7.w1, 0.0f, 0.0f, 6.66f, 0.0f));
        frameLayout2.setOnClickListener(new View.OnClickListener(this) { // from class: x4b
            public final /* synthetic */ z4b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b3 = b2;
                z4b z4bVar = this.b;
                switch (b3) {
                    case 0:
                        z4bVar.b(-1);
                        break;
                    case 1:
                        z4bVar.b(0);
                        break;
                    default:
                        z4bVar.b(1);
                        break;
                }
            }
        });
        ote.a(frameLayout2);
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f = frameLayout3;
        TextView textView3 = new TextView(context);
        this.h = textView3;
        textView3.setTextSize(1, 14.0f);
        textView3.setTypeface(gl.o());
        textView3.setTextColor(-1);
        textView3.setText(k96.M0(2131744210, null));
        frameLayout3.addView(textView3, nme.d(-2, -2.0f, 80, 16.0f, 0.0f, 16.0f, 7.0f));
        y4bVar.addView(frameLayout3, nme.t(-2, -1, kk7.w1, 0, 0, 0, 0));
        final byte b3 = 2;
        frameLayout3.setOnClickListener(new View.OnClickListener(this) { // from class: x4b
            public final /* synthetic */ z4b b;

            {
                this.b = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                byte b32 = b3;
                z4b z4bVar = this.b;
                switch (b32) {
                    case 0:
                        z4bVar.b(-1);
                        break;
                    case 1:
                        z4bVar.b(0);
                        break;
                    default:
                        z4bVar.b(1);
                        break;
                }
            }
        });
        ote.a(frameLayout3);
        addView(y4bVar, nme.e(-2, -1, kk7.x1));
    }

    public final void a(int i) {
        if (this.s == i) {
            return;
        }
        this.s = i;
        ValueAnimator valueAnimator = this.w;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(this.r, i);
        this.w = ofFloat;
        ofFloat.addUpdateListener(new gja(this, (byte) 16));
        this.w.setDuration(320L);
        this.w.setInterpolator(s33.h);
        this.w.start();
    }

    public final void b(int i) {
        if (this.s != i) {
            a(i);
            p8c p8cVar = this.x;
            if (p8cVar != null) {
                p8cVar.a(Integer.valueOf(i));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (((q6b) this).E.G()) {
            return false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.View, li4
    public final void invalidate() {
        super.invalidate();
        this.a.invalidate();
    }

    @Override // li4
    public void setInvert(float f) {
        this.n = f;
        this.c.setTextColor(bm2.f(f, -1, -16777216));
        this.e.setTextColor(bm2.f(f, -1, -16777216));
        this.h.setTextColor(bm2.f(f, -1, -16777216));
    }

    public void setOnSwitchModeListener(p8c p8cVar) {
        this.x = p8cVar;
    }

    public void setOnSwitchingModeListener(p8c p8cVar) {
        this.y = p8cVar;
    }
}
