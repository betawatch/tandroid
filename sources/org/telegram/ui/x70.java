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

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class x70 extends org.telegram.ui.Components.lm0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public o00 f;
    public String h;
    public int n;
    public final /* synthetic */ y70 r;

    public x70(y70 y70Var, Context context) {
        this.r = y70Var;
        this.c = context;
        C(true);
    }

    public static void E(x70 x70Var, String str) {
        y70 y70Var = x70Var.r;
        if (y70Var.N) {
            if (TextUtils.isEmpty(str)) {
                y70Var.d.setBackground(null);
            } else {
                y70Var.d.setBackgroundColor(y70Var.getThemedColor(org.telegram.ui.ActionBar.g6.d6));
            }
        }
        if (x70Var.n != 0) {
            y70Var.getConnectionsManager().cancelRequest(x70Var.n, true);
            x70Var.n = 0;
        }
        o00 o00Var = x70Var.f;
        if (o00Var != null) {
            AndroidUtilities.cancelRunOnUIThread(o00Var);
            x70Var.f = null;
        }
        x70Var.h = null;
        int h = x70Var.h();
        if (h > 0) {
            x70Var.d.clear();
            x70Var.e.clear();
            x70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            y70Var.b.setVisibility(8);
            y70Var.b.e(false, true);
            return;
        }
        if (y70Var.b.getVisibility() != 0) {
            y70Var.b.setVisibility(0);
            y70Var.b.e(true, false);
        } else {
            y70Var.b.e(true, true);
        }
        o00 o00Var2 = new o00(14, x70Var, str);
        x70Var.f = o00Var2;
        AndroidUtilities.runOnUIThread(o00Var2, 300L);
    }

    @Override // org.telegram.ui.Components.lm0
    public final boolean D(s4.b1 b1Var) {
        return j(b1Var.b()) == 0;
    }

    @Override // s4.g0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // s4.g0
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

    @Override // s4.g0
    public final int j(int i10) {
        return this.d.size() == i10 ? 1 : 0;
    }

    @Override // s4.g0
    public final void v(s4.b1 b1Var, int i10) {
        if (j(i10) != 0) {
            return;
        }
        boolean z10 = i10 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i10 = (i10 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.m8 m8Var = (org.telegram.ui.Cells.m8) b1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        m8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        y70 y70Var = this.r;
        org.telegram.ui.ActionBar.c6 resourceProvider = y70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.q10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            m8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder u10 = a1.g.u(str3);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.q10(org.telegram.ui.ActionBar.g6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            m8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = y70Var.r;
        m8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : y70Var.b0(y70Var.v) != null ? y70Var.b0(y70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.g6.B6;
            y70 y70Var = this.r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, i11, 21, 0, 0, false, false, y70Var.getResourceProvider());
            org.telegram.ui.Components.cr crVar = new org.telegram.ui.Components.cr(new ColorDrawable(y70Var.getThemedColor(org.telegram.ui.ActionBar.g6.a7)), org.telegram.ui.ActionBar.g6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.b7));
            crVar.w = true;
            m4Var.setBackground(crVar);
            m4Var.setText(LocaleController.getString(y70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.wl0(m8Var);
    }
}
