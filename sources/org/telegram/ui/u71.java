package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class u71 implements TextWatcher {
    public final tz0 a = new tz0(this, 17);
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
        org.telegram.ui.Components.a71 a71Var = b81Var.i0;
        if (a71Var != null) {
            a71Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        tz0 tz0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(tz0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(tz0Var);
            AndroidUtilities.runOnUIThread(tz0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
