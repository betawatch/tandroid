package org.telegram.ui;

import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qn implements RequestDelegate {
    public final /* synthetic */ int a;
    public final /* synthetic */ go b;

    public /* synthetic */ qn(go goVar, int i7) {
        this.a = i7;
        this.b = goVar;
    }

    @Override // org.telegram.tgnet.RequestDelegate
    public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.a) {
            case 0:
                if (tLObject instanceof TLRPC.TL_boolTrue) {
                    org.telegram.messenger.g0.h3(new rn(this.b, 3));
                    break;
                }
                break;
            case 1:
                final int i7 = 0;
                final go goVar = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.tn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i7) {
                            case 0:
                                go goVar2 = goVar;
                                ArrayList arrayList = goVar2.f0;
                                goVar2.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && goVar2.getParentActivity() != null) {
                                    for (int i10 = 0; i10 < arrayList.size(); i10++) {
                                        goVar2.n.removeView((View) arrayList.get(i10));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(goVar2.getParentActivity(), new un(goVar2, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z9 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        goVar2.y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    goVar2.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                go goVar3 = goVar;
                                if (z10) {
                                    for (int i12 = 0; i12 < goVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = goVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                goVar3.s0 = false;
                                org.telegram.messenger.g0.h3(new rn(goVar3, 4));
                                break;
                        }
                    }
                });
                break;
            case 2:
                final int i10 = 1;
                final go goVar2 = this.b;
                org.telegram.messenger.g0.h3(new Runnable() { // from class: org.telegram.ui.tn
                    @Override // java.lang.Runnable
                    public final void run() {
                        switch (i10) {
                            case 0:
                                go goVar22 = goVar2;
                                ArrayList arrayList = goVar22.f0;
                                goVar22.d0 = false;
                                TLObject tLObject2 = tLObject;
                                if (tLObject2 != null && goVar22.getParentActivity() != null) {
                                    for (int i102 = 0; i102 < arrayList.size(); i102++) {
                                        goVar22.n.removeView((View) arrayList.get(i102));
                                    }
                                    arrayList.clear();
                                    TLRPC.TL_messages_chats tL_messages_chats = (TLRPC.TL_messages_chats) tLObject2;
                                    for (int i11 = 0; i11 < tL_messages_chats.chats.size(); i11++) {
                                        org.telegram.ui.Cells.n nVar = new org.telegram.ui.Cells.n(goVar22.getParentActivity(), new un(goVar22, 0), false, 0);
                                        TLRPC.Chat chat = tL_messages_chats.chats.get(i11);
                                        boolean z9 = true;
                                        if (i11 != tL_messages_chats.chats.size() - 1) {
                                            z9 = false;
                                        }
                                        nVar.a(chat, z9);
                                        arrayList.add(nVar);
                                        goVar22.y.addView(nVar, c8.ha.o(-1, 72));
                                    }
                                    goVar22.h0();
                                    break;
                                }
                                break;
                            default:
                                boolean z10 = tLObject instanceof TLRPC.TL_boolTrue;
                                go goVar3 = goVar2;
                                if (z10) {
                                    for (int i12 = 0; i12 < goVar3.X.usernames.size(); i12++) {
                                        TLRPC.TL_username tL_username = goVar3.X.usernames.get(i12);
                                        if (tL_username != null && tL_username.active && !tL_username.editable) {
                                            tL_username.active = false;
                                        }
                                    }
                                }
                                goVar3.s0 = false;
                                org.telegram.messenger.g0.h3(new rn(goVar3, 4));
                                break;
                        }
                    }
                });
                break;
            default:
                org.telegram.messenger.g0.h3(new qf(21, this.b, tL_error));
                break;
        }
    }
}
