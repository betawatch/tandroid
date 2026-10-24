package zg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import ci.j4;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n5;
import org.telegram.ui.Cells.wa;
import org.telegram.ui.Components.h9;
import w7.z5;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class b extends wa {
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
        textView.setTextColor(k6.w0(k6.G6, this.y));
        this.b0.setTypeface(AndroidUtilities.bold());
        this.b0.setTextSize(12.0f);
        this.b0.setGravity(17);
        this.c0.addView(this.b0, z5.c(22.0f, -2));
        this.c0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.c0;
        boolean z10 = LocaleController.isRTL;
        addView(frameLayout, z5.d(-2, -2.0f, (z10 ? 3 : 5) | 48, z10 ? 9 : 0, 9.0f, z10 ? 0 : 9, 0.0f));
    }

    private void setAvatarColorByMonths(int i10) {
        h9 h9Var = this.E;
        if (i10 == 12) {
            h9Var.i(-31392, -2796986);
        } else if (i10 == 6) {
            h9Var.i(-10703110, -12481584);
        } else {
            h9Var.i(-6631068, -11945404);
        }
    }

    public TL_stories.Boost getBoost() {
        return this.f0;
    }

    @Override // org.telegram.ui.Cells.wa, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, k6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.f0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.c0;
        TextView textView = this.b0;
        n5 n5Var = this.b;
        if (z10 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i10 = ((boost.expires - boost.date) / 30) / 86400;
            long j10 = boost.stars;
            j4 j4Var = this.a;
            h9 h9Var = this.E;
            if (j10 > 0) {
                n5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j10, new Object[0]), false);
                h9Var.g(26);
                j4Var.e(null, h9Var);
                n5Var.i(null);
            } else if (boost.unclaimed) {
                n5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                h9Var.g(18);
                setAvatarColorByMonths(i10);
                j4Var.e(null, h9Var);
                n5Var.i(null);
            } else if (boost.user_id == -1) {
                n5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                h9Var.g(19);
                setAvatarColorByMonths(i10);
                j4Var.e(null, h9Var);
                n5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            long j11 = boost.stars;
            n5 n5Var2 = this.c;
            if (j11 > 0) {
                n5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                n5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.e0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.e0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.e0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(k6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), k6.o1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.d0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.d0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(k6.d0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), k6.o1(0.2f, -13397548)));
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
            n5Var.i(aVar);
        } else {
            n5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            n5Var.setPadding(0, n5Var.getPaddingTop(), 0, n5Var.getPaddingBottom());
        } else {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            n5Var.setPadding(LocaleController.isRTL ? dp : 0, n5Var.getPaddingTop(), LocaleController.isRTL ? 0 : dp, n5Var.getPaddingBottom());
        }
    }
}
