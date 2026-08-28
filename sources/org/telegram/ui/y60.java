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

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class y60 extends org.telegram.ui.Components.vk0 {
    public final Context c;
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();
    public x20 f;
    public String h;
    public int n;
    public final /* synthetic */ z60 r;

    public y60(z60 z60Var, Context context) {
        this.r = z60Var;
        this.c = context;
        C(true);
    }

    public static void E(y60 y60Var, String str) {
        z60 z60Var = y60Var.r;
        if (z60Var.J) {
            if (TextUtils.isEmpty(str)) {
                z60Var.d.setBackground(null);
            } else {
                z60Var.d.setBackgroundColor(z60Var.getThemedColor(org.telegram.ui.ActionBar.f6.d6));
            }
        }
        if (y60Var.n != 0) {
            z60Var.getConnectionsManager().cancelRequest(y60Var.n, true);
            y60Var.n = 0;
        }
        x20 x20Var = y60Var.f;
        if (x20Var != null) {
            AndroidUtilities.cancelRunOnUIThread(x20Var);
            y60Var.f = null;
        }
        y60Var.h = null;
        int h = y60Var.h();
        if (h > 0) {
            y60Var.d.clear();
            y60Var.e.clear();
            y60Var.t(0, h);
        }
        if (TextUtils.isEmpty(str)) {
            z60Var.b.setVisibility(8);
            z60Var.b.e(false, true);
            return;
        }
        if (z60Var.b.getVisibility() != 0) {
            z60Var.b.setVisibility(0);
            z60Var.b.e(true, false);
        } else {
            z60Var.b.e(true, true);
        }
        x20 x20Var2 = new x20(4, y60Var, str);
        y60Var.f = x20Var2;
        AndroidUtilities.runOnUIThread(x20Var2, 300L);
    }

    @Override // org.telegram.ui.Components.vk0
    public final boolean D(f2.q1 q1Var) {
        return j(q1Var.b()) == 0;
    }

    @Override // f2.r0
    public final int h() {
        return this.e.size() + this.d.size() + (!this.e.isEmpty() ? 1 : 0);
    }

    @Override // f2.r0
    public final long i(int i9) {
        if (j(i9) != 0) {
            return -1L;
        }
        ArrayList arrayList = i9 > this.d.size() ? this.e : this.d;
        if (i9 > this.d.size()) {
            i9 = (i9 - this.d.size()) - 1;
        }
        return ((TLRPC.TL_messages_stickerSet) arrayList.get(i9)).set.id;
    }

    @Override // f2.r0
    public final int j(int i9) {
        return this.d.size() == i9 ? 1 : 0;
    }

    @Override // f2.r0
    public final void v(f2.q1 q1Var, int i9) {
        if (j(i9) != 0) {
            return;
        }
        boolean z10 = i9 > this.d.size();
        ArrayList arrayList = z10 ? this.e : this.d;
        if (z10) {
            i9 = (i9 - this.d.size()) - 1;
        }
        org.telegram.ui.Cells.k8 k8Var = (org.telegram.ui.Cells.k8) q1Var.a;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet = (TLRPC.TL_messages_stickerSet) arrayList.get(i9);
        k8Var.d(tL_messages_stickerSet, i9 != arrayList.size() - 1, !z10);
        String str = this.h;
        String lowerCase = str != null ? str.toLowerCase(Locale.ROOT) : "";
        z60 z60Var = this.r;
        org.telegram.ui.ActionBar.b6 resourceProvider = z60Var.getResourceProvider();
        TLRPC.StickerSet stickerSet = tL_messages_stickerSet.set;
        String str2 = stickerSet.title;
        Locale locale = Locale.ROOT;
        int indexOf = str2.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf != -1) {
            SpannableString spannableString = new SpannableString(stickerSet.title);
            spannableString.setSpan(new org.telegram.ui.Components.p00(org.telegram.ui.ActionBar.f6.q6, resourceProvider), indexOf, lowerCase.length() + indexOf, 0);
            k8Var.b.setText(spannableString);
        }
        int indexOf2 = stickerSet.short_name.toLowerCase(locale).indexOf(lowerCase);
        if (indexOf2 != -1) {
            String str3 = stickerSet.emojis ? "t.me/addemoji/" : "t.me/addstickers/";
            int length = str3.length() + indexOf2;
            StringBuilder n10 = e2.c.n(str3);
            n10.append(stickerSet.short_name);
            SpannableString spannableString2 = new SpannableString(n10.toString());
            spannableString2.setSpan(new org.telegram.ui.Components.p00(org.telegram.ui.ActionBar.f6.q6, resourceProvider), length, lowerCase.length() + length, 0);
            k8Var.c.setText(spannableString2);
        }
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet2 = z60Var.r;
        k8Var.b(tL_messages_stickerSet.set.id == (tL_messages_stickerSet2 != null ? tL_messages_stickerSet2.set.id : z60Var.a0(z60Var.v) != null ? z60Var.a0(z60Var.v).id : 0L), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // f2.r0
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.k8 k8Var;
        Context context = this.c;
        if (i9 != 0) {
            int i10 = org.telegram.ui.ActionBar.f6.B6;
            z60 z60Var = this.r;
            org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(this.c, i10, 21, 0, 0, false, false, z60Var.getResourceProvider());
            org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(new ColorDrawable(z60Var.getThemedColor(org.telegram.ui.ActionBar.f6.a7)), org.telegram.ui.ActionBar.f6.V0(context, R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.f6.b7));
            fqVar.w = true;
            m4Var.setBackground(fqVar);
            m4Var.setText(LocaleController.getString(z60Var.J ? R.string.ChooseStickerMyEmojiPacks : R.string.ChooseStickerMyStickerSets));
            k8Var = m4Var;
        } else {
            org.telegram.ui.Cells.k8 k8Var2 = new org.telegram.ui.Cells.k8(context, 3);
            k8Var2.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.d6, false));
            k8Var = k8Var2;
        }
        k8Var.setLayoutParams(new f2.a1(-1, -2));
        return new org.telegram.ui.Components.ik0(k8Var);
    }
}
