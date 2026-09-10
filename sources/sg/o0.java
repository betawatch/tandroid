package sg;

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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Cells.c7;
import org.telegram.ui.Cells.m4;
import org.telegram.ui.Components.m90;
import org.telegram.ui.Components.ul0;
import pg.f2;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class o0 extends ul0 {
    public final /* synthetic */ u0 c;

    public o0(u0 u0Var) {
        this.c = u0Var;
    }

    @Override // org.telegram.ui.Components.ul0
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
        u0 u0Var = this.c;
        if (i11 == 3) {
            TL_stories.TL_myBoost tL_myBoost = (TL_stories.TL_myBoost) u0Var.Y.get(i10 - 3);
            wg.k kVar = (wg.k) view;
            kVar.setBoost(tL_myBoost);
            kVar.c(u0Var.X.contains(tL_myBoost), false);
            return;
        }
        if (i11 == 2) {
            m4 m4Var = (m4) view;
            m4Var.setTextSize(15.0f);
            m4Var.setPadding(0, 0, 0, AndroidUtilities.dp(2.0f));
            m4Var.setText(LocaleController.getString(R.string.BoostingRemoveBoostFrom));
            return;
        }
        if (i11 == 0) {
            t0 t0Var = (t0) view;
            u0Var.b0 = t0Var;
            TLRPC.Chat chat = u0Var.Z;
            m90 m90Var = t0Var.e;
            try {
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReassignBoostTextPluralWithLink", (int) MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift, chat == null ? "" : chat.title, "%3$s"));
                SpannableStringBuilder replaceSingleTag = AndroidUtilities.replaceSingleTag(LocaleController.getString("BoostingReassignBoostTextLink", R.string.BoostingReassignBoostTextLink), j6.gc, 2, new qg.q0(u0Var, 15));
                int indexOf = TextUtils.indexOf(replaceTags, "%3$s");
                replaceTags.replace(indexOf, indexOf + 4, (CharSequence) replaceSingleTag);
                m90Var.setText(replaceTags, TextView.BufferType.EDITABLE);
                m90Var.post(new f2(t0Var, indexOf, 1));
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        View view;
        f6 f6Var;
        Context context = viewGroup.getContext();
        u0 u0Var = this.c;
        if (i10 == 0) {
            t0 t0Var = new t0(context);
            t0Var.a(u0Var.X, u0Var.Z);
            view = t0Var;
        } else if (i10 == 1) {
            view = new c7(context, j6.w0(null, j6.a7, false), 0);
        } else if (i10 == 2) {
            view = new m4(context, 22);
        } else if (i10 != 3) {
            view = new View(context);
        } else {
            f6Var = ((h3) u0Var).resourcesProvider;
            view = new wg.k(context, true, false, f6Var, true);
        }
        return e2.j(view, view, -1, -2);
    }
}
