// default package

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.tl.TL_stories;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class uv4 extends v6c {
    public final TextView c0;
    public final FrameLayout d0;
    public Drawable e0;
    public Drawable f0;
    public TL_stories.Boost g0;
    public final ix2 h0;

    public uv4(Context context) {
        super(context, 0, 0, false);
        this.h0 = new ix2(getContext());
        this.d0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.c0 = textView;
        textView.setTextColor(bkb.v0(bkb.F6, this.E));
        this.c0.setTypeface(gl.o());
        this.c0.setTextSize(12.0f);
        this.c0.setGravity(17);
        this.d0.addView(this.c0, nme.c(22.0f, -2));
        this.d0.setPadding(gl.L(8.0f), 0, gl.L(8.0f), 0);
        FrameLayout frameLayout = this.d0;
        boolean z = k96.a0;
        addView(frameLayout, nme.d(-2, -2.0f, (z ? 3 : 5) | 48, z ? 9 : 0, 9.0f, z ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i) {
        pb0 pb0Var = this.F;
        if (i == 12) {
            pb0Var.h(-31392, -2796986);
        } else if (i == 6) {
            pb0Var.h(-10703110, -12481584);
        } else {
            pb0Var.h(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.g0;
    }

    @Override // v6c, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.T) {
            canvas.drawLine(k96.a0 ? 0.0f : gl.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (k96.a0 ? gl.L(70.0f) : 0), getMeasuredHeight() - 1, bkb.j0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.g0 = boost;
        boolean z = boost.gift;
        FrameLayout frameLayout = this.d0;
        TextView textView = this.c0;
        jia jiaVar = this.b;
        if (z || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i = ((boost.expires - boost.date) / 30) / 86400;
            long j = boost.stars;
            kb0 kb0Var = this.a;
            pb0 pb0Var = this.F;
            if (j > 0) {
                jiaVar.l(k96.G((int) j, "BoostingBoostStars", new Object[0]), false);
                pb0Var.f(26);
                kb0Var.f(null, pb0Var);
                jiaVar.i(null);
            } else if (boost.unclaimed) {
                jiaVar.l(k96.M0(2131753174, null), false);
                pb0Var.f(18);
                setAvatarColorByMonths(i);
                kb0Var.f(null, pb0Var);
                jiaVar.i(null);
            } else if (boost.user_id == -1) {
                jiaVar.l(k96.M0(2131753175, null), false);
                pb0Var.f(19);
                setAvatarColorByMonths(i);
                kb0Var.f(null, pb0Var);
                jiaVar.i(null);
            }
            String format = k96.D0().n0().format(new Date(boost.expires * 1000));
            long j2 = boost.stars;
            jia jiaVar2 = this.c;
            if (j2 > 0) {
                jiaVar2.l(k96.a0(null, null, 2131753241, format), false);
            } else {
                jiaVar2.l(k96.a0(null, null, 2131753521, format), false);
            }
            if (boost.gift) {
                if (this.f0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.f0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.f0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(gl.L(4.0f));
                textView.setText(k96.M0(2131753498, null));
                frameLayout.setBackground(bkb.c0(gl.L(12.0f), gl.L(12.0f), bkb.p1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.e0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.e0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(gl.L(4.0f));
                textView.setText(k96.M0(2131753489, null));
                frameLayout.setBackground(bkb.c0(gl.L(12.0f), gl.L(12.0f), bkb.p1(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i2 = boost.multiplier;
        if (i2 > 0) {
            String valueOf = String.valueOf(i2);
            ix2 ix2Var = this.h0;
            ix2Var.c = valueOf;
            ix2Var.e = ix2Var.b.measureText(valueOf);
            ix2Var.invalidateSelf();
            jiaVar.i(ix2Var);
        } else {
            jiaVar.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            jiaVar.setPadding(0, jiaVar.getPaddingTop(), 0, jiaVar.getPaddingBottom());
        } else {
            int L = gl.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            jiaVar.setPadding(k96.a0 ? L : 0, jiaVar.getPaddingTop(), k96.a0 ? 0 : L, jiaVar.getPaddingBottom());
        }
    }
}
