// default package

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes3.dex */
public final class wi8 extends FrameLayout {
    public final int a;
    public int b;
    public final eb0 c;
    public final FrameLayout d;
    public final k3b e;
    public boolean f;
    public boolean h;

    public wi8(Context context, int i, f53 f53Var) {
        super(context);
        this.b = 1;
        this.f = false;
        this.h = false;
        this.a = i;
        TLRPC.User f = y6c.h(i).f();
        eb0 eb0Var = new eb0(this, getContext());
        this.c = eb0Var;
        v28 v28Var = new v28(getContext(), null);
        kb0 kb0Var = v28Var.a;
        kb0Var.getAvatarDrawable().q(f);
        kb0Var.f(f, kb0Var.getAvatarDrawable());
        String q = l7c.q(f);
        df0 df0Var = v28Var.b;
        df0Var.l(vu3.m(q, df0Var.getPaint().getFontMetricsInt(), false, null, 0), false);
        v28Var.b(k96.M0(2131745805, null), false);
        eb0Var.addView(v28Var, nme.d(-1, -2.0f, 55, 0.0f, 17.0f, 0.0f, 0.0f));
        ImageView imageView = new ImageView(context);
        imageView.setImageDrawable(getContext().getResources().getDrawable(R.drawable.ic_close_white).mutate());
        imageView.setPadding(gl.L(8.0f), gl.L(8.0f), gl.L(8.0f), gl.L(8.0f));
        eb0Var.addView(imageView, nme.d(40, 40.0f, 53, 12.0f, 15.0f, 12.0f, 0.0f));
        addView(eb0Var, nme.c(-2.0f, -1));
        FrameLayout frameLayout = new FrameLayout(getContext());
        this.d = frameLayout;
        k3b k3bVar = new k3b(getContext(), f53Var);
        this.e = k3bVar;
        k3bVar.s0 = true;
        k3bVar.setTranslationY(gl.L(8.0f));
        frameLayout.addView(k3bVar, nme.d(-1, -1.0f, 87, 0.0f, 0.0f, 0.0f, 64.0f));
        ImageView imageView2 = new ImageView(context);
        imageView2.setImageResource(R.drawable.msg_share);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout.addView(imageView2, nme.d(28, 28.0f, 85, 0.0f, 0.0f, 12.0f, 16.0f));
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.setBackground(bkb.b0(gl.L(22.0f), bm2.o(-16777216, kk7.F1)));
        TextView textView = new TextView(context);
        textView.setTextSize(1, 18.0f);
        textView.setTextColor(1694498815);
        textView.setText(k96.M0(2131746062, null));
        frameLayout2.addView(textView, nme.d(-2, -2.0f, 19, 24.0f, 0.0f, 24.0f, 0.0f));
        ImageView imageView3 = new ImageView(context);
        imageView3.setImageResource(R.drawable.input_attach);
        imageView3.setColorFilter(new PorterDuffColorFilter(-1, mode));
        frameLayout2.addView(imageView3, nme.d(28, 28.0f, 21, 0.0f, 0.0f, 9.0f, 0.0f));
        frameLayout.addView(frameLayout2, nme.d(-1, 44.0f, 87, 9.0f, 8.0f, 55.0f, 8.0f));
        addView(frameLayout, nme.c(-1.0f, -1));
        eb0Var.setAlpha(0.0f);
        frameLayout.setAlpha(0.0f);
        setImportantForAccessibility(4);
    }

    public final void a(boolean z, boolean z2, FrameLayout frameLayout) {
        View view;
        if (z) {
            if (this.f == z2) {
                return;
            }
            this.f = z2;
            view = this.c;
        } else {
            if (this.h == z2) {
                return;
            }
            this.h = z2;
            view = this.d;
        }
        view.clearAnimation();
        view.animate().alpha(z2 ? z ? 0.5f : 0.2f : 0.0f).start();
        if (frameLayout != null) {
            frameLayout.clearAnimation();
            frameLayout.animate().alpha(z2 ? 0.0f : 1.0f).start();
        }
    }

    public final void b(CharSequence charSequence) {
        this.e.b0.b(gm.cloneSpans(new SpannableString(charSequence)), null, null, false, false);
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
