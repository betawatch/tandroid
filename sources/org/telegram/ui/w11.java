package org.telegram.ui;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class w11 implements org.telegram.messenger.is {
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

    public w11(int i7, long j3, TLRPC.ChannelParticipantsFilter channelParticipantsFilter) {
        this.a = i7;
        this.b = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j3));
        TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i7).N0(j3);
        this.c = channelParticipantsFilter;
        if (N0 == null) {
            if (!this.s) {
                this.s = true;
                org.telegram.messenger.ns.f(i7).c(this, org.telegram.messenger.ns.T);
            }
            org.telegram.messenger.np.s1(i7).V2(0, j3, false);
        }
    }

    public final void a() {
        if (this.s) {
            this.s = false;
            int i7 = this.a;
            org.telegram.messenger.ns.f(i7).n(this, org.telegram.messenger.ns.T);
            if (this.n >= 0) {
                ConnectionsManager.getInstance(i7).cancelRequest(this.n, true);
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
        if (org.telegram.messenger.t3.T(chat)) {
            TLRPC.TL_channels_getParticipants tL_channels_getParticipants = new TLRPC.TL_channels_getParticipants();
            tL_channels_getParticipants.channel = org.telegram.messenger.np.i1(chat);
            tL_channels_getParticipants.filter = this.c;
            tL_channels_getParticipants.limit = 30;
            tL_channels_getParticipants.offset = this.r ? 0 : this.d.size();
            ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_channels_getParticipants, new d3.b(1), new a5(this, 25));
        }
    }

    @Override // org.telegram.messenger.is
    public final void didReceivedNotification(int i7, int i10, Object... objArr) {
        if (i7 == org.telegram.messenger.ns.T) {
            long j3 = ((TLRPC.ChatFull) objArr[0]).id;
            TLRPC.Chat chat = this.b;
            if (j3 == chat.id && !org.telegram.messenger.t3.T(chat) && this.f) {
                this.f = false;
                b();
            }
        }
    }
}
