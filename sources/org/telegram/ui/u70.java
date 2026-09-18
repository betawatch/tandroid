package org.telegram.ui;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class u70 extends org.telegram.ui.Components.ll0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public mw f;
    public String h;
    public int n;
    public final /* synthetic */ v70 r;

    public u70(v70 v70Var, Context context) {
        this.r = v70Var;
        this.c = context;
        C(true);
    }

    public static void E(u70 u70Var, String str) {
        v70 v70Var = u70Var.r;
        if (v70Var.N) {
            if (TextUtils.isEmpty(str)) {
                v70Var.d.setBackground(null);
            } else {
                v70Var.d.setBackgroundColor(v70Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
        }
        if (u70Var.n != 0) {
            v70Var.getConnectionsManager().cancelRequest(u70Var.n, true);
            u70Var.n = 0;
        }
        mw mwVar = u70Var.f;
        if (mwVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mwVar);
            u70Var.f = null;
        }
        u70Var.h = null;
        int h = u70Var.h();
        if (h > 0) {
            u70Var.d.clear();
            u70Var.e.clear();
            u70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            v70Var.b.setVisibility(8);
            v70Var.b.e(false, true);
            return;
        }
        if (v70Var.b.getVisibility() != 0) {
            v70Var.b.setVisibility(0);
            v70Var.b.e(true, false);
        } else {
            v70Var.b.e(true, true);
        }
        mw mwVar2 = new mw(22, u70Var, str);
        u70Var.f = mwVar2;
        AndroidUtilities.runOnUIThread(mwVar2, 300L);
    }

    @Override // org.telegram.ui.Components.ll0
    public final boolean D(s4.c1 c1Var) {
        return j(c1Var.b()) == 0;
    }

    @Override // s4.h0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // s4.h0
    public final long i(int i10) {
        if (j(i10) != 0) {
            return -1L;
        }
        ArrayList arrayList = i10 > this.d.size() ? this.e : this.d;
        if (i10 > this.d.size()) {
            i10 = (i10 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i10)).set.id;
    }

    @Override // s4.h0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // s4.h0
    public final void v(s4.c1 c1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) c1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        m8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        v70 v70Var = this.r;
        org.telegram.ui.ActionBar.f6 resourceProvider = v70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            m8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder u10 = a4.a.u(str3);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            m8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = v70Var.r;
        m8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : v70Var.b0(v70Var.v) != null ? v70Var.b0(v70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            v70 v70Var = this.r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, i11, 21, 0, 0, false, false, v70Var.getResourceProvider());
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(v70Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            pqVar.w = true;
            l4Var.setBackground(pqVar);
            l4Var.setText(LocaleController.getString(v70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            m8Var = l4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.wk0(m8Var);
    }
}
