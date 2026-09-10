package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class zo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ mp b;

    public /* synthetic */ zo(mp mpVar, int i10) {
        this.a = i10;
        this.b = mpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new bp(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final mp mpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cp
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                mp mpVar2 = mpVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < mpVar2.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = mpVar2.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                mpVar2.t0 = false;
                                AndroidUtilities.runOnUIThread(new bp(mpVar2, 4));
                                break;
                            default:
                                mp mpVar3 = mpVar;
                                ArrayList arrayList = mpVar3.f0;
                                mpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && mpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        mpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mpVar3.getParentActivity(), new dp(mpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        mpVar3.x.addView(nVar, w7.a6.n(-1, 72));
                                    }
                                    mpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final mp mpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.cp
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                mp mpVar22 = mpVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < mpVar22.X.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = mpVar22.X.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                mpVar22.t0 = false;
                                AndroidUtilities.runOnUIThread(new bp(mpVar22, 4));
                                break;
                            default:
                                mp mpVar3 = mpVar2;
                                ArrayList arrayList = mpVar3.f0;
                                mpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && mpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        mpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(mpVar3.getParentActivity(), new dp(mpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        mpVar3.x.addView(nVar, w7.a6.n(-1, 72));
                                    }
                                    mpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new qh(13, this.b, tL_error));
                break;
        }
    }
}
