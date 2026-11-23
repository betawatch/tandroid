package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class v11 implements TextWatcher {
    public final ru0 a = new ru0(this, 18);
    public final /* synthetic */ c21 b;

    public v11(c21 c21Var) {
        this.b = c21Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        c21 c21Var = this.b;
        String obj = c21Var.Y1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        b21 b21Var = c21Var.c2;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = b21Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        b21Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                b21Var.r = false;
                if (b21Var.n >= 0) {
                    ConnectionsManager.getInstance(b21Var.a).cancelRequest(b21Var.n, true);
                    b21Var.n = -1;
                }
                b21Var.f = false;
                b21Var.d.clear();
                b21Var.h = false;
            } else {
                b21Var.r = true;
                b21Var.h = false;
            }
            b21Var.b();
        }
        org.telegram.ui.Components.c51 c51Var = c21Var.e2;
        if (c51Var != null) {
            c51Var.O(true);
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
