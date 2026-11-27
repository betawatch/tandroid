// default package

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import org.telegram.messenger.beta.R;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes2.dex */
public final class q29 extends FrameLayout {
    public final e29 a;
    public final e29 b;
    public final hf0 c;
    public m88 d;
    public p29 e;
    public int f;

    public q29(Activity activity) {
        super(activity);
        this.f = 0;
        setWillNotDraw(false);
        e29 e29Var = new e29(activity);
        this.a = e29Var;
        e29 e29Var2 = new e29(activity);
        this.b = e29Var2;
        e29Var.f(R.raw.star_stroke, 37, 37, null);
        e29Var2.f(R.raw.star_fill, 37, 37, null);
        e29Var2.setAlpha(0.0f);
        addView(e29Var, tre.c(37.0f, 37));
        addView(e29Var2, tre.c(37.0f, 37));
        hf0 h0 = aob.h0(hl.L(37.0f), 0, vm2.o(-1, 76));
        this.c = h0;
        h0.setCallback(this);
        setClickable(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        p29 p29Var;
        int action = motionEvent.getAction();
        byte b = 0;
        if (action == 0) {
            p29 p29Var2 = this.e;
            if (p29Var2 != null) {
                q29[] q29VarArr = (q29[]) ((jo0) ((jz7) p29Var2).b).d;
                while (true) {
                    if (b > this.f) {
                        break;
                    }
                    q29 q29Var = q29VarArr[b];
                    e29 e29Var = q29Var.a;
                    e29 e29Var2 = q29Var.b;
                    e29Var.animate().alpha(0.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    e29Var2.animate().alpha(1.0f).scaleX(0.8f).scaleY(0.8f).setDuration(250L).start();
                    b++;
                }
                for (int i = r7 + 1; i < q29VarArr.length; i++) {
                    q29 q29Var2 = q29VarArr[i];
                    e29 e29Var3 = q29Var2.a;
                    e29 e29Var4 = q29Var2.b;
                    e29Var3.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    e29Var4.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
        } else if (action == 1) {
            p29 p29Var3 = this.e;
            if (p29Var3 != null) {
                q29[] q29VarArr2 = (q29[]) ((jo0) ((jz7) p29Var3).b).d;
                for (int i2 = 0; i2 <= this.f; i2++) {
                    q29 q29Var3 = q29VarArr2[i2];
                    e29 e29Var5 = q29Var3.a;
                    e29 e29Var6 = q29Var3.b;
                    e29Var5.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                    e29Var6.animate().scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                }
            }
            if (this.d != null) {
                int[] iArr = new int[2];
                getLocationOnScreen(iArr);
                int i3 = iArr[0];
                int i4 = iArr[1];
                m88 m88Var = this.d;
                float width = (getWidth() / 2.0f) + i3;
                float height = (getHeight() / 2.0f) + i4;
                int i5 = this.f + 1;
                jo0 jo0Var = (jo0) m88Var.b;
                Activity activity = (Activity) m88Var.c;
                if (i5 >= 4) {
                    e29 e29Var7 = new e29(activity);
                    int L = hl.L(133.0f);
                    e29Var7.f(R.raw.rate, jn7.Q1, jn7.Q1, null);
                    int[] iArr2 = new int[2];
                    jo0Var.getLocationOnScreen(iArr2);
                    int i6 = iArr2[0];
                    int i7 = iArr2[1];
                    jo0Var.addView(e29Var7, tre.c(133.0f, jn7.Q1));
                    float f = L / 2.0f;
                    e29Var7.setTranslationX((width - i6) - f);
                    e29Var7.setTranslationY((height - i7) - f);
                    e29Var7.setOnAnimationEndListener(new o29(jo0Var, e29Var7, b));
                    e29Var7.d();
                }
                wjc wjcVar = (wjc) jo0Var.e;
                if (wjcVar != null) {
                    wjcVar.b.M = i5;
                }
            }
        } else if (action == 3 && (p29Var = this.e) != null) {
            for (q29 q29Var4 : (q29[]) ((jo0) ((jz7) p29Var).b).d) {
                e29 e29Var8 = q29Var4.a;
                e29 e29Var9 = q29Var4.b;
                e29Var8.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
                e29Var9.animate().alpha(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(250L).start();
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        hf0 hf0Var = this.c;
        if (hf0Var != null) {
            hf0Var.setState(getDrawableState());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        hf0 hf0Var = this.c;
        if (hf0Var != null) {
            hf0Var.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int width = getWidth();
        int height = getHeight();
        hf0 hf0Var = this.c;
        hf0Var.setBounds(0, 0, width, height);
        hf0Var.draw(canvas);
    }

    public void setAllStarsProvider(p29 p29Var) {
        this.e = p29Var;
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        return this.c == drawable || super.verifyDrawable(drawable);
    }
}
