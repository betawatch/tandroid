package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class t11 implements TextWatcher {
    public final qu0 a = new qu0(this, 18);
    public final /* synthetic */ a21 b;

    public t11(a21 a21Var) {
        this.b = a21Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        a21 a21Var = this.b;
        String obj = a21Var.Y1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        z11 z11Var = a21Var.c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = z11Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        z11Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                z11Var.r = false;
                if (z11Var.n >= 0) {
                    ConnectionsManager.getInstance(z11Var.a).cancelRequest(z11Var.n, true);
                    z11Var.n = -1;
                }
                z11Var.f = false;
                z11Var.d.clear();
                z11Var.h = false;
            } else {
                z11Var.r = true;
                z11Var.h = false;
            }
            z11Var.b();
        }
        org.telegram.ui.Components.b51 b51Var = a21Var.e2;
        if (b51Var != null) {
            b51Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        qu0 qu0Var = this.a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(qu0Var);
            a();
        } else {
            org.telegram.messenger.g0.r(qu0Var);
            org.telegram.messenger.g0.h3(qu0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
