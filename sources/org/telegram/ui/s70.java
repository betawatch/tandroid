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

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class s70 extends org.telegram.ui.Components.xl0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public yt f;
    public String h;
    public int n;
    public final /* synthetic */ t70 r;

    public s70(t70 t70Var, Context context) {
        this.r = t70Var;
        this.c = context;
        C(true);
    }

    public static void E(s70 s70Var, String str) {
        t70 t70Var = s70Var.r;
        if (t70Var.N) {
            if (TextUtils.isEmpty(str)) {
                t70Var.d.setBackground(null);
            } else {
                t70Var.d.setBackgroundColor(t70Var.getThemedColor(org.telegram.ui.ActionBar.j6.d6));
            }
        }
        if (s70Var.n != 0) {
            t70Var.getConnectionsManager().cancelRequest(s70Var.n, true);
            s70Var.n = 0;
        }
        yt ytVar = s70Var.f;
        if (ytVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ytVar);
            s70Var.f = null;
        }
        s70Var.h = null;
        int h = s70Var.h();
        if (h > 0) {
            s70Var.d.clear();
            s70Var.e.clear();
            s70Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            t70Var.b.setVisibility(8);
            t70Var.b.e(false, true);
            return;
        }
        if (t70Var.b.getVisibility() != 0) {
            t70Var.b.setVisibility(0);
            t70Var.b.e(true, false);
        } else {
            t70Var.b.e(true, true);
        }
        yt ytVar2 = new yt(28, s70Var, str);
        s70Var.f = ytVar2;
        AndroidUtilities.runOnUIThread(ytVar2, 300L);
    }

    @Override // org.telegram.ui.Components.xl0
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
        org.telegram.ui.Cells.n8 n8Var = (org.telegram.ui.Cells.n8) c1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        n8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        t70 t70Var = this.r;
        org.telegram.ui.ActionBar.f6 resourceProvider = t70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            n8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder u10 = a4.a.u(str3);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.e10(org.telegram.ui.ActionBar.j6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            n8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = t70Var.r;
        n8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : t70Var.b0(t70Var.v) != null ? t70Var.b0(t70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.h0
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.n8 n8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.j6.B6;
            t70 t70Var = this.r;
            org.telegram.ui.Cells.n4 n4Var = new org.telegram.ui.Cells.n4(this.c, i11, 21, 0, 0, false, false, t70Var.getResourceProvider());
            org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(new ColorDrawable(t70Var.getThemedColor(org.telegram.ui.ActionBar.j6.a7)), org.telegram.ui.ActionBar.j6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.b7));
            pqVar.w = true;
            n4Var.setBackground(pqVar);
            n4Var.setText(LocaleController.getString(t70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            n8Var = n4Var;
        } else {
            org.telegram.ui.Cells.n8 n8Var2 = new org.telegram.ui.Cells.n8(context, 3);
            n8Var2.setBackgroundColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.d6, false));
            n8Var = n8Var2;
        }
        n8Var.setLayoutParams(new s4.p0(-1, -2));
        return new org.telegram.ui.Components.il0(n8Var);
    }
}
