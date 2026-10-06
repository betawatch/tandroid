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

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class r70 extends org.telegram.ui.Components.yl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public cu f;
    public String h;
    public int n;
    public final /* synthetic */ s70 r;

    public r70(s70 s70Var, Context context) {
        this.r = s70Var;
        this.c = context;
        C(true);
    }

    public static void E(r70 r70Var, String str) {
        s70 s70Var = r70Var.r;
        if (s70Var.N) {
            if (TextUtils.isEmpty(str)) {
                s70Var.d.setBackground(null);
            } else {
                s70Var.d.setBackgroundColor(s70Var.getThemedColor(org.telegram.ui.ActionBar.i6.d6));
            }
        }
        if (r70Var.n != 0) {
            s70Var.getConnectionsManager().cancelRequest(r70Var.n, true);
            r70Var.n = 0;
        }
        cu cuVar = r70Var.f;
        if (cuVar != null) {
            AndroidUtilities.cancelRunOnUIThread(cuVar);
            r70Var.f = null;
        }
        r70Var.h = null;
        int h = r70Var.h();
        if (h > 0) {
            r70Var.d.clear();
            r70Var.e.clear();
            r70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            s70Var.b.setVisibility(8);
            s70Var.b.e(false, true);
            return;
        }
        if (s70Var.b.getVisibility() != 0) {
            s70Var.b.setVisibility(0);
            s70Var.b.e(true, false);
        } else {
            s70Var.b.e(true, true);
        }
        cu cuVar2 = new cu(25, r70Var, str);
        r70Var.f = cuVar2;
        AndroidUtilities.runOnUIThread(cuVar2, 300L);
    }

    @Override // org.telegram.ui.Components.yl0
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
        s70 s70Var = this.r;
        org.telegram.ui.ActionBar.d6 resourceProvider = s70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.h10(org.telegram.ui.ActionBar.i6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            m8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder v = a4.a.v(str3);
            v.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(v.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.h10(org.telegram.ui.ActionBar.i6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            m8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = s70Var.r;
        m8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : s70Var.b0(s70Var.v) != null ? s70Var.b0(s70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.m8 m8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.i6.B6;
            s70 s70Var = this.r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, i11, 21, 0, 0, false, false, s70Var.getResourceProvider());
            org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(new ColorDrawable(s70Var.getThemedColor(org.telegram.ui.ActionBar.i6.a7)), org.telegram.ui.ActionBar.i6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.b7));
            sqVar.w = true;
            m4Var.setBackground(sqVar);
            m4Var.setText(LocaleController.getString(s70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            m8Var = m4Var;
        } else {
            org.telegram.ui.Cells.m8 m8Var2 = new org.telegram.ui.Cells.m8(context, 3);
            m8Var2.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.d6, false));
            m8Var = m8Var2;
        }
        m8Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.il0(m8Var);
    }
}
