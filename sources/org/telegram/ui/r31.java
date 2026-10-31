package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class r31 implements org.telegram.messenger.us {
    public final int a;
    public final TLRPC.Chat b;
    public TLRPC.ChannelParticipantsFilter c;
    public boolean f;
    public boolean h;
    public boolean r;
    public boolean s;
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public int n = -1;

    public r31(int i10, long j10, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.a = i10;
        this.b = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(j10));
        TLRPC.ChatFull M0 = org.telegram.messenger.vp.r1(i10).M0(j10);
        this.c = channelParticipantsFilter;
        if (M0 == null) {
            if (!this.s) {
                this.s = true;
                org.telegram.messenger.zs.f(i10).c(this, org.telegram.messenger.zs.T);
            }
            org.telegram.messenger.vp.r1(i10).T2(0, j10, false);
        }
    }

    public final void a() {
        if (this.s) {
            this.s = false;
            int i10 = this.a;
            org.telegram.messenger.zs.f(i10).n(this, org.telegram.messenger.zs.T);
            if (this.n >= 0) {
                ConnectionsManager.getInstance(i10).cancelRequest(this.n, true);
                this.n = -1;
            }
            this.f = false;
        }
    }

    public final void b() {
        if (this.f || this.h) {
            return;
        }
        TLRPC.ChannelParticipantsFilter channelParticipantsFilter = this.c;
        if ((channelParticipantsFilter instanceof TLRPC.TL_channelParticipantsSearch) && TextUtils.isEmpty(channelParticipantsFilter.q)) {
            return;
        }
        this.f = true;
        TLRPC.Chat chat = this.b;
        if (org.telegram.messenger.w3.T(chat)) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = org.telegram.messenger.vp.h1(chat);
            tL_channels_getParticipants.filter = this.c;
            tL_channels_getParticipants.limit = 30;
            tL_channels_getParticipants.offset = this.r ? 0 : this.d.size();
            ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_channels_getParticipants, new a3.b(1), new z4(this, 24));
        }
    }

    @Override // org.telegram.messenger.us
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.zs.T) {
            long j10 = ((TLRPC.ChatFull) objArr[0]).id;
            TLRPC.Chat chat = this.b;
            if (j10 == chat.id && !org.telegram.messenger.w3.T(chat) && this.f) {
                this.f = false;
                b();
            }
        }
    }
}
