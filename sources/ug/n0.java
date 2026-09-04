package ug;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.internal.vision.e2;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.a7;
import org.telegram.ui.Cells.l4;
import org.telegram.ui.Components.d90;
import org.telegram.ui.Components.kl0;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public final class n0 extends kl0 {
    public final /* synthetic */ t0 c;

    public n0(t0 t0Var) {
        this.c = t0Var;
    }

    @Override // org.telegram.ui.Components.kl0
    public final boolean D(s4.c1 c1Var) {
        return c1Var.f == 3;
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
    public final void v(s4.c1 c1Var, int i10) {
        int i11 = c1Var.f;
        View view = c1Var.a;
        t0 t0Var = this.c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) t0Var.Y.get(i10 - 3);
            yg.l lVar = (yg.l) view;
            lVar.setBoost(tL_myBoost);
            lVar.c(t0Var.X.contains(tL_myBoost), false);
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
            s0 s0Var = (s0) view;
            t0Var.b0 = s0Var;
            TLRPC.Chat chat = t0Var.Z;
            d90 d90Var = s0Var.e;
            try {
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), j6.gc, 2, new sg.p0(t0Var, 11));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                d90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                d90Var.post(new rg.f(s0Var, indexOf, 3));
            } catch (Exception e7) {
                FileLog.e(e7);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        f6 f6Var;
        Context context = viewGroup.getContext();
        t0 t0Var = this.c;
        if (i10 == 0) {
            s0 s0Var = new s0(context);
            s0Var.a(t0Var.X, t0Var.Z);
            view = s0Var;
        } else if (i10 == 1) {
            view = new a7(context, j6.w0(null, j6.a7, false), 0);
        } else if (i10 == 2) {
            view = new l4(context, 22);
        } else if (i10 != 3) {
            view = new View(context);
        } else {
            f6Var = ((f3) t0Var).resourcesProvider;
            view = new yg.l(context, true, false, f6Var, true);
        }
        return e2.l(view, view, -1, -2);
    }
}
