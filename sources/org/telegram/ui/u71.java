package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class u71 implements TextWatcher {
    public final uz0 a = new uz0(this, 17);
    public final /* synthetic */ b81 b;

    public u71(b81 b81Var) {
        this.b = b81Var;
    }

    public final void a() {
        boolean z10;
        boolean z11;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b81 b81Var = this.b;
        String obj = b81Var.c0.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        a81 a81Var = b81Var.g0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a81Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z10 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z11 = false;
        } else {
            z10 = true;
            z11 = true;
        }
        a81Var.c = tL_channelParticipantsSearch;
        if (z10) {
            if (z11) {
                a81Var.r = false;
                if (a81Var.n >= 0) {
                    ConnectionsManager.getInstance(a81Var.a).cancelRequest(a81Var.n, true);
                    a81Var.n = -1;
                }
                a81Var.f = false;
                a81Var.d.clear();
                a81Var.h = false;
            } else {
                a81Var.r = true;
                a81Var.h = false;
            }
            a81Var.b();
        }
        org.telegram.ui.Components.z61 z61Var = b81Var.i0;
        if (z61Var != null) {
            z61Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        uz0 uz0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(uz0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(uz0Var);
            AndroidUtilities.runOnUIThread(uz0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
