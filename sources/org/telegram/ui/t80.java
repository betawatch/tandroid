package org.telegram.ui;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarLayout;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class t80 implements Runnable {
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
    public final /* synthetic */ Object v;

    public /* synthetic */ t80(LaunchActivity launchActivity, Bundle bundle, byte[] bArr, int i10, Integer num, String str, int i11, long j10, m0 m0Var, org.telegram.ui.ActionBar.n2 n2Var) {
        this.b = launchActivity;
        this.r = bundle;
        this.c = bArr;
        this.d = i10;
        this.e = num;
        this.f = str;
        this.h = i11;
        this.n = j10;
        this.s = m0Var;
        this.v = n2Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x010b  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        TLRPC.Message message;
        int i10 = this.a;
        Object obj = this.v;
        Object obj2 = this.s;
        Object obj3 = this.r;
        switch (i10) {
            case 0:
                TLObject tLObject = (TLObject) obj3;
                Integer num = (Integer) obj2;
                Runnable runnable = (Runnable) obj;
                Pattern pattern = LaunchActivity.x1;
                if (tLObject instanceof TLRPC.messages_Messages) {
                    ArrayList<TLRPC.Message> arrayList = ((TLRPC.messages_Messages) tLObject).messages;
                    for (int i11 = 0; i11 < arrayList.size(); i11++) {
                        if (arrayList.get(i11) != null && arrayList.get(i11).id == this.e.intValue()) {
                            message = arrayList.get(i11);
                            LaunchActivity launchActivity = this.b;
                            long j10 = this.n;
                            if (message == null) {
                                int i12 = launchActivity.K;
                                Integer valueOf = Integer.valueOf(message.id);
                                int i13 = launchActivity.K;
                                launchActivity.v0(i12, null, valueOf, null, Long.valueOf(MessageObject.getTopicId(i13, message, MessagesController.getInstance(i13).isForum(message))), num, this.c, MessagesController.getInstance(launchActivity.K).getChat(Long.valueOf(-j10)), runnable, this.f, this.d, this.h);
                                break;
                            } else {
                                Bundle bundle = new Bundle();
                                bundle.putLong("chat_id", -j10);
                                launchActivity.p0(we1.F0(launchActivity, bundle));
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
                final m0 m0Var = (m0) obj2;
                final org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                Pattern pattern2 = LaunchActivity.x1;
                final LaunchActivity launchActivity3 = this.b;
                launchActivity3.getClass();
                final rn rnVar = new rn(bundle2);
                final byte[] bArr = this.c;
                final int i14 = this.d;
                final Integer num2 = this.e;
                final String str = this.f;
                final int i15 = this.h;
                if (bArr != null) {
                    rnVar.N7 = bArr;
                    rnVar.H7 = i14;
                } else if (num2 != null) {
                    rnVar.M7 = num2;
                    rnVar.H7 = i14;
                } else {
                    rnVar.mb(i14, i15, str);
                }
                if (!((ActionBarLayout) (AndroidUtilities.isTablet() ? launchActivity3.o0 : launchActivity3.O())).P(rnVar)) {
                    final long j11 = this.n;
                    if (j11 < 0) {
                        TLRPC.TL_channels_getChannels tL_channels_getChannels = new TLRPC.TL_channels_getChannels();
                        TLRPC.TL_inputChannel tL_inputChannel = new TLRPC.TL_inputChannel();
                        tL_inputChannel.channel_id = -j11;
                        tL_channels_getChannels.id.add(tL_inputChannel);
                        m0Var.b = new d80(launchActivity3, ConnectionsManager.getInstance(launchActivity3.K).sendRequest(tL_channels_getChannels, new RequestDelegate() { // from class: org.telegram.ui.i90
                            @Override // org.telegram.tgnet.RequestDelegate
                            public final void run(final TLObject tLObject2, TLRPC.TL_error tL_error) {
                                Pattern pattern3 = LaunchActivity.x1;
                                final LaunchActivity launchActivity4 = LaunchActivity.this;
                                launchActivity4.getClass();
                                final m0 m0Var2 = m0Var;
                                final long j12 = j11;
                                final int i16 = i14;
                                final Integer num3 = num2;
                                final byte[] bArr2 = bArr;
                                final org.telegram.ui.ActionBar.n2 n2Var2 = n2Var;
                                final Bundle bundle3 = bundle2;
                                final rn rnVar2 = rnVar;
                                final String str2 = str;
                                final int i17 = i15;
                                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.k90
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        Pattern pattern4 = LaunchActivity.x1;
                                        LaunchActivity launchActivity5 = LaunchActivity.this;
                                        launchActivity5.getClass();
                                        m0Var2.c(false);
                                        TLObject tLObject3 = tLObject2;
                                        if (tLObject3 instanceof TLRPC.TL_messages_chats) {
                                            TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject3;
                                            if (!tL_messages_chats.chats.isEmpty()) {
                                                MessagesController.getInstance(launchActivity5.K).putChats(tL_messages_chats.chats, false);
                                                TLRPC.Chat chat = tL_messages_chats.chats.get(0);
                                                int i18 = i16;
                                                if (chat != null && chat.forum) {
                                                    launchActivity5.k0(-j12, Integer.valueOf(i18), null, num3, bArr2, null, 0, -1);
                                                }
                                                org.telegram.ui.ActionBar.n2 n2Var3 = n2Var2;
                                                Bundle bundle4 = bundle3;
                                                if (n2Var3 == null || MessagesController.getInstance(launchActivity5.K).checkCanOpenChat(bundle4, n2Var3)) {
                                                    rn rnVar3 = new rn(bundle4);
                                                    rnVar2.mb(i18, i17, str2);
                                                    ((ActionBarLayout) launchActivity5.O()).P(rnVar3);
                                                    return;
                                                }
                                                return;
                                            }
                                        }
                                        launchActivity5.B0(org.telegram.ui.Components.y4.H(launchActivity5, LocaleController.getString(R.string.DialogNotAvailable), LocaleController.getString(R.string.LinkNotFound)));
                                    }
                                });
                            }
                        }), 1);
                        break;
                    }
                }
                m0Var.c(false);
                break;
        }
    }

    public /* synthetic */ t80(LaunchActivity launchActivity, TLObject tLObject, Integer num, Integer num2, byte[] bArr, long j10, Runnable runnable, String str, int i10, int i11) {
        this.b = launchActivity;
        this.r = tLObject;
        this.e = num;
        this.s = num2;
        this.c = bArr;
        this.n = j10;
        this.v = runnable;
        this.f = str;
        this.d = i10;
        this.h = i11;
    }
}
