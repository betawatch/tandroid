package qh;

import android.content.Context;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.qc;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes4.dex */
public final class l4 extends y1 {
    public final /* synthetic */ int E;
    public final /* synthetic */ b5 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(b5 b5Var, Context context, q4 q4Var, int i10) {
        super(context, q4Var, false, false);
        this.F = b5Var;
        this.E = i10;
    }

    @Override // qh.y1
    public final boolean l0(Integer num) {
        w4 w4Var = this.F.O0;
        if (num.intValue() == 3) {
            int i10 = 0;
            for (int i11 = 0; i11 < w4Var.getChildCount(); i11++) {
                if (w4Var.getChildAt(i11) instanceof eg.y2) {
                    i10++;
                }
            }
            if (i10 >= MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitDefault && !UserConfig.getInstance(this.currentAccount).isPremium()) {
                String formatPluralString = LocaleController.formatPluralString("StoryPremiumWidgets2", MessagesController.getInstance(this.currentAccount).storiesSuggestedReactionsLimitPremium, new Object[0]);
                try {
                    this.container.performHapticFeedback(3);
                } catch (Exception unused) {
                }
                new qc(this.container, this.resourcesProvider).M(LocaleController.getString(R.string.IncreaseLimit), AndroidUtilities.replaceSingleTag(formatPluralString, org.telegram.ui.ActionBar.k6.gc, 0, new org.telegram.ui.web.s0(this, 13), this.resourcesProvider), R.raw.star_premium_2).k(true);
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

    @Override // qh.y1
    public final boolean m0(Integer num) {
        b5 b5Var = this.F;
        w4 w4Var = b5Var.O0;
        boolean z4 = false;
        if (b5Var.U1) {
            if (num.intValue() != 2) {
                return false;
            }
        } else if (num.intValue() == 5) {
            int i10 = 0;
            while (true) {
                if (i10 >= w4Var.getChildCount()) {
                    break;
                }
                if (w4Var.getChildAt(i10) instanceof eg.a4) {
                    z4 = true;
                    break;
                }
                i10++;
            }
            return !z4;
        }
        return true;
    }

    @Override // qh.y1
    public final boolean n0(jm jmVar) {
        return this.F.f0(jmVar);
    }

    @Override // org.telegram.ui.ActionBar.h3
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.F.R0(this.E);
    }
}
