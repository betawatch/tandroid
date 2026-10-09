package xh;

import android.content.Context;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.bi;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.hs;
import org.telegram.ui.Components.r6;
import org.telegram.ui.Components.tc;
import w7.x5;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes4.dex */
public final class m extends FrameLayout {
    public final /* synthetic */ int a = 1;
    public Object b;
    public Object c;

    public /* synthetic */ m(Context context) {
        super(context);
    }

    public void b(int i10, CharSequence charSequence, boolean z10) {
        ImageView imageView = (ImageView) this.c;
        if (z10) {
            AndroidUtilities.updateImageViewImageAnimated(imageView, i10);
        } else {
            imageView.setImageResource(i10);
        }
        ((TextView) this.b).setText(charSequence);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        switch (this.a) {
            case 3:
                if (keyEvent.getAction() != 1 || keyEvent.getKeyCode() != 4) {
                    return super.dispatchKeyEvent(keyEvent);
                }
                zg.a0 a0Var = (zg.a0) this.b;
                if (!a0Var.k) {
                    return true;
                }
                a0Var.d();
                return true;
            default:
                return super.dispatchKeyEvent(keyEvent);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchSetPressed(boolean z10) {
        switch (this.a) {
            case 3:
                break;
            default:
                super.dispatchSetPressed(z10);
                break;
        }
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        switch (this.a) {
            case 3:
                zg.a0 a0Var = (zg.a0) this.b;
                float f7 = a0Var.u;
                float f10 = rect.bottom;
                if (f7 != f10 && a0Var.v) {
                    a0Var.u = f10;
                    m mVar = a0Var.c;
                    zg.z zVar = a0Var.a;
                    if (!a0Var.q) {
                        float f11 = a0Var.t;
                        int dp = AndroidUtilities.dp(32.0f);
                        int i10 = a0Var.y;
                        if (i10 == 1 || i10 == 2) {
                            dp = AndroidUtilities.dp(24.0f);
                        }
                        float f12 = dp;
                        if (zVar.getMeasuredHeight() + f11 > (mVar.getMeasuredHeight() - a0Var.u) - f12) {
                            f11 = ((mVar.getMeasuredHeight() - a0Var.u) - zVar.getMeasuredHeight()) - f12;
                        }
                        if (f11 < 0.0f) {
                            f11 = 0.0f;
                        }
                        zVar.animate().translationY(f11).setDuration(250L).setUpdateListener(new zg.v(a0Var, 1)).setInterpolator(hs.f).start();
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
            case 2:
                super.onAttachedToWindow();
                ((zg.n) this.c).c();
                break;
            case 3:
                super.onAttachedToWindow();
                tc.a(this, (ai.x4) this.c);
                break;
            default:
                super.onAttachedToWindow();
                break;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        switch (this.a) {
            case 2:
                super.onDetachedFromWindow();
                ((zg.n) this.c).d();
                break;
            case 3:
                super.onDetachedFromWindow();
                tc.h(this);
                break;
            default:
                super.onDetachedFromWindow();
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zg.a0 a0Var, Context context) {
        super(context);
        this.b = a0Var;
        this.c = new ai.x4(this, 11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(zg.q qVar, Context context) {
        super(context);
        this.b = qVar;
        this.c = new zg.n(this, this);
    }

    public m(Context context, e6 e6Var) {
        super(context);
        LinearLayout e7 = bi.e(context, 1);
        r6 r6Var = new r6(context, false, false, false);
        this.c = r6Var;
        int i10 = i6.G6;
        r6Var.setTextColor(i6.w0(i10, e6Var));
        r6Var.setTextSize(AndroidUtilities.dp(17.0f));
        r6Var.setTypeface(AndroidUtilities.bold());
        e7.addView(r6Var, x5.q(-2, 23, 1));
        TextView textView = new TextView(context);
        this.b = textView;
        textView.setTextSize(1, 11.0f);
        textView.setTextColor(i6.w0(i10, e6Var));
        textView.setSingleLine();
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        e7.addView(textView, x5.q(-2, -2, 1));
        addView(e7, x5.e(-2, -2, 17));
    }

    private final void a(boolean z10) {
    }
}
