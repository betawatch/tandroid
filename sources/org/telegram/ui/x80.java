package org.telegram.ui;

import android.os.Bundle;
import java.util.regex.Pattern;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class x80 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ LaunchActivity b;
    public final /* synthetic */ Bundle c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ a30 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ we.d h;
    public final /* synthetic */ Long n;
    public final /* synthetic */ Integer r;
    public final /* synthetic */ Integer s;
    public final /* synthetic */ byte[] v;
    public final /* synthetic */ org.telegram.ui.ActionBar.n2 w;
    public final /* synthetic */ int x;
    public final /* synthetic */ Object y;

    public /* synthetic */ x80(LaunchActivity launchActivity, Bundle bundle, Long l10, int[] iArr, a30 a30Var, boolean z10, we.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10) {
        this.b = launchActivity;
        this.c = bundle;
        this.d = l10;
        this.y = iArr;
        this.e = a30Var;
        this.f = z10;
        this.h = dVar;
        this.n = l11;
        this.r = num;
        this.s = num2;
        this.v = bArr;
        this.w = n2Var;
        this.x = i10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.a;
        Object obj = this.y;
        switch (i10) {
            case 0:
                a30 a30Var = this.e;
                TLObject tLObject = (TLObject) obj;
                Pattern pattern = LaunchActivity.x1;
                try {
                    a30Var.run();
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                boolean z10 = tLObject instanceof TLRPC.TL_messages_chats;
                LaunchActivity launchActivity = this.b;
                if (z10) {
                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject;
                    if (!tL_messages_chats.chats.isEmpty()) {
                        MessagesController.getInstance(launchActivity.K).putChats(tL_messages_chats.chats, false);
                        TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                        Long l10 = this.d;
                        if (chat != null && this.f && ChatObject.isBoostSupported(chat)) {
                            launchActivity.s0(Long.valueOf(-l10.longValue()), null, this.h, null);
                        } else if (chat != null && chat.forum) {
                            Long l11 = this.n;
                            Integer num = this.s;
                            byte[] bArr = this.v;
                            if (l11 != null) {
                                launchActivity.k0(-l10.longValue(), this.r, null, num, bArr, null, 0, -1);
                            } else {
                                launchActivity.k0(-l10.longValue(), null, null, num, bArr, null, 0, -1);
                            }
                        }
                        org.telegram.ui.ActionBar.n2 n2Var = this.w;
                        Bundle bundle = this.c;
                        if (n2Var == null || MessagesController.getInstance(this.x).checkCanOpenChat(bundle, n2Var)) {
                            ((ActionBarLayout) launchActivity.O()).P(new rn(bundle));
                            break;
                        }
                    }
                }
                launchActivity.B0(org.telegram.ui.Components.y4.H(launchActivity, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                break;
            default:
                int[] iArr = (int[]) obj;
                Pattern pattern2 = LaunchActivity.x1;
                LaunchActivity launchActivity2 = this.b;
                org.telegram.ui.ActionBar.b5 O = launchActivity2.O();
                Bundle bundle2 = this.c;
                if (!((ActionBarLayout) O).P(new rn(bundle2))) {
                    TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                    TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                    Long l12 = this.d;
                    tL_inputChannel.channel_id = l12.longValue();
                    tL_channels_getChannels.id.add(tL_inputChannel);
                    iArr[0] = ConnectionsManager.getInstance(launchActivity2.K).sendRequest(tL_channels_getChannels, new org.telegram.messenger.g1(launchActivity2, this.e, this.f, l12, this.h, this.n, this.r, this.s, this.v, this.w, this.x, bundle2));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ x80(LaunchActivity launchActivity, a30 a30Var, TLObject tLObject, boolean z10, Long l10, we.d dVar, Long l11, Integer num, Integer num2, byte[] bArr, org.telegram.ui.ActionBar.n2 n2Var, int i10, Bundle bundle) {
        this.b = launchActivity;
        this.e = a30Var;
        this.y = tLObject;
        this.f = z10;
        this.d = l10;
        this.h = dVar;
        this.n = l11;
        this.r = num;
        this.s = num2;
        this.v = bArr;
        this.w = n2Var;
        this.x = i10;
        this.c = bundle;
    }
}
