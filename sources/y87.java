// default package

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class y87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ TLRPC.TL_messages_peerDialogs f;
    public final /* synthetic */ zh6 h;
    public final /* synthetic */ TLRPC.TL_messages_dialogs n;

    public /* synthetic */ y87(uc7 uc7Var, int i, ArrayList arrayList, boolean z, TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs, zh6 zh6Var, TLRPC.TL_messages_dialogs tL_messages_dialogs, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = i;
        this.d = arrayList;
        this.e = z;
        this.f = tL_messages_peerDialogs;
        this.h = zh6Var;
        this.n = tL_messages_dialogs;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0162  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        boolean z;
        int i;
        int i2;
        ArrayList arrayList;
        ArrayList arrayList2;
        int i3;
        switch (this.a) {
            case 0:
                hl.c3(new y87(this.b, this.c, this.d, this.e, this.f, this.h, this.n, (byte) 1));
                break;
            default:
                uc7 uc7Var = this.b;
                ArrayList arrayList3 = uc7Var.y;
                zh6 zh6Var = uc7Var.R;
                SparseIntArray sparseIntArray = uc7Var.h2;
                int i4 = this.c;
                sparseIntArray.delete(i4);
                ArrayList arrayList4 = this.d;
                uc7Var.n(arrayList4);
                ArrayList W0 = uc7Var.W0(i4);
                int i5 = 0;
                int i6 = 0;
                boolean z2 = false;
                int i7 = this.e;
                while (i5 < W0.size()) {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) W0.get(i5);
                    if (!(dialog instanceof TLRPC.TL_dialogFolder)) {
                        if (wf3.B(dialog.id)) {
                            if (i7 < arrayList4.size()) {
                                arrayList4.add(i7, dialog);
                            } else {
                                arrayList4.add(dialog);
                            }
                            i7++;
                        } else if (dialog.pinned) {
                            i6 = Math.max(dialog.pinnedNum, i6);
                            dialog.pinned = false;
                            dialog.pinnedNum = 0;
                            i7++;
                            z2 = true;
                        } else if (dialog.id != uc7Var.s2) {
                            ArrayList arrayList5 = new ArrayList();
                            if (arrayList4.isEmpty()) {
                                TLRPC.TL_messages_peerDialogs tL_messages_peerDialogs = this.f;
                                uc7Var.j4(tL_messages_peerDialogs.users, false);
                                uc7Var.c4(tL_messages_peerDialogs.chats, false);
                                ArrayList arrayList6 = new ArrayList();
                                ArrayList arrayList7 = new ArrayList();
                                int size = arrayList4.size();
                                int i8 = 0;
                                z = false;
                                ArrayList arrayList8 = arrayList4;
                                while (i8 < size) {
                                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) arrayList8.get(i8);
                                    dialog2.pinnedNum = (size - i8) + i6;
                                    ArrayList arrayList9 = arrayList7;
                                    arrayList5.add(Long.valueOf(dialog2.id));
                                    TLRPC.Dialog dialog3 = (TLRPC.Dialog) zh6Var.f(dialog2.id);
                                    if (dialog3 != null) {
                                        dialog3.pinned = true;
                                        dialog3.pinnedNum = dialog2.pinnedNum;
                                        arrayList6.add(Long.valueOf(dialog2.id));
                                        arrayList7 = arrayList9;
                                        arrayList7.add(Integer.valueOf(dialog2.pinnedNum));
                                        arrayList = arrayList8;
                                        i = size;
                                        i2 = i8;
                                    } else {
                                        i = size;
                                        arrayList7 = arrayList9;
                                        i2 = i8;
                                        zh6Var.k(dialog2.id, dialog2);
                                        ArrayList arrayList10 = (ArrayList) this.h.f(dialog2.id);
                                        uc7Var.S.k(dialog2.id, arrayList10);
                                        if (arrayList10 != null) {
                                            int i9 = 0;
                                            arrayList8 = arrayList8;
                                            while (i9 < arrayList10.size()) {
                                                r47 r47Var = (r47) arrayList10.get(i9);
                                                if (r47Var != null) {
                                                    i3 = i9;
                                                    if (r47Var.k.peer_id.channel_id == 0) {
                                                        uc7Var.V.put(r47Var.e1(), r47Var);
                                                        uc7Var.O = Math.min(uc7Var.O, r47Var.k.date);
                                                        long j = r47Var.k.random_id;
                                                        if (j != 0) {
                                                            arrayList2 = arrayList8;
                                                            uc7Var.T.k(j, r47Var);
                                                        }
                                                    }
                                                    arrayList2 = arrayList8;
                                                } else {
                                                    arrayList2 = arrayList8;
                                                    i3 = i9;
                                                }
                                                i9 = i3 + 1;
                                                arrayList8 = arrayList2;
                                            }
                                        }
                                        arrayList = arrayList8;
                                        uc7Var.i4.c(dialog2.id);
                                        z = true;
                                    }
                                    i8 = i2 + 1;
                                    size = i;
                                    arrayList8 = arrayList;
                                    z2 = true;
                                }
                                jf7 messagesStorage = uc7Var.getMessagesStorage();
                                messagesStorage.a.c(new ud7(messagesStorage, arrayList6, arrayList7, (byte) 1));
                            } else {
                                z = false;
                            }
                            if (z2) {
                                if (z) {
                                    arrayList3.clear();
                                    int m = zh6Var.m();
                                    for (int i10 = 0; i10 < m; i10++) {
                                        TLRPC.Dialog dialog4 = (TLRPC.Dialog) zh6Var.n(i10);
                                        if (uc7Var.u0.h(dialog4.id) < 0) {
                                            arrayList3.add(dialog4);
                                        }
                                    }
                                }
                                uc7Var.h5(null);
                                uc7Var.getNotificationCenter().k(3, new Object[0]);
                            }
                            jf7 messagesStorage2 = uc7Var.getMessagesStorage();
                            messagesStorage2.a.c(new de7(messagesStorage2, arrayList5, i4));
                            uc7Var.getMessagesStorage().a1(this.n, 1);
                            uc7Var.getUserConfig().x(i4, true);
                            uc7Var.getUserConfig().u(false);
                            break;
                        }
                    }
                    i5++;
                    i7 = i7;
                }
                ArrayList arrayList52 = new ArrayList();
                if (arrayList4.isEmpty()) {
                }
                if (z2) {
                }
                jf7 messagesStorage22 = uc7Var.getMessagesStorage();
                messagesStorage22.a.c(new de7(messagesStorage22, arrayList52, i4));
                uc7Var.getMessagesStorage().a1(this.n, 1);
                uc7Var.getUserConfig().x(i4, true);
                uc7Var.getUserConfig().u(false);
        }
    }
}
