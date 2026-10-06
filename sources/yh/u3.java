package yh;

import android.content.Context;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.tr;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes4.dex */
public final class u3 extends FrameLayout {
    public final /* synthetic */ int a = 0;
    public Object b;
    public Object c;

    public /* synthetic */ u3(Context context) {
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
                zg.z zVar = (zg.z) this.c;
                if (!zVar.k) {
                    return true;
                }
                zVar.d();
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
                zg.z zVar = (zg.z) this.c;
                float f7 = zVar.u;
                float f10 = rect.bottom;
                if (f7 != f10 && zVar.v) {
                    zVar.u = f10;
                    u3 u3Var = zVar.c;
                    zg.y yVar = zVar.a;
                    if (!zVar.q) {
                        float f11 = zVar.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = zVar.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (yVar.getMeasuredHeight() + f11 > (u3Var.getMeasuredHeight() - zVar.u) - f12) {
                            f11 = ((u3Var.getMeasuredHeight() - zVar.u) - yVar.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        yVar.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.t(zVar, 1)).setInterpolator(tr.f).start();
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
                ((zg.k) this.b).c();
                break;
            case 2:
                super.onAttachedToWindow();
                rc.a(this, (ai.w4) this.b);
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
                ((zg.k) this.b).d();
                break;
            case 2:
                super.onDetachedFromWindow();
                rc.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(zg.z zVar, Context context) {
        super(context);
        this.c = zVar;
        this.b = new ai.w4(this, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(zg.o oVar, Context context) {
        super(context);
        this.c = oVar;
        this.b = new zg.k(this, this);
    }

    private final void a(boolean z10) {
    }
}
