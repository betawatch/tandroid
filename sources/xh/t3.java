package xh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import bi.rd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.wr;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes4.dex */
public final class t3 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ t3(Context context) {
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
                yg.c0 c0Var = (yg.c0) this.c;
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
                yg.c0 c0Var = (yg.c0) this.c;
                float f7 = c0Var.u;
                float f10 = rect.bottom;
                if (f7 != f10 && c0Var.v) {
                    c0Var.u = f10;
                    t3 t3Var = c0Var.c;
                    yg.b0 b0Var = c0Var.a;
                    if (!c0Var.q) {
                        float f11 = c0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = c0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (b0Var.getMeasuredHeight() + f11 > (t3Var.getMeasuredHeight() - c0Var.u) - f12) {
                            f11 = ((t3Var.getMeasuredHeight() - c0Var.u) - b0Var.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        b0Var.animate().translationY(f11).setDuration(250L).setUpdateListener(new yg.x(c0Var, 1)).setInterpolator(wr.f).start();
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
                ((yg.o) this.b).c();
                break;
            case 2:
                super.onAttachedToWindow();
                pc.a(this, (rd) this.b);
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
                ((yg.o) this.b).d();
                break;
            case 2:
                super.onDetachedFromWindow();
                pc.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(yg.c0 c0Var, Context context) {
        super(context);
        this.c = c0Var;
        this.b = new rd(this, 8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t3(yg.s sVar, Context context) {
        super(context);
        this.c = sVar;
        this.b = new yg.o(this, this);
    }

    private final void a(boolean z10) {
    }
}
