package org.telegram.ui;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class xh1 extends org.telegram.ui.Components.d71 {
    public vh1 d;
    public long e;
    public th1 f;
    public String h;
    public org.telegram.ui.ActionBar.u0 n;
    public boolean r;

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.d71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(ArrayList arrayList, org.telegram.ui.Components.a71 a71Var) {
        CharSequence charSequence;
        long j10 = this.e;
        CharSequence charSequence2 = null;
        if (TextUtils.isEmpty(this.h) && j10 != 0) {
            org.telegram.ui.Components.m61 c10 = org.telegram.ui.Components.m61.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.m61.B(null));
        }
        if (TextUtils.isEmpty(this.h)) {
            i2.d.p(R.string.EditProfileChannelSelect, arrayList);
        }
        ArrayList arrayList2 = this.d.e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList2.get(i11);
            i11++;
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            if (chat == null || ChatObject.isMegagroup(chat)) {
                charSequence = charSequence2;
            } else {
                i10++;
                if (!TextUtils.isEmpty(this.h)) {
                    String lowerCase = this.h.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase)) {
                        charSequence = charSequence2;
                        if (!org.telegram.messenger.g0.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.g0.w(" ", translitSafe, translitSafe2)) {
                        }
                        long j11 = chat.id;
                        org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(11);
                        m61Var.w = true;
                        m61Var.x = -j11;
                        m61Var.K(j10 != j11);
                        arrayList.add(m61Var);
                    }
                }
                charSequence = charSequence2;
                long j112 = chat.id;
                org.telegram.ui.Components.m61 m61Var2 = new org.telegram.ui.Components.m61(11);
                m61Var2.w = true;
                m61Var2.x = -j112;
                m61Var2.K(j10 != j112);
                arrayList.add(m61Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.h) && i10 == 0) {
            org.telegram.ui.Components.m61 c11 = org.telegram.ui.Components.m61.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.m61.B(charSequence3));
        org.telegram.ui.ActionBar.u0 u0Var = this.n;
        if (u0Var != null) {
            u0Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.d71
    public final void W(org.telegram.ui.Components.m61 m61Var, View view) {
        th1 th1Var = this.f;
        int i10 = m61Var.d;
        if (i10 == 1) {
            th1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (m61Var.a == 12) {
                finishFragment();
                th1Var.run(getMessagesController().getChat(Long.valueOf(-m61Var.x)));
                return;
            }
            return;
        }
        this.r = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new sd(org.telegram.ui.Cells.c1.f(0, "step")));
        } else {
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.d71
    public final boolean X(org.telegram.ui.Components.m61 m61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.d71, org.telegram.ui.ActionBar.m2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.u0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new ig.d2(this, 19);
        this.n = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.n.setContentDescription(LocaleController.getString(R.string.Search));
        this.n.setVisibility(8);
        super.createView(context);
        this.a.p1();
        this.actionBar.setAdaptiveBackground(this.a);
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.m2
    public final void onResume() {
        super.onResume();
        if (this.r) {
            vh1 vh1Var = this.d;
            vh1Var.c = false;
            vh1Var.f.add(new wh1(this, 0));
            this.r = false;
        }
    }
}
