// default package

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes.dex */
public final /* synthetic */ class p77 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uc7 b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ long d;

    public /* synthetic */ p77(uc7 uc7Var, long j, ArrayList arrayList, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.d = j;
        this.c = arrayList;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        long j = this.d;
        ArrayList arrayList = this.c;
        uc7 uc7Var = this.b;
        switch (b) {
            case 0:
                jf7 messagesStorage = uc7Var.getMessagesStorage();
                long j2 = this.d;
                ArrayList arrayList2 = this.c;
                uc7Var.getMessagesStorage().O1(j2, -j2, arrayList2, messagesStorage.M0(j2, arrayList2, false, true, 0, 0));
                break;
            case 1:
                uc7Var.getNotificationCenter().k(7, arrayList, Long.valueOf(j), Boolean.FALSE);
                if (j == 0) {
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        r47 r47Var = (r47) uc7Var.V.get(((Integer) arrayList.get(i)).intValue());
                        if (r47Var != null) {
                            r47Var.Z = true;
                        }
                    }
                    break;
                } else {
                    ArrayList arrayList3 = (ArrayList) uc7Var.S.f(-j);
                    if (arrayList3 != null) {
                        for (int i2 = 0; i2 < arrayList3.size(); i2++) {
                            r47 r47Var2 = (r47) arrayList3.get(i2);
                            int size2 = arrayList.size();
                            int i3 = 0;
                            while (true) {
                                if (i3 >= size2) {
                                    break;
                                } else if (r47Var2.e1() == ((Integer) arrayList.get(i3)).intValue()) {
                                    r47Var2.Z = true;
                                } else {
                                    i3++;
                                }
                            }
                        }
                        break;
                    }
                }
                break;
            case 2:
                if (arrayList != null) {
                    uc7Var.getClass();
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) arrayList.get(i4);
                        uc7 messagesController = uc7Var.getMessagesController();
                        int i5 = tL_forumTopic.top_message;
                        TLRPC.Message message = tL_forumTopic.topMessage;
                        int i6 = message != null ? message.date : 0;
                        long j3 = this.d;
                        messagesController.r3(j3, i5, 0, i6, false, uc7Var.B2(j3) ? wf3.n(tL_forumTopic.from_id) : tL_forumTopic.id, 0, true, 0);
                        uc7Var.getMessagesStorage().a2(tL_forumTopic.top_message, 0, -j3, uc7Var.B2(j3) ? wf3.n(tL_forumTopic.from_id) : tL_forumTopic.id);
                    }
                }
                uc7Var.getMessagesStorage().a.c(new pa7(uc7Var, (byte) 2));
                break;
            case 3:
                uc7Var.z5(0, -j, arrayList);
                uc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
            case 4:
                hl.c3(new p77(this.b, this.d, this.c, (byte) 5));
                break;
            default:
                uc7Var.z5(0, j, arrayList);
                uc7Var.getNotificationCenter().k(3, new Object[0]);
                break;
        }
    }

    public /* synthetic */ p77(uc7 uc7Var, ArrayList arrayList, long j, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = arrayList;
        this.d = j;
    }
}
