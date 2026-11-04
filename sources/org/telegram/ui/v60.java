package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class v60 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Integer e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int h;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object w;

    public /* synthetic */ v60(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i3, Integer num, String str, int i10, long j10, k0 k0Var, org.telegram.ui.ActionBar.d2 d2Var) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i3;
        this.e = num;
        this.f = str;
        this.h = i10;
        this.n = j10;
        this.s = k0Var;
        this.w = d2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0111  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        int i3 = this.a;
        Object obj = this.w;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (i3) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                Integer num = (Integer) obj2;
                Runnable runnable = (Runnable) obj;
                String str = LaunchActivity.E1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                        if (arrayList.get(i10) != null && arrayList.get(i10).id == this.e.intValue()) {
                            message = arrayList.get(i10);
                            LaunchActivity launchActivity = this.b;
                            long j10 = this.n;
                            if (message == null) {
                                int i11 = launchActivity.P;
                                Integer valueOf = Integer.valueOf(message.id);
                                int i12 = launchActivity.P;
                                launchActivity.z0(i11, null, valueOf, null, Long.valueOf(org.telegram.messenger.zi.c2(i12, message, org.telegram.messenger.hp.s1(i12).t2(org.telegram.messenger.zi.B0(message)), false)), num, this.c, org.telegram.messenger.hp.s1(launchActivity.P).M0(Long.valueOf(-j10)), runnable, this.f, this.d, this.h);
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -j10);
                                launchActivity.t0(m91.J0(launchActivity, bundle));
                                if (runnable != null) {
                                    runnable.run();
                                    break;
                                }
                            }
                        }
                    }
                }
                message = null;
                LaunchActivity launchActivity2 = this.b;
                long j102 = this.n;
                if (message == null) {
                }
                break;
            default:
                final Bundle bundle2 = (Bundle) obj3;
                final k0 k0Var = (k0) obj2;
                final org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj;
                String str2 = LaunchActivity.E1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final wm wmVar = new wm(bundle2);
                final byte[] bArr = this.c;
                final int i13 = this.d;
                final Integer num2 = this.e;
                final String str3 = this.f;
                final int i14 = this.h;
                if (bArr != null) {
                    wmVar.i8 = bArr;
                    wmVar.c8 = i13;
                } else if (num2 != null) {
                    wmVar.h8 = num2;
                    wmVar.c8 = i13;
                } else {
                    wmVar.Ob(i13, i14, str3);
                }
                if (!((ActionBarLayout) (org.telegram.messenger.g0.Q1() ? launchActivity3.t0 : launchActivity3.M())).S(wmVar)) {
                    final long j11 = this.n;
                    if (j11 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j11;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        k0Var.b = new n70(launchActivity3, ConnectionsManager.getInstance(launchActivity3.P).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.m70
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                String str4 = LaunchActivity.E1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final k0 k0Var2 = k0Var;
                                final long j12 = j11;
                                final int i15 = i13;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                                final Bundle bundle3 = bundle2;
                                final wm wmVar2 = wmVar;
                                final String str5 = str3;
                                final int i16 = i14;
                                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.q70
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        String str6 = LaunchActivity.E1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        k0Var2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                org.telegram.messenger.hp.s1(launchActivity5.P).S3(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i17 = i15;
                                                if (chat != null && chat.forum) {
                                                    launchActivity5.l0(-j12, Integer.valueOf(i17), null, num3, bArr2, null, 0, -1);
                                                }
                                                org.telegram.ui.ActionBar.d2 d2Var3 = d2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (d2Var3 == null || org.telegram.messenger.hp.s1(launchActivity5.P).E(bundle4, d2Var3, null, null)) {
                                                    wm wmVar3 = new wm(bundle4);
                                                    wmVar2.Ob(i17, i16, str5);
                                                    ((ActionBarLayout) launchActivity5.M()).S(wmVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.F0(org.telegram.ui.Components.t4.G(launchActivity5, org.telegram.messenger.bd.M0(2131751455, null), org.telegram.messenger.bd.M0(2131748903, null)));
                                    }
                                });
                            }
                        }), 0);
                        break;
                    }
                }
                k0Var.c(false);
                break;
        }
    }

    public /* synthetic */ v60(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i3, int i10) {
        this.b = launchActivity;
        this.r = tLObject;
        this.e = num;
        this.s = num2;
        this.c = bArr;
        this.n = j10;
        this.w = runnable;
        this.f = str;
        this.d = i3;
        this.h = i10;
    }
}
