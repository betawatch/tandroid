package yh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qr;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes4.dex */
public final class v3 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ v3(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.b;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.c).setText(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 2:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                zg.c0 c0Var = (zg.c0) this.c;
                if (!c0Var.k) {
                    return true;
                }
                c0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 2:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 2:
                zg.c0 c0Var = (zg.c0) this.c;
                float f7 = c0Var.u;
                float f10 = rect.bottom;
                if (f7 != f10 && c0Var.v) {
                    c0Var.u = f10;
                    v3 v3Var = c0Var.c;
                    zg.b0 b0Var = c0Var.a;
                    if (!c0Var.q) {
                        float f11 = c0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = c0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (b0Var.getMeasuredHeight() + f11 > (v3Var.getMeasuredHeight() - c0Var.u) - f12) {
                            f11 = ((v3Var.getMeasuredHeight() - c0Var.u) - b0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        b0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.w(c0Var, 1)).setInterpolator(qr.f).start();
                    }
                }
                return super.fitSystemWindows(rect);
            default:
                return super.fitSystemWindows(rect);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        switch (this.a) {
            case 1:
                super.onAttachedToWindow();
                ((zg.n) this.b).c();
                break;
            case 2:
                super.onAttachedToWindow();
                oc.a(this, (ai.w4) this.b);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 1:
                super.onDetachedFromWindow();
                ((zg.n) this.b).d();
                break;
            case 2:
                super.onDetachedFromWindow();
                oc.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(zg.c0 c0Var, Context context) {
        super(context);
        this.c = c0Var;
        this.b = new ai.w4(this, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(zg.q qVar, Context context) {
        super(context);
        this.c = qVar;
        this.b = new zg.n(this, this);
    }

    private final void a(boolean z10) {
    }
}
