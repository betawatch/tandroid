package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.play_billing.k3;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Cells.z6;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.x90;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class l0 extends hm0 {
    public final /* synthetic */ r0 c;

    public l0(r0 r0Var) {
        this.c = r0Var;
    }

    @Override // org.telegram.ui.Components.hm0
    public final boolean D(s4.b1 b1Var) {
        return b1Var.f == 3;
    }

    @Override // s4.g0
    public final int h() {
        return this.c.Y.size() + 3;
    }

    @Override // s4.g0
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        int i11 = 1;
        if (i10 != 1) {
            i11 = 2;
            if (i10 != 2) {
                return 3;
            }
        }
        return i11;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        int i11 = b1Var.f;
        View view = b1Var.a;
        r0 r0Var = this.c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) r0Var.Y.get(i10 - 3);
            yg.k kVar = (yg.k) view;
            kVar.setBoost(tL_myBoost);
            kVar.c(r0Var.X.contains(tL_myBoost), false);
            return;
        }
        if (i11 == 2) {
            l4 l4Var = (l4) view;
            l4Var.setTextSize(15.0f);
            l4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            l4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
            return;
        }
        if (i11 == 0) {
            q0 q0Var = (q0) view;
            r0Var.b0 = q0Var;
            TLRPC.Chat chat = r0Var.Z;
            x90 x90Var = q0Var.e;
            try {
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), h6.gc, 2, new tg.p(r0Var, 8));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                x90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                x90Var.post(new org.telegram.ui.Wallet.j(q0Var, indexOf, 10));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        View view;
        d6 d6Var;
        Context context = viewGroup.getContext();
        r0 r0Var = this.c;
        if (i10 == 0) {
            q0 q0Var = new q0(context);
            q0Var.a(r0Var.X, r0Var.Z);
            view = q0Var;
        } else if (i10 == 1) {
            view = new z6(context, h6.x0(null, h6.a7, false), 0);
        } else if (i10 == 2) {
            view = new l4(context, 22);
        } else if (i10 != 3) {
            view = new View(context);
        } else {
            d6Var = ((f3) r0Var).resourcesProvider;
            view = new yg.k(context, true, false, d6Var, true);
        }
        return k3.l(view, view, -1, -2);
    }
}
