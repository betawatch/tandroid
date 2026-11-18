package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class u11 implements TextWatcher {
    public final ru0 a = new ru0(this, 18);
    public final /* synthetic */ b21 b;

    public u11(b21 b21Var) {
        this.b = b21Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b21 b21Var = this.b;
        String obj = b21Var.Y1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        a21 a21Var = b21Var.c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a21Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        a21Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                a21Var.r = false;
                if (a21Var.n >= 0) {
                    ConnectionsManager.getInstance(a21Var.a).cancelRequest(a21Var.n, true);
                    a21Var.n = -1;
                }
                a21Var.f = false;
                a21Var.d.clear();
                a21Var.h = false;
            } else {
                a21Var.r = true;
                a21Var.h = false;
            }
            a21Var.b();
        }
        org.telegram.ui.Components.z41 z41Var = b21Var.e2;
        if (z41Var != null) {
            z41Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        ru0 ru0Var = this.a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(ru0Var);
            a();
        } else {
            org.telegram.messenger.g0.r(ru0Var);
            org.telegram.messenger.g0.h3(ru0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
