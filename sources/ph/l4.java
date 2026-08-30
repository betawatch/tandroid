package ph;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes4.dex */
public final class l4 extends y1 {
    public final /* synthetic */ int E;
    public final /* synthetic */ c5 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(c5 c5Var, Context context, q4 q4Var, int i10) {
        super(context, q4Var, false, false);
        this.F = c5Var;
        this.E = i10;
    }

    @Override // ph.y1
    public final boolean l0(Integer num) {
        w4 w4Var = this.F.O0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < w4Var.getChildCount(); i11++) {
                if (w4Var.getChildAt(i11) instanceof dg.a3) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new qc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.j6.gc, 0, new org.telegram.ui.web.o0(this, 12), this.resourcesProvider), R.raw.star_premium_2).k(true);
                return false;
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium) {
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused2) {
                }
                new qc(this.container, this.resourcesProvider).M(LocaleController.getString("LimitReached", R.string.LimitReached), LocaleController.formatPluralString("StoryReactionsWidgetLimit2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]), R.raw.chats_infotip).k(true);
                return false;
            }
        }
        return true;
    }

    @Override // ph.y1
    public final boolean m0(Integer num) {
        c5 c5Var = this.F;
        w4 w4Var = c5Var.O0;
        boolean z4 = false;
        if (c5Var.U1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= w4Var.getChildCount()) {
                    break;
                }
                if (w4Var.getChildAt(i10) instanceof dg.c4) {
                    z4 = true;
                    break;
                }
                i10++;
            }
            return !z4;
        }
        return true;
    }

    @Override // ph.y1
    public final boolean n0(hm hmVar) {
        return this.F.f0(hmVar);
    }

    @Override // org.telegram.ui.ActionBar.g3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.F.R0(this.E);
    }
}
