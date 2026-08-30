package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class u61 implements TextWatcher {
    public final vy0 a = new vy0(this, 18);
    public final /* synthetic */ b71 b;

    public u61(b71 b71Var) {
        this.b = b71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        b71 b71Var = this.b;
        String obj = b71Var.Z.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        a71 a71Var = b71Var.d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = a71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        a71Var.c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                a71Var.r = false;
                if (a71Var.n >= 0) {
                    ConnectionsManager.getInstance(a71Var.a).cancelRequest(a71Var.n, true);
                    a71Var.n = -1;
                }
                a71Var.f = false;
                a71Var.d.clear();
                a71Var.h = false;
            } else {
                a71Var.r = true;
                a71Var.h = false;
            }
            a71Var.b();
        }
        org.telegram.ui.Components.w51 w51Var = b71Var.f0;
        if (w51Var != null) {
            w51Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        vy0 vy0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(vy0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(vy0Var);
            AndroidUtilities.runOnUIThread(vy0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
