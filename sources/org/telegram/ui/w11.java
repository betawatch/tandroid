package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class w11 implements TextWatcher {
    public final uu0 a = new uu0(this, 18);
    public final /* synthetic */ d21 b;

    public w11(d21 d21Var) {
        this.b = d21Var;
    }

    public final void a() {
        boolean z9;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        d21 d21Var = this.b;
        String obj = d21Var.X1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        c21 c21Var = d21Var.b2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = c21Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z9 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z10 = false;
        } else {
            z9 = true;
            z10 = true;
        }
        c21Var.c = tL_channelParticipantsSearch;
        if (z9) {
            if (z10) {
                c21Var.r = false;
                if (c21Var.n >= 0) {
                    ConnectionsManager.getInstance(c21Var.a).cancelRequest(c21Var.n, true);
                    c21Var.n = -1;
                }
                c21Var.f = false;
                c21Var.d.clear();
                c21Var.h = false;
            } else {
                c21Var.r = true;
                c21Var.h = false;
            }
            c21Var.b();
        }
        org.telegram.ui.Components.m41 m41Var = d21Var.d2;
        if (m41Var != null) {
            m41Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        uu0 uu0Var = this.a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(uu0Var);
            a();
        } else {
            org.telegram.messenger.g0.r(uu0Var);
            org.telegram.messenger.g0.i3(uu0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
