package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final /* synthetic */ class yo implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ lp b;

    public /* synthetic */ yo(lp lpVar, int i10) {
        this.a = i10;
        this.b = lpVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    AndroidUtilities.runOnUIThread(new ap(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i10 = 0;
                final lp lpVar = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bp
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                lp lpVar2 = lpVar;
                                if (z10) {
                                    for (int i11 = 0; i11 < lpVar2.X.usernames.size(); i11++) {
                                        TLRPC.TL_username tL_username = lpVar2.X.usernames.get(i11);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                lpVar2.t0 = false;
                                AndroidUtilities.runOnUIThread(new ap(lpVar2, 4));
                                break;
                            default:
                                lp lpVar3 = lpVar;
                                ArrayList arrayList = lpVar3.f0;
                                lpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && lpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        lpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(lpVar3.getParentActivity(), new cp(lpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        lpVar3.x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    lpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i11 = 1;
                final lp lpVar2 = this.b;
                AndroidUtilities.runOnUIThread(new Runnable() { // from class: org.telegram.ui.bp
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i11) {
                            case 0:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                lp lpVar22 = lpVar2;
                                if (z10) {
                                    for (int i112 = 0; i112 < lpVar22.X.usernames.size(); i112++) {
                                        TLRPC.TL_username tL_username = lpVar22.X.usernames.get(i112);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                lpVar22.t0 = false;
                                AndroidUtilities.runOnUIThread(new ap(lpVar22, 4));
                                break;
                            default:
                                lp lpVar3 = lpVar2;
                                ArrayList arrayList = lpVar3.f0;
                                lpVar3.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && lpVar3.getParentActivity() != null) {
                                    for (int i12 = 0; i12 < arrayList.size(); i12++) {
                                        lpVar3.h.removeView((View) arrayList.get(i12));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i13 = 0; i13 < tL_messages_chats.chats.size(); i13++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(lpVar3.getParentActivity(), new cp(lpVar3, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i13);
                                        boolean z11 = true;
                                        if (i13 != tL_messages_chats.chats.size() - 1) {
                                            z11 = false;
                                        }
                                        nVar.a(chat, z11);
                                        arrayList.add(nVar);
                                        lpVar3.x.addView(nVar, w7.x5.n(-1, 72));
                                    }
                                    lpVar3.b0();
                                    break;
                                }
                                break;
                        }
                    }
                });
                break;
            default:
                AndroidUtilities.runOnUIThread(new fh(16, this.b, tL_error));
                break;
        }
    }
}
