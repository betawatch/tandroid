package vg;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.f7;
import org.telegram.ui.Cells.q4;
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.yg1;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final class m0 extends mm0 {
    public final /* synthetic */ s0 c;

    public m0(s0 s0Var) {
        this.c = s0Var;
    }

    @Override // org.telegram.ui.Components.mm0
    public final boolean D(s4.e1 e1Var) {
        return e1Var.f == 3;
    }

    @Override // s4.h0
    public final int h() {
        return this.c.Y.size() + 3;
    }

    @Override // s4.h0
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

    @Override // s4.h0
    public final void v(s4.e1 e1Var, int i10) {
        int i11 = e1Var.f;
        View view = e1Var.a;
        s0 s0Var = this.c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) s0Var.Y.get(i10 - 3);
            zg.l lVar = (zg.l) view;
            lVar.setBoost(tL_myBoost);
            lVar.c(s0Var.X.contains(tL_myBoost), false);
            return;
        }
        if (i11 == 2) {
            q4 q4Var = (q4) view;
            q4Var.setTextSize(15.0f);
            q4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            q4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
            return;
        }
        if (i11 == 0) {
            r0 r0Var = (r0) view;
            s0Var.b0 = r0Var;
            TLRPC.Chat chat = s0Var.Z;
            aa0 aa0Var = r0Var.e;
            try {
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), y6.gc, 2, new ti.g(s0Var, 11));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                aa0Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                aa0Var.post(new yg1(r0Var, indexOf, 12));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // s4.h0
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        View view;
        u6 u6Var;
        Context context = viewGroup.getContext();
        s0 s0Var = this.c;
        if (i10 == 0) {
            r0 r0Var = new r0(context);
            r0Var.a(s0Var.X, s0Var.Z);
            view = r0Var;
        } else if (i10 == 1) {
            int i11 = y6.a7;
            view = new f7(context, y6.x0(null, i11, false), 0);
            org.telegram.ui.ActionBar.f7.i(i11, view, null);
        } else if (i10 == 2) {
            view = new q4(context, 22);
        } else if (i10 != 3) {
            view = new View(context);
        } else {
            u6Var = ((k3) s0Var).resourcesProvider;
            view = new zg.l(context, true, false, u6Var, true);
        }
        return ic.a.n(view, view, -1, -2);
    }
}
