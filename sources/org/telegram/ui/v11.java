package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class v11 implements TextWatcher {
    public final tu0 a = new tu0(this, 18);
    public final /* synthetic */ c21 b;

    public v11(c21 c21Var) {
        this.b = c21Var;
    }

    public final void a() {
        boolean z9;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        c21 c21Var = this.b;
        String obj = c21Var.U1.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        b21 b21Var = c21Var.Y1;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = b21Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z9 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z10 = false;
        } else {
            z9 = true;
            z10 = true;
        }
        b21Var.c = tL_channelParticipantsSearch;
        if (z9) {
            if (z10) {
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
        org.telegram.ui.Components.m41 m41Var = c21Var.a2;
        if (m41Var != null) {
            m41Var.O(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        tu0 tu0Var = this.a;
        if (length <= 0) {
            org.telegram.messenger.g0.r(tu0Var);
            a();
        } else {
            org.telegram.messenger.g0.r(tu0Var);
            org.telegram.messenger.g0.i3(tu0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i7, int i10, int i11) {
    }
}
