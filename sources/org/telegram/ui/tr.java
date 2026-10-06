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

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class tr extends org.telegram.ui.Components.z61 {
    public final gh1 e;
    public final long f;
    public final eh1 h;
    public String n;
    public org.telegram.ui.ActionBar.v0 r;
    public boolean s = false;

    public tr(gh1 gh1Var, long j3, eh1 eh1Var) {
        this.e = gh1Var;
        this.f = j3;
        this.h = eh1Var;
        sr srVar = new sr(this, 0);
        if (gh1Var.c) {
            srVar.run();
        } else {
            gh1Var.f.add(srVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ac  */
    @Override // org.telegram.ui.Components.z61
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void S(ArrayList arrayList, org.telegram.ui.Components.w61 w61Var) {
        CharSequence charSequence;
        boolean isEmpty = TextUtils.isEmpty(this.n);
        CharSequence charSequence2 = null;
        long j3 = this.f;
        if (isEmpty && j3 != 0) {
            org.telegram.ui.Components.h61 c10 = org.telegram.ui.Components.h61.c(1, R.drawable.msg_archive_hide, LocaleController.getString(R.string.EditProfileChannelHide));
            c10.r = true;
            arrayList.add(c10);
            arrayList.add(org.telegram.ui.Components.h61.C(null));
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
                        if (!org.telegram.messenger.bi.u(" ", lowerCase, lowerCase2) && !translitSafe2.startsWith(translitSafe) && !org.telegram.messenger.bi.u(" ", translitSafe, translitSafe2)) {
                        }
                        long j10 = chat.id;
                        org.telegram.ui.Components.h61 h61Var = new org.telegram.ui.Components.h61(11);
                        h61Var.w = true;
                        h61Var.x = -j10;
                        h61Var.L(j3 != j10);
                        arrayList.add(h61Var);
                    }
                }
                charSequence = charSequence2;
                long j102 = chat.id;
                org.telegram.ui.Components.h61 h61Var2 = new org.telegram.ui.Components.h61(11);
                h61Var2.w = true;
                h61Var2.x = -j102;
                h61Var2.L(j3 != j102);
                arrayList.add(h61Var2);
            }
            charSequence2 = charSequence;
        }
        CharSequence charSequence3 = charSequence2;
        if (TextUtils.isEmpty(this.n) && i10 == 0) {
            org.telegram.ui.Components.h61 c11 = org.telegram.ui.Components.h61.c(2, R.drawable.msg_channel_create, LocaleController.getString(R.string.EditProfileChannelStartNew));
            c11.q = true;
            arrayList.add(c11);
        }
        arrayList.add(org.telegram.ui.Components.h61.C(charSequence3));
        org.telegram.ui.ActionBar.v0 v0Var = this.r;
        if (v0Var != null) {
            v0Var.setVisibility(i10 <= 5 ? 8 : 0);
        }
    }

    @Override // org.telegram.ui.Components.z61
    public final CharSequence T() {
        return LocaleController.getString(R.string.EditProfileChannelTitle);
    }

    @Override // org.telegram.ui.Components.z61
    public final void U(org.telegram.ui.Components.h61 h61Var, View view) {
        int i10 = h61Var.d;
        eh1 eh1Var = this.h;
        if (i10 == 1) {
            eh1Var.run(null);
            finishFragment();
            return;
        }
        if (i10 != 2) {
            if (h61Var.a == 12) {
                finishFragment();
                eh1Var.run(getMessagesController().getChat(Long.valueOf(-h61Var.x)));
                return;
            }
            return;
        }
        this.s = true;
        SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
        if (!BuildVars.DEBUG_VERSION && globalMainSettings.getBoolean("channel_intro", false)) {
            presentFragment(new nd(org.telegram.ui.Cells.c1.h(0, "step")));
        } else {
            presentFragment(new h(0));
            globalMainSettings.edit().putBoolean("channel_intro", true).apply();
        }
    }

    @Override // org.telegram.ui.Components.z61
    public final boolean W(org.telegram.ui.Components.h61 h61Var, View view) {
        return false;
    }

    @Override // org.telegram.ui.Components.z61, org.telegram.ui.ActionBar.n2
    public final View createView(Context context) {
        org.telegram.ui.ActionBar.v0 c10 = this.actionBar.n().c(0, R.drawable.outline_header_search, getResourceProvider());
        c10.F();
        c10.H = new hg.d2(this, 4);
        this.r = c10;
        c10.setSearchFieldHint(LocaleController.getString(R.string.Search));
        this.r.setContentDescription(LocaleController.getString(R.string.Search));
        this.r.setVisibility(8);
        super.createView(context);
        this.a.r1();
        return this.fragmentView;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final org.telegram.ui.Components.zl0 getListViewForSimpleGlass() {
        return this.a;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override // org.telegram.ui.ActionBar.n2
    public final void onResume() {
        super.onResume();
        if (this.s) {
            gh1 gh1Var = this.e;
            gh1Var.c = false;
            gh1Var.f.add(new sr(this, 1));
            this.s = false;
        }
    }
}
