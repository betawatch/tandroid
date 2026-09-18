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

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class wr extends org.telegram.ui.Components.a61 {
    public final ph1 e;
    public final long f;
    public final nh1 h;
    public String n;
    public org.telegram.ui.ActionBar.w0 r;
    public boolean s = false;

    public wr(ph1 ph1Var, long j3, nh1 nh1Var) {
        this.e = ph1Var;
        this.f = j3;
        this.h = nh1Var;
        vr vrVar = new vr(this, 0);
        if (ph1Var.c) {
            vrVar.run();
        } else {
            ph1Var.f.add(vrVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.a61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void U(ArrayList arrayList, org.telegram.ui.Components.x51 x51Var) {
        CharSequence charSequence;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        CharSequence charSequence2 = null;
        long j3 = this.f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.j51 c10 = org.telegram.ui.Components.j51.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.j51.B(null));
        }
        if (TextUtils.isEmpty(this.n)) {
            com.google.android.gms.internal.vision.e2.n(R.string.EditProfileChannelSelect, arrayList);
        }
        ArrayList arrayList2 = this.e.e;
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
                if (!TextUtils.isEmpty(this.n)) {
                    String lowerCase = this.n.toLowerCase();
                    String translitSafe = AndroidUtilities.translitSafe(lowerCase);
                    String lowerCase2 = chat.title.toLowerCase();
                    String translitSafe2 = AndroidUtilities.translitSafe(lowerCase2);
                    if (!lowerCase2.startsWith(lowerCase)) {
                        charSequence = charSequence2;
                        if (!org.telegram.messenger.w1.w(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.w1.w(" ", translitSafe, translitSafe2)) {
                        }
                        long j10 = chat.id;
                        org.telegram.ui.Components.j51 j51Var = new org.telegram.ui.Components.j51(11);
                        j51Var.w = true;
                        j51Var.x = -j10;
                        j51Var.K(j3 != j10);
                        arrayList.add(j51Var);
                    }
                }
                charSequence = charSequence2;
                long j102 = chat.id;
                org.telegram.ui.Components.j51 j51Var2 = new org.telegram.ui.Components.j51(11);
                j51Var2.w = true;
                j51Var2.x = -j102;
                j51Var2.K(j3 != j102);
                arrayList.add(j51Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.n) && i10 == 0) {
            org.telegram.ui.Components.j51 c11 = org.telegram.ui.Components.j51.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.j51.B(charSequence3));
        org.telegram.ui.ActionBar.w0 w0Var = this.r;
        if (w0Var != null) {
            w0Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.a61
    public final CharSequence V() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.a61
    public final void W(org.telegram.ui.Components.j51 j51Var, View view) {
        int i10 = j51Var.d;
        nh1 nh1Var = this.h;
        if (i10 == 1) {
            nh1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (j51Var.a == 12) {
                finishFragment();
                nh1Var.run(getMessagesController().getChat(Long.valueOf(-j51Var.x)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new nd(org.telegram.ui.Cells.p6.e(0, "step")));
        } else {
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.a61
    public final boolean X(org.telegram.ui.Components.j51 j51Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.a61, org.telegram.ui.ActionBar.o2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.w0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.r.setContentDescription(LocaleController.getString(R.string.Search));
        this.r.setVisibility(8);
        super.createView(context);
        this.a.q1();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final org.telegram.ui.Components.ml0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.o2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            ph1 ph1Var = this.e;
            ph1Var.c = false;
            ph1Var.f.add(new vr(this, 1));
            this.s = false;
        }
    }
}
