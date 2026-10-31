package rg;

import ag.d2;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.beta.R;
import org.telegram.messenger.cd;
import org.telegram.messenger.i0;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.u5;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.r8;
import w7.b6;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b extends pa {
    public final TextView b0;
    public final FrameLayout c0;
    public Drawable d0;
    public Drawable e0;
    public TL_stories.Boost f0;
    public final a g0;

    public b(Context context) {
        super(context, 0, 0, false);
        this.g0 = new a(getContext());
        this.c0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.b0 = textView;
        textView.setTextColor(t6.w0(t6.G6, this.D));
        this.b0.setTypeface(i0.o());
        this.b0.setTextSize(12.0f);
        this.b0.setGravity(17);
        this.c0.addView(this.b0, b6.c(22.0f, -2));
        this.c0.setPadding(i0.L(8.0f), 0, i0.L(8.0f), 0);
        FrameLayout frameLayout = this.c0;
        boolean z10 = cd.X;
        addView(frameLayout, b6.d(-2, -2.0f, (z10 ? 3 : 5) | 48, z10 ? 9 : 0, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        r8 r8Var = this.E;
        if (i10 == 12) {
            r8Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            r8Var.i(-10703110, -12481584);
        } else {
            r8Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f0;
    }

    @Override // org.telegram.ui.Cells.pa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(cd.X ? 0.0f : i0.L(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (cd.X ? i0.L(70.0f) : 0), getMeasuredHeight() - 1, t6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.f0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.c0;
        TextView textView = this.b0;
        u5 u5Var = this.b;
        if (z10 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i10 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            d2 d2Var = this.a;
            r8 r8Var = this.E;
            if (j10 > 0) {
                u5Var.l(cd.G((int) j10, "BoostingBoostStars", new Object[0]), false);
                r8Var.g(26);
                d2Var.e(null, r8Var);
                u5Var.i(null);
            } else if (boost.unclaimed) {
                u5Var.l(cd.L0(2131753177, null), false);
                r8Var.g(18);
                setAvatarColorByMonths(i10);
                d2Var.e(null, r8Var);
                u5Var.i(null);
            } else if (boost.user_id == -1) {
                u5Var.l(cd.L0(2131753178, null), false);
                r8Var.g(19);
                setAvatarColorByMonths(i10);
                d2Var.e(null, r8Var);
                u5Var.i(null);
            }
            String format = cd.D0().n0().format(new Date(boost.expires * 1000));
            long j11 = boost.stars;
            u5 u5Var2 = this.c;
            if (j11 > 0) {
                u5Var2.l(cd.a0(null, null, 2131753244, format), false);
            } else {
                u5Var2.l(cd.a0(null, null, 2131753524, format), false);
            }
            if (boost.gift) {
                if (this.e0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.e0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(i0.L(4.0f));
                textView.setText(cd.L0(2131753501, null));
                frameLayout.setBackground(t6.e0(i0.L(12.0f), i0.L(12.0f), t6.r1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.d0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.d0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(i0.L(4.0f));
                textView.setText(cd.L0(2131753492, null));
                frameLayout.setBackground(t6.e0(i0.L(12.0f), i0.L(12.0f), t6.r1(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i11 = boost.multiplier;
        if (i11 > 0) {
            String valueOf = String.valueOf(i11);
            a aVar = this.g0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
            u5Var.i(aVar);
        } else {
            u5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            u5Var.setPadding(0, u5Var.getPaddingTop(), 0, u5Var.getPaddingBottom());
        } else {
            int L = i0.L(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            u5Var.setPadding(cd.X ? L : 0, u5Var.getPaddingTop(), cd.X ? 0 : L, u5Var.getPaddingBottom());
        }
    }
}
