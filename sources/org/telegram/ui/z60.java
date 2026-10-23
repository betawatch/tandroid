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

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class z60 extends org.telegram.ui.Components.im0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public lt f;
    public String h;
    public int n;
    public final /* synthetic */ a70 r;

    public z60(a70 a70Var, Context context) {
        this.r = a70Var;
        this.c = context;
        C(true);
    }

    public static void E(z60 z60Var, String str) {
        a70 a70Var = z60Var.r;
        if (a70Var.N) {
            if (TextUtils.isEmpty(str)) {
                a70Var.d.setBackground(null);
            } else {
                a70Var.d.setBackgroundColor(a70Var.getThemedColor(org.telegram.ui.ActionBar.h6.d6));
            }
        }
        if (z60Var.n != 0) {
            a70Var.getConnectionsManager().cancelRequest(z60Var.n, true);
            z60Var.n = 0;
        }
        lt ltVar = z60Var.f;
        if (ltVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ltVar);
            z60Var.f = null;
        }
        z60Var.h = null;
        int h = z60Var.h();
        if (h > 0) {
            z60Var.d.clear();
            z60Var.e.clear();
            z60Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            a70Var.b.setVisibility(8);
            a70Var.b.e(false, true);
            return;
        }
        if (a70Var.b.getVisibility() != 0) {
            a70Var.b.setVisibility(0);
            a70Var.b.e(true, false);
        } else {
            a70Var.b.e(true, true);
        }
        lt ltVar2 = new lt(27, z60Var, str);
        z60Var.f = ltVar2;
        AndroidUtilities.runOnUIThread(ltVar2, 300L);
    }

    @Override // org.telegram.ui.Components.im0
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
        org.telegram.ui.Cells.l8 l8Var = (org.telegram.ui.Cells.l8) b1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i10);
        l8Var.d(tL_messages_stickerSet, i10 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        a70 a70Var = this.r;
        org.telegram.ui.ActionBar.d6 resourceProvider = a70Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            l8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder u10 = a1.g.u(str3);
            u10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(u10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.m10(org.telegram.ui.ActionBar.h6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            l8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = a70Var.r;
        l8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : a70Var.b0(a70Var.v) != null ? a70Var.b0(a70Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s4.g0
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.l8 l8Var;
        Context context = this.c;
        if (i10 != 0) {
            int i11 = org.telegram.ui.ActionBar.h6.B6;
            a70 a70Var = this.r;
            org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(this.c, i11, 21, 0, 0, false, false, a70Var.getResourceProvider());
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(new ColorDrawable(a70Var.getThemedColor(org.telegram.ui.ActionBar.h6.a7)), org.telegram.ui.ActionBar.h6.W0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.b7));
            zqVar.w = true;
            l4Var.setBackground(zqVar);
            l4Var.setText(LocaleController.getString(a70Var.N ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            l8Var = l4Var;
        } else {
            org.telegram.ui.Cells.l8 l8Var2 = new org.telegram.ui.Cells.l8(context, 3);
            l8Var2.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.d6, false));
            l8Var = l8Var2;
        }
        l8Var.setLayoutParams(new s4.o0(-1, -2));
        return new org.telegram.ui.Components.tl0(l8Var);
    }
}
