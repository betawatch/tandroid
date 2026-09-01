package org.telegram.ui;

import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class v61 implements TextWatcher {
    public final xy0 a = new xy0(this, 17);
    public final /* synthetic */ c71 b;

    public v61(c71 c71Var) {
        this.b = c71Var;
    }

    public final void a() {
        boolean z4;
        boolean z10;
        TLRPC.TL_channelParticipantsSearch tL_channelParticipantsSearch = new TLRPC.TL_channelParticipantsSearch();
        c71 c71Var = this.b;
        String obj = c71Var.Z.getText().toString();
        tL_channelParticipantsSearch.q = obj;
        b71 b71Var = c71Var.d0;
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = b71Var.c;
        if (channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) {
            z4 = !TextUtils.equals(channelParticipantsFilter.q, obj);
            z10 = false;
        } else {
            z4 = true;
            z10 = true;
        }
        b71Var.c = tL_channelParticipantsSearch;
        if (z4) {
            if (z10) {
                b71Var.r = false;
                if (b71Var.n >= 0) {
                    ConnectionsManager.getInstance(b71Var.a).cancelRequest(b71Var.n, true);
                    b71Var.n = -1;
                }
                b71Var.f = false;
                b71Var.d.clear();
                b71Var.h = false;
            } else {
                b71Var.r = true;
                b71Var.h = false;
            }
            b71Var.b();
        }
        org.telegram.ui.Components.x51 x51Var = c71Var.f0;
        if (x51Var != null) {
            x51Var.N(true);
        }
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int length = editable.length();
        xy0 xy0Var = this.a;
        if (length <= 0) {
            AndroidUtilities.cancelRunOnUIThread(xy0Var);
            a();
        } else {
            AndroidUtilities.cancelRunOnUIThread(xy0Var);
            AndroidUtilities.runOnUIThread(xy0Var, 300L);
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
    }
}
