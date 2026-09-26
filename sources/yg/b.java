package yg;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.Date;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.h5;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.za;
import org.telegram.ui.Components.h9;
import w7.y5;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class b extends za {
    public final TextView a0;
    public final FrameLayout b0;
    public Drawable c0;
    public Drawable d0;
    public TL_stories.Boost e0;
    public final a f0;

    public b(Context context) {
        super(context, 0, 0, false);
        this.f0 = new a(getContext());
        this.b0 = new FrameLayout(getContext());
        TextView textView = new TextView(getContext());
        this.a0 = textView;
        textView.setTextColor(h6.v0(h6.G6, this.y));
        this.a0.setTypeface(AndroidUtilities.bold());
        this.a0.setTextSize(12.0f);
        this.a0.setGravity(17);
        this.b0.addView(this.a0, y5.c(22.0f, -2));
        this.b0.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        FrameLayout frameLayout = this.b0;
        boolean z10 = LocaleController.isRTL;
        addView(frameLayout, y5.d(-2, -2.0f, (z10 ? 3 : 5) | 48, z10 ? 9 : 0, 9.0f, z10 ? 0 : 9, 0.0f));
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
        return this.e0;
    }

    @Override // org.telegram.ui.Cells.za
    public /* bridge */ /* synthetic */ int[] getColorKeys() {
        return null;
    }

    @Override // org.telegram.ui.Cells.za, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.S) {
            canvas.drawLine(LocaleController.isRTL ? 0.0f : AndroidUtilities.dp(70.0f), getMeasuredHeight() - 1, getMeasuredWidth() - (LocaleController.isRTL ? AndroidUtilities.dp(70.0f) : 0), getMeasuredHeight() - 1, h6.k0);
        }
    }

    public void setStatus(TL_stories.Boost boost) {
        this.e0 = boost;
        boolean z10 = boost.gift;
        FrameLayout frameLayout = this.b0;
        TextView textView = this.a0;
        h5 h5Var = this.b;
        if (z10 || boost.giveaway) {
            frameLayout.setVisibility(0);
            int i10 = ((boost.expires - boost.date) / 30) / 86400;
            long j3 = boost.stars;
            ai.y5 y5Var = this.a;
            h9 h9Var = this.E;
            if (j3 > 0) {
                h5Var.l(LocaleController.formatPluralString("BoostingBoostStars", (int) j3, new Object[0]), false);
                h9Var.g(26);
                y5Var.e(null, h9Var);
                h5Var.i(null);
            } else if (boost.unclaimed) {
                h5Var.l(LocaleController.getString(R.string.BoostingUnclaimed), false);
                h9Var.g(18);
                setAvatarColorByMonths(i10);
                y5Var.e(null, h9Var);
                h5Var.i(null);
            } else if (boost.user_id == -1) {
                h5Var.l(LocaleController.getString(R.string.BoostingToBeDistributed), false);
                h9Var.g(19);
                setAvatarColorByMonths(i10);
                y5Var.e(null, h9Var);
                h5Var.i(null);
            }
            String format = LocaleController.getInstance().getFormatterBoostExpired().format(new Date(boost.expires * 1000));
            long j10 = boost.stars;
            h5 h5Var2 = this.c;
            if (j10 > 0) {
                h5Var2.l(LocaleController.formatString(R.string.BoostingStarsExpires, format), false);
            } else {
                h5Var2.l(LocaleController.formatString(R.string.BoostingExpires, format), false);
            }
            if (boost.gift) {
                if (this.d0 == null) {
                    Drawable drawable = getResources().getDrawable(R.drawable.mini_gift);
                    this.d0 = drawable;
                    drawable.setColorFilter(new PorterDuffColorFilter(-3240417, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-3240417);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.d0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGift));
                frameLayout.setBackground(h6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), h6.l1(0.2f, -3240417)));
            }
            if (boost.giveaway) {
                if (this.c0 == null) {
                    Drawable drawable2 = getResources().getDrawable(R.drawable.mini_giveaway);
                    this.c0 = drawable2;
                    drawable2.setColorFilter(new PorterDuffColorFilter(-13397548, PorterDuff.Mode.MULTIPLY));
                }
                textView.setTextColor(-13397548);
                textView.setCompoundDrawablesWithIntrinsicBounds(this.c0, (Drawable) null, (Drawable) null, (Drawable) null);
                textView.setCompoundDrawablePadding(AndroidUtilities.dp(4.0f));
                textView.setText(LocaleController.getString(R.string.BoostingGiveaway));
                frameLayout.setBackground(h6.c0(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), h6.l1(0.2f, -13397548)));
            }
        } else {
            frameLayout.setVisibility(8);
        }
        int i11 = boost.multiplier;
        if (i11 > 0) {
            String valueOf = String.valueOf(i11);
            a aVar = this.f0;
            aVar.f = valueOf;
            aVar.e = aVar.a.measureText(valueOf);
            aVar.invalidateSelf();
            h5Var.i(aVar);
        } else {
            h5Var.i(null);
        }
        if (frameLayout.getVisibility() != 0) {
            h5Var.setPadding(0, h5Var.getPaddingTop(), 0, h5Var.getPaddingBottom());
        } else {
            int dp = AndroidUtilities.dp(22.0f) + ((int) textView.getPaint().measureText(textView.getText().toString()));
            h5Var.setPadding(LocaleController.isRTL ? dp : 0, h5Var.getPaddingTop(), LocaleController.isRTL ? 0 : dp, h5Var.getPaddingBottom());
        }
    }
}
