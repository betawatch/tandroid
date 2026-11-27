// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes.dex */
public final /* synthetic */ class x87 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ArrayList f;

    public /* synthetic */ x87(uc7 uc7Var, long j, int i, long j2, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = j;
        this.e = i;
        this.d = j2;
        this.f = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        ArrayList arrayList = this.f;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                long j = this.c;
                long j2 = this.d;
                int i = this.e;
                if (j != 0) {
                    int B = uc7Var.getMessagesController().g4.B(i, j2, j, true);
                    if (B >= 0) {
                        uc7Var.getMessagesStorage().e2(B, j2, j, true);
                        uc7Var.getNotificationCenter().k(jn7.c5, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(B), arrayList);
                        break;
                    }
                } else {
                    TLRPC.Dialog dialog = (TLRPC.Dialog) uc7Var.R.f(j2);
                    if (dialog != null) {
                        int i2 = dialog.unread_poll_votes_count + i;
                        dialog.unread_poll_votes_count = i2;
                        if (i2 < 0) {
                            dialog.unread_poll_votes_count = 0;
                        }
                        uc7Var.getMessagesStorage().e2(dialog.unread_poll_votes_count, j2, 0L, false);
                        uc7Var.getNotificationCenter().k(jn7.c5, Long.valueOf(j2), Long.valueOf(j), Integer.valueOf(dialog.unread_poll_votes_count), arrayList);
                        break;
                    } else {
                        uc7Var.getMessagesStorage().N1(j2, i, true, false);
                        break;
                    }
                }
                break;
            case 1:
                long j3 = this.c;
                long j4 = this.d;
                int i3 = this.e;
                if (j3 != 0) {
                    int C = uc7Var.getMessagesController().g4.C(i3, j4, j3, true);
                    if (C >= 0) {
                        uc7Var.getMessagesStorage().f2(C, j4, j3, true);
                        if (uc7Var.v2(j4) || uc7Var.B2(j4) || j4 > 0) {
                            uc7Var.getNotificationCenter().k(jn7.b5, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(C), arrayList);
                            break;
                        }
                    }
                } else {
                    TLRPC.Dialog dialog2 = (TLRPC.Dialog) uc7Var.R.f(j4);
                    if (dialog2 != null) {
                        int i4 = dialog2.unread_reactions_count + i3;
                        dialog2.unread_reactions_count = i4;
                        if (i4 < 0) {
                            dialog2.unread_reactions_count = 0;
                        }
                        uc7Var.getMessagesStorage().f2(dialog2.unread_reactions_count, j4, 0L, false);
                        if (uc7Var.v2(j4) || uc7Var.B2(j4) || j4 > 0) {
                            uc7Var.getNotificationCenter().k(jn7.b5, Long.valueOf(j4), Long.valueOf(j3), Integer.valueOf(dialog2.unread_reactions_count), arrayList);
                            break;
                        }
                    } else {
                        uc7Var.getMessagesStorage().N1(j4, i3, true, true);
                        break;
                    }
                }
                break;
            case 2:
                qyb qybVar = uc7Var.getMessagesController().g4;
                int i5 = this.e;
                long j5 = this.c;
                long j6 = this.d;
                qybVar.C(i5, j5, j6, false);
                uc7Var.getMessagesStorage().f2(i5, j5, j6, false);
                uc7Var.getNotificationCenter().k(jn7.b5, Long.valueOf(j5), Long.valueOf(j6), Integer.valueOf(i5), arrayList);
                break;
            case 3:
                qyb qybVar2 = uc7Var.getMessagesController().g4;
                int i6 = this.e;
                long j7 = this.c;
                long j8 = this.d;
                qybVar2.B(i6, j7, j8, false);
                uc7Var.getMessagesStorage().e2(i6, j7, j8, false);
                uc7Var.getNotificationCenter().k(jn7.c5, Long.valueOf(j7), Long.valueOf(j8), Integer.valueOf(i6), arrayList);
                break;
            case 4:
                zh6 zh6Var = uc7Var.R;
                long j9 = this.c;
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) zh6Var.f(j9);
                int i7 = this.e;
                if (dialog3 != null) {
                    dialog3.unread_poll_votes_count = i7;
                    jf7 messagesStorage = uc7Var.getMessagesStorage();
                    long j10 = this.d;
                    messagesStorage.e2(i7, j9, j10, false);
                    uc7Var.getNotificationCenter().k(jn7.c5, Long.valueOf(j9), Long.valueOf(j10), Integer.valueOf(i7), arrayList);
                    break;
                } else {
                    uc7Var.getMessagesStorage().N1(j9, i7, false, false);
                    break;
                }
            case 5:
                qyb qybVar3 = uc7Var.getMessagesController().g4;
                int i8 = this.e;
                long j11 = this.c;
                long j12 = this.d;
                qybVar3.C(i8, j11, j12, false);
                uc7Var.getMessagesStorage().f2(i8, j11, j12, false);
                uc7Var.getNotificationCenter().k(jn7.b5, Long.valueOf(j11), Long.valueOf(j12), Integer.valueOf(i8), arrayList);
                break;
            default:
                zh6 zh6Var2 = uc7Var.R;
                long j13 = this.c;
                TLRPC.Dialog dialog4 = (TLRPC.Dialog) zh6Var2.f(j13);
                int i9 = this.e;
                if (dialog4 != null) {
                    dialog4.unread_reactions_count = i9;
                    jf7 messagesStorage2 = uc7Var.getMessagesStorage();
                    long j14 = this.d;
                    messagesStorage2.f2(i9, j13, j14, false);
                    uc7Var.getNotificationCenter().k(jn7.b5, Long.valueOf(j13), Long.valueOf(j14), Integer.valueOf(i9), arrayList);
                    break;
                } else {
                    uc7Var.getMessagesStorage().N1(j13, i9, false, true);
                    break;
                }
        }
    }

    public /* synthetic */ x87(uc7 uc7Var, long j, long j2, int i, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = arrayList;
    }
}
