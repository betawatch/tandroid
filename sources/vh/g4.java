package vh;

import android.app.Activity;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.d20;
import org.telegram.messenger.h20;
import org.telegram.messenger.zs;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class g4 extends FrameLayout {
    public final int a;
    public int b;
    public final jg.a3 c;
    public final FrameLayout d;
    public final th.j6 e;
    public boolean f;
    public boolean h;

    public g4(Activity activity, int i10, th.b bVar) {
        super(activity);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i10;
        TLRPC.User f7 = d20.i(i10).f();
        jg.a3 a3Var = new jg.a3(this, getContext());
        this.c = a3Var;
        th.w2 w2Var = new th.w2(getContext(), null);
        ag.d2 d2Var = w2Var.a;
        d2Var.getAvatarDrawable().r(f7);
        d2Var.e(f7, d2Var.getAvatarDrawable());
        String p5 = h20.p(f7);
        og.c cVar = w2Var.b;
        cVar.l(org.telegram.messenger.k6.m(p5, cVar.getPaint().getFontMetricsInt(), false, null, 0), false);
        w2Var.c(cd.L0(2131746015, null), false);
        a3Var.addView(w2Var, w7.b6.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(activity);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f), org.telegram.messenger.i0.L(8.0f));
        a3Var.addView(imageView, w7.b6.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(a3Var, w7.b6.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        th.j6 j6Var = new th.j6(getContext(), bVar);
        this.e = j6Var;
        j6Var.s0 = true;
        j6Var.setTranslationY(org.telegram.messenger.i0.L(8.0f));
        frameLayout.addView(j6Var, w7.b6.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(activity);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, w7.b6.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(activity);
        frameLayout2.setBackground(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(22.0f), i0.b.o(-16777216, zs.G1)));
        TextView textView = new TextView(activity);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(cd.L0(2131746272, null));
        frameLayout2.addView(textView, w7.b6.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(activity);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, w7.b6.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, w7.b6.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, w7.b6.c(-1.0f, -1));
        a3Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z10, boolean z11, FrameLayout frameLayout) {
        if (z10) {
            if (this.f == z11) {
                return;
            } else {
                this.f = z11;
            }
        } else if (this.h == z11) {
            return;
        } else {
            this.h = z11;
        }
        View view = z10 ? this.c : this.d;
        view.clearAnimation();
        view.animate().alpha(z11 ? z10 ? 0.5f : 0.2f : 0.0f).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(z11 ? 0.0f : 1.0f).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.e.b0.b(org.telegram.ui.Components.o5.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return false;
    }
}
